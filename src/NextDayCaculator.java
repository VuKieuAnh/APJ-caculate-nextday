public class NextDayCaculator {

    public static final int firstDayOfMonth = 1;

    public static String nextDayCalculator(int inputDay, int inputMonth, int inputYear){
        int outputDay = inputDay;
        int outputMonth = inputMonth;
        int outputYear = inputYear;

        if (inputDay == getLastOfMonth(inputMonth)){
            outputDay = firstDayOfMonth;
            outputMonth ++;
        }
        else
                outputDay ++;

        return outputDay + "-" + outputMonth + "-" + outputYear;
    }

    private static int getLastOfMonth(int inputMonth) {
        switch (inputMonth){
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                return 28;
        }
        return 31;
    }


}
