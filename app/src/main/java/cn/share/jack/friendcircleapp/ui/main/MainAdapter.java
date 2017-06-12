package cn.share.jack.friendcircleapp.ui.main;

import android.content.Context;
import android.view.ViewGroup;

import com.jack.mc.cyg.cygtools.adapter.recyclerview.CygBaseRecyclerAdapter;
import com.jack.mc.cyg.cygtools.inputmethod.CygView;

import cn.share.jack.friendcircleapp.R;
import cn.share.jack.friendcircleapp.model.main.MainInfo;

/**
 * Created by jack on 2017/6/12
 */

public class MainAdapter extends CygBaseRecyclerAdapter<MainInfo, MainViewHolder> {

    public MainAdapter(Context context) {
        super(context);
    }

    @Override
    public MainViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new MainViewHolder(CygView.inflateLayout(getContext(), R.layout.item_main, parent, false));
    }
}
