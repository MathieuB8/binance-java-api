package com.binance.api.client.domain.account;

import com.binance.api.client.constant.BinanceApiConstants;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonIgnoreProperties(ignoreUnknown = true)
public class LendingCoin {
	  private String annualInterestRate;
	  private String asset;
	  private String avgAnnualInterestRate;
	  private String canRedeem;
	  private String dailyInterestRate;
	  private String freeAmount;
	  private String productId;
	  private String productName;
	  private String redeemingAmount;
	  private String todayPurchasedAmount;
	  private String totalAmount;
	  private String totalInterest;
	  private String lockedAmount;
	  private String freezeAmount;

	  public String getAsset() {
	    return asset;
	  }

	  public String getfreeAmount() {
	    return freeAmount;
	  }
	
	  public String getlockedAmount() {
	    return lockedAmount;
	  }
	
	  public String getfrezeAmount() {
	    return freezeAmount;
	  }
	

	  public String gettotalInterest() {
	    return totalInterest;
	  }
	  

	  public String getdailyInterestRate() {
	    return dailyInterestRate;
	  }
	  

	  public String getavgAnnualInterestRate() {
	    return avgAnnualInterestRate;
	  }

	  public void setAsset(String asset) {
	    this.asset = asset;
	  }

	  @Override
	  public String toString() {
	    return new ToStringBuilder(this, BinanceApiConstants.TO_STRING_BUILDER_STYLE)
	        .append("asset", asset)
	        .append("productId", productId)
	        .append("productName", productName)
	        .append("dailyInterestRate", dailyInterestRate)
	        .append("annualInterestRate", annualInterestRate)
	        .append("avgAnnualInterestRate", avgAnnualInterestRate)
	        .append("totalAmount", totalAmount)
	        .append("lockedAmount", lockedAmount)
	        .append("freeAmount", freeAmount)
	        .append("freezeAmount", freezeAmount)
	        .append("totalInterest", totalInterest)
	        .append("canRedeem", canRedeem)
	        .append("redeemingAmount", redeemingAmount)
	        .append("todayPurchasedAmount", todayPurchasedAmount)
	        .toString();
	  }
}
