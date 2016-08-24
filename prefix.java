import java.util.*;
class prefix
{
public static void main(String[] args)
{
int c=0;
Scanner sc=new Scanner(System.in);
System.out.println("enter the array size:");
int s=sc.nextInt();
String[] x=new String[s];
System.out.println("ele:");
for(int i=0;i<s;i++)
  x[i]=sc.next();
for(int i=0;i<s;i++)
{
for(int j=i+1;j<s;j++)
{
if(x[i].charAt(i)==x[j].charAt(i)
  c+=1;
}
}
}
}
