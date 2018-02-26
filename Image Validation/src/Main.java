import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        ImageChecker i = new ImageChecker();
        BufferedImage one = ImageIO.read(new File("C:\\Users\\John\\IdeaProjects\\Lynda Projects\\Image Validation\\Pictures\\460249177.jpg"));
        BufferedImage two = ImageIO.read(new File("C:\\Users\\John\\IdeaProjects\\Lynda Projects\\Image Validation\\Pictures\\477899129.jpg"));
        if(one.getWidth() + one.getHeight() >= two.getWidth() + two.getHeight()) {
            i.setOne(one);
            i.setTwo(two);
        } else {
            i.setOne(two);
            i.setTwo(one);
        }
        System.out.println(i.compareImages());
    }
}
