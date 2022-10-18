/*
 * Default/22.200.001
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

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import model.ACAInformation;
import model.ApplicableWage;
import model.BooleanValue;
import model.CustomField;
import model.DateTimeValue;
import model.DeductionBenefitWCCCode;
import model.DeductionOrBenefitCodeGLAccounts;
import model.EmployeeDeduction;
import model.EmployerContribution;
import model.Entity;
import model.FileLink;
import model.StringValue;
import model.TaxSettingsCA;
import model.TaxSettingsUS;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * DeductionBenefitCode
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-08-17T14:29:48.617Z")
public class DeductionBenefitCode extends Entity {
  @SerializedName("ACAApplicable")
  private BooleanValue acAApplicable = null;

  @SerializedName("ACAInformation")
  private ACAInformation acAInformation = null;

  @SerializedName("Active")
  private BooleanValue active = null;

  @SerializedName("AffectsTaxCalculation")
  private BooleanValue affectsTaxCalculation = null;

  @SerializedName("ApplicableWage")
  private ApplicableWage applicableWage = null;

  @SerializedName("AssociatedWith")
  private StringValue associatedWith = null;

  @SerializedName("ContributionType")
  private StringValue contributionType = null;

  @SerializedName("DeductionBenefitCodeID")
  private StringValue deductionBenefitCodeID = null;

  @SerializedName("Description")
  private StringValue description = null;

  @SerializedName("EmployeeDeduction")
  private EmployeeDeduction employeeDeduction = null;

  @SerializedName("EmployerContribution")
  private EmployerContribution employerContribution = null;

  @SerializedName("GLAccounts")
  private DeductionOrBenefitCodeGLAccounts glAccounts = null;

  @SerializedName("InvoiceDescrSource")
  private StringValue invoiceDescrSource = null;

  @SerializedName("IsGarnishment")
  private BooleanValue isGarnishment = null;

  @SerializedName("LastModifiedDateTime")
  private DateTimeValue lastModifiedDateTime = null;

  @SerializedName("PayableBenefit")
  private BooleanValue payableBenefit = null;

  @SerializedName("ShowApplicableWageTab")
  private BooleanValue showApplicableWageTab = null;

  @SerializedName("TaxSettingsCA")
  private TaxSettingsCA taxSettingsCA = null;

  @SerializedName("TaxSettingsUS")
  private TaxSettingsUS taxSettingsUS = null;

  @SerializedName("Vendor")
  private StringValue vendor = null;

  @SerializedName("VendorInvoiceDescription")
  private StringValue vendorInvoiceDescription = null;

  @SerializedName("WCCCode")
  private DeductionBenefitWCCCode wcCCode = null;

  public DeductionBenefitCode acAApplicable(BooleanValue acAApplicable) {
    this.acAApplicable = acAApplicable;
    return this;
  }

   /**
   * Get acAApplicable
   * @return acAApplicable
  **/
  @ApiModelProperty(value = "")
  public BooleanValue getAcAApplicable() {
    return acAApplicable;
  }

  public void setAcAApplicable(BooleanValue acAApplicable) {
    this.acAApplicable = acAApplicable;
  }

  public DeductionBenefitCode acAInformation(ACAInformation acAInformation) {
    this.acAInformation = acAInformation;
    return this;
  }

   /**
   * Get acAInformation
   * @return acAInformation
  **/
  @ApiModelProperty(value = "")
  public ACAInformation getAcAInformation() {
    return acAInformation;
  }

  public void setAcAInformation(ACAInformation acAInformation) {
    this.acAInformation = acAInformation;
  }

  public DeductionBenefitCode active(BooleanValue active) {
    this.active = active;
    return this;
  }

   /**
   * Get active
   * @return active
  **/
  @ApiModelProperty(value = "")
  public BooleanValue getActive() {
    return active;
  }

  public void setActive(BooleanValue active) {
    this.active = active;
  }

  public DeductionBenefitCode affectsTaxCalculation(BooleanValue affectsTaxCalculation) {
    this.affectsTaxCalculation = affectsTaxCalculation;
    return this;
  }

   /**
   * Get affectsTaxCalculation
   * @return affectsTaxCalculation
  **/
  @ApiModelProperty(value = "")
  public BooleanValue getAffectsTaxCalculation() {
    return affectsTaxCalculation;
  }

  public void setAffectsTaxCalculation(BooleanValue affectsTaxCalculation) {
    this.affectsTaxCalculation = affectsTaxCalculation;
  }

  public DeductionBenefitCode applicableWage(ApplicableWage applicableWage) {
    this.applicableWage = applicableWage;
    return this;
  }

   /**
   * Get applicableWage
   * @return applicableWage
  **/
  @ApiModelProperty(value = "")
  public ApplicableWage getApplicableWage() {
    return applicableWage;
  }

  public void setApplicableWage(ApplicableWage applicableWage) {
    this.applicableWage = applicableWage;
  }

  public DeductionBenefitCode associatedWith(StringValue associatedWith) {
    this.associatedWith = associatedWith;
    return this;
  }

   /**
   * Get associatedWith
   * @return associatedWith
  **/
  @ApiModelProperty(value = "")
  public StringValue getAssociatedWith() {
    return associatedWith;
  }

  public void setAssociatedWith(StringValue associatedWith) {
    this.associatedWith = associatedWith;
  }

  public DeductionBenefitCode contributionType(StringValue contributionType) {
    this.contributionType = contributionType;
    return this;
  }

   /**
   * Get contributionType
   * @return contributionType
  **/
  @ApiModelProperty(value = "")
  public StringValue getContributionType() {
    return contributionType;
  }

  public void setContributionType(StringValue contributionType) {
    this.contributionType = contributionType;
  }

  public DeductionBenefitCode deductionBenefitCodeID(StringValue deductionBenefitCodeID) {
    this.deductionBenefitCodeID = deductionBenefitCodeID;
    return this;
  }

   /**
   * Get deductionBenefitCodeID
   * @return deductionBenefitCodeID
  **/
  @ApiModelProperty(value = "")
  public StringValue getDeductionBenefitCodeID() {
    return deductionBenefitCodeID;
  }

  public void setDeductionBenefitCodeID(StringValue deductionBenefitCodeID) {
    this.deductionBenefitCodeID = deductionBenefitCodeID;
  }

  public DeductionBenefitCode description(StringValue description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")
  public StringValue getDescription() {
    return description;
  }

  public void setDescription(StringValue description) {
    this.description = description;
  }

  public DeductionBenefitCode employeeDeduction(EmployeeDeduction employeeDeduction) {
    this.employeeDeduction = employeeDeduction;
    return this;
  }

   /**
   * Get employeeDeduction
   * @return employeeDeduction
  **/
  @ApiModelProperty(value = "")
  public EmployeeDeduction getEmployeeDeduction() {
    return employeeDeduction;
  }

  public void setEmployeeDeduction(EmployeeDeduction employeeDeduction) {
    this.employeeDeduction = employeeDeduction;
  }

  public DeductionBenefitCode employerContribution(EmployerContribution employerContribution) {
    this.employerContribution = employerContribution;
    return this;
  }

   /**
   * Get employerContribution
   * @return employerContribution
  **/
  @ApiModelProperty(value = "")
  public EmployerContribution getEmployerContribution() {
    return employerContribution;
  }

  public void setEmployerContribution(EmployerContribution employerContribution) {
    this.employerContribution = employerContribution;
  }

  public DeductionBenefitCode glAccounts(DeductionOrBenefitCodeGLAccounts glAccounts) {
    this.glAccounts = glAccounts;
    return this;
  }

   /**
   * Get glAccounts
   * @return glAccounts
  **/
  @ApiModelProperty(value = "")
  public DeductionOrBenefitCodeGLAccounts getGlAccounts() {
    return glAccounts;
  }

  public void setGlAccounts(DeductionOrBenefitCodeGLAccounts glAccounts) {
    this.glAccounts = glAccounts;
  }

  public DeductionBenefitCode invoiceDescrSource(StringValue invoiceDescrSource) {
    this.invoiceDescrSource = invoiceDescrSource;
    return this;
  }

   /**
   * Get invoiceDescrSource
   * @return invoiceDescrSource
  **/
  @ApiModelProperty(value = "")
  public StringValue getInvoiceDescrSource() {
    return invoiceDescrSource;
  }

  public void setInvoiceDescrSource(StringValue invoiceDescrSource) {
    this.invoiceDescrSource = invoiceDescrSource;
  }

  public DeductionBenefitCode isGarnishment(BooleanValue isGarnishment) {
    this.isGarnishment = isGarnishment;
    return this;
  }

   /**
   * Get isGarnishment
   * @return isGarnishment
  **/
  @ApiModelProperty(value = "")
  public BooleanValue getIsGarnishment() {
    return isGarnishment;
  }

  public void setIsGarnishment(BooleanValue isGarnishment) {
    this.isGarnishment = isGarnishment;
  }

  public DeductionBenefitCode lastModifiedDateTime(DateTimeValue lastModifiedDateTime) {
    this.lastModifiedDateTime = lastModifiedDateTime;
    return this;
  }

   /**
   * Get lastModifiedDateTime
   * @return lastModifiedDateTime
  **/
  @ApiModelProperty(value = "")
  public DateTimeValue getLastModifiedDateTime() {
    return lastModifiedDateTime;
  }

  public void setLastModifiedDateTime(DateTimeValue lastModifiedDateTime) {
    this.lastModifiedDateTime = lastModifiedDateTime;
  }

  public DeductionBenefitCode payableBenefit(BooleanValue payableBenefit) {
    this.payableBenefit = payableBenefit;
    return this;
  }

   /**
   * Get payableBenefit
   * @return payableBenefit
  **/
  @ApiModelProperty(value = "")
  public BooleanValue getPayableBenefit() {
    return payableBenefit;
  }

  public void setPayableBenefit(BooleanValue payableBenefit) {
    this.payableBenefit = payableBenefit;
  }

  public DeductionBenefitCode showApplicableWageTab(BooleanValue showApplicableWageTab) {
    this.showApplicableWageTab = showApplicableWageTab;
    return this;
  }

   /**
   * Get showApplicableWageTab
   * @return showApplicableWageTab
  **/
  @ApiModelProperty(value = "")
  public BooleanValue getShowApplicableWageTab() {
    return showApplicableWageTab;
  }

  public void setShowApplicableWageTab(BooleanValue showApplicableWageTab) {
    this.showApplicableWageTab = showApplicableWageTab;
  }

  public DeductionBenefitCode taxSettingsCA(TaxSettingsCA taxSettingsCA) {
    this.taxSettingsCA = taxSettingsCA;
    return this;
  }

   /**
   * Get taxSettingsCA
   * @return taxSettingsCA
  **/
  @ApiModelProperty(value = "")
  public TaxSettingsCA getTaxSettingsCA() {
    return taxSettingsCA;
  }

  public void setTaxSettingsCA(TaxSettingsCA taxSettingsCA) {
    this.taxSettingsCA = taxSettingsCA;
  }

  public DeductionBenefitCode taxSettingsUS(TaxSettingsUS taxSettingsUS) {
    this.taxSettingsUS = taxSettingsUS;
    return this;
  }

   /**
   * Get taxSettingsUS
   * @return taxSettingsUS
  **/
  @ApiModelProperty(value = "")
  public TaxSettingsUS getTaxSettingsUS() {
    return taxSettingsUS;
  }

  public void setTaxSettingsUS(TaxSettingsUS taxSettingsUS) {
    this.taxSettingsUS = taxSettingsUS;
  }

  public DeductionBenefitCode vendor(StringValue vendor) {
    this.vendor = vendor;
    return this;
  }

   /**
   * Get vendor
   * @return vendor
  **/
  @ApiModelProperty(value = "")
  public StringValue getVendor() {
    return vendor;
  }

  public void setVendor(StringValue vendor) {
    this.vendor = vendor;
  }

  public DeductionBenefitCode vendorInvoiceDescription(StringValue vendorInvoiceDescription) {
    this.vendorInvoiceDescription = vendorInvoiceDescription;
    return this;
  }

   /**
   * Get vendorInvoiceDescription
   * @return vendorInvoiceDescription
  **/
  @ApiModelProperty(value = "")
  public StringValue getVendorInvoiceDescription() {
    return vendorInvoiceDescription;
  }

  public void setVendorInvoiceDescription(StringValue vendorInvoiceDescription) {
    this.vendorInvoiceDescription = vendorInvoiceDescription;
  }

  public DeductionBenefitCode wcCCode(DeductionBenefitWCCCode wcCCode) {
    this.wcCCode = wcCCode;
    return this;
  }

   /**
   * Get wcCCode
   * @return wcCCode
  **/
  @ApiModelProperty(value = "")
  public DeductionBenefitWCCCode getWcCCode() {
    return wcCCode;
  }

  public void setWcCCode(DeductionBenefitWCCCode wcCCode) {
    this.wcCCode = wcCCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeductionBenefitCode deductionBenefitCode = (DeductionBenefitCode) o;
    return Objects.equals(this.acAApplicable, deductionBenefitCode.acAApplicable) &&
        Objects.equals(this.acAInformation, deductionBenefitCode.acAInformation) &&
        Objects.equals(this.active, deductionBenefitCode.active) &&
        Objects.equals(this.affectsTaxCalculation, deductionBenefitCode.affectsTaxCalculation) &&
        Objects.equals(this.applicableWage, deductionBenefitCode.applicableWage) &&
        Objects.equals(this.associatedWith, deductionBenefitCode.associatedWith) &&
        Objects.equals(this.contributionType, deductionBenefitCode.contributionType) &&
        Objects.equals(this.deductionBenefitCodeID, deductionBenefitCode.deductionBenefitCodeID) &&
        Objects.equals(this.description, deductionBenefitCode.description) &&
        Objects.equals(this.employeeDeduction, deductionBenefitCode.employeeDeduction) &&
        Objects.equals(this.employerContribution, deductionBenefitCode.employerContribution) &&
        Objects.equals(this.glAccounts, deductionBenefitCode.glAccounts) &&
        Objects.equals(this.invoiceDescrSource, deductionBenefitCode.invoiceDescrSource) &&
        Objects.equals(this.isGarnishment, deductionBenefitCode.isGarnishment) &&
        Objects.equals(this.lastModifiedDateTime, deductionBenefitCode.lastModifiedDateTime) &&
        Objects.equals(this.payableBenefit, deductionBenefitCode.payableBenefit) &&
        Objects.equals(this.showApplicableWageTab, deductionBenefitCode.showApplicableWageTab) &&
        Objects.equals(this.taxSettingsCA, deductionBenefitCode.taxSettingsCA) &&
        Objects.equals(this.taxSettingsUS, deductionBenefitCode.taxSettingsUS) &&
        Objects.equals(this.vendor, deductionBenefitCode.vendor) &&
        Objects.equals(this.vendorInvoiceDescription, deductionBenefitCode.vendorInvoiceDescription) &&
        Objects.equals(this.wcCCode, deductionBenefitCode.wcCCode) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acAApplicable, acAInformation, active, affectsTaxCalculation, applicableWage, associatedWith, contributionType, deductionBenefitCodeID, description, employeeDeduction, employerContribution, glAccounts, invoiceDescrSource, isGarnishment, lastModifiedDateTime, payableBenefit, showApplicableWageTab, taxSettingsCA, taxSettingsUS, vendor, vendorInvoiceDescription, wcCCode, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeductionBenefitCode {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    acAApplicable: ").append(toIndentedString(acAApplicable)).append("\n");
    sb.append("    acAInformation: ").append(toIndentedString(acAInformation)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    affectsTaxCalculation: ").append(toIndentedString(affectsTaxCalculation)).append("\n");
    sb.append("    applicableWage: ").append(toIndentedString(applicableWage)).append("\n");
    sb.append("    associatedWith: ").append(toIndentedString(associatedWith)).append("\n");
    sb.append("    contributionType: ").append(toIndentedString(contributionType)).append("\n");
    sb.append("    deductionBenefitCodeID: ").append(toIndentedString(deductionBenefitCodeID)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    employeeDeduction: ").append(toIndentedString(employeeDeduction)).append("\n");
    sb.append("    employerContribution: ").append(toIndentedString(employerContribution)).append("\n");
    sb.append("    glAccounts: ").append(toIndentedString(glAccounts)).append("\n");
    sb.append("    invoiceDescrSource: ").append(toIndentedString(invoiceDescrSource)).append("\n");
    sb.append("    isGarnishment: ").append(toIndentedString(isGarnishment)).append("\n");
    sb.append("    lastModifiedDateTime: ").append(toIndentedString(lastModifiedDateTime)).append("\n");
    sb.append("    payableBenefit: ").append(toIndentedString(payableBenefit)).append("\n");
    sb.append("    showApplicableWageTab: ").append(toIndentedString(showApplicableWageTab)).append("\n");
    sb.append("    taxSettingsCA: ").append(toIndentedString(taxSettingsCA)).append("\n");
    sb.append("    taxSettingsUS: ").append(toIndentedString(taxSettingsUS)).append("\n");
    sb.append("    vendor: ").append(toIndentedString(vendor)).append("\n");
    sb.append("    vendorInvoiceDescription: ").append(toIndentedString(vendorInvoiceDescription)).append("\n");
    sb.append("    wcCCode: ").append(toIndentedString(wcCCode)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
