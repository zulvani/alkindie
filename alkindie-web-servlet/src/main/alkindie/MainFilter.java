package alkindie;

import javax.servlet.*;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class MainFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse,
                         FilterChain filterChain) throws IOException, ServletException {
        String param = servletRequest.getParameter("username");

        if(param != null && param.equalsIgnoreCase("block")){
            HttpServletResponse httpResponse = (HttpServletResponse) servletResponse;
            httpResponse.getWriter().write("username = " + param);
            return;
        }

        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {

    }
}
