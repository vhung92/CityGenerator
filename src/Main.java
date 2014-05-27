import javax.imageio.ImageIO;
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

    // DEBUG: Create a random map
    roadMap = roadGenerator.testCreateRoadImage(100);

    // Write the image to disk
    ImageHandler.writeImg(roadMap, "maps/roads.jpg");

    // Testing L-system
    ProductionManager pm = new ProductionManager();
    ProductionRule pr1 = new ProductionRule(1, "a", "ab");
    ProductionRule pr2 = new ProductionRule(2, "b", "a");

    pm.addRule(pr1);
    pm.addRule(pr2);

    String a = "a";
    for(int i = 0; i < 5; i++){
      System.out.println(a);
      a = pm.applyRule(a);
    }
  }
}

