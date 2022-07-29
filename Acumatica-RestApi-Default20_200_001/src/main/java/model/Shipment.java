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
 * Shipment
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-06-01T18:06:51.194Z")
public class Shipment extends Entity {
  @SerializedName("BaseCurrencyID")
  private StringValue baseCurrencyID = null;

  @SerializedName("ControlQty")
  private DecimalValue controlQty = null;

  @SerializedName("CreatedDateTime")
  private DateTimeValue createdDateTime = null;

  @SerializedName("CurrencyRate")
  private DecimalValue currencyRate = null;

  @SerializedName("CurrencyRateTypeID")
  private StringValue currencyRateTypeID = null;

  @SerializedName("CurrencyViewState")
  private BooleanValue currencyViewState = null;

  @SerializedName("CustomerID")
  private StringValue customerID = null;

  @SerializedName("CreateNewShipmentForEveryOrder")
  private BooleanValue createNewShipmentForEveryOrder = null;

  @SerializedName("Details")
  private List<ShipmentDetail> details = null;

  @SerializedName("Description")
  private StringValue description = null;

  @SerializedName("EffectiveDate")
  private DateTimeValue effectiveDate = null;

  @SerializedName("FOBPoint")
  private StringValue foBPoint = null;

  @SerializedName("OverrideFreightPrice")
  private BooleanValue overrideFreightPrice = null;

  @SerializedName("FreightAmount")
  private DecimalValue freightAmount = null;

  @SerializedName("FreightCost")
  private DecimalValue freightCost = null;

  @SerializedName("FreightCurrencyID")
  private StringValue freightCurrencyID = null;

  @SerializedName("GroundCollect")
  private BooleanValue groundCollect = null;

  @SerializedName("Hold")
  private BooleanValue hold = null;

  @SerializedName("Insurance")
  private BooleanValue insurance = null;

  @SerializedName("LastModifiedDateTime")
  private DateTimeValue lastModifiedDateTime = null;

  @SerializedName("LocationID")
  private StringValue locationID = null;

  @SerializedName("Operation")
  private StringValue operation = null;

  @SerializedName("Orders")
  private List<ShipmentOrderDetail> orders = null;

  @SerializedName("Owner")
  private StringValue owner = null;

  @SerializedName("PackageCount")
  private IntValue packageCount = null;

  @SerializedName("Packages")
  private List<ShipmentPackage> packages = null;

  @SerializedName("PackageWeight")
  private DecimalValue packageWeight = null;

  @SerializedName("Picked")
  private BooleanValue picked = null;

  @SerializedName("ReciprocalRate")
  private DecimalValue reciprocalRate = null;

  @SerializedName("ResidentialDelivery")
  private BooleanValue residentialDelivery = null;

  @SerializedName("SaturdayDelivery")
  private BooleanValue saturdayDelivery = null;

  @SerializedName("ShipmentDate")
  private DateTimeValue shipmentDate = null;

  @SerializedName("ShipmentNbr")
  private StringValue shipmentNbr = null;

  @SerializedName("ShippedQty")
  private DecimalValue shippedQty = null;

  @SerializedName("ShippedVolume")
  private DecimalValue shippedVolume = null;

  @SerializedName("ShippedWeight")
  private DecimalValue shippedWeight = null;

  @SerializedName("ShippingSettings")
  private ShipToSettings shippingSettings = null;

  @SerializedName("ShippingTerms")
  private StringValue shippingTerms = null;

  @SerializedName("ShippingZoneID")
  private StringValue shippingZoneID = null;

  @SerializedName("ShipVia")
  private StringValue shipVia = null;

  @SerializedName("Status")
  private StringValue status = null;

  @SerializedName("ToWarehouseID")
  private StringValue toWarehouseID = null;

  @SerializedName("Type")
  private StringValue type = null;

  @SerializedName("UseCustomersAccount")
  private BooleanValue useCustomersAccount = null;

  @SerializedName("WarehouseID")
  private StringValue warehouseID = null;

  @SerializedName("WorkgroupID")
  private StringValue workgroupID = null;

