package br.com.lgoal;

import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;

public enum Dice {
	D4(1, 4),
	D6(2, 6),
	D8(3, 8),
	D10(4, 10);
	
	private int stars;
	private int value;
	private static Random rand = new Random();
	private static Map<Integer, Dice> dices;
	
	private Dice(int stars, int value) {
		this.stars = stars;
		this.value = value;
	}

	public int roll() {
		return Dice.rand.nextInt(this.value) + 1;
	}

	static {
		Dice.dices = new ConcurrentHashMap<Integer, Dice>();
		for (Dice dice : Dice.values()) {
			Dice.dices.put(dice.stars, dice);
		}
	}
	
	public static Dice diceByStars(int stars) {
		return Dice.dices.get(stars);
	}
	
}
