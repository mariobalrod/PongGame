package classes;


import javax.swing.*;

@SuppressWarnings("serial")
public class Score extends JPanel {

	int scoreJug1;
	int scoreJug2;

	public Score(int scoreJug1, int scoreJug2){
		this.scoreJug1 = scoreJug1;
		this.scoreJug2 = scoreJug2;
	}

	//Metodos GET
	public int getScoreJug1(){
		return this.scoreJug1;
	}
	public int getScoreJug2(){
		return this.scoreJug2;
	}

	//Metodos SET
	public void setScoreJug1(){
		this.scoreJug1++;
	}
	public void setScoreJug2(){
		this.scoreJug2++;
	}

}
