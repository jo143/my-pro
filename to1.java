import java.util.*;
public class to1 {
    public static void main(String[] args) {
        int r,i,j,c,temp,k = 0;
        int[] arr=new int[100];
        int[][] arr1=new int[10][10];
Scanner ob=new Scanner(System.in);  
        
 r=ob.nextInt();
c=ob.nextInt();
for(i=0;i<c*r;i++)
arr[i]=ob.nextInt();
for(i=0;i<r*c;i++)
for(j=i+1;j<r*c;j++)
if(arr[i]>arr[j])
{
temp=arr[i];
arr[i]=arr[j];
arr[j]=temp;
}
for(i=0;i<r;i++)
for(j=0;j<c;j++)
{
arr1[i][j]=arr[k];
k++;
}
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
    System.out.print(arr1[i][j]+" ");
}
    System.out.println("");
    }
}}
