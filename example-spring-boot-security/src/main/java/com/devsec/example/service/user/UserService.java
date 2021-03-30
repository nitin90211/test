package com.devsec.example.service.user;

import java.util.Collection;
import java.util.Optional;

import com.devsec.example.domain.User;
import com.devsec.example.domain.UserCreateForm;


public interface UserService {

    Optional<User> getUserById(long id);

    Optional<User> getUserByEmail(String email);

    Collection<User> getAllUsers();

    User create(UserCreateForm form);

}
