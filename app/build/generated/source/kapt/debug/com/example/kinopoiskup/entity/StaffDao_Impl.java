package com.example.kinopoiskup.entity;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Long;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@SuppressWarnings({"unchecked", "deprecation"})
public final class StaffDao_Impl implements StaffDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<StaffEntity> __insertionAdapterOfStaffEntity;

  private final SharedSQLiteStatement __preparedStmtOfDelete;

  public StaffDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfStaffEntity = new EntityInsertionAdapter<StaffEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `actors_table` (`staffId`,`professionKey`,`nameRu`,`nameEn`,`description`,`posterUrl`,`professionText`) VALUES (?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, StaffEntity value) {
        stmt.bindLong(1, value.getStaffId());
        if (value.getProfessionKey() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getProfessionKey());
        }
        if (value.getNameRu() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getNameRu());
        }
        if (value.getNameEn() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getNameEn());
        }
        if (value.getDescription() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getDescription());
        }
        if (value.getPosterUrl() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getPosterUrl());
        }
        if (value.getProfessionText() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getProfessionText());
        }
      }
    };
    this.__preparedStmtOfDelete = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM actors_table";
        return _query;
      }
    };
  }

  @Override
  public Object insertAll(final List<StaffEntity> actors,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfStaffEntity.insert(actors);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object insert(final StaffEntity entity, final Continuation<? super Long> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Long>() {
      @Override
      public Long call() throws Exception {
        __db.beginTransaction();
        try {
          long _result = __insertionAdapterOfStaffEntity.insertAndReturnId(entity);
          __db.setTransactionSuccessful();
          return _result;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object delete(final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfDelete.acquire();
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
          __preparedStmtOfDelete.release(_stmt);
        }
      }
    }, continuation);
  }

  @Override
  public Object getPagedList(final int key, final int limit, final int offset,
      final Continuation<? super List<StaffEntity>> continuation) {
    final String _sql = "SELECT * FROM actors_table WHERE (professionKey == 'ACTOR') = ? LIMIT ? OFFSET ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 3);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, key);
    _argIndex = 2;
    _statement.bindLong(_argIndex, limit);
    _argIndex = 3;
    _statement.bindLong(_argIndex, offset);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<StaffEntity>>() {
      @Override
      public List<StaffEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfStaffId = CursorUtil.getColumnIndexOrThrow(_cursor, "staffId");
          final int _cursorIndexOfProfessionKey = CursorUtil.getColumnIndexOrThrow(_cursor, "professionKey");
          final int _cursorIndexOfNameRu = CursorUtil.getColumnIndexOrThrow(_cursor, "nameRu");
          final int _cursorIndexOfNameEn = CursorUtil.getColumnIndexOrThrow(_cursor, "nameEn");
          final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
          final int _cursorIndexOfPosterUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "posterUrl");
          final int _cursorIndexOfProfessionText = CursorUtil.getColumnIndexOrThrow(_cursor, "professionText");
          final List<StaffEntity> _result = new ArrayList<StaffEntity>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final StaffEntity _item;
            final int _tmpStaffId;
            _tmpStaffId = _cursor.getInt(_cursorIndexOfStaffId);
            final String _tmpProfessionKey;
            if (_cursor.isNull(_cursorIndexOfProfessionKey)) {
              _tmpProfessionKey = null;
            } else {
              _tmpProfessionKey = _cursor.getString(_cursorIndexOfProfessionKey);
            }
            final String _tmpNameRu;
            if (_cursor.isNull(_cursorIndexOfNameRu)) {
              _tmpNameRu = null;
            } else {
              _tmpNameRu = _cursor.getString(_cursorIndexOfNameRu);
            }
            final String _tmpNameEn;
            if (_cursor.isNull(_cursorIndexOfNameEn)) {
              _tmpNameEn = null;
            } else {
              _tmpNameEn = _cursor.getString(_cursorIndexOfNameEn);
            }
            final String _tmpDescription;
            if (_cursor.isNull(_cursorIndexOfDescription)) {
              _tmpDescription = null;
            } else {
              _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
            }
            final String _tmpPosterUrl;
            if (_cursor.isNull(_cursorIndexOfPosterUrl)) {
              _tmpPosterUrl = null;
            } else {
              _tmpPosterUrl = _cursor.getString(_cursorIndexOfPosterUrl);
            }
            final String _tmpProfessionText;
            if (_cursor.isNull(_cursorIndexOfProfessionText)) {
              _tmpProfessionText = null;
            } else {
              _tmpProfessionText = _cursor.getString(_cursorIndexOfProfessionText);
            }
            _item = new StaffEntity(_tmpStaffId,_tmpProfessionKey,_tmpNameRu,_tmpNameEn,_tmpDescription,_tmpPosterUrl,_tmpProfessionText);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, continuation);
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
