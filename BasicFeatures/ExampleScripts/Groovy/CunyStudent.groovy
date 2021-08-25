class CunyStudent{ // definition for CUNY Students.

String name;
int emplID;
}

CunyStudent cStud1 = new CunyStudent();
CunyStudent vStud = new CunyStudent();

println("The details for  cStud1 are:\t" + cStud1.name + ' ' 
        +cStud1.emplID+'.');
        
cStud1.name = "First Last";
vStud.name = "Visitor Temp";
        
println("The details for  cStud1 are:\t" + cStud1.name + ' ' 
        +cStud1.emplID+'.');
        
println("The details for  cStud1 are:\t" + vStud.name + ' ' 
        +vStud.emplID+'.');
        
// Object.property : This is our object-property notation