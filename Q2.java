package com.cozentus.exceptionTask;

class GameLostException extends Exception {
    public GameLostException(String message) {
        super(message);
    }
}

public class Q2 {
	public static void main(String[] args) {
        try {
            playGame();
            System.out.println("Won the game");
        } catch (GameLostException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void playGame() throws GameLostException {
        boolean playerWins =  false;
        if (!playerWins) {
            throw new GameLostException("Lose the game");
        }
    }
}
