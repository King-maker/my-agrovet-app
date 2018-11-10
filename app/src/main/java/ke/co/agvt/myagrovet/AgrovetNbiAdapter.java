package ke.co.agvt.myagrovet;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class AgrovetNbiAdapter extends BaseAdapter {

    LayoutInflater mInflatorNbi;
    String[] AgrovetsNbi;
    String[] locationNbi;
    String[] contactNbi;

    public AgrovetNbiAdapter(Context c, String[] i, String[] l, String[] ct){
        AgrovetsNbi = i;
        locationNbi = l;
        contactNbi = ct;
        mInflatorNbi = (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return AgrovetsNbi.length;
    }

    @Override
    public Object getItem(int i) {
        return AgrovetsNbi[i];
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View n = mInflatorNbi.inflate(R.layout.list_view_details,null);
        TextView nameTextView =(TextView) n.findViewById(R.id.nameTextView);
        TextView locationTextView =(TextView) n.findViewById(R.id.locationTextView);
        TextView contactTextView =(TextView) n.findViewById(R.id.contactTextView);

        String nameNbi = AgrovetsNbi[i];
        String locNbi = locationNbi[i];
        String contNbi = contactNbi[i];

        nameTextView.setText(nameNbi);
        locationTextView.setText(locNbi);
        contactTextView.setText(contNbi);
        return n;
    }
}
