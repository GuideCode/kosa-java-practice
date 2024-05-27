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
		// 1-8)
//		solution.one_eight(num);
		// 1-9)
//		solution.one_nine(num);
		// 1-10)
//		solution.one_ten(num);
		// 2-1)
//		solution.two_one(num);
//		// 2-2)
//		solution.two_two(num);
//		// 2-3)
//		solution.two_three(num);
		// 2-4)
//		solution.two_four(num);
		// 2-5)
//		solution.two_five(num);
		// 2-6)
//		solution.two_six(num);
		// 2-7)
//		solution.two_seven(num);
		// 2-8)
//		solution.two_eight(num);
		// 2-9)
//		solution.two_nine(num);
		// 2-10)
		solution.two_ten(num);

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

	// 1-8)
	public void one_eight(int num) {
		for (int i = 1; i <= num; i++) {
			int value = i; // start value
			for (int j = 1; j <= num; j++) {
				System.out.print(value + " ");
				value++;
				if (value > 9) { // over 9 => reset value: 1
					value = 1;
				}
			}
			System.out.println();
		}
	}

	// 1-9)
	public void one_nine(int num) {
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= num; j++) {
				// start value
				int value = i + j - 1;
				if (value > num) {
					value -= num;
				}
				System.out.print(value + " ");
			}
			System.out.println();
		}
	}

	// 1-10)
	public void one_ten(int num) {
		int value = 1;
		for (int row = 1; row <= num; row++) {
			for (int col = 1; col <= num; col++) {
				if (col <= num - row) {
					System.out.print("   ");
				} else {
					System.out.printf("%2d ", value++);
				}
			}
			System.out.println();
		}
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
		System.out.println("number = " + num);
		for (int i = 1; i <= num; i++) {
			// print blank
			for (int j = num - i; j > 0; j--) {
				System.out.print(" ");
			}
			// print star(odd number)
			for (int k = 1; k <= 2 * i - 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("---------------");

	}

	// 2-5)
	public void two_five(int num) {
		System.out.println("number = " + num);
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= num - i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= (2 * i - 1); k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = num - 1; i > 0; i--) {
			for (int j = 1; j <= num - i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= (2 * i - 1); k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("---------------");

	}

	// 2-6)
	public void two_six(int num) {
		System.out.println("number = " + num);
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= num - i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= (2 * i - 1); k++) {
				System.out.print("*");
			}
			for (int j = 1; j <= num - i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= num - i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= (2 * i - 1); k++) {
				System.out.print("*");
			}

			System.out.println();
		}
		for (int i = num - 1; i > 0; i--) {
			for (int j = 1; j <= num - i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= (2 * i - 1); k++) {
				System.out.print("*");
			}
			for (int j = 1; j <= num - i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= num - i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= (2 * i - 1); k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("---------------");

	}

	// 2-7)
	public void two_seven(int num) {

		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= num - i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j < i * 2; j++) {
				System.out.print('*');
			}
			for (int j = 1; j <= (num - i) * 2; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j < (num * 2) + (i - 1) * 2; j++) {
				System.out.print('*');
			}
			for (int j = 1; j <= (num - i) * 2; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j < i * 2; j++) {
				System.out.print('*');
			}
			System.out.println();
		}

	}

	// 2-8)
	public void two_eight(int num) {

		// triangle
		for (int i = 1; i < num; i++) {
			for (int j = 1; j < (num * 4) - (i + 1); j++) {
				System.out.print(" ");
			}
			for (int j = 1; j < i * 2; j++) {
				System.out.print('*');
			}
			System.out.println();
		}

		// bottom figure
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= num - i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j < i * 2; j++) {
				System.out.print('*');
			}
			for (int j = 1; j <= (num - i) * 2; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j < (num * 2) + (i - 1) * 2; j++) {
				System.out.print('*');
			}
			for (int j = 1; j <= (num - i) * 2; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j < i * 2; j++) {
				System.out.print('*');
			}
			System.out.println();
		}
	}

	// 2-9)
	public void two_nine(int num) {

		for (int i = 0; i < num + 2; i++) {
			System.out.print("$");
		}
		System.out.println();

		for (int j = 0; j < num; j++) {
			for (int i = 0; i < num + 2; i++) {
				if (i == 0 || i == num + 2 - 1) {
					System.out.print("$");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}

		for (int i = 0; i < num + 2; i++) {
			System.out.print("$");
		}
	}

	// 2-10)
	public void two_ten(int num) {

		// top triangle
		for (int i = 0; i < num + 2; i++) {
			for (int j = 0; j <= i; j++) {
				if (j != 0 && j != i) {
					System.out.print("@");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}

		// bottom triangle
		for (int i = 0; i < num + 1; i++) {

			for (int j = 0; j < (num + 1) - i; j++) {
				if (j != 0 && j != num - i) {
					System.out.print("@");
				} else {
					System.out.print("*");
				}
			}

			System.out.println();
		}
	}

}
