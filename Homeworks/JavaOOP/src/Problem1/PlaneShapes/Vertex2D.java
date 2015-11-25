package Problem1.PlaneShapes;

import Problem1.Vertex;

/**
 * Created by Borislav on 11/10/2015.
 */
public class Vertex2D extends Vertex {

    public Vertex2D(int x, int y) {
        super(x, y);
    }

    @Override
    public String toString() {
        return "Vertex2D x:" + getX() + ", y:" + getY();
    }
}
