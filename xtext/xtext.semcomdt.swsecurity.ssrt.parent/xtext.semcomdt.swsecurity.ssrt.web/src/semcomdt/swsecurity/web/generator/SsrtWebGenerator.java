package semcomdt.swsecurity.web.generator;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipse.xtext.resource.XtextResource;

import semcomdt.swsecurity.generator.SsrtGenerator;
import semcomdt.swsecurity.web.database.Database;
import semcomdt.swsecurity.web.database.DslFile;

public class SsrtWebGenerator extends AbstractGenerator {
	@Override
	public void doGenerate(Resource input, IFileSystemAccess2 fsa, IGeneratorContext context) {
		XtextResource resource = (XtextResource) input;
		URI uri = resource.getURI();
		DslFile dslfile = new DslFile();

		String[] file = uri.toString().split("\\.(?=[^.]*$)");
		dslfile.setExtension(file[file.length - 1]);
		String[] filename = file[0].split("/");
		dslfile.setFilename(filename[filename.length - 1]);
		String newText = "";
		IParseResult parseResult = resource.getParseResult();
		if (parseResult != null) {
			ICompositeNode rootNode = parseResult.getRootNode();
			if (rootNode != null) {
				String text = rootNode.getText();
				if (text != null) {
					newText = text;
				}
			}
		}
		dslfile.setContent(newText);
		Database.updateFile(dslfile);
		SsrtGenerator ssrtGenerator = new SsrtGenerator();
		ssrtGenerator.doGenerate(input, fsa, context);

		// Call to the persistence every time it is saved
	}
}
