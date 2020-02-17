package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class RockPaperSissorsEvaluator {
    protected static final String ROCK = "rock";
    protected static final String PAPER = "paper";
    protected static final String SCISSOR = "scissor";

    /**
     * @param handSign a string representative of a hand sign
     * @return the respective winning move
     */
    public String getWinningMove(String handSign) {
        String winner = "";
        if(handSign.equals(ROCK)) {
            winner = PAPER;
        }
        else if(handSign.equals(PAPER)) {
            winner = SCISSOR;
        }
        else if(handSign.equals(SCISSOR)) {
            winner = ROCK;
        }


        return winner;
    }

    /**
     * @param handSign a string representative of a hand sign
     * @return the respective losing move
     */
    public String getLosingMove(String handSign) {
        String loser = "";
        if(handSign.equals(PAPER)) {
            loser = ROCK;
        }
        else if(handSign.equals(SCISSOR)) {
            loser = PAPER;
        }
        else if(handSign.equals(ROCK)) {
            loser = SCISSOR;
        }


        return loser;

    }

    /**
     * @param handSignOfPlayer1 a string representative of a hand sign of a player
     * @param handSignOfPlayer2 a string representative of a hand sign of a challenger
     * @return a string representative of the winning hand sign between the two players
     */
    public String getWinner(String handSignOfPlayer1, String handSignOfPlayer2) {
        String result = "";


        if(getWinningMove(handSignOfPlayer1).equals(handSignOfPlayer2)) {
            result = handSignOfPlayer2;
        }
        else {
            result = handSignOfPlayer1;
        }
        return result;
    }
}
