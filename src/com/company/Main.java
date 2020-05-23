package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Программа: пропущенные вызовы.");
        while(true) {
            int action = choiseAction();
            if(action == 5) {
                break;
            }
            switch (action) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
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
                "5. Выход\n");
        int choiseAction = scanner.nextInt();
        scanner.nextLine();
        return choiseAction;
    }
}
