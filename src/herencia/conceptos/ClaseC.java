package herencia.conceptos;

public class ClaseC extends ClaseB {
    private int num4;
    public ClaseC(int num1,int num2,int num3,int num4){
        super(num1,num2,num3);
        System.out.println("Constructor ClaseC");
        this.num4=num4;
    }

    @Override
    public String toString() {
        return "Num1: " + getNum1() + ", \nNum2: " + getNum2()+ ", \nNum3: " + getNum3() + ", \nNum4: " + num4;
    }
}
