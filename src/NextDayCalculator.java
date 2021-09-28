public class NextDayCalculator {

    public static final String CONCATENATION = "/";

    public static String getNextDay (int day, int month, int year) {
        int lastOfMonth = 31;
        if (day == lastOfMonth) {
            int startOfMonth = 1;
            day = startOfMonth;
            month++;
        }
        else {

            day++;
        }
        return day + CONCATENATION + month + CONCATENATION + year;
    }
}

