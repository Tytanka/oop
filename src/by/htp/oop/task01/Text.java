package by.htp.oop.task01;

public class Text {
	private String title;
	private String text = "";

	public Text(Word word) {
		title = word.getWord();
	}

	public Text(Sentence sentence) {
		title = sentence.getSentence();
	}

	public String getTitle() {
		return title;
	}

	public void addText(Word word) {
		text += " " + word.getWord();
	}

	public void addText(Sentence sentence) {
		text += " " + sentence.getSentence();
	}

	public String getText() {
		return text;
	}
}
