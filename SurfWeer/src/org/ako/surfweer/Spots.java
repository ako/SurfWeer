package org.ako.surfweer;

import org.ako.surfweer.model.Spot;

import android.app.Activity;
import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

public class Spots extends ListActivity {
	/** Called when the activity is first created. */

	static final Spot[] spots = new Spot[] {
			new Spot("Scheveningen", 15, 225, 100),
			new Spot("Hoek van Holland", 20, 180, 50),
			new Spot("IJmuiden", 21, 270, 150) };

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setListAdapter(new SpotAdapter(this,
				android.R.layout.simple_list_item_1, spots));
		// setContentView(R.layout.main);
	}
}