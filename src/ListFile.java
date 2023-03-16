import java.io.IOException;
import org.apache.hadoop.fs.FileStatus;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;

public class ListFile {
	
	public static void ls(String url){
		
		FileSystem fs = Setup.initFs();
		FileStatus[] file = null;
		
		try {
			file = fs.listStatus(new Path(url));
		} catch (IllegalArgumentException | IOException e) {
			e.printStackTrace();
		}
		for(FileStatus f :file){
			System.out.println(f.getPath().getName());
		}
	}
}
