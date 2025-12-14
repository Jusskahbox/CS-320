package contactservice;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ContactServiceTest {

    private ContactService contactService;
    private Contact contact;

    @BeforeEach
    public void setUp() {
        contactService = new ContactService();
        contact = new Contact("12345", "Jess", "Living",
                              "1234567890", "123 Main Street");
        contactService.addContact(contact);
    }

    @Test
    public void testAddContactSuccessfully() {
        Contact newContact = new Contact("67890", "John", "Doe",
                                         "0987654321", "456 Oak Street");
        contactService.addContact(newContact);

        Contact retrieved = contactService.getContact("67890");
        assertNotNull(retrieved);
        assertEquals("John", retrieved.getFirstName());
    }

    @Test
    public void testAddContactDuplicateIdThrows() {
        Contact duplicate = new Contact("12345", "Jane", "Smith",
                                        "1111111111", "789 Pine Street");
        assertThrows(IllegalArgumentException.class, () -> {
            contactService.addContact(duplicate);
        });
    }

    @Test
    public void testDeleteContact() {
        contactService.deleteContact("12345");
        assertNull(contactService.getContact("12345"));
    }

    @Test
    public void testUpdateFirstName() {
        contactService.updateFirstName("12345", "NewName");
        Contact updated = contactService.getContact("12345");
        assertEquals("NewName", updated.getFirstName());
    }

    @Test
    public void testUpdateLastName() {
        contactService.updateLastName("12345", "NewLast");
        Contact updated = contactService.getContact("12345");
        assertEquals("NewLast", updated.getLastName());
    }

    @Test
    public void testUpdatePhone() {
        contactService.updatePhone("12345", "1112223333");
        Contact updated = contactService.getContact("12345");
        assertEquals("1112223333", updated.getPhone());
    }

    @Test
    public void testUpdateAddress() {
        contactService.updateAddress("12345", "999 Updated Street");
        Contact updated = contactService.getContact("12345");
        assertEquals("999 Updated Street", updated.getAddress());
    }

    @Test
    public void testUpdateNonexistentContactThrows() {
        assertThrows(IllegalArgumentException.class, () -> {
            contactService.updateFirstName("99999", "Name");
        });
    }

    @Test
    public void testUpdatePhoneInvalidThrows() {
        assertThrows(IllegalArgumentException.class, () -> {
            contactService.updatePhone("12345", "123"); // invalid phone
        });
    }
}
