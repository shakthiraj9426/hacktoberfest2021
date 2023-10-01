import java.util.Scanner;

class Calculator{
    Scanner scan = new Scanner(System.in);
    public void add(){
        System.out.println("Enter the two operands to perform additon");
        double op1 = scan.nextDouble();
        double op2 = scan.nextDouble();

        System.out.println(op1+"+"+op2+"="+op1+op2);
    }
    
    public void sub(double op1, double op2){
        System.out.println(op1+"+"+op2+"="+(op1-op2));
    }

    public double mul(){
        System.out.println("Enter the two operands to perform Multiplication");
        double op1 = scan.nextDouble();
        double op2 = scan.nextDouble();
        double res = op1*op2;

        return res;
    }
    public double div(double op1, double op2){
        
        return op1/op2;
    }
}



public class CalculatorApp {
    

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Calculator calsi = new Calculator();
        calsi.add();

        System.out.println("Enter the two operands to perform substraction");
        double op1 = scan.nextDouble();
        double op2 = scan.nextDouble();

        calsi.sub(op1, op2);

        System.out.println("result for multiplication"+calsi.mul());

        System.out.println("Enter the two operands to perform Division");
        double ope1 = scan.nextDouble();
        double ope2 = scan.nextDouble();

        double divres = calsi.div(ope1, ope2);

        System.out.println("Result for Division = "+divres);

        scan.close();


    }
}

