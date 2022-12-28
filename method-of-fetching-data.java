
package firstpackage;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Cookie;
import javax.servlet.annotation.WebServlet;
 
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/sq")

public class SqClass extends HttpServlet{
    
    public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException{
        /*int i = Integer.parseInt(req.getParameter("num1"));        
        int j = Integer.parseInt(req.getParameter("num2"));
        
        int k=i+j;*/
        
       /* Fetching value from previous servlet to this servlet and typecasted to int*/
      
      
        /*  2. By query parameter */
      
        //int k=Integer.parseInt(req.getParameter("k")); 
        
        
        /* 3. Session storage */
      
        //HttpSession session=req.getSession();
        //int k=(int)session.getAttribute("k");
        //k=k*k;
        //PrintWriter out=res.getWriter();
        //out.println("Square is :"+k);
        
        /* Cookies */
        int k=0;
        Cookie cookies[]=req.getCookies();
        for(Cookie c: cookies)
        {
            if(c.getName().equals("k"))
                k=Integer.parseInt(c.getValue());
        }
        k=k*k;
        PrintWriter out=res.getWriter();
        out.println("Square is :"+k);

        }
}
