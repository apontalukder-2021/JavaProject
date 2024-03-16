import java.util.Scanner;
public class CircleCircumferenceVolumeAndArea {
   public double Circumference(double radius)
   {
       return (2*Math.PI*radius);
   }
    public double Volume(double radius)
    {
        return (4/3*Math.PI*Math.pow(radius,3));
    }
    public double SurfaceArea(double radius)
    {
        return (4*Math.PI*Math.pow(radius,2));
    }

    public static void main(String[] args) {
        CircleCircumferenceVolumeAndArea circleCircumferenceVolumeAndArea1=new CircleCircumferenceVolumeAndArea();
        Scanner sc= new Scanner(System.in);
        System.out.printf("enter the value of radius:");
        double radius = sc.nextDouble();
        System.out.printf("Circumference:  %.2f\n",circleCircumferenceVolumeAndArea1.Circumference(radius));
        System.out.printf("Volume:         %.2f\n",circleCircumferenceVolumeAndArea1.Volume(radius));
        System.out.printf("Surface Area:   %.2f\n",circleCircumferenceVolumeAndArea1.SurfaceArea(radius));
    }

}