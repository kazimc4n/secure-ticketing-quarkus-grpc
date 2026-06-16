package com.ing.assessment.domain.auth.model;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import java.time.Instant;
import java.util.HashSet;
import java.util.Set;

@Getter 
@Setter
@NoArgsConstructor  // Hibernate/Derleyici süreçleri için boş constructor üretir
@AllArgsConstructor // Tüm alanları içeren constructor üretir
public class User {
    private Long id;
    private String email;
    private String passwordHash;
    private Set<UserRole> roles = new HashSet<>();
    private Instant createdAt;
    private Instant lastLoginAt;

    // Factory Method
    public static User create(String email, String passwordHash) {
        if (email == null || email.isBlank()) {
            throw new IllegalArgumentException("Email cannot be empty");
        }
        
        User user = new User();
        user.setEmail(email);
        user.setPasswordHash(passwordHash);
        user.getRoles().add(UserRole.CUSTOMER);
        user.setCreatedAt(Instant.now());
        return user;
    }

    public void markLoggedIn(Instant loginTime) {
        this.lastLoginAt = loginTime;
    }
}