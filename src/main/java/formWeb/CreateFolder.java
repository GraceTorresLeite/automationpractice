package formWeb;

import java.io.File;

public class CreateFolder {
	
	public static void createReportFolder(String path) {
		File pathReportDirectory = new File(path);
		if(!pathReportDirectory.exists()) {
			pathReportDirectory.mkdir();
		}
	}

}
