import java.util.*;
public class Area  
{
    int l,b;
    Area(int l,int b)
    {
        this.l=l;
        this.b=b;
    }
    
    static double returnArea(int r,int s)
    {
        return r*s;
    }
    public static void main (String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length ");
        int l=sc.nextInt();
        System.out.println("Enter breadth");
        int b=sc.nextInt();
        Area a = new Area(l,b);
        double area = returnArea(l,b);
        System.out.println("AREA = "+area);
    }
}
