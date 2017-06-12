package cn.share.jack.friendcircleapp.model.main;

import com.jack.mc.cyg.cygtools.http.HttpFunction;

import java.util.List;

import cn.share.jack.friendcircleapp.model.BaseModel;
import io.reactivex.Observable;
import io.reactivex.Observer;

/**
 * Created by jack on 2017/6/12
 */

public class MainModel extends BaseModel {

    public static MainModel getInstance() {
        return getPresent(MainModel.class);
    }

    public void execute(Observer<List<MainInfo>> observer) {
        Observable observable = mServlet.getMainInfo().map(new HttpFunction());
        toSubscribe(observable, observer);
    }
}
