import java.util.*;
class subset
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter Array 1 & 2 size:");
int s1=sc.nextInt();int[] a1=new int[s1];
int s2=sc.nextInt();int[] a2=new int[s2];
System.out.println("enter Array 1 ele:");
for(int i=0;i<s1;i++)
  a1[i]=sc.nextInt();
  System.out.println("enter Array 2 ele:");
for(int i=0;i<s2;i++)
  a2[i]=sc.nextInt();
  int c=0;
for(int i=0;i<s1;i++)
  for(int j=0;j<s2;j++)
  if(a1[i]==a2[j])
  {
  c+=1;
  break;
  }
  if(c==s1)
    System.out.println("a1 is a subset of a2");
    else
    System.out.println("this is not a subset");
}
}
