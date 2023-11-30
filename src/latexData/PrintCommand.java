package latexData;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import GUI.LatexEditorView;

public class PrintCommand implements Command {

	private LatexEditorView view;
	
	public PrintCommand(LatexEditorView view) {
		this.view = view;
	}
	
	public void execute() {
		String message = "Dude...Really now, you want to print that thing?";
		JOptionPane.showMessageDialog(new JFrame(), message, "Whaaaat...?",
			        JOptionPane.ERROR_MESSAGE);
	}

	
}
