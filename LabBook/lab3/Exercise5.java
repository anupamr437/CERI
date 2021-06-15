/*Write a Java program that displays the number of characters, lines and words in a text*/
package lab3;

import java.io.*;

public class Exercise5 {

	static void textExtract(String fileLocation) throws IOException {
		File file = new File(fileLocation);
		BufferedReader buffReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
		String tempLine;
		int cWord = 0, cSentence = 0, cCharacter = 0;

		while ((tempLine = buffReader.readLine()) != null) { // Reading line by line from the file until a null is
																// returned (empty line)

			cCharacter += tempLine.length();
			String[] wordList = tempLine.split("\\s+"); // \\s+ is the space delimiter in java
			cWord += wordList.length;
			String[] sentenceList = tempLine.split("[!?.:]+"); // [!?.:]+ is the sentence delimiter in java
			cSentence += sentenceList.length;
		}

		System.out.println("Total word count\t\t= " + cWord);
		System.out.println("Total number of lines\t\t= " + (cSentence - 1));
		System.out.println("Total number of characters\t= " + cCharacter);

		buffReader.close();
	}

	public static void main(String[] args) throws IOException {
		String fileLocation = "D:\\Example.txt";
		textExtract(fileLocation);
	}
}
