package Day1;
class NonStaticmethod1 {
    int count = 0;  

    public void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}
public class NonStaticmethod {
    public static void main(String[] args) {
        NonStaticmethod1 c1 = new NonStaticmethod1();
        NonStaticmethod1 c2 = new NonStaticmethod1();

        c1.increment();  
        c2.increment();  
        c2.increment();  

        System.out.println("c1 count: " + c1.getCount());  
        System.out.println("c2 count: " + c2.getCount());  
    }
}
