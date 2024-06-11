package task.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileUtil {

	public static void printFileList(File file) {
		File list[] = file.listFiles();
		if (list.length == 0) {
			System.out.println("하위 폴더 및 파일이 존재하지 않습니다.");
		} else {
			for (File f : list) {
				if (f.isDirectory()) {
					System.out.println("------------------------");
					System.out.println("[" + f.getName() + "]");
					printFileList(f);
				} else {
					System.out.println("- " + f.getName());
				}
			}
		}
	}

	public static void writeTextFile(File file) {
		FileWriter fw = null;
		Scanner sc = null;
		try {
			fw = new FileWriter(file);
			sc = new Scanner(System.in);
			System.out.println("exit :: q");
			while (true) {
				System.out.print("input:: ");
				String input = sc.nextLine();
				if (input.equals("q")) {
					break;
				}
				fw.write(input + "\n");
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fw.close();
				sc.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
