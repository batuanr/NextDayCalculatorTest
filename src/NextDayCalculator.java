public class NextDayCalculator {

    public static final String CONCATENATION = "/";

    public static String getNextDay (int day, int month, int year) {
        if (day == 31) {
            day =1;
            month++;
        }
        else {
            day++;
        }
        return day + CONCATENATION + month + CONCATENATION + year;
    }
}

