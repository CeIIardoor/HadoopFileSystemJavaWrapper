import java.io.IOException;

import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
public class Delete {
	public static void rm(String url){
		FileSystem fs = Setup.initFs();
		try {
			fs.delete(new Path(url), true);
		} catch (IllegalArgumentException | IOException e) {
			System.out.println("Erreur Copy");
			e.printStackTrace();
		}
	}
}