package com.ssreddy.stock.dto;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class QuoteInfo {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer quoteId;
	private String quoteName;
	private BigDecimal quotePrice;
	private Date createDate;

	public QuoteInfo() {
		// TODO Auto-generated constructor stub
	}

	public QuoteInfo(Integer quoteId, String quoteName, BigDecimal quotePrice, Date createDate) {
		super();
		this.quoteId = quoteId;
		this.quoteName = quoteName;
		this.quotePrice = quotePrice;
		this.createDate = createDate;
	}


	/**
	 * @return the quoteId
	 */
	public Integer getQuoteId() {
		return quoteId;
	}

	/**
	 * @param quoteId
	 *            the quoteId to set
	 */
	public void setQuoteId(Integer quoteId) {
		this.quoteId = quoteId;
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

	/**
	 * @return the createDate
	 */
	public Date getCreateDate() {
		return createDate;
	}

	/**
	 * @param createDate
	 *            the createDate to set
	 */
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "QuoteInfo [quoteId=" + quoteId + ", quoteName=" + quoteName + ", quotePrice=" + quotePrice
				+ ", createDate=" + createDate + "]";
	}

}
