import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
static int lonelyinteger(int[] a) {

    Map<Integer, Integer> hash = new HashMap();
        
    for(int thisInt = 0; thisInt < a.length; thisInt++) 
    {   
        if(a.length == 1)
        {
          return a[thisInt];
        }     
        else if(hash.isEmpty())
	    {
		  hash.put(a[thisInt], 1);          
        }
        else if(!hash.containsKey(a[thisInt]))
        { 
          hash.put(a[thisInt], 1);
        }
        else
        {
          hash.put(a[thisInt], hash.get(a[thisInt])+1);
        }
	}    
      return getValue(hash);
}
    
static int getValue(Map<Integer, Integer> hash)
{
        int thisInt = 0;
    
        for (Map.Entry<Integer, Integer> entry : hash.entrySet()) {
        Integer key1 = entry.getKey();
        Integer value = entry.getValue();
        
        if(value == 1)
        {
          thisInt = key1;
        }
      } 
        return thisInt;
}
public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int res;
        
        int aSize = Integer.parseInt(in.nextLine());
        int[] intArray = new int[aSize];		
        int _a_item;
		
        String next = in.nextLine();
        String[] next_split = next.split(" ");
        
        for(int i = 0; i < aSize; i++) {
		
            _a_item = Integer.parseInt(next_split[i]);
            intArray[i] = _a_item;
        }
        
        res = lonelyinteger(intArray);
        System.out.println(res);
        
    }
}
