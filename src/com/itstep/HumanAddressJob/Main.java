package com.itstep.HumanAddressJob;



public class Main {
    public static void main(String[] args) {


        Address addressHome = new Address("Ismail", 22, "Chisinau", "Moldova");
       // System.out.println(addressHome.addressInformation());
        Address addressJob=new Address("Pacii",44,"Orhei","Moldova");

        Job job1=new Job ("economist", addressJob);
        Human human=new Human ("Silivestru", "Tatiana", 25, job1, addressHome);


        human.information();
        job1.jobInformation();
        human.homeInformation();



    }
}
