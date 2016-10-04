package universitÓ;

import java.util.ArrayList;
import java.util.List;



public class UniversitÓ {
	private String nome;
	private List<Corso> corsi=new ArrayList<Corso>();
	private List<Docente> docenti= new ArrayList<Docente>();
	private List<Studente> studenti= new ArrayList<Studente>();

	public List<Studente> getStudenti() {
		return studenti;
	}

	public void setStudenti(List<Studente> studenti) {
		this.studenti = studenti;
	}

	public UniversitÓ() {
	
	}

	public UniversitÓ(String nome) {
		
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Corso> getCorsi() {
		return corsi;
	}

	public void setCorsi(List<Corso> corsi) {
		this.corsi = corsi;
	}

	public List<Docente> getDocenti() {
		return docenti;
	}

	public void setDocenti(List<Docente> docenti) {
		this.docenti = docenti;
	}
	
	
	

}