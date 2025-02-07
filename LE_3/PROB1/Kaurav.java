
public class Kaurav extends Bharatvanshi {
    String name;
    String cruel;
    boolean obedient;

    public Kaurav(String name, String cruel) {
        this.name = name;
        this.cruel = cruel;
        this.obedient = false; 
    }

    
    public void fight() {
        System.out.println(name + " fights fiercely.");
    }

    
    public void disobey() {
        System.out.println(name + " disobeys orders.");
    }

   
    public void cruel() {
        System.out.println(name + " is " + cruel + ".");
    }
}
