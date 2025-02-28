public class Singleton
{
    int x=0;
    private Singleton()
    {
        x++;
        System.out.print(x);
    };
    private static Singleton uniqueInstance=new Singleton();
    public static Singleton getInstance()
    {
        return uniqueInstance;
    }
}