# Scanario
## Imagine you are developing a text editor application. Users can perform various operations such as cutting, copying, and pasting text. The application needs to support undo functionality, allowing users to revert the last operation performed. The Command pattern is used to implement these operations as commands, enabling users to execute, undo, and redo actions seamlessly.
~~~
// Command interface
interface Command {
    void execute();
}

// Receiver class
class TextEditor {
    void cut() {
        System.out.println("Text is cut");
    }

    void copy() {
        System.out.println("Text is copied");
    }

    void paste() {
        System.out.println("Text is pasted");
    }
}

// Concrete Command classes
class CutCommand implements Command {
    private TextEditor editor;

    CutCommand(TextEditor editor) {
        this.editor = editor;
    }

    @Override
    public void execute() {
        editor.cut();
    }
}

class CopyCommand implements Command {
    private TextEditor editor;

    CopyCommand(TextEditor editor) {
        this.editor = editor;
    }

    @Override
    public void execute() {
        editor.copy();
    }
}

class PasteCommand implements Command {
    private TextEditor editor;

    PasteCommand(TextEditor editor) {
        this.editor = editor;
    }

    @Override
    public void execute() {
        editor.paste();
    }
}

// Invoker class
class User {
    private Command command;

    void setCommand(Command command) {
        this.command = command;
    }

    void executeCommand() {
        command.execute();
    }
}

// Client code
public class Main {
    public static void main(String[] args) {
        // Create instance for the text editor
        TextEditor editor = new TextEditor();

        // Create concrete command instances
        Command cutCommand = new CutCommand(editor);
        Command copyCommand = new CopyCommand(editor);
        Command pasteCommand = new PasteCommand(editor);

        // Perform operations using commands
        User user = new User();

        user.setCommand(cutCommand);
        user.executeCommand(); // Outputs: Text is cut

        user.setCommand(copyCommand);
        user.executeCommand(); // Outputs: Text is copied

        user.setCommand(pasteCommand);
        user.executeCommand(); // Outputs: Text is pasted
    }
}
~~~
