package cl.felipeGonzalez;

import java.util.Scanner;

public class Sueldo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int horas;
		int mes;
		int sueldo;
		System.out.println("Cuantas Horas Trabajaste esta semana: ");
		horas = sc.nextInt();
		mes = horas * 5000;
		sueldo = mes * 4;

		System.out.println("tu sueldo del mes equivale a: " + "$" + sueldo + " pesos");

	}

}
