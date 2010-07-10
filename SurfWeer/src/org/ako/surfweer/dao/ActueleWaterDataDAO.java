package org.ako.surfweer.dao;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URI;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.ako.surfweer.model.Spot;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

import android.util.Log;

public class ActueleWaterDataDAO {
	public Spot getWindsnelheidData(Spot spot) {
		try {
			HttpClient client = new DefaultHttpClient();
			HttpGet req = new HttpGet(new URI(spot.getAwdUrlWindgegevens()));
			HttpResponse resp = client.execute(req);
			String body = EntityUtils.toString(resp.getEntity());

			Log.i("DAO","body:" + body);
			Pattern p = Pattern.compile("De windsnelheid(.*)m\\/s");
			Matcher m = p.matcher(body);
			if(m.matches()){
				String windSpeed = m.group(1);
				Log.i("DAO","windspeed: " + windSpeed);
			}else{
				Log.i("DAO","No windspeed info found");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			Log.e("DAO", e.getMessage(), e);
		}
		return spot;
	}
}
