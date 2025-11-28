public class Task12 {
    public static void main(String[] args) {
        Point p = new Point(32, 32);
        for (int i = 0; i < 5; i++) {
            p.scale(0.5); 
            p.print();
        }
    }
}
class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void print() {
        System.out.println("(" + x + ", " + y + ")");
    }

    // Your new method goes here
    public void scale(double factor) {
        this.x = this.x * factor;
        this.y = this.y * factor;
    }
}
