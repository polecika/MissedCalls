package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Contacts {
    private Map<String, Contact> contacts = new HashMap<>();

    /**
     * Добавление контакта
     * @return
     */
    public Contact addContact() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя и фамилию");
        String[] nameSurname = scanner.nextLine().split(" ");
        String name = nameSurname[0].trim();
        String surname = nameSurname[1].trim();
        System.out.println("Введите номер телефона");
        String phone = scanner.nextLine().trim();
        System.out.println("Введите номер группы из списка");
        for (Group group : Group.values()) {
            System.out.println(group.ordinal() + ". " + group.getName());
        }
        Group group = Group.values()[scanner.nextInt()];
        return contacts.put(phone, new Contact(name, surname, phone, group));
    }

    /**
     * Редактирование контакта
     * @return
     */
    public Contact editContact() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер телефона");
        String phone = scanner.nextLine().trim();
        if(contacts.containsKey(phone)) {
            Contact contact = searchByNumber(phone);
            System.out.println("Измените имя и фамилию или <enter>");
            String nameAndSurname;
            String name = contact.getName();
            String surname = contact.getSurname();
            if (!(nameAndSurname = scanner.nextLine()).equals("")) {
                String[] nameSurname = nameAndSurname.split(" ");
                name = nameSurname[0].trim();
                surname = nameSurname[1].trim();
            }

            System.out.println("Введите номер группы из списка или <enter>");
            String groupNumber;
            Group contactGroup = contact.getGroup();
            for (Group group : Group.values()) {
                System.out.println(group.ordinal() + ". " + group.getName());
            }
            if(!(groupNumber = scanner.nextLine()).equals("")) {
                contactGroup = Group.values()[Integer.parseInt(groupNumber)];
            }
            return contacts.replace(phone, new Contact(name, surname, phone, contactGroup));
        }
        else {
            System.out.println("Такого контакта нет");
            return null;
        }

    }

    /**
     * Удаление контакта по имени и фамилии
     * @return
     */
    public void delContact() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя и фамилию");
        String[] nameSurname = scanner.nextLine().split(" ");
        String name = nameSurname[0].trim();
        String surname = nameSurname[1].trim();
        for(Map.Entry<String, Contact> contact : contacts.entrySet()) {
            if(contact.getValue().getName().equals(name) && contact.getValue().getSurname().equals(surname)) {
                contacts.remove(contact.getKey());
                System.out.println("Контакт удалён");
                break;
            }
        }
    }

    /**
     * Поиск контакта по номеру
     * @return
     */
    public Contact searchByNumber(String number) {
        Contact contact = contacts.get(number);
        return contact;
    }
}
