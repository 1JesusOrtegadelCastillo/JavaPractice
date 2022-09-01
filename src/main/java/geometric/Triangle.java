package geometric;

public class Triangle {

    public void drawHalfTriangle(int n){
        for (int row = 0; row < n ; row++) {
            for (int i = 0; i < row ; i++) {
                System.out.print("");
            }
            for (int i = n; i > n-row-1 ; i--) {
                System.out.print("♦");
            }
            System.out.println();
        }
    }

    public void drawFullTriangle(int size){
        for (int i=1; i<10; i += 2)
        {
            for (int k=0; k < (4 - i / 2); k++)
            {
                System.out.print(" ");
            }
            for (int j=0; j<i; j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

}
