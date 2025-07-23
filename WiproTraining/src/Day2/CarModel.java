package Day2;

class CarModel1 {

    private String modal;
    private int year;

    public void setModal(String modal, int year) {
        this.modal = modal;
        this.year = year;
    }

    public String getModal() {
        return modal;
    }

    public int getYear() {
        return year;
    }

    public static void main(String[] args) {
        CarModel1 c = new CarModel1(); // Correct object creation
        c.setModal("Audi", 2000);
        System.out.println("Model Name: " + c.getModal());
        System.out.println("Model Year: " + c.getYear());
    }
}
