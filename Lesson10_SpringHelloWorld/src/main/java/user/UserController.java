package user;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@RestController
public class UserController {

    // 通过user的名字，映射获得User对象
    private final HashMap<String ,User> users = new HashMap<>();

    /**
     * Spring 通过HTTP请求中的操作，读取request的第一行（请求方法）。
     *  判断调用（GET,POST,PUT,DELETE）+URL 来确定是用哪个方法处理请求。
     *
     * 响应GET/users 这样的请求
     * 查询用户列表
     * @return  返回所有用户列表
     */
    @GetMapping("/users")
    List<User> listUser(){
        return new ArrayList<>(users.values());
    }

    /**
     * 响应 GET /users/{name}
     * 通过User的name查询，返回确定的Users对象
     * @param name
     * @return
     */
    @GetMapping("/users/{name}")
    User getUser(@PathVariable String name){
        return users.get(name);
    }

    /**
     * 创建/添加，一个用户，到用户列表里
     * 响应 POST /users 的请求
     * @param user  // 参数
     * @return   // 返回创建成功的User对象，创建成功返回状态码 201
     */
    @PostMapping("/users")
    User newUser(@RequestBody User user){
        users.put(user.getName(),user);
        return users.get(user.getName());
        // return new ResponseEntity<>(users.get(user.getName()),HttpStatus.CREATED);
    }

    /**
     * 响应 PUT /users/{name} 这样的请求
     * 通过name确定的需要修改的User对象的content字段
     * @param name
     * @param updateUser
     * @return  修改之后的User对象
     */
    @PutMapping("/users/{name}")
    User updateUser(@PathVariable String name, @RequestBody User updateUser){
        User user = users.get(name);
        user.setContent(updateUser.getContent());
        return user;
    }

    /**
     * 响应 DELETE /users/{name} 这样的请求
     * 删除name确定的User对象
     * @param name
     */
    @DeleteMapping("/users/{name}")
    void deleteUser(@PathVariable String name){
        users.remove(name);
    }
}
