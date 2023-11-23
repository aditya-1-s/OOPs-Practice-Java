public class Time {
    int sec;
    int hour;
    int min;
    public Time(int hour,int min,int sec) {
        this.hour = hour;
        this.min = min;
        this.sec = sec;
    }
    public int getHour() {
        return hour;
    }
    public int getMin() {
        return min;
    }
    public int getSec() {
        return sec;
    }
    public void setHour(int hour) {
        this.hour = hour;
    }
    public void setMin(int min) {
        this.min = min;
    }
    public void setSec(int sec) {
        this.sec = sec;
    }
    public String toString() {
        // Using String.format to add leading zeros
        return String.format("%02d:%02d:%02d", hour, min, sec);
    }
    public Time nextSecond() {
        sec++;
        if (sec == 60) {
            sec = 0;
            min++;
        if (min == 60) {
            min = 0;
            hour = (hour + 1) % 24;
        }
        }
        return this;
    }
    public Time previousSecond() {
        sec--;
        if(sec == -1) {
            sec = 59;
            min--;
            if (min==-1) {
                min = 59;
                hour = (hour-1+24)%24;
            }
        }
        return this;
    }
    public void setTime(int hour,int min,int sec) {
        this.hour = hour;
        this.min = min;
        this.sec = sec;
    }

}
