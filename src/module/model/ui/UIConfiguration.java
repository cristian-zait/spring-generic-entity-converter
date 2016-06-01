package module.model.ui;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="uiConfiguration")
public class UIConfiguration<T> {

	@Id
	private String id;
	
	private String name;
	
	private T defaultValue = null;
	
	private List<UIProperty<T>> properties = new ArrayList<UIProperty<T>>();
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getId() {
		return id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setDefaultValue(T defaultValue) {
		this.defaultValue = defaultValue;
	}
	
	public T getDefaultValue() {
		return defaultValue;
	}
	
	public void setProperties(List<UIProperty<T>> properties) {
		this.properties = properties;
	}
	
	public List<UIProperty<T>> getProperties() {
		return properties;
	}
	
}
