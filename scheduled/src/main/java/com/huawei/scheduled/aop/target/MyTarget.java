package com.huawei.scheduled.aop.target;

import com.huawei.scheduled.aop.annotate.FirstAspect;
import org.springframework.stereotype.Component;

@Component
@FirstAspect
public class MyTarget {
    public void fuck() {
        System.out.println("fuck");
    }
}
