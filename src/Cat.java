import java.io.IOException;
import java.io.InputStream;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IOUtils;

public class Cat {
	public static void cat(String url){
		FileSystem fs = Setup.initFs();
		try {
			InputStream in = fs.open(new Path(url));
			Configuration conf = new Configuration();
			IOUtils.copyBytes(in, System.out, conf);
		} catch (IllegalArgumentException | IOException e) {
			System.out.println("Erreur Copy");
			e.printStackTrace();
		}
	}
}

