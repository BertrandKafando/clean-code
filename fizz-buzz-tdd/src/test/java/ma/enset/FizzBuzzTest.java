package ma.enset;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
public class FizzBuzzTest {

    private FizzBuzz fizzBuzz;

    @BeforeEach
    public void setUp() {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    void  fb_of_0_should_return_0(){

        String result = fizzBuzz._of(0);

        assertThat(result).isEqualTo("0");
    }

    @Test
    void fb_of_1_should_return_1(){
        String result =  fizzBuzz._of(1);

        assertThat(result).isEqualTo("1");
    
    }

    @Test
    void fb_of_3_should_return_Fizz(){
        String result = fizzBuzz._of(3);
        
        assertThat(result).isEqualTo("Fizz");
    }

    @Test
    void fb_of_5_should_return_Buzz(){
        String result = fizzBuzz._of(5);
        
        assertThat(result).isEqualTo("Buzz");
    }
    
    @Test
    void fb_of_6_should_return_Fizz(){
        //given
        int number = 6;
        //when
        String result = fizzBuzz._of(number);
        //then
        assertThat(result).isEqualTo("Fizz");
    }

    @Test
    void fb_of_10_should_return_Buzz(){
        //given
        int number = 10;
        //when
        String result = fizzBuzz._of(number);
        //then
        assertThat(result).isEqualTo("Buzz");
    }

    @Test
    void fb_of_15_should_return_FizzBuzz(){
        //given
        int number = 15;
        //when
        String result = fizzBuzz._of(number);
        //then
        assertThat(result).isEqualTo("FizzBuzz");
    }
}
