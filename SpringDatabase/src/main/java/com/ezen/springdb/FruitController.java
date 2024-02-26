package com.ezen.springdb;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.ezen.springdb.dto.FruitDTO;
import com.ezen.springdb.service.FruitService;

import lombok.extern.log4j.Log4j;

@Log4j
@Controller
public class FruitController {

	// @GetMapping, @PostMapping...등으로 @RequestMapping을 줄여 사용할 수 있다

	@Autowired
	FruitService fruitService;
	
//	@Autowired
//	CountryMapper countryMapper;


	@GetMapping("/fruit/list")
	public void list(Model model) {
		fruitService.getFruitList(model);
		
	}

	@GetMapping("/fruit/update")
	public String updateForm(Model model, Integer fruit_id) {
		int result = fruitService.updateForm(model, fruit_id);
		
		if (result == 1) {
			return "/fruit/update";
		} else {
			return "redirect:/fruit/list";
		}
	}

	@PostMapping("/fruit/update")
	public String update(FruitDTO dto, RedirectAttributes rattr) {
		int result = fruitService.update(dto);
		
		if (result == 1) {
			return "redirect:/fruit/list";
		} else {
			rattr.addAttribute("fruit_id", dto.getFruit_id());
			return "redirect:fruit/update";
			// return "redirect:/fruit/update?fruit_id=" + dto.getFruit_id();
		}
	}
}
