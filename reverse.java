 import java.util.*;
  class reverse {    
   public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);       
		int []a=new int[5];
         for (int i=0;i<a.length;i++)
		 {
    
       a[i]=sc.nextInt();
        }
		int i=0,j=a.length-1;
		while(i<j)
		{
		int temp=0;
		temp=a[i];
		a[i]=a[j];
		a[j]=temp;
		i+=1;
		j+=1;
        for (int k=0;k<a.length;k++)
        {
            System.out.println(a[k]);
        }
    }
}
}