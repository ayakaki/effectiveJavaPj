package trial_instance;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import common.Const;
import common.getMyPath;
import trial_instance.person.Trainer;

public class Trial {
    Trainer trainer = new Trainer("いぬ太郎");

    private final String nameListPath = Const.FILE_PATH_NAME_LIST;
    private final String pjPathStr = getMyPath.getPjPathStr();
    private final String nameListFullPath = pjPathStr + nameListPath;

    public Trial(){
        // メソッド呼び出し等
        trainer.walkWithDog();
        trainer.makeTrick();

        // ファイル読み込み
        Path path = Paths.get(nameListFullPath);

        try {
            String content = Files.readString(path);
            System.out.println(content);
        } catch(IOException ex) {
            System.out.println("error");
        }


    }
}
