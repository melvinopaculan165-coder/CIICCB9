package Chapter1;

public class Constructor1Lesson1 {
    public static void main(String[] args) {
        Chicken c1 = new Chicken();
        Chicken c2 = new Chicken();
        
        System.out.println("Chicken 1 name: " + c1.name);
        System.out.println("Chicken 2 name: " + c2.name);
    }
}

class Chicken {
    int numEggs = 0;
    String name;

    public Chicken() {
        name = "Duke";
    }
}

class Swan {
    int numberEggs;

    public static void main(String[] args) {
        Swan mother = new Swan();
        mother.numberEggs = 1; // writing object field
        System.out.println("Swan number of eggs: " + mother.numberEggs); // reading object field
    }
}

class Name {
    String first = "Marc";
    String last = "Yim";
    String full = first + " " + last; // added space for readability

    public static void main(String[] args) {
        Name name1 = new Name();
        System.out.println("Full name before change: " + name1.full);

        // Update first and last name
        name1.first = "Anton";
        name1.last = "Racal";
        name1.full = name1.first + " " + name1.last; // update full name after change

        System.out.println("Full name after change: " + name1.full);
    }
}
