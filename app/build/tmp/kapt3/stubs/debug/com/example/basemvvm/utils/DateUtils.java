package com.example.basemvvm.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006\u00a8\u0006\t"}, d2 = {"Lcom/example/basemvvm/utils/DateUtils;", "", "()V", "timeToMilliseconds", "", "time", "", "pattern", "Companion", "app_debug"})
public final class DateUtils {
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FORMAT_DATE_TIME = "yyyy-MM-dd HH:mm:ss";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FORMAT_DATE = "yyyy-MM-dd";
    public static final com.example.basemvvm.utils.DateUtils.Companion Companion = null;
    
    /**
     * convert time(with pattern) to milliseconds
     */
    public final long timeToMilliseconds(@org.jetbrains.annotations.NotNull()
    java.lang.String time, @org.jetbrains.annotations.NotNull()
    java.lang.String pattern) {
        return 0L;
    }
    
    public DateUtils() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/example/basemvvm/utils/DateUtils$Companion;", "", "()V", "FORMAT_DATE", "", "FORMAT_DATE_TIME", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}