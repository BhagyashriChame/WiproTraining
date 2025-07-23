package Day1;

public class Staticmethod {
    public static int add(int x, int y) {
        return x + y;
    }
}
class Staticmethod1 {
    public static void main(String[] args) {
        int sum = Staticmethod.add(5, 7);  
        System.out.println("Sum: " + sum); 
}
}