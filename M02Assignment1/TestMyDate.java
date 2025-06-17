public class TestMyDate {
    public static void main(String[] args) {
        MyDate currentDate = new MyDate();
        System.out.println("Current Date:");
        System.out.println("Year: " + currentDate.getYear());
        System.out.println("Month: " + (currentDate.getMonth() + 1));
        System.out.println("Day: " + currentDate.getDay());

        MyDate customDate = new MyDate(3435555133101L);
        System.out.println("\nCustom Date (from elapsed time):");
        System.out.println("Year: " + customDate.getYear());
        System.out.println("Month: " + (customDate.getMonth() + 1));
        System.out.println("Day: " + customDate.getDay());
    }
}
