/*
 * Copyright 2017-2025 msun.com All right reserved. This software is the confidential and proprietary information of
 * msun.com ("Confidential Information"). You shall not disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into with msun.com.
 */
package com.ms.commons.cookie.parser;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import com.ms.commons.cookie.CookieKeyEnum;
import com.ms.commons.cookie.CookieNameEnum;
import com.ms.commons.cookie.annotation.CookieDomain;
import com.ms.commons.cookie.annotation.CookieNamePolicy;
import com.ms.commons.cookie.annotation.CookiePath;

/**
 * 一个CookieName配置项
 * 
 * @author zxc Apr 12, 2014 7:39:36 PM
 */
public class CookieNameConfig {

    private String             cookieName;
    private CookieDomain       domain;
    private int                maxAge;
    private boolean            isEncrypt;
    private boolean            isSimpleValue;
    private CookiePath         path;
    /** 该Cookie中包含所有的CookieKey */
    private Set<CookieKeyEnum> allKeys = new HashSet<CookieKeyEnum>();

    public CookieNameConfig(CookieNameEnum cookieName, CookieNamePolicy cookieNamePolicy) {
        this.cookieName = cookieName.getCookieName();
        this.domain = cookieNamePolicy.domain();
        this.maxAge = cookieNamePolicy.maxAge();
        this.isEncrypt = cookieNamePolicy.isEncrypt();
        this.isSimpleValue = cookieNamePolicy.isSimpleValue();
        this.path = cookieNamePolicy.path();
    }

    /**
     * 将所有配置在该cookiename下的cookiekey添加进来
     */
    public void appendKey(CookieKeyEnum key) {
        CookieKeyEnum tmp = CookieKeyEnum.getEnum(key.getKey());
        if (tmp != null) {
            allKeys.add(key);
        }
    }

    public String getCookieName() {
        return cookieName;
    }

    public CookieDomain getDomain() {
        // security copy for immutable
        return CookieDomain.getEnum(domain.getDomain());
    }

    public int getMaxAge() {
        return maxAge;
    }

    public boolean isEncrypt() {
        return isEncrypt;
    }

    public boolean isSimpleValue() {
        return isSimpleValue;
    }

    public CookiePath getPath() {
        // security copy for immutable
        return CookiePath.getEnum(path.getPath());
    }

    /**
     * 返回的是不可变集合
     */
    public Set<CookieKeyEnum> getAllKeys() {
        return Collections.unmodifiableSet(this.allKeys);
    }

    /**
     * 判断一个CookieKey是否是该CookieName下的
     */
    public boolean isKeyWithIn(CookieKeyEnum cookieKeyEnum) {
        return this.allKeys.contains(cookieKeyEnum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("CookieConfig:[");
        sb.append(" domain: " + domain.getDomain());
        sb.append(" maxAge: " + this.maxAge);
        sb.append(" isEncrypt: " + this.isEncrypt);
        sb.append(" isSimpleVaue: " + this.isSimpleValue);
        sb.append(" path: " + this.path);
        sb.append(" ]");
        return sb.toString();
    }
}
