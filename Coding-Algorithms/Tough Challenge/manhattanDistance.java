import java.util.Scanner;
class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
       int x1,y1,x2,y2,x,y;
       x1=sc.nextInt();
       y1=sc.nextInt();
       x2=sc.nextInt();
       y2=sc.nextInt();
        
        if(x1-x2<0)
        x=-1*(x1-x2);
        else
        x=x1-x2;
        if(y1-y2<0)
        y=-1*(y1-y2);
        else
        y=y1-y2;
        System.out.println(x+y);

    }
    }
