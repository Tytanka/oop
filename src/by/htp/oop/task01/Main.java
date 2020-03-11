package by.htp.oop.task01;

public class Main {
	public static void main(String[] args) {
		Word word = new Word("Весна");
		Text text = new Text(word);

		Word word1 = new Word("Солнце");
		Word word2 = new Word("пригрело.");
		Word word3 = new Word("Прилетели");
		Word word4 = new Word("грачи.");

		Sentence sentence = new Sentence();
		sentence.addSentence(word1);
		sentence.addSentence(word2);
		sentence.addSentence(word3);
		sentence.addSentence(word4);

		text.addText(sentence);
		ViewText.printText(text);

	}
}
