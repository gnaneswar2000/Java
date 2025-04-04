package com.gnani.fileExamples;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class FileExamples {

	File f = new File("./Learning/Sample.txt");

	public static void main(String[] args) throws IOException {
		FileExamples fe = new FileExamples();
		// fe.fileInputStream();
		// fe.scannerExample();
		// fe.fileReaderExample();
		//fe.bufferReaderExample();
		fe.fileWriteExample2();
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

	public void bufferReaderExample() {
		
		
		try {
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
		catch(IOException ex) {
			
		}
		
	}
	
	public void fileWriteExample1() throws IOException {
		FileOutputStream fos = new FileOutputStream(f);
		String text = "Hello I'm a Java Developer";
		int out;
		for (int i = 0; i<text.length(); i++) {
			fos.write((int)text.toCharArray()[i]);
		}
		fos.close();
	}
	
	public void fileWriteExample2() throws IOException {
		FileWriter fw = new FileWriter(f);
		String text = "Hello I'm a Java Developer, I need a job badly";
		for(String i: text.split(" ")) {
			fw.write(i);
			fw.write(" ");
		}
		fw.close();
	}
}
