package diagnostico;

public class Contato {

	private String lsNome;
	private String lsTelefone;

	public Contato(String nome, String telefone) {
		this.lsNome = nome;
		this.lsTelefone = telefone;
	}

	public String getNome() {
		return lsNome;
	}

	public void setNome(String nome) {
		this.lsNome = nome;
	}

	public String getTelefone() {
		return lsTelefone;
	}

	public void setTelefone(String telefone) {
		this.lsTelefone = telefone;
	}

	@Override
	public String toString() {
		return "Contato [nome=" + lsNome + ", telefone=" + lsTelefone + "]";
	}

}