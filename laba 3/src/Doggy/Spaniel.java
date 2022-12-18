package Doggy;

public class Spaniel extends Dog {

        public void description()
        {
            System.out.println(getName() + " - a hunter's companion bred to find, flush, and fetch game, the spaniel's exact origin is unknown. \n ");
        }

        public Spaniel (String name, String breed, int age)
        {
            super(name, breed, age);
        }
    }
