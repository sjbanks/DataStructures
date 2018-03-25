

public class socks extends clothing {
	boolean pair;

	public socks() {
		super();
	}
	public socks(String size, String color) {
		super(size, color);
		setPair(true);
	}
	public socks(String size, String color, boolean pair) {
		super(size, color);
		setPair(pair);
	}
	public boolean isPair() {
		return pair;
	}
	public void setPair(boolean pair) {
		this.pair = pair;
	}
	@Override
	public String toString() {
		return "socks [pair=" + pair + ", size=" + size + ", color=" + color + "]";
	}
	

}
