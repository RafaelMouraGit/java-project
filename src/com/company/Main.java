package com.company;
//Primeiro projeto desenvolvido em Java (bem simples)
public class Main {

    public static void main(String[] args) {
	System.out.println("\nCalculadora:");
    Calculator.sum(4,6);
    Calculator.subtraction(3,6);
    Calculator.multiplication(10,53);
    Calculator.division(10,4);
    System.out.println("\nSaudação:");
    greetingMessage.messageType(4);
    greetingMessage.messageType(13);
    greetingMessage.messageType(51);

    System.out.println("\nEmpréstimo:");
    Emprestimo.calculator(1000, Emprestimo.getDuasParcelas());
    Emprestimo.calculator(1000, Emprestimo.getTresParcelas());
    Emprestimo.calculator(1000, 5);
    Emprestimo.calculator(1000,2);
    }
}
