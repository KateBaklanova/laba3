package Doggy;

public class Terrier extends Dog
{
    public void description()
    {
        System.out.println(getName() + " - just a small dog \n ");
    }

    public Terrier (String name, String breed, int age)
    {
        super(name, breed, age);
    }
}
