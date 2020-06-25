package com.itstep.HumanAddressJob;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Human {
    String firstName;
    String lastName;
    int age;
    Job job;
    Address homeAddress;

    public Human(String firstName, String lastName, int age, Job job, Address homeAddress){
        this.firstName=firstName;
        this.lastName=lastName;
        this.age=age;
        this.job=job;
        this.homeAddress=homeAddress;}


        public void information(){
            System.out.println("My name is: "+ firstName+lastName+"I am "+ age + "age"+ "old");
            job.jobInformation();

    }
    public void homeInformation(){
        System.out.println("My home address: "+ homeAddress.addressInformation()
        );
    }

}
