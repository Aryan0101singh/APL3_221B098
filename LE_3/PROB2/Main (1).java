/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main {
    public static void main(String[] args) {
       
        Test test = new Test();
        System.out.println("Calling display() from Test class:");
        test.display();  

       
        ConcreteTest concreteTest = new ConcreteTest();
        System.out.println("\nCalling display() from ConcreteTest class:");
        concreteTest.display();  
    }
}
