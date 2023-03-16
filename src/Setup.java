import java.io.IOException;
import java.net.URI;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;


public class Setup {

	public static FileSystem initFs() {
		String url="hdfs://quickstart.cloudera:8020/user";
		Configuration conf = new Configuration();
		try {
			FileSystem fs = FileSystem.get(URI.create(url), conf);
			return fs;
		} catch (IOException e) {
			System.out.println("Erreur FS URI create");
			e.printStackTrace();					
		}
		return null;
	}
}
