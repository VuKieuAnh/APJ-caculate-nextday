public class NextDayCaculator {

    public static final int lastOfMonth = 31;
    public static final int firstDayOfMonth = 1;

    public static String nextDayCalculator(int inputDay, int inputMonth, int inputYear){
        if (inputDay== lastOfMonth)
        {
            inputMonth ++;
            inputDay = firstDayOfMonth;
            return (inputDay) + "-" + inputMonth + "-" + inputYear;
        }
        int nextDay = inputDay + 1;
        return nextDay + "-" + inputMonth + "-" + inputYear;
    }
}
