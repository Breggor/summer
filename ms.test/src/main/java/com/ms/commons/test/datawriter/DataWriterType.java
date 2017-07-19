/*
 * Copyright 2017-2025 msun.com All right reserved. This software is the confidential and proprietary information of
 * msun.com ("Confidential Information"). You shall not disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into with msun.com.
 */
package com.ms.commons.test.datawriter;

/**
 * @author zxc Apr 13, 2013 11:32:57 PM
 */
public enum DataWriterType {

    Excel("xls"),

    Xml("xml"),

    Json("json"),

    Wiki("wiki");

    private String ext;

    DataWriterType(String ext) {
        this.ext = ext;
    }

    public String getExt() {
        return this.ext;
    }

    public String toString() {
        return this.name() + "(" + this.ext + ")";
    }
}
