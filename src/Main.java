import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        leapYear(2021);
        leapYear(2024);
        leapYear(1800);
        leapYear(2056);
        appVersion(2015, 1);
        int deliveryDistance = 15;
        int days = deliveryDays(deliveryDistance);
        if (days != -1) {
            System.out.println("Потребуется дней: " + days);
        } else {
            System.out.println("Доставка недоступна для данной дистанции.");
        }
    }

    public static void leapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " год - високосный год");
        } else {
            System.out.println(year + " год - не високосный год");
        }
    }

    public static void appVersion(int clientDeviceYear, int clientOS) {
        int currentYear = LocalDate.now().getYear();
        String appVersion = (clientDeviceYear < currentYear) ? "облегченную версию" : "версию";
        if (clientOS == 0) {
            System.out.println("Установите " + appVersion + " приложения для iOS по ссылке.");
        } else if (clientOS == 1) {
            System.out.println("Установите " + appVersion + " приложения для Android по ссылке.");
        } else {
            System.out.println("Некорректный тип операционной системы.");
        }
    }

    public static int deliveryDays(int deliveryDistance) {
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
