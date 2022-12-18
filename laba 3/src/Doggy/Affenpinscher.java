package Doggy;

public class Affenpinscher extends Dog
{
    public void description()
    {
        System.out.println(getName() + " - conformation, Obedience, Agility, Barn Hunt\n" +
                "This ancient toy breed is fun-loving, loyal and fearless. He’s considered a hypoallergenic breed, so he could be a perfect companion for both people with and without allergies.\n");
    }

    public Affenpinscher (String name, String breed, int age)
    {
        super(name, breed, age);
    }
}
