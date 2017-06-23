/*
 * BackgroudService.java
 * BackgroudService
 * 
 * Github: https://github.com/daniulive/SmarterStreaming
 * 
 * Created by DaniuLive on 2016/12/12.
 * Copyright © 2014~2016 DaniuLive. All rights reserved.
 */

package com.bd.mylibrary;

import android.annotation.SuppressLint;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;

@SuppressLint({ "ClickableViewAccessibility", "NewApi" })
public class TestService extends Service {
	@Nullable
	@Override
	public IBinder onBind(Intent intent) {
		return null;
	}
}
