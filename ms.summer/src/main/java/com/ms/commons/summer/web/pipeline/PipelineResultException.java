/*
 * Copyright 2017-2025 msun.com All right reserved. This software is the confidential and proprietary information of
 * msun.com ("Confidential Information"). You shall not disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into with msun.com.
 */
package com.ms.commons.summer.web.pipeline;

/**
 * @author zxc Apr 12, 2013 4:16:12 PM
 */
public class PipelineResultException extends RuntimeException {

    private static final long serialVersionUID = -308937022332488651L;

    public PipelineResultException(String messge) {
        super(messge);
    }
}
