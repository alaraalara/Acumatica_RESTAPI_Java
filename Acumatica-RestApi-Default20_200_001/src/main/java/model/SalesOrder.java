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

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModelProperty;

/**
 * SalesOrder
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-06-01T18:06:51.194Z")
public class SalesOrder extends Entity {
  @SerializedName("Approved")
  private BooleanValue approved = null;

  @SerializedName("BaseCurrencyID")
  private StringValue baseCurrencyID = null;

  @SerializedName("BillToAddress")
  private Address billToAddress = null;

  @SerializedName("BillToAddressOverride")
  private BooleanValue billToAddressOverride = null;

  @SerializedName("BillToAddressValidated")
  private BooleanValue billToAddressValidated = null;

  @SerializedName("BillToContact")
  private DocContact billToContact = null;

  @SerializedName("BillToContactOverride")
  private BooleanValue billToContactOverride = null;

  @SerializedName("CashAccount")
  private StringValue cashAccount = null;

  @SerializedName("Commissions")
  private Commissions commissions = null;

  @SerializedName("ContactID")
  private StringValue contactID = null;

  @SerializedName("ControlTotal")
  private DecimalValue controlTotal = null;

  @SerializedName("CreditHold")
  private BooleanValue creditHold = null;

  @SerializedName("CurrencyID")
  private StringValue currencyID = null;

  @SerializedName("CurrencyRate")
  private DecimalValue currencyRate = null;

  @SerializedName("CurrencyRateTypeID")
  private StringValue currencyRateTypeID = null;

  @SerializedName("CustomerID")
  private StringValue customerID = null;

  @SerializedName("CustomerOrder")
  private StringValue customerOrder = null;

  @SerializedName("Date")
  private DateTimeValue date = null;

  @SerializedName("Description")
  private StringValue description = null;

  @SerializedName("DestinationWarehouseID")
  private StringValue destinationWarehouseID = null;

  @SerializedName("Details")
  private List<SalesOrderDetail> details = null;

  @SerializedName("DisableAutomaticDiscountUpdate")
  private BooleanValue disableAutomaticDiscountUpdate = null;

  @SerializedName("DiscountDetails")
  private List<SalesOrdersDiscountDetails> discountDetails = null;

  @SerializedName("EffectiveDate")
  private DateTimeValue effectiveDate = null;

  @SerializedName("ExternalRef")
  private StringValue externalRef = null;

  @SerializedName("FinancialSettings")
  private FinancialSettings financialSettings = null;

  @SerializedName("Hold")
  private BooleanValue hold = null;

  @SerializedName("IsTaxValid")
  private BooleanValue isTaxValid = null;

  @SerializedName("LastModified")
  private DateTimeValue lastModified = null;

  @SerializedName("LocationID")
  private StringValue locationID = null;

  @SerializedName("OrderedQty")
  private DecimalValue orderedQty = null;

  @SerializedName("OrderNbr")
  private StringValue orderNbr = null;

  @SerializedName("OrderTotal")
  private DecimalValue orderTotal = null;

  @SerializedName("OrderType")
  private StringValue orderType = null;

  @SerializedName("PaymentMethod")
  private StringValue paymentMethod = null;

  @SerializedName("Payments")
  private List<SalesOrderPayment> payments = null;

  @SerializedName("PreferredWarehouseID")
  private StringValue preferredWarehouseID = null;

  @SerializedName("Project")
  private StringValue project = null;

  @SerializedName("ReciprocalRate")
  private DecimalValue reciprocalRate = null;

  @SerializedName("RequestedOn")
  private DateTimeValue requestedOn = null;

  @SerializedName("Shipments")
  private List<SalesOrderShipment> shipments = null;

  @SerializedName("ShippingSettings")
  private ShippingSettings shippingSettings = null;

  @SerializedName("ShipToAddress")
  private Address shipToAddress = null;

  @SerializedName("ShipToAddressOverride")
  private BooleanValue shipToAddressOverride = null;

  @SerializedName("ShipToAddressValidated")
  private BooleanValue shipToAddressValidated = null;

  @SerializedName("ShipToContact")
  private DocContact shipToContact = null;

  @SerializedName("ShipToContactOverride")
  private BooleanValue shipToContactOverride = null;

  @SerializedName("ShipVia")
  private StringValue shipVia = null;

  @SerializedName("Status")
  private StringValue status = null;

  @SerializedName("TaxDetails")
  private List<TaxDetail> taxDetails = null;

  @SerializedName("TaxTotal")
  private DecimalValue taxTotal = null;

  @SerializedName("Totals")
  private Totals totals = null;

  @SerializedName("VATExemptTotal")
  private DecimalValue vaTExemptTotal = null;

  @SerializedName("VATTaxableTotal")
  private DecimalValue vaTTaxableTotal = null;

  public SalesOrder approved(BooleanValue approved) {
    this.approved = approved;
    return this;
  }

   /**
   * Get approved
   * @return approved
  **/
  @ApiModelProperty(value = "")
  public BooleanValue getApproved() {
    return approved;
  }

  public void setApproved(BooleanValue approved) {
    this.approved = approved;
  }

  public SalesOrder baseCurrencyID(StringValue baseCurrencyID) {
    this.baseCurrencyID = baseCurrencyID;
    return this;
  }

   /**
   * Get baseCurrencyID
   * @return baseCurrencyID
  **/
  @ApiModelProperty(value = "")
  public StringValue getBaseCurrencyID() {
    return baseCurrencyID;
  }

  public void setBaseCurrencyID(StringValue baseCurrencyID) {
    this.baseCurrencyID = baseCurrencyID;
  }

  public SalesOrder billToAddress(Address billToAddress) {
    this.billToAddress = billToAddress;
    return this;
  }

   /**
   * Get billToAddress
   * @return billToAddress
  **/
  @ApiModelProperty(value = "")
  public Address getBillToAddress() {
    return billToAddress;
  }

  public void setBillToAddress(Address billToAddress) {
    this.billToAddress = billToAddress;
  }

  public SalesOrder billToAddressOverride(BooleanValue billToAddressOverride) {
    this.billToAddressOverride = billToAddressOverride;
    return this;
  }

   /**
   * Get billToAddressOverride
   * @return billToAddressOverride
  **/
  @ApiModelProperty(value = "")
  public BooleanValue getBillToAddressOverride() {
    return billToAddressOverride;
  }

  public void setBillToAddressOverride(BooleanValue billToAddressOverride) {
    this.billToAddressOverride = billToAddressOverride;
  }

  public SalesOrder billToAddressValidated(BooleanValue billToAddressValidated) {
    this.billToAddressValidated = billToAddressValidated;
    return this;
  }

   /**
   * Get billToAddressValidated
   * @return billToAddressValidated
  **/
  @ApiModelProperty(value = "")
  public BooleanValue getBillToAddressValidated() {
    return billToAddressValidated;
  }

  public void setBillToAddressValidated(BooleanValue billToAddressValidated) {
    this.billToAddressValidated = billToAddressValidated;
  }

  public SalesOrder billToContact(DocContact billToContact) {
    this.billToContact = billToContact;
    return this;
  }

   /**
   * Get billToContact
   * @return billToContact
  **/
  @ApiModelProperty(value = "")
  public DocContact getBillToContact() {
    return billToContact;
  }

  public void setBillToContact(DocContact billToContact) {
    this.billToContact = billToContact;
  }

  public SalesOrder billToContactOverride(BooleanValue billToContactOverride) {
    this.billToContactOverride = billToContactOverride;
    return this;
  }

   /**
   * Get billToContactOverride
   * @return billToContactOverride
  **/
  @ApiModelProperty(value = "")
  public BooleanValue getBillToContactOverride() {
    return billToContactOverride;
  }

  public void setBillToContactOverride(BooleanValue billToContactOverride) {
    this.billToContactOverride = billToContactOverride;
  }

  public SalesOrder cashAccount(StringValue cashAccount) {
    this.cashAccount = cashAccount;
    return this;
  }

   /**
   * Get cashAccount
   * @return cashAccount
  **/
  @ApiModelProperty(value = "")
  public StringValue getCashAccount() {
    return cashAccount;
  }

  public void setCashAccount(StringValue cashAccount) {
    this.cashAccount = cashAccount;
  }

  public SalesOrder commissions(Commissions commissions) {
    this.commissions = commissions;
    return this;
  }

   /**
   * Get commissions
   * @return commissions
  **/
  @ApiModelProperty(value = "")
  public Commissions getCommissions() {
    return commissions;
  }

  public void setCommissions(Commissions commissions) {
    this.commissions = commissions;
  }

  public SalesOrder contactID(StringValue contactID) {
    this.contactID = contactID;
    return this;
  }

   /**
   * Get contactID
   * @return contactID
  **/
  @ApiModelProperty(value = "")
  public StringValue getContactID() {
    return contactID;
  }

  public void setContactID(StringValue contactID) {
    this.contactID = contactID;
  }

  public SalesOrder controlTotal(DecimalValue controlTotal) {
    this.controlTotal = controlTotal;
    return this;
  }

   /**
   * Get controlTotal
   * @return controlTotal
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getControlTotal() {
    return controlTotal;
  }

  public void setControlTotal(DecimalValue controlTotal) {
    this.controlTotal = controlTotal;
  }

  public SalesOrder creditHold(BooleanValue creditHold) {
    this.creditHold = creditHold;
    return this;
  }

   /**
   * Get creditHold
   * @return creditHold
  **/
  @ApiModelProperty(value = "")
  public BooleanValue getCreditHold() {
    return creditHold;
  }

  public void setCreditHold(BooleanValue creditHold) {
    this.creditHold = creditHold;
  }

  public SalesOrder currencyID(StringValue currencyID) {
    this.currencyID = currencyID;
    return this;
  }

   /**
   * Get currencyID
   * @return currencyID
  **/
  @ApiModelProperty(value = "")
  public StringValue getCurrencyID() {
    return currencyID;
  }

  public void setCurrencyID(StringValue currencyID) {
    this.currencyID = currencyID;
  }

  public SalesOrder currencyRate(DecimalValue currencyRate) {
    this.currencyRate = currencyRate;
    return this;
  }

   /**
   * Get currencyRate
   * @return currencyRate
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getCurrencyRate() {
    return currencyRate;
  }

  public void setCurrencyRate(DecimalValue currencyRate) {
    this.currencyRate = currencyRate;
  }

  public SalesOrder currencyRateTypeID(StringValue currencyRateTypeID) {
    this.currencyRateTypeID = currencyRateTypeID;
    return this;
  }

   /**
   * Get currencyRateTypeID
   * @return currencyRateTypeID
  **/
  @ApiModelProperty(value = "")
  public StringValue getCurrencyRateTypeID() {
    return currencyRateTypeID;
  }

  public void setCurrencyRateTypeID(StringValue currencyRateTypeID) {
    this.currencyRateTypeID = currencyRateTypeID;
  }

  public SalesOrder customerID(StringValue customerID) {
    this.customerID = customerID;
    return this;
  }

   /**
   * Get customerID
   * @return customerID
  **/
  @ApiModelProperty(value = "")
  public StringValue getCustomerID() {
    return customerID;
  }

  public void setCustomerID(StringValue customerID) {
    this.customerID = customerID;
  }

  public SalesOrder customerOrder(StringValue customerOrder) {
    this.customerOrder = customerOrder;
    return this;
  }

   /**
   * Get customerOrder
   * @return customerOrder
  **/
  @ApiModelProperty(value = "")
  public StringValue getCustomerOrder() {
    return customerOrder;
  }

  public void setCustomerOrder(StringValue customerOrder) {
    this.customerOrder = customerOrder;
  }

  public SalesOrder date(DateTimeValue date) {
    this.date = date;
    return this;
  }

   /**
   * Get date
   * @return date
  **/
  @ApiModelProperty(value = "")
  public DateTimeValue getDate() {
    return date;
  }

  public void setDate(DateTimeValue date) {
    this.date = date;
  }

  public SalesOrder description(StringValue description) {
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

  public SalesOrder destinationWarehouseID(StringValue destinationWarehouseID) {
    this.destinationWarehouseID = destinationWarehouseID;
    return this;
  }

   /**
   * Get destinationWarehouseID
   * @return destinationWarehouseID
  **/
  @ApiModelProperty(value = "")
  public StringValue getDestinationWarehouseID() {
    return destinationWarehouseID;
  }

  public void setDestinationWarehouseID(StringValue destinationWarehouseID) {
    this.destinationWarehouseID = destinationWarehouseID;
  }

  public SalesOrder details(List<SalesOrderDetail> details) {
    this.details = details;
    return this;
  }

  public SalesOrder addDetailsItem(SalesOrderDetail detailsItem) {
    if (this.details == null) {
      this.details = new ArrayList<>();
    }
    this.details.add(detailsItem);
    return this;
  }

   /**
   * Get details
   * @return details
  **/
  @ApiModelProperty(value = "")
  public List<SalesOrderDetail> getDetails() {
    return details;
  }

  public void setDetails(List<SalesOrderDetail> details) {
    this.details = details;
  }

  public SalesOrder disableAutomaticDiscountUpdate(BooleanValue disableAutomaticDiscountUpdate) {
    this.disableAutomaticDiscountUpdate = disableAutomaticDiscountUpdate;
    return this;
  }

   /**
   * Get disableAutomaticDiscountUpdate
   * @return disableAutomaticDiscountUpdate
  **/
  @ApiModelProperty(value = "")
  public BooleanValue getDisableAutomaticDiscountUpdate() {
    return disableAutomaticDiscountUpdate;
  }

  public void setDisableAutomaticDiscountUpdate(BooleanValue disableAutomaticDiscountUpdate) {
    this.disableAutomaticDiscountUpdate = disableAutomaticDiscountUpdate;
  }

  public SalesOrder discountDetails(List<SalesOrdersDiscountDetails> discountDetails) {
    this.discountDetails = discountDetails;
    return this;
  }

  public SalesOrder addDiscountDetailsItem(SalesOrdersDiscountDetails discountDetailsItem) {
    if (this.discountDetails == null) {
      this.discountDetails = new ArrayList<>();
    }
    this.discountDetails.add(discountDetailsItem);
    return this;
  }

   /**
   * Get discountDetails
   * @return discountDetails
  **/
  @ApiModelProperty(value = "")
  public List<SalesOrdersDiscountDetails> getDiscountDetails() {
    return discountDetails;
  }

  public void setDiscountDetails(List<SalesOrdersDiscountDetails> discountDetails) {
    this.discountDetails = discountDetails;
  }

  public SalesOrder effectiveDate(DateTimeValue effectiveDate) {
    this.effectiveDate = effectiveDate;
    return this;
  }

   /**
   * Get effectiveDate
   * @return effectiveDate
  **/
  @ApiModelProperty(value = "")
  public DateTimeValue getEffectiveDate() {
    return effectiveDate;
  }

  public void setEffectiveDate(DateTimeValue effectiveDate) {
    this.effectiveDate = effectiveDate;
  }

  public SalesOrder externalRef(StringValue externalRef) {
    this.externalRef = externalRef;
    return this;
  }

   /**
   * Get externalRef
   * @return externalRef
  **/
  @ApiModelProperty(value = "")
  public StringValue getExternalRef() {
    return externalRef;
  }

  public void setExternalRef(StringValue externalRef) {
    this.externalRef = externalRef;
  }

  public SalesOrder financialSettings(FinancialSettings financialSettings) {
    this.financialSettings = financialSettings;
    return this;
  }

   /**
   * Get financialSettings
   * @return financialSettings
  **/
  @ApiModelProperty(value = "")
  public FinancialSettings getFinancialSettings() {
    return financialSettings;
  }

  public void setFinancialSettings(FinancialSettings financialSettings) {
    this.financialSettings = financialSettings;
  }

  public SalesOrder hold(BooleanValue hold) {
    this.hold = hold;
    return this;
  }

   /**
   * Get hold
   * @return hold
  **/
  @ApiModelProperty(value = "")
  public BooleanValue getHold() {
    return hold;
  }

  public void setHold(BooleanValue hold) {
    this.hold = hold;
  }

  public SalesOrder isTaxValid(BooleanValue isTaxValid) {
    this.isTaxValid = isTaxValid;
    return this;
  }

   /**
   * Get isTaxValid
   * @return isTaxValid
  **/
  @ApiModelProperty(value = "")
  public BooleanValue getIsTaxValid() {
    return isTaxValid;
  }

  public void setIsTaxValid(BooleanValue isTaxValid) {
    this.isTaxValid = isTaxValid;
  }

  public SalesOrder lastModified(DateTimeValue lastModified) {
    this.lastModified = lastModified;
    return this;
  }

   /**
   * Get lastModified
   * @return lastModified
  **/
  @ApiModelProperty(value = "")
  public DateTimeValue getLastModified() {
    return lastModified;
  }

  public void setLastModified(DateTimeValue lastModified) {
    this.lastModified = lastModified;
  }

  public SalesOrder locationID(StringValue locationID) {
    this.locationID = locationID;
    return this;
  }

   /**
   * Get locationID
   * @return locationID
  **/
  @ApiModelProperty(value = "")
  public StringValue getLocationID() {
    return locationID;
  }

  public void setLocationID(StringValue locationID) {
    this.locationID = locationID;
  }

  public SalesOrder orderedQty(DecimalValue orderedQty) {
    this.orderedQty = orderedQty;
    return this;
  }

   /**
   * Get orderedQty
   * @return orderedQty
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getOrderedQty() {
    return orderedQty;
  }

  public void setOrderedQty(DecimalValue orderedQty) {
    this.orderedQty = orderedQty;
  }

  public SalesOrder orderNbr(StringValue orderNbr) {
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

  public SalesOrder orderTotal(DecimalValue orderTotal) {
    this.orderTotal = orderTotal;
    return this;
  }

   /**
   * Get orderTotal
   * @return orderTotal
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getOrderTotal() {
    return orderTotal;
  }

  public void setOrderTotal(DecimalValue orderTotal) {
    this.orderTotal = orderTotal;
  }

  public SalesOrder orderType(StringValue orderType) {
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

  public SalesOrder paymentMethod(StringValue paymentMethod) {
    this.paymentMethod = paymentMethod;
    return this;
  }

   /**
   * Get paymentMethod
   * @return paymentMethod
  **/
  @ApiModelProperty(value = "")
  public StringValue getPaymentMethod() {
    return paymentMethod;
  }

  public void setPaymentMethod(StringValue paymentMethod) {
    this.paymentMethod = paymentMethod;
  }

  public SalesOrder payments(List<SalesOrderPayment> payments) {
    this.payments = payments;
    return this;
  }

  public SalesOrder addPaymentsItem(SalesOrderPayment paymentsItem) {
    if (this.payments == null) {
      this.payments = new ArrayList<>();
    }
    this.payments.add(paymentsItem);
    return this;
  }

   /**
   * Get payments
   * @return payments
  **/
  @ApiModelProperty(value = "")
  public List<SalesOrderPayment> getPayments() {
    return payments;
  }

  public void setPayments(List<SalesOrderPayment> payments) {
    this.payments = payments;
  }

  public SalesOrder preferredWarehouseID(StringValue preferredWarehouseID) {
    this.preferredWarehouseID = preferredWarehouseID;
    return this;
  }

   /**
   * Get preferredWarehouseID
   * @return preferredWarehouseID
  **/
  @ApiModelProperty(value = "")
  public StringValue getPreferredWarehouseID() {
    return preferredWarehouseID;
  }

  public void setPreferredWarehouseID(StringValue preferredWarehouseID) {
    this.preferredWarehouseID = preferredWarehouseID;
  }

  public SalesOrder project(StringValue project) {
    this.project = project;
    return this;
  }

   /**
   * Get project
   * @return project
  **/
  @ApiModelProperty(value = "")
  public StringValue getProject() {
    return project;
  }

  public void setProject(StringValue project) {
    this.project = project;
  }

  public SalesOrder reciprocalRate(DecimalValue reciprocalRate) {
    this.reciprocalRate = reciprocalRate;
    return this;
  }

   /**
   * Get reciprocalRate
   * @return reciprocalRate
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getReciprocalRate() {
    return reciprocalRate;
  }

  public void setReciprocalRate(DecimalValue reciprocalRate) {
    this.reciprocalRate = reciprocalRate;
  }

  public SalesOrder requestedOn(DateTimeValue requestedOn) {
    this.requestedOn = requestedOn;
    return this;
  }

   /**
   * Get requestedOn
   * @return requestedOn
  **/
  @ApiModelProperty(value = "")
  public DateTimeValue getRequestedOn() {
    return requestedOn;
  }

  public void setRequestedOn(DateTimeValue requestedOn) {
    this.requestedOn = requestedOn;
  }

  public SalesOrder shipments(List<SalesOrderShipment> shipments) {
    this.shipments = shipments;
    return this;
  }

  public SalesOrder addShipmentsItem(SalesOrderShipment shipmentsItem) {
    if (this.shipments == null) {
      this.shipments = new ArrayList<>();
    }
    this.shipments.add(shipmentsItem);
    return this;
  }

   /**
   * Get shipments
   * @return shipments
  **/
  @ApiModelProperty(value = "")
  public List<SalesOrderShipment> getShipments() {
    return shipments;
  }

  public void setShipments(List<SalesOrderShipment> shipments) {
    this.shipments = shipments;
  }

  public SalesOrder shippingSettings(ShippingSettings shippingSettings) {
    this.shippingSettings = shippingSettings;
    return this;
  }

   /**
   * Get shippingSettings
   * @return shippingSettings
  **/
  @ApiModelProperty(value = "")
  public ShippingSettings getShippingSettings() {
    return shippingSettings;
  }

  public void setShippingSettings(ShippingSettings shippingSettings) {
    this.shippingSettings = shippingSettings;
  }

  public SalesOrder shipToAddress(Address shipToAddress) {
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

  public SalesOrder shipToAddressOverride(BooleanValue shipToAddressOverride) {
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

  public SalesOrder shipToAddressValidated(BooleanValue shipToAddressValidated) {
    this.shipToAddressValidated = shipToAddressValidated;
    return this;
  }

   /**
   * Get shipToAddressValidated
   * @return shipToAddressValidated
  **/
  @ApiModelProperty(value = "")
  public BooleanValue getShipToAddressValidated() {
    return shipToAddressValidated;
  }

  public void setShipToAddressValidated(BooleanValue shipToAddressValidated) {
    this.shipToAddressValidated = shipToAddressValidated;
  }

  public SalesOrder shipToContact(DocContact shipToContact) {
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

  public SalesOrder shipToContactOverride(BooleanValue shipToContactOverride) {
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

  public SalesOrder shipVia(StringValue shipVia) {
    this.shipVia = shipVia;
    return this;
  }

   /**
   * Get shipVia
   * @return shipVia
  **/
  @ApiModelProperty(value = "")
  public StringValue getShipVia() {
    return shipVia;
  }

  public void setShipVia(StringValue shipVia) {
    this.shipVia = shipVia;
  }

  public SalesOrder status(StringValue status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")
  public StringValue getStatus() {
    return status;
  }

  public void setStatus(StringValue status) {
    this.status = status;
  }

  public SalesOrder taxDetails(List<TaxDetail> taxDetails) {
    this.taxDetails = taxDetails;
    return this;
  }

  public SalesOrder addTaxDetailsItem(TaxDetail taxDetailsItem) {
    if (this.taxDetails == null) {
      this.taxDetails = new ArrayList<>();
    }
    this.taxDetails.add(taxDetailsItem);
    return this;
  }

   /**
   * Get taxDetails
   * @return taxDetails
  **/
  @ApiModelProperty(value = "")
  public List<TaxDetail> getTaxDetails() {
    return taxDetails;
  }

  public void setTaxDetails(List<TaxDetail> taxDetails) {
    this.taxDetails = taxDetails;
  }

  public SalesOrder taxTotal(DecimalValue taxTotal) {
    this.taxTotal = taxTotal;
    return this;
  }

   /**
   * Get taxTotal
   * @return taxTotal
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getTaxTotal() {
    return taxTotal;
  }

  public void setTaxTotal(DecimalValue taxTotal) {
    this.taxTotal = taxTotal;
  }

  public SalesOrder totals(Totals totals) {
    this.totals = totals;
    return this;
  }

   /**
   * Get totals
   * @return totals
  **/
  @ApiModelProperty(value = "")
  public Totals getTotals() {
    return totals;
  }

  public void setTotals(Totals totals) {
    this.totals = totals;
  }

  public SalesOrder vaTExemptTotal(DecimalValue vaTExemptTotal) {
    this.vaTExemptTotal = vaTExemptTotal;
    return this;
  }

   /**
   * Get vaTExemptTotal
   * @return vaTExemptTotal
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getVaTExemptTotal() {
    return vaTExemptTotal;
  }

  public void setVaTExemptTotal(DecimalValue vaTExemptTotal) {
    this.vaTExemptTotal = vaTExemptTotal;
  }

  public SalesOrder vaTTaxableTotal(DecimalValue vaTTaxableTotal) {
    this.vaTTaxableTotal = vaTTaxableTotal;
    return this;
  }

   /**
   * Get vaTTaxableTotal
   * @return vaTTaxableTotal
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getVaTTaxableTotal() {
    return vaTTaxableTotal;
  }

  public void setVaTTaxableTotal(DecimalValue vaTTaxableTotal) {
    this.vaTTaxableTotal = vaTTaxableTotal;
  }

}
