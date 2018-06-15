package com.board.controller;

import com.board.login.LoginDAO;
import com.board.login.LoginInfo;
import com.sun.xml.internal.ws.resources.HttpserverMessages;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Locale;

@Controller
public class loginController {

    @Autowired
    LoginDAO loginDAO;

    @RequestMapping("/")
    public ModelAndView login(ModelAndView mv) {
        String page = "login";
        mv.setViewName(page);
        return mv;
    }

    @RequestMapping(value="/login/loginCheck")
    public void loginCheck(Locale locale, Model model, LoginInfo loginInfo, HttpSession session, HttpServletResponse response) throws IOException {
        response.setContentType("text/html; charset=UTF-8");
        PrintWriter out = response.getWriter();

        if ((loginInfo.getId() != null && !loginInfo.getId().equals("")
                && loginInfo.getPassword() != null && !loginInfo.getPassword().equals(""))) {
            ;
            if (loginDAO.loginCheck(loginInfo)) {
                session.setAttribute("login", 0);

                session.setAttribute("id", loginInfo.getId());

                out.println("<script> location.href='/board'; </script>");
                out.flush();
                out.close();
            }
            if (loginDAO.loginCheck(loginInfo) == false) {
                out.print("<script>alert('로그인 정보를 확인하세요!'); history.go(-1); </script>");
                out.flush();
                out.close();

            }
        }
    }
}
