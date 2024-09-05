
public class RemoveTextCommand extends TextAlternatingCommand{
	public RemoveTextCommand(TextEditor editor, int start, int end) {
		super(editor, start, end);
	}
	
	@Override
	public void execute() {
		text = editor.getString(start_index, end_index);
		editor.removeText(start_index, end_index);
		System.out.println(editor.toString());
	}

	@Override
	public void undo() {
		editor
	}

}
