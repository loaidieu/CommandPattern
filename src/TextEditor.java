
public class TextEditor {
	private StringBuilder text;
	
	public TextEditor(String text) {
		this.text = new StringBuilder(text);
	}
	
	public void addText(String append, int start_index) {
		text.insert(start_index, append);
	}
	
	public void removeText(int start, int end) {
		text.delete(start, end);
	}
	
	public String getString(int start, int end) {
		return text.substring(start, end);
	}
	
	public int getLastIndex()
	{
		return text.length();
	}
	
	@Override
	public String toString()
	{
		return text.toString();
	}
}
