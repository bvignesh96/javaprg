import java.util.*;
import java.lang.*;
class least
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the number:");
int n=sc.nextInt(),i=0;
String s=n+"";
int[] x=new int[s.length()];
while(n>0)
{
x[i]=n%10;
n=n/10;
i+=1;
}
Arrays.sort(x);
System.out.println("enter k:");
int k=sc.nextInt();
for(int j=0;j<(x.length-k);j++)
System.out.print(x[j]);
}
}
