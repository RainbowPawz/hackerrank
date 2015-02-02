import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int getValue(String value)
    {
        char[] charArray = value.toCharArray();
        int count = 0;
    
        for(int i = 0; i < charArray.length - 1; i++)
        {
            if(charArray[i]==charArray[i+1]) count++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        
        int key = 0;
        String next = in.nextLine();
        
        Map<Integer, String> hash = new HashMap();
	
        if(N <= 0)
            return;
        
        for(int i = 0; i < N; i++) {        
            String nextVal = in.nextLine();        
            hash.put(key++, nextVal);
        }
      
        for (Map.Entry<Integer, String> entry : hash.entrySet()) {
            String value = entry.getValue(); 
        
            System.out.println(getValue(value));
        }      
    }
}
