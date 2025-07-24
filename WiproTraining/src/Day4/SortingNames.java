package Day4;
import java.util.Scanner;

public class SortingNames {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of names: ");
        int n = sc.nextInt();
        sc.nextLine();
        String[] names = new String[n];
 
        for (int i = 0; i < n; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = sc.nextLine();
        } 
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (names[j].compareToIgnoreCase(names[j + 1]) > 0) {
                  
                    String temp = names[j];
                    names[j] = names[j + 1];
                    names[j + 1] = temp;
                }
                }
        }
        System.out.println("\nSorted Names:");
        for (String name : names) {
            System.out.println(name);
        }
        sc.close();
    }
}
