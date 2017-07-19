/*
 * Copyright 2017-2025 msun.com All right reserved. This software is the confidential and proprietary information of
 * msun.com ("Confidential Information"). You shall not disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into with msun.com.
 */
package com.ms.commons.test;

import org.springframework.test.AbstractTransactionalDataSourceSpringContextTests;

import com.ms.commons.test.classloader.IntlTestURLClassPath;
import com.ms.commons.test.integration.jmockit.internal.JMockItUtil;

/**
 * @author zxc Apr 13, 2013 11:17:19 PM
 */
public abstract class AbstractBaseTestCase extends AbstractTransactionalDataSourceSpringContextTests {

    static {
        JMockItUtil.startUpJMockItIfPossible();
        JMockItUtil.mockUpDecorators();
        IntlTestURLClassPath.initIntlTestURLClassLoader();
    }
}
