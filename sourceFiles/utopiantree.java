import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution 
{
    static int getValues(int N, int value)
    {
        int index = N;
        int newIndex = 0;
        int current = value;

        if(index == 0)
        {
            return  current;
        } 
        else if( index > newIndex)
        { 
            if(current % 2 == 0) 
            {
                index--;
                return getValues(index, current + 1);
            }
            else
            {
                index--;
                return getValues(index, current * 2);
            }
        }
        return current;
    }
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int results;
	
        if(N <= 0) 
            return;  
        
        int[] inputs = new int[N];
	
        for(int i = 0; i < N; i++) {
            inputs[i] = in.nextInt();
        }
    
        for(int i = 0; i < N; i++) {
            System.out.println(getValues(inputs[i], 1));
        }

    }
}
