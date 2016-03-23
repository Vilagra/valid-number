import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Vilagra on 23.03.2016.
 */
public class CheckNumberTest {

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void testCheckOnValidity() throws Exception {
        assertEquals(true ,CheckNumber.checkOnValidity("+380501234567"));
    }
    @Test
    public void testCheckOnValidity1() throws Exception {
        assertEquals(true ,CheckNumber.checkOnValidity("+38(050)1234567"));
    }
    @Test
    public void testCheckOnValidity2() throws Exception {
        assertEquals(true ,CheckNumber.checkOnValidity("+380-5012-34567"));
    }
    @Test
    public void testCheckOnValidity4() throws Exception {
        assertEquals(true ,CheckNumber.checkOnValidity("0501234567"));
    }
    @Test
    public void testCheckOnValidity5() throws Exception {
        assertEquals(true ,CheckNumber.checkOnValidity("050123-4567"));
    }
    @Test
    public void testCheckOnValidity6() throws Exception {
        assertEquals(false ,CheckNumber.checkOnValidity("+38)050(1234567"));
    }
    @Test
    public void testCheckOnValidity7() throws Exception {
        assertEquals(false ,CheckNumber.checkOnValidity("+38(050)1-23-45-6-7"));
    }
    @Test
    public void testCheckOnValidity8() throws Exception {
        assertEquals(false ,CheckNumber.checkOnValidity("050xxx4567"));
    }
    @Test
    public void testCheckOnValidity9() throws Exception {
        assertEquals(false ,CheckNumber.checkOnValidity("050123456"));
    }
    @Test
    public void testCheckOnValidity10() throws Exception {
        assertEquals(false ,CheckNumber.checkOnValidity("(0)501234567"));
    }
    @Test
    public void testCheckOnValidity11() throws Exception {
        assertEquals(true ,CheckNumber.checkOnValidity("(050)1234567"));
    }
    @Test
    public void testCheckOnValidity12() throws Exception {
        assertEquals(true ,CheckNumber.checkOnValidity("(050)12-34-567"));
    }



}