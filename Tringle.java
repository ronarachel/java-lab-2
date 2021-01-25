import java.lang.Math; 
class Triangle
{
    Triangle()
    {
     
    }
    public static void main (String[] args) 
    {
        Triangle t = new Triangle();
        int a=3;
        int b=4;
        int c=5;
        int p=(a+b+c)/2; 
        double area= Math.sqrt(p*(p-a)*(p-b)*(p-c));
        int pm = a+b+c;
        System.out.println("AREA OF TRIANGLE : "+area);
        System.out.println("PERIMETER OF TRIANGLE : "+pm);
    }
}
