import org.junit.Test;

import static org.junit.Assert.*;

public class MatrixTest {

    @Test
    public void getElem1() {
        Matrix mat = new Matrix(16);
        mat.setElem(3,3, 4);
        assertEquals(mat.getElem(3,3), 4, 0);
    }

    @Test
    public void setElem() {
    }
}
