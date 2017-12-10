package com.creditease.match.test.dis;

import com.lmax.disruptor.EventFactory;

/**
 * Created by wayne on 17/12/9.
 */
public class DisruptorFactory implements EventFactory<FileData>{
    @Override
    public FileData newInstance() {
        return new FileData();
    }
}
