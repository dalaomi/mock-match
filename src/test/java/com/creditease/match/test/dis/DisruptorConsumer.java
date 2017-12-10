package com.creditease.match.test.dis;

import com.lmax.disruptor.WorkHandler;

/**
 * Created by wayne on 17/12/9.
 */
public class DisruptorConsumer implements WorkHandler<FileData> {
    private static final String FINIDHED = "EOF";

    @Override
    public void onEvent(FileData event) throws Exception {
        String line = event.getLine();

        if (line.equals(FINIDHED)) {
            return;
        }
        // 消费
        String[] arrStr = line.split(",");
        if (arrStr.length != 2) {
            return;
        }
        int ret = Integer.parseInt(arrStr[0]) + Integer.parseInt(arrStr[1]);
        System.out.println(ret);
    }
}
