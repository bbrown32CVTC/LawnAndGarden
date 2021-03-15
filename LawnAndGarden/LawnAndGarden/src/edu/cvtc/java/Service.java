package edu.cvtc.java;

public class Service {

    //Attributes
    private String serviceName;
    private String serviceDescription;
    private double serviceCost;

    //Default Constructor
    public Service() {
        serviceName = "";
        serviceDescription = "";
        serviceCost = 0.0;
    }

    //Methods
    public String getServiceName() {

        return serviceName;
    }

    public void setServiceName(String serviceName) {

        this.serviceName = serviceName;
    }

    public String getServiceDescription() {

        return serviceDescription;
    }

    public void setServiceDescription(String serviceDescription) {

        this.serviceDescription = serviceDescription;
    }

    public double getServiceCost() {

        return serviceCost;
    }

    public void setServiceCost(double serviceCost) {

        this.serviceCost = serviceCost;
    }

}
