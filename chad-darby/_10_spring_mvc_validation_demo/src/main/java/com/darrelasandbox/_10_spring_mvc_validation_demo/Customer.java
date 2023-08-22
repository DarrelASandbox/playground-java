package com.darrelasandbox._10_spring_mvc_validation_demo;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class Customer {
  private String firstName;

  @NotNull(message = "is required")
  @Size(min = 1, message = "is required")
  private String lastName = "";

  // The difference when working with `Integer` (as opposed to `int`) is that you
  // can assign `null` to an `Integer`. So if you have a situation where a `null`
  // value is a valid case, you might prefer to use `Integer`.
  @NotNull(message = "is required")
  @Min(value = 0, message = "must be greater than or equal to zero")
  @Max(value = 10, message = "must be less than or equal to 10")
  private Integer freePasses;

  @Pattern(regexp = "^[a-zA-Z0-9]{5}", message = "only 5 chars/digits")
  private String postalCode;

  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  public Integer getFreePasses() {
    return freePasses;
  }

  public void setFreePasses(Integer freePasses) {
    this.freePasses = freePasses;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }
}