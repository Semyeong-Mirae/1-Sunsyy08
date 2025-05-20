import java.util.Scanner;

interface Calculator{
    int add(int a, int b);
    
    default int multiply(int a, int b) {
        return a * b;
    }

    static int subtrack(int a, int b){
        return a - b;
    }
}

class SimpleCalculator implements Calculator {
    @Override
    public int add(int a, int b){
        return a + b;
    }
}

public class Main {
    public static void main(String[] args){
        SimpleCalculator calc = new SimpleCalculator();
        Scanner sc = new Scanner(System.in);
        System.out.print("A를 입력하세요.");
        int num = sc.nextInt();

        System.out.print("B를 입력하세요.");
        int num1 = sc.nextInt();

        System.out.println(calc.add(num, num1));

        System.out.println(calc.multiply(num, num1));

        System.out.println(Calculator.subtrack(num,num1));
    }
}
