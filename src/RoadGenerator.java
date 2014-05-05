import java.awt.*;
import java.awt.image.BufferedImage;

/**
 * Created by mac on 2014-05-05.
 */
public class RoadGenerator {

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

    //printMap(population);

    return null;
  }

  public void printMap(int[][] m) {

    int height = m.length;
    int width = m[0].length;

    for(int y = 0; y < height; y++) {
      for(int x = 0; x < width; x++) {
        System.out.print(m[y][x]);
      }
      System.out.println();
    }
  }

}
