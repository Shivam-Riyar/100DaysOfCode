import java.util.*;
class PeakElement
{
    public static void main(String[] args)
    {
    int[] ar = new int[20];
    int n,peak,flag = 0;
    Scanner sc = new Scanner(System.in);
    System.out.println("HOW MANY ELEMENTS IN ARRAY? ");
    n = sc.nextInt();
    for(int i = 0; i < n; i++)
    {
        ar[i] = sc.nextInt();
    }
    
    System.out.println("PEAK ELEMENTS IN THE GIVEN ARRAY IS : ");

    if(n == 0)
    {
        System.out.println("NO ELEMENTS IN THE ARRAY ");
        flag = 1;
    }
    else if(n == 1)
    {   peak = ar[0];
        System.out.println("BY DEFAULT (ONLY ELEMENT) : " +peak);
        flag = 1;

    }
    else
    {
    for(int i = 0; i < n; i++)
    {   
        if(i == 0 && ar[0] > ar[1])
        {   
            flag = 1;
            
            peak = ar[0];
            System.out.println(peak);
        }
        else if(i == n-1 && ar[n-1] > ar[n-2])
        {   peak = ar[n-1];
            System.out.println(peak);
            flag = 1;


        }
        else if(ar[i]>ar[i+1] && ar[i]>ar[i-1])
        {
            peak = ar[i];
            System.out.println(peak);
            flag = 1;

        }
    }   
    }
    if(flag == 0) 
        {    System.out.println("ALL ELEMENTS ARE EQUAL "); }
    }
}
