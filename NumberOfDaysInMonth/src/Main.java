public class Main {

    public static void main(String[] args) {

        boolean year = NumberOfDaysInMonth.isLeapYear(-1600);
        System.out.println(year);
        boolean year1 = NumberOfDaysInMonth.isLeapYear(1600);
        System.out.println(year1);
        boolean year2 = NumberOfDaysInMonth.isLeapYear(2017);
        System.out.println(year2);
        boolean year3 = NumberOfDaysInMonth.isLeapYear(2000);
        System.out.println(year3);

        System.out.println(NumberOfDaysInMonth.getDaysInMonth(1, 2020));
        System.out.println(NumberOfDaysInMonth.getDaysInMonth(2, 2020));
        System.out.println(NumberOfDaysInMonth.getDaysInMonth(2, 2018));
        System.out.println(NumberOfDaysInMonth.getDaysInMonth(-1, 2020));
        System.out.println(NumberOfDaysInMonth.getDaysInMonth(1, -2020));
    }
}
