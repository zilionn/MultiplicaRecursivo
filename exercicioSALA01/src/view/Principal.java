package view;

import javax.swing.JOptionPane;

import controller.MultiplicaController;

public class Principal {

	public static void main(String[] args) {
		MultiplicaController multiCont = new MultiplicaController();
		int A = 0;
		int B = 0;
				do {
					try {
						String input = JOptionPane.showInputDialog("insira o valor de A: ");
						if (input == null) {
							JOptionPane.showMessageDialog(null, "encerrado");
							System.exit(0);
						}
						A = Integer.parseInt(input);
						if (A <= 0) {
							JOptionPane.showMessageDialog(null, "número inválido");
							continue;
						}
					} catch (Exception e) {
						JOptionPane.showMessageDialog(null, "número inválido");
						continue;
					}
					break;
				} while(true);
				
				do {
					try {
						String input = JOptionPane.showInputDialog("insira o valor de B: ");
						if (input == null) {
							JOptionPane.showMessageDialog(null, "encerrado");
							System.exit(0);
						}
						B = Integer.parseInt(input);
					} catch (Exception e) {
						JOptionPane.showMessageDialog(null, "número inválido");
						continue;
					}
					break;
				} while(true);
				
				JOptionPane.showMessageDialog(null, "O valor de A " + A + " multplicado por somas por B " + B + " é de = " + multiCont.multiplica(A, B));

	}

}
