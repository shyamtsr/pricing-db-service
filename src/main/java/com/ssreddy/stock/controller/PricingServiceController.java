package com.ssreddy.stock.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssreddy.stock.dto.QuoteInfo;
import com.ssreddy.stock.service.PricingService;
import com.ssreddy.stock.vo.QuoteInfoVo;
import com.ssreddy.stock.vo.QuoteNamesVo;

@RestController
@RequestMapping("/rest/db-pricing")
public class PricingServiceController {

	@Autowired
	private PricingService priceService;

	@GetMapping("/home")
	public String gethome() {
		return "Hello, Welcome to Spring Boot World!";
	}

	@PostMapping("/quoteinfo")
	public List<QuoteInfoVo> getQuoteInfo(@RequestBody QuoteNamesVo quoteName) {

		return priceService.getQuoteDetails(quoteName.getQuoteNames());
	}

	@PostMapping("/addquote")
	public QuoteInfo addQuoteInfo(@RequestBody QuoteInfo quoteInfo) {
		quoteInfo.setCreateDate(new Date());
		return priceService.addQuoteDetails(quoteInfo);
	}

}
