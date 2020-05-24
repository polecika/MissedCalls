package com.company;

import java.util.Objects;

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
    public boolean equals(Object obj) {
        if(this == obj) {
            return true;
        }
        if(obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Contact contact = (Contact) obj;
        return phone.equals(contact.phone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(phone);
    }

    @Override
    public String toString() {
        return "группа [" + group + "] " + name + " " + surname + ": " + phone;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Group getGroup() {
        return group;
    }
}
