package com.hhwf.schedule.admin.controller;

import com.hhwf.schedule.admin.common.model.ImageVerificationCode;
import com.hhwf.schedule.admin.common.utils.MD5Utils;
import com.hhwf.schedule.admin.controller.vo.LoginVO;
import com.hhwf.schedule.admin.entity.User;
import com.hhwf.vo.Result;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.image.BufferedImage;
import java.io.IOException;

/**
 * @Auther: fei.wei
 * @Date: 2019/11/25 19:21
 * @Description:
 */
@Controller
public class LoginController extends BaseController {

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @PostMapping("/login")
    @ResponseBody
    public Result login(@RequestBody LoginVO loginVO) {
        String password = MD5Utils.encrypt(loginVO.getUserName(), loginVO.getPassword());
        UsernamePasswordToken token = new UsernamePasswordToken(loginVO.getUserName(), password);
        Subject subject = SecurityUtils.getSubject();
        try {
            subject.login(token);
            return Result.ok();
        } catch (UnknownAccountException | IncorrectCredentialsException | LockedAccountException e) {
            return Result.error("请输入正确的用户名和密码");
        } catch (AuthenticationException e) {
            return Result.error("认证失败！");
        }
    }

    @GetMapping("/")
    public String redirectIndex() {
        return "redirect:/index";
    }

    @RequestMapping("/index")
    public String index() {
        return "index";
    }


    /**
     * 获取验证码
     */
    @GetMapping("getVerifyCode")
    @ResponseBody
    public void getVerifyCode(HttpServletRequest request, HttpServletResponse response) throws IOException {
        /*
             1.生成验证码
             2.把验证码上的文本存在session中
             3.把验证码图片发送给客户端
             */
        ImageVerificationCode ivc = new ImageVerificationCode();     //用我们的验证码类，生成验证码类对象
        BufferedImage image = ivc.getImage();  //获取验证码
        request.getSession().setAttribute("verifyCode", ivc.getText()); //将验证码的文本存在session中
        ivc.output(image, response.getOutputStream());//将验证码图片响应给客户端
    }

}
