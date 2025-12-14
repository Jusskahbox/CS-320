package contactservice;

public class Contact {

    private final String contactId;
    private String firstName;
    private String lastName;
    private String phone;
    private String address;

    public Contact(String contactId, String firstName, String lastName,
                   String phone, String address) {

        // contactId: required, <= 10 chars, not null, not updatable
        if (contactId == null || contactId.length() > 10) {
            throw new IllegalArgumentException("Invalid contact ID");
        }

        // firstName: required, <= 10 chars, not null
        if (firstName == null || firstName.length() > 10) {
            throw new IllegalArgumentException("Invalid first name");
        }

        // lastName: required, <= 10 chars, not null
        if (lastName == null || lastName.length() > 10) {
            throw new IllegalArgumentException("Invalid last name");
        }

        // phone: required, exactly 10 digits, not null
        if (phone == null || !phone.matches("\\d{10}")) {
            throw new IllegalArgumentException("Invalid phone number");
        }

        // address: required, <= 30 chars, not null
        if (address == null || address.length() > 30) {
            throw new IllegalArgumentException("Invalid address");
        }

        this.contactId = contactId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.address = address;
    }

    public String getContactId() {
        return contactId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    // Updatable fields with same constraints:

    public void setFirstName(String firstName) {
        if (firstName == null || firstName.length() > 10) {
            throw new IllegalArgumentException("Invalid first name");
        }
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        if (lastName == null || lastName.length() > 10) {
            throw new IllegalArgumentException("Invalid last name");
        }
        this.lastName = lastName;
    }

    public void setPhone(String phone) {
        if (phone == null || !phone.matches("\\d{10}")) {
            throw new IllegalArgumentException("Invalid phone number");
        }
        this.phone = phone;
    }

    public void setAddress(String address) {
        if (address == null || address.length() > 30) {
            throw new IllegalArgumentException("Invalid address");
        }
        this.address = address;
    }
}
