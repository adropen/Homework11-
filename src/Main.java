//task 1
public class Main {
    static void main() {
        leapYear(2021);
        leapYear(2024);
        int ios = 0;
        int android = 1;
        int year = 2026;
        int clientDeviceYear = 2015;
        int deliveryDistance = 95;
        operatinSystem.applicationInstallation(ios, year, clientDeviceYear);
        operatinSystem.applicationInstallation(android, year, clientDeviceYear);
        int days = delivery(deliveryDistance);
        System.out.println("Потребуется дней: " + days);
    }
    static void leapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " високосный год");
        } else {
            System.out.println(year + " невисокосный год");
        }
    }
    static int delivery(int deliveryDistance) {
        if (deliveryDistance <= 20) {
            return 1;
        } else if (deliveryDistance <= 60) {
            return 2;
        } else if (deliveryDistance <= 100) {
            return 3;
        } else {
            return -1;
        }
    }
    }
    class operatinSystem {
        static void applicationInstallation(int os, int year, int clientDeviceYear) {
            if (year < clientDeviceYear && os == 0) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else if (year < clientDeviceYear && os == 1) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else if (year >= clientDeviceYear && os == 1) {
                System.out.println("Установите обычную версию приложения для Android по ссылке");
            } else if (year >= clientDeviceYear && os == 0) {
                System.out.println("Установите обычную версию приложения для iOS по ссылке");
            }
        }
    }
