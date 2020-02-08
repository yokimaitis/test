package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        if (1+1==2) {
            System.out.println("Start...");
            System.out.println("");
        }
        //WLN.write(RLN.read());

        final String input = RLN.read();
      //  System.out.println(input.length());

        final String operand = "+-*/";
        String currentOperand = "";
        String firstNumber = "";
        String secondNumber = "";


        for (int i = 0; i < input.length(); i++) {
            String currentChar = String.valueOf(input.charAt(i));
            if (operand.contains(currentChar)){
                currentOperand=currentChar;
                break;
            }
        }
        firstNumber=input.substring(0,input.indexOf(currentOperand));
        secondNumber=input.substring(input.indexOf(currentOperand)+1);

        int x1 = Integer.parseInt(firstNumber);
        int x2 = Integer.parseInt(secondNumber);
        int y = 0;

        for (int i = 1; i < operand.length() ; i++) {
            if (currentOperand.equals("+")) {
                y=x1+x2;
            }
            if (currentOperand.equals("-")) {
                y=x1-x2;
            }
            if (currentOperand.equals("*")) {
                y=x1*x2;
            }
            if (currentOperand.equals("/")) {
                y=x1/x2;
            }

        }

        System.out.println("Результат = "+y);

//        for (int i = 1; i < 9; i++){
//            if (i==5) System.out.println(i);
//            System.out.println("no");
//
//        }
//
//        Scanner RLN = new Scanner(System.in);
//        System.out.println(RLN.nextLine());
    }
}
