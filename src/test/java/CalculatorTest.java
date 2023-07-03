import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest
{
        Calculator calculator;
        @BeforeAll
        public static void beforeAll(){
            System.out.println("");
        }

    @BeforeEach
    public void setUp(){
        System.out.println("");
        calculator = new Calculator();
    }
    @Test
    public void checkSum(){

        double result = calculator.sum(4.5,2.3);
        Assertions.assertEquals(6.8,result,"Rezultat incorect");
    }
    @Test
    public void checkMultiply(){

        double result = calculator.multiply(4,3);
        Assertions.assertEquals(12,result,"Rezultat incorect");
    }
    @Test
    public void checkDivide(){

        double result = calculator.rest(10,3);
        Assertions.assertEquals(1,result,"Rezultat incorect");
    }
    @Test
    public void checkCat(){

        double result = calculator.cat(12,3);
        Assertions.assertEquals(4,result,"Rezultat incorect");
    }

    @Test
    public void checkDif(){
            double result = calculator.dif(8,4);
            Assertions.assertEquals(4,result,"Rezultat incorect");
    }
}
