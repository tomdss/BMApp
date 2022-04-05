package com.example.basemvvm.data.preferences;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\t\u001a\u00020\u0006J\u0010\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/example/basemvvm/data/preferences/AppPreferences;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "masterKeyAlias", "", "sharedPreferences", "Landroid/content/SharedPreferences;", "getAccessToken", "saveAccessToken", "", "accessToken", "app_debug"})
public final class AppPreferences {
    private final java.lang.String masterKeyAlias = null;
    private final android.content.SharedPreferences sharedPreferences = null;
    private final android.content.Context context = null;
    
    /**
     * save access token
     */
    public final void saveAccessToken(@org.jetbrains.annotations.Nullable()
    java.lang.String accessToken) {
    }
    
    /**
     * get access token
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAccessToken() {
        return null;
    }
    
    @javax.inject.Inject()
    public AppPreferences(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
}