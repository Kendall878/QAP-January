public class TestTime {
    public static void main(String[] args) {
        // Create Time instances t1 and t2
        Time t1 = new Time(0, 0, 0);
        Time t2 = new Time(0, 0, 0);

        // Set the time using set methods
        t1.setTime(21, 10, 15);
        t2.setTime(10, 20, 25);

        // Print the time for t1 and 2
        System.out.println("Time t1: " + t1);
        System.out.println("Time t2: " + t2);

        // Move forward a second for t1
        t1.nextSecond();
        System.out.println("After nextSecond() on t1: " + t1);

        // Move backward a second on t2
        t2.previousSecond();
        System.out.println("After previousSecond() on t2: " + t2);

        // Print final times
        System.out.println("Time t1: " + t1);
        System.out.println("Time t2: " + t2);
    }
}
