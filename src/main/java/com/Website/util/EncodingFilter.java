package com.Website.util;

import javax.servlet.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

@WebFilter(filterName = "EncodingFilter", urlPatterns = "/*")
public class EncodingFilter implements Filter {
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {
        request.setCharacterEncoding(StandardCharsets.UTF_8.displayName());
        response.setCharacterEncoding(StandardCharsets.UTF_8.displayName());
        chain.doFilter(request, response);
    }
}
