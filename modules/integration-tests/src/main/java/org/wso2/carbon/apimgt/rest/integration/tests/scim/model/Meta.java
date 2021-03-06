/*
 * WSO2 User Management Remote API
 * This document specifies a **RESTful API** for WSO2 **User Management**.  It is written with [swagger 2](http://swagger.io/). 
 *
 * OpenAPI spec version: v1.0
 * Contact: architecture@wso2.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package org.wso2.carbon.apimgt.rest.integration.tests.scim.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Meta
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-17T00:32:36.849+05:30")
public class Meta {
  @JsonProperty("created")
  private String created = null;

  @JsonProperty("lastModified")
  private String lastModified = null;

  @JsonProperty("location")
  private String location = null;

  @JsonProperty("resourceType")
  private String resourceType = null;

  public Meta created(String created) {
    this.created = created;
    return this;
  }

   /**
   * Date and time the resource has been created.
   * @return created
  **/
  @ApiModelProperty(value = "Date and time the resource has been created.")
  public String getCreated() {
    return created;
  }

  public void setCreated(String created) {
    this.created = created;
  }

  public Meta lastModified(String lastModified) {
    this.lastModified = lastModified;
    return this;
  }

   /**
   * Date and time the resource has been last modified.
   * @return lastModified
  **/
  @ApiModelProperty(value = "Date and time the resource has been last modified.")
  public String getLastModified() {
    return lastModified;
  }

  public void setLastModified(String lastModified) {
    this.lastModified = lastModified;
  }

  public Meta location(String location) {
    this.location = location;
    return this;
  }

   /**
   * Location URL to the resource.
   * @return location
  **/
  @ApiModelProperty(value = "Location URL to the resource.")
  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public Meta resourceType(String resourceType) {
    this.resourceType = resourceType;
    return this;
  }

   /**
   * Resource type (Group or User)
   * @return resourceType
  **/
  @ApiModelProperty(value = "Resource type (Group or User)")
  public String getResourceType() {
    return resourceType;
  }

  public void setResourceType(String resourceType) {
    this.resourceType = resourceType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Meta meta = (Meta) o;
    return Objects.equals(this.created, meta.created) &&
        Objects.equals(this.lastModified, meta.lastModified) &&
        Objects.equals(this.location, meta.location) &&
        Objects.equals(this.resourceType, meta.resourceType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(created, lastModified, location, resourceType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Meta {\n");
    
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
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

