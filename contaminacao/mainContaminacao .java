package contaminacao;
import java.awt.Dimension;
import javax.swing.JFrame;
import java.util.Scanner;

public class mainContaminacao {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Número de Infectados: ");
		int infec = sc.nextInt();
		System.out.print("Taxa de Contágio: ");
		int taxa = sc.nextInt();
		controles controle = new controles();
		int tempo;
		do {
			tempo = controle.calc_infectados(infec, taxa);
			JFrame frame = new Tela(tempo, infec, taxa);
		    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    frame.setSize(new Dimension(400, 400));
		    frame.setVisible(true);
		} while (tempo!=-1);
		if (tempo==-1) {System.exit(0);}
	}
}
