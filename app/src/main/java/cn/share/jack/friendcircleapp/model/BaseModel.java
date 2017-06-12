package cn.share.jack.friendcircleapp.model;

import com.jack.mc.cyg.cygtools.http.BaseRetrofit;
import com.jack.mc.cyg.cygtools.util.CygLog;
import com.jack.mc.cyg.cygtools.util.CygString;

import java.util.HashMap;
import java.util.Map;

import cn.share.jack.friendcircleapp.model.api.FriendCircleApi;

/**
 * Created by jack on 2017/6/12
 */

public class BaseModel extends BaseRetrofit {

    protected FriendCircleApi mServlet;
    protected Map<String, Object> mParams = new HashMap<>();

    public BaseModel() {
        super();
        mServlet=mRetrofit.create(FriendCircleApi.class);
    }

    @Override
    protected Map<String, String> getCommonMap() {
        Map<String, String> mCommonParams = new HashMap<>();
        return mCommonParams;
    }

    protected void addParamStrings(String key, Object value) {
        if (CygString.isEmpty(key)) {
            CygLog.error("key should not be null");
            return;
        }
        mParams.put(key, value);
    }

    protected void addParamStrings(Map<String, String> map) {
        if (null != map) {
            mParams.putAll(map);
        }
    }
}