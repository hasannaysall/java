package workingWithFiles;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void createFile() {
		File file = new File("C:\\javademos\\files\\students.txt");
		try {
			if (file.createNewFile()) {
				System.out.println("Dosya olusturuldu");
			} else
				System.out.println("Dosya zaten var");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void getFileInfo() {
		File file = new File("C:\\javademos\\files\\students.txt");
		if (file.exists()) {
			System.out.println("Dosya adi: " + file.getName());// dosya adini okur
			System.out.println("Dosya yolu: " + file.getAbsolutePath());// dosya yolunu gosterir
			System.out.println("Dosya yazilabilir mi: " + file.canWrite());// dosya yazilabilir mi
			System.out.println("Dosya okunabilir mi: " + file.canRead());// dosya okunabilir mi
			System.out.println("Dosya boyutu(byte): " + file.length());
		}
	}

	public static void readFile() {
		File file = new File("C:\\javademos\\files\\students.txt");
		try {
			Scanner reader = new Scanner(file);
			while (reader.hasNextLine()) {
				String line = reader.nextLine();
				System.out.println(line);
			}
			reader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static void writeFile() {
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\javademos\\files\\students.txt"));
			writer.newLine();
			writer.write("deneme");
			System.out.println("Dosyaya yazildi");
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		// createFile();
		// getFileInfo();
		// readFile();
		writeFile();
		readFile();
	}
}