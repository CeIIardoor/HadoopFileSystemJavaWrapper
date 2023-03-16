import java.io.IOException;

import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;

public class Copy {
	public static void copyFromLocalFile(String from, String to){
		FileSystem fs = Setup.initFs();
		try {
			fs.copyFromLocalFile(new Path(from), new Path(to));
		} catch (IllegalArgumentException | IOException e) {
			System.out.println("Erreur Copy");
			e.printStackTrace();
		}
	}
	
	public static void copyToLocalFile(String from, String to){
		FileSystem fs = Setup.initFs();
		try {
			fs.copyToLocalFile(new Path(from), new Path(to));
		} catch (IllegalArgumentException | IOException e) {
			System.out.println("Erreur Copy");
			e.printStackTrace();
		}
	}
}
