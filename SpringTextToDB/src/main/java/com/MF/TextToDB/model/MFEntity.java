package com.MF.TextToDB.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;




@Entity
@Table(name = "BSEStar")
public class MFEntity {
@Id
private String UniqueNo;                                  
private String SchemeCode;  
private String RTASchemeCode;
private String AMCSchemeCode;
private String ISIN;
private String AMCCode;
private String SchemeType;
private String SchemePlan;
private String SchemeName;
private String PurchaseAllowed;
private String PurchaseTransactionMode;
private String MinimumPurchaseAmount;
private String AdditionalPurchaseAmount;
private String MaximumPurchaseAmount;
private String PurchaseAmountMultiplier;
private String PurchaseCutoffTime;
private String RedemptionAllowed;
private String RedemptionTransactionMode;
private String MinimumRedemptionQty;
private String RedemptionQtyMultiplier;
private String MaximumRedemptionQty;
private String RedemptionAmountMinimum;
private String RedemptionAmountMaximum;
private String RedemptionAmountMultiple;
private String RedemptionCutoffTime;
private String RTAAgentCode;
private String AMCActiveFlag;
private String DividendReinvestmentFlag;
private String SIPFLAG;
private String STPFLAG;
private String SWPFlag;
private String SwitchFLAG;
private String SETTLEMENTTYPE;
private String AMCIND;
private String FaceValue;
private String StartDate;
private String EndDate;
private String ExitLoadFlag;
private String ExitLoad;
private String LockinPeriodFlag;
private String LockinPeriod;
private String ChannelPartnerCode;
private String ReOpeningDate;
public String getUniqueNo() {
	return UniqueNo;
}
public void setUniqueNo(String uniqueNo) {
	UniqueNo = uniqueNo;
}
public String getSchemeCode() {
	return SchemeCode;
}
public void setSchemeCode(String schemeCode) {
	SchemeCode = schemeCode;
}
public String getRTASchemeCode() {
	return RTASchemeCode;
}
public void setRTASchemeCode(String rTASchemeCode) {
	RTASchemeCode = rTASchemeCode;
}
public String getAMCSchemeCode() {
	return AMCSchemeCode;
}
public void setAMCSchemeCode(String aMCSchemeCode) {
	AMCSchemeCode = aMCSchemeCode;
}
public String getISIN() {
	return ISIN;
}
public void setISIN(String iSIN) {
	ISIN = iSIN;
}
public String getAMCCode() {
	return AMCCode;
}
public void setAMCCode(String aMCCode) {
	AMCCode = aMCCode;
}
public String getSchemeType() {
	return SchemeType;
}
public void setSchemeType(String schemeType) {
	SchemeType = schemeType;
}
public String getSchemePlan() {
	return SchemePlan;
}
public void setSchemePlan(String schemePlan) {
	SchemePlan = schemePlan;
}
public String getSchemeName() {
	return SchemeName;
}
public void setSchemeName(String schemeName) {
	SchemeName = schemeName;
}
public String getPurchaseAllowed() {
	return PurchaseAllowed;
}
public void setPurchaseAllowed(String purchaseAllowed) {
	PurchaseAllowed = purchaseAllowed;
}
public String getPurchaseTransactionMode() {
	return PurchaseTransactionMode;
}
public void setPurchaseTransactionMode(String purchaseTransactionMode) {
	PurchaseTransactionMode = purchaseTransactionMode;
}
public String getMinimumPurchaseAmount() {
	return MinimumPurchaseAmount;
}
public void setMinimumPurchaseAmount(String minimumPurchaseAmount) {
	MinimumPurchaseAmount = minimumPurchaseAmount;
}
public String getAdditionalPurchaseAmount() {
	return AdditionalPurchaseAmount;
}
public void setAdditionalPurchaseAmount(String additionalPurchaseAmount) {
	AdditionalPurchaseAmount = additionalPurchaseAmount;
}
public String getMaximumPurchaseAmount() {
	return MaximumPurchaseAmount;
}
public void setMaximumPurchaseAmount(String maximumPurchaseAmount) {
	MaximumPurchaseAmount = maximumPurchaseAmount;
}
public String getPurchaseAmountMultiplier() {
	return PurchaseAmountMultiplier;
}
public void setPurchaseAmountMultiplier(String purchaseAmountMultiplier) {
	PurchaseAmountMultiplier = purchaseAmountMultiplier;
}
public String getPurchaseCutoffTime() {
	return PurchaseCutoffTime;
}
public void setPurchaseCutoffTime(String purchaseCutoffTime) {
	PurchaseCutoffTime = purchaseCutoffTime;
}
public String getRedemptionAllowed() {
	return RedemptionAllowed;
}
public void setRedemptionAllowed(String redemptionAllowed) {
	RedemptionAllowed = redemptionAllowed;
}
public String getRedemptionTransactionMode() {
	return RedemptionTransactionMode;
}
public void setRedemptionTransactionMode(String redemptionTransactionMode) {
	RedemptionTransactionMode = redemptionTransactionMode;
}
public String getMinimumRedemptionQty() {
	return MinimumRedemptionQty;
}
public void setMinimumRedemptionQty(String minimumRedemptionQty) {
	MinimumRedemptionQty = minimumRedemptionQty;
}
public String getRedemptionQtyMultiplier() {
	return RedemptionQtyMultiplier;
}
public void setRedemptionQtyMultiplier(String redemptionQtyMultiplier) {
	RedemptionQtyMultiplier = redemptionQtyMultiplier;
}
public String getMaximumRedemptionQty() {
	return MaximumRedemptionQty;
}
public void setMaximumRedemptionQty(String maximumRedemptionQty) {
	MaximumRedemptionQty = maximumRedemptionQty;
}
public String getRedemptionAmountMinimum() {
	return RedemptionAmountMinimum;
}
public void setRedemptionAmountMinimum(String redemptionAmountMinimum) {
	RedemptionAmountMinimum = redemptionAmountMinimum;
}
public String getRedemptionAmountMaximum() {
	return RedemptionAmountMaximum;
}
public void setRedemptionAmountMaximum(String redemptionAmountMaximum) {
	RedemptionAmountMaximum = redemptionAmountMaximum;
}
public String getRedemptionAmountMultiple() {
	return RedemptionAmountMultiple;
}
public void setRedemptionAmountMultiple(String redemptionAmountMultiple) {
	RedemptionAmountMultiple = redemptionAmountMultiple;
}
public String getRedemptionCutoffTime() {
	return RedemptionCutoffTime;
}
public void setRedemptionCutoffTime(String redemptionCutoffTime) {
	RedemptionCutoffTime = redemptionCutoffTime;
}
public String getRTAAgentCode() {
	return RTAAgentCode;
}
public void setRTAAgentCode(String rTAAgentCode) {
	RTAAgentCode = rTAAgentCode;
}
public String getAMCActiveFlag() {
	return AMCActiveFlag;
}
public void setAMCActiveFlag(String aMCActiveFlag) {
	AMCActiveFlag = aMCActiveFlag;
}
public String getDividendReinvestmentFlag() {
	return DividendReinvestmentFlag;
}
public void setDividendReinvestmentFlag(String dividendReinvestmentFlag) {
	DividendReinvestmentFlag = dividendReinvestmentFlag;
}
public String getSIPFLAG() {
	return SIPFLAG;
}
public void setSIPFLAG(String sIPFLAG) {
	SIPFLAG = sIPFLAG;
}
public String getSTPFLAG() {
	return STPFLAG;
}
public void setSTPFLAG(String sTPFLAG) {
	STPFLAG = sTPFLAG;
}
public String getSWPFlag() {
	return SWPFlag;
}
public void setSWPFlag(String sWPFlag) {
	SWPFlag = sWPFlag;
}
public String getSwitchFLAG() {
	return SwitchFLAG;
}
public void setSwitchFLAG(String switchFLAG) {
	SwitchFLAG = switchFLAG;
}
public String getSETTLEMENTTYPE() {
	return SETTLEMENTTYPE;
}
public void setSETTLEMENTTYPE(String sETTLEMENTTYPE) {
	SETTLEMENTTYPE = sETTLEMENTTYPE;
}
public String getAMCIND() {
	return AMCIND;
}
public void setAMCIND(String aMCIND) {
	AMCIND = aMCIND;
}
public String getFaceValue() {
	return FaceValue;
}
public void setFaceValue(String faceValue) {
	FaceValue = faceValue;
}
public String getStartDate() {
	return StartDate;
}
public void setStartDate(String startDate) {
	StartDate = startDate;
}
public String getEndDate() {
	return EndDate;
}
public void setEndDate(String endDate) {
	EndDate = endDate;
}
public String getExitLoadFlag() {
	return ExitLoadFlag;
}
public void setExitLoadFlag(String exitLoadFlag) {
	ExitLoadFlag = exitLoadFlag;
}
public String getExitLoad() {
	return ExitLoad;
}
public void setExitLoad(String exitLoad) {
	ExitLoad = exitLoad;
}
public String getLockinPeriodFlag() {
	return LockinPeriodFlag;
}
public void setLockinPeriodFlag(String lockinPeriodFlag) {
	LockinPeriodFlag = lockinPeriodFlag;
}
public String getLockinPeriod() {
	return LockinPeriod;
}
public void setLockinPeriod(String lockinPeriod) {
	LockinPeriod = lockinPeriod;
}
public String getChannelPartnerCode() {
	return ChannelPartnerCode;
}
public void setChannelPartnerCode(String channelPartnerCode) {
	ChannelPartnerCode = channelPartnerCode;
}
public String getReOpeningDate() {
	return ReOpeningDate;
}
public void setReOpeningDate(String reOpeningDate) {
	ReOpeningDate = reOpeningDate;
}
public MFEntity(String uniqueNo, String schemeCode, String rTASchemeCode, String aMCSchemeCode, String iSIN,
		String aMCCode, String schemeType, String schemePlan, String schemeName, String purchaseAllowed,
		String purchaseTransactionMode, String minimumPurchaseAmount, String additionalPurchaseAmount,
		String maximumPurchaseAmount, String purchaseAmountMultiplier, String purchaseCutoffTime,
		String redemptionAllowed, String redemptionTransactionMode, String minimumRedemptionQty,
		String redemptionQtyMultiplier, String maximumRedemptionQty, String redemptionAmountMinimum,
		String redemptionAmountMaximum, String redemptionAmountMultiple, String redemptionCutoffTime,
		String rTAAgentCode, String aMCActiveFlag, String dividendReinvestmentFlag, String sIPFLAG, String sTPFLAG,
		String sWPFlag, String switchFLAG, String sETTLEMENTTYPE, String aMCIND, String faceValue, String startDate,
		String endDate, String exitLoadFlag, String exitLoad, String lockinPeriodFlag, String lockinPeriod,
		String channelPartnerCode, String reOpeningDate) {
	super();
	UniqueNo = uniqueNo;
	SchemeCode = schemeCode;
	RTASchemeCode = rTASchemeCode;
	AMCSchemeCode = aMCSchemeCode;
	ISIN = iSIN;
	AMCCode = aMCCode;
	SchemeType = schemeType;
	SchemePlan = schemePlan;
	SchemeName = schemeName;
	PurchaseAllowed = purchaseAllowed;
	PurchaseTransactionMode = purchaseTransactionMode;
	MinimumPurchaseAmount = minimumPurchaseAmount;
	AdditionalPurchaseAmount = additionalPurchaseAmount;
	MaximumPurchaseAmount = maximumPurchaseAmount;
	PurchaseAmountMultiplier = purchaseAmountMultiplier;
	PurchaseCutoffTime = purchaseCutoffTime;
	RedemptionAllowed = redemptionAllowed;
	RedemptionTransactionMode = redemptionTransactionMode;
	MinimumRedemptionQty = minimumRedemptionQty;
	RedemptionQtyMultiplier = redemptionQtyMultiplier;
	MaximumRedemptionQty = maximumRedemptionQty;
	RedemptionAmountMinimum = redemptionAmountMinimum;
	RedemptionAmountMaximum = redemptionAmountMaximum;
	RedemptionAmountMultiple = redemptionAmountMultiple;
	RedemptionCutoffTime = redemptionCutoffTime;
	RTAAgentCode = rTAAgentCode;
	AMCActiveFlag = aMCActiveFlag;
	DividendReinvestmentFlag = dividendReinvestmentFlag;
	SIPFLAG = sIPFLAG;
	STPFLAG = sTPFLAG;
	SWPFlag = sWPFlag;
	SwitchFLAG = switchFLAG;
	SETTLEMENTTYPE = sETTLEMENTTYPE;
	AMCIND = aMCIND;
	FaceValue = faceValue;
	StartDate = startDate;
	EndDate = endDate;
	ExitLoadFlag = exitLoadFlag;
	ExitLoad = exitLoad;
	LockinPeriodFlag = lockinPeriodFlag;
	LockinPeriod = lockinPeriod;
	ChannelPartnerCode = channelPartnerCode;
	ReOpeningDate = reOpeningDate;
}
public MFEntity() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "MFEntity [UniqueNo=" + UniqueNo + ", SchemeCode=" + SchemeCode + ", RTASchemeCode=" + RTASchemeCode
			+ ", AMCSchemeCode=" + AMCSchemeCode + ", ISIN=" + ISIN + ", AMCCode=" + AMCCode + ", SchemeType="
			+ SchemeType + ", SchemePlan=" + SchemePlan + ", SchemeName=" + SchemeName + ", PurchaseAllowed="
			+ PurchaseAllowed + ", PurchaseTransactionMode=" + PurchaseTransactionMode + ", MinimumPurchaseAmount="
			+ MinimumPurchaseAmount + ", AdditionalPurchaseAmount=" + AdditionalPurchaseAmount
			+ ", MaximumPurchaseAmount=" + MaximumPurchaseAmount + ", PurchaseAmountMultiplier="
			+ PurchaseAmountMultiplier + ", PurchaseCutoffTime=" + PurchaseCutoffTime + ", RedemptionAllowed="
			+ RedemptionAllowed + ", RedemptionTransactionMode=" + RedemptionTransactionMode + ", MinimumRedemptionQty="
			+ MinimumRedemptionQty + ", RedemptionQtyMultiplier=" + RedemptionQtyMultiplier + ", MaximumRedemptionQty="
			+ MaximumRedemptionQty + ", RedemptionAmountMinimum=" + RedemptionAmountMinimum
			+ ", RedemptionAmountMaximum=" + RedemptionAmountMaximum + ", RedemptionAmountMultiple="
			+ RedemptionAmountMultiple + ", RedemptionCutoffTime=" + RedemptionCutoffTime + ", RTAAgentCode="
			+ RTAAgentCode + ", AMCActiveFlag=" + AMCActiveFlag + ", DividendReinvestmentFlag="
			+ DividendReinvestmentFlag + ", SIPFLAG=" + SIPFLAG + ", STPFLAG=" + STPFLAG + ", SWPFlag=" + SWPFlag
			+ ", SwitchFLAG=" + SwitchFLAG + ", SETTLEMENTTYPE=" + SETTLEMENTTYPE + ", AMCIND=" + AMCIND
			+ ", FaceValue=" + FaceValue + ", StartDate=" + StartDate + ", EndDate=" + EndDate + ", ExitLoadFlag="
			+ ExitLoadFlag + ", ExitLoad=" + ExitLoad + ", LockinPeriodFlag=" + LockinPeriodFlag + ", LockinPeriod="
			+ LockinPeriod + ", ChannelPartnerCode=" + ChannelPartnerCode + ", ReOpeningDate=" + ReOpeningDate + "]";
}

}


