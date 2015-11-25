package Problem1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Borislav on 11/10/2015.
 */
public abstract class Shape {
    private ArrayList<Vertex> listVertices;


    public ArrayList<Vertex> getListVertices() {
        return listVertices;
    }

    public void setListVertices(ArrayList<Vertex> listVertices) {
        for (Vertex vertex : listVertices) {
            this.listVertices.add(vertex);
        }
    }

}
