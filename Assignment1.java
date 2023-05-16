import java.util.Scanner;
class Main
{
	public static void main(String[] args)
	{
	    int m,x,y;
	    Scanner s=new Scanner(System.in);
	    m=s.nextInt();
	    x=m%3;
	    y= m%5;
	    if(x==0&&y==0)
	    System.out.println("Good Number");
	    else if(x==0&&y!=0)
	    System.out.println("Bad Number");
	    else if(x!=0&&y==0)
	    System.out.println("Poor Number");
	    else
	    System.out.println("-1");
	}
}
