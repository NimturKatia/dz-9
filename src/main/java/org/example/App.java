package org.example;
public class App 
{
    public static void main( String[] args ) {
        Man manObj = new Man("Jake", "Brown", 25);
        Woman womanObj = new Woman("Lisa", "Cole", 23);

        System.out.println("======================================");
        System.out.println("Man: First Name - " + manObj.getFirstName() + ", Last Name - " + manObj.getLastName() + ", age - " + manObj.getAge() + ", retired: " + manObj.isRetired());
        System.out.println("Woman: First Name - " + womanObj.getFirstName() + ", Last Name - " + womanObj.getLastName() + ", age - " + womanObj.getAge() + ", retired: " + womanObj.isRetired());
        System.out.println("======================================");
        System.out.println();
        manObj.registerPartnership(womanObj);
        womanObj.registerPartnership(manObj);

        System.out.println("======================================");
        System.out.println("Partnership registered!");
        System.out.println("Man's partner: " + manObj.getPartner().getFirstName() + " " + manObj.getPartner().getLastName());
        System.out.println("Woman's partner: " + womanObj.getPartner().getFirstName() + " " + womanObj.getPartner().getLastName());
        System.out.println("Woman: First Name - " + womanObj.getFirstName() + ", Last Name - " + womanObj.getLastName());
        System.out.println();
        womanObj.deregisterPartnership(true);
        manObj.deregisterPartnership(false);
        System.out.println("Partnership deregistered!");
        System.out.println("Woman: First Name - " + womanObj.getFirstName() + ", Last Name - " + womanObj.getLastName());
        System.out.println("======================================");
        System.out.println();

        manObj.setAge(60);
        System.out.println("======================================");
        System.out.println("Man, is retired: " + manObj.isRetired() + ", age: " + manObj.getAge());
        manObj.setAge(65);
        System.out.println("Man, is retired: " + manObj.isRetired() + ", age: " + manObj.getAge());
        womanObj.setAge(60);
        System.out.println("Woman, is retired: " + womanObj.isRetired() + ", age: " + womanObj.getAge());
        System.out.println("======================================");



    }
}
