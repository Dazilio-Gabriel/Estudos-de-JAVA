package diagnostico;

import java.util.ArrayList;

public class VetContato {

	private ArrayList<Contato> lcCont;
	private int lnCont;

	public VetContato() {
		lcCont = new ArrayList<>();
		lnCont = 0;
	}

	public int getQuant() {
		return lnCont;
	}

	public Contato getContato(int posicao) {
		if (posicao < 0 || posicao >= lcCont.size()) {
			return null;
		}

		return lcCont.get(posicao);
	}

	public int pesc(String nome) {
		for (int i = 0; i < lcCont.size(); i++) {
			if (lcCont.get(i).getNome().equals(nome)) {
				return i;
			}
		}

		return -1;
	}

	public int inse(Contato contato) {

		if (pesc(contato.getNome()) != -1) {
			return -2;
		}

		lcCont.add(contato);
		lnCont++;

		return 0;
	}

	@Override
	public String toString() {
		return "VetContato [contatos=" + lcCont + ", quant=" + lnCont + "]";
	}

}