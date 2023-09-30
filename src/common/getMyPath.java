package common;

import java.nio.file.Path;
import java.nio.file.Paths;

public class getMyPath {
    // インスタンス生成禁止
    private getMyPath(){}

    public static String getPjPathStr(){

        Path path = Paths.get("");  // カレントディレクトリ取得
        Path fullPath = path.toAbsolutePath();  //フルパス取得

        return fullPath.toString();
    }
}
