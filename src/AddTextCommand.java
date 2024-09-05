
public class AddTextCommand implements ICommand{
	private TextEditor editor;
	private String text;
	
	public AddTextCommand(TextEditor editor, String text) {
		this.editor = editor;
		this.text = text;
	}
	
	@Override
	public void execute() {
		editor.addText(text);
		System.out.println(editor.toString());
	}

	@Override
	public void undo() {
		int i = text.length();
		int start = editor.toString().length() - i;
		editor.removeText(start);
		System.out.println(editor.toString());
	}
	
}
