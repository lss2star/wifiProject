package kr_ac_kopoctc21Service;

import kr_ac_kopoctc21Domain.WifiItem;

public class WifiItemService {
	public double getDistance (WifiItem me, WifiItem target) {
		double lat1 = me.getLatitude();
	    double lng1 = me.getLongitude();
	    double lat2 = target.getLatitude();
	    double lng2 = target.getLongitude();

	    double dist = Math.sqrt(Math.pow(lat1 - lat2, 2) + Math.pow(lng1 - lng2, 2));
	    return dist;
	}
	
}
