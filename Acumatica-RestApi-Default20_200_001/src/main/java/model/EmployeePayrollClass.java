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
import model.EmployeeClassPTOBankDefault;
import model.EmployeePayrollClassDefaults;
import model.Entity;
import model.FileLink;
import model.StringValue;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * EmployeePayrollClass
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-08-17T14:29:48.617Z")
public class EmployeePayrollClass extends Entity {
  @SerializedName("Description")
  private StringValue description = null;

  @SerializedName("EmployeePayrollClassID")
  private StringValue employeePayrollClassID = null;

  @SerializedName("LastModifiedDateTime")
  private DateTimeValue lastModifiedDateTime = null;

  @SerializedName("PayrollDefaults")
  private EmployeePayrollClassDefaults payrollDefaults = null;

  @SerializedName("PTODefaults")
  private List<EmployeeClassPTOBankDefault> ptODefaults = null;

  public EmployeePayrollClass description(StringValue description) {
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

  public EmployeePayrollClass employeePayrollClassID(StringValue employeePayrollClassID) {
    this.employeePayrollClassID = employeePayrollClassID;
    return this;
  }

   /**
   * Get employeePayrollClassID
   * @return employeePayrollClassID
  **/
  @ApiModelProperty(value = "")
  public StringValue getEmployeePayrollClassID() {
    return employeePayrollClassID;
  }

  public void setEmployeePayrollClassID(StringValue employeePayrollClassID) {
    this.employeePayrollClassID = employeePayrollClassID;
  }

  public EmployeePayrollClass lastModifiedDateTime(DateTimeValue lastModifiedDateTime) {
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

  public EmployeePayrollClass payrollDefaults(EmployeePayrollClassDefaults payrollDefaults) {
    this.payrollDefaults = payrollDefaults;
    return this;
  }

   /**
   * Get payrollDefaults
   * @return payrollDefaults
  **/
  @ApiModelProperty(value = "")
  public EmployeePayrollClassDefaults getPayrollDefaults() {
    return payrollDefaults;
  }

  public void setPayrollDefaults(EmployeePayrollClassDefaults payrollDefaults) {
    this.payrollDefaults = payrollDefaults;
  }

  public EmployeePayrollClass ptODefaults(List<EmployeeClassPTOBankDefault> ptODefaults) {
    this.ptODefaults = ptODefaults;
    return this;
  }

  public EmployeePayrollClass addPtODefaultsItem(EmployeeClassPTOBankDefault ptODefaultsItem) {
    if (this.ptODefaults == null) {
      this.ptODefaults = new ArrayList<EmployeeClassPTOBankDefault>();
    }
    this.ptODefaults.add(ptODefaultsItem);
    return this;
  }

   /**
   * Get ptODefaults
   * @return ptODefaults
  **/
  @ApiModelProperty(value = "")
  public List<EmployeeClassPTOBankDefault> getPtODefaults() {
    return ptODefaults;
  }

  public void setPtODefaults(List<EmployeeClassPTOBankDefault> ptODefaults) {
    this.ptODefaults = ptODefaults;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmployeePayrollClass employeePayrollClass = (EmployeePayrollClass) o;
    return Objects.equals(this.description, employeePayrollClass.description) &&
        Objects.equals(this.employeePayrollClassID, employeePayrollClass.employeePayrollClassID) &&
        Objects.equals(this.lastModifiedDateTime, employeePayrollClass.lastModifiedDateTime) &&
        Objects.equals(this.payrollDefaults, employeePayrollClass.payrollDefaults) &&
        Objects.equals(this.ptODefaults, employeePayrollClass.ptODefaults) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, employeePayrollClassID, lastModifiedDateTime, payrollDefaults, ptODefaults, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmployeePayrollClass {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    employeePayrollClassID: ").append(toIndentedString(employeePayrollClassID)).append("\n");
    sb.append("    lastModifiedDateTime: ").append(toIndentedString(lastModifiedDateTime)).append("\n");
    sb.append("    payrollDefaults: ").append(toIndentedString(payrollDefaults)).append("\n");
    sb.append("    ptODefaults: ").append(toIndentedString(ptODefaults)).append("\n");
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
