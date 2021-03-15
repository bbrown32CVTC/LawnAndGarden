package edu.cvtc.java;

public class LawnAndGardenTestProgram {

    public static void main(String[] args) {

        //Declare Customer Objects
        Customer joe = new Customer();
        Customer jane = new Customer();
        Customer bob = new Customer();
        Customer janelle = new Customer();

        //Declare Service Objects
        Service hedgeCutting = new Service();
        Service mowing = new Service();
        Service planting = new Service();
        Service weedKilling = new Service();

        //Declare SignUpSheet Objects
        SignUpSheet joeList = new SignUpSheet();
        SignUpSheet janeList = new SignUpSheet();
        SignUpSheet bobList = new SignUpSheet();
        SignUpSheet janelleList = new SignUpSheet();


        //Fill the customer information
        joe.setFirstName("Joe");
        joe.setLastName("Smith");
        joe.setAddress("123 Main Street");
        joe.setPhoneNumber("(715) 555-1111");
        joe.setEmail("joesmith10@gmail.com");

        jane.setFirstName("Jane");
        jane.setLastName("Doe");
        jane.setAddress("456 Main Street");
        jane.setPhoneNumber("(715) 555-2222");
        jane.setEmail("Jane_D@gmail.com");

        bob.setFirstName("Bob");
        bob.setLastName("Jones");
        bob.setAddress("789 Main Street");
        bob.setPhoneNumber("(715) 555-3333");
        bob.setEmail("Jones_Bob524@yahoo.com");

        janelle.setFirstName("Janelle");
        janelle.setLastName("Johnson");
        janelle.setAddress("321 Main Street");
        janelle.setPhoneNumber("(715) 555-4444");
        janelle.setEmail("JJ213@hotmail.com");


        //Fill the service information
        hedgeCutting.setServiceName("Hedge Cutting");
        hedgeCutting.setServiceDescription("We will trim and cut your hedges for you!");
        hedgeCutting.setServiceCost(20.0);

        mowing.setServiceName("Lawn Mowing");
        mowing.setServiceDescription("We will cut and trim your entire lawn while you golf.");
        mowing.setServiceCost(15.0);

        planting.setServiceName("Flower Planting");
        planting.setServiceDescription("Every flower you desire will be planted in your yard.");
        planting.setServiceCost(40.0);

        weedKilling.setServiceName("Weed Killing");
        weedKilling.setServiceDescription("We will rid your lawn and flowerbeds of nasty weeds.");
        weedKilling.setServiceCost(30.0);


        //Fill services for each customer
        Service[] joeServices = {};
        Service[] janeServices = {hedgeCutting, weedKilling};
        Service[] bobServices = {planting, hedgeCutting, mowing};
        Service[] janelleServices = {hedgeCutting,mowing,planting,weedKilling};


        //Fill the SignUpSheet Objects
        joeList.setCustomer(joe);
        joeList.setServices(joeServices);

        janeList.setCustomer(jane);
        janeList.setServices(janeServices);

        bobList.setCustomer(bob);
        bobList.setServices(bobServices);

        janelleList.setCustomer(janelle);
        janelleList.setServices(janelleServices);


        //An array of Customers
        SignUpSheet[] customerList = {joeList, janeList, bobList, janelleList};


        //Display each customer's services and information
        for (int i = 0; i < customerList.length; i++) {
            System.out.println("------Customer------");
            System.out.println("Customer Name: " + customerList[i].getCustomer().getFirstName() + " " + customerList[i].getCustomer().getLastName());
            System.out.println("Address: " + customerList[i].getCustomer().getAddress());
            System.out.println("Phone Number: " + customerList[i].getCustomer().getPhoneNumber());
            System.out.println("Email: " + customerList[i].getCustomer().getEmail());

            for (int c = 0; c < customerList[i].getServices().length; c++) {
                System.out.println("Service #" + (i + 1));
                System.out.println("Service Name: " + customerList[i].getServices()[c].getServiceName());
                System.out.println("Service Description: " + customerList[i].getServices()[c].getServiceDescription());
                System.out.println("Service Cost: " + customerList[i].getServices()[c].getServiceCost());
            }

            //Adds a line break after services loop is complete
            System.out.print("\n");

        }

    }
}
