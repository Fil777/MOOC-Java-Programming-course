/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fil
 */
public class Game {

    private String team1Name;
    private String team2Name;
    private int team1Score;
    private int team2Score;

    public Game(String team1, String team2, int score1, int score2) {
        team1Name = team1;
        team2Name = team2;
        team1Score = score1;
        team2Score = score2;
    }

    public boolean played(String team) {
        return team.equals(team1Name) || team.equals(team2Name);
    }

    public boolean winner(String team) {
        return (team1Score > team2Score && team.equals(team1Name))
                || (team2Score > team1Score && team.equals(team2Name));
    }

    public boolean loser(String team) {
        return (team1Score > team2Score && team.equals(team2Name))
                || (team2Score > team1Score && team.equals(team1Name));
    }

}
