package com.example.book.services;

import com.example.book.model.User;

public interface UserService {
    User registerUser(String username, String email, String password);
    User loginUser(String usernameOrEmail, String password);
}
