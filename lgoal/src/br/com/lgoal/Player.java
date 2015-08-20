package br.com.lgoal;

import static br.com.lgoal.Dice.D4;

public class Player {

	private Position position;
	
	private int number;
	
	private int resistance = 5;

	private Dice dribble = D4; 
	private Dice shortPass = D4;
	private Dice longPass = D4;
	private Dice rush = D4;
	private Dice shot = D4;
	private Dice disarm = D4;
	private Dice defense = D4;
	
	public Position getPosition() {
		return position;
	}
	public void setPosition(Position position) {
		this.position = position;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public int getResistance() {
		return resistance;
	}
	public void setResistance(int resistance) {
		this.resistance = resistance;
	}
	public Dice getDribble() {
		return dribble;
	}
	public void setDribble(Dice dribble) {
		this.dribble = dribble;
	}
	public Dice getShortPass() {
		return shortPass;
	}
	public void setShortPass(Dice shortPass) {
		this.shortPass = shortPass;
	}
	public Dice getLongPass() {
		return longPass;
	}
	public void setLongPass(Dice longPass) {
		this.longPass = longPass;
	}
	public Dice getRush() {
		return rush;
	}
	public void setRush(Dice rush) {
		this.rush = rush;
	}
	public Dice getShot() {
		return shot;
	}
	public void setShot(Dice shot) {
		this.shot = shot;
	}
	public Dice getDisarm() {
		return disarm;
	}
	public void setDisarm(Dice disarm) {
		this.disarm = disarm;
	}
	public Dice getDefense() {
		return defense;
	}
	public void setDefense(Dice defense) {
		this.defense = defense;
	}
	
}
