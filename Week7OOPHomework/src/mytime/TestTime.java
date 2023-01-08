package mytime;

public class TestTime {
    public static void main(String[] args) {
        MyTime time1 = new MyTime();

        System.out.println(time1.getSecond());
        System.out.println(time1.getMinute());
        System.out.println(time1.getHour());
        time1.setHour(1);
        time1.setMinute(56);
        time1.setSecond(23);

        MyTime time2 = new MyTime(4, 59, 0);

        System.out.println(time2);
        System.out.println(time2.nextMinute().toString());
        System.out.println(time2.nextSecond().toString());
        System.out.println(time2.nextHour().toString());
        System.out.println(time2.previousSecond().toString());
        System.out.println(time2.previousMinute().toString());
        System.out.println(time2.previousHour().toString());
    }
}
