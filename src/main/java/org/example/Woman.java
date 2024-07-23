package org.example;

public class Woman extends Person{
    private String maidenLastName;

    public Woman(String firstName, String lastName, int age) {
        super(firstName, lastName, age);
    }

    @Override
    boolean isRetired() {
        return (getAge() >= 60);
    }

    @Override
    void registerPartnership(Person partner) {
        super.registerPartnership(partner);
        maidenLastName = super.getLastName();
        super.setLastName(partner.getLastName());
    }

    @Override
    void deregisterPartnership(boolean changeLastName) {
        super.deregisterPartnership(changeLastName);
        super.setLastName(maidenLastName);
    }
}
