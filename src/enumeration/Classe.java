package enumeration;

public enum Classe {
	
	MONGE("monge"),
	ESPADACHIM("espadachim");
	
	public String classe;
	
	Classe(String classe) {
		this.classe = classe;
	}
	
	public String getClasse() {
		return this.classe;
	}
}
