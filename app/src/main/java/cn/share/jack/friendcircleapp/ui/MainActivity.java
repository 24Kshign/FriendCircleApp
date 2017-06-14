package cn.share.jack.friendcircleapp.ui;

import android.support.v7.widget.LinearLayoutManager;

import com.jack.mc.cyg.cygtools.util.CygToast;
import com.share.jack.cygwidget.recyclerview.PtrRecyclerViewUIComponent;
import com.share.jack.cygwidget.refersh.OnPullToRefreshListener;

import java.util.List;

import cn.share.jack.friendcircleapp.R;
import cn.share.jack.friendcircleapp.model.main.MainInfo;
import cn.share.jack.friendcircleapp.presenter.MainPresenter;
import cn.share.jack.friendcircleapp.ui.main.MainAdapter;
import cn.share.jack.friendcircleapp.ui.main.MainView;

public class MainActivity extends BaseActivity<MainPresenter> implements MainView {

    private PtrRecyclerViewUIComponent ptrRecyclerViewUIComponent;
    private MainAdapter adapter;

    @Override
    protected MainPresenter createPresenter() {
        return new MainPresenter(this);
    }

    @Override
    protected void initView() {
        adapter = new MainAdapter(this);
        ptrRecyclerViewUIComponent = (PtrRecyclerViewUIComponent) findViewById(R.id.am_ptr_framelayout);
        ptrRecyclerViewUIComponent.setLayoutManager(new LinearLayoutManager(this));
        ptrRecyclerViewUIComponent.setAdapter(adapter);
        initListener();
    }

    private void initListener() {
        ptrRecyclerViewUIComponent.delayRefresh(100);
        ptrRecyclerViewUIComponent.setOnPullToRefreshListener(new OnPullToRefreshListener() {
            @Override
            public void onPullToRefresh() {
                mPresenter.getMainData(MainActivity.this);
            }
        });
    }

    @Override
    protected int layoutRes() {
        return R.layout.activity_main;
    }

    @Override
    public void showToast(String msg) {
        CygToast.showToast(msg);
    }

    private void runOnMainThread() {
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                ptrRecyclerViewUIComponent.refreshComplete();
            }
        });
    }

    @Override
    public void getSuccessData(List<MainInfo> data) {
        adapter.setDataList(data);
        runOnMainThread();
    }

    @Override
    public void getFailureData(Throwable t) {
        runOnMainThread();
    }
}