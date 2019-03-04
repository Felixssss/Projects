package com.gem.filter;

import javax.servlet.*;
import java.io.IOException;

public class EncodeFilter implements Filter {
    private String encode = "utf-8";
    private  final String ENCODE_NAME = "encode";

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        String value = filterConfig.getInitParameter(ENCODE_NAME);
        if(value != null && !value.equals("")){
            encode = value;
        }
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        servletRequest.setCharacterEncoding(encode);
        filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void destroy() {

    }
}
