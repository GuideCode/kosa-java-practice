package data;

import java.util.Scanner;
import java.util.Stack;

public class StackMission {

	public static void main(String[] args) {
		// 키보드부터 수학수식을 입력
		// ((2+3)+10)) => 괄호 일치 / 불일치 판단

		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		char[] inputChar = input.toCharArray();

		Stack<Character> stack = new Stack<Character>();

		for (char c : inputChar) {

			if (stack.isEmpty()) {
				if (c == ')') {
					System.out.println("괄호 불일치");
					return;
				}
			}
			if (c == '(') {
				stack.push(c);
			} else if (c == ')') {
				stack.pop();
			}
		}

		if (stack.isEmpty()) {
			System.out.println("괄호 일치");
		} else {
			System.out.println("괄호 불일치");
		}

	}

}
