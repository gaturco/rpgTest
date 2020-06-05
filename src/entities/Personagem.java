package entities;

public class Personagem {
	
	private int level;
	private int vida;
	private int mana;
	private String apelido;
	private int pontosDeXp;
	private int bonificacaoVida;
	private int bonificacaoMana;
	private String classe;
	
	public Personagem(int level, int vida, int mana, String apelido, int pontosDeXp, int bonificacaoVida,
			int bonificacaoMana, String classe) {
		super();
		this.level = level;
		this.vida = vida;
		this.mana = mana;
		this.apelido = apelido;
		this.pontosDeXp = pontosDeXp;
		this.bonificacaoVida = bonificacaoVida;
		this.bonificacaoMana = bonificacaoMana;
		this.classe = classe;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public int getMana() {
		return mana;
	}

	public void setMana(int mana) {
		this.mana = mana;
	}

	public String getApelido() {
		return apelido;
	}

	public void setApelido(String apelido) {
		this.apelido = apelido;
	}

	public int getPontosDeXp() {
		return pontosDeXp;
	}

	public void setPontosDeXp(int pontosDeXp) {
		this.pontosDeXp = pontosDeXp;
	}

	public int getBonificacaoVida() {
		return bonificacaoVida;
	}

	public void setBonificacaoVida(int bonificacaoVida) {
		this.bonificacaoVida = bonificacaoVida;
	}

	public int getBonificacaoMana() {
		return bonificacaoMana;
	}

	public void setBonificacaoMana(int bonificacaoMana) {
		this.bonificacaoMana = bonificacaoMana;
	}

	public String getClasse() {
		return classe;
	}

	public void setClasse(String classe) {
		this.classe = classe;
	}

}
