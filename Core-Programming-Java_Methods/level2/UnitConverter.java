public class UnitConverter {

    // KM / Miles
    public static double convertKmToMiles(double km) { return km * 0.621371; }
    public static double convertMilesToKm(double miles) { return miles * 1.60934; }

    // Meters / Feet
    public static double convertMetersToFeet(double m) { return m * 3.28084; }
    public static double convertFeetToMeters(double ft) { return ft * 0.3048; }

    // Yards / Feet
    public static double convertYardsToFeet(double yards) { return yards * 3; }
    public static double convertFeetToYards(double feet) { return feet * 0.333333; }

    // Meters / Inches, Inches / CM
    public static double convertMetersToInches(double m) { return m * 39.3701; }
    public static double convertInchesToMeters(double in) { return in * 0.0254; }
    public static double convertInchesToCm(double in) { return in * 2.54; }

    // Fahrenheit ↔ Celsius
    public static double convertFahrenheitToCelsius(double f) { return (f - 32) * 5 / 9; }
    public static double convertCelsiusToFahrenheit(double c) { return (c * 9 / 5) + 32; }

    // Pounds / Kilograms
    public static double convertPoundsToKg(double lbs) { return lbs * 0.453592; }
    public static double convertKgToPounds(double kg) { return kg * 2.20462; }

    // Gallons ↔ Liters
    public static double convertGallonsToLiters(double gal) { return gal * 3.78541; }
    public static double convertLitersToGallons(double l) { return l * 0.264172; }
}
