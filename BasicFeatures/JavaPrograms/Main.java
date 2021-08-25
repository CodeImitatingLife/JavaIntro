
public class Main{
    
    public static void main(String[] args){
    
    int input = 0;
        
    if(args.length > 0)
        input = Integer.parseInt(args[0]);
        
    System.out.println("The value entered when operated on yields:\t" + Aux.factorial(input));
    }
}
