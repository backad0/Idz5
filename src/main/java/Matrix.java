import java.util.Arrays;

import static java.lang.Math.sqrt;

public class Matrix implements IMatrix {
    private double[] arr;

    Matrix(int size){
        this.arr = new double[size];
    }

    @Override
    public double getElem(int i, int j) {
        int index = (int) sqrt(arr.length);
        return arr[i*index+j];
    }

    @Override
    public void setElem(int i, int j, double newElem) {
        int index = (int) sqrt(arr.length);
        arr[i*index+j] = newElem;
    }

    @Override
    public double getDeterminant() {
        int index = (int) sqrt(arr.length);
        Matrix mt = this.getCopy();

        for (int i=0; i<index; i++){

            for (int x=0; x<index; x++){
                for (int y=0; y<index; y++){
                    this.setElem(x, y, mt.getElem(x, y));
                }
            }
            for (int j=i+1; j<index; j++){
                for (int k=i; k<index; k++){
                    double tmp = mt.getElem(j, k)-((mt.getElem(i, k)*this.getElem(j, i))/mt.getElem(i, i));
                    mt.setElem(j, k, tmp);
                }
            }

        }
        double result = 1;
        for (int x=0; x<index; x++){
            result = result*mt.getElem(x, x);
        }
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Matrix matrix = (Matrix) o;
        return Arrays.equals(arr, matrix.arr);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(arr);
    }

    public Matrix getCopy(){
        int index = (int) sqrt(arr.length);
        Matrix mt = new Matrix(index*index);
        for (int i=0; i<index; i++){
            for (int j=0; j<index; j++){
                mt.setElem(i, j, this.getElem(i, j));
            }
        }
        return mt;
    }
}
