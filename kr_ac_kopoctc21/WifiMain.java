package kr_ac_kopoctc21;

import java.util.List;

import kr_ac_kopoctc21Dao.WifiItemDao;
import kr_ac_kopoctc21Domain.WifiItem;
import kr_ac_kopoctc21Service.WifiItemService;

public class WifiMain {

	public static void main(String[] args) {
		System.out.println("Wifi project");

		WifiItemService wifiItemService = new WifiItemService();
		WifiItemDao wifiItemDao = new WifiItemDao();
		List<WifiItem> wifiItems = wifiItemDao.selectAll();

		WifiItem me = new WifiItem();
		double me_lat = 37.386138;
		double me_lng = 127.120748;
		me.setLatitude(me_lat);
		me.setLongitude(me_lng);

		double max_dist = Double.MIN_VALUE;
		String max_address = "";
		String max_name = "";
		double max_lati = 0.0;
		double max_lng = 0.0;

		double min_dist = Double.MAX_VALUE;
		String min_address = "";
		String min_name = "";
		double min_lati = 0.0;
		double min_lng = 0.0;

		int LineCnt = 0;
		while (LineCnt < 1090) {
			for (WifiItem field : wifiItems) {
				double dist = wifiItemService.getDistance(me, field);
				System.out.printf("[%d��° �׸�]\n", LineCnt + 1);
				System.out.printf("���������θ��ּ� : %s\n", field.getLotNumberAddress());
				System.out.printf("���� : %f\n", field.getLatitude());
				System.out.printf("�浵 : %f\n", field.getLongitude());
				System.out.printf("���� �������� �Ÿ� : %f\n", dist);
				System.out.printf("=============================\n");
				if (max_dist < dist) {
					max_address = field.getLotNumberAddress();
					max_dist = dist;
					max_name = field.getInstallationLocationName();
					max_lati = field.getLatitude();
					max_lng = field.getLongitude();
				}
				if (min_dist > dist) {
					min_address = field.getLotNumberAddress();
					min_dist = dist;
					min_name = field.getInstallationLocationName();
					min_lati = field.getLatitude();
					min_lng = field.getLongitude();
				}
				LineCnt++;
			}
			System.out.printf("�ִ�Ÿ�\n");
			System.out.printf("�Ÿ� : %f\n", max_dist);
			System.out.printf("��Ҹ� : %s\n", max_name);
			System.out.printf("�ּ� : %s\n", max_address);
			System.out.printf("���� : %f\n", max_lati);
			System.out.printf("�浵 : %f\n", max_lng);

			System.out.println();

			System.out.printf("�ּҰŸ�\n");
			System.out.printf("�Ÿ� : %f\n", min_dist);
			System.out.printf("��Ҹ� : %s\n", min_name);
			System.out.printf("�ּ� : %s\n", min_address);
			System.out.printf("���� : %f\n", min_lati);
			System.out.printf("�浵 : %f\n", min_lng);

		}

	}

}
