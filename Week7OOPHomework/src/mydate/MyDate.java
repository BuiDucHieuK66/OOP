package mydate;

public class MyDate {
    private int year;
    private int month;
    private int day;

    public final String[] MONTHS = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    public final String[] DAYS = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
    public final int[] DAYS_IN_MONTHS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public boolean isLeapYear(int year) {
        if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0 || year % 4 != 0) {
            return false;
        } else {
            return true;
        }
    }

    public boolean isValidDate(int year, int month, int day) {
        if (year > 0 && year < 10000 && month >= 1 && month <= 12 && day >= 1) {
            if (!isLeapYear(year)) {
                return day <= DAYS_IN_MONTHS[month - 1];
            } else if (month == 2) {
                return day <= 29;
            } else {
                return day <= DAYS_IN_MONTHS[month - 1];
            }
        } else {
            return true;
        }
    }

    public int getDayOfWeek(int year, int month, int day) {
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        int d0 = (day + x + (31 * m0) / 12) % 7;

        return d0;
    }

    public MyDate(int year, int month, int day) {
        setDate(year, month, day);
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public void setDate(int year, int month, int day) {
        if (!isValidDate(year, month, day)) {
            throw new IllegalArgumentException("Invalid year, month, or day!");
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year > 0 && year < 10000) {
            this.year = year;
        } else {
            throw new IllegalArgumentException("Invalid year!");
        }
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if (month >= 1 && month <= 12) {
            this.month = month;
        } else {
            throw new IllegalArgumentException("Invalid month!");
        }
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if (isValidDate(this.year, this.month, day)) {
            this.day = day;
        } else {
            throw new IllegalArgumentException("Invalid day!");
        }
    }

    public String toString() {
        return DAYS[getDayOfWeek(this.year, this.month, this. day)] + " " + this.day + " " + MONTHS[month - 1] + " " + this.year;
    }

    public MyDate nextDay() {
        this.day++;

        if (!isLeapYear(this.year)) {
            if (this.day > DAYS_IN_MONTHS[this.month - 1]) {
                this.day = 1;
                nextMonth();
            }
        } else if (this.month == 2) {
            if (day > 29) {
                this.day = 1;
                nextMonth();
            }
        } else if (day > DAYS_IN_MONTHS[this.month - 1]) {
            this.day = 1;
            nextMonth();
        }
        return new MyDate(this.year, this.month, this.day);
    }

    public MyDate nextMonth() {
        this.month++;

        if (DAYS_IN_MONTHS[this.month - 2] == 31 && this.day == 31) {
            this.day = DAYS_IN_MONTHS[this.month - 1];
            return new MyDate(this.year, this.month, this.day);
        } else if (this.month > 12) {
            this.month -= 12;
            nextYear();
        }
        return new MyDate(this.year, this.month, this.day);
    }

    public MyDate nextYear() {
        this.year++;

        if (this.year > 9999) {
            throw new IllegalStateException("Year out of range!");
        } else if (isLeapYear(this.year - 1) && this.month == 2 && this.day == 29) {
            return new MyDate(this.year, this.month, this.day - 1);
        } else {
            return new MyDate(this.year, this.month, this.day);
        }
    }

    public MyDate previousDay() {
        this.day--;

        if (this.day < 1) {
            if (isLeapYear(this.year) && this.month == 3) {
                this.day += 29;
                previousMonth();
            } else if (this.month == 1) {
                this.day += 31;
                this.month = 12;
                previousYear();
            } else {
                this.day += DAYS_IN_MONTHS[this.month - 2];
                this.month--;
            }
        }
        return new MyDate(this.year, this.month, this.day);
    }

    public MyDate previousMonth() {
        this.month--;

        if (DAYS_IN_MONTHS[this.month] == 31 && this.day == 31) {
            this.day = DAYS_IN_MONTHS[this.month - 1];
            return new MyDate(this.year, this.month, this.day);
        } else if (this.month < 1) {
            this.month += 12;
            previousYear();
        }
        return new MyDate(this.year, this.month, this.day);
    }

    public MyDate previousYear() {
        this.year--;

        if (this.year < 0) {
            throw new IllegalStateException("Year out of range!");
        } else if (isLeapYear(this.year + 1) && this.month == 2 && this.day == 29) {
            return new MyDate(this.year, this.month, this.day - 1);
        } else {
            return new MyDate(this.year, this.month, this.day);
        }
    }
}
