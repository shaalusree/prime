package demo1;
import java.util.Scanner;
public class Prime {
	



	     public static void main(String []args){
	         int b=0,c=0,flag=0,a;
	         Scanner s=new Scanner(System.in);
	         System.out.println("enter the numbers");
	         a=s.nextInt();
	         int array[]=new int[a];
	         for (int i=2;i<=a;i++)
	         {
	             if ((i%2==0) || (i%5==0))
	             {
	             
	                 continue;
	             }
	             else 
	             {
	                 array[b]=i;
	                 
	             System.out.println(array[b]);
	               b++; 
	             }
	         }
	         for(int i=0;i<=b;i++)
	         {
	            
	             for(int k=2;k<=array[c]/2;k++)
	             {
	                  flag =0;
	                 if(array[c]%k==0){
	                     flag=1;
	                     c++;
	                 }
	             }
	         if(flag==0 && array[c]!=0 && array[c]!=1)
	         {
	             System.out.println(array[c]);
	         }
	                 c++;
	             
	         }
	        
	     }
	}

