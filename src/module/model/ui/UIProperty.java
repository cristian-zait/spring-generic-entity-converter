package module.model.ui;

public class UIProperty<T> {

	private String name;
	
	private T value;
	
	public UIProperty() {
	}
	
	public UIProperty(String name, T value){
		this.name = name;
		this.value = value;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setValue(T value) {
		this.value = value;
	}
	
	public T getValue() {
		return value;
	}

	@Override
	public String toString() {
		return "UIProperty [name=" + name + ", value=" + value + "]";
	}
	
}
