import java.util.*;
class search{
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int []a=new int[5];
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
		int m=sc.nextInt();
        for(int i=0;i<a.length;i++)
        {
          if(a[i]==5)
		  {
		  System.out.println("found at index"+i);
		  flag=0;
		  break;
            }
		}
		if (flag==0)
		{
		System.out.println("not found");
		}
      }
}