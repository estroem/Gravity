import javafx.geometry.Point2D;
import javafx.scene.paint.Color;

public class Planet {
	private Point2D pos;
	private double radius;
	private double density = 30;
	
	public Planet(Point2D pos, double radius) {
		this.pos = pos;
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public void setSize(double radius) {
		this.radius = radius;
	}
	
	public double getMass() {
		return ((4/3) * Math.PI * radius * radius * radius * density);
	}

	public Point2D getPos() {
		return pos;
	}

	public void setPos(Point2D pos) {
		this.pos = pos;
	}
	
	public boolean overlaps(Planet other) {
		return getPos().distance(other.getPos()) < this.getRadius() + other.getRadius();
	}
	
	public void draw(DrawHelper dh) {
		dh.setFill(Color.WHITE);
		dh.fillOval(pos.getX() - radius, pos.getY() - radius, radius * 2, radius * 2);
	}
}
