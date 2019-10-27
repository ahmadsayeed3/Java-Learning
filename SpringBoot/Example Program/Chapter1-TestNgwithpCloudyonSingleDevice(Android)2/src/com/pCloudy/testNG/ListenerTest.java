package com.pCloudy.testNG;

import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.IAlterSuiteListener;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;

public class ListenerTest implements IAlterSuiteListener {

	@Override
	public void alter(List<XmlSuite> list) {
		System.out.println("Alter XML");
		List<Object> deviceList = getDeviceList();
		
		XmlSuite suite = list.get(0);
		for (int i = 0; i < suite.getTests().size(); i++) {
			XmlTest xmlTest = suite.getTests().get(i);
			xmlTest.getLocalParameters().put("deviceName", deviceList.get(i).toString());
		}
	}

	private List<Object> getDeviceList() {
		String jsonString = getJson();
		JSONArray jsonArray = new JSONObject(jsonString).getJSONArray("devices");
		return jsonArray.toList();
	}

	private String getJson() {
		String jsonString = "{\"devices\":[ \"Samsung\", \"Google\"]}";
		return jsonString;
	}
}
