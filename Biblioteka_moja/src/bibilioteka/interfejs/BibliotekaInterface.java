package bibilioteka.interfejs;

import java.util.List;

import bibilioteka.Autor;
import bibilioteka.Knjiga;

public interface BibliotekaInterface {
	public void dodajKnjigu(Knjiga knjiga);

	public void obrisiKnjigu(Knjiga knjiga);

	public List<Knjiga> VratiSveKnjige();

	public List<Knjiga> pronadjiKnjigu(Autor autor, long ISBN, String naslov, String izdavac);
}
