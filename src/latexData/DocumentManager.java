package latexData;
import java.io.*;
import java.util.HashMap;

import javax.swing.ImageIcon;

public class DocumentManager {
	
	private static HashMap <String, Document> templates  = new HashMap <String,Document> ();
	
	public DocumentManager() {
	}
	
	public String getTemplateText(int mode, String path) {
		String records = "";
		String fileName = "";
		String resourcePath = "";

		if (mode == 1) {
			fileName = "ReportTemplate.tex";
			resourcePath = "/tex/templates/" + fileName;
		} else if (mode == 2) {
			fileName = "LetterTemplate.tex";
			resourcePath = "/tex/templates/" + fileName;
		} else if (mode == 3) {
			fileName = "BookTemplate.tex";
			resourcePath = "/tex/templates/" + fileName;
		} else if (mode == 4) {
			fileName = "ArticleTemplate.tex";
			resourcePath = "/tex/templates/" + fileName;
		} else if (mode == 5) {
			fileName = "EmptyTemplate.tex";
			resourcePath = "/tex/templates/" + fileName;
		} else if (mode == 6) {
			fileName = "Latex_Ref.txt";
			resourcePath = "/txt/" + fileName;
		} else if (mode == 7) {
			fileName = "manual.txt";
			resourcePath = "/txt/" + fileName;
		} else if (mode == 8) {
			fileName = path;
			try {
				FileReader fileReader = new FileReader(fileName);
				BufferedReader bufferedReader = new BufferedReader(fileReader);
				String line;
				while ((line = bufferedReader.readLine()) != null) {
					records += line + "\n";
				}
				bufferedReader.close();
			} catch (FileNotFoundException ex) {
				System.out.println("Unable to open file '" + fileName + "'");
			} catch (IOException ex) {
				System.out.println("Error reading file '" + fileName + "'");
			}
			return records;
		}

		if (!resourcePath.isEmpty()) {
			try (InputStream inputStream = this.getClass().getResourceAsStream(resourcePath)) {
				if (inputStream == null) {
					throw new FileNotFoundException("Resource not found: " + resourcePath);
				}
				BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
				String line;
				while ((line = bufferedReader.readLine()) != null) {
					records += line + "\n";
				}
			} catch (FileNotFoundException ex) {
				System.out.println("Unable to open file '" + fileName + "'");
			} catch (IOException ex) {
				System.out.println("Error reading file '" + fileName + "'");
			}
		}
		return records;
	}
	
	public void initDocs() {
		Document report = new Document(null ,null, null, "v1", this.getTemplateText(1, ""), null, null);
		Document book = new Document(null, null, null, "v1", this.getTemplateText(3, ""), null, null);
		Document article = new Document(null, null, null, "v1", this.getTemplateText(4, ""), null, null);
		Document letter = new Document(null, null, null, "v1", this.getTemplateText(2, ""), null, null);
		Document empty = new Document(null, null, null, "v1", this.getTemplateText(5, ""), null, null);
		templates.put("Report", report);
		templates.put("Book", book);
		templates.put("Article", article);
		templates.put("Letter", letter);
		templates.put("Empty", empty);
		return;
	}

	public Document createDocument(String DocId){ 
		System.out.println("CreateDocument");
        Document doc = templates.get(DocId);
        return (Document) doc.clone();
	}
	
	public HashMap <String, Document> getTemplates() {
		return this.templates;
	}
}