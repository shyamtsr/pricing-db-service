package com.ssreddy.stock.service;

import java.util.List;

import com.ssreddy.stock.dto.QuoteInfo;
import com.ssreddy.stock.vo.QuoteInfoVo;

public interface PricingService {

	public List<QuoteInfoVo> getQuoteDetails(List<String> quoteName);

	public QuoteInfo addQuoteDetails(QuoteInfo quoteInfo);

}
