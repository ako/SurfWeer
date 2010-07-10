package org.ako.surfweer;

import org.ako.surfweer.model.Spot;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.content.Intent;

public class SpotAdapter extends ArrayAdapter<Spot> {
	private Spot[] spots = null;

	public SpotAdapter(Context context, int textViewResourceId, Spot[] objects) {
		super(context, textViewResourceId, objects);
		spots = objects;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		View v = convertView;
		if (v == null) {
			LayoutInflater vi = (LayoutInflater) getContext().getSystemService(
					Context.LAYOUT_INFLATER_SERVICE);
			v = vi.inflate(R.layout.spot_row, null);
		}

		Spot spot = spots[position];

		TextView spotText = (TextView) v.findViewById(R.id.spotname);
		if (spotText != null) {
			spotText.setText(spot.getName());
		}
		TextView spotSummary = (TextView) v.findViewById(R.id.spotSummary);
		if (spotSummary != null) {
			spotSummary.setText(spot.getCurrentWindSpeedKnots() + " "
					+ spot.getCurrentWindDirection() + " "
					+ spot.getCurrentWaveHeight());
		}
		v.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				Intent intent = new Intent(v.getContext(), SpotDetails.class);
				v.getContext().startActivity(intent);

			}

		});
		return v;
	}
}
