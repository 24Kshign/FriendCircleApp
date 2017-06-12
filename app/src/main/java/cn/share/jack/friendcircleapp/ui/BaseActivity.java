package cn.share.jack.friendcircleapp.ui;

import android.app.Activity;
import android.os.Bundle;

import com.jack.mc.cyg.cygtools.activity.CygBaseActivity;
import com.jack.mc.cyg.cygtools.http.callback.BaseImpl;

import cn.share.jack.friendcircleapp.presenter.BasePresenter;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;

/**
 * Created by jack on 2017/6/12
 */

public abstract class BaseActivity<PRESENTER extends BasePresenter> extends CygBaseActivity implements BaseImpl {

    private CompositeDisposable mCompositeDisposable;

    protected PRESENTER mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (null == mCompositeDisposable) {
            mCompositeDisposable = new CompositeDisposable();
        }
        if (null == mPresenter) {
            mPresenter = createPresenter();
        }
        initView();
    }

    protected abstract PRESENTER createPresenter();

    protected abstract void initView();

    @Override
    public boolean addDisposable(Disposable disposable) {
        if (null != mCompositeDisposable) {
            mCompositeDisposable.add(disposable);
        }
        return true;
    }

    public void onDestroy() {
        super.onDestroy();
        if (null != mCompositeDisposable && mCompositeDisposable.size() > 0) {
            mCompositeDisposable.clear();
        }
        if (mPresenter != null) {
            mPresenter.detachView();
        }
    }

    @Override
    public Activity getActivity() {
        return this;
    }
}