package com.lbs.async.handler;

import com.lbs.async.EventModel;
import com.lbs.async.EventType;

import java.util.List;

/**
 * Created by lbs on 2018/4/30.
 */
public interface EventHandler {
    void doHandle(EventModel model);

    List<EventType> getSupportEventTypes();
}
