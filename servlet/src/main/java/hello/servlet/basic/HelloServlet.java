package hello.servlet.basic;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "helloServlet", urlPatterns = "/hello")
public class HelloServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        System.out.println("HelloServlet.service");
        System.out.println("request = " + req);
        System.out.println("response = " + res);

        String username = req.getParameter("username");
        System.out.println("username = " + username);

        // 타입과 인코딩을 설정해줘야함
        res.setContentType("text/plain");
        res.setCharacterEncoding("utf-8");

        // 헤더에 들어감
        res.getWriter().write("hello : " + username);
    }
}
