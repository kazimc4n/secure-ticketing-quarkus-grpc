package com.ing.assessment.domain.auth.port;

import com.ing.assessment.domain.auth.model.User;
import java.util.Optional;

public interface UserRepositoryPort {

    Optional<User> findByEmail(String email);
    Optional<User> findById(Long id);
    User save(User user);
}