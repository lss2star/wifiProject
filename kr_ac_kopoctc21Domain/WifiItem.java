package kr_ac_kopoctc21Domain;

public class WifiItem {
	private int id;
	private String installationLocationName;
	private String installationLocationDetails;
	private String installationCityName;
	private String installationDistrictName;
	private String installationFacilityType;
	private String serviceProviderName;
	private String wifiSsid;
	private String dateOfInstallation;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getInstallationLocationName() {
		return installationLocationName;
	}
	public void setInstallationLocationName(String installationLocationName) {
		this.installationLocationName = installationLocationName;
	}
	public String getInstallationLocationDetails() {
		return installationLocationDetails;
	}
	public void setInstallationLocationDetails(String installationLocationDetails) {
		this.installationLocationDetails = installationLocationDetails;
	}
	public String getInstallationCityName() {
		return installationCityName;
	}
	public void setInstallationCityName(String installationCityName) {
		this.installationCityName = installationCityName;
	}
	public String getInstallationDistrictName() {
		return installationDistrictName;
	}
	public void setInstallationDistrictName(String installationDistrictName) {
		this.installationDistrictName = installationDistrictName;
	}
	public String getInstallationFacilityType() {
		return installationFacilityType;
	}
	public void setInstallationFacilityType(String installationFacilityType) {
		this.installationFacilityType = installationFacilityType;
	}
	public String getServiceProviderName() {
		return serviceProviderName;
	}
	public void setServiceProviderName(String serviceProviderName) {
		this.serviceProviderName = serviceProviderName;
	}
	public String getWifiSsid() {
		return wifiSsid;
	}
	public void setWifiSsid(String wifiSsid) {
		this.wifiSsid = wifiSsid;
	}
	public String getDateOfInstallation() {
		return dateOfInstallation;
	}
	public void setDateOfInstallation(String dateOfInstallation) {
		this.dateOfInstallation = dateOfInstallation;
	}
	public String getRoadNameAddress() {
		return roadNameAddress;
	}
	public void setRoadNameAddress(String roadNameAddress) {
		this.roadNameAddress = roadNameAddress;
	}
	public String getLotNumberAddress() {
		return lotNumberAddress;
	}
	public void setLotNumberAddress(String lotNumberAddress) {
		this.lotNumberAddress = lotNumberAddress;
	}
	public String getManagementNgencyName() {
		return managementNgencyName;
	}
	public void setManagementNgencyName(String managementNgencyName) {
		this.managementNgencyName = managementNgencyName;
	}
	public String getManagementAgencyPhoneNumber() {
		return managementAgencyPhoneNumber;
	}
	public void setManagementAgencyPhoneNumber(String managementAgencyPhoneNumber) {
		this.managementAgencyPhoneNumber = managementAgencyPhoneNumber;
	}
	public double getLatitude() {
		return latitude;
	}
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	public double getLongitude() {
		return longitude;
	}
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	public String getCreated() {
		return created;
	}
	public void setCreated(String created) {
		this.created = created;
	}
	private String roadNameAddress;
	private String lotNumberAddress;
	private String managementNgencyName;
	private String managementAgencyPhoneNumber;
	private double latitude;
	private double longitude;
	private String created;

}
