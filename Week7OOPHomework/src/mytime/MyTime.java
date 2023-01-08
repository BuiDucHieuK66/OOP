package mytime;

public class MyTime {
    private int hour;
    private int minute;
    private  int second;

    public MyTime() {
        this.hour = 0;
        this.minute = 0;
        this.second = 0;
    }

    public MyTime(int hour, int minute, int second) {
        setTime(hour, minute, second);
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void setTime(int hour, int minute, int second) {
        if (!(hour >= 0 && hour < 24 && minute >= 0 && minute < 60 && second >= 0 && second < 60)) {
            throw new IllegalArgumentException("Invalid hour, minute, or second!");
        }
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if (hour >= 0 && hour < 24) {
            this.hour = hour;
        } else {
            throw new IllegalArgumentException("Invalid hour!");
        }
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        if (minute >= 0 && minute < 60) {
            this.minute = minute;
        } else {
            throw new IllegalArgumentException("Invalid minute!");
        }
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        if (second >= 0 && second < 60) {
            this.second = second;
        } else {
            throw new IllegalArgumentException("Invalid second!");
        }
    }

    public String toString() {
        return String.format("\"%02d:%02d:%02d\"", this.hour, this.minute, this.second);
    }

    public MyTime nextSecond() {
        this.second++;

        if (this.second >= 60) {
            this.second %= 60;
            this.minute++;

            if (this.minute >= 60) {
                this.minute %= 60;
                this.hour++;

                if (this.hour >= 24) {
                    this.hour %= 24;
                }
            }
        }
        return new MyTime(this.hour, this.minute, this.second);
    }

    public MyTime nextMinute() {
        this.minute++;

        if (this.minute >= 60) {
            this.minute %= 60;
            this.hour++;

            if (this.hour >= 24) {
                this.hour %= 24;
            }
        }
        return new MyTime(this.hour, this.minute, this.second);
    }

    public MyTime nextHour() {
        this.hour++;

        if (this.hour >= 24) {
            this.hour %= 24;
        }
        return new MyTime(this.hour, this.minute, this.second);
    }

    public MyTime previousSecond() {
        this.second--;

        if (this.second < 0) {
            this.second += 60;
            this.minute--;

            if (this.minute < 0) {
                this.minute += 60;
                this.hour--;

                if (this.hour < 0) {
                    this.hour += 24;
                }
            }
        }
        return new MyTime(this.hour, this.minute, this.second);
    }

    public MyTime previousMinute() {
        this.minute--;

        if (this.minute < 0) {
            this.minute += 60;
            this.hour--;

            if (this.hour < 0) {
                this.hour += 24;
            }
        }
        return new MyTime(this.hour, this.minute, this.second);
    }

    public MyTime previousHour() {
        this.hour--;

        if (this.hour < 0) {
            this.hour += 24;
        }
        return new MyTime(this.hour, this.minute, this.second);
    }
}
