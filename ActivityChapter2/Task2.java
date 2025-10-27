package ActivityChapter2;

public class Task2 {
    public static void main(String[] args) {
        // Create all primitive types (except long and double)
        byte b = 0;
        short s = 3110;
        int i = 2;
        float f = 2.0f;
        char c1 = 'H';
        char c2 = 'w';
        boolean bool = true;

        // Concatenate into a single string
        String output = c1 + "" + s + " " + c2 + "0r1d " + f + " " + bool;

        // Print result
        System.out.println(output);
    }
}
