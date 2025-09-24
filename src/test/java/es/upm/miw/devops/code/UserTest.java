package es.upm.miw.devops.code;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserTest {

    private User user;

    @BeforeEach
    void setUp() {
        this.user = new User("1", "Alan", "Turing");
    }

    @Test
    void testGetters() {
        assertEquals("1", user.getId());
        assertEquals("Alan", user.getName());
        assertEquals("Turing", user.getFamilyName());
    }

    @Test
    void testFullName() {
        assertEquals("Alan Turing", user.fullName());
    }

    @Test
    void testInitials() {
        assertEquals("AT", user.initials());
    }

    @Test
    void testEqualsAndHashCode() {
        User same = new User("1", "Another", "Name");
        User different = new User("2", "Alan", "Turing");

        assertEquals(user, same);
        assertNotEquals(user, different);
        assertEquals(user.hashCode(), same.hashCode());
    }

    @Test
    void testToString() {
        String str = user.toString();
        assertTrue(str.contains("id='1'"));
        assertTrue(str.contains("name='Alan'") || str.contains("Alan")); // tolerancia a toString()
    }
}
