package task2;

public class Task2 {

    public static void main(String[] args) {
        Integer firstNum,secondNum,thirdNum;
        NumberGenerator numGen = new NumberGenerator();
        firstNum= numGen.generateRandomNumber();
        secondNum= numGen.generateRandomNumber();
        thirdNum= numGen.generateRandomNumber();
        IntToStringConverter iToS = new IntToStringConverter();
        String combinatedNumber = iToS.convertToString(firstNum, secondNum);
        StringToIntConverter sToI = new StringToIntConverter();
        int firstAndSecondNum = sToI.convertToInt(combinatedNumber);
        System.out.println(combinatedNumber+" - "+thirdNum+" = "+(firstAndSecondNum-thirdNum));
    }
}
        
        



