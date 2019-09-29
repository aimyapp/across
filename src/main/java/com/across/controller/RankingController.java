package com.across.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * 	A PROJECT ランキングページ用コントローラー
 *
 * @author aimy
 *
 */

@RestController
public class RankingController {

	@GetMapping("/")
	public String helloRanking(Model model) {
	    model.addAttribute("message", "こんにちは世界");
	    return "index";
	}

}
