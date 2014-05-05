import java.awt.*;
import java.awt.image.BufferedImage;

/**
 * Created by mac on 2014-05-05.
 */
public class RoadGenerator {

  public RoadGenerator() {

  }

  public BufferedImage generateRoad(BufferedImage heightMapImg) {

    int width = heightMapImg.getWidth();
    int height = heightMapImg.getHeight();

    for(int x = 0; x < width; x++) {
      for(int y = 0; y < height; y++) {
        Color c = new Color(heightMapImg.getRGB(x, y));
        int r = c.getRed();
        int g = c.getGreen();
        int b = c.getBlue();
        System.out.println("X: " + x + " Y: " + y + " RGB: (" + r  + ", " + g + ", " + b + ")");
      }
    }

    System.out.println("Done");

    return null;
  }
}
