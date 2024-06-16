
import java.util.Date;

public class M02_Assignment1 {
    private int year;
    private int month;
    private int day;

    public M02_Assignment1() {
        this(System.currentTimeMillis());
    }

    public M02_Assignment1(long elapsedTime) {
        setDate(elapsedTime);
    }

    public M02_Assignment1(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public void setDate(long elapsedTime) {
        Date date = new Date(elapsedTime);
        this.year = date.getYear() + 1900;
        this.month = date.getMonth();
        this.day = date.getDate();
    }

    public static void main(String[] args) {
        M02_Assignment1 date1 = new M02_Assignment1();
        M02_Assignment1 date2 = new M02_Assignment1(34355555133101L);

        System.out.println("Date 1: " + date1.getYear() + "/" + (date1.getMonth() + 1) + "/" + date1.getDay());
        System.out.println("Date 2: " + date2.getYear() + "/" + (date2.getMonth() + 1) + "/" + date2.getDay());
    }
}
