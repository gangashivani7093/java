import java.util.*;
public class countingvowels
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    
	    String a=sc.nextLine();
	    char b=sc.next().charAt(0);
	    int con=0,vow=0;
	    for( int i=0;i<a.length();i++)
	    { char ch=a.charAt(i);
	        if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
	    {
	        vow+=1;
	    }
		else
		{
			con+=1;
	    }
		}
		System.out.println(vow);
		System.out.println(con);
		
	}
}