package cn.share.jack.friendcircleapp.presenter;

/**
 * Created by jack on 2017/6/12
 */

public class BasePresenter<VIEW> {

    public VIEW mView;

    public void attachView(VIEW mView) {
        this.mView = mView;
    }

    public void detachView() {
        this.mView = null;
    }
}