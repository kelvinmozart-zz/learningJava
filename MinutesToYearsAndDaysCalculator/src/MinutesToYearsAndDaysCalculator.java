public class MinutesToYearsAndDaysCalculator {

    public static void printYearsAndDays(long minutes){

        if( minutes < 0 ){
            System.out.println("Invalid Value");
        }else {
            long hours = minutes / 60;
            int days = (int) hours / 24;
            int remainingDays = days % 365;
            int years = days / 365;

            System.out.println(minutes + " min = " + years + " y and " + remainingDays + " d");
        }

    }
}
