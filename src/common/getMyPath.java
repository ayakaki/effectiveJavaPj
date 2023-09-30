package common;

import java.nio.file.Path;
import java.nio.file.Paths;

public class getMyPath {
    private getMyPath(){}

    public static String getPjPathStr(){
        Path path = Paths.get("");
        Path fullPath = path.toAbsolutePath();

        return fullPath.toString();
    }
}
