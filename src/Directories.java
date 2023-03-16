import java.io.IOException;

import org.apache.hadoop.fs.*;




public class Directories {
		
public static void mkdir(String url) {
	
		FileSystem fs = Setup.initFs();
		try {
			fs.mkdirs(new Path(url));
		} catch (IllegalArgumentException | IOException e) {
			System.out.println("Erreur MkdirBndir");
			e.printStackTrace();
		}
	}


public static void rmdir(String url) {
	FileSystem fs = Setup.initFs();
		try {
			fs.delete(new Path(url),true);
		} catch (IllegalArgumentException | IOException e) {
			System.out.println("Erreur MkdirBndir");
			e.printStackTrace();
		}
	}
}
