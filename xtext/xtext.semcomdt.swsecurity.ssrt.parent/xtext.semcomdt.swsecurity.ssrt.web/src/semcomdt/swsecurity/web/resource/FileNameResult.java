package semcomdt.swsecurity.web.resource;

import java.util.List;

import org.eclipse.xtext.web.server.IServiceResult;

public class FileNameResult implements IServiceResult {
	private final List<String> filename;

	public FileNameResult(List<String> filename) {
		this.filename = filename;
	}

	public List<String> getFilename() {
		return filename;
	}
}
