import java.util.*;
class Queue
{
    Queue()
    {
        
    }
    Queue(int n)
    {
        
    }
    static int front=0;
    static int rear=-1;
    static int queue[] = new int[20]; 
    void enqueue(int n)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the data : ");
        int data = sc.nextInt();
        if(rear==n-1)
        {
             System.out.println("Exit");
        }
        else
        {
        rear++;
        queue[rear]=data;
        }
    }
    void dequeue()
    {
        if((front==-1)||(rear==-1))
        {
             System.out.println("Exit");
        }
        else if(front==rear)
        {
            front=rear=-1;
        }
        else
        {
            System.out.println("Element to be removed is : "+queue[front]);
            front++;
        }
    }
    void display()
    {
        for(int i=front;i<=rear;i++)
        {
             System.out.println(queue[i]);
        }
    }
    public static void main (String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n :");
        int n = sc.nextInt();
        for(int i=0;;i++)
        {
        System.out.println("1.ENQUEUE 2.DEQUEUE 3.DISPLAY 4.EXIT");
        System.out.print("Enter your choice : ");
        int ch = sc.nextInt();
        Queue q = new Queue(n);
        if(ch==1)
        {
            q.enqueue(n);
        }
        else if(ch==2)
        {
            q.dequeue();
        }
        else if(ch==3)
        {
            q.display();
        }
        else
        {
            System.exit(0);
        }
        }
    }
}