//@Entity
//	@Table(name = "TBmf")
//	public class MFEntity {
//
//		  @Id
//		  @Column(name = "id")
//		  private long id;
//
//		  @Column(name = "title")
//		  private String title;
//
//		  @Column(name = "description")
//		  private String description;
//
//		  @Column(name = "published")
//		  private boolean published;
//
//		  public MFEntity() {
//
//		  }
//
//		  public MFEntity(long id, String title, String  description, boolean published) {
//		    this.id = id;
//		    this.title = title;
//		    this.description = description;
//		    this.published = published;
//		  }
//
//		  public long getId() {
//		    return id;
//		  }
//
//		  public void setId(long id) {
//		    this.id = id;
//		  }
//
//		  public String getTitle() {
//		    return title;
//		  }
//
//		  public void setTitle(String title) {
//		    this.title = title;
//		  }
//
//		  public String getDescription() {
//		    return description;
//		  }
//
//		  public void setDescription(String description) {
//		    this.description = description;
//		  }
//
//		  public boolean isPublished() {
//		    return published;
//		  }
//
//		  public void setPublished(boolean isPublished) {
//		    this.published = isPublished;
//		  }
//
//		  @Override
//		  public String toString() {
//		    return "Tutorial [id=" + id + ", title=" + title + ", desc=" + description + ", published=" + published + "]";
//		  }
//		}
//
