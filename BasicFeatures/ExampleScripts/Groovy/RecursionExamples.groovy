/****** Recursion Statements ******/

int factorial(int a){
    if((a==0)||(a==1))
        return 1;
    else
        return a * factorial(a-1); // tail recursion.
}// end of method and all of its local variables

println(factorial(6) + '\n');

/* Loops generally consist of 3 main phases:
    1. Intialization; setup and other initial conditions.
    2. Test conditions/comparison
    3. Update counters.
*/

// for(initial setup; test condition; updates)
for(/* setup: */int i = 0;/* test: */ i<5;/* update: */ i++)
    println("This is iteration number "+ (i+1));
    
// int i as declared in the above loop no longer exists.

int j = 0; // inital setup for while-loop equivalent.

while(j<5){// does the same as the above for loop.
    println("This is iteration number "+ (j+1));
    j++;
}

/* 
    j still exits and retains any alterations
   the from previous while-loop.
*/

do {// always executes at least once.
    println("Iteration continues with case number "+ (j+1));
    j++;
}while(j<10); // test condition for continuing the loop.

/* 
   j still exits and retains any alterations
   the from previous do-while-loop.
*/
