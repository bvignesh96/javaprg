import java.lang.*;
import java.util.*;
class dup
{
public static void main(String[] args)
{
String output="";
Scanner sc=new Scanner(System.in);
System.out.println("enter the string:");
String s=sc.next();
TreeSet<String> ts=new TreeSet<String>();
for(int i=0;i<s.length();i++)
{
if(ts.add(s.charAt(i)+""))
output+=s.charAt(i);
}
System.out.println("without duolicate:"+output);
}
}
