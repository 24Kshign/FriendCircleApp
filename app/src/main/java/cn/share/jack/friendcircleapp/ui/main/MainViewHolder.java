package cn.share.jack.friendcircleapp.ui.main;

import android.support.annotation.Nullable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.jack.mc.cyg.cygtools.adapter.recyclerview.CygBaseRecyclerViewHolder;
import com.jack.mc.cyg.cygtools.drawableresource.CygDrawableResource;
import com.jack.mc.cyg.cygtools.glide.GlideUtil;

import cn.share.jack.friendcircleapp.R;
import cn.share.jack.friendcircleapp.model.main.MainInfo;

/**
 * Created by jack on 2017/6/12
 */

public class MainViewHolder extends CygBaseRecyclerViewHolder<MainInfo> {

    private ImageView ivAvatar;
    private TextView tvTitle;
    private TextView tvContent;

    public MainViewHolder(View view) {
        super(view);
        ivAvatar = findView(R.id.im_iv_avatar);
        tvTitle = findView(R.id.im_tv_title);
        tvContent = findView(R.id.im_tv_content);
    }

    @Override
    protected void onItemDataUpdated(@Nullable MainInfo mainInfo) {
        GlideUtil.setDrawable(ivAvatar, new CygDrawableResource(mainInfo.getPicSmall()), R.mipmap.ic_launcher_round);
        tvTitle.setText(mainInfo.getName());
        tvContent.setText(mainInfo.getDescription());
    }
}
