package Chapter1;

public class Scope {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        File one, two;
        one = new File ("a");
        two = new File ("b");
        one = two;
        File three = one;
        one = null;
    }
}

class File {
    String location;
    File(String location) {
        this.location = location;
    }
}
