
public class AddTextCommand extends TextAlternatingCommand{
	public AddTextCommand(TextEditor editor, String text, int start) {
		super(editor, text, start);
	}
	
	@Override
	public void execute() {
		editor.addText(text, start_index);
		System.out.println(editor.toString());
	}

	@Override
	public void undo() {
		int i = text.length();
		int start = editor.toString().length() - i;
		editor.removeText(start, editor.toString().length());
		System.out.println(editor.toString());
	}
	
}
