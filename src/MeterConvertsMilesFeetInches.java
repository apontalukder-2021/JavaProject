import java.util.Scanner;
public class MeterConvertsMilesFeetInches {
    public double Miles(double meter)
    {
        return meter/1609.34;
    }
  public double Feet(double meter)
  {
      return (3*meter);
  }
    public double Inches(double meter)
    {
        return (39.37*meter);
    }

    public static void main(String[] args) {
        MeterConvertsMilesFeetInches  meterConvertsMilesFeetInches1= new MeterConvertsMilesFeetInches();
        Scanner sc= new Scanner(System.in);
        System.out.printf("Enter the meter value");
        double meter= sc.nextDouble();
        System.out.printf("Miles:   %.5f\n",meterConvertsMilesFeetInches1.Miles(meter));
        System.out.printf("Feet:    %.5f\n",meterConvertsMilesFeetInches1.Feet(meter));
        System.out.printf("Inches:  %.5f\n",meterConvertsMilesFeetInches1.Inches(meter));

    }

}
