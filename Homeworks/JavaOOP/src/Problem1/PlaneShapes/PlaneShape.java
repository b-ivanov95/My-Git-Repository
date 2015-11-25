package Problem1.PlaneShapes;

import Problem1.Interfaces.AreaMesurable;
import Problem1.Interfaces.PerimeterMeasurable;
import Problem1.Shape;
import Problem1.Vertex;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Borislav on 11/10/2015.
 */
public abstract class PlaneShape extends Shape implements AreaMesurable, PerimeterMeasurable {

    private double area;
    private double perimeter;

    public PlaneShape(ArrayList<Vertex2D> vertices) {
        this.setListVertices(vertices);
    }

    protected abstract double calculatingArea();
    protected abstract double calculatingPerimeter();

    public double getArea() {
        return area;
    }

    public double getPerimeter() {
        return perimeter;
    }
}
