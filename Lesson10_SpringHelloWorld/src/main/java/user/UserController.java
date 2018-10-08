package user;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.Null;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 资源（路由）的控制，资源接口的集合。
 * Controller放置接收到路由（URL）请求后的操作
 */

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
    @GetMapping("/users")  // 映射该URL到下面的方法
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
    ResponseEntity<User> getUser(@PathVariable String name){
        if(users.containsKey(name)){
            return new ResponseEntity<>(users.get(name),HttpStatus.OK);
        }else {
            return  new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

    }

    /**
     * 创建/添加，一个用户，到用户列表里
     * 响应 POST /users 的请求
     * @param user  // 参数
     * @return   // 返回创建成功的User对象，创建成功返回状态码 201
     */
    @PostMapping("/users")
    ResponseEntity<User> newUser(@RequestBody User user){
        users.put(user.getName(),user);
        // return users.get(user.getName());
        // 创建成功后返回User对象，以及自定义状态码为201
        return new ResponseEntity<>(users.get(user.getName()),HttpStatus.CREATED);
    }

    /**
     * 响应 PUT /users/{name} 这样的请求
     * 通过name确定的需要修改的User对象的content字段
     * @param name
     * @param updateUser
     * @return  修改之后的User对象
     */
    @PutMapping("/users/{name}")
    ResponseEntity<User> updateUser(@PathVariable String name, @RequestBody User updateUser){
        if(users.containsKey(name)){
            User user = users.get(name);
            user.setContent(updateUser.getContent());
            return new ResponseEntity<>(user,HttpStatus.OK);
        }else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

    }

    /**
     * 响应 DELETE /users/{name} 这样的请求
     * 删除name确定的User对象
     * @param name
     */
    @DeleteMapping("/users/{name}")
    ResponseEntity<User> deleteUser(@PathVariable String name){
        if(users.containsKey(name)){
            users.remove(name);
            return new ResponseEntity<>(HttpStatus.OK);
        }else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

    }
}
