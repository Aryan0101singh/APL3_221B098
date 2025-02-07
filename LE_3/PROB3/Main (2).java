/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/

public class Main {
    public static void main(String[] args) {
        
        RubberDuck rubberDuck = new RubberDuck();
        WoodenDuck woodenDuck = new WoodenDuck();
        RedHeadDuck redHeadDuck = new RedHeadDuck();
        LakeDuck lakeDuck = new LakeDuck();

        
        System.out.println("Rubber Duck:");
        rubberDuck.swim();
        rubberDuck.squeak();

        
        System.out.println("\nWooden Duck:");
        woodenDuck.swim();
        woodenDuck.mute();

        
        System.out.println("\nRedHead Duck:");
        redHeadDuck.swim();
        redHeadDuck.fly();
        redHeadDuck.quack();

        
        System.out.println("\nLake Duck:");
        lakeDuck.swim();
        lakeDuck.fly();
        lakeDuck.quack();
    }
}
