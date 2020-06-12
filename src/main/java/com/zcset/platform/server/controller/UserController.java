package com.zcset.platform.server.controller;

import com.zcset.platform.server.entity.User;
import com.zcset.platform.server.exception.controller.ExceptionHandle;
import com.zcset.platform.server.exception.entity.Result;
import com.zcset.platform.server.exception.enumeration.ExceptionEnum;
import com.zcset.platform.server.exception.util.ResultUtil;
import com.zcset.platform.server.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "/boot")
public class UserController {
    @Autowired
    private ExceptionHandle exceptionHandle;

    @Autowired
    private UserService userService;

//    public UserController() {
//        userService=new UserService();
//    }

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
            List<User> object = userService.getUserById((short) 1);
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
            user.setUserid((short) 2);
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
            user.setUserid((short) 2);
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
            user.setUserid((short) 2);
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
}
