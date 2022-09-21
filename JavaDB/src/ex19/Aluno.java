package ex19;

public class Aluno {
	private int id;
	private String nome;
	private String curso;
	
	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public int getRa() {
		return ra;
	}

	public void setRa(int ra) {
		this.ra = ra;
	}

	private int ra;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Aluno() {
		
	}
	
	public Aluno(int id, String nome, int ra, String curso) {
		this.id = id;
		this.nome = nome;
		this.curso = curso;
		this.ra = ra;
	}

}
