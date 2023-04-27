package kr_ac_kopoctc21;

import kr_ac_kopoctc21Service.WifiItemService;

public class WifiMain {

	public static void main(String[] args) {
		System.out.println("Wifi project");
		
		
		WifiItemService wifiItemService = new WifiItemService();
		WifiItemDao wifiItemDao = new WifiItemDao();
		List<WifiItem> wifiItems = wifiItemDao.selectAll();
		
		WifiItem me = new WifiItem();
		for (WifiItem target : wifiItems) {
			double d = wifiItemService.getDistance(me, target);
		}

	}

}
