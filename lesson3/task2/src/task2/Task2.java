package task2;

public class Task2 {

    public static void main(String[] args) {
        Integer firstNum,secondNum,thirdNum;
        NumberGenerator numGen = new NumberGenerator();
        firstNum= numGen.generateRandomNumber();
        secondNum= numGen.generateRandomNumber();
        thirdNum= numGen.generateRandomNumber();
        NumberConnecter numCon = new NumberConnecter();
        int newNum = numCon.connectNumber(firstNum, secondNum);
        Printer.print(newNum+" - "+thirdNum+" = "+(newNum-thirdNum));
    }
}
        
        



