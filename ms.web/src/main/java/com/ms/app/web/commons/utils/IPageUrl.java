/*
 * Copyright 2017-2025 msun.com All right reserved. This software is the confidential and proprietary information of
 * msun.com ("Confidential Information"). You shall not disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into with msun.com.
 */
package com.ms.app.web.commons.utils;

/**
 * @author zxc Apr 12, 2013 10:52:57 PM
 */
public interface IPageUrl {

    String getPageUrl(int action, int page, Object... data);
}
