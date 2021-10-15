import java.util.*;
class SubArraySum{
    static void checkSum(int[] a, int n, int s)
    {
        int beg=0,end=0,i,j,flag=0,t=0;
        for(i=0;i<n;i++)
        {   for(j=i;j<n;j++)  
            {   if(t < s)
                {   t += a[i]; }
                if(t == s)
                {    beg = i; end = j-1 ; flag =1; break;    }
                if(j == n-1)
                {  t = 0;  }
            }
            if(flag == 1)
                {   break;  }
        }
        if(flag == 1)
        {System.out.println("SUM OF ELEMENTS FROM POSITION " +beg+ " TO " +end+ " IS : " +t);}
        else
        {System.out.println("NO SUCH COMBINATION EXISTS!!!");}
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);       
        int[] ar = new int[30];
        int len, sum, i;
        System.out.print("HOW MANY ELEMENTS IN THE ARRAY : ");
        len = sc.nextInt();
        System.out.print("ENTER ELEMENTS OF THE ARRAY : ");
        for(i = 0; i < len; i++)
        {   ar[i] = sc.nextInt();   }
        System.out.print("ENTER THE SUM : ");
        sum = sc.nextInt();
        checkSum(ar,len,sum);
    }
}
