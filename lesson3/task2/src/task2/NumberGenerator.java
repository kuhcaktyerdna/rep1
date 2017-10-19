
package task2;


public class NumberGenerator {

    public Integer generateRandomNumber (){
        Integer number=(new java.util.Random()).nextInt(899)+100;
        Printer.print("Generated number is "+number);
        return number;
    }
}
