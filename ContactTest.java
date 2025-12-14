package contactservice;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ContactTest {

    @Test
    public void testValidContactCreation() {
        Contact contact = new Contact("12345", "Jess", "Living",
                                      "1234567890", "123 Main Street");
        assertEquals("12345", contact.getContactId());
        assertEquals("Jess", contact.getFirstName());
        assertEquals("Living", contact.getLastName());
        assertEquals("1234567890", contact.getPhone());
        assertEquals("123 Main Street", contact.getAddress());
    }

    @Test
    public void testContactIdTooLong() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("12345678901", "Jess", "Living",
                        "1234567890", "123 Main Street");
        });
    }

    @Test
    public void testContactIdNull() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact(null, "Jess", "Living",
                        "1234567890", "123 Main Street");
        });
    }

    @Test
    public void testFirstNameTooLong() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("12345", "VeryLongName", "Living",
                        "1234567890", "123 Main Street");
        });
    }

    @Test
    public void testFirstNameNull() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("12345", null, "Living",
                        "1234567890", "123 Main Street");
        });
    }

    @Test
    public void testLastNameTooLong() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("12345", "Jess", "VeryLongName",
                        "1234567890", "123 Main Street");
        });
    }

    @Test
    public void testLastNameNull() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("12345", "Jess", null,
                        "1234567890", "123 Main Street");
        });
    }

    @Test
    public void testPhoneNotTenDigits() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("12345", "Jess", "Living",
                        "12345", "123 Main Street");
        });
    }

    @Test
    public void testPhoneNotAllDigits() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("12345", "Jess", "Living",
                        "abc4567890", "123 Main Street");
        });
    }

    @Test
    public void testPhoneNull() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("12345", "Jess", "Living",
                        null, "123 Main Street");
        });
    }

    @Test
    public void testAddressTooLong() {
        String longAddress = "1234567890123456789012345678901"; // 31 chars
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("12345", "Jess", "Living",
                        "1234567890", longAddress);
        });
    }

    @Test
    public void testAddressNull() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("12345", "Jess", "Living",
                        "1234567890", null);
        });
    }
}
