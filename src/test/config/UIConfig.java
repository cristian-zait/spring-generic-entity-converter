package test.config;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import module.model.ui.UIConfiguration;
import module.model.ui.UIProperty;
import test.repository.UIConfigurationRepository;

@Configuration
public class UIConfig {

	@Autowired
	private UIConfigurationRepository repository;
	
	@PostConstruct
	public void init(){
		
		UIConfiguration<String> testConfig = new UIConfiguration<>();
		List<UIProperty<String>> testProperties = testConfig.getProperties();
		testProperties.add(new UIProperty<String>("propName", "Name"));
		
		repository.save(testConfig);
	}
	
}
