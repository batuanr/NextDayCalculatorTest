public class NextDayCalculator {

    public static final String CONCATENATION = "/";

    public static String getNextDay (int day, int month, int year) {
        int lastOfMonth = 0;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                lastOfMonth = 31;
                break;
            case 2:
            case 4:
            case 6:
            case 9:
            case 11:
                lastOfMonth = 30;
                break;
        }
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

