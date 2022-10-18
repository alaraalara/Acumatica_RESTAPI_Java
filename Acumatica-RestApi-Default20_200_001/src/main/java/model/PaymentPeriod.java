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
import model.CustomField;
import model.DateTimeValue;
import model.Entity;
import model.FileLink;
import model.StringValue;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * PaymentPeriod
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-08-17T14:29:48.617Z")
public class PaymentPeriod extends Entity {
  @SerializedName("Description")
  private StringValue description = null;

  @SerializedName("EndDate")
  private DateTimeValue endDate = null;

  @SerializedName("FinYear")
  private StringValue finYear = null;

  @SerializedName("LastModifiedDateTime")
  private DateTimeValue lastModifiedDateTime = null;

  @SerializedName("PayPeriodID")
  private StringValue payPeriodID = null;

  @SerializedName("PeriodNbr")
  private StringValue periodNbr = null;

  @SerializedName("StartDate")
  private DateTimeValue startDate = null;

  @SerializedName("TransactionDate")
  private DateTimeValue transactionDate = null;

  public PaymentPeriod description(StringValue description) {
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

  public PaymentPeriod endDate(DateTimeValue endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * Get endDate
   * @return endDate
  **/
  @ApiModelProperty(value = "")
  public DateTimeValue getEndDate() {
    return endDate;
  }

  public void setEndDate(DateTimeValue endDate) {
    this.endDate = endDate;
  }

  public PaymentPeriod finYear(StringValue finYear) {
    this.finYear = finYear;
    return this;
  }

   /**
   * Get finYear
   * @return finYear
  **/
  @ApiModelProperty(value = "")
  public StringValue getFinYear() {
    return finYear;
  }

  public void setFinYear(StringValue finYear) {
    this.finYear = finYear;
  }

  public PaymentPeriod lastModifiedDateTime(DateTimeValue lastModifiedDateTime) {
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

  public PaymentPeriod payPeriodID(StringValue payPeriodID) {
    this.payPeriodID = payPeriodID;
    return this;
  }

   /**
   * Get payPeriodID
   * @return payPeriodID
  **/
  @ApiModelProperty(value = "")
  public StringValue getPayPeriodID() {
    return payPeriodID;
  }

  public void setPayPeriodID(StringValue payPeriodID) {
    this.payPeriodID = payPeriodID;
  }

  public PaymentPeriod periodNbr(StringValue periodNbr) {
    this.periodNbr = periodNbr;
    return this;
  }

   /**
   * Get periodNbr
   * @return periodNbr
  **/
  @ApiModelProperty(value = "")
  public StringValue getPeriodNbr() {
    return periodNbr;
  }

  public void setPeriodNbr(StringValue periodNbr) {
    this.periodNbr = periodNbr;
  }

  public PaymentPeriod startDate(DateTimeValue startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * Get startDate
   * @return startDate
  **/
  @ApiModelProperty(value = "")
  public DateTimeValue getStartDate() {
    return startDate;
  }

  public void setStartDate(DateTimeValue startDate) {
    this.startDate = startDate;
  }

  public PaymentPeriod transactionDate(DateTimeValue transactionDate) {
    this.transactionDate = transactionDate;
    return this;
  }

   /**
   * Get transactionDate
   * @return transactionDate
  **/
  @ApiModelProperty(value = "")
  public DateTimeValue getTransactionDate() {
    return transactionDate;
  }

  public void setTransactionDate(DateTimeValue transactionDate) {
    this.transactionDate = transactionDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentPeriod paymentPeriod = (PaymentPeriod) o;
    return Objects.equals(this.description, paymentPeriod.description) &&
        Objects.equals(this.endDate, paymentPeriod.endDate) &&
        Objects.equals(this.finYear, paymentPeriod.finYear) &&
        Objects.equals(this.lastModifiedDateTime, paymentPeriod.lastModifiedDateTime) &&
        Objects.equals(this.payPeriodID, paymentPeriod.payPeriodID) &&
        Objects.equals(this.periodNbr, paymentPeriod.periodNbr) &&
        Objects.equals(this.startDate, paymentPeriod.startDate) &&
        Objects.equals(this.transactionDate, paymentPeriod.transactionDate) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, endDate, finYear, lastModifiedDateTime, payPeriodID, periodNbr, startDate, transactionDate, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentPeriod {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    finYear: ").append(toIndentedString(finYear)).append("\n");
    sb.append("    lastModifiedDateTime: ").append(toIndentedString(lastModifiedDateTime)).append("\n");
    sb.append("    payPeriodID: ").append(toIndentedString(payPeriodID)).append("\n");
    sb.append("    periodNbr: ").append(toIndentedString(periodNbr)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    transactionDate: ").append(toIndentedString(transactionDate)).append("\n");
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
