/*
 * Copyright (C) 2013-2015 Mike Cunningham
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.emetophobe.permissionviewer.utils;

import android.content.SharedPreferences;


public class SettingsHelper {
	public static final String SHOW_SYSTEM_APPS = "pref_show_system_apps";
	public static final String APP_SORT_ORDER = "pref_app_sort_order";
	public static final String PERMISSION_SORT_ORDER = "pref_perm_sort_order";

	private SharedPreferences mSharedPrefs;


	public SettingsHelper(SharedPreferences sharedPrefs) {
		mSharedPrefs = sharedPrefs;
	}

	/**
	 * Returns the show system apps preference.
	 *
	 * @return true if system apps should be shown, false if system apps should be hidden.
	 */
	public boolean getShowSystemApps() {
		return mSharedPrefs.getBoolean(SHOW_SYSTEM_APPS, true);
	}

	/**
	 * Returns the application sort order preference.
	 *
	 * @return true if apps should be sorted by application name, false if applications should be sorted by permission count.
	 */
	public boolean getAppSortOrder() {
		return mSharedPrefs.getBoolean(APP_SORT_ORDER, false);
	}

	/**
	 * Returns the permission sort order preference.
	 *
	 * @return true if permissions should be sorted by permission name, false if permissions should be sorted by application count.
	 */
	public boolean getPermissionSortOrder() {
		return mSharedPrefs.getBoolean(PERMISSION_SORT_ORDER, false);
	}
}