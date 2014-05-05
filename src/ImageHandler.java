import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * Created by mac on 2014-05-05.
 */
public class ImageHandler {

  public static BufferedImage loadImg(String imgPath) {
    BufferedImage img = null;
    try {
      img = ImageIO.read(new File(imgPath));
    } catch (IOException e) {
      e.printStackTrace();
    }
    return img;
  }
}
