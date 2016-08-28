import java.util.*;
class square
{
public static void main(String[] args)
{
Scanner sc=new Scanner(Sytem.in);
  System.out.println("Enter the points for square:");
  int[] arr=new int[8];
  for(int i=0;i<8;i++)
    arr[i]=sc.nextInt();
    if((arr[3]-arr[1])==(arr[5]-arr[7])==(arr[4]-arr[2])==(arr[6]-arr[0]))
        System.out.println("Square");
    else
        System.out.println("Not a square");
}
}
