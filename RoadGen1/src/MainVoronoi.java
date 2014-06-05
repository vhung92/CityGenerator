import java.util.List;

public class MainVoronoi {
  public static void main(String[] args) {
    Voronoi voronoi = new Voronoi(0.001);
    
    double[] xcoords = new double[]{1.0, 1.0, 5.0, 5.0};
    double[] ycoords = new double[]{1.0, 3.0, 1.0, 3.0};

    List<GraphEdge> graphEdges = voronoi.generateVoronoi(xcoords, ycoords, 0.0, 6.0, 0.0, 4.0);

    for (GraphEdge ge : graphEdges) {
      System.out.println("Edge: from: (" + ge.x1 + ", " + ge.y1 + "), to: (" + ge.x2 + ", " + ge.y2 + ")");
    }
  }
}
