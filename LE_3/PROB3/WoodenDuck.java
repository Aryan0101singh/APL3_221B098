public class WoodenDuck implements Swimmable, Muteable {
    @Override
    public void swim() {
        System.out.println("Wooden Duck swims.");
    }

    @Override
    public void mute() {
        System.out.println("Wooden Duck is mute.");
    }
}
