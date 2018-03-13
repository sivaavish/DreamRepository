package str;

import com.sun.xml.internal.ws.developer.MemberSubmissionEndpointReference;

public class Customer {
    int cid;
    String firtName;
    String lastName;
    String email;
    String phone;
    Address address;

    public Customer() {
    }

    public Customer(String firtName, String lastName, String email, String phone) {
        this.firtName = firtName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getFirtName() {
        return firtName;
    }

    public void setFirtName(String firtName) {
        this.firtName = firtName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
