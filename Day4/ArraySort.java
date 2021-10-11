import java.io.*;
import java.util.*;

class ArraySort{
    
    static void arrsort(int[] a, int n){
        int temp;
        for(int i = 0; i < n ; i++)
        {  for(int j = i+1 ; j < n ; j++) 
        {   if(a[i] >= a[j])
            {   temp = a[i];
                a[i] = a[j];
                a[j] = temp;   }
        }}
        System.out.println("SORTED ARRAY : ");
        for(int i = 0; i < n; i++)
        {   System.out.print(a[i] + "  ");  }
    }
    
    public static void main(String[] args)
    {   
        Scanner sc = new Scanner(System.in);
        int[] ar = new int[30];
        System.out.print("HOW MANY ELEMENTS IN THE ARRAY : ");
        int n = sc.nextInt();
        System.out.println("ENTER ELEMENTS IN THE ARRAY : ");
        for(int i = 0 ; i < n ; i++)
        {   ar[i] = sc.nextInt();   }
        arrsort(ar,n);
    }
}
