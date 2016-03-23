import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Vilagra on 23.03.2016.
 */
public class CheckNumberTest {

    @Test
    public void checkOnValidityTest1() {
        assertTrue(CheckNumber.checkOnValidity("+380501234567"));
    }
    @Test
    public void checkOnValidityTest2() {
        assertTrue(CheckNumber.checkOnValidity("+38(050)1234567"));
    }
    @Test
    public void checkOnValidityTest3(){
        assertTrue(CheckNumber.checkOnValidity("+380-5012-34567"));
    }
    @Test
    public void checkOnValidityTest4(){
        assertTrue(CheckNumber.checkOnValidity("0501234567"));
    }
    @Test
    public void checkOnValidityTest5(){
        assertTrue(CheckNumber.checkOnValidity("050123-4567"));
    }
    @Test
    public void checkOnValidityTest6(){
        assertFalse(CheckNumber.checkOnValidity("+38)050(1234567"));
    }
    @Test
    public void checkOnValidityTest7(){
        assertFalse(CheckNumber.checkOnValidity("+38(050)1-23-45-6-7"));
    }
    @Test
    public void checkOnValidityTest8(){
        assertFalse(CheckNumber.checkOnValidity("050xxx4567"));
    }
    @Test
    public void checkOnValidityTest9(){
        assertFalse(CheckNumber.checkOnValidity("050123456"));
    }
    @Test
    public void checkOnValidityTest10(){
        assertFalse(CheckNumber.checkOnValidity("(0)501234567"));
    }
    @Test
    public void checkOnValidityTest11(){
        assertTrue(CheckNumber.checkOnValidity("(050)1234567"));
    }
    @Test
    public void checkOnValidityTest12(){
        assertTrue(CheckNumber.checkOnValidity("(050)12-34-567"));
    }
    @Test
    public void checkOnValidityTest13(){
        assertFalse(CheckNumber.checkOnValidity(null));
    }
    @Test
    public void checkOnValidityTest14( ){
        assertFalse(CheckNumber.checkOnValidity("38(123)4567890")); //3 only with "+"
    }
    @Test
    public void checkOnValidityTest15( ){
        assertFalse(CheckNumber.checkOnValidity("8(123)4567890")); //8 only with +d8
    }

}