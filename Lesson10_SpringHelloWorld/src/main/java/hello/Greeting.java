package hello;

// Model
// spring框架会默认自动执行getter/setting 函数，构造json。
public class Greeting {

    private final long id;
    private final String content;

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public int test() {
        int a = 1;
        int b = 2;
        return a + b;
    }
}