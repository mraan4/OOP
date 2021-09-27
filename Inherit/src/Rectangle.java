
public class Rectangle extends Shape {
	private int width, height;

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	double area() {
		return (double) width * height;
	}
	void draw() {
		System.out.println("("+this.getX() + "," + this.getY() +") 좌표에 가로 : " + this.width + " 세로 : " + this.height);
		System.out.println("면적 : " _+ area());
	}
}
