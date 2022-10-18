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
import model.BooleanValue;
import model.CustomField;
import model.Entity;
import model.FileLink;
import model.StringValue;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * TemplateItemVendorDetail
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-08-17T14:29:48.617Z")
public class TemplateItemVendorDetail extends Entity {
  @SerializedName("VendorID")
  private StringValue vendorID = null;

  @SerializedName("VendorName")
  private StringValue vendorName = null;

  @SerializedName("Default")
  private BooleanValue _default = null;

  public TemplateItemVendorDetail vendorID(StringValue vendorID) {
    this.vendorID = vendorID;
    return this;
  }

   /**
   * Get vendorID
   * @return vendorID
  **/
  @ApiModelProperty(value = "")
  public StringValue getVendorID() {
    return vendorID;
  }

  public void setVendorID(StringValue vendorID) {
    this.vendorID = vendorID;
  }

  public TemplateItemVendorDetail vendorName(StringValue vendorName) {
    this.vendorName = vendorName;
    return this;
  }

   /**
   * Get vendorName
   * @return vendorName
  **/
  @ApiModelProperty(value = "")
  public StringValue getVendorName() {
    return vendorName;
  }

  public void setVendorName(StringValue vendorName) {
    this.vendorName = vendorName;
  }

  public TemplateItemVendorDetail _default(BooleanValue _default) {
    this._default = _default;
    return this;
  }

   /**
   * Get _default
   * @return _default
  **/
  @ApiModelProperty(value = "")
  public BooleanValue getDefault() {
    return _default;
  }

  public void setDefault(BooleanValue _default) {
    this._default = _default;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TemplateItemVendorDetail templateItemVendorDetail = (TemplateItemVendorDetail) o;
    return Objects.equals(this.vendorID, templateItemVendorDetail.vendorID) &&
        Objects.equals(this.vendorName, templateItemVendorDetail.vendorName) &&
        Objects.equals(this._default, templateItemVendorDetail._default) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vendorID, vendorName, _default, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TemplateItemVendorDetail {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    vendorID: ").append(toIndentedString(vendorID)).append("\n");
    sb.append("    vendorName: ").append(toIndentedString(vendorName)).append("\n");
    sb.append("    _default: ").append(toIndentedString(_default)).append("\n");
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
