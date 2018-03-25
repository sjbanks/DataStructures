

public class shirt extends clothing {
	
	String style;

	public shirt() {
		super();
	}

	public shirt(String size, String color) {
		super(size, color);
		if (!(size.equals("S")&&size.equals("M")&&size.equals("L"))) {
			size = null; 
		}
	}

	public shirt(String style) {
		super();
		this.style = style;
	}

	public String getStyle() {
		return style;
	}

	public void setStyle(String style) {
		this.style = style;
	}

	@Override
	public String toString() {
		return "shirt [style=" + style + ", size=" + size + ", color=" + color + "]";
	}


	

}
