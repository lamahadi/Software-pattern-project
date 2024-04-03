package supplyChainSystem;

public class Customer {
    private int customerID;
    private String name;
    private String address;
    private String contactNumber;
    private String email;

    public Customer(int customerID, String name, String address, String contactNumber, String email) {
        this.customerID = customerID;
        this.name = name;
        this.address = address;
        this.contactNumber = contactNumber;
        this.email = email;
    }

    public int getCustomerID() {
        return customerID;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public String getEmail() {
        return email;
    }

    public void updateAddress(String newAddress) {
        this.address = newAddress;
    }

    public void updateContactNumber(String newContactNumber) {
        this.contactNumber = newContactNumber;
    }

    public void updateEmail(String newEmail) {
        this.email = newEmail;
    }
}