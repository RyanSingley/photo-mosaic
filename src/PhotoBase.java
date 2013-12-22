import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;


public class PhotoBase {
	List<Photo> photos;

	public PhotoBase(){
		photos=new ArrayList<Photo>();
		
	}
	public void addPhoto(BufferedImage img){
		//determine aspect ratio, should be square, could fix if close
		
		//change resolution
		
		photos.add(new Photo(img));
		
	}
	public Photo getPhoto(int idx){//TODO different key values -- probably rgb characteristics
		
		return photos.get(idx);
	}
	
	
}
