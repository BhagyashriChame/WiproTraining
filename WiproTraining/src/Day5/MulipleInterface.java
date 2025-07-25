package Day5;
interface Printable {
    void display(); 
}

interface Showable {
    void display(); 
}

class MulipleInterface implements Printable, Showable {
   
    public void display() {
        System.out.println("Displaying content from both interfaces.");
    }

    public static void main(String[] args) {
        MulipleInterface obj = new MulipleInterface();
        
        obj.display(); 
        
        
        Printable p = obj;
        Showable s = obj;

        p.display();
        s.display();
    }
}
