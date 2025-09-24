package es.upm.miw.devops.code;

import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

public class UsersDatabaseTest {

    @Test
    void testGetUsersSize() {
        UsersDatabase db = new UsersDatabase();
        assertEquals(5, db.getUsers().size());
    }

    @Test
    void testFindUserByIdFound() {
        UsersDatabase db = new UsersDatabase();
        Optional<User> user = db.findUserById("2");
        assertTrue(user.isPresent());
        assertEquals("Alan", user.get().getName());
    }

    @Test
    void testFindUserByIdNotFound() {
        UsersDatabase db = new UsersDatabase();
        Optional<User> user = db.findUserById("999");
        assertTrue(user.isEmpty());
    }

    @Test
    void testStreamNotEmpty() {
        UsersDatabase db = new UsersDatabase();
        long count = db.stream().count();
        assertEquals(5, count);
    }

    @Test
    void testFindFractionAdditionByUserId() {
        UsersDatabase db = new UsersDatabase();

        Fraction result = db.findFractionAdditionByUserId("1");
        assertEquals(new Fraction(5, 6), result);

    }
    @Test
    void testFindFractionDivisionByUserId() {
        UsersDatabase db = new UsersDatabase();

        Fraction result = db.findFractionDivisionByUserId("1");

        assertEquals(new Fraction(3, 2), result);
    }
}
