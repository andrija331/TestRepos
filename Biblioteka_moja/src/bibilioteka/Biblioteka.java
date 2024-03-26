package bibilioteka;

import java.util.ArrayList;
import java.util.List;

import bibilioteka.interfejs.BibliotekaInterface;

public class Biblioteka implements BibliotekaInterface {
	private List<Knjiga> knjige = new ArrayList<Knjiga>();

	@Override
	public void dodajKnjigu(Knjiga knjiga) {
		knjige.add(knjiga);

	}

	@Override
	public void obrisiKnjigu(Knjiga knjiga) {
		knjige.remove(knjiga);

	}

	@Override
	public List<Knjiga> VratiSveKnjige() {

		return knjige;
	}

	@Override
	public List<Knjiga> pronadjiKnjigu(Autor autor, long ISBN, String naslov, String izdavac) {
		List<Knjiga> rezultati = new ArrayList<Knjiga>();
		for (Knjiga k : knjige)
			if (k.getNaslov().toLowerCase().contains(naslov.toLowerCase()))
				rezultati.add(k);
		return rezultati;
	}

}
