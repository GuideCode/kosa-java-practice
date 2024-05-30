package task.baseball;

import java.util.ArrayList;
import java.util.Scanner;

public class Game {

	private Scanner sc;
	private int[] input;
	private int ball;
	private int strike;

	private String currentResult;

	public Game() {
		this.sc = new Scanner(System.in);
		this.input = new int[3];
	}

	public void input() {
		// input
		System.out.println("*중복 입력 불가");
		System.out.print("3자리 수 입력: ");
		for (int i = 0; i < 3; i++) {
			this.input[i] = sc.nextInt();
		}
	}

	public boolean isCorrect(ArrayList<Integer> answer) {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (input[i] == answer.get(j)) {
					if (i == j) {
						
						strike++;
					} else {
						ball++;
					}
				}
			}
		}

		if (strike == 3) {
			return true;
		} else if (strike == 0 && ball == 0) {
			currentResult = "OUT";
			return false;
		} else {
			currentResult = ball + "B" + strike + "S";
			return false;
		}
	}

	public void showResult() {
		System.out.println(currentResult);
	}

}
