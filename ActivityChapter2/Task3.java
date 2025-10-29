package ActivityChapter2;

class Task3 {
    public static void main(String[] args) {

        // Initialize strings
        String a = "wow";    
        String b = "wow!"; 
        String c = b;

        // Evaluate conditions
        boolean b1 = (a == "wow");             
        boolean b2 = c.equals(a + "!");    
        boolean b3 = !a.equals(b);         

        // Check all conditions
        if (b1 && b2 && b3) {
            System.out.println("Success!");
        }
    }
}
