package clm.soccergames;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by jbt on 7/19/2016.
 */
public class mySQLiteOpenHelper extends SQLiteOpenHelper{
    @Override
    public void onCreate(SQLiteDatabase db) {
        // TODO get database , if null create a new file

        String createCommand = "CREATE TABLE"+
                " "+ myConstants.DB_TABLE+" ( "+
                " "+ myConstants.DB_ID+" INTEGER PRIMARY KEY AUTO INCREMENT"+
                " "+ myConstants.DB_COUNTRY1+" TEXT"+
                " "+ myConstants.DB_COUNTRY2+" TEXT"+
                " "+ myConstants.DB_COUNTRY2+" TEXT"+
                " "+ myConstants.DB_WINNER+" TEXT"+
                " "+ myConstants.DB_FLAG1+" TEXT"+
                " "+ myConstants.DB_FLAG2+" TEXT"+
                " "+" );";

        db.execSQL(createCommand);


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    public mySQLiteOpenHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {

        super(context, myConstants.DB_NAME, null, myConstants.DB_VERSION);
    }




}
