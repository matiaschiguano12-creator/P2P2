package herencia.conceptos;

public class ClaseA {
    private int num1;
    private int num2;
    public ClaseA(int num1,int num2){
        System.out.println("Constructor ClaseA");
        this.num1=num1;
        this.num2=num2;
    }

    public int getNum2() {
        return num2;
    }

    public int getNum1() {
        return num1;
    }

    @Override
    public String toString() {
        return "Num1: " + num1 + ", Num2: " + num2;
    }
}
