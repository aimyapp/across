package com.across.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * 	A PROJECT ランキングページ用コントローラー
 *
 * @author aimy
 *
 */

@Controller
public class RankingController {

	@RequestMapping("/")
	public String helloRanking(Model model) {
	    model.addAttribute("msg", "Hello page");
	    return "index";
	}

}
