package com.itstep.HumanAddressJob;

public class Job {
    String major;
    Address address;

    public Job(String major, Address address){
        this.major=major;
        this.address=address;
    }
    public void jobInformation(){
        System.out.println("I am " + major+ "and my job address is "+ address.addressInformation());
    }
}
