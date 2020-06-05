package factory;

import entities.Personagem;
import enumeration.Classe;

public class PersonagemFactory {
	
	private static int totalMonges;
	private static int totalEspadachins;
	private static int totalPersonagens;
	
	private static int level = 0;
	private static int vida = 100;
	private static int mana = 50;
	private static int pontosDeXp = 0;
	
	public static Personagem createMonge(String apelido) {
		totalMonges++;
		totalPersonagens = getTotalPersonagens() + 1;
		
		int bonificacaoVida = 20;
		int bonificacaoMana = 25;
		
		return new Personagem(level, vida, mana, apelido, pontosDeXp, bonificacaoVida, bonificacaoMana, Classe.MONGE.getClasse());
	}
	
	public static Personagem createEspadachim(String apelido) {
		totalEspadachins++;
		totalPersonagens = getTotalPersonagens() + 1;
		
		int bonificacaoVida = 30;
		int bonificacaoMana = 15;
		
		return new Personagem(level, vida, mana, apelido, pontosDeXp, bonificacaoVida, bonificacaoMana, Classe.ESPADACHIM.getClasse());
	}

	public static int getTotalMonges() {
		return totalMonges;
	}

	public static int getTotalEspadachins() {
		return totalEspadachins;
	}

	public static int getTotalPersonagens() {
		return totalPersonagens;
	}

}
