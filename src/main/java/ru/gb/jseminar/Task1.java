package ru.gb.jseminar;

import java.util.Scanner;

public class Task1 {

    //Написать программу, которая запросит пользователя ввести <Имя> в консоли.
    //Получит введенную строку и выведет в консоль сообщение “Привет, <Имя>!”
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Enter username: ");
        String userName = iScanner.next();
        System.out.println(String.format("Hello %s!", userName));
        iScanner.close();
    }

}
