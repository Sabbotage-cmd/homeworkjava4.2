import java.text.DecimalFormat;

public class BmiService {
    public static String calculate(int growth, int weight) {
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        double growthInMeters = (double) growth / 100;
        double index = weight / Math.pow(growthInMeters, 2);
        return decimalFormat.format(index);
    }
}
