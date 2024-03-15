public class LetterSheet {
public static final double length=11*25.4;
public static final double width=8.5*25.4;
public double width()
{
    return width;
}
public double length()
{
    return length;
}
public double Perimeter()
{
    return 2*(length+ width);
}
public double DiagonalLength()
{
    double x= Math.pow(length,2) + Math.pow(width,2);
    return Math.sqrt(x);
}
public static void main(String[] args)
{
    LetterSheet letterSheet= new LetterSheet();
    System.out.printf("Width:           %.2f\n",letterSheet.width());
    System.out.printf("Length:          %.2f\n",letterSheet.length());
    System.out.printf("Perimeter:       %.2f\n",letterSheet.Perimeter());
    System.out.printf("Diagonal Length: %.2f\n",letterSheet.DiagonalLength());


}
}
