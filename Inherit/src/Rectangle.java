
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
		System.out.println("("+this.getX() + "," + this.getY() +") ��ǥ�� ���� : " + this.width + " ���� : " + this.height);
		System.out.println("���� : " _+ area());
	}
}
