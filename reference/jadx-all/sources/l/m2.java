package l;

import android.R;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public final class m2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f10843a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f10844b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ImageView f10845c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ImageView f10846d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ImageView f10847e;

    public m2(View view) {
        this.f10843a = (TextView) view.findViewById(R.id.text1);
        this.f10844b = (TextView) view.findViewById(R.id.text2);
        this.f10845c = (ImageView) view.findViewById(R.id.icon1);
        this.f10846d = (ImageView) view.findViewById(R.id.icon2);
        this.f10847e = (ImageView) view.findViewById(com.ride.accepter.R.id.edit_query);
    }
}
