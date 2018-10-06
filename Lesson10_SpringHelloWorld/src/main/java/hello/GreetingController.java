package hello;

// Controller

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController  // 注释：告诉spring此类为RESTful API 的 controller。
public class GreetingController {

    private static final String template = "Hello5599, %s!";
    // 原子操作, 因为Spring默认是支持多线程的
    private final AtomicLong counter = new AtomicLong();

    // 告诉spring，当用户访问 /greeting 这个路径的时候，调用相关的逻辑。
    @RequestMapping("/greeting")
    public String greeting(@RequestParam(value="name", defaultValue = "World") String name) {
                            // count += 1;return counter;
        // 返回一个类的话，spring会自动调用该类的getter/setter方法并拼接成json格式返回。
        // return new Greeting(counter.incrementAndGet(), String.format(template, name));

        // 直接返回字符串的形式
        return String.format(template,name);
    }

    // 框架 -- 框架负责调用用户的代码。
    // 库 -- 用户调用库的代码。
}