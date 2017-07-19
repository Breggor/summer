/*
 * Copyright 2017-2025 msun.com All right reserved. This software is the confidential and proprietary information of
 * msun.com ("Confidential Information"). You shall not disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into with msun.com.
 */
package com.ms.commons.nisa.mina.server;

/**
 * @author zxc Apr 12, 2013 6:47:08 PM
 */
public interface MinaCallback {

    /**
     * 当MinaServer端有操作时会通知外面。例如：日志更新会通知
     * 
     * @param obj
     * @return
     */
    Object notifyAction(Object obj);
}
