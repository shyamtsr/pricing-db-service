package com.ssreddy.stock.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ssreddy.stock.dto.QuoteInfo;

@Repository
public interface PricingDao extends JpaRepository<QuoteInfo, Integer> {

	List<QuoteInfo> findByQuoteNameIn(List<String> quoteName);

}
