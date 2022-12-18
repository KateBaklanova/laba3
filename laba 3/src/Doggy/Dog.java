package Doggy;

public abstract class Dog {
    private String name;
    private String breed;
    private int age;


    public String getName() { return name; }
    public String getBreed() { return breed; }
    public int getAge () {return age; }

    public Dog (String name, String breed, int age)
    {
        this.name =name;
        this.breed = breed;
        this.age = age;
    }

    public abstract void description();

    public static void main(String args[])
    {
        Affenpinscher d1 = new Affenpinscher("Pes", "American", 3);
        Terrier d2 = new Terrier("Terry", "British", 1);
        Spaniel d3 = new Spaniel("Sus", "American", 7);

        System.out.println("\n");

        d1.description();
        d2.description();
        d3.description();
    }

}




