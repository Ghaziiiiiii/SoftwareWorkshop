/*
WS1-3

A capital of $ 100 is invested at a fixed interest rate of
2.3 per cent. The interest is added to the capital at the end of each year. Use the formula
total = capital * (1 + 0.01 * interest rate)^years
to print the balance after each of the first 5 years and after 500 years.

In this exercise, the variables are declared and initialized, then the formula
on the worksheet is translated to Java.

The total capital computed after 1, 2, 3, 4, 5 and 500 years.

@author Mohd. Ghazanfar
@version 23-07-2018 | Last Changed:

 */
public class Capital {
    /*
     * Takes the current capital, interest rate and number of years and
     * @param capitalSum    The capital involved
     * @param interestRate  The interest rate
     * @param years         The number of years of the investment
     * @return              The final capital (incl. interest earned)
     */
    public static double interestAddedCapitalSum(double capitalSum, double interestRate, int years) {
        return capitalSum * Math.pow(1.0 + 0.01 * interestRate, years);
    }

    public static String interestToString(double capitalSum, double interestRate, int years) {
        return "After " + years + " years a capital of \u00A3" + capitalSum + " grows with an interest rate of "
                + interestRate + "\u0025 to \u00A3" + Math.round(interestAddedCapitalSum(capitalSum, interestRate,years));
    }

    public static void main(String[] args) {

        double capitalSum = 100;
        double interestRate = 2.3;

        for (int i=0; i < 5; i++) {
            System.out.println(interestToString(capitalSum, interestRate, i));

        }
    }
}
