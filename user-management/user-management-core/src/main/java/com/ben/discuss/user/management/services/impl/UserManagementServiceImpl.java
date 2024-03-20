package com.ben.discuss.user.management.services.impl;

import com.ben.discuss.user.management.entities.User;
import com.ben.discuss.user.management.services.UserManagementService;

public class UserManagementServiceImpl implements UserManagementService {
    @Override
    public User createUser(String email, String firstName, String lastName, String clearPassword) {
        return new User(email, firstName, lastName, clearPassword);
    }
}
