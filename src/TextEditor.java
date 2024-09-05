
public class TextEditor {
	private StringBuilder text;
	
	public TextEditor(String text) {
		this.text = new StringBuilder(text);
	}
	
	public void addText(String append) {
		text.append(append);
	}
	
	public void removeText(int i) {
		text.delete(i, text.length());
	}
	
	@Override
	public String toString()
	{
		return text.toString();
	}
}
