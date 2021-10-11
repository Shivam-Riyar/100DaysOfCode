import java.util.*;
class ReverseArray{
    
    static void reverseArray(int ar[], int len)
    {
        int[] revar = new int[len];
        int i,j;
        j = len;
        for(i = 0 ; i < len; i++)
        {
            revar[j-1] = ar[i];
            j = j - 1;
        }

        System.out.println("REVERSED ARRAY : ");
        for(i = 0 ; i < len ; i++)
        {
            System.out.print(revar[i]+ "  ");
        }
    }
    
    public static void main(String[] args)
    {   
        Scanner sc = new Scanner(System.in);
        int[] a = new int[30];
        int len;
        System.out.print("HOW MANY ELEMENTS IN THE ARRAY : ");
        len = sc.nextInt();
        System.out.println("ENTER THE ARRAY ELEMENTS : ");
        for(int i = 0 ; i < len ; i++)
        {   a[i]  = sc.nextInt();  }   
        reverseArray(a, len);
    }

 }

