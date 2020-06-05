package factory;

import entities.Personagem;

public class ActionFactory {

	private static int calculaExp(Personagem personagem) {

		if (personagem.getPontosDeXp() > 100 && personagem.getPontosDeXp() < 500) {
			personagem.setLevel(1);
		} else if (personagem.getPontosDeXp() >= 500 && personagem.getPontosDeXp() < 1499) {
			personagem.setLevel(2);
		} else if (personagem.getPontosDeXp() >= 1500) {
			personagem.setLevel(2);
		}
		return personagem.getLevel();
	}

	private static void imprimeLevel(Personagem personagem) {

		System.out.println("Parabéns, você acaba de subir para o level " + personagem.getLevel());
	}

	private static void acresceVidaEMana(Personagem personagem, int vida, int mana) {
		personagem.setVida(vida + personagem.getVida());
		personagem.setMana(mana + personagem.getMana());
	}

	public static void ganhaExp(Personagem personagem, int exp) {
		int levelAnterior = personagem.getLevel();

		personagem.setPontosDeXp(personagem.getPontosDeXp() + exp);
		System.out.println(personagem.getApelido() + " ganhou " + exp + " pontos de experiência");
		calculaExp(personagem);
		if (personagem.getLevel() > levelAnterior) {
			int multiplicador = personagem.getLevel() - levelAnterior;
			imprimeLevel(personagem);
			acresceVidaEMana(personagem, (multiplicador * personagem.getBonificacaoVida()), (multiplicador * personagem.getBonificacaoMana()));
		}
	}

}
