package semcomdt.swsecurity.web;

import org.eclipse.xtext.generator.IGenerator2;
import org.eclipse.xtext.scoping.IGlobalScopeProvider;

import semcomdt.swsecurity.AbstractSsrtRuntimeModule;
import semcomdt.swsecurity.web.generator.SsrtWebGenerator;
import semcomdt.swsecurity.web.resource.SsrtWebScopeProvider;

public class SsrtRuntimeWebModule extends AbstractSsrtRuntimeModule {
	@Override
	public Class<? extends IGlobalScopeProvider> bindIGlobalScopeProvider() {
		return SsrtWebScopeProvider.class;
	}

	@Override
	public Class<? extends IGenerator2> bindIGenerator2() {
		return SsrtWebGenerator.class;
	}

}
