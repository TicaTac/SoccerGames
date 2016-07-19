package clm.soccergames;

import android.content.Context;
import android.database.Cursor;
import android.widget.SimpleCursorAdapter;

/**
 * Created by jbt on 7/19/2016.
 */
public class myCursorAdapter extends SimpleCursorAdapter{
    public myCursorAdapter(Context context, int layout, Cursor c, String[] from, int[] to) {
        super(context, layout, c, from, to);
    }
}
