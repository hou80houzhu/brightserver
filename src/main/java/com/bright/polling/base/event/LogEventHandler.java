package com.bright.polling.base.event;

import com.bright.polling.base.ConnectManager.PollingConnect;
import com.bright.polling.base.PollingResponse;
import javax.servlet.http.HttpServletRequest;

public class LogEventHandler extends BaseEventHandler {

    @Override
    public void onConnect(PollingConnect connect, HttpServletRequest request, PollingResponse response) {
        System.out.println("--connect--" + connect.getId());
    }

    @Override
    public void onClose(PollingConnect connect, PollingResponse response) {
        System.out.println("--close--" + connect.getId());
    }

}
