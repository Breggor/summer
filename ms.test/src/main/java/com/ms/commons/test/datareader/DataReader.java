/*
 * Copyright 2017-2025 msun.com All right reserved. This software is the confidential and proprietary information of
 * msun.com ("Confidential Information"). You shall not disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into with msun.com.
 */
package com.ms.commons.test.datareader;

import com.ms.commons.test.memorydb.Data;

/**
 * NOTICE: data reader is singleton, keep it thread safe
 * 
 * @author zxc Apr 13, 2013 11:34:18 PM
 */
public interface DataReader {

    void init();

    void destory();

    String defaultExt();

    Data read(String resourceName);
}
