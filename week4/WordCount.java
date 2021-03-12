package week4;

import acm.program.ConsoleProgram;


	import acm.program.*; 
	import java.io.*;
	import java.util.*;
	public class WordCount extends ConsoleProgram {
		
		public void run() {
			int lines = 0;
			int words = 0;
			int chars = 0;
			
			Scanner fileScanner= new Scanner("File: ");
			while (fileScanner.hasNextLine()) {
				String line = fileScanner.nextLine();
				lines++;words += countWords(line);
				chars += line.length();
				}
			fileScanner.close();
				println("Lines = " + lines);
				println("Words = " + words);
				println("Chars = " + chars);
				}
	
	
		private Scanner ScanneropenScanner(String prompt) { 
			Scanner fileScanner= null;
			while (fileScanner== null) {
				String name = readLine(prompt);
				try {fileScanner= new Scanner(new File(name));
				} 
				catch (IOException ex) {
					println("Can't open that file.");
				}
				}
			return fileScanner;
			}
	private int countWords(String line) { 
		boolean inWord = false;
		int words = 0;
		for (int i = 0; i < line.length();i++) {
			char ch = line.charAt(i);
				if (Character.isLetterOrDigit(ch)) {
					inWord = true;
				} 
				else {
					if (inWord) {
						words++;
						}
					inWord = false;
				}
				}
		if (inWord) {
			words++;
				}
				return words;
				}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

