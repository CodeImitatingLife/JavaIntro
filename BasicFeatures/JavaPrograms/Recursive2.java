/**
   This program applies the functions of Recursive.java
   to array types.
 */

public class Recursive2{

    public static void main(String[] args){
	
        int num[] = {2, 3, 5, 7, 11, 13};
        
        int numSquared[] = xSquared(num);
        
        for(int i = 0; i < numSquared.length; i++)
        {
            System.out.println("numSquared " + (i+1) +" element:\t" +numSquared[i]);
        }
        
     // call a defined function.
        
    /*
	System.out.println(
	    distance(3.5,1.5,5.0, 2.0));*/
    }

    
    public static int[] xSquared(int[] x)
        {
        
        int xSquared[] = new int[x.length];
        
        for(int index = 0; index < x.length; index++)
            xSquared[index] = x[index] * x[index];
        
	return xSquared;
    }

    public static double 
	distance(double x1, double x2,
		 double y1, double y2)
    {
	double dist = Math.sqrt(
	  Math.pow(deltaX(x1, x2), 2)
	+ Math.pow( deltaY(y1, y2),2));

	return dist;
    }

    public static double 
	deltaX(double x1, double x2)
    {
	return (x2-x1);
    }

    public static double 
	deltaY(double y1, double y2)
    {
        return (y2-y1);
    } 
}
