package spring

import work.pollochang.aop.ExampleInterceptor

// Place your Spring DSL code here
beans = {
    /*
     * Spring AOP 設定
     */
    xmlns aop: "http://www.springframework.org/schema/aop"
    // 初始化攔截器
    aspectBean(ExampleInterceptor)
    aop.config("proxy-target-class": true) {
    }

}
