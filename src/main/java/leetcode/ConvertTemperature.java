package leetcode;
// Prakash sovled it
// https://leetcode.com/problems/convert-the-temperature/description/
public class ConvertTemperature {
    public double[] convertTemperature(double celsius) {
//celsius = 36.50
        double[] myOutput = new double[2];
        myOutput[0] = celsius + 273.15;
        myOutput[1] = celsius * 1.80 + 32.00;

        return myOutput;
    }

    public static void main(String[] arg){
        double celsius = 36.50;
        ConvertTemperature obj =new ConvertTemperature();
        obj.convertTemperature(celsius);
    }
}
