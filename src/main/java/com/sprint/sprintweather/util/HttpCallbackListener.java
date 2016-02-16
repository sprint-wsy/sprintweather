package com.sprint.sprintweather.util;

/**
 * Created by wsy on 2016/2/16.
 */
public interface HttpCallbackListener {
    void onFinish(String response);

    void onError(Exception e);
}
