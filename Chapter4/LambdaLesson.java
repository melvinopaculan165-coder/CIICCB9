package Chapter4;

import java.util.*;
import java.util.function.Predicate;
public class LambdaLesson {

    static void print(List<Animal> animals,Predicate<Animal> checker){
        for(Animal animal: animals){
            if( checker.test(animal)){
                System.out.print(animal+", ");
            }
        }
        System.out.println("*************");
    }
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<Animal>();
        animals.add(new Animal("Fish", false, true,1));
        animals.add(new Animal("Kangaroo", true, false,5));
        animals.add(new Animal("Rabbit", true, false,2));
        animals.add(new Animal("Trutle", false, true,10));
        animals.add(new Animal("Frog", true, true,2));
        animals.add(new Animal("Kaola", false, false,6));
        // print(animals, new CheckIfHopper());
        // print(animals, new CheckIfSwimmer());
        print(animals, a->a.canSwim());
        print(animals, a->a.canHop());
        print(animals, a->(a.canHop() && a.canSwim()));
        print(animals, a->(!a.canHop() && !a.canSwim()));
        print(animals, a->a.getAge()>3);
        NumbersIntInterface ni = (x,y,z)->{return x+y+z;};
        System.out.println(ni.aPlusB(3, 2, 1)); 
        DiscountItems tenPercent = (y)-> y-(0.10*y);
        DiscountItems twentyPercent = (y)-> y-(0.20*y);
        DiscountItems fiftyPercent = (y)-> y-(0.50*y);
        double backKick = 100_000;
        System.out.println(tenPercent.dc(backKick));
        System.out.println(twentyPercent.dc(backKick));
        System.out.println(fiftyPercent.dc(backKick));
        System.out.println(animals.removeIf(a->a.canSwim()));
        System.out.println(animals);
        
    }
    
}

class Animal{
    private String species;
    private boolean canHop;
    private boolean canSwim;
    private int age;
    public Animal(String speciesName,boolean hopper,boolean swimmer,int age){
        species = speciesName;
        canHop = hopper;
        canSwim = swimmer;
        this.age = age;
    }
    public boolean canHop(){ return canHop;}
    public boolean canSwim(){ return canSwim;}
    public int getAge(){ return age;}
    public String toString(){ return species;}
}

interface NumbersIntInterface {
    int aPlusB(int x, int y, int z);
    
}
interface DiscountItems{
    double dc(double q);
}