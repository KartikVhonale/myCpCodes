import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int t,x,i,k;
		Scanner sc=new Scanner(System.in);
		t=sc.nextInt();
		while(t--!=0){
		    x=sc.nextInt();
		    for(i=x;i>0;i-=2){
		        System.out.print(i+" ");
		    }
		    if(x%2==0)k=1;
		    else k=2;
		    for(i=k;i<x;i+=2){
		        System.out.print(i+" ");
		    }
		    System.out.print("\n");
		}
	}
}
