package programowanie2.sprawdzaniePliku.file;

import java.util.Map;

public interface IFileService {
    Map<String, Long> GetBigFiles(String path);
}
