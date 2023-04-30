package org.mall.message;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

/**
 * @program common
 * @description:
 * @author: pengxuanyu
 * @create: 2023/04/30 22:55
 * @version: 1.0
 */
public interface MsgSource {

    @Output("msg-demo")
    MessageChannel msgOutput();
}
