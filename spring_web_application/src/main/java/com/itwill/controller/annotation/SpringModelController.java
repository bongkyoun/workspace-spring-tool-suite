package com.itwill.controller.annotation;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SpringModelController {
	@RequestMapping("/model_requset.do")
	public String request(HttpServletRequest request) {
		request.setAttribute("req", "리퀘스트 데이터");
		return "forward:/WEB-INF/views/spring_model.jsp";
	}
	@RequestMapping("/model_model.do")
	public String model(Model model) {
		model.addAttribute("model", "모델 데이터");
		/*
		request.setAttribute("model", "모델데이터");
		*/
		return "forward:/WEB-INF/views/spring_model.jsp";
	}
	@RequestMapping("/model_model.do")
	public String model(Map map) {
		map.put("map", "맵 데이터");
		/*
		request.setAttribute("map", "맵 데이터");
		*/
		return "forward:/WEB-INF/views/spring_model.jsp";
	}
	@RequestMapping("/model_modelMap.do")
	public String modelmap(ModelMap modelMap) {
		modelMap.put("modelMap", "모델맵 데이터");
		/*
		request.setAttribute("modelMap", "모델맵 데이터");
		*/
		return "forward:/WEB-INF/views/spring_model.jsp";
	}
	@RequestMapping("/model_modelandview.do")
	public ModelAndView modelandview() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("modelandview", "모델 앤 뷰 데이터");
		/*
		 request.setAttribute("modelandview", "모델 앤 뷰 데이터");
		 */
		modelAndView.setViewName("forward:/WEB-INF/view/spring_model.jsp");
		return modelAndView;
		
	}
	@RequestMapping("/model_all.do")
	   public String model_all(HttpServletRequest request, Model model, Map map, ModelMap modelMap) {
	      request.setAttribute("req","리퀘스트데이터");
	      model.addAttribute("model", "모델데이터");
	      map.put("map", "맵데이터");
	      modelMap.addAttribute("modelmap", "모델맵데이터");
	      
	      return "forward:/WEB-INF/views/spring_model.jsp";
	      
	   }
}
