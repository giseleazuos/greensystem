/*package com.greensystem.greensystem.models.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class SecurityConfig {

    // Definir o PasswordEncoder para criptografar as senhas
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    // Configuração de segurança, mapeando os endpoints e permissões
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
            .authorizeHttpRequests((requests) -> requests
                .requestMatchers("/cadastro").permitAll()   // Acesso livre à página de cadastro
                .anyRequest().authenticated()              // Exige autenticação para outras páginas
            )
            .formLogin((form) -> form
                .loginPage("/login")  // Página de login personalizada
                .permitAll()          // Permite acesso a todos à página de login
            )
            .logout((logout) -> logout.permitAll());         // Permite logout para todos

        return http.build();
    }
}*/


