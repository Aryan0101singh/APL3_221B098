public class Pandav extends Bharatvanshi {
    String name;
    String kind;
    boolean obedient;

    
    public Pandav(String name, String kind) {
        this.name = name;
        this.kind = kind;
        this.obedient = true; 

   
    public void fight() {
        System.out.println(name + " fights bravely.");
    }

   
    public void obey() {
        System.out.println(name + " obeys orders.");
    }

    
    public void kind() {
        System.out.println(name + " is " + kind + ".");
    }
}
