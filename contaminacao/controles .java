package contaminacao;
import java.math.*;
import java.awt.*;
import java.awt.geom.*;
import java.util.Scanner;
import javax.swing.*;

public class controles {
	private static int contaminacao_inicial;
	private static int constante_proporcionalidade;
	private double infectados;
	
	public controles() {
		// TODO
	}

	public int calc_infectados (int contaminacao_inicial, int constante_proporcionalidade) {
		controles.contaminacao_inicial = contaminacao_inicial;
		controles.constante_proporcionalidade = constante_proporcionalidade;
		Scanner input = new Scanner(System.in);
		System.out.println("Calculo de infectados e insira o tempo: [-1 para sair] ");
		int t = input.nextInt();
		System.out.printf("Numero de infectados: %f \n\n", this.contaminacao(t));
		return t;
	}
	
	public double contaminacao(int tempo) {
		return this.infectados = controles.contaminacao_inicial*Math.exp(controles.constante_proporcionalidade*tempo);
	}
}
