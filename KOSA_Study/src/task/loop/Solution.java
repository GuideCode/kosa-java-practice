package task.loop;

import java.util.Scanner;

public class Solution {

	// 0524 Task

	public static void main(String[] args) {
		Solution solution = new Solution();

		Scanner sc = new Scanner(System.in);
		System.out.print("Input: ");
		int num = sc.nextInt();
		// 1-1)
//		solution.one_one(num);
//		// 1-2)
//		solution.one_two(num);
//		// 1-3)
//		solution.one_three(num);
//		// 1-4)
//		solution.one_four(num);
//		// 1-5)
//		solution.one_five(num);
//		// 1-6)
//		solution.one_six(num);
//		// 1-7)
//		solution.one_seven(num);
//		// 2-1)
//		solution.two_one(num);
//		// 2-2)
//		solution.two_two(num);
//		// 2-3)
//		solution.two_three(num);
		// 2-4)
		solution.two_four(num);
	}

	// 1-1)
	public void one_one(int num) {
		System.out.println("number = " + num);
		for (int i = 0; i < num; i++) {
			for (int j = 1; j < num + 1; j++) {
				System.out.print(" " + (i * num + j));
			}
			System.out.println();
		}
		System.out.println("---------------");
	}

	// 1-2)
	public void one_two(int num) {
		System.out.println("number = " + num);
		for (int i = num - 1; i >= 0; i--) {
			for (int j = 1; j < num + 1; j++) {
				System.out.print(" " + (i * num + j));
			}
			System.out.println();
		}
		System.out.println("---------------");
	}

	// 1-3)
	public void one_three(int num) {
		System.out.println("number = " + num);
		for (int i = 0; i < num; i++) {
			// double jump
			for (int j = 1; j < num * 2; j += 2) {
				System.out.print(" " + (i * num + j));
			}
			System.out.println();
		}
	}

	// 1-4)
	public void one_four(int num) {
		System.out.println("number = " + num);
		for (int i = 1; i < num + 1; i++) {
			for (int j = 0; j < i;) {
				System.out.print(++j + " ");
			}
			System.out.println();
		}
		System.out.println("---------------");
	}

	// 1-5)
	// using "value" variable
	public void one_five(int num) {
		System.out.println("number = " + num);
		int value = 1;
		for (int i = num; i > 0; i--) {
			for (int j = 0; j <= num - i; j++) {
				System.out.print(" " + value++);
			}
			System.out.println();
		}
		System.out.println("---------------");
	}

	// 1-6)
	public void one_six(int num) {
		System.out.println("number = " + num);
		for (int i = 0; i < num; i++) {
			for (int j = 1; j <= num - i; j++) {
				System.out.print(" " + j);
			}
			System.out.println();
		}
		System.out.println("---------------");
	}

	// 1-7)
	public void one_seven(int num) {
		System.out.println("number = " + num);

		int value = 1;
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num - i; j++) {
				System.out.print(" " + value++);
			}
			System.out.println();
		}
		System.out.println("---------------");
	}

	// 2-1)
	public void two_one(int num) {
		System.out.println("number = " + num);

		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}
		System.out.println("---------------");
	}

	// 2-2)
	public void two_two(int num) {
		System.out.println("number = " + num);
		for (int i = 0; i < num; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}
		System.out.println("---------------");
	}

	// 2-3) calculate blank
	public void two_three(int num) {
		System.out.println("number = " + num);
		for (int i = 0; i < num; i++) {

			for (int k = 0; k < num - i; k++) {
				System.out.print(" ");
			}

			for (int j = num; j >= num - i; j--) {
				System.out.print("*");
			}

			System.out.println();
		}
		System.out.println("---------------");
	}
	
	// 2-4)
	public void two_four(int num) {
	
	
	}
	

}
