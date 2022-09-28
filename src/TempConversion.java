import java.util.Scanner;

public class TempConversion {
    static final Scanner input = new Scanner(System.in);

    public static double convertC2F(double celsius) {
        return (celsius * (9.0/5)) + 32.0;
    }

    public static double convertC2K(double celsius) {
        return celsius + 273.15;
    }

    public static double convertF2C(double fahrenheit) {
        return 5.0 * (fahrenheit - 32) / 9.0;
    }

    public static double convertF2K(double fahrenheit) {
        return convertC2K(convertF2C(fahrenheit));
    }

    public static double convertK2C(double kelvin) {
        return kelvin - 273.15;
    }

    public static double convertK2F(double kelvin) {
        return convertC2F(convertK2C(kelvin));
    }

    public static double getTemp(String unit) {
        System.out.printf("%-40s : ", String.format("Please enter °%s temperature to convert", unit));
        return Double.parseDouble(input.nextLine());
    }

    public static String getUnitChoice() {
        System.out.printf("%-4s : %40s%n", "C).", "To convert a °C temperature");
        System.out.printf("%-4s : %40s%n", "F).", "To convert a °F temperature");
        System.out.printf("%-4s : %40s%n", "K).", "To convert a °K temperature");
        System.out.printf("%-4s : %40s%n", "Q).", "To quit");
        return input.nextLine();
    }

    public static void main(String[] args) {
        while(true) {
            String convertFrom = getUnitChoice();
            String convertTo = getUnitChoice();
            if (convertTo.equals("Q") || convertFrom.equals("Q")) {
                break;
            }
            double temp = getTemp(convertTo);
            switch (convertFrom) {
                case "C":
                    if (convertTo.equals("F")){
                        System.out.printf("Result %f°%s is %f°%s\n",temp,convertFrom,convertC2F(temp),convertTo);
                    }
                    else {
                        System.out.printf("Result %f°%s is %f°%s\n",temp,convertFrom,convertC2K(temp),convertTo);
                    }
                    break;
                case "F":
                    if (convertTo.equals("C")) {
                        System.out.printf("Result %f°%s is %f°%s\n",temp,convertFrom,convertF2C(temp),convertTo);
                    }
                    else {
                        System.out.printf("Result %f°%s is %f°%s\n",temp,convertFrom,convertF2K(temp),convertTo);
                    }
                    break;
                case "K":
                    if (convertTo.equals("C")) {
                        System.out.printf("Result %f°%s is %f°%s\n",temp,convertFrom,convertK2C(temp),convertTo);
                    }
                    else {
                        System.out.printf("Result %f°%s is %f°%s\n",temp,convertFrom,convertK2F(temp),convertTo);
                    }
                    break;
                }
            }

        }
    }
