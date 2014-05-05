import java.awt.*;
import java.awt.image.BufferedImage;

/**
 * Created by mac on 2014-05-05.
 */
public class Main {

  private static final String IMG_PATH = "maps/sthlm_bw.jpg";

  public static void main(String[] args) {
    RoadGenerator roadGenerator = new RoadGenerator();
    BufferedImage heightMapImg = ImageHandler.loadImg(IMG_PATH);
    BufferedImage roadMapImg = roadGenerator.generateRoad(heightMapImg);
  }
}
