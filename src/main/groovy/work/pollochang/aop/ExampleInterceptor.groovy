package work.pollochang.aop

import org.aspectj.lang.annotation.AfterReturning
import org.aspectj.lang.annotation.Aspect
import org.aspectj.lang.annotation.Before
import org.springframework.stereotype.Component

/**
 * 範例攔截器
 */
@Aspect
@Component
class ExampleInterceptor {

    @Before("execution(* work.pollochang.example.*.*(..))")
    static void beforeMethodExecution() {
        println "Before method execution..."
    }

    @AfterReturning(pointcut = "execution(* work.pollochang.example.*.*(..))", returning = "result")
    static void afterMethodExecution(Object result) {
        println "After method execution..."
    }
}
