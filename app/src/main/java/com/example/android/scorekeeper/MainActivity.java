package com.example.android.scorekeeper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // define the views
    TextView team1ScoreView, team2ScoreView, team1FoulsView, team2FoulsView, team1CornersView, team2CornersView;

    // define and initialize metric variables
    int team1score = 0;
    int team1fouls = 0;
    int team1corners = 0;
    int team2score = 0;
    int team2fouls = 0;
    int team2corners = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        team1ScoreView = (TextView) findViewById(R.id.team_1_score);
        team2ScoreView = (TextView) findViewById(R.id.team_2_score);
        team1FoulsView = (TextView) findViewById(R.id.team_1_fouls);
        team2FoulsView = (TextView) findViewById(R.id.team_2_fouls);
        team1CornersView = (TextView) findViewById(R.id.team_1_corners);
        team2CornersView = (TextView) findViewById(R.id.team_2_corners);
    }

    /**
     * Displays the given score for Team 1.
     */
    public void displayScoreTeam1(int score1) {
        team1ScoreView.setText(String.valueOf(score1));
    }

    /**
     * This method is called when the team1_plus_score button is clicked.
     */
    public void add1ToTeam1Score(View view1s) {
        team1score += 1;
        displayScoreTeam1(team1score);
    }

    /**
     * Displays the given score for Team 2.
     */
    public void displayScoreTeam2(int score2) {
        team2ScoreView.setText(String.valueOf(score2));
    }

    /**
     * This method is called when the team2_plus_score button is clicked.
     */
    public void add1ToTeam2Score(View view2s) {
        team2score += 1;
        displayScoreTeam2(team2score);
    }

    /**
     * Displays the fouls for Team 1.
     */
    public void displayFoulsTeam1(int fouls1) {
        team1FoulsView.setText(String.valueOf(fouls1));
    }

    /**
     * This method is called when the team1_plus_fouls button is clicked.
     */
    public void add1ToTeam1Fouls(View view1f) {
        team1fouls += 1;
        displayFoulsTeam1(team1fouls);
    }

    /**
     * Displays the fouls for Team 2.
     */
    public void displayFoulsTeam2(int fouls2) {
        team2FoulsView.setText(String.valueOf(fouls2));
    }

    /**
     * This method is called when the team2_plus_fouls button is clicked.
     */
    public void add1ToTeam2Fouls(View view2f) {
        team2fouls += 1;
        displayFoulsTeam2(team2fouls);
    }

    /**
     * Displays the corners for Team 1.
     */
    public void displayCornersTeam1(int corners1) {
        team1CornersView.setText(String.valueOf(corners1));
    }

    /**
     * This method is called when the team1_plus_corners button is clicked.
     */
    public void add1ToTeam1Corners(View view1c) {
        team1corners += 1;
        displayCornersTeam1(team1corners);
    }

    /**
     * Displays the corners for Team 2.
     */
    public void displayCornersTeam2(int corners2) {
        team2CornersView.setText(String.valueOf(corners2));
    }

    /**
     * This method is called when the team2_plus_corners button is clicked.
     */
    public void add1ToTeam2Corners(View view2c) {
        team2corners += 1;
        displayCornersTeam2(team2corners);
    }

    /**
     * This method is called when the Reset button is clicked.
     */
    public void resetScore(View reset) {
        team1score = 0;
        team1fouls = 0;
        team1corners = 0;
        team2score = 0;
        team2fouls = 0;
        team2corners = 0;

        displayScoreTeam1(team1score);
        displayScoreTeam2(team2score);
        displayFoulsTeam1(team1fouls);
        displayFoulsTeam2(team2fouls);
        displayCornersTeam1(team1corners);
        displayCornersTeam2(team2corners);
    }
}