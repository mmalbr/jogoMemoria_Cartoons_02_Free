package com.meafocus.memoriacartoon02;

import android.app.Application;

import com.meafocus.memoriacartoon02.utils.FontLoader;

public class GameApplication extends Application {

	@Override
	public void onCreate() {
		super.onCreate();
		FontLoader.loadFonts(this);

	}
}
