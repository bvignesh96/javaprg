import java.util.*;
class firstrep
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter array size:");
int s=sc.nextInt();
int[] arr=new int[s];
System.out.println("enter elements:");
for(int i=0;i<s;i++)
  arr[i]=sc.nextInt();
for(int i=0;i<s;i++)
  for(int j=i+1;j<s;j++)
      if(arr[i]==arr[j])
      {
      System.out.println("first repeated number is:"+arr[i]);
      break;
      }
}
}
