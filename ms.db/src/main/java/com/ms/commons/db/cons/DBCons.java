/*
 * Copyright 2017-2025 msun.com All right reserved. This software is the confidential and proprietary information of
 * msun.com ("Confidential Information"). You shall not disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into with msun.com.
 */
package com.ms.commons.db.cons;

/**
 * @author zxc Apr 12, 2013 5:23:38 PM
 */
public interface DBCons {

    /**
     * 数据库中字符串最大长度<br>
     * oracle中varchar2最大长度4000,用UTF-8存储,每个中文占3个字节
     */
    int    MAX_STRING_LENGTH  = 1333;

    /**
     * 数据库中一些数据的分隔符
     */
    char   SPLIT_COMMA        = ',';

    /**
     * 数据库中一些数据的分隔符
     */
    String SPLIT_COMMA_STRING = ",";
}
