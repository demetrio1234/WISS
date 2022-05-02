package composition_challenge;

public class Modem {
	private String typeOfModem;
	private String wifiPassword;
	private String bandwidth;
	

	public String getTypeOfModem() {
		return typeOfModem;
	}
	public String getWifiPassword() {
		return wifiPassword;
	}
	public String getBandwidth() {
		return bandwidth;
	}
	/**
	 * @param typeOfModem
	 * @param wifiPassword
	 * @param bandwidth
	 */
	public Modem(String typeOfModem, String wifiPassword, String bandwidth) {
		this.typeOfModem = typeOfModem;
		this.wifiPassword = wifiPassword;
		this.bandwidth = bandwidth;
	}
	

}
