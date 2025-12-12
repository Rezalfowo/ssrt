package semcomdt.swsecurity.web;

import org.eclipse.xtext.web.server.IServiceContext;
import org.eclipse.xtext.web.server.InvalidRequestException;
import org.eclipse.xtext.web.server.XtextServiceDispatcher;

import com.google.inject.Inject;

import semcomdt.swsecurity.web.resource.FileNameResult;
import semcomdt.swsecurity.web.service.FileLoaderService;

public class SsrtServiceDispatcher extends XtextServiceDispatcher {
	@Inject
	private FileLoaderService fileLoaderService;

	@Override
	protected ServiceDescriptor createServiceDescriptor(String serviceType, IServiceContext context) {
		if (serviceType != null) {
			switch (serviceType) {
			case "load":
				return getLoadResourceService(false, context);
			case "revert":
				return getLoadResourceService(true, context);
			case "save":
				return getSaveResourceService(context);
			case "update":
				return getUpdateDocumentService(context);
			case "assist":
				return getContentAssistService(context);
			case "validate":
				return getValidationService(context);
			case "hover":
				return getHoverService(context);
			case "highlight":
				return getHighlightingService(context);
			case "occurrences":
				return getOccurrencesService(context);
			case "format":
				return getFormattingService(context);
			case "generate":
				return getGeneratorService(context);
			case "fileloader":
				return getFileLoaderService(context);
			default:
				throw new InvalidRequestException.InvalidParametersException(
						"The service type '" + serviceType + "' is not supported.");
			}
		} else {
			throw new InvalidRequestException.InvalidParametersException(
					"The service type '" + serviceType + "' is not supported.");
		}
	}

	protected ServiceDescriptor getFileLoaderService(IServiceContext context) throws InvalidRequestException {
		ServiceDescriptor serviceDescriptor = new ServiceDescriptor();
		serviceDescriptor.setService(() -> {
			try {
				return new FileNameResult(
						fileLoaderService.retrieveFromDatabase(context.getParameter("resource").replace(".", "")));
			} catch (Throwable throwable) {
				return handleError(serviceDescriptor, throwable);
			}
		});

		return serviceDescriptor;
	}

}
