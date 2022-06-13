package filehandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TwoFiles {

int Rcbcount = 0;
int Rcbwords = 0;
String miPath;
String rcbPath;

Scanner scan = new Scanner(System.in);

public void fileOne() {

System.out.println("Enter the first text file");
String miFileName = scan.nextLine();

String filepathMi = System.getProperty("user.dir");
miPath = filepathMi + File.separator + miFileName;

File Mi = new File(miPath);

System.out.println("Enter the second text file");
String rcbFileName = scan.nextLine();

String filepathRcb = System.getProperty("user.dir");
rcbPath = filepathMi + File.separator + rcbFileName;
File Rcb = new File(rcbPath);

try {

boolean createNewFile = Rcb.createNewFile();

System.out.println("File Exists or Not:" + Rcb.exists());

FileWriter fwriter = new FileWriter(rcbPath);
BufferedWriter buffer = new BufferedWriter(fwriter);

buffer.write("Virat");
buffer.newLine();

buffer.write("Faf");
buffer.newLine();

buffer.write("Maxwell");
buffer.newLine();

buffer.write("Dk");
buffer.newLine();

buffer.flush();
buffer.close();

} catch (IOException e) {

System.out.println("Error");
}

try {

boolean createNewFile1 = Mi.createNewFile();
System.out.println("File Exists or Not:" + Mi.exists());

FileWriter fwriter1 = new FileWriter(miPath);
BufferedWriter buffer1 = new BufferedWriter(fwriter1);

buffer1.write("Virat");
buffer1.newLine();

buffer1.write("Faf");
buffer1.newLine();

buffer1.write("Maxwell");
buffer1.newLine();

buffer1.write("Dk");
buffer1.newLine();

buffer1.flush();
buffer1.close();

} catch (IOException e) {

System.out.println("Error");
}

}

public void fileTwo() {
String Path;

System.out.println("Enter the Result text file");
String FileName = scan.nextLine();

String filepathMi = System.getProperty("user.dir");
Path = filepathMi + File.separator + FileName;

try {
FileReader freader = new FileReader(rcbPath);
BufferedReader reader = new BufferedReader(freader);

FileReader freader1 = new FileReader(miPath);
BufferedReader reader2 = new BufferedReader(freader1);

String comp = reader.readLine();
String comp1 = reader2.readLine();
int count = 1;
boolean equal = false;

while (comp != null && comp1 != null) {

if (comp.equalsIgnoreCase(comp1)) {

equal = true;

count++;

File ipl = new File(Path);
ipl.createNewFile();

FileWriter fWriter = new FileWriter(Path);
BufferedWriter bWriter = new BufferedWriter(fWriter);

bWriter.write("The both file are same");
bWriter.flush();
bWriter.close();

} else {
equal = false;

FileWriter fwriter2 = new FileWriter(Path);
BufferedWriter buffered = new BufferedWriter(fwriter2);

buffered.write("The both file are different");
buffered.flush();
buffered.close();

break;
}
comp = reader.readLine();
comp1 = reader2.readLine();
}
}
         
catch (Exception e) {
System.out.println("Something Wrong");

}
System.out.println("Result file created sucessfully");
}
}