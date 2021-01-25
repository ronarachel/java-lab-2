class parent
{
    void method1()
    {
        System.out.println("This is parent class");
    }
}

class child extends parent
{
    void method2()
    {
        System.out.println("This is child class");
    }
}

class Inheritance
{
    public static void main (String[] args) 
    {
        parent p = new parent();
        child c = new child();
        p.method1();
        c.method2();
        c.method1();
    }
}
