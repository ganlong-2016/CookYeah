package com.qxf.archer.cookman.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.qxf.archer.cookman.constant.Constant;

import static com.qxf.archer.cookman.constant.Constant.CREATE_TYPE_TABLE;

/**
 * 类描述：
 * <p>
 * 作者：Administrator on 2017/8/24 0024 16:08
 * 邮箱：377289596@qq.com
 */

public class DBHelper extends SQLiteOpenHelper {

    public DBHelper(Context context) {
        super(context, Constant.DB_NAME, null, Constant.DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        createTable(sqLiteDatabase);
    }

    /**
     * 创建数据库表
     */
    private void createTable(SQLiteDatabase sqLiteDatabase) {

        sqLiteDatabase.execSQL(CREATE_TYPE_TABLE);

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
