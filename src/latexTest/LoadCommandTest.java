package latexTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import org.junit.jupiter.api.Test;

import GUI.LatexEditorView;
import latexData.LoadCommand;

class LoadCommandTest {

	@Test
	void LoadCommandTest() throws IOException {
		LatexEditorView tsiouGui = new LatexEditorView();
		Path tempFile = Files.createTempFile("latex-editor-load-test", ".tex");
		Files.writeString(tempFile,
			"\\documentclass{book}\n"
				+ "\\begin{document}\n"
				+ "Test document\n"
				+ "\\end{document}\n");

		LoadCommand lc = new LoadCommand(tsiouGui);
		tsiouGui.setPath(tempFile.toString());
		lc.execute();

		assertFalse(lc.getView().getTextArea().getText().isEmpty());
		assertEquals("Book", lc.getView().getTemplateType());
	}

}
