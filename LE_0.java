
public class Juet
{   	String name;
	    int age;
	    String getName()
	    {
	       return this.name;
	        
	    }
	     int  getAge()
	    {
	        return this.age;
	    }
	    void setName(String name)
	    {
	        this.name = name;
	    }
	    void setAge(int age)
	    {
	        this.age = age;
	    }
	public static void main(String[] args) {
	    Juet m1 = new Juet();
	    m1.setAge(20);
	    m1.setName("Aryan Pareek");
	    System.out.println(m1.getName() + " "+ m1.getAge());

	}
}
