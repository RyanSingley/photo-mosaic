import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;


public class PhotoTester {

	public static void main(String[] args) {
		PhotoBase pbase=new PhotoBase();
		BufferedImage img = null;
		try {
		    img = ImageIO.read(new File("Alincoln.jpg"));
		} catch (IOException e) {
		}
		pbase.addPhoto(img);
		Photo link=pbase.getPhoto(0);
	}

}
