
package task2;


public class NumberConnecter {

    
    public int connectNumber(Integer firstNum, Integer secondNum){
        String combinatedNum = matchNumbers(firstNum, secondNum);
        int newNum = createNewNum(combinatedNum);
        return newNum;
    }
    
    private String matchNumbers(Integer firstNum, Integer secondNum){
        String combinatedNumber = firstNum.toString()+secondNum.toString();
        return combinatedNumber;
    }
    
    private int createNewNum(String combinatedNumber)
    {
        int firstAndSecondNum = Integer.parseInt(combinatedNumber);
        return firstAndSecondNum;
    }
}
