package com.github.aastrandemma.data;

import com.github.aastrandemma.exception.AuthenticationFieldsException;
import com.github.aastrandemma.exception.UserExpiredException;
import com.github.aastrandemma.model.User;

import java.util.Optional;

public interface UserDao {
    User createUser(String username);
    Optional<User> findByUsername(String username);
    boolean authenticate(User user) throws UserExpiredException, AuthenticationFieldsException;
    // Add more methods according to the project
}