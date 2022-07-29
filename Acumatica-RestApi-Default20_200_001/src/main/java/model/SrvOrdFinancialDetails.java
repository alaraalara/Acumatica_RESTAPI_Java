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
 * SrvOrdFinancialDetails
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-06-01T18:06:51.194Z")
public class SrvOrdFinancialDetails extends Entity {
  @SerializedName("BillingCustomer")
  private StringValue billingCustomer = null;

  @SerializedName("BillingCycle")
  private StringValue billingCycle = null;

  @SerializedName("BillingLocation")
  private StringValue billingLocation = null;

  @SerializedName("Branch")
  private StringValue branch = null;

  @SerializedName("Commissionable")
  private BooleanValue commissionable = null;

  @SerializedName("CustomerTaxZone")
  private StringValue customerTaxZone = null;

  @SerializedName("RunBillingFor")
  private StringValue runBillingFor = null;

  @SerializedName("Salesperson")
  private StringValue salesperson = null;

  @SerializedName("TaxCalculationMode")
  private StringValue taxCalculationMode = null;

  public SrvOrdFinancialDetails billingCustomer(StringValue billingCustomer) {
    this.billingCustomer = billingCustomer;
    return this;
  }

   /**
   * Get billingCustomer
   * @return billingCustomer
  **/
  @ApiModelProperty(value = "")
  public StringValue getBillingCustomer() {
    return billingCustomer;
  }

  public void setBillingCustomer(StringValue billingCustomer) {
    this.billingCustomer = billingCustomer;
  }

  public SrvOrdFinancialDetails billingCycle(StringValue billingCycle) {
    this.billingCycle = billingCycle;
    return this;
  }

   /**
   * Get billingCycle
   * @return billingCycle
  **/
  @ApiModelProperty(value = "")
  public StringValue getBillingCycle() {
    return billingCycle;
  }

  public void setBillingCycle(StringValue billingCycle) {
    this.billingCycle = billingCycle;
  }

  public SrvOrdFinancialDetails billingLocation(StringValue billingLocation) {
    this.billingLocation = billingLocation;
    return this;
  }

   /**
   * Get billingLocation
   * @return billingLocation
  **/
  @ApiModelProperty(value = "")
  public StringValue getBillingLocation() {
    return billingLocation;
  }

  public void setBillingLocation(StringValue billingLocation) {
    this.billingLocation = billingLocation;
  }

  public SrvOrdFinancialDetails branch(StringValue branch) {
    this.branch = branch;
    return this;
  }

   /**
   * Get branch
   * @return branch
  **/
  @ApiModelProperty(value = "")
  public StringValue getBranch() {
    return branch;
  }

  public void setBranch(StringValue branch) {
    this.branch = branch;
  }

  public SrvOrdFinancialDetails commissionable(BooleanValue commissionable) {
    this.commissionable = commissionable;
    return this;
  }

   /**
   * Get commissionable
   * @return commissionable
  **/
  @ApiModelProperty(value = "")
  public BooleanValue getCommissionable() {
    return commissionable;
  }

  public void setCommissionable(BooleanValue commissionable) {
    this.commissionable = commissionable;
  }

  public SrvOrdFinancialDetails customerTaxZone(StringValue customerTaxZone) {
    this.customerTaxZone = customerTaxZone;
    return this;
  }

   /**
   * Get customerTaxZone
   * @return customerTaxZone
  **/
  @ApiModelProperty(value = "")
  public StringValue getCustomerTaxZone() {
    return customerTaxZone;
  }

  public void setCustomerTaxZone(StringValue customerTaxZone) {
    this.customerTaxZone = customerTaxZone;
  }

  public SrvOrdFinancialDetails runBillingFor(StringValue runBillingFor) {
    this.runBillingFor = runBillingFor;
    return this;
  }

   /**
   * Get runBillingFor
   * @return runBillingFor
  **/
  @ApiModelProperty(value = "")
  public StringValue getRunBillingFor() {
    return runBillingFor;
  }

  public void setRunBillingFor(StringValue runBillingFor) {
    this.runBillingFor = runBillingFor;
  }

  public SrvOrdFinancialDetails salesperson(StringValue salesperson) {
    this.salesperson = salesperson;
    return this;
  }

   /**
   * Get salesperson
   * @return salesperson
  **/
  @ApiModelProperty(value = "")
  public StringValue getSalesperson() {
    return salesperson;
  }

  public void setSalesperson(StringValue salesperson) {
    this.salesperson = salesperson;
  }

  public SrvOrdFinancialDetails taxCalculationMode(StringValue taxCalculationMode) {
    this.taxCalculationMode = taxCalculationMode;
    return this;
  }

   /**
   * Get taxCalculationMode
   * @return taxCalculationMode
  **/
  @ApiModelProperty(value = "")
  public StringValue getTaxCalculationMode() {
    return taxCalculationMode;
  }

  public void setTaxCalculationMode(StringValue taxCalculationMode) {
    this.taxCalculationMode = taxCalculationMode;
  }

}
