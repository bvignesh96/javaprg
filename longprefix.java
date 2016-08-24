class longprefix
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
system.out.prinln("enter the 10 string:");
String[] x=new String[10];
int maxlen=0;
for(int i=0;i<10;i++)
  {
  x[i]=sc.next();
  if(x[i].length()>maxlen)
    maxlen=i;
  }
  String s=x[maxlen];
  int c=0;
  for(int i=0;i<s.length();i++)
  {
    for(int j=0;j<x.length;j++)
    {
    if(s.charAt(i)==x[j].charAt(i) && s!=x[j])
      {
        c+=1;
      }
    }
  }
  System.out.println("long prefix is "+s.substring(0,c+1));
}
}
