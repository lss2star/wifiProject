package kr_ac_kopoctc21Dao;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import kr_ac_kopoctc21Domain.WifiItem;

public class WifiItemDao {
	public WifiItem create (WifiItem wifiItem) {
		return null;
	}
	public WifiItem selectOne (int id) {
		return null;
	}
	public List<WifiItem> selectAll () {
		List<WifiItem> result = new ArrayList<>();
		File f = new File("C:\\Users\\kopo24\\Desktop\\12_04_07_E_무료와이파이정보 (2).txt");
		try (BufferedReader br = new BufferedReader(new FileReader(f))) {
			String readtxt;
			if ((readtxt = br.readLine()) == null) {
	            System.out.printf("빈 파일입니다\n");
	            return result;
	        }

	        String[] field_name = readtxt.split("\t");
	        int LineCnt = 0;
	        while ((readtxt = br.readLine()) != null) {
	            String[] field = readtxt.split("\t");
	            WifiItem item = new WifiItem();
	            item.setId(LineCnt);
	            item.setInstallationLocationName(field[1]);
	            item.setInstallationLocationDetails(field[2]);
	            item.setInstallationCityName(field[3]);
	            item.setInstallationDistrictName(field[4]);
	            item.setInstallationFacilityType(field[5]);
	            item.setServiceProviderName(field[6]);
	            item.setWifiSsid(field[7]);
	            item.setDateOfInstallation(field[8]);
	            item.setRoadNameAddress(field[9]);
	            item.setLotNumberAddress(field[10]);
	            item.setManagementNgencyName(field[11]);
	            item.setManagementAgencyPhoneNumber(field[12]);
	            item.setLatitude(Double.parseDouble(field[13]));
	            item.setLongitude(Double.parseDouble(field[14]));
	            item.setCreated(field[15]);
	            
	            result.add(item);
	            
	            LineCnt++;
	        }
		} catch (IOException e) {
			e.printStackTrace();
		}
		return result;		
		
	}
	public WifiItem update (WifiItem wifiItem) {
		return null;
	}
	public WifiItem delete (int id) {
		return null;
	}
}
