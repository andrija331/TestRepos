package bibilioteka;

import java.util.ArrayList;
import java.util.List;

import bibilioteka.interfejs.BibliotekaInterface;

public class Biblioteka implements BibliotekaInterface {
	private List<Knjiga> knjige = new ArrayList<Knjiga>();

	@Override
	public void dodajKnjigu(Knjiga knjiga) {
		if (knjiga == null)
			throw new NullPointerException("Knjiga ne sme biti null");

		if (knjige.contains(knjiga))
			throw new IllegalArgumentException("Knjiga vec postoji u bilioteci");

		knjige.add(knjiga);

	}

	@Override
	public void obrisiKnjigu(Knjiga knjiga) {
		if (knjiga == null)
			throw new NullPointerException("Knjiga ne sme biti null");

		if (!knjige.contains(knjiga))
			throw new IllegalArgumentException("Knjiga ne postoji u bilioteci");
		knjige.remove(knjiga);

	}

	@Override
	public List<Knjiga> VratiSveKnjige() {

		return knjige;
	}

	@Override
	public List<Knjiga> pronadjiKnjigu(Autor autor, long ISBN, String naslov, String izdavac) {

		if (autor == null && ISBN == 0 && naslov == null && izdavac == null)
			throw new IllegalArgumentException("Morate uneti bar jedan kriterijum");

		List<Knjiga> rezultati = new ArrayList<Knjiga>();
		for (Knjiga k : knjige)
			if (k.getNaslov().toLowerCase().contains(naslov.toLowerCase()))
				rezultati.add(k);
		return rezultati;
	}

}
