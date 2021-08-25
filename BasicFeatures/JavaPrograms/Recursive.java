

public class Recursive{

    public static void main(String[] args){
	
	int num = 10;
	System.out.println("num =\t"
			   +num);
     // call a defined function
       
	int y = factorial(num);
	
	System.out.println(y);

	int val = 64;
	System.out.println(xSquared(val));
	System.out.println(
	    distance(3.5,1.5,5.0, 2.0));
    }

    /** This factorial function is a
	standalone procedure using 
	tail recursion.
    */
    public static int factorial(int x){

	System.out.println("Current"+
		 " state of x:\t" + x);
	if((x == 0)||(x == 1))
	    return 1;
	else
	    return x * factorial(--x);
    }

    public static int xSquared(int x){
	return x * x;
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
