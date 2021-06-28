package com.te.springmvc.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SpringMVCController {

	@RequestMapping(path = "/hello", method = RequestMethod.GET)
	public ModelAndView getHomePage() {
		ModelAndView modelAndView = new ModelAndView();
//		modelAndView.setViewName("/WEB-INF/views/homePage.jsp");
		modelAndView.setViewName("homePage");
		return modelAndView;
	}// end of getHomePage

	@RequestMapping(path = "/home", method = RequestMethod.GET)
	public ModelAndView getHome(ModelAndView modelAndView) {
//		modelAndView.setViewName("/WEB-INF/views/homePage.jsp");
		modelAndView.setViewName("homePage");
		return modelAndView;
	}// end of getHomePage

//	@RequestMapping(path = "/search", method = RequestMethod.GET)
	
	@GetMapping("/search")
	public ModelAndView doSearch(HttpServletRequest request, ModelAndView modelAndView) {
		String id = request.getParameter("id");
		modelAndView.addObject("id", id);
		modelAndView.setViewName("searchResult");
		return modelAndView;
	}//

	@GetMapping("/search1")
	public String getSearchData(HttpServletRequest request, ModelMap map) {
		String id = request.getParameter("id");
		map.addAttribute("id", id);
		return "searchResult";
	}

	@RequestMapping(path = "/science", method = RequestMethod.GET)
	public ModelAndView getScience(ModelAndView modelAndView) {
//		modelAndView.setViewName("/WEB-INF/views/homePage.jsp");
		modelAndView.setViewName("science");
		return modelAndView;
	}
	@RequestMapping(path = "/movies", method = RequestMethod.GET)
	public ModelAndView getMovies(ModelAndView modelAndView) {
//		modelAndView.setViewName("/WEB-INF/views/homePage.jsp");
		modelAndView.setViewName("movies");
		return modelAndView;
	}
	@RequestMapping(path = "/sports", method = RequestMethod.GET)
	public ModelAndView getSports(ModelAndView modelAndView) {
//		modelAndView.setViewName("/WEB-INF/views/homePage.jsp");
		modelAndView.setViewName("sports");
		return modelAndView;
	}
	@RequestMapping(path = "/food", method = RequestMethod.GET)
	public ModelAndView getFood(ModelAndView modelAndView) {
//		modelAndView.setViewName("/WEB-INF/views/homePage.jsp");
		modelAndView.setViewName("food");
		return modelAndView;
	}
}