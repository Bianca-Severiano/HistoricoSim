package controller;

import javax.swing.JOptionPane;

import Model.PilhaString;

public class controllerHistoricoSim {

	public controllerHistoricoSim() {
		super();
	}

	public String validaOperacao(int r, PilhaString p) {
		String retorno = "";
		switch (r) {
		case 1: {
			String valor = JOptionPane.showInputDialog("Insira endereço para adicionar ao histórico: ");
			retorno = insereEndereco(r, p, valor);
			break;
		}
		case 2: {
			retorno = removeEndereco(r, p);
			break;
		}
		case 3: {
			retorno = ultimoEndereco(r, p);
			break;
		}
		default:

		}
		return retorno;
	}

	private String insereEndereco(int r, PilhaString p, String valor) {
		String ret = "";

		if (valor.contains("https://www") && (valor.contains(".co"))) {
			p.push(valor);
			ret = valor + " - Adicionado ao histórico!";
		} else {
			ret = "Endereço inválido!*";
		}
		return ret;
	}

	private String removeEndereco(int r, PilhaString p) {
		String ret = "";
		try {
			String a = p.pop();
			ret = a + " - Removido do histórico!";
		} catch (Exception e) {
			ret = "Histórico vazio**";
		}
		return ret;
	}

	private String ultimoEndereco(int r, PilhaString p) {
		String ret = "";
		try {
			ret = "Último endereço acessado: " + p.top();
		} catch (Exception e) {
			ret = "Histórico vazio***";
		}
		return ret;
	}
}
