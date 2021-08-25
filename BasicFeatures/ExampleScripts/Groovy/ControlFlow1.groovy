/* if(boolean val){ // (1)when true; skips code block otherwise
    stmts;//(2a)
}

if(boolean val){ // (1)when true; runs (2b) code block otherwise
    stmts;//(2a)
}else {
    stmts; //(2b)
}

if(boolean val){ // (1)when true; runs next conditional code block.
    stmts;//(2a)
}else if(boolean val2){// second conditional code block
    stmts; 
}//... this line here may use another else-if, or else, or simply end.

int v = 5;
if(v>6){ // (1)when true; runs (2b) code block otherwise
    stmts;//(2a)
}else {
    stmts; //(2b)
}*/

int v =5;

boolean even = v>7?  println("v is greater than 7") :
                 println("v is less than or equal to 7 ");
                 
boolean evens = (7%2 == 0)? true: false;
                println("v is not equal");

println(evens);

int indicator = 560;
while(indicator >= 0){
    println("indicator value:\t"+indicator);
    indicator -= 20;// i++; i+=1, i = i+1, are indentical stmts
    }
