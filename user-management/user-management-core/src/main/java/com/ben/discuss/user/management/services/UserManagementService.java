package com.ben.discuss.user.management.services;

import com.ben.discuss.user.management.entities.User;

public interface UserManagementService {
    User createUser(String email, String firstName, String lastName, String clearPassword);
}
