package Exercise3;

public class Square {

    private float a;

    public void displayA(){
        System.out.println("Độ dài cạnh a là: " + a);
    }

    public void displayC() {
        System.out.println("Chu vi: " + a*4);
    }

    public void displayS() {
        System.out.println("Diện tích: " + a*a);
    }

    public void displayAll() {
        displayA();
        displayC();
        displayS();
    }

    public void setA(float a) {
        this.a = a;
    }
}
