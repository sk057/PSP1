package com.psp.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UserTest {

	@Test
	void testUserFields_true() {
		User user = new User( "First","Last","862145478","email@gmail.com","gatve","Password123");
        assertAll(
                () -> assertEquals("First", user.getName()),
                () -> assertEquals("Last", user.getSurname()),
                () -> assertEquals("862145478", user.getPhoneNumber()),
                () -> assertEquals("email@gmail.com", user.getEmail()),
                () -> assertEquals("gatve", user.getAddress()),
                () -> assertEquals("Password123", user.getPassword())
        );
	}
	@Test
	void testCompareUsers_true() {
		User user1 = new User( "First","Last","862145478","email@gmail.com","gatve","Password123");
		User user2 = new User( "First","Last","862145478","email@gmail.com","gatve","Password123");
		assertEquals(0, user1.compareTo(user2));
	}

}
