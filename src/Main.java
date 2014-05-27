import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * Created by mac on 2014-05-05.
 */
public class Main {

  private static final String IMG_GEOGRAPHY = "maps/sthlm_bw.jpg";
  private static final String IMG_POPULATION = "maps/sthlm_pop.jpg";

  public static void main(String[] args) {
    RoadGenerator roadGenerator = new RoadGenerator();
    BufferedImage heightMap = ImageHandler.loadImg(IMG_GEOGRAPHY);
    BufferedImage populationMap = ImageHandler.loadImg(IMG_POPULATION);
    BufferedImage roadMap = roadGenerator.generateRoad(heightMap, populationMap);

    roadMap = roadGenerator.testCreateRoadImage(200);


    // Write the image to disk
    try {
      ImageIO.write(roadMap, "JPEG", new File("maps/roads.jpg"));
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