  public Shipment baseCurrencyID(StringValue baseCurrencyID) {
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

  public Shipment controlQty(DecimalValue controlQty) {
    this.controlQty = controlQty;
    return this;
  }

   /**
   * Get controlQty
   * @return controlQty
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getControlQty() {
    return controlQty;
  }

  public void setControlQty(DecimalValue controlQty) {
    this.controlQty = controlQty;
  }

  public Shipment createdDateTime(DateTimeValue createdDateTime) {
    this.createdDateTime = createdDateTime;
    return this;
  }

   /**
   * Get createdDateTime
   * @return createdDateTime
  **/
  @ApiModelProperty(value = "")
  public DateTimeValue getCreatedDateTime() {
    return createdDateTime;
  }

  public void setCreatedDateTime(DateTimeValue createdDateTime) {
    this.createdDateTime = createdDateTime;
  }

  public Shipment currencyRate(DecimalValue currencyRate) {
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

  public Shipment currencyRateTypeID(StringValue currencyRateTypeID) {
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

  public Shipment currencyViewState(BooleanValue currencyViewState) {
    this.currencyViewState = currencyViewState;
    return this;
  }

   /**
   * Get currencyViewState
   * @return currencyViewState
  **/
  @ApiModelProperty(value = "")
  public BooleanValue getCurrencyViewState() {
    return currencyViewState;
  }

  public void setCurrencyViewState(BooleanValue currencyViewState) {
    this.currencyViewState = currencyViewState;
  }

  public Shipment customerID(StringValue customerID) {
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

  public Shipment createNewShipmentForEveryOrder(BooleanValue createNewShipmentForEveryOrder) {
    this.createNewShipmentForEveryOrder = createNewShipmentForEveryOrder;
    return this;
  }

   /**
   * Get createNewShipmentForEveryOrder
   * @return createNewShipmentForEveryOrder
  **/
  @ApiModelProperty(value = "")
  public BooleanValue getCreateNewShipmentForEveryOrder() {
    return createNewShipmentForEveryOrder;
  }

  public void setCreateNewShipmentForEveryOrder(BooleanValue createNewShipmentForEveryOrder) {
    this.createNewShipmentForEveryOrder = createNewShipmentForEveryOrder;
  }

  public Shipment details(List<ShipmentDetail> details) {
    this.details = details;
    return this;
  }

  public Shipment addDetailsItem(ShipmentDetail detailsItem) {
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
  public List<ShipmentDetail> getDetails() {
    return details;
  }

  public void setDetails(List<ShipmentDetail> details) {
    this.details = details;
  }

  public Shipment description(StringValue description) {
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

  public Shipment effectiveDate(DateTimeValue effectiveDate) {
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

  public Shipment foBPoint(StringValue foBPoint) {
    this.foBPoint = foBPoint;
    return this;
  }

   /**
   * Get foBPoint
   * @return foBPoint
  **/
  @ApiModelProperty(value = "")
  public StringValue getFoBPoint() {
    return foBPoint;
  }

  public void setFoBPoint(StringValue foBPoint) {
    this.foBPoint = foBPoint;
  }

  public Shipment overrideFreightPrice(BooleanValue overrideFreightPrice) {
    this.overrideFreightPrice = overrideFreightPrice;
    return this;
  }

   /**
   * Get overrideFreightPrice
   * @return overrideFreightPrice
  **/
  @ApiModelProperty(value = "")
  public BooleanValue getOverrideFreightPrice() {
    return overrideFreightPrice;
  }

  public void setOverrideFreightPrice(BooleanValue overrideFreightPrice) {
    this.overrideFreightPrice = overrideFreightPrice;
  }

  public Shipment freightAmount(DecimalValue freightAmount) {
    this.freightAmount = freightAmount;
    return this;
  }

   /**
   * Get freightAmount
   * @return freightAmount
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getFreightAmount() {
    return freightAmount;
  }

  public void setFreightAmount(DecimalValue freightAmount) {
    this.freightAmount = freightAmount;
  }

  public Shipment freightCost(DecimalValue freightCost) {
    this.freightCost = freightCost;
    return this;
  }

   /**
   * Get freightCost
   * @return freightCost
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getFreightCost() {
    return freightCost;
  }

  public void setFreightCost(DecimalValue freightCost) {
    this.freightCost = freightCost;
  }

  public Shipment freightCurrencyID(StringValue freightCurrencyID) {
    this.freightCurrencyID = freightCurrencyID;
    return this;
  }

   /**
   * Get freightCurrencyID
   * @return freightCurrencyID
  **/
  @ApiModelProperty(value = "")
  public StringValue getFreightCurrencyID() {
    return freightCurrencyID;
  }

  public void setFreightCurrencyID(StringValue freightCurrencyID) {
    this.freightCurrencyID = freightCurrencyID;
  }

  public Shipment groundCollect(BooleanValue groundCollect) {
    this.groundCollect = groundCollect;
    return this;
  }

   /**
   * Get groundCollect
   * @return groundCollect
  **/
  @ApiModelProperty(value = "")
  public BooleanValue getGroundCollect() {
    return groundCollect;
  }

  public void setGroundCollect(BooleanValue groundCollect) {
    this.groundCollect = groundCollect;
  }

  public Shipment hold(BooleanValue hold) {
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

  public Shipment insurance(BooleanValue insurance) {
    this.insurance = insurance;
    return this;
  }

   /**
   * Get insurance
   * @return insurance
  **/
  @ApiModelProperty(value = "")
  public BooleanValue getInsurance() {
    return insurance;
  }

  public void setInsurance(BooleanValue insurance) {
    this.insurance = insurance;
  }

  public Shipment lastModifiedDateTime(DateTimeValue lastModifiedDateTime) {
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

  public Shipment locationID(StringValue locationID) {
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

  public Shipment operation(StringValue operation) {
    this.operation = operation;
    return this;
  }

   /**
   * Get operation
   * @return operation
  **/
  @ApiModelProperty(value = "")
  public StringValue getOperation() {
    return operation;
  }

  public void setOperation(StringValue operation) {
    this.operation = operation;
  }

  public Shipment orders(List<ShipmentOrderDetail> orders) {
    this.orders = orders;
    return this;
  }

  public Shipment addOrdersItem(ShipmentOrderDetail ordersItem) {
    if (this.orders == null) {
      this.orders = new ArrayList<>();
    }
    this.orders.add(ordersItem);
    return this;
  }

   /**
   * Get orders
   * @return orders
  **/
  @ApiModelProperty(value = "")
  public List<ShipmentOrderDetail> getOrders() {
    return orders;
  }

  public void setOrders(List<ShipmentOrderDetail> orders) {
    this.orders = orders;
  }

  public Shipment owner(StringValue owner) {
    this.owner = owner;
    return this;
  }

   /**
   * Get owner
   * @return owner
  **/
  @ApiModelProperty(value = "")
  public StringValue getOwner() {
    return owner;
  }

  public void setOwner(StringValue owner) {
    this.owner = owner;
  }

  public Shipment packageCount(IntValue packageCount) {
    this.packageCount = packageCount;
    return this;
  }

   /**
   * Get packageCount
   * @return packageCount
  **/
  @ApiModelProperty(value = "")
  public IntValue getPackageCount() {
    return packageCount;
  }

  public void setPackageCount(IntValue packageCount) {
    this.packageCount = packageCount;
  }

  public Shipment packages(List<ShipmentPackage> packages) {
    this.packages = packages;
    return this;
  }

  public Shipment addPackagesItem(ShipmentPackage packagesItem) {
    if (this.packages == null) {
      this.packages = new ArrayList<>();
    }
    this.packages.add(packagesItem);
    return this;
  }

   /**
   * Get packages
   * @return packages
  **/
  @ApiModelProperty(value = "")
  public List<ShipmentPackage> getPackages() {
    return packages;
  }

  public void setPackages(List<ShipmentPackage> packages) {
    this.packages = packages;
  }

  public Shipment packageWeight(DecimalValue packageWeight) {
    this.packageWeight = packageWeight;
    return this;
  }

   /**
   * Get packageWeight
   * @return packageWeight
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getPackageWeight() {
    return packageWeight;
  }

  public void setPackageWeight(DecimalValue packageWeight) {
    this.packageWeight = packageWeight;
  }

  public Shipment picked(BooleanValue picked) {
    this.picked = picked;
    return this;
  }

   /**
   * Get picked
   * @return picked
  **/
  @ApiModelProperty(value = "")
  public BooleanValue getPicked() {
    return picked;
  }

  public void setPicked(BooleanValue picked) {
    this.picked = picked;
  }

  public Shipment reciprocalRate(DecimalValue reciprocalRate) {
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

  public Shipment residentialDelivery(BooleanValue residentialDelivery) {
    this.residentialDelivery = residentialDelivery;
    return this;
  }

   /**
   * Get residentialDelivery
   * @return residentialDelivery
  **/
  @ApiModelProperty(value = "")
  public BooleanValue getResidentialDelivery() {
    return residentialDelivery;
  }

  public void setResidentialDelivery(BooleanValue residentialDelivery) {
    this.residentialDelivery = residentialDelivery;
  }

  public Shipment saturdayDelivery(BooleanValue saturdayDelivery) {
    this.saturdayDelivery = saturdayDelivery;
    return this;
  }

   /**
   * Get saturdayDelivery
   * @return saturdayDelivery
  **/
  @ApiModelProperty(value = "")
  public BooleanValue getSaturdayDelivery() {
    return saturdayDelivery;
  }

  public void setSaturdayDelivery(BooleanValue saturdayDelivery) {
    this.saturdayDelivery = saturdayDelivery;
  }

  public Shipment shipmentDate(DateTimeValue shipmentDate) {
    this.shipmentDate = shipmentDate;
    return this;
  }

   /**
   * Get shipmentDate
   * @return shipmentDate
  **/
  @ApiModelProperty(value = "")
  public DateTimeValue getShipmentDate() {
    return shipmentDate;
  }

  public void setShipmentDate(DateTimeValue shipmentDate) {
    this.shipmentDate = shipmentDate;
  }

  public Shipment shipmentNbr(StringValue shipmentNbr) {
    this.shipmentNbr = shipmentNbr;
    return this;
  }

   /**
   * Get shipmentNbr
   * @return shipmentNbr
  **/
  @ApiModelProperty(value = "")
  public StringValue getShipmentNbr() {
    return shipmentNbr;
  }

  public void setShipmentNbr(StringValue shipmentNbr) {
    this.shipmentNbr = shipmentNbr;
  }

  public Shipment shippedQty(DecimalValue shippedQty) {
    this.shippedQty = shippedQty;
    return this;
  }

   /**
   * Get shippedQty
   * @return shippedQty
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getShippedQty() {
    return shippedQty;
  }

  public void setShippedQty(DecimalValue shippedQty) {
    this.shippedQty = shippedQty;
  }

  public Shipment shippedVolume(DecimalValue shippedVolume) {
    this.shippedVolume = shippedVolume;
    return this;
  }

   /**
   * Get shippedVolume
   * @return shippedVolume
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getShippedVolume() {
    return shippedVolume;
  }

  public void setShippedVolume(DecimalValue shippedVolume) {
    this.shippedVolume = shippedVolume;
  }

  public Shipment shippedWeight(DecimalValue shippedWeight) {
    this.shippedWeight = shippedWeight;
    return this;
  }

   /**
   * Get shippedWeight
   * @return shippedWeight
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getShippedWeight() {
    return shippedWeight;
  }

  public void setShippedWeight(DecimalValue shippedWeight) {
    this.shippedWeight = shippedWeight;
  }

  public Shipment shippingSettings(ShipToSettings shippingSettings) {
    this.shippingSettings = shippingSettings;
    return this;
  }

   /**
   * Get shippingSettings
   * @return shippingSettings
  **/
  @ApiModelProperty(value = "")
  public ShipToSettings getShippingSettings() {
    return shippingSettings;
  }

  public void setShippingSettings(ShipToSettings shippingSettings) {
    this.shippingSettings = shippingSettings;
  }

  public Shipment shippingTerms(StringValue shippingTerms) {
    this.shippingTerms = shippingTerms;
    return this;
  }

   /**
   * Get shippingTerms
   * @return shippingTerms
  **/
  @ApiModelProperty(value = "")
  public StringValue getShippingTerms() {
    return shippingTerms;
  }

  public void setShippingTerms(StringValue shippingTerms) {
    this.shippingTerms = shippingTerms;
  }

  public Shipment shippingZoneID(StringValue shippingZoneID) {
    this.shippingZoneID = shippingZoneID;
    return this;
  }

   /**
   * Get shippingZoneID
   * @return shippingZoneID
  **/
  @ApiModelProperty(value = "")
  public StringValue getShippingZoneID() {
    return shippingZoneID;
  }

  public void setShippingZoneID(StringValue shippingZoneID) {
    this.shippingZoneID = shippingZoneID;
  }

  public Shipment shipVia(StringValue shipVia) {
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

  public Shipment status(StringValue status) {
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

  public Shipment toWarehouseID(StringValue toWarehouseID) {
    this.toWarehouseID = toWarehouseID;
    return this;
  }

   /**
   * Get toWarehouseID
   * @return toWarehouseID
  **/
  @ApiModelProperty(value = "")
  public StringValue getToWarehouseID() {
    return toWarehouseID;
  }

  public void setToWarehouseID(StringValue toWarehouseID) {
    this.toWarehouseID = toWarehouseID;
  }

  public Shipment type(StringValue type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")
  public StringValue getType() {
    return type;
  }

  public void setType(StringValue type) {
    this.type = type;
  }

  public Shipment useCustomersAccount(BooleanValue useCustomersAccount) {
    this.useCustomersAccount = useCustomersAccount;
    return this;
  }

   /**
   * Get useCustomersAccount
   * @return useCustomersAccount
  **/
  @ApiModelProperty(value = "")
  public BooleanValue getUseCustomersAccount() {
    return useCustomersAccount;
  }

  public void setUseCustomersAccount(BooleanValue useCustomersAccount) {
    this.useCustomersAccount = useCustomersAccount;
  }

  public Shipment warehouseID(StringValue warehouseID) {
    this.warehouseID = warehouseID;
    return this;
  }

   /**
   * Get warehouseID
   * @return warehouseID
  **/
  @ApiModelProperty(value = "")
  public StringValue getWarehouseID() {
    return warehouseID;
  }

  public void setWarehouseID(StringValue warehouseID) {
    this.warehouseID = warehouseID;
  }

  public Shipment workgroupID(StringValue workgroupID) {
    this.workgroupID = workgroupID;
    return this;
  }

   /**
   * Get workgroupID
   * @return workgroupID
  **/
  @ApiModelProperty(value = "")
  public StringValue getWorkgroupID() {
    return workgroupID;
  }

  public void setWorkgroupID(StringValue workgroupID) {
    this.workgroupID = workgroupID;
  }

}
