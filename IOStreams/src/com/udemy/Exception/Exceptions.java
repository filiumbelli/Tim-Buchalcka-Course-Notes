package com.udemy.Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptions {
    public static void main(String[] args) {
        int x= 97;
        int y = 0;
        System.out.println(divideBYL(x,y));
        System.out.println(divideEAFP(x,y));
//        System.out.println(divide(x,y));
//        int a = getInt();
//        int b = getIntBYL();
        int c = getIntEAFP();
        System.out.println(c);
    }
    private static int getInt(){
        Scanner s = new Scanner(System.in);
        return s.nextInt();
    }

    private static int getIntBYL(){
        Scanner s = new Scanner(System.in);
        boolean isValid = true;
        System.out.print("Please enter an integer ");
        String input = s.next();
        for(int i = 0; i< input.length();i++){
            System.out.println(i);
            if(!Character.isDigit(input.charAt(i))){
                isValid = false;
                System.out.println("Not a valid input");
                break;
            }else{
                return Integer.parseInt(input);
            }
        }
        return s.nextInt();
    }
    private static int getIntEAFP(){
        Scanner s = new Scanner(System.in);
        try{
            return s.nextInt();
        }catch(InputMismatchException e){
            System.out.println("Wrong input");
            return 0;
        }
    }
    private static int divideBYL(int x,int y){
        if(y !=0){
            return x/y;
        }else{
            return 0;
        }
    }

    private static int divideEAFP(int x, int y){
        try{
            return x/y;
        }catch(ArithmeticException e){
            return 0;
        }
    }
    private static int divide(int x, int y){
        return x/y;
    }

}
