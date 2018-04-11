package com.hxy.modules.common.validator;

import com.hxy.modules.common.common.WorkflowException;
import org.apache.commons.lang.StringUtils;

/**
 * 类Assert的功能描述:
 * 数据校验
 * @auther hxy
 * @date 2017-08-25 16:18:34
 */
public abstract class Assert {

    public static void isBlank(String str, String message) {
        if (StringUtils.isBlank(str)) {
            throw new WorkflowException(message);
        }
    }

    public static void isNull(Object object, String message) {
        if (object == null) {
            throw new WorkflowException(message);
        }
    }
}
