package com.demo.example;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by xiaowu.zhou@tongdun.cn on 2019/1/17.
 */
@WebServlet(name="hello",urlPatterns = {"/hello"})
public class Hello extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String message = req.getParameter("message");
        resp.getWriter().print("hello : "+ message);
        resp.flushBuffer();
    }
}
