import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by mac on 2014-05-05.
 */
public class RoadGenerator {

  private final double SEGMENT_LENGTH = 100.0d; // in pixels
  private final double L_STREET_MIN_DISTANCE = 100.0d; // in pixels
  private final double M_STREET_MIN_DISTANCE = 100.0d; // in pixels
  private final double S_STREET_MIN_DISTANCE = 25.0d; // in pixels
  private final double L_SYSTEM_SEED = 1.0d;

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
        if(c.getRed() > 0 || c.getGreen() > 0 || c.getBlue() < 0) {
          geography[y][x] = 1;

          // If roads can be built on this pixel, check for population conditions
          c = new Color(populationMap.getRGB(x, y));
          if(c.getRed() > 0 || c.getGreen() > 0 || c.getBlue() < 0) {
            population[y][x] = 1;
          }
        }
      }
    }

    // Variable storing all road segments
    HashMap<Vec2, RoadSymbol> roadSegments = generateRoadSegments(L_SYSTEM_SEED, geography, population);

    // Draw an image given the set of RoadSegments
    BufferedImage roadMap = drawRoadMap(width, height, roadSegments);

    return roadMap;
  }

  /**
   * Generates RoadSegments using an L-system algorithm with noise caused by a given seed.
   * @param seed The seed that alters the road generation result.
   * @param geography The geography map storing all locations where roads can be built.
   * @param population The population map storing all locations of high population density.
   * @return A map, mapping pixel coordinates to a RoadSegments.
   */
  private HashMap<Vec2, RoadSegment> generateRoadSegments(double seed, int[][] geography, int[][] population) {

    HashMap<Vec2, RoadSegment> roadSegments = new HashMap<Vec2, RoadSegment>();

    // TODO - Finish the implementation.

    // Find a start position

    // Create large roads, between high population locations

    // Create medium roads, that cannot be too close to each other

    // Create small roads, to fill the rest


    ArrayList<RoadNode> roadNodes = new ArrayList<RoadNode>();

    int maxCityArea = 10;

    boolean foundPopulation = false;
    for(int y = 0; y < population.length; y++) {
      for(int x = 0; x < population[y].length; x++) {
        if(population[y][x] > 0) {

          System.out.println("Found a population. X: " + x + " Y: " + y);

          boolean alreadyFoundCity = false;

          for(int yPopulation = y; yPopulation >= 0 && yPopulation > (y - maxCityArea); yPopulation--) {
            for(int xPopulation = x; xPopulation >= 0 && xPopulation > (x - maxCityArea); xPopulation--) {
              if(population[yPopulation][xPopulation] > 0) {
                alreadyFoundCity = true;
                break;
              }
            }
            if(alreadyFoundCity) {
              break;
            }
          }

          if(!alreadyFoundCity) {
            roadNodes.add(new RoadNode(new Vec2(x, y)));
          }
        }
      }
    }



    System.out.println(roadNodes.size());







    return roadSegments;
  }


  /**
   * Create an image representation of the roads.
   * @param width The width of the image.
   * @param height The height of the image.
   * @param roadSegments The roads to be drawn.
   * @return An image representation of the roads.
   */
  private BufferedImage drawRoadMap(int width, int height, HashMap<Vec2, RoadSegment> roadSegments) {

    // TODO - Finish the implementation.

    return null;
  }

}
