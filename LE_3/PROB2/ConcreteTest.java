public class ConcreteTest extends AbsTest {
    @Override
    public void display() {
        System.out.println("Displaying from ConcreteTest class.");
    }

    public static void main(String[] args) {
        ConcreteTest concreteTest = new ConcreteTest();
        concreteTest.display();
    }
}
