import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        double number1,number2,result;
        char operater;
            Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a operater(+-*/):- ");
        operater=scanner.next().charAt(0);
        System.out.println("Enter your number1:- ");
        number1=scanner.nextInt();
        System.out.println("Enter your number2:- ");
        number2=scanner.nextInt();
        switch (operater){
            case '+':
                result=number1+number2;
                System.out.println("The number1+number= "+result);
                break;
            case '-':
                result=number1-number2;
                System.out.println("The number1-number= "+result);
                System.out.println();
                break;
            case '*':
                result=number1*number2;
                System.out.println("The number1*number= "+result);
                break;
            case '/':
                result=number1/number2;
                System.out.println("The number1/number= "+result);
                break;
            default:
                System.out.println("Invalid operater entry!!");
                break;


        }
    }
}
