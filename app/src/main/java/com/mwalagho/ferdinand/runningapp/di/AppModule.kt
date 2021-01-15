package com.mwalagho.ferdinand.runningapp.di

import android.app.Application
import android.content.Context
import androidx.room.Room
import com.mwalagho.ferdinand.runningapp.db.RunningDatabase
import com.mwalagho.ferdinand.runningapp.other.Constants.RUNNING_DATABASE_NAME
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Singleton

@Module
@InstallIn(ApplicationComponent::class ) //we use applicationComponent so our injectable objects are allive for the entirety of the app
object AppModule {

    @Singleton
    @Provides
    fun provideRunningDatabase(
        @ApplicationContext app:Context
    ) = Room.databaseBuilder(
        app,
        RunningDatabase::class.java,
        RUNNING_DATABASE_NAME
    ).build()

    @Singleton
    @Provides
    fun provideRunDao(db: RunningDatabase) = db.getRunDao()
}