public class NextDayCaculator {

    public static final int lastOfMonth = 31;
    public static final int firstDayOfMonth = 1;

    public static String nextDayCalculator(int inputDay, int inputMonth, int inputYear){
        int outputDay = inputDay;
        int outputMonth = inputMonth;
        int outputYear = inputYear;

        if (inputMonth == 4 && inputDay == 30){
            outputDay = 1;
            outputMonth ++;
        }
        else {
            if (inputDay == lastOfMonth)
            {
                outputMonth ++;
                outputDay = firstDayOfMonth;
            }
            else {
                outputDay ++;
            }
        }


        return outputDay + "-" + outputMonth + "-" + outputYear;
    }
}
