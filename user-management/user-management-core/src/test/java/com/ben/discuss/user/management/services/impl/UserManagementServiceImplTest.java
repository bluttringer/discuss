package com.ben.discuss.user.management.services.impl;


import com.ben.discuss.user.management.entities.User;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class UserManagementServiceImplTest {

    private final UserManagementServiceImpl userManagementService = new UserManagementServiceImpl();

    @Test
    void shouldCreateUserWhenEverythingIsFine() {
        User createdUser = userManagementService.createUser("zizi.jeanmaire@gmail.com", "Zizi", "Jeanmaire", "X1l0ph°ne");
        assertThat(createdUser).isNotNull();
        assertThat(createdUser.email()).isEqualTo("zizi.jeanmaire@gmail.com");
        assertThat(createdUser.firstName()).isEqualTo("Zizi");
        assertThat(createdUser.lastName()).isEqualTo("Jeanmaire");
        assertThat(createdUser.encryptedPassword()).isNotNull();
    }
}
