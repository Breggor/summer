/*
 * Copyright 2017-2025 msun.com All right reserved. This software is the confidential and proprietary information of
 * msun.com ("Confidential Information"). You shall not disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into with msun.com.
 */
package com.ms.commons.summer.web.view.velocity;

/**
 * @author zxc Apr 12, 2013 4:22:42 PM
 */
public class ViewContent {

    private String content;

    public ViewContent(String content) {
        this.content = content;
    }

    public String toString() {
        if (this.content == null) return "";
        return this.content;
    }
}
