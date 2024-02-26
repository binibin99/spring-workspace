package com.ezen.springdb;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ezen.springdb.dto.EmployeeDTO;
import com.ezen.springdb.mapper.EmployeeMapper;
import com.zaxxer.hikari.HikariDataSource;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LogManager.getLogger(HomeController.class);
	
	private static Logger log = LogManager.getLogger(HomeController.class);
	
	@Autowired
	SqlSessionFactory factory;
	
	@Autowired
	EmployeeMapper empMapper;
	
	@Autowired
	HikariDataSource ds;
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
//		logger.info("Welcome home! The client locale is {}.", locale);
//		log.info(factory);
//		
//		SqlSession sqlSession = factory.openSession();
//	List emps=sqlSession.selectList("SELECT * FROM employees");
//		
//		for(Object emp:emps) {
//			System.out.println(emp);
//		}
//		log.info(ds);
		//log.info(empMapper.getAll());
		
		for(EmployeeDTO emp: empMapper.getAll()) {
			System.out.println(emp);
		}
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
}
