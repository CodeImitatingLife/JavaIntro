// Comments allow us to make notes in our programs without affecting the code 
// and its behavior. To comment the remainder of the line, use 2 forward slashes 
// back-to-back without skipping any spaces. What you are  reading right now is
// a comment, for instance.

class VarPrint { // "Hello" is a class.

    public static void main(String[] args) {
	byte byteSize = 73;
	short shortVal = 15;
	int intVal = 1000;
	long longVal = 60000L;
	float fPoint= 3.14f;
	double dVal = 2.71828182845;
	boolean truth = false;
	char huh = '?';

	  System.out.println("Hello!");
	  System.out.println("Here's " 
          +"the data you requested:\t"
	  + byteSize+ "\n"
	  + shortVal+ "\n"
	  + intVal+ "\n"
	  + longVal+ "\n"
	  + fPoint+ "\n"
	  + dVal+ "\n"
	  + truth+ "\n"
	  + huh);

	  int igroup[] = {1, 2, 3, 5};
	 System.out.println(igroup[0]);
	 System.out.println(igroup[1]);
	      
	 System.out.println(igroup[2]);
	 
	 System.out.println(igroup[3]);
	
    }// end of main function.

}// end of class "Hello".
