package cn.share.jack.friendcircleapp.model.api;

import com.jack.mc.cyg.cygtools.http.BaseResponse;

import java.util.List;

import cn.share.jack.friendcircleapp.model.main.MainInfo;
import io.reactivex.Observable;
import retrofit2.http.POST;

/**
 * Created by jack on 2017/6/12
 */

public interface FriendCircleApi {

    @POST("teacher?type=4&num=30")
    Observable<BaseResponse<List<MainInfo>>> getMainInfo();
}