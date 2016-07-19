package clm.soccergames;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by CLM on 7/19/2016.
 */
public class myDbCommands {

    Context context;
    mySQLiteOpenHelper helper;

    public myDbCommands(Context context) {
        this.context = context;
        helper=new mySQLiteOpenHelper(context);
    }

    public Cursor getDataFromDBAsCursor() {
        return helper.getReadableDatabase().query(myConstants.DB_TABLE,null,null,null,null,null,null);
    }



}
