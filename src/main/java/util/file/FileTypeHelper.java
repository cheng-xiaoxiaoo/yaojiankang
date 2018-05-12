package util.file;

import java.util.HashMap;
import java.util.Map;

public class FileTypeHelper {
private static final Map<String, String> fileTypeMap = new HashMap<>();
	
	static {
		fileTypeMap.put("image/jpeg", "jpg");
		fileTypeMap.put("image/gif", "gif");
		fileTypeMap.put("image/png", "png");
		fileTypeMap.put("image/svg+xml", "svg");
	}

	public static String translateTypeToExt(String type) {
		return fileTypeMap.get(type);
	}

	public static String getExtensionName(String filename) {
		if ((filename != null) && (filename.length() > 0)) {
			int dot = filename.lastIndexOf('.');
			if ((dot > -1) && (dot < (filename.length() - 1))) {
				return filename.substring(dot + 1);
			}
			return null;
		}
		return null;
	}

}
