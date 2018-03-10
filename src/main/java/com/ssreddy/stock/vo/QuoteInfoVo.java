package com.ssreddy.stock.vo;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class QuoteInfoVo {

	private String quoteName;
	private BigDecimal quotePrice;

	public QuoteInfoVo() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param quoteName
	 * @param quotePrice
	 */
	public QuoteInfoVo(String quoteName, BigDecimal quotePrice) {
		super();
		this.quoteName = quoteName;
		this.quotePrice = quotePrice;
	}

	/**
	 * @return the quoteName
	 */
	public String getQuoteName() {
		return quoteName;
	}

	/**
	 * @param quoteName
	 *            the quoteName to set
	 */
	public void setQuoteName(String quoteName) {
		this.quoteName = quoteName;
	}

	/**
	 * @return the quotePrice
	 */
	public BigDecimal getQuotePrice() {
		return quotePrice;
	}

	/**
	 * @param quotePrice
	 *            the quotePrice to set
	 */
	public void setQuotePrice(BigDecimal quotePrice) {
		this.quotePrice = quotePrice;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "QuoteInfoVo [quoteName=" + quoteName + ", quotePrice=" + quotePrice + "]";
	}

}
