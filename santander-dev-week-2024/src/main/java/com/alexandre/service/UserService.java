package com.alexandre.service;

import com.alexandre.domain.model.User;

public interface UserService {
    User findById(Long id);

    User create(User userToCreate);
}
