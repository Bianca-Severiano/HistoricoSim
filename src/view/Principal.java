package view;

import javax.swing.JOptionPane;

import Model.PilhaString;
import controller.controllerHistoricoSim;

public class Principal {

	public static void main(String[] args) {
		PilhaString historico = new PilhaString();
		controllerHistoricoSim c = new controllerHistoricoSim();

		int r = 0;

		do {
			r = Integer.parseInt(JOptionPane.showInputDialog("MENU \n 1- Inserir um novo endereço no histórico"
					+ " \n 2- Remover último endereço \n 3- Verificar último endereço \n 9- Sair"));
			System.out.println(c.validaOperacao(r, historico));
		} while (r != 9);

	}

}
