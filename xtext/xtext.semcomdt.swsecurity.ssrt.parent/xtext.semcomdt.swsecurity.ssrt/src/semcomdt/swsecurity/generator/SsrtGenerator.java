package semcomdt.swsecurity.generator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

import semcomdt.swsecurity.ssrt.Model;
import semcomdt.swsecurity.ssrt.SolutionTree;

public class SsrtGenerator extends AbstractGenerator {

	@Override
	public void doGenerate(Resource input, IFileSystemAccess2 fsa, IGeneratorContext context) {
		EObject _head = IterableExtensions.<EObject>head(input.getContents());
		final Model model = ((Model) _head);
		URI _uRI = input.getURI();
		int _segmentCount = input.getURI().segmentCount();
		int _minus = (_segmentCount - 1);
		String _get = _uRI.segment(_minus).split("[.]")[0];
		String _plus = (_get + ".xml");
		StringConcatenation _builder = new StringConcatenation();
		_builder.append("<model> ");
		_builder.newLine();
		{
			EList<SolutionTree> _solutiontrees = model.getSolutiontrees();
			for (final SolutionTree st : _solutiontrees) {
				_builder.append("<solutiontree name=\"");
				String _name = st.getName();
				_builder.append(_name);
				_builder.append("\"> ");
				_builder.append("<relation type=\"contributesTo\"> ");
				_builder.append("</relation>");
				_builder.newLineIfNotEmpty();
				_builder.append("\t\t");
				_builder.newLine();
				_builder.append("</solutiontree>");
				_builder.newLine();
			}
		}
		_builder.append("</model>");
		_builder.newLine();
		fsa.generateFile(_plus, _builder);
	}
	// Call to the persistence every time it is saved

}
