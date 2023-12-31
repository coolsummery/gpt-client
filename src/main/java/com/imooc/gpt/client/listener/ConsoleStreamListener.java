package com.imooc.gpt.client.listener;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ConsoleStreamListener extends AbstractStreamListener {


    @Override
    public void onMsg(String message) {
        System.out.print(message);
    }

    @Override
    public void onError(Throwable throwable, String response) {

    }

}
