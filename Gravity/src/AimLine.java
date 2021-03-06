import javafx.geometry.Point2D;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class AimLine {
	private Point2D start;
	private Point2D end;
	
	public AimLine(Point2D start, Point2D end) {
		this.start = start;
		setEnd(end);
	}
	
	public void draw(GraphicsContext gc) {
		gc.setStroke(Color.RED);
		gc.strokeLine(start.getX(), start.getY(), end.getX(), end.getY());
	}
	
	public Point2D getStart() {
		return start;
	}

	public void setStart(Point2D start) {
		this.start = start;
	}

	public Point2D getEnd() {
		return end;
	}

	public void setEnd(Point2D end) {
		this.end = end;
	}
}
