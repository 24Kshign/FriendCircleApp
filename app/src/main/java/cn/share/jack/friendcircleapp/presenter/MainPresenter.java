package cn.share.jack.friendcircleapp.presenter;

import com.jack.mc.cyg.cygtools.http.callback.BaseImpl;
import com.jack.mc.cyg.cygtools.http.callback.CygBaseObserver;

import java.util.List;

import cn.share.jack.friendcircleapp.model.main.MainInfo;
import cn.share.jack.friendcircleapp.model.main.MainModel;
import cn.share.jack.friendcircleapp.ui.main.MainView;

/**
 * Created by jack on 2017/6/12
 */

public class MainPresenter extends BasePresenter<MainView> {

    public MainPresenter(MainView mainView) {
        attachView(mainView);
    }

    public void getMainData(BaseImpl baseImpl) {
        MainModel.getInstance().execute(new CygBaseObserver<List<MainInfo>>(baseImpl) {
            @Override
            protected void onBaseNext(List<MainInfo> data) {
                mView.getSuccessData(data);
            }

            @Override
            protected void onBaseError(Throwable t) {
                super.onBaseError(t);
                mView.getFailureData(t);
            }
        });
    }
}
