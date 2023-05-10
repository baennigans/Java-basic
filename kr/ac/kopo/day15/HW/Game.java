package kr.ac.kopo.day15.HW;

import java.util.Random;

public interface Game {

	final static int SCISSOR = 1 ;
	final static int ROCK = 2 ;
	final static int PAPER = 3 ;
	
	Random r = new Random();

	
	abstract int startGame(int you);

}
