import java.util.*;
class MaxMin{

    public static void findMaxMin(int[] ar, int n)
    {   
        int flagmax,flagmin ; 
        for(int i = 0 ; i < n ; i++)
        {   flagmax = 0;
            flagmin = 0;
            for(int  j = 0 ; j < n ; j++)
            {
                if(ar[i] >= ar[j])
                {
                    flagmax += 1;
                }
                if(ar[i] <= ar[j])
                {
                    flagmin += 1;
                }

            }
            if(flagmax == n )
            {
                System.out.println("MAX ELEMENT OF THE ARRAY : " +ar[i]);
            }
            if(flagmin == n )
            {
                System.out.println("MIN ELEMENT OF THE ARRAY : " +ar[i]);
            }
        }

    }
    
    public static void main(String[] args)
    {   
        
        int[] ar = new int[50];
        int n,i;
        Scanner sc = new Scanner(System.in);

        System.out.println("HOW MANY ELEMENTS IN THE ARRAY : ");
        n = sc.nextInt();
        System.out.println("ENTER ELEMENTS OF THE ARRAY : ");

        for(i = 0 ; i < n ; i++)
        {   ar[i] = sc.nextInt();     }
        findMaxMin(ar,n);
    }
}
