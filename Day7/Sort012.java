import java.util.*;

class sortar012{

    static void sort012(int[] a, int n)
    {   
        int low, mid, high,temp;
        low = 0; mid = 0; high = n-1;
        while(mid<=high)
        {
            switch(a[mid]){
                case 0 : temp = a[low];
                         a[low] = a[mid];
                         a[mid] = temp;
                         low++;
                         mid++;
                         break;
                case 1 : mid++;
                         break;
                case 2 : temp = a[mid];
                         a[mid] = a[high];
                         a[high] = temp;
                         high--;
                         break;
            }
        }
        System.out.println("SORTED ARRAY : ");
        for(int i = 0; i < n; i++)
        {   System.out.print(a[i] + "  ");   }
    }


    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);       
        int[] ar = new int[30];
        int len, i;
        System.out.print("HOW MANY ELEMENTS IN THE ARRAY : ");
        len = sc.nextInt();
        System.out.print("ENTER ELEMENTS OF THE ARRAY (only 0,1,2): ");
        for(i = 0; i < len; i++)
        {   ar[i] = sc.nextInt();   }
        sort012(ar,len);
    }

}
