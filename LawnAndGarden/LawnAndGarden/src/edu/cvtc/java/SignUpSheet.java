package edu.cvtc.java;

public class SignUpSheet {

    //Attributes
    private Customer customer;
    private Service[] services;

    //Default Constructor
    public SignUpSheet() {
        customer = null;
        services = null;
    }

    //Methods
    public Customer getCustomer() {

        return customer;
    }

    public void setCustomer(Customer customer) {

        this.customer = customer;
    }

    public Service[] getServices() {

        return services;
    }

    public void setServices(Service[] services) {

        this.services = services;
    }


}
