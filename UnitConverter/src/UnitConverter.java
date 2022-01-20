public class UnitConverter {
    // 필요한 상수 정의
    public static final double KILOGRAMS_PER_POUND = ((double)100000000/45359237);
    public static final double POUNDS_PER_KILOGRAM = 0.45359237;
    public static final double CENTIMETERS_PER_INCH = 2.54;
    public static final double INCHES_PER_CENTIMETER = (double)100/254;

    private UnitConverter(){
        // impossible to make Instance
    }

    public static double toPounds(double kilograms) {
        // 메소드 내부를 채워주세요
        return kilograms * KILOGRAMS_PER_POUND;
    }

    public static double toKilograms(double pounds) {
        // 메소드 내부를 채워주세요
        return POUNDS_PER_KILOGRAM * pounds;
    }

    public static double toCentimeters(double inches) {
        // 메소드 내부를 채워주세요
        return inches * CENTIMETERS_PER_INCH;
    }

    public static double toInches(double centimeters) {
        // 메소드 내부를 채워주세요
        return INCHES_PER_CENTIMETER * centimeters;
    }

    public static double toFahrenheit(double celsius) {
        // 메소드 내부를 채워주세요
        return celsius * ((double)9 / 5) + 32;
    }

    public static double toCelsius(double fahrenheit) {
        // 메소드 내부를 채워주세요
        return (fahrenheit - 32) * ((double)5 / 9);
    }
}
