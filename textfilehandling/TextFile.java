package textfilehandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TextFile {

	String path;
	Scanner scan = new Scanner(System.in);

	 void createTextFile() {

		System.out.println("Enter the name of the file");

		String nameTheFile = scan.nextLine();

		String getThePath = System.getProperty("user.dir");
		path = getThePath + File.separator + nameTheFile;

		File textfile = new File(path);

		try {

			boolean createfile = textfile.createNewFile();
			System.out.println("File i present or Not:" + textfile.exists());
		}

		catch (IOException e1) {
			e1.printStackTrace();
		}
	}

	public void checkTheWords() {

		Scanner scan = new Scanner(System.in);

		int Length;

		System.out.println("Enter the Length: ");
		Length = scan.nextInt();
		scan.nextLine();

		try {

			FileWriter fwrite = new FileWriter(path);
			BufferedWriter Writer = new BufferedWriter(fwrite);

			for (int index = 0; index < Length; index++) {

				Writer.write(scan.nextLine());
				Writer.newLine();
			}

			Writer.flush();
			Writer.close();

			int Count = 0;
			int words = 0;

			FileReader freader = new FileReader(path);
			BufferedReader reader = new BufferedReader(freader);

			String lenghtLine;

			while ((lenghtLine = reader.readLine()) != null) {

				Count++;

				String[] split = lenghtLine.split(" ");
				words = words + split.length;

			}
			System.out.println("Total line of the File:" + Count);
			System.out.println("Total word of the File:" + words);

			System.out.println("Everything is Okay");

		} catch (IOException e) {
			System.out.println("Something Wrong");
		}

	}

}