package br.com.erickfreire.operadoreslogicos;

/**
 * Programa em Java que compara os operadores lógicos
 * 
 * @author Erick Freire
 * @version 1 - Criado em 17-04-2021 as 15:01
 */

public class OperadoresLogicos {
	public static void main(String[] args) {

		System.out.printf("%s%n%s: %b%n%s: %b%n%s: %b%n%s: %b%n%n", "Conditional AND (&&)", "false && false",
				(false && false), "false && true", (false && true), "true && false", (true && false), "true && true",
				(true && true));

		System.out.printf("%s%n%s: %b%n%s: %b%n%s: %b%n%s: %b%n%n", "Conditional OR (||)", "false || false",
				(false || false), "false || true", (false || true), "true || false", (true || false), "true || true",
				(true || true));

		System.out.printf("%s%n%s: %b%n%s: %b%n%s: %b%n%s: %b%n%n", "Boolean logical AND (&)", "false & false",
				(false & false), "false & true", (false & true), "true & false", (true & false), "true & true",
				(true & true));

		System.out.printf("%s%n%s: %b%n%s: %b%n%s: %b%n%s: %b%n%n", "Boolean logical inclusive OR (|)", "false | false",
				(false | false), "false | true", (false | true), "true | false", (true | false), "true | true",
				(true | true));

		System.out.printf("%s%n%s: %b%n%s: %b%n%s: %b%n%s: %b%n%n", "Boolean logical exclusive OR (^)", "false ^ false",
				(false ^ false), "false ^ true", (false ^ true), "true ^ false", (true ^ false), "true ^ true",
				(true ^ true));

		System.out.printf("%s%n%s: %b%n%s: %b%n", "Logical NOT (!)", "!false", (!false), "!true", (!true));

	}

}
