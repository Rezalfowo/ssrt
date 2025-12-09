package semcomdt.swsecurity.generator;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.resource.XtextResource;

public class SsrtGenerator extends AbstractGenerator{
	

	@Override
	public void doGenerate(Resource input, IFileSystemAccess2 fsa, IGeneratorContext context) {
		XtextResource resource = (XtextResource) input;
		URI uri = resource.getURI();
		System.out.println(uri);
		// Call to the persistence every time it is saved
	}

}
