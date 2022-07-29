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
 * ShipToSettings
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-06-01T18:06:51.194Z")
public class ShipToSettings extends Entity {
  @SerializedName("ShipToAddress")
  private Address shipToAddress = null;

  @SerializedName("ShipToAddressOverride")
  private BooleanValue shipToAddressOverride = null;

  @SerializedName("ShipToContact")
  private DocContact shipToContact = null;

  @SerializedName("ShipToContactOverride")
  private BooleanValue shipToContactOverride = null;

  @SerializedName("Validated")
  private BooleanValue validated = null;

  public ShipToSettings shipToAddress(Address shipToAddress) {
    this.shipToAddress = shipToAddress;
    return this;
  }

   /**
   * Get shipToAddress
   * @return shipToAddress
  **/
  @ApiModelProperty(value = "")
  public Address getShipToAddress() {
    return shipToAddress;
  }

  public void setShipToAddress(Address shipToAddress) {
    this.shipToAddress = shipToAddress;
  }

  public ShipToSettings shipToAddressOverride(BooleanValue shipToAddressOverride) {
    this.shipToAddressOverride = shipToAddressOverride;
    return this;
  }

   /**
   * Get shipToAddressOverride
   * @return shipToAddressOverride
  **/
  @ApiModelProperty(value = "")
  public BooleanValue getShipToAddressOverride() {
    return shipToAddressOverride;
  }

  public void setShipToAddressOverride(BooleanValue shipToAddressOverride) {
    this.shipToAddressOverride = shipToAddressOverride;
  }

  public ShipToSettings shipToContact(DocContact shipToContact) {
    this.shipToContact = shipToContact;
    return this;
  }

   /**
   * Get shipToContact
   * @return shipToContact
  **/
  @ApiModelProperty(value = "")
  public DocContact getShipToContact() {
    return shipToContact;
  }

  public void setShipToContact(DocContact shipToContact) {
    this.shipToContact = shipToContact;
  }

  public ShipToSettings shipToContactOverride(BooleanValue shipToContactOverride) {
    this.shipToContactOverride = shipToContactOverride;
    return this;
  }

   /**
   * Get shipToContactOverride
   * @return shipToContactOverride
  **/
  @ApiModelProperty(value = "")
  public BooleanValue getShipToContactOverride() {
    return shipToContactOverride;
  }

  public void setShipToContactOverride(BooleanValue shipToContactOverride) {
    this.shipToContactOverride = shipToContactOverride;
  }

  public ShipToSettings validated(BooleanValue validated) {
    this.validated = validated;
    return this;
  }

   /**
   * Get validated
   * @return validated
  **/
  @ApiModelProperty(value = "")
  public BooleanValue getValidated() {
    return validated;
  }

  public void setValidated(BooleanValue validated) {
    this.validated = validated;
  }

}
