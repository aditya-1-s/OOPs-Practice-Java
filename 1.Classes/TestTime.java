public class TestTime {
    public static void main(String[] args) {
        Time t1 = new Time(1, 2, 3);
        System.out.println(t1);  // toString()
        t1.setHour(4);
        t1.setMin(5);
        t1.setSec(6);
        System.out.println(t1);  // toString()
        System.out.println("Hour: " + t1.getHour());
        System.out.println("Minute: " + t1.getMin());
        System.out.println("Second: " + t1.getSec());

        // Test setTime()
        t1.setTime(23, 59, 58);
        System.out.println(t1);  // toString()

        // Test nextSecond();
        System.out.println(t1.nextSecond());
        System.out.println(t1.nextSecond().nextSecond());

        // Test previousSecond()
        System.out.println(t1.previousSecond());
        System.out.println(t1.previousSecond().previousSecond());
    }

}
