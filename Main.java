import java.util.*;
class Areaa
{
void area(int l,int b)
{
    int area = l*b;
    System.out.println("AREA = "+area);
}
void area(double r)
{
    double pi=3.14;
    double ar = pi*r*r;
    System.out.println("AREA = "+ar);
}
}

class Main 
{
    public static void main (String[] args)
    {
    Scanner sc = new Scanner(System.in);
    Areaa a = new Areaa();
    System.out.println("1.RECTANGLE");
    System.out.println("2.CIRCLE");
    System.out.println("Enter your choice : ");
    int ch = sc.nextInt();
    if(ch==1)
    {
        System.out.print("Enter length and breadth : ");
        int l = sc.nextInt();
        int b = sc.nextInt();
        a.area(l,b);
    }
    else if(ch==2)
    {
        System.out.print("Enter the radius of Circle : ");
        double r = sc.nextDouble();
        a.area(r);
    }
    }
}
    
