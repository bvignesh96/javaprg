import java.util.*;
class arraysize
{
  public static void main(String[] args)
  {
Scanner sc=new Scanner(System.in);
System.out.println("Enter the array size:");
int s=sc.nextInt();
int[] arr=new int[s];
for(int i=0;i<s;i++)
  arr[i]=sc.nextInt();
for(int i=0;i<s;i++)
{
int c=0;
for(int j=0;j<s;j++)
{
  if(arr[i]==arr[j])
    c+=1;
}
if(c!=2)
    System.out.println(arr[i]+" is single");
}
}
}
