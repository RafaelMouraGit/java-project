package com.company;

public class greetingMessage {

    public static void messageType(int hora){

        switch (hora) {
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                morningMessage();
                break;
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                afternoonMessage();
                break;
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                nightMessage();
                break;
            default:
                System.out.println("Olá");
                break;
        }
    }

    public static void morningMessage() {
        System.out.println("Olá, bom dia");
    }

    public static void afternoonMessage() {
        System.out.println("Olá, boa tarde");
    }

    public static void nightMessage() {
        System.out.println("Olá, boa noite");
    }
}
