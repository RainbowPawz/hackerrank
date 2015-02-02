import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

   static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

   static int[] getIntegerArray(String[] nextSplit, int size)
   {          
        int[] array = new int[size];
        int index = 0;
   
        for(String value : nextSplit) {		
            array[index++] = Integer.parseInt(value);         
        }

       return array;

   }
   
   static Map<String, Integer> getHash(String[] a) 
   {
        Map<String, Integer> hash = new HashMap();

        for(String value : a) 
        {   
            if(hash.containsKey(value))
            { 
              hash.put(value, hash.get(value) + 1 );
            }
            else
            {
                hash.put(value, 1);
            }
	   }    
       return hash;
    }
    
    static ArrayList<String> getValue(Map<String, Integer> hash, Map<String, Integer> hash2)
    {
        ArrayList<String> missingNumbersList = new ArrayList<String>();
        
        for (Map.Entry<String, Integer> entry : hash2.entrySet()) {
            
            String value = entry.getKey();
            
            if(hash.get(value) - hash2.get(value) < 0)                
            {   
                missingNumbersList.add(value);
            }
         }       
        
         Collections.sort(missingNumbersList);
         return missingNumbersList;
    }
    
    public static void main(String[] args) throws NumberFormatException,Exception
    {
        int sizeA = Integer.parseInt(input.readLine());
        String[] nextSplitA = input.readLine().split(" ");                          
         
        int sizeB = Integer.parseInt(input.readLine());
        String[] nextSplitB = input.readLine().split(" ");  
                      
        ArrayList<String> result = getValue(getHash(nextSplitA), getHash(nextSplitB));

        for(String thisInt : result) 
        {                           
            System.out.print(thisInt + " "); 
        }
    }
}
