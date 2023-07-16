package com.example.kinopoiskup.data;

import androidx.annotation.NonNull;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import com.example.kinopoiskup.entity.CollectionDao;
import com.example.kinopoiskup.entity.CollectionDao_Impl;
import com.example.kinopoiskup.entity.FilmDao;
import com.example.kinopoiskup.entity.FilmDao_Impl;
import com.example.kinopoiskup.entity.StaffDao;
import com.example.kinopoiskup.entity.StaffDao_Impl;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class AppDatabase_Impl extends AppDatabase {
  private volatile CollectionDao _collectionDao;

  private volatile FilmDao _filmDao;

  private volatile StaffDao _staffDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `collection_table` (`name` TEXT NOT NULL, `count` INTEGER NOT NULL, `idx` INTEGER, PRIMARY KEY(`name`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `films_table` (`kinopoiskId` INTEGER, `category` INTEGER, `timestamp` INTEGER, `bitmask` INTEGER, `name` TEXT, `poster` TEXT, `genre` TEXT, `rating` REAL, PRIMARY KEY(`kinopoiskId`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `actors_table` (`staffId` INTEGER NOT NULL, `professionKey` TEXT NOT NULL, `nameRu` TEXT, `nameEn` TEXT, `description` TEXT, `posterUrl` TEXT, `professionText` TEXT, PRIMARY KEY(`staffId`, `professionKey`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'af0e0f05a5514c1a19cb54cf65f9bcac')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `collection_table`");
        _db.execSQL("DROP TABLE IF EXISTS `films_table`");
        _db.execSQL("DROP TABLE IF EXISTS `actors_table`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      public void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      public RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsCollectionTable = new HashMap<String, TableInfo.Column>(3);
        _columnsCollectionTable.put("name", new TableInfo.Column("name", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCollectionTable.put("count", new TableInfo.Column("count", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCollectionTable.put("idx", new TableInfo.Column("idx", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysCollectionTable = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesCollectionTable = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoCollectionTable = new TableInfo("collection_table", _columnsCollectionTable, _foreignKeysCollectionTable, _indicesCollectionTable);
        final TableInfo _existingCollectionTable = TableInfo.read(_db, "collection_table");
        if (! _infoCollectionTable.equals(_existingCollectionTable)) {
          return new RoomOpenHelper.ValidationResult(false, "collection_table(com.example.kinopoiskup.entity.CollectionEntity).\n"
                  + " Expected:\n" + _infoCollectionTable + "\n"
                  + " Found:\n" + _existingCollectionTable);
        }
        final HashMap<String, TableInfo.Column> _columnsFilmsTable = new HashMap<String, TableInfo.Column>(8);
        _columnsFilmsTable.put("kinopoiskId", new TableInfo.Column("kinopoiskId", "INTEGER", false, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFilmsTable.put("category", new TableInfo.Column("category", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFilmsTable.put("timestamp", new TableInfo.Column("timestamp", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFilmsTable.put("bitmask", new TableInfo.Column("bitmask", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFilmsTable.put("name", new TableInfo.Column("name", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFilmsTable.put("poster", new TableInfo.Column("poster", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFilmsTable.put("genre", new TableInfo.Column("genre", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFilmsTable.put("rating", new TableInfo.Column("rating", "REAL", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysFilmsTable = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesFilmsTable = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoFilmsTable = new TableInfo("films_table", _columnsFilmsTable, _foreignKeysFilmsTable, _indicesFilmsTable);
        final TableInfo _existingFilmsTable = TableInfo.read(_db, "films_table");
        if (! _infoFilmsTable.equals(_existingFilmsTable)) {
          return new RoomOpenHelper.ValidationResult(false, "films_table(com.example.kinopoiskup.entity.FilmEntity).\n"
                  + " Expected:\n" + _infoFilmsTable + "\n"
                  + " Found:\n" + _existingFilmsTable);
        }
        final HashMap<String, TableInfo.Column> _columnsActorsTable = new HashMap<String, TableInfo.Column>(7);
        _columnsActorsTable.put("staffId", new TableInfo.Column("staffId", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsActorsTable.put("professionKey", new TableInfo.Column("professionKey", "TEXT", true, 2, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsActorsTable.put("nameRu", new TableInfo.Column("nameRu", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsActorsTable.put("nameEn", new TableInfo.Column("nameEn", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsActorsTable.put("description", new TableInfo.Column("description", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsActorsTable.put("posterUrl", new TableInfo.Column("posterUrl", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsActorsTable.put("professionText", new TableInfo.Column("professionText", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysActorsTable = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesActorsTable = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoActorsTable = new TableInfo("actors_table", _columnsActorsTable, _foreignKeysActorsTable, _indicesActorsTable);
        final TableInfo _existingActorsTable = TableInfo.read(_db, "actors_table");
        if (! _infoActorsTable.equals(_existingActorsTable)) {
          return new RoomOpenHelper.ValidationResult(false, "actors_table(com.example.kinopoiskup.entity.StaffEntity).\n"
                  + " Expected:\n" + _infoActorsTable + "\n"
                  + " Found:\n" + _existingActorsTable);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "af0e0f05a5514c1a19cb54cf65f9bcac", "be02dc46cbeff96366b79014c9266dcd");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "collection_table","films_table","actors_table");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `collection_table`");
      _db.execSQL("DELETE FROM `films_table`");
      _db.execSQL("DELETE FROM `actors_table`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
    final HashMap<Class<?>, List<Class<?>>> _typeConvertersMap = new HashMap<Class<?>, List<Class<?>>>();
    _typeConvertersMap.put(CollectionDao.class, CollectionDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(FilmDao.class, FilmDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(StaffDao.class, StaffDao_Impl.getRequiredConverters());
    return _typeConvertersMap;
  }

  @Override
  public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
    final HashSet<Class<? extends AutoMigrationSpec>> _autoMigrationSpecsSet = new HashSet<Class<? extends AutoMigrationSpec>>();
    return _autoMigrationSpecsSet;
  }

  @Override
  public List<Migration> getAutoMigrations(
      @NonNull Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> autoMigrationSpecsMap) {
    return Arrays.asList();
  }

  @Override
  public CollectionDao getCollectionDao() {
    if (_collectionDao != null) {
      return _collectionDao;
    } else {
      synchronized(this) {
        if(_collectionDao == null) {
          _collectionDao = new CollectionDao_Impl(this);
        }
        return _collectionDao;
      }
    }
  }

  @Override
  public FilmDao getFilmDao() {
    if (_filmDao != null) {
      return _filmDao;
    } else {
      synchronized(this) {
        if(_filmDao == null) {
          _filmDao = new FilmDao_Impl(this);
        }
        return _filmDao;
      }
    }
  }

  @Override
  public StaffDao getStaffDao() {
    if (_staffDao != null) {
      return _staffDao;
    } else {
      synchronized(this) {
        if(_staffDao == null) {
          _staffDao = new StaffDao_Impl(this);
        }
        return _staffDao;
      }
    }
  }
}
