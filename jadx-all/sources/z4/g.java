package z4;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import r8.r;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedPreferences f17236a;

    public g(Context context) {
        d7.a.m(context, "context");
        SharedPreferences sharedPreferences = context.getSharedPreferences("ride_history", 0);
        d7.a.l(sharedPreferences, "getSharedPreferences(...)");
        this.f17236a = sharedPreferences;
    }

    public final List a() {
        String string = this.f17236a.getString("history_json", null);
        r rVar = r.f13661a;
        if (string == null) {
            return rVar;
        }
        try {
            JSONArray jSONArray = new JSONArray(string);
            i9.g gVarS0 = z6.a.s0(0, jSONArray.length());
            ArrayList arrayList = new ArrayList(f9.a.y0(gVarS0));
            i9.f it = gVarS0.iterator();
            while (it.f8188c) {
                JSONObject jSONObject = jSONArray.getJSONObject(it.b());
                String strOptString = jSONObject.optString("app", "Unknown");
                d7.a.l(strOptString, "optString(...)");
                int iOptInt = jSONObject.optInt("fare", 0);
                boolean zOptBoolean = jSONObject.optBoolean("accepted", false);
                long jOptLong = jSONObject.optLong("ts", 0L);
                String strOptString2 = jSONObject.optString("loc", "");
                d7.a.l(strOptString2, "optString(...)");
                arrayList.add(new f(strOptString, iOptInt, zOptBoolean, jOptLong, strOptString2));
            }
            return arrayList;
        } catch (Exception unused) {
            return rVar;
        }
    }
}
