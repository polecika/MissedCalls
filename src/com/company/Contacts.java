package com.company;

import java.util.HashMap;
import java.util.Map;

public class Contacts {
    private Map<String, Contact> contacts = new HashMap<>();

    /**
     * Добавление контакта
     * @param contact
     * @return
     */
    public boolean addContact(Contact contact) {
        //TODO:rewrite
        return true;
    }

    /**
     * Удаление контакта по имени и фамилии
     * @param name
     * @param surname
     * @return
     */
    public boolean delContact(String name, String surname) {
        //TODO:rewrite
        return true;
    }

    /**
     * Поиск контакта по номеру
     * @param number
     * @return
     */
    public Contact searchByNumber(String number) {
        //TODO:write;
        return null;
    }
}
