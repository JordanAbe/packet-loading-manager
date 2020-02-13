package tech.zdev.packages.loading.packetloadingmanager;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import tech.zdev.packages.loading.packetloadingmanager.config.MvcConfig;
import tech.zdev.packages.loading.packetloadingmanager.config.RootConfig;

public class SpringInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	public SpringInitializer() {
//		System.setProperty("spring.profiles.active", "prod");
		System.setProperty("ENV", "dev");
	}

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class<?>[] { RootConfig.class };
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class<?>[] { MvcConfig.class };
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] { "/" };
	}

}