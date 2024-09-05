import java.util.Stack;

public class CommandManager {
	private Stack<ICommand> undoStack;
	private Stack<ICommand> redoStack;
	
	public CommandManager() {
		undoStack = new Stack<>();
		redoStack = new Stack<>();
	}
	
	public void executeCommand(ICommand command) {
		command.execute();
		undoStack.push(command);
	}
	
	public void undo() {
		if(!undoStack.isEmpty())
		{
			ICommand command = undoStack.pop();
			command.undo();
			redoStack.push(command);
		}
		else
		{
			System.out.println("There is nothing to undo.");
		}
	}
	
	public void redo() {
		if(!redoStack.isEmpty()) {
			ICommand command = redoStack.pop();
			command.execute();
			undoStack.push(command);
		}
		else {
			System.out.println("There is nothing to redo");
		}
	}
}
