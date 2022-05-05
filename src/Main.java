import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        IntegerStack stack = new IntegerStack();
        String userInput;
        Integer firstNumber;
        Integer secondNumber;

        showMenuOne();

        userInput = scanner.nextLine();
        stack.push(Integer.parseInt(userInput));

        showMenuTwo();

        userInput = scanner.nextLine();
        stack.push(Integer.parseInt(userInput));

        showArimeticMenu();

        userInput = scanner.nextLine();

        switch (userInput){
            case "+":
                secondNumber = stack.pop();
                firstNumber = stack.pop();

                System.out.println("the sum of the numbers is: " + sum(firstNumber, secondNumber));
                break;

            case "-":
                secondNumber = stack.pop();
                firstNumber = stack.pop();

                System.out.println("the rest of the numbers is: " + sum(firstNumber, secondNumber));
                break;

            case "*":
                secondNumber = stack.pop();
                firstNumber = stack.pop();

                System.out.println("the multiplication of the numbers is: " + sum(firstNumber, secondNumber));
                break;

            case "/":
                secondNumber = stack.pop();
                firstNumber = stack.pop();

                System.out.println("the division of the numbers is: " + sum(firstNumber, secondNumber));
                break;



        }





    }

    public static void showMenuOne(){
        System.out.println("----------------");
        System.out.println("add a first number");
    }

    public static void showMenuTwo(){
        System.out.println("-----------------");
        System.out.println("add a second number");
        System.out.println("-----------------");
    }

    public static void showArimeticMenu(){
        System.out.println("---------------");
        System.out.println("+.- sum");
        System.out.println("-.- rest");
        System.out.println("*.- multiply");
        System.out.println("/.- division");
        System.out.println("---------------");
    }


    public static int sum (int number1, int number2){
        return  number1 + number2;
    }

    public static int substraction (int number1, int number2){
        return  number1 - number2;
    }

    public static int multiply (int number1, int number2){
        return  number1 * number2;
    }

    public static int division (int number1, int number2){
        return  number1 / number2;
    }
}
