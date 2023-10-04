package com.example.crudtodoapplication.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.crudtodoapplication.data.database.model.Todo

@Database(
    entities = [Todo::class],
    version = 1
)
abstract class TodoDatabase: RoomDatabase() {

    abstract val dao: TodoDao

}