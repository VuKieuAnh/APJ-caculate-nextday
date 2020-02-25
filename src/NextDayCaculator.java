public class NextDayCaculator {

    public static int lastOfMonth = 31;
    public static final int firstDayOfMonth = 1;

    public static String nextDayCalculator(int inputDay, int inputMonth, int inputYear){
        int outputDay = inputDay;
        int outputMonth = inputMonth;
        int outputYear = inputYear;

        getLastOfMonth(inputMonth);

        if (inputDay == lastOfMonth){
            outputDay = firstDayOfMonth;
            outputMonth ++;
        }
        else
                outputDay ++;

        return outputDay + "-" + outputMonth + "-" + outputYear;
    }

    private static void getLastOfMonth(int inputMonth) {
        switch (inputMonth){
            case 4:
            case 6:
            case 9:
            case 11:
                lastOfMonth = 30;
                break;
            case 2:
                lastOfMonth = 28;
        }
    }
}
