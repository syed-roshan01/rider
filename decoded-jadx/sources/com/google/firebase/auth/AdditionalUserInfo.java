package com.google.firebase.auth;

import a6.c;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public interface AdditionalUserInfo extends c {
    Map<String, Object> getProfile();

    String getProviderId();

    String getUsername();

    boolean isNewUser();
}
