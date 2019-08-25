package programowanie2.sprawdzaniePliku.file;

import java.io.File;
import java.util.Map;
import java.util.TreeMap;

public class FileService implements IFileService {

    Map<String, Long> filesToShow = new TreeMap<>();

    public Map<String, Long> GetBigFiles(String path) {
        File fileOrDirectory = new File(path);
        CheckFiles(fileOrDirectory);

        return filesToShow;
    }

    private Map<String, Long> CheckFiles(File fileOrDirectory) {
        if (fileOrDirectory.isDirectory()) {
            for (File file : fileOrDirectory.listFiles()) {
                if (file.isFile()) {
                    ProcessFile(file);
                } else if (file.isDirectory()) {
                    CheckFiles(file);
            }
            }
        }
        else {
            ProcessFile(fileOrDirectory);
        }
        return null;
    }

    private void ProcessFile(File file) {
        long fileSize = GetFileSize(file.length());

        if (fileSize > 10){
            filesToShow.put(file.getAbsolutePath(), fileSize);
        }
    }

    private long GetFileSize(long size) {
        return size / 1024 / 1024; // converts size from bytes to megabytes and checks if it satisfies business rule
    }
}
