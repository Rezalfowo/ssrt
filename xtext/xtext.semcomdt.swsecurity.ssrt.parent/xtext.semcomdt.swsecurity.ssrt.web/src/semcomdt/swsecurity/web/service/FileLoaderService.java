package semcomdt.swsecurity.web.service;

import java.util.List;

import com.google.inject.Singleton;

import semcomdt.swsecurity.web.database.Database;
import semcomdt.swsecurity.web.database.DslFile;

@Singleton
public class FileLoaderService {

	public List<String> retrieveFromDatabase(String filter) {
		List<DslFile> dslfiles = Database.selectAllFiltered(filter);
		List<String> filenames = dslfiles.stream().map(dslfile -> dslfile.getFilename() + "." + dslfile.getExtension())
				.toList();
		return filenames;
	}

}
