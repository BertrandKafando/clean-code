package ma.enset;

public class FizzBuzz {

    public String _of(int number) {
       
        String s = "";
        if(number %3 == 0) s += "Fizz";
        if(number %5 == 0) s += "Buzz";
        return s.isEmpty()? String.valueOf(number): s;
    }
    
}
