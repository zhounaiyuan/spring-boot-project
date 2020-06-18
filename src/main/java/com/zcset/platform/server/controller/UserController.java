package com.zcset.platform.server.controller;

import com.zcset.platform.server.dao.UserDao;
import com.zcset.platform.server.entity.User;
import com.zcset.platform.server.exception.handle.ExceptionHandle;
import com.zcset.platform.server.exception.entity.Result;
import com.zcset.platform.server.exception.enumeration.ExceptionEnum;
import com.zcset.platform.server.exception.util.ResultUtil;
import com.zcset.platform.server.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "/boot")
public class UserController {
    @Resource
    private ExceptionHandle exceptionHandle;

    @Resource(name="userservice")
    private UserService userService;

//    public UserController() {
//        userService=new UserService();
//    }


    @GetMapping("/init")
    public Result init(){
        Result result=new Result();
        try {
            //userService.createIndex();
            List<User> list =new ArrayList<User>();
            list.add(new User(8L,193L,"迪迦"));
            list.add(new User(9L,210L,"泰罗"));
            list.add(new User(10L,257L,"赛文"));
            userService.saveAll(list);
            result = ResultUtil.success(list);
        }catch (Exception e)
        {
            result =  exceptionHandle.exceptionGet(e);
        }
        return result;
    }

    @GetMapping("/all")
    public Result all(){
        Result result=new Result();
        try {
            result = ResultUtil.success(userService.findAll());
        }catch (Exception e)
        {
            result =  exceptionHandle.exceptionGet(e);
        }
        return result;
    }


    @RequestMapping(value = "/getResult", method = RequestMethod.POST)
    public Result getResult(@RequestBody Map<String, Object> rec) {
        Result result = new Result();
        try {
            if (rec.get("name").equals("zzp")){
                result =  ResultUtil.success(new User());
            }else if (!"zzp".equals(rec.get("name"))){
                result =  ResultUtil.error(ExceptionEnum.USER_NOT_FIND);
            }else{
                int i = 1/0;
            }
        }catch (Exception e){
            result =  exceptionHandle.exceptionGet(e);
        }
        return result;
    }

    @PostMapping("/getUser")
    public Result user() {
        Result result=new Result();
        try {
            User object = userService.getUserById((short) 1);
            result = ResultUtil.success(object);
        }catch (Exception e){
            result =  exceptionHandle.exceptionGet(e);
        }
        return result;
    }

    @PostMapping("/insertUser")
    public Result insertUser() {

        Result result=new Result();
        try {
            User user = new User();
            user.setUserid((long) 2);
            user.setUsername("赵四");
            user.setEnabled((short) 1);
            user.setUsernumber((short) 12341);
            int object = userService.insertUser(user);
            if (object==1){
                result = ResultUtil.success(user);
            }else if (object==0){
                result = ResultUtil.error(ExceptionEnum.USER_NOT_INSERT);
            }
        }catch (Exception e){
            result =  exceptionHandle.exceptionGet(e);
        }
        return result;
    }

    @PostMapping("/deleteUser")
    public  Result deleteUser() {

        Result result=new Result();
        try {
            User user = new User();
            user.setUserid((long) 2);
            user.setUsername("赵四");
            user.setEnabled((short) 1);
            user.setUsernumber((short) 12341);
            int object = userService.deleteUser(user);
            if (object==1){
                result = ResultUtil.success(user);
            }else if (object==0){
                result = ResultUtil.error(ExceptionEnum.USER_NOT_DELETE);
            }
        }catch (Exception e){
            result =  exceptionHandle.exceptionGet(e);
        }
        return result;
    }

    @PostMapping("/updateUser")
    public Result updateUser() {
        Result result=new Result();
        try {
            User user = new User();
            user.setUserid((long) 2);
            user.setUsername("王五");
            user.setEnabled((short) 1);
            user.setUsernumber((short) 12341);
            int object =userService.updateUser(user);
            if (object==1){
                result = ResultUtil.success(user);
            }else if (object==0){
                result = ResultUtil.error(ExceptionEnum.USER_NOT_UPDATE);
            }
        }catch (Exception e){
            result =  exceptionHandle.exceptionGet(e);
        }
        return result;
    }

    //首先，想要获取Cookie信息，那么就得先有Cookie信息，这边我们自己从头开始，先弄个Cookie吧。
    @RequestMapping(value = "/setCookies",method = RequestMethod.GET)
    public  Result setCookies(HttpServletResponse response){
        Result result=new Result();
        try {
            //HttpServerletRequest 装请求信息类
            //HttpServerletRespionse 装相应信息的类
            Cookie cookie = new Cookie("sessionId", "CookieTestInfo");
            response.addCookie(cookie);
            result = ResultUtil.success(cookie);
        }catch (Exception e){
            result = exceptionHandle.exceptionGet(e);
        }
        return result;
    }
    //非注解方式获取cookie中对应的key值
    @RequestMapping(value = "/getCookies",method = RequestMethod.GET)
    public  Result getCookies(HttpServletRequest request){
        Result result=new Result();
        try {
        //HttpServletRequest 装请求信息类
        //HttpServletRespionse 装相应信息的类
        //   Cookie cookie=new Cookie("sessionId","CookieTestInfo");
        Cookie[] cookies =  request.getCookies();
        if(cookies != null){
            for(Cookie cookie : cookies)
            {
                if(cookie.getName().equals("sessionId")){
                    result=ResultUtil.success(cookie.getValue());
                }else  {
                    result=ResultUtil.error(ExceptionEnum.Cookie_NOT_FIND);
                }
            }
        }else {
            result=ResultUtil.error(ExceptionEnum.Cookie_NOT_FIND);
        }
        }catch (Exception e){
            result=exceptionHandle.exceptionGet(e);
        }
        return  result;
    }
//注解方式获取cookie中对应的key值
    @RequestMapping("/testCookieValue")
    public Result testCookieValue(@CookieValue("sessionId") String sessionId ) {

        Result result=new Result();
        try {
            if (sessionId == null) {
                result=ResultUtil.error(ExceptionEnum.Cookie_NOT_FIND);
            } else {
                result= ResultUtil.success(sessionId);
            }
        }catch (Exception e){
            result=exceptionHandle.exceptionGet(e);
        }
        return  result;
    }
}
