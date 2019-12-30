package com.across.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.across.service.RankingService;

import lombok.val;

/**
 *
 * 	A PROJECT ランキングページ用コントローラー
 *
 * @author aimy
 *
 */

@Controller
public class RankingController {

	@Autowired
	RankingService service;

	@RequestMapping("/")
	public ModelAndView helloRanking(ModelAndView mav) {

		mav.setViewName("index");
		val datalist = service.findAll();
		mav.addObject("datalist", datalist);
		return mav;
	}

}
