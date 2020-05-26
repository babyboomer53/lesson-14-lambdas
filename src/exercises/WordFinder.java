package exercises;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
//import java.nio.Buffer;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WordFinder {

	static ArrayList<String> words = new ArrayList<String>();
	static List<String> wordList = new ArrayList<>();

	public static void main(String[] args) {
		/* Print all the words beginning with P that are over 10 characters. */

		wordList = loadWordList();
		words.addAll(wordList);
		Stream<String> streamOfWords = words.stream();

		System.out.println(
				"All words beginning with a capital P that are at least eleven characters long.");
		streamOfWords.filter(string -> string.startsWith("P"))
				.filter(string -> string.length() > 10)
				.collect(Collectors.toList()).forEach(System.out::println);
	}

	public static List<String> loadWordList() {
		List<String> messages = new ArrayList<String>();
		File file = new File("resource/words.txt");

		try {
			BufferedReader buffer = new BufferedReader(new FileReader(file));
			String aLine;
			while ((aLine = buffer.readLine()) != null) {
				messages.add(aLine);

			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return messages;
	}

}
