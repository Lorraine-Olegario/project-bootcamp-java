package com.dio.api.Service;

import com.dio.api.Model.User;

public interface UserService {

    User find(Long id);

    User create(User user);
}
