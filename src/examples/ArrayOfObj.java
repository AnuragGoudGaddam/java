package examples;

import java.util.Arrays;

public class ArrayOfObj {

	public static void main(String[] args) {
		int [] a= {2,9,11,12};
		int [] b= {1,8,10,12};
        int[] c = new int[a.length+b.length];	     		
        int x =0;
        for(int i=0;i<a.length;i++)
        {
        	if(a[i]<b[i])
        	{
        		c[x]=a[i];
        		x++;
        		c[x]=b[i];
        		x++;
        	}
        	else {
        		c[x]=b[i];
        		x++;
        		c[x]=a[i];
        		x++;
        	}
        	
        	
        }
        
        System.out.println(Arrays.toString(c));
     
         
	}

}
