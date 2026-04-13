package com.pfe.pfe.security;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

@Autowired
private JwtFilter jwtFilter;

@Autowired
private UserDetailServiceImpl userDetailsService;

@Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
            // désactiver CSRF
            .csrf(csrf -> csrf.disable())

            // désactiver les sessions
            .sessionManagement(session -> 
                session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))

            // définir les routes publiques et privées
            .authorizeHttpRequests(auth -> auth
                // routes publiques
                .requestMatchers("/auth/login", "/auth/register/client", "/auth/register/employe" ).permitAll()
                // routes privées
                .requestMatchers("/Api/employes/").hasAnyRole("ADMIN", "EMPLOYE")
                .requestMatchers("/Api/clients/").hasAnyRole("ADMIN", "EMPLOYE")
                .requestMatchers("/Api/utilisateurs/").hasRole("ADMIN")
                // tout le reste nécessite une authentification
                .anyRequest().authenticated()
            )

            // enregistrer JwtFilter
            .addFilterBefore(jwtFilter, UsernamePasswordAuthenticationFilter.class);

        return http.build();
    }

@Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

@Bean
    public AuthenticationManager authenticationManager(
            AuthenticationConfiguration authConfig) throws Exception {
        return authConfig.getAuthenticationManager();
    }

@Bean
    public DaoAuthenticationProvider authenticationProvider() {
        DaoAuthenticationProvider provider = new DaoAuthenticationProvider();
        provider.setUserDetailsService(userDetailsService);
        provider.setPasswordEncoder(passwordEncoder());
        return provider;
    }
}



