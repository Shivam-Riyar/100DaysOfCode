import java.util.*;

class findKthElement{

    static void findk(int[] a, int n, int k){
        int temp;
        for(int i = 0; i < n ; i++)
        {  for(int j = i+1 ; j < n ; j++) 
        {   if(a[i] >= a[j])
            {   temp = a[i];
                a[i] = a[j];
                a[j] = temp;   }
        }}
        System.out.println("SMALLEST " +k+ "th ELEMENT IS : " +a[k]);
    }

    public static void main(String[] args)
    {   
        Scanner sc = new Scanner(System.in);       
        int[] ar = new int[30];
        int len, pos, i;
        System.out.print("HOW MANY ELEMENTS IN THE ARRAY : ");
        len = sc.nextInt();
        System.out.print("ENTER ELEMENTS OF THE ARRAY : ");
        for(i = 0; i < len; i++)
        {   ar[i] = sc.nextInt();   }
        System.out.print("ENTER THE VALUE OF 'K' : ");
        pos = sc.nextInt();
        findk(ar,len,pos);
    }

}
