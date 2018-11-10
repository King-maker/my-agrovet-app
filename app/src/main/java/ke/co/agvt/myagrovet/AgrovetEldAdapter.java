package ke.co.agvt.myagrovet;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class AgrovetEldAdapter extends BaseAdapter {

    LayoutInflater mInflatorEld;
    String[] AgrovetsEld;
    String[] locationEld;
    String[] contactEld;

    public AgrovetEldAdapter(Context c, String[] i, String[] l, String[] ct){
        AgrovetsEld = i;
        locationEld = l;
        contactEld = ct;
        mInflatorEld = (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return AgrovetsEld.length;
    }

    @Override
    public Object getItem(int i) {
        return AgrovetsEld[i];
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View e = mInflatorEld.inflate(R.layout.list_view_details,null);
        TextView nameTextView =(TextView) e.findViewById(R.id.nameTextView);
        TextView locationTextView =(TextView) e.findViewById(R.id.locationTextView);
        TextView contactTextView =(TextView) e.findViewById(R.id.contactTextView);

        String nameEld = AgrovetsEld[i];
        String locEld = locationEld[i];
        String contEld = contactEld[i];

        nameTextView.setText(nameEld);
        locationTextView.setText(locEld);
        contactTextView.setText(contEld);
        return e;
    }
}
