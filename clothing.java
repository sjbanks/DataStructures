

public class clothing {
	String size;
	String color;
	
	public clothing() {
		super();
	}	
	public clothing(String size, String color) {
		super();
		this.size = size;
		this.color = color;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "clothing [size=" + size + ", color=" + color + "]";
	}
}
