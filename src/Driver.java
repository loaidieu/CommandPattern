
public class Driver {
	public static void main(String[] args)
	{
		CommandManager manager = new CommandManager();
		TextEditor editor = new TextEditor("Today is the great day because i learn so many new thing. Knowledge is power.");
		String textToAdd = "Follow what you like. success will follow you.";
		ICommand appendTextCommand = new AddTextCommand(editor, textToAdd);
		manager.executeCommand(appendTextCommand);
		manager.undo();
		manager.redo();
		
		
		System.out.println("----------------------------");
		System.out.println("original text is ");
		System.out.println(editor.toString());
		ICommand removeCommand = new RemoveTextCommand(editor,6,15);
		manager.executeCommand(removeCommand);
		manager.undo();
	}
}
