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
import java.lang.Double;
import java.lang.Exception;
import java.lang.Integer;
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
public final class FilmDao_Impl implements FilmDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<FilmEntity> __insertionAdapterOfFilmEntity;

  private final SharedSQLiteStatement __preparedStmtOfCleanFilmsCategory;

  private final SharedSQLiteStatement __preparedStmtOfDeleteFilmById;

  private final SharedSQLiteStatement __preparedStmtOfDeleteFilmsByCategory;

  private final SharedSQLiteStatement __preparedStmtOfDeleteFilms;

  private final SharedSQLiteStatement __preparedStmtOfUpdateFilmById;

  public FilmDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfFilmEntity = new EntityInsertionAdapter<FilmEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `films_table` (`kinopoiskId`,`category`,`timestamp`,`bitmask`,`name`,`poster`,`genre`,`rating`) VALUES (?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, FilmEntity value) {
        if (value.getKinopoiskId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.getKinopoiskId());
        }
        if (value.getCategory() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindLong(2, value.getCategory());
        }
        if (value.getTimestamp() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindLong(3, value.getTimestamp());
        }
        if (value.getBitmask() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindLong(4, value.getBitmask());
        }
        if (value.getName() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getName());
        }
        if (value.getPoster() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getPoster());
        }
        if (value.getGenre() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getGenre());
        }
        if (value.getRating() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindDouble(8, value.getRating());
        }
      }
    };
    this.__preparedStmtOfCleanFilmsCategory = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "UPDATE films_table SET bitmask=bitmask & ? WHERE bitmask & ? > 0";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteFilmById = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM films_table WHERE kinopoiskId=?";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteFilmsByCategory = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM films_table WHERE bitmask & ? > 0";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteFilms = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM films_table WHERE bitmask = 0";
        return _query;
      }
    };
    this.__preparedStmtOfUpdateFilmById = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "UPDATE films_table SET bitmask=? WHERE kinopoiskId=?";
        return _query;
      }
    };
  }

  @Override
  public Object insert(final FilmEntity entity, final Continuation<? super Long> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Long>() {
      @Override
      public Long call() throws Exception {
        __db.beginTransaction();
        try {
          long _result = __insertionAdapterOfFilmEntity.insertAndReturnId(entity);
          __db.setTransactionSuccessful();
          return _result;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object cleanFilmsCategory(final long bitset, final long target,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfCleanFilmsCategory.acquire();
        int _argIndex = 1;
        _stmt.bindLong(_argIndex, target);
        _argIndex = 2;
        _stmt.bindLong(_argIndex, bitset);
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
          __preparedStmtOfCleanFilmsCategory.release(_stmt);
        }
      }
    }, continuation);
  }

  @Override
  public Object deleteFilmById(final int id, final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteFilmById.acquire();
        int _argIndex = 1;
        _stmt.bindLong(_argIndex, id);
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
          __preparedStmtOfDeleteFilmById.release(_stmt);
        }
      }
    }, continuation);
  }

  @Override
  public Object deleteFilmsByCategory(final long bitset,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteFilmsByCategory.acquire();
        int _argIndex = 1;
        _stmt.bindLong(_argIndex, bitset);
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
          __preparedStmtOfDeleteFilmsByCategory.release(_stmt);
        }
      }
    }, continuation);
  }

  @Override
  public Object deleteFilms(final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteFilms.acquire();
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
          __preparedStmtOfDeleteFilms.release(_stmt);
        }
      }
    }, continuation);
  }

  @Override
  public Object updateFilmById(final int id, final long bitmask,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfUpdateFilmById.acquire();
        int _argIndex = 1;
        _stmt.bindLong(_argIndex, bitmask);
        _argIndex = 2;
        _stmt.bindLong(_argIndex, id);
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
          __preparedStmtOfUpdateFilmById.release(_stmt);
        }
      }
    }, continuation);
  }

  @Override
  public Object getFilmsByCategory(final long bitset,
      final Continuation<? super List<FilmEntity>> continuation) {
    final String _sql = "SELECT * FROM films_table WHERE bitmask & ? > 0";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, bitset);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<FilmEntity>>() {
      @Override
      public List<FilmEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfKinopoiskId = CursorUtil.getColumnIndexOrThrow(_cursor, "kinopoiskId");
          final int _cursorIndexOfCategory = CursorUtil.getColumnIndexOrThrow(_cursor, "category");
          final int _cursorIndexOfTimestamp = CursorUtil.getColumnIndexOrThrow(_cursor, "timestamp");
          final int _cursorIndexOfBitmask = CursorUtil.getColumnIndexOrThrow(_cursor, "bitmask");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfPoster = CursorUtil.getColumnIndexOrThrow(_cursor, "poster");
          final int _cursorIndexOfGenre = CursorUtil.getColumnIndexOrThrow(_cursor, "genre");
          final int _cursorIndexOfRating = CursorUtil.getColumnIndexOrThrow(_cursor, "rating");
          final List<FilmEntity> _result = new ArrayList<FilmEntity>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final FilmEntity _item;
            final Integer _tmpKinopoiskId;
            if (_cursor.isNull(_cursorIndexOfKinopoiskId)) {
              _tmpKinopoiskId = null;
            } else {
              _tmpKinopoiskId = _cursor.getInt(_cursorIndexOfKinopoiskId);
            }
            final Integer _tmpCategory;
            if (_cursor.isNull(_cursorIndexOfCategory)) {
              _tmpCategory = null;
            } else {
              _tmpCategory = _cursor.getInt(_cursorIndexOfCategory);
            }
            final Long _tmpTimestamp;
            if (_cursor.isNull(_cursorIndexOfTimestamp)) {
              _tmpTimestamp = null;
            } else {
              _tmpTimestamp = _cursor.getLong(_cursorIndexOfTimestamp);
            }
            final Long _tmpBitmask;
            if (_cursor.isNull(_cursorIndexOfBitmask)) {
              _tmpBitmask = null;
            } else {
              _tmpBitmask = _cursor.getLong(_cursorIndexOfBitmask);
            }
            final String _tmpName;
            if (_cursor.isNull(_cursorIndexOfName)) {
              _tmpName = null;
            } else {
              _tmpName = _cursor.getString(_cursorIndexOfName);
            }
            final String _tmpPoster;
            if (_cursor.isNull(_cursorIndexOfPoster)) {
              _tmpPoster = null;
            } else {
              _tmpPoster = _cursor.getString(_cursorIndexOfPoster);
            }
            final String _tmpGenre;
            if (_cursor.isNull(_cursorIndexOfGenre)) {
              _tmpGenre = null;
            } else {
              _tmpGenre = _cursor.getString(_cursorIndexOfGenre);
            }
            final Double _tmpRating;
            if (_cursor.isNull(_cursorIndexOfRating)) {
              _tmpRating = null;
            } else {
              _tmpRating = _cursor.getDouble(_cursorIndexOfRating);
            }
            _item = new FilmEntity(_tmpKinopoiskId,_tmpCategory,_tmpTimestamp,_tmpBitmask,_tmpName,_tmpPoster,_tmpGenre,_tmpRating);
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

  @Override
  public Object getFilmsAndActors(final Continuation<? super List<FilmEntity>> continuation) {
    final String _sql = "SELECT * FROM films_table WHERE bitmask=0 ORDER BY timestamp DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<FilmEntity>>() {
      @Override
      public List<FilmEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfKinopoiskId = CursorUtil.getColumnIndexOrThrow(_cursor, "kinopoiskId");
          final int _cursorIndexOfCategory = CursorUtil.getColumnIndexOrThrow(_cursor, "category");
          final int _cursorIndexOfTimestamp = CursorUtil.getColumnIndexOrThrow(_cursor, "timestamp");
          final int _cursorIndexOfBitmask = CursorUtil.getColumnIndexOrThrow(_cursor, "bitmask");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfPoster = CursorUtil.getColumnIndexOrThrow(_cursor, "poster");
          final int _cursorIndexOfGenre = CursorUtil.getColumnIndexOrThrow(_cursor, "genre");
          final int _cursorIndexOfRating = CursorUtil.getColumnIndexOrThrow(_cursor, "rating");
          final List<FilmEntity> _result = new ArrayList<FilmEntity>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final FilmEntity _item;
            final Integer _tmpKinopoiskId;
            if (_cursor.isNull(_cursorIndexOfKinopoiskId)) {
              _tmpKinopoiskId = null;
            } else {
              _tmpKinopoiskId = _cursor.getInt(_cursorIndexOfKinopoiskId);
            }
            final Integer _tmpCategory;
            if (_cursor.isNull(_cursorIndexOfCategory)) {
              _tmpCategory = null;
            } else {
              _tmpCategory = _cursor.getInt(_cursorIndexOfCategory);
            }
            final Long _tmpTimestamp;
            if (_cursor.isNull(_cursorIndexOfTimestamp)) {
              _tmpTimestamp = null;
            } else {
              _tmpTimestamp = _cursor.getLong(_cursorIndexOfTimestamp);
            }
            final Long _tmpBitmask;
            if (_cursor.isNull(_cursorIndexOfBitmask)) {
              _tmpBitmask = null;
            } else {
              _tmpBitmask = _cursor.getLong(_cursorIndexOfBitmask);
            }
            final String _tmpName;
            if (_cursor.isNull(_cursorIndexOfName)) {
              _tmpName = null;
            } else {
              _tmpName = _cursor.getString(_cursorIndexOfName);
            }
            final String _tmpPoster;
            if (_cursor.isNull(_cursorIndexOfPoster)) {
              _tmpPoster = null;
            } else {
              _tmpPoster = _cursor.getString(_cursorIndexOfPoster);
            }
            final String _tmpGenre;
            if (_cursor.isNull(_cursorIndexOfGenre)) {
              _tmpGenre = null;
            } else {
              _tmpGenre = _cursor.getString(_cursorIndexOfGenre);
            }
            final Double _tmpRating;
            if (_cursor.isNull(_cursorIndexOfRating)) {
              _tmpRating = null;
            } else {
              _tmpRating = _cursor.getDouble(_cursorIndexOfRating);
            }
            _item = new FilmEntity(_tmpKinopoiskId,_tmpCategory,_tmpTimestamp,_tmpBitmask,_tmpName,_tmpPoster,_tmpGenre,_tmpRating);
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

  @Override
  public Object getFilmBitmask(final int id, final Continuation<? super Long> continuation) {
    final String _sql = "SELECT bitmask FROM films_table WHERE kinopoiskId=? LIMIT 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<Long>() {
      @Override
      public Long call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final Long _result;
          if(_cursor.moveToFirst()) {
            if (_cursor.isNull(0)) {
              _result = null;
            } else {
              _result = _cursor.getLong(0);
            }
          } else {
            _result = null;
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
