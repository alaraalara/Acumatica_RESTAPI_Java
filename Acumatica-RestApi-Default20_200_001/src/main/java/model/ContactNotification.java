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
 * ContactNotification
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-06-01T18:06:51.194Z")
public class ContactNotification extends Entity {
  @SerializedName("Active")
  private BooleanValue active = null;

  @SerializedName("Bcc")
  private BooleanValue bcc = null;

  @SerializedName("ClassID")
  private StringValue classID = null;

  @SerializedName("Description")
  private StringValue description = null;

  @SerializedName("Format")
  private StringValue format = null;

  @SerializedName("MailingID")
  private StringValue mailingID = null;

  @SerializedName("Module")
  private StringValue module = null;

  @SerializedName("NotificationID")
  private IntValue notificationID = null;

  @SerializedName("Report")
  private StringValue report = null;

  @SerializedName("Source")
  private StringValue source = null;

  public ContactNotification active(BooleanValue active) {
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

  public ContactNotification bcc(BooleanValue bcc) {
    this.bcc = bcc;
    return this;
  }

   /**
   * Get bcc
   * @return bcc
  **/
  @ApiModelProperty(value = "")
  public BooleanValue getBcc() {
    return bcc;
  }

  public void setBcc(BooleanValue bcc) {
    this.bcc = bcc;
  }

  public ContactNotification classID(StringValue classID) {
    this.classID = classID;
    return this;
  }

   /**
   * Get classID
   * @return classID
  **/
  @ApiModelProperty(value = "")
  public StringValue getClassID() {
    return classID;
  }

  public void setClassID(StringValue classID) {
    this.classID = classID;
  }

  public ContactNotification description(StringValue description) {
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

  public ContactNotification format(StringValue format) {
    this.format = format;
    return this;
  }

   /**
   * Get format
   * @return format
  **/
  @ApiModelProperty(value = "")
  public StringValue getFormat() {
    return format;
  }

  public void setFormat(StringValue format) {
    this.format = format;
  }

  public ContactNotification mailingID(StringValue mailingID) {
    this.mailingID = mailingID;
    return this;
  }

   /**
   * Get mailingID
   * @return mailingID
  **/
  @ApiModelProperty(value = "")
  public StringValue getMailingID() {
    return mailingID;
  }

  public void setMailingID(StringValue mailingID) {
    this.mailingID = mailingID;
  }

  public ContactNotification module(StringValue module) {
    this.module = module;
    return this;
  }

   /**
   * Get module
   * @return module
  **/
  @ApiModelProperty(value = "")
  public StringValue getModule() {
    return module;
  }

  public void setModule(StringValue module) {
    this.module = module;
  }

  public ContactNotification notificationID(IntValue notificationID) {
    this.notificationID = notificationID;
    return this;
  }

   /**
   * Get notificationID
   * @return notificationID
  **/
  @ApiModelProperty(value = "")
  public IntValue getNotificationID() {
    return notificationID;
  }

  public void setNotificationID(IntValue notificationID) {
    this.notificationID = notificationID;
  }

  public ContactNotification report(StringValue report) {
    this.report = report;
    return this;
  }

   /**
   * Get report
   * @return report
  **/
  @ApiModelProperty(value = "")
  public StringValue getReport() {
    return report;
  }

  public void setReport(StringValue report) {
    this.report = report;
  }

  public ContactNotification source(StringValue source) {
    this.source = source;
    return this;
  }

   /**
   * Get source
   * @return source
  **/
  @ApiModelProperty(value = "")
  public StringValue getSource() {
    return source;
  }

  public void setSource(StringValue source) {
    this.source = source;
  }

}
