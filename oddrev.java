import java.util.*;
class oddrev
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the line of text:");
String s=sc.next();
String[] sp=s.split(" ");
String output="";
for(int i=0;i<sp.length;i++)
{
if((i%2)==0)
  {
    StringBuffer sb=new StringBuffer(sp[i]);
    output+=sb.reverse()+" ";
  }
  else
      output+=sp[i]+" ";
}
System.out.println("output:"+output);
}
}
