package pack1;

public interface MyInterface {
    void say(); 

    default void greet() {
        System.out.println("Default greet method from interface");
    }

    static void welcome() {
        System.out.println("Static welcome method from interface");
    }
}
