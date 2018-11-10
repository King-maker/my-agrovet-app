package ke.co.agvt.myagrovet;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class AgrovetThkAdapter extends BaseAdapter {

    LayoutInflater mInflatorThk;
    String[] AgrovetsThk;
    String[] locationThk;
    String[] contactThk;

    public AgrovetThkAdapter(Context c, String[] i, String[] l, String[] ct){
        AgrovetsThk = i;
        locationThk = l;
        contactThk = ct;
        mInflatorThk = (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return AgrovetsThk.length;
    }

    @Override
    public Object getItem(int i) {
        return AgrovetsThk[i];
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View t = mInflatorThk.inflate(R.layout.list_view_details,null);
        TextView nameTextView =(TextView) t.findViewById(R.id.nameTextView);
        TextView locationTextView =(TextView) t.findViewById(R.id.locationTextView);
        TextView contactTextView =(TextView) t.findViewById(R.id.contactTextView);

        String nameThk = AgrovetsThk[i];
        String locThk = locationThk[i];
        String contThk = contactThk[i];

        nameTextView.setText(nameThk);
        locationTextView.setText(locThk);
        contactTextView.setText(contThk);
        return t;
    }
}
