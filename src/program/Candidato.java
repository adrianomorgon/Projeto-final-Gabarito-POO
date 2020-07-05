package program;

public class Candidato {
	private String id;
	private String gabarito;
	private int cont;
	
	public Candidato(String id, String gabarito) {
		this.id = id;
		this.gabarito = gabarito;
	}

	public String getId() {
		return id;
	}

	public String getGabarito() {
		return gabarito;
	}

	public int getCont() {
		return cont;
	}

	public void setCont(int cont) {
		this.cont = cont;
	}

	@Override
	public String toString() {
		return id + " " + cont;
	}
	
	
}
