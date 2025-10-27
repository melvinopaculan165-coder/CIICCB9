package ActivityChapter1;
//Tasksheet1-1-3

public class LoopAddEven {
    public static void main(String[] args) {

        int check_number = 20; // Step 2: initialize variable
        String message;        // Step 3: declare String variable

        for (int i = 1; i <= check_number; i++) { // Step 4–5: loop using check_number as condition
            message = (i % 2 == 0) ? i + " is even number" : i + " is odd number"; // check if number is even or odd using ternary operator
            System.out.println(message); // Step 6: print message value
        }
    }
}
