package com.gnani.fileExamples;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileExamples {

	File f = new File("./Learning/Sample.txt");

	public static void main(String[] args) throws IOException {
		FileExamples fe = new FileExamples();
		// fe.fileInputStream();
		// fe.scannerExample();
		// fe.fileReaderExample();
		fe.bufferReaderExample();
	}

	public void fileInputStreamExample() throws IOException {
		if (!f.exists())
			f.createNewFile();
		FileInputStream inp = new FileInputStream(f);
		System.out.println((char) inp.read());
		inp.close();
	}

	public void scannerExample() throws FileNotFoundException {
		Scanner sc = new Scanner(f);
		String text = "";
		while (sc.hasNextLine()) {
			text = sc.nextLine();
			System.out.println(text);
		}
		sc.close();
	}

	public void fileReaderExample() throws IOException {
		FileReader fr = new FileReader(f);
		String text = "";
		int code;
		while (fr.read() != -1) {
			text += (char) fr.read();
			System.out.print(text);
		}
		// System.out.println(text);

		fr.close();
	}

	public void bufferReaderExample() throws IOException {
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		String text = new String();
		String line = new String();

		while ((line = br.readLine()) != null) {
			text += line + "\n";
		}
		System.out.println(text);

		br.close();
		fr.close();
	}
}
