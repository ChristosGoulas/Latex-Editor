package latexTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Set;

import org.junit.jupiter.api.Test;

import latexData.DocumentManager;

class DocumentManagerTest {

	@Test
	void initDocsShouldCreateAllBuiltInTemplates() {
		DocumentManager docManager = new DocumentManager();
		docManager.initDocs();

		Set<String> templates = docManager.getTemplates().keySet();
		assertEquals(5, templates.size());
		assertTrue(templates.contains("Report"));
		assertTrue(templates.contains("Book"));
		assertTrue(templates.contains("Article"));
		assertTrue(templates.contains("Letter"));
		assertTrue(templates.contains("Empty"));
	}

	@Test
	void getTemplateTextShouldReadTemplateContent() {
		DocumentManager docManager = new DocumentManager();
		String content = docManager.getTemplateText(1, "");

		assertNotNull(content);
		assertTrue(content.length() > 0);
		assertTrue(content.contains("documentclass"));
	}
}
