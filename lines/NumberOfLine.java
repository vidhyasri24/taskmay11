package lines;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

public class NumberOfLine {

	Scanner scan = new Scanner(System.in);
	String Path;


	public void fileCreation() {

		System.out.println("Enter File name");
		String fileName = scan.nextLine();

		String filePath = System.getProperty("user.dir");
		Path = filePath + File.separator + fileName;
		
		File file = new File(Path);

		try {
			boolean createNewFile = file.createNewFile();
			System.out.println("File Present or Not:" + file.exists());

		} catch (IOException exception1) {
			System.out.println("File is not Created");
		}
	}

	public void write() {

		int length;

		System.out.println("Enter the length");
		length = scan.nextInt();
		scan.nextLine();

		try {

			FileWriter fwriter = new FileWriter(Path);
			BufferedWriter buffer = new BufferedWriter(fwriter);

			for (int index = 0; index < length; index++) {

				buffer.write(scan.nextLine());
				buffer.newLine();

			}
			buffer.flush();
			buffer.close();

		} catch (IOException e) {

			System.out.println("Something Error");
			e.printStackTrace();
		}

	}

}