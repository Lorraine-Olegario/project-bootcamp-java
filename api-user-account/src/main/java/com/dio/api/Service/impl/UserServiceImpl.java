package com.dio.api.Service.impl;

import com.dio.api.Model.User;
import com.dio.api.Repository.UserRepository;
import com.dio.api.Service.UserService;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Override
    public User find(Long id) {
        return this.userRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public User create(User user) {
        if (user.getId() != null && this.userRepository.existsById(user.getId())) {
            throw  new IllegalArgumentException("This User ID already exists.");
        }

        if (userRepository.existsByAccountNumber(user.getAccount().getNumber())) {
            throw  new IllegalArgumentException("This Account number already exists.");
        }

        return userRepository.save(user);
    }
}
