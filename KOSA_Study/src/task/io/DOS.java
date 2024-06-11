package task.io;

import java.io.File;
import java.util.Scanner;

public class DOS {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// default 위치
		File file = new File("image/animal");

		while (true) {
			System.out.println("exit :: x");
			System.out.print("input:: ");
			String input = sc.nextLine();
			if (input.equalsIgnoreCase("X")) {
				break;
			}

			if (input.equals("ls")) {
				// 파일 목록 출력
				FileUtil.printFileList(file);
			} else if (input.startsWith("cd")) {
				if (input.endsWith("..")) {
					file = new File(file.getParent());
				} else {
					// 폴더 이름 분리
					input = input.split(" ")[1];
					file = new File(file.getName() + "/" + input);
				}
				System.out.println("move to ::" + file.getPath());
			} else if (input.startsWith("mkdir")) {
				// 폴더 이름 분리
				input = input.split(" ")[1];
				file = new File(file.getName() + "/" + input);
				System.out.println(file.getPath());
				file.mkdirs();
				System.out.println("폴더 생성 완료");
				System.out.println("move to ::" + file.getPath());

			} else if (input.startsWith("vi")) {
				// 파일 이름 분리
				input = input.split(" ")[1];
				FileUtil.writeTextFile(new File(file.getPath(), input));
			}
		}
	}

}
