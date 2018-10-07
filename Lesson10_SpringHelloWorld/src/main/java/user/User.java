package user;

public class User {
    private String name;
    private String content;

    public User(){}  // 默认空的构造函数（spring规定一定要有）

    public User(String name, String content) {
        this.name = name;
        this.content = content;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getName() {
        return name;
    }

    public String getContent() {
        return content;
    }
}
