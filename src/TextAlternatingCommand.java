
public abstract class TextAlternatingCommand implements ICommand{
	protected TextEditor editor;
	protected String text;
	protected int start_index;
	protected int end_index;
	
	public TextAlternatingCommand(TextEditor editor, String text, int start) {
		this.editor = editor;
		this.text = text;
		this.start_index = start;
	}
	
	public TextAlternatingCommand(TextEditor editor, int start, int end)
	{
		this.editor = editor;
		this.start_index = start;
		this.end_index = end;
	}
	
	@Override
	public abstract void execute();

	@Override
	public abstract void undo();	
}
