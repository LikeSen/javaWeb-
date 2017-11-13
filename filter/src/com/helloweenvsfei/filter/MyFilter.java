package com.helloweenvsfei.filter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//@WebFilter(filterName="log",urlPatterns={"/*"})
public class MyFilter implements Filter {

	@Override
	public void destroy() {
		System.out.println("过虑器卸载");

	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		
		PrintWriter out = response.getWriter();
		out.println("-----------------------");
		
		System.out.println("执行filter");
		System.out.println("request执行之前");
		chain.doFilter(request, response);
		System.out.println("response抵达客户端之前");

	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		System.out.println("过虑器启动");

	}

}
