package ma.enset;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import ma.Calculator;

 public class CalculatorTest {
    private  Calculator calculator;
    @BeforeEach
   public void setUp() {
      calculator = new Calculator();
    }

    @AfterEach
public void tearDown() {
      calculator = null;
    }

    @Test
  public void testAddTwoPositiveNumbers() {
    //given
    int a = 2;
    int b = 3;
    //when
    int result = calculator.add(a,b);
    //then
    assertThat(result).isEqualTo(5);
       
    }

    @Test
    public void testAddTwoNegativeNumbers() {
      //given
      int a = -2;
      int b = -3;
      //when
      int result = calculator.add(a,b);
      //then
      assertThat(result).isEqualTo(-5);
      }

      @Test
      public void testAddTwoNegativeAndPositiveNumbers() {
        //given
        int a = -2;
        int b = 3;
        //when
        int result = calculator.add(a,b);
        //then
        assertThat(result).isEqualTo(1);
        }

        @Test
        public void testMultiplyPositiveNumbers(){
            //given
            int a = 3;
            int b = 2; 
            //when
            int result = calculator.multiply(a,b);
            //then
            assertThat(result).isEqualTo(6);
        }

    
        
}
