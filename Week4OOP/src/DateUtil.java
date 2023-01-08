import java.util.Scanner;

public class DateUtil {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the year: ");
        int year = sc.nextInt();

        System.out.print("Enter the month: ");
        int month = sc.nextInt();

        System.out.print("Enter the day: ");
        int day = sc.nextInt();

        if (isValidDate(year, month, day)) {
            getDayOfWeek(year, month, day);

            System.out.println(toString(year, month, day));
        }   
        sc.close();
    }

    public static String[] strMonths = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};

    public static int[] daysInMonths = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static boolean isLeapYear(int year) {
        if (year % 400 == 0) {
            return true;
        } else return year % 100 != 0 && year % 4 == 0;
    }

    public static boolean isValidDate(int year, int month, int day) {
        if (year < 10000 && year > 0 && month <= 12 && month > 0 && day > 0) {
            if (isLeapYear(year) && month == 2 && day <= daysInMonths[month - 1] + 1) {
                return true;
            } else return day <= daysInMonths[month - 1];
        } else {
            return false;
        }
    }    

    public static int getDayOfWeek(int year, int month, int day) {
        int sum = 0;

        switch ((year - year % 100) % 400) {
            case 0 -> sum += 6;
            case 100 -> sum += 4;
            case 200 -> sum += 2;
            case 300 -> sum += 3;
        }
        sum += year % 100 + (year % 100) / 4 + day;
        
        switch (month) {
            case 1:
                if (isLeapYear(year)) {
                    sum += 6;
                }
                break;
            case 2:
                if (isLeapYear(year)) {
                    sum += 2;
                } else {
                    sum += 3;
                }
                break;
            case 3:
            case 11:
                sum += 3;
                break;
            case 4:
            case 7:
                sum += 6;
                break;
            case 5:
                sum += 1;
                break;
            case 6:
                sum += 4;
                break;
            case 8:
                sum += 2;
                break;
            case 9:
            case 12:
                sum += 5;
                break;
        }
        return sum % 7;
    }

    public static String toString(int year, int month, int day) {
        StringBuilder str = new StringBuilder();

        String[] dayOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        str.append(dayOfWeek[getDayOfWeek(year, month, day)]).append(" ").append(day).append(" ").append(strMonths[month - 1]).append(" ").append(year);

        return str.toString();
    }
}