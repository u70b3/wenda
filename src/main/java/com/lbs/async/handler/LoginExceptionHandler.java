package com.lbs.async.handler;

import com.lbs.async.EventModel;
import com.lbs.async.EventType;
import com.lbs.util.MailSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

/**
 * Created by lbs on 2018/4/30.
 */
@Component
public class LoginExceptionHandler implements EventHandler {
    @Autowired
    MailSender mailSender;

    @Override
    public void doHandle(EventModel model) {
//        // xxxx判断发现这个用户登陆异常
//        Map<String, Object> map = new HashMap<String, Object>();
//        map.put("username", model.getExt("username"));
////        mailSender.sendWithHTMLTemplate(model.getExt("email"), "登陆IP异常", "mails/login_exception.html", map);
//        mailSender.sendWithHTMLTemplate("184937612@qq.com", "登陆IP异常", "mails/login_exception.html", map);
    }

    @Override
    public List<EventType> getSupportEventTypes() {
        return Arrays.asList(EventType.LOGIN);
    }
}
