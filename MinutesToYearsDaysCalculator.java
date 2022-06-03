public class MinutesToYearsDaysCalculator {

    public static void printYearsAndDays(long minutes) {

        // Validating the parameter
        if(minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            long totalMinutesInOneDay = 24 * 60; // Total minutes in one day.
            long totalNumberOfDays = minutes / totalMinutesInOneDay; // Finding number of days.
            // Finding how many years will fit in the totalNumberOfDays and slicing the remainder.
            long numberOfYears = totalNumberOfDays / 365;
            long remainingDays = totalNumberOfDays % 365; // Adding the remaining days.
            System.out.println(minutes + " min " + "= " + numberOfYears + " y " + "and " + remainingDays + " d");
        }
    }
}
