package org.ako.surfweer;

import org.ako.surfweer.model.Spot;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import 	android.view.LayoutInflater;

public class SpotAdapter extends ArrayAdapter<Spot> {
private Spot[]spots=null;
	public SpotAdapter(Context context, int textViewResourceId, Spot[] objects) {
		super(context, textViewResourceId, objects);
		spots = objects;
	}
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		 View v = convertView;
         if (v == null) {
             LayoutInflater vi = (LayoutInflater)getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
             v = vi.inflate(R.layout.spot_row, null);
         }
		Spot spot = spots[position];
		
		TextView spotText = (TextView) v.findViewById(R.id.spotname);
        if (spotText != null) {
              spotText.setText(spot.getName());        
        }
		TextView spotSummary = (TextView) v.findViewById(R.id.spotSummary);
        if (spotSummary != null) {
              spotSummary.setText(spot.getCurrentWindSpeedKnots() + " " + spot.getCurrentWindDirection() + " " + spot.getCurrentWaveHeight());        
        }
		return v;
	}

}
