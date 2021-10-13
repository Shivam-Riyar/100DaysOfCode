import java.util.*;

class FindFrequency{
    static void findFreq(int[] a, int n, int x)
    {   int fr = 0;
        for(int i = 0; i < n ; i++)
        {   if(a[i] == x)
            {   fr++;  }   }
        
        System.out.println("THE FREQUENCY OF ELEMENT - " +x+ " IN THE ARRAY IS : " +fr);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);       
        int[] ar = new int[30];
        int len, x, i;
        System.out.print("HOW MANY ELEMENTS IN THE ARRAY : ");
        len = sc.nextInt();
        System.out.print("ENTER ELEMENTS OF THE ARRAY : ");
        for(i = 0; i < len; i++)
        {   ar[i] = sc.nextInt();   }
        System.out.print("ENTER THE VALUE OF AN ELEMENT : ");
        x = sc.nextInt();
        findFreq(ar,len,x);
    }
}
