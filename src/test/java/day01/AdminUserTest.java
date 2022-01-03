package day01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdminUserTest {

    @Test
    void getUserEmail() {
        AdminUser adminUser = new AdminUser("asd", "asdasd");
        assertEquals("asd", adminUser.getUserEmail());
    }

    @Test
    void getPassword() {
        AdminUser adminUser = new AdminUser("asd", "asdasd");
        assertEquals("******", adminUser.getPassword());
    }
}