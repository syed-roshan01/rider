package i3;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.emoji2.text.EmojiCompatInitializer;

/* JADX INFO: loaded from: classes.dex */
public final class m implements androidx.lifecycle.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ androidx.lifecycle.r f7979a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ EmojiCompatInitializer f7980b;

    public m(EmojiCompatInitializer emojiCompatInitializer, androidx.lifecycle.r rVar) {
        this.f7980b = emojiCompatInitializer;
        this.f7979a = rVar;
    }

    @Override // androidx.lifecycle.g
    public final void b(androidx.lifecycle.w wVar) {
        this.f7980b.getClass();
        (Build.VERSION.SDK_INT >= 28 ? b.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new p(), 500L);
        this.f7979a.c(this);
    }
}
