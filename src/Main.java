public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        //задача1
        int clientOs = 1;
        if (clientOs == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        //Задача2
        int clientDeiceYear = 2010;
        if (clientOs == 0 && clientDeiceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        if (clientOs == 0 && clientDeiceYear < 2015) {
            System.out.println("Установите  облегченную версию приложения для iOS по ссылке");
        }
        if (clientOs == 1 && clientDeiceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        if (clientOs == 1 && clientDeiceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        //Задача3
        int year = 2022;
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("Год является високосным");
        } else {
            System.out.println("Год не является високосным");

        }
        //Задача4
        int deliveryDistance = 95;
        if (deliveryDistance < 20) {
            System.out.println("Потребуется 1 день");
        }
        if (deliveryDistance >= 20 && deliveryDistance < 60) {
            System.out.println("Потребуется 2 дня");
        }
        if (deliveryDistance >= 60 && deliveryDistance < 100) {
                    System.out.println("Потребуется 3 дня");
                }
        //Задача5
        int monthNumber=7;
        switch (monthNumber){
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
            break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Номер месяца больше 13");
            }
        }
    }