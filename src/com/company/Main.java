package com.company;

import org.w3c.dom.ls.LSOutput;
import sun.reflect.generics.tree.Tree;

import java.time.LocalDateTime;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Программа: пропущенные вызовы.");
        Scanner scanner = new Scanner(System.in);
        MissedCalls missed = new MissedCalls();
        Contacts contacts = new Contacts();
        while(true) {
            int action = choiseAction();
            if(action == 7) {
                break;
            }
            switch (action) {
                case 1:
                    if(contacts.addContact() != null) {
                        System.out.println("Контакт добавлен");                    }
                    break;
                case 2:
                    System.out.println("Добавьте номер пропущенного вызова");
                    String phone = scanner.nextLine().trim();
                    Contact contact;
                    if( (contact = contacts.searchByNumber(phone)) == null) {
                        contact = new Contact(null, null, phone, null);
                    }
                    if(missed.addMissedCall(contact) != null) {
                        System.out.println("Пропущенный вызов добавлен");
                    }

                    break;
                case 3:
                    if(!missed.getMissedCalls().isEmpty()) {
                        for (Map.Entry<LocalDateTime, Contact> call:  missed.getMissedCalls().entrySet()) {
                            System.out.println(call.getKey() + call.getValue().toString());
                        }
                    }
                    else {
                        System.out.println("Нет пропущенных звонков");
                    }
                    break;
                case 4:
                    missed.clearMissedCalls();
                    System.out.println("Список пропущенных вызовов очищен");
                    break;
                case 5:
                    if(contacts.editContact() != null) {
                        System.out.println("Контакт отредактирован");
                    }
                    break;
                case 6:
                    contacts.delContact();
                    System.out.println("Контакт удален");
                    break;
            }

        }
    }
    public static int choiseAction() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Меню:\n" +
                "1. Добавить контакт\n" +
                "2. Добавить пропущенный вызов\n" +
                "3. Вывести все пропущенные вызовы\n" +
                "4. Очистить пропущенные вызовы\n" +
                "5. Отредактировать контакт\n" +
                "6. Удалить контакт\n" +
                "7. Выход\n");
        int choiseAction = scanner.nextInt();
        scanner.nextLine();
        return choiseAction;
    }
}
