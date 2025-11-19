package otherFolder;

import java.util.ArrayList;
import java.util.List;

public class LawnSharkApp {
    public static void main(String[] args) {
        Lawner user1 = new Lawner("Marc", "near SM fairview", 142_000, 12);
        user1.setName("Marco");
        System.out.println(user1.getName());
        List<Lawner> lawners = new ArrayList<>();
        lawners.add(user1);
        lawners.add(new Lawner("Sal d co", "East Blue", 44_000_000_000L, 4));
        System.out.println(lawners);
    }
    
}


class Lawner{
    private String name;
    private String address;
    private double lawnAmount;
    private float lawnInterest;

    Lawner(String name, String address, double lawnAmount, float lawnInterest){
        this.name = validateString(name);
        this.address = validateString(address);
        this.lawnAmount = validateNumber(lawnAmount);
        this.lawnInterest = (float)validateNumber(lawnInterest);
    }
    String validateString(String word)throws RuntimeException{
        if(word.length()<=1)
            throw new RuntimeException("invalid length of character");
        return word;

    }
    double validateNumber(double number)throws RuntimeException{
        if(number<=0)
            throw new RuntimeException("invalid amount");
        return number;

    }
    
    void setName(String name) {
        this.name = validateString(name);  
    }
    void setAddress(String address) {
        this.address = validateString(address);  
    }
    void setLawnAmount(double lawnAmount){
        this.lawnAmount = validateNumber(lawnAmount);
    }
    void setLawnInterest(float lawnInterest){
        this.lawnInterest = (float)validateNumber(lawnInterest);
    }
    String getName() {
        return name;  
    }
    public String toString(){
        return "\nName:"+name+"\nAmount:"+lawnAmount;
    }


}
