package com.sk.android.skgson.entity;

import com.sk.android.skgson.config.Config;
import com.sk.android.skgson.config.Constant;

public enum ConvertLibrary {

    Gson, Jack, FastJson, LoganSquare, AutoValue, Other, Lombok;

    public static ConvertLibrary from() {
        return from(Config.getInstant().getAnnotationStr());
    }

    private static ConvertLibrary from(String annotation) {
        if (Config.getInstant().getAnnotationStr().equals(Constant.gsonAnnotation)) {
            return Gson;
        }
        if (Config.getInstant().getAnnotationStr().equals(Constant.fastAnnotation)) {
            return FastJson;
        }
        if (Config.getInstant().getAnnotationStr().equals(Constant.loganSquareAnnotation)) {
            return LoganSquare;
        }
        if (Config.getInstant().getAnnotationStr().equals(Constant.autoValueAnnotation)) {
            return AutoValue;
        }
        if (Config.getInstant().getAnnotationStr().equals(Constant.jackAnnotation)) {
            return Jack;
        }
        if (Config.getInstant().getAnnotationStr().equals(Constant.lombokAnnotation)) {
            return Lombok;
        }
        return Other;
    }
}
