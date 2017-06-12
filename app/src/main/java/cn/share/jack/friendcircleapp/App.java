package cn.share.jack.friendcircleapp;

import com.jack.mc.cyg.cygtools.app.CygApplication;
import com.jack.mc.cyg.cygtools.app.HttpServletAddress;

/**
 * Created by jack on 2017/6/12
 */

public class App extends CygApplication {

    @Override
    public void onCreate() {
        super.onCreate();
        HttpServletAddress.getInstance().setOfflineAddress("http://www.imooc.com/api/");
    }
}
