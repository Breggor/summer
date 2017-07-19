/*
 * Copyright 2017-2025 msun.com All right reserved. This software is the confidential and proprietary information of
 * msun.com ("Confidential Information"). You shall not disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into with msun.com.
 */
package com.ms.commons.fasttext.similitude;

/**
 * 相似度比较
 * 
 * @author zxc Apr 12, 2013 3:23:19 PM
 */
public interface SimilitudeText {

    public double similitudeValue(IDocument src, IDocument dest);
}
