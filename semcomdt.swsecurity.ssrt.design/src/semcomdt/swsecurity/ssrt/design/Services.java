package semcomdt.swsecurity.ssrt.design;

import org.eclipse.emf.ecore.EObject;

import semcomdt.swsecurity.ssrt.Solution;

/**
 * The services class used by VSM.
 */
public class Services {
    
    /**
    * See http://help.eclipse.org/neon/index.jsp?topic=%2Forg.eclipse.sirius.doc%2Fdoc%2Findex.html&cp=24 for documentation on how to write service methods.
    */
    public EObject myService(EObject self, String arg) {
       // TODO Auto-generated code
    	
      return self;
    }
    public Solution color(Solution solution, String arg) {
    	switch (solution.getSolutionLevel()) {
    	case CONCEPTUAL:
    		
    	case DESIGN:
    	
    	case REALIZATION:
    		
    	}
    	return solution;
    }
}
