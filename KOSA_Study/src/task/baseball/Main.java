package task.baseball;

import java.util.ArrayList;
import java.util.Arrays;

// BaseBallGame
public class Main {

	public static void main(String[] args) {
		// init answer
		ArrayList<Integer> answer = setAnswer();
		// System.out.println(Arrays.toString(answer.toArray()));
		System.out.println(Arrays.toString(answer.toArray()));
		int count = 1;
		while (true) {
			Game game = new Game();
			game.input();
			if (game.isCorrect(answer)) {
				System.out.println(count + " 번째 성공");
				return;
			} else {
				game.showResult();
				count++;
			}
		}
	}

	private static ArrayList<Integer> setAnswer() {
		// for using "contains" methods
		ArrayList<Integer> list = new ArrayList<Integer>();
		// add 3 numbers
		for (int i = 0; i < 3; i++) {
			while (true) {
				int randomNum = (int) Math.floor(Math.random() * 10);
				if (!list.contains(randomNum)) {
					list.add(randomNum);
					break;
				}
			}
		}

		return list;
	}

}
