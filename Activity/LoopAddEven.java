package Activity;
//Tasksheet1-1-3 
public class LoopAddEven {
    public static void main(String[] args) {

        int check_number = 17; // Step 2: initialize variable
        String message;        // Step 3: declare String variable

        // Step 4–5: loop using check_number as condition
        for (int i = 1; i <= check_number; i++) {
            // check if number is even or odd using ternary operator
            message = (i % 2 == 0) ? i + " is even number" : i + " is odd number";
            
            // Step 6: print message value
            System.out.println(message);
        }
    }
}
