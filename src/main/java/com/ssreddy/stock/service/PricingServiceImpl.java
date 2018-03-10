package com.ssreddy.stock.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssreddy.stock.dao.PricingDao;
import com.ssreddy.stock.dto.QuoteInfo;
import com.ssreddy.stock.vo.QuoteInfoVo;

@Service
public class PricingServiceImpl implements PricingService {

	@Autowired
	private PricingDao pricingDao;

	@Override
	public List<QuoteInfoVo> getQuoteDetails(List<String> quoteName) {

		List<QuoteInfo> quoteInfo = pricingDao.findByQuoteNameIn(quoteName);
		List<QuoteInfoVo> quoteInfoVosList = new ArrayList<>();
		if (quoteInfo != null) {
			quoteInfo.stream().forEach(quote ->{
				QuoteInfoVo quoteInfoVo= new QuoteInfoVo();
				quoteInfoVo.setQuoteName(quote.getQuoteName());
				quoteInfoVo.setQuotePrice(quote.getQuotePrice());
				quoteInfoVosList.add(quoteInfoVo);
			});
			
		} 
		return quoteInfoVosList;
	}

	@Override
	public QuoteInfo addQuoteDetails(QuoteInfo quoteInfo) {
		return pricingDao.save(quoteInfo);

	}

}
