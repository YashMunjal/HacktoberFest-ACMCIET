import java.util.Scanner;
class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String find=sc.nextLine();
        int n=sc.nextInt();

    int ind=0,prev=0;
        for(int i=0;i<n;i++){
            prev=ind;
            ind=s.indexOf(find);
            if(ind==-1)
            break;
            s=s.substring(0,ind)+"#"+s.substring(ind+1,s.length());
        }
        System.out.println(ind);
    }
    }
