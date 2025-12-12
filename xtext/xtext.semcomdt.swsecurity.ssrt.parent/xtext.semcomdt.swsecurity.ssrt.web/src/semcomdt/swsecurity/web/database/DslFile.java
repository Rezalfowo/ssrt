package semcomdt.swsecurity.web.database;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class DslFile {
	private Integer id;

	String filename;
	String extension;
	String content;

	public Integer getId() {
		return id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public DslFile(Integer id, String filename, String extension, String file) {
		this.id = id;
		this.filename = filename;
		this.extension = extension;
		this.content = file;
	}

	public DslFile() {
	}

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public String getExtension() {
		return extension;
	}

	public void setExtension(String extension) {
		this.extension = extension;
	}

	public void createTempFile(File directory, String content) {
		try {
			File file = new File(directory, filename + "." + extension);
			file.createNewFile();
			BufferedWriter out = new BufferedWriter(new FileWriter(file));
			out.write(content);
			out.close();
			System.out.println("Added content");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
