package Aula06;

public class Nota {
	private String nomeDisciplina;
	private float nota;
	private int faltas;
	
	public Nota() {
		
	}
	
	public Nota(String nomeDisciplina, float nota, int faltas) {
		super();
		this.nomeDisciplina = nomeDisciplina;
		this.nota = nota;
		this.faltas = faltas;
	}



	public String getNomeDisciplina() {
		return nomeDisciplina;
	}
	
	public void setNomeDisciplina(String nomeDisciplina) {
		this.nomeDisciplina = nomeDisciplina;
	}
	
	public float getNota() {
		return nota;
	}
	
	public void setNota(float nota) {
		this.nota = nota;
	}

	public int getFaltas() {
		return faltas;
	}

	public void setFaltas(int faltas) {
		this.faltas = faltas;
	}
	
}
