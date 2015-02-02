import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int getValues(int N)
    {
        int newHeight = N;
        int newHeight2 = 0;
        int current = 0;
        
        for(int i = 0; i <= newHeight; i++) 
        {        
            if(i == 0){
                newHeight2 = 1; 
                current = 1;
            } 

            else if(current % 2 == 0) {
                newHeight2 = current + 1;
                current = newHeight2;
            }
                
            else
            {
                newHeight2 = current * 2; 
                current = newHeight2;
            }
        }
        return newHeight2;
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
            System.out.println(getValues(inputs[i]));
        }

    }
}