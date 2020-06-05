package main;

import entities.Personagem;
import factory.ActionFactory;
import factory.PersonagemFactory;

public class Game {

	public static void main(String[] args) {
		
		Personagem banana = PersonagemFactory.createMonge("banana");
		printInfo(banana);
		
		Personagem tremax = PersonagemFactory.createEspadachim("tremax");
		printInfo(tremax);
		
		System.out.println();
		
		ActionFactory.ganhaExp(banana, 499);
		ActionFactory.ganhaExp(tremax, 501);
		
		printInfo(banana);
		
		printInfo(tremax);
		
		System.out.println("-----------------------------");
		System.out.println("total de personagens: " + PersonagemFactory.getTotalPersonagens());
		System.out.println("total de monges: " + PersonagemFactory.getTotalMonges());
		System.out.println("total de espadachins: " + PersonagemFactory.getTotalEspadachins());

	}
	
	private static void printInfo(Personagem personagem) {
		System.out.println("------------"+personagem.getApelido().toUpperCase()+"------------");
		System.out.println("level: " + personagem.getLevel());
		System.out.println("exp: " + personagem.getPontosDeXp());
		System.out.println("vida: " + personagem.getVida());
		System.out.println("mana: " + personagem.getMana());
	}

}
