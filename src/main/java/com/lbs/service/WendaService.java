package com.lbs.service;

import org.springframework.stereotype.Service;

/**
 * Created by lbs on 2018/4/10.
 */
@Service
public class WendaService {
    public String getMessage(int userId) {
        return "Hello Message:" + String.valueOf(userId);
    }
}
