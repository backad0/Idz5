import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Matrix mat = new Matrix(9);
        double elem;
        System.out.println();
        for (int i = 0; i<3 ; i++ ){
            for (int j = 0; j<3; j++){
                elem = in.nextDouble();
                mat.setElem(i,j,elem);
                System.out.print(mat.getElem(i, j));
                System.out.print(" ");
            }
            System.out.println();
        }
        mat.test();
        Matrix mt = mat.getCopy();
        for (int i = 0; i<3 ; i++ ){
            for (int j = 0; j<3; j++){
                System.out.print(mt.getElem(i, j));
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println(mat.getDeterminant());
        for (int i = 0; i<3 ; i++ ){
            for (int j = 0; j<3; j++){
                System.out.print(mat.getElem(i, j));
                System.out.print(" ");
            }
            System.out.println();
        }
        mat = mt.getCopy();
    }
}
