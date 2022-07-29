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
 * ProjectTemplateTaskProperties
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-06-01T18:06:51.194Z")
public class ProjectTemplateTaskProperties extends Entity {
  @SerializedName("Approver")
  private StringValue approver = null;

  @SerializedName("AutomaticallyIncludeInProject")
  private BooleanValue automaticallyIncludeInProject = null;

  @SerializedName("CompletionMethod")
  private StringValue completionMethod = null;

  @SerializedName("Default")
  private BooleanValue _default = null;

  public ProjectTemplateTaskProperties approver(StringValue approver) {
    this.approver = approver;
    return this;
  }

   /**
   * Get approver
   * @return approver
  **/
  @ApiModelProperty(value = "")
  public StringValue getApprover() {
    return approver;
  }

  public void setApprover(StringValue approver) {
    this.approver = approver;
  }

  public ProjectTemplateTaskProperties automaticallyIncludeInProject(BooleanValue automaticallyIncludeInProject) {
    this.automaticallyIncludeInProject = automaticallyIncludeInProject;
    return this;
  }

   /**
   * Get automaticallyIncludeInProject
   * @return automaticallyIncludeInProject
  **/
  @ApiModelProperty(value = "")
  public BooleanValue getAutomaticallyIncludeInProject() {
    return automaticallyIncludeInProject;
  }

  public void setAutomaticallyIncludeInProject(BooleanValue automaticallyIncludeInProject) {
    this.automaticallyIncludeInProject = automaticallyIncludeInProject;
  }

  public ProjectTemplateTaskProperties completionMethod(StringValue completionMethod) {
    this.completionMethod = completionMethod;
    return this;
  }

   /**
   * Get completionMethod
   * @return completionMethod
  **/
  @ApiModelProperty(value = "")
  public StringValue getCompletionMethod() {
    return completionMethod;
  }

  public void setCompletionMethod(StringValue completionMethod) {
    this.completionMethod = completionMethod;
  }

  public ProjectTemplateTaskProperties _default(BooleanValue _default) {
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

}
