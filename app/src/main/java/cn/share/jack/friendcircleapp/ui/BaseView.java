package cn.share.jack.friendcircleapp.ui;

/**
 * Created by jack on 2017/6/12
 */

public interface BaseView<T> {
    void showToast(String msg);

    void getSuccessData(T data);

    void getFailureData(Throwable t);
}