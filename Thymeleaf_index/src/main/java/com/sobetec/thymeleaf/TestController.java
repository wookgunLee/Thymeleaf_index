package com.sobetec.thymeleaf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.thymeleaf.spring5.view.ThymeleafView;

@Controller
public class TestController {
	
//	@RequestMapping("test")
//	public String TestPage(Model model)
//	{
//		model.addAttribute("msg", "test page 입니다.");
//		
//		return "fragments/board";
//		
//	}
//	
//	@RequestMapping("sidepage1")
//	public String side1Page(Model model)
//	{
//		model.addAttribute("msg", "test page1 입니다.");
//		
//		return "fragments/board :: contcont";
//		
//	}
//	
//	@RequestMapping("sidepage2")
//	public String side2Page(Model model)
//	{
//		model.addAttribute("msg", "test page2 입니다.");
//		
//		return "fragments/board :: sidepage2.html";
//		 
//	}
//	
	/**
	 * indexPage 입니다.
	 * @param model
	 * @return "index"
	 */
	@RequestMapping("index")
	public String indexPage(Model model)
	{
		model.addAttribute("msg", "test page2 입니다.");
		
		return "index";
		 
	}
	
	@RequestMapping("index2")
	public String index2Page(Model model)
	{
		model.addAttribute("msg", "test page2 입니다.");
		
		return "index2";
		 
	}
	
//	
//	@RequestMapping("innerFrame")
//	public String inframePage(Model model)
//	{
//		model.addAttribute("msg", "test page 입니다.");
//		
//		return "innerFrame";
//		
//	}
//	
//	@RequestMapping("menu")
//	public String menuPage(Model model)
//	{
//		model.addAttribute("msg", "test page 입니다.");
//		
//		return "menu";
//		
//	}
//	
//	
//	@RequestMapping("mainpage")
//	public String mainPage(Model model)
//	{
//		model.addAttribute("msg", "test page 입니다.");
//		
//		return "mainpage";
//		
//	}
//	
//	
////	
////	@RequestMapping("menu")
////	public String MenuPage(Model model)
////	{
////		model.addAttribute("msg", "test page 입니다.");
////		
////		return "menu";
////		
////	}
////	
////	@RequestMapping("main")
////	public String MainPage(Model model)
////	{
////		model.addAttribute("msg", "test page 입니다.");
////		
////		return "main";
////		
////	}
//	
//	@Bean(name="content-part")
//	@Scope("prototype")
//	public ThymeleafView someViewBean() {
//	    ThymeleafView view = new ThymeleafView("index"); // templateName = 'index'
//	    view.setMarkupSelector("content");
//	    return view;
//	}

	public TestController() {
		// TODO Auto-generated constructor stub
	}

}
