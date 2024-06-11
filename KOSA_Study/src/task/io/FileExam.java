package task.io;

import java.io.File;

public class FileExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = "C:\\Users\\KOSA\\\\git\\KCC_Class\\KCC_Java\\src\\kosa";
		File file = new File(path);

		File[] listFiles = file.listFiles();

		open(listFiles, path);
	}

	public static void open(File[] fileList, String path) {
		if (fileList == null) // 중단조건
			return;

		for (File file : fileList) {
			if (file.isDirectory()) { // 폴더 출력 및 들어가기
				System.out.println(file.getName() + " 디렉토리입니다");
				String diretoryPath = path + "\\" + file.getName(); // 들어갈 디렉토리 경로

				open((new File(diretoryPath)).listFiles(), diretoryPath);
			} else {
				System.out.println(file.getName() + " 파일입니다");
			}
		}
	}

}
