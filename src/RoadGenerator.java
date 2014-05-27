import java.awt.*;
import java.awt.geom.Line2D;
import java.awt.image.BufferedImage;
import java.util.*;

/**
 * Created by mac on 2014-05-05.
 */
public class RoadGenerator {

  private final double SEGMENT_LENGTH = 100.0d; // in pixels
  private final double L_STREET_MIN_DISTANCE = 100.0d; // in pixels
  private final double M_STREET_MIN_DISTANCE = 100.0d; // in pixels
  private final double S_STREET_MIN_DISTANCE = 25.0d; // in pixels
  private final double L_SYSTEM_SEED = 1.0d;

  private final int ROAD_WIDTH_WIDE = 5;
  private final int ROAD_WIDTH_NORMAL = 3;
  private final int ROAD_WIDTH_NARROW = 2;

  public RoadGenerator() {
  }

  public BufferedImage generateRoad(BufferedImage heightMap, BufferedImage populationMap) {

    int width = heightMap.getWidth();
    int height = heightMap.getHeight();

    if(width != populationMap.getWidth() || height != populationMap.getHeight()) {
      System.out.println("The size of the height map and the population map does not match");
      return null;
    }

    // Binary matrix M = (y, x) where 1 means that a road can be built on pixel (x, y)
    int[][] geography = new int[height][width];

    // Binary matrix M = (y, x) where 1 means that a high population area is found on pixel (x, y)
    int[][] population = new int[height][width];

    for(int x = 0; x < width; x++) {
      for(int y = 0; y < height; y++) {

        // Check for geographical conditions on this pixel
        Color c = new Color(heightMap.getRGB(x, y));
        if(c.getRed() > 0 || c.getGreen() > 0 || c.getBlue() > 0) {
          geography[y][x] = 1;

          // If roads can be built on this pixel, check for population conditions
          c = new Color(populationMap.getRGB(x, y));
          if(c.getRed() > 0 || c.getGreen() > 0 || c.getBlue() > 0) {

            // The the population size based on the population map
            int size = (c.getRed() + c.getGreen() + c.getBlue()) / 3; // Average grayscale
            population[y][x] = size;
          }
        }
      }
    }

    // Variable storing all road segments
    Set<RoadEdge> roadEdges = generateRoadSegments(L_SYSTEM_SEED, geography, population);

    // Draw an image given the set of RoadSegments
    BufferedImage roadImg = createRoadImage(width, height, roadEdges);

    return roadImg;
  }

  /**
   * Generates RoadSegments using an L-system algorithm with noise caused by a given seed.
   * @param seed The seed that alters the road generation result.
   * @param geography The geography map storing all locations where roads can be built.
   * @param population The population map storing all locations of high population density.
   * @return A map, mapping pixel coordinates to a RoadSegments.
   */
  private Set<RoadEdge> generateRoadSegments(double seed, int[][] geography, int[][] population) {

    Set<RoadEdge> roads = new HashSet<RoadEdge>();

    // TODO - Finish the implementation.

    // Find a start position

    // Create large roads, between high population locations

    // Create medium roads, that cannot be too close to each other

    // Create small roads, to fill the rest


    ArrayList<RoadNode> roadNodes = new ArrayList<>();

    Set<PopulationNode> populationNodes = new TreeSet<>();

    for(int y = 0; y < population.length; y++) {
      for(int x = 0; x < population[y].length; x++) {

        int size = population[y][x];

        if(size > 0) {
          populationNodes.add(new PopulationNode(new Vec2(x, y), size));
        }
      }
    }

    return roads;
  }

  /**
   * Returns an image of a road network, given a set of roads to draw.
   * @param width The width of the image.
   * @param height The height of the image.
   * @param roads The set of roads to be drawn.
   * @return The road network image.
   */
  private BufferedImage createRoadImage(int width, int height, Set<RoadEdge> roads) {

    Color bgColor = Color.WHITE;
    Color roadColor = Color.BLACK;

    BufferedImage img = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);

    Graphics2D g = img.createGraphics();
    g.setColor(bgColor);
    g.fillRect(0, 0, width, height);
    g.setColor(roadColor);

    for(RoadEdge road : roads) {

      switch (road.getType()) {
        case WIDE:
          g.setStroke(new BasicStroke(ROAD_WIDTH_WIDE));
          break;
        case NORMAL:
          g.setStroke(new BasicStroke(ROAD_WIDTH_NORMAL));
          break;
        case NARROW:
          g.setStroke(new BasicStroke(ROAD_WIDTH_NARROW));
          break;
        default:
          break;
      }

      Vec2 from = road.getFrom();
      Vec2 to = road.getTo();

      g.draw(new Line2D.Double(from.x, from.y, to.x, to.y));
    }

    return img;
  }


  public BufferedImage testCreateRoadImage (int numRoads) {
    int width = 512;
    int height = 512;

    Set<RoadEdge> roads = new HashSet<RoadEdge>();

    Random rand = new Random(System.currentTimeMillis());
    for(int i = 0; i < numRoads; i++)  {
      Vec2 from = new Vec2(rand.nextInt(width), rand.nextInt(height));
      Vec2 to = new Vec2(rand.nextInt(width), rand.nextInt(height));

      RoadEdge.TYPE type = RoadEdge.TYPE.WIDE;
      int roadEdgeTypeIndex = rand.nextInt(3);
      if(roadEdgeTypeIndex == 0) {
        type = RoadEdge.TYPE.NARROW;
      } else if(roadEdgeTypeIndex == 1) {
        type = RoadEdge.TYPE.NORMAL;
      }

      roads.add(new RoadEdge(type, from , to));
    }

    return createRoadImage(width, height, roads);
  }

}
