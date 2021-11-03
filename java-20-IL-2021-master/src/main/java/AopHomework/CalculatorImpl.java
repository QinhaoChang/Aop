package AopHomework;

public class CalculatorImpl implements Calculator{
    @Override
    public int calculate(int a, int b){
        System.out.println("Final Execution");
        return a + b;
    }

}

