package com.cc.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

public class ApiController extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Map<String, String> map = new HashMap<>();
		String ipString= "";
		map.put("Resource", "http://202.117.15.156:8080/silkRoad2/res_info");
		map.put("UserProfile", "http://202.117.15.156:8080/silkRoad2/user_info");
		map.put("News", "http://202.117.15.156:8080/silkRoad2/news_info");
		map.put("Patent", "http://202.117.15.156:8080/silkRoad2/patent_info");
		map.put("Ebook", "http://202.117.15.156:8080/silkRoad2/ebook_info");
		map.put("Paper", "http://202.117.15.156:8080/silkRoad2/paper_info");
		map.put("Conference", "http://202.117.15.156:8080/silkRoad2/conf_info");
		String json=null;
		Gson gson = new Gson();
		json = gson.toJson(map);
		resp.setContentType("application/json;charset=utf-8");
        resp.addHeader("Access-Control-Allow-Origin", "*");
        ServletOutputStream servletOutputStream = resp.getOutputStream();
        servletOutputStream.write(json.getBytes("utf-8"));
        System.out.println(json);
	}

}
