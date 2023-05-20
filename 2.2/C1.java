import java.util.Scanner;

public class C1 {
    private  int x;
    private int y;

    public void read(){
        Scanner myscan = new Scanner(System.in);
         x =myscan.nextInt();
         y = myscan.nextInt();
    }

    public C1(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public C1() {
    }

    public int getSum(){
        return x+y;
    }
}
