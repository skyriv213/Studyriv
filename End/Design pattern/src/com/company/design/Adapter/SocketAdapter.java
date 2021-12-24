package com.company.design.Adapter;

import com.company.design.Singleton.SocketClient;

public class SocketAdapter implements Electronic110v {

    private Electronic220v electronic220v;

    public SocketAdapter(Electronic220v electronic220v){
        this.electronic220v = electronic220v;
    }
    @Override
    public void poweron() {
        electronic220v.connect();
    }
}
