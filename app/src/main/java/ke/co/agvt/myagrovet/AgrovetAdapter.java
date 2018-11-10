package ke.co.agvt.myagrovet;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class AgrovetAdapter extends BaseAdapter {

    LayoutInflater mInflator;
    String[] Agrovets;
    String[] location;
    String[] contact;

    public AgrovetAdapter(Context c, String[] i, String[] l, String[] ct){
        Agrovets = i;
        location = l;
        contact = ct;
        mInflator = (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return Agrovets.length;
    }

    @Override
    public Object getItem(int i) {
        return Agrovets[i];
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View v = mInflator.inflate(R.layout.list_view_details,null);
        TextView nameTextView =(TextView) v.findViewById(R.id.nameTextView);
        TextView locationTextView =(TextView) v.findViewById(R.id.locationTextView);
        TextView contactTextView =(TextView) v.findViewById(R.id.contactTextView);

        String name = Agrovets[i];
        String loc = location[i];
        String cont = contact[i];

        nameTextView.setText(name);
        locationTextView.setText(loc);
        contactTextView.setText(cont);
        return v;
    }
}
