package com.lys.Usercontryoller;


import com.lys.UserService.IUserServiceMapper;
import com.lys.domian.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class contyoller {
    @Autowired
    private IUserServiceMapper iUserServiceMapper;


    @RequestMapping(path = "findone")
    public String findone(){
        User findone = iUserServiceMapper.findone(41);
        System.out.println(findone);
        System.out.println("我被访问了");
        return "nihao";
    }

}
