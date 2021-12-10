//Jamie Gashler
//JAVA Programming I
//Homework II- Thermistors

import java.util.Scanner;
public class Thermistor {

    public static final double RESIST_O = 10000.0;
    public static final double TEMP_O = 25.0 + 273.0;  //value is in Kelvin for ease of calculation
    public static final double BETA = 3960.0;
    public static final double CEL_CONST = 273.0;
    public static final double KEL_CONST = 273.15;
    public static final double FER_CONST = 65.12;


    public static void main(String[] args) {

        System.out.print("Enter the resistance > ");
        var scanner = new Scanner(System.in);
        var input = scanner.nextDouble();

        double finalTempCel = ((BETA * TEMP_O) / (TEMP_O * Math.log(input / RESIST_O) + BETA) - CEL_CONST);
        double finalTempFer = (finalTempCel + FER_CONST);
        double finalTempKel = (finalTempCel + KEL_CONST);

        System.out.printf("%.2f  \u00B0C, %.2f  \u00B0F, and %.2f  \u00B0K %n", finalTempCel, finalTempFer, finalTempKel);
    }
}
