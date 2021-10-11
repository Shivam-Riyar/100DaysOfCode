import java.util.*;
import java.io.*;

class ReverseString{
    static void stringReverse(String s, int len){
                     
        System.out.println("REVERSE STRING : ");
        for(int i = len-1 ; i >= 0 ; i--)
        {
            System.out.print(s.charAt(i));
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER A STRING : ");
        String str = sc.nextLine();
        int len = str.length();
        stringReverse(str,len);
    }
}
