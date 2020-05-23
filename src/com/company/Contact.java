package com.company;

public class Contact {

    private String name;
    private String surname;
    private String phone;
    private Group group;

    public Contact(String name, String surname, String phone, Group group) {
        this.name = name;
        this.surname = surname;
        this.phone = phone;
        this.group = group;
    }

    @Override
    public boolean equals(Object o) {
        //TODO:rewrite
        return super.equals(o);
    }

    @Override
    public String toString() {
        //TODO:rewrite
        return super.toString();
    }
}
