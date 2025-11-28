package semcomdt.swsecurity.scoping

import com.google.inject.Inject
import org.eclipse.xtext.resource.impl.ResourceDescriptionsProvider
import org.eclipse.emf.ecore.EObject

class SolutionTreeIndex {
  @Inject ResourceDescriptionsProvider rdp
  def  getResourceDescription(EObject o) {
    val index = rdp.getResourceDescriptions(o.eResource)
    index.getResourceDescription(o.eResource.URI)
  }

  def getExportedEObjectDescriptions(EObject o) {
    o.getResourceDescription.getExportedObjects
  }
}