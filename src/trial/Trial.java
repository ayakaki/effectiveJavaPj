package trial;

import common.Const;
import trial.person.Trainer;

public class Trial {
    Trainer trainer = new Trainer("いぬ太郎");
    public String nameList = Const.FILE_PATH_NAME_LIST;

    public Trial(){
        trainer.walkWithDog();
        trainer.makeTrick();
        System.out.println(nameList);
    }
}
