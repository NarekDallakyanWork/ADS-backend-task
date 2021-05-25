package model;

import java.util.List;

public class DataResponseModel {

    private AddressBook AddressBook;

    public AddressBook getAddressBook() {
        return AddressBook;
    }

    public void setAddressBook(AddressBook AddressBook) {
        this.AddressBook = AddressBook;
    }

    class AddressBook{

        private List<Contact> Contact;

        public List<DataResponseModel.Contact> getContact() {
            return Contact;
        }

        public void setContact(List<DataResponseModel.Contact> contact) {
            Contact = contact;
        }
    }

    class Contact {
        private String CustomerID;
        private String CompanyName;
        private String ContactName;
        private String ContactTitle;
        private String Address;
        private String City;
        private String Email;
        private String PostalCode;
        private String Country;
        private String Phone;
        private String Fax;

        public String getCustomerID() {
            return CustomerID;
        }

        public void setCustomerID(String customerID) {
            CustomerID = customerID;
        }

        public String getCompanyName() {
            return CompanyName;
        }

        public void setCompanyName(String companyName) {
            CompanyName = companyName;
        }

        public String getContactName() {
            return ContactName;
        }

        public void setContactName(String contactName) {
            ContactName = contactName;
        }

        public String getContactTitle() {
            return ContactTitle;
        }

        public void setContactTitle(String contactTitle) {
            ContactTitle = contactTitle;
        }

        public String getAddress() {
            return Address;
        }

        public void setAddress(String address) {
            Address = address;
        }

        public String getCity() {
            return City;
        }

        public void setCity(String city) {
            City = city;
        }

        public String getEmail() {
            return Email;
        }

        public void setEmail(String email) {
            Email = email;
        }

        public String getPostalCode() {
            return PostalCode;
        }

        public void setPostalCode(String postalCode) {
            PostalCode = postalCode;
        }

        public String getCountry() {
            return Country;
        }

        public void setCountry(String country) {
            Country = country;
        }

        public String getPhone() {
            return Phone;
        }

        public void setPhone(String phone) {
            Phone = phone;
        }

        public String getFax() {
            return Fax;
        }

        public void setFax(String fax) {
            Fax = fax;
        }
    }
}
