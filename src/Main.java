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

    roadMap = roadGenerator.testCreateRoadImage(100);

    /*
    // Write the image to disk
    try {
      ImageIO.write(roadMap, "JPEG", new File("maps/roads.jpg"));
    } catch (IOException e) {
      e.printStackTrace();
    }
    */

    // Testing L-system
    ProductionManager pm = new ProductionManager();
    ProductionRule pr1 = new ProductionRule(1, "a", "ab");
    ProductionRule pr2 = new ProductionRule(2, "b", "a");

    pm.addRule(pr1);
    pm.addRule(pr2);

    Axiom a = new Axiom("a");
    for(int i = 0; i < 5; i++){
      System.out.println(a.getSeqence());
      a = pm.applyRules(a);
    }
  }
}

