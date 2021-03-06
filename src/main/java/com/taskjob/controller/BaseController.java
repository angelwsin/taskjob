package com.taskjob.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;

import com.taskjob.util.JSONUtil;


@Controller
public class BaseController {
	   public static final  String EDIT ="edit";
	   public static final  String ADD ="add";
	   public static final String DEL ="delete";
	   public static final String QUERY ="query";
	   
	     public   boolean  isPost(HttpServletRequest request){
	    	  return "POST".equals(request.getMethod());
	     }
	     
	     public void writeJson(HttpServletResponse response, Object object) {

	 		if (object != null) {
	 			writeToResponse(response, JSONUtil.encode(object), "utf-8");
	 		}

	 	}

	 	protected void writeToResponse(HttpServletResponse response, String text,String encoding) {
	 		response.setContentType("text/html;charset=" + encoding);
	 		try {
	 			response.getWriter().write(text);
	 		} catch (IOException e) {
	 			throw new IllegalStateException(e);
	 		}
	 	}

	 	protected void writeToResponse(HttpServletResponse response, String text) {
	 		writeToResponse(response, text, null);
	 	}

}
