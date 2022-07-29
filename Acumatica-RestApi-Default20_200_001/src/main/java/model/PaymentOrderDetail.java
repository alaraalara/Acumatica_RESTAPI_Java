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
 * PaymentOrderDetail
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-06-01T18:06:51.194Z")
public class PaymentOrderDetail extends Entity {
  @SerializedName("AppliedToOrder")
  private DecimalValue appliedToOrder = null;

  @SerializedName("OrderNbr")
  private StringValue orderNbr = null;

  @SerializedName("OrderType")
  private StringValue orderType = null;

  public PaymentOrderDetail appliedToOrder(DecimalValue appliedToOrder) {
    this.appliedToOrder = appliedToOrder;
    return this;
  }

   /**
   * Get appliedToOrder
   * @return appliedToOrder
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getAppliedToOrder() {
    return appliedToOrder;
  }

  public void setAppliedToOrder(DecimalValue appliedToOrder) {
    this.appliedToOrder = appliedToOrder;
  }

  public PaymentOrderDetail orderNbr(StringValue orderNbr) {
    this.orderNbr = orderNbr;
    return this;
  }

   /**
   * Get orderNbr
   * @return orderNbr
  **/
  @ApiModelProperty(value = "")
  public StringValue getOrderNbr() {
    return orderNbr;
  }

  public void setOrderNbr(StringValue orderNbr) {
    this.orderNbr = orderNbr;
  }

  public PaymentOrderDetail orderType(StringValue orderType) {
    this.orderType = orderType;
    return this;
  }

   /**
   * Get orderType
   * @return orderType
  **/
  @ApiModelProperty(value = "")
  public StringValue getOrderType() {
    return orderType;
  }

  public void setOrderType(StringValue orderType) {
    this.orderType = orderType;
  }

}
