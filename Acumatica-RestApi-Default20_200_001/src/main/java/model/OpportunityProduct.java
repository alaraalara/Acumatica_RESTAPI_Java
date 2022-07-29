/*
 * Default/20.200.001
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 4
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package model;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModelProperty;

/**
 * OpportunityProduct
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-06-01T18:06:51.194Z")
public class OpportunityProduct extends Entity {
  @SerializedName("Amount")
  private DecimalValue amount = null;

  @SerializedName("Discount")
  private DecimalValue discount = null;

  @SerializedName("DiscountAmount")
  private DecimalValue discountAmount = null;

  @SerializedName("DiscountCode")
  private StringValue discountCode = null;

  @SerializedName("DiscountSequence")
  private StringValue discountSequence = null;

  @SerializedName("ExternalPrice")
  private DecimalValue externalPrice = null;

  @SerializedName("FreeItem")
  private BooleanValue freeItem = null;

  @SerializedName("InventoryID")
  private StringValue inventoryID = null;

  @SerializedName("ManualDiscount")
  private BooleanValue manualDiscount = null;

  @SerializedName("OpportunityProductID")
  private IntValue opportunityProductID = null;

  @SerializedName("ProjectTask")
  private StringValue projectTask = null;

  @SerializedName("Qty")
  private DecimalValue qty = null;

  @SerializedName("Subitem")
  private StringValue subitem = null;

  @SerializedName("TaxCategory")
  private StringValue taxCategory = null;

  @SerializedName("TransactionDescription")
  private StringValue transactionDescription = null;

  @SerializedName("UnitPrice")
  private DecimalValue unitPrice = null;

  @SerializedName("UOM")
  private StringValue UOM = null;

  @SerializedName("Warehouse")
  private StringValue warehouse = null;

  public OpportunityProduct amount(DecimalValue amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getAmount() {
    return amount;
  }

  public void setAmount(DecimalValue amount) {
    this.amount = amount;
  }

  public OpportunityProduct discount(DecimalValue discount) {
    this.discount = discount;
    return this;
  }

   /**
   * Get discount
   * @return discount
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getDiscount() {
    return discount;
  }

  public void setDiscount(DecimalValue discount) {
    this.discount = discount;
  }

  public OpportunityProduct discountAmount(DecimalValue discountAmount) {
    this.discountAmount = discountAmount;
    return this;
  }

   /**
   * Get discountAmount
   * @return discountAmount
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getDiscountAmount() {
    return discountAmount;
  }

  public void setDiscountAmount(DecimalValue discountAmount) {
    this.discountAmount = discountAmount;
  }

  public OpportunityProduct discountCode(StringValue discountCode) {
    this.discountCode = discountCode;
    return this;
  }

   /**
   * Get discountCode
   * @return discountCode
  **/
  @ApiModelProperty(value = "")
  public StringValue getDiscountCode() {
    return discountCode;
  }

  public void setDiscountCode(StringValue discountCode) {
    this.discountCode = discountCode;
  }

  public OpportunityProduct discountSequence(StringValue discountSequence) {
    this.discountSequence = discountSequence;
    return this;
  }

   /**
   * Get discountSequence
   * @return discountSequence
  **/
  @ApiModelProperty(value = "")
  public StringValue getDiscountSequence() {
    return discountSequence;
  }

  public void setDiscountSequence(StringValue discountSequence) {
    this.discountSequence = discountSequence;
  }

  public OpportunityProduct externalPrice(DecimalValue externalPrice) {
    this.externalPrice = externalPrice;
    return this;
  }

   /**
   * Get externalPrice
   * @return externalPrice
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getExternalPrice() {
    return externalPrice;
  }

  public void setExternalPrice(DecimalValue externalPrice) {
    this.externalPrice = externalPrice;
  }

  public OpportunityProduct freeItem(BooleanValue freeItem) {
    this.freeItem = freeItem;
    return this;
  }

   /**
   * Get freeItem
   * @return freeItem
  **/
  @ApiModelProperty(value = "")
  public BooleanValue getFreeItem() {
    return freeItem;
  }

  public void setFreeItem(BooleanValue freeItem) {
    this.freeItem = freeItem;
  }

  public OpportunityProduct inventoryID(StringValue inventoryID) {
    this.inventoryID = inventoryID;
    return this;
  }

   /**
   * Get inventoryID
   * @return inventoryID
  **/
  @ApiModelProperty(value = "")
  public StringValue getInventoryID() {
    return inventoryID;
  }

  public void setInventoryID(StringValue inventoryID) {
    this.inventoryID = inventoryID;
  }

  public OpportunityProduct manualDiscount(BooleanValue manualDiscount) {
    this.manualDiscount = manualDiscount;
    return this;
  }

   /**
   * Get manualDiscount
   * @return manualDiscount
  **/
  @ApiModelProperty(value = "")
  public BooleanValue getManualDiscount() {
    return manualDiscount;
  }

  public void setManualDiscount(BooleanValue manualDiscount) {
    this.manualDiscount = manualDiscount;
  }

  public OpportunityProduct opportunityProductID(IntValue opportunityProductID) {
    this.opportunityProductID = opportunityProductID;
    return this;
  }

   /**
   * Get opportunityProductID
   * @return opportunityProductID
  **/
  @ApiModelProperty(value = "")
  public IntValue getOpportunityProductID() {
    return opportunityProductID;
  }

  public void setOpportunityProductID(IntValue opportunityProductID) {
    this.opportunityProductID = opportunityProductID;
  }

  public OpportunityProduct projectTask(StringValue projectTask) {
    this.projectTask = projectTask;
    return this;
  }

   /**
   * Get projectTask
   * @return projectTask
  **/
  @ApiModelProperty(value = "")
  public StringValue getProjectTask() {
    return projectTask;
  }

  public void setProjectTask(StringValue projectTask) {
    this.projectTask = projectTask;
  }

  public OpportunityProduct qty(DecimalValue qty) {
    this.qty = qty;
    return this;
  }

   /**
   * Get qty
   * @return qty
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getQty() {
    return qty;
  }

  public void setQty(DecimalValue qty) {
    this.qty = qty;
  }

  public OpportunityProduct subitem(StringValue subitem) {
    this.subitem = subitem;
    return this;
  }

   /**
   * Get subitem
   * @return subitem
  **/
  @ApiModelProperty(value = "")
  public StringValue getSubitem() {
    return subitem;
  }

  public void setSubitem(StringValue subitem) {
    this.subitem = subitem;
  }

  public OpportunityProduct taxCategory(StringValue taxCategory) {
    this.taxCategory = taxCategory;
    return this;
  }

   /**
   * Get taxCategory
   * @return taxCategory
  **/
  @ApiModelProperty(value = "")
  public StringValue getTaxCategory() {
    return taxCategory;
  }

  public void setTaxCategory(StringValue taxCategory) {
    this.taxCategory = taxCategory;
  }

  public OpportunityProduct transactionDescription(StringValue transactionDescription) {
    this.transactionDescription = transactionDescription;
    return this;
  }

   /**
   * Get transactionDescription
   * @return transactionDescription
  **/
  @ApiModelProperty(value = "")
  public StringValue getTransactionDescription() {
    return transactionDescription;
  }

  public void setTransactionDescription(StringValue transactionDescription) {
    this.transactionDescription = transactionDescription;
  }

  public OpportunityProduct unitPrice(DecimalValue unitPrice) {
    this.unitPrice = unitPrice;
    return this;
  }

   /**
   * Get unitPrice
   * @return unitPrice
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getUnitPrice() {
    return unitPrice;
  }

  public void setUnitPrice(DecimalValue unitPrice) {
    this.unitPrice = unitPrice;
  }

  public OpportunityProduct UOM(StringValue UOM) {
    this.UOM = UOM;
    return this;
  }

   /**
   * Get UOM
   * @return UOM
  **/
  @ApiModelProperty(value = "")
  public StringValue getUOM() {
    return UOM;
  }

  public void setUOM(StringValue UOM) {
    this.UOM = UOM;
  }

  public OpportunityProduct warehouse(StringValue warehouse) {
    this.warehouse = warehouse;
    return this;
  }

   /**
   * Get warehouse
   * @return warehouse
  **/
  @ApiModelProperty(value = "")
  public StringValue getWarehouse() {
    return warehouse;
  }

  public void setWarehouse(StringValue warehouse) {
    this.warehouse = warehouse;
  }

}
