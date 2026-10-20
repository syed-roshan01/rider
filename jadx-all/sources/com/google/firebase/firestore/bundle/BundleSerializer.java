package com.google.firebase.firestore.bundle;

import android.util.Base64;
import com.google.firebase.Timestamp;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.firestore.core.Bound;
import com.google.firebase.firestore.core.FieldFilter;
import com.google.firebase.firestore.core.Filter;
import com.google.firebase.firestore.core.OrderBy;
import com.google.firebase.firestore.core.Query;
import com.google.firebase.firestore.model.DocumentKey;
import com.google.firebase.firestore.model.FieldPath;
import com.google.firebase.firestore.model.MutableDocument;
import com.google.firebase.firestore.model.ObjectValue;
import com.google.firebase.firestore.model.ResourcePath;
import com.google.firebase.firestore.model.SnapshotVersion;
import com.google.firebase.firestore.model.Values;
import com.google.firebase.firestore.remote.RemoteSerializer;
import com.google.firebase.messaging.Constants;
import com.google.protobuf.m;
import com.google.protobuf.n;
import com.google.protobuf.p2;
import com.google.protobuf.q2;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import l.q;
import o7.d;
import o7.e;
import o7.g2;
import o7.i0;
import o7.i2;
import o7.k0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import x7.a;
import x7.b;

/* JADX INFO: loaded from: classes.dex */
public class BundleSerializer {
    private static final long MILLIS_PER_SECOND = 1000;
    private final RemoteSerializer remoteSerializer;
    private final SimpleDateFormat timestampFormat;

    public BundleSerializer(RemoteSerializer remoteSerializer) {
        this.remoteSerializer = remoteSerializer;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.ENGLISH);
        this.timestampFormat = simpleDateFormat;
        GregorianCalendar gregorianCalendar = new GregorianCalendar(TimeZone.getTimeZone("UTC"));
        gregorianCalendar.setGregorianChange(new Date(Long.MIN_VALUE));
        simpleDateFormat.setCalendar(gregorianCalendar);
    }

    private void decodeArrayValue(g2 g2Var, JSONArray jSONArray) {
        d dVarL = e.l();
        if (jSONArray != null) {
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                dVarL.d(decodeValue(jSONArray.getJSONObject(i10)));
            }
        }
        g2Var.d(dVarL);
    }

    private BundledQuery decodeBundledQuery(JSONObject jSONObject) throws JSONException {
        String string;
        JSONObject jSONObject2 = jSONObject.getJSONObject("structuredQuery");
        verifyNoSelect(jSONObject2);
        ResourcePath resourcePathDecodeName = decodeName(jSONObject.getString("parent"));
        JSONArray jSONArray = jSONObject2.getJSONArray(Constants.MessagePayloadKeys.FROM);
        verifyCollectionSelector(jSONArray);
        JSONObject jSONObject3 = jSONArray.getJSONObject(0);
        if (jSONObject3.optBoolean("allDescendants", false)) {
            string = jSONObject3.getString("collectionId");
        } else {
            resourcePathDecodeName = resourcePathDecodeName.append(jSONObject3.getString("collectionId"));
            string = null;
        }
        ResourcePath resourcePath = resourcePathDecodeName;
        String str = string;
        List<Filter> listDecodeWhere = decodeWhere(jSONObject2.optJSONObject("where"));
        List<OrderBy> listDecodeOrderBy = decodeOrderBy(jSONObject2.optJSONArray("orderBy"));
        Bound boundDecodeStartAtBound = decodeStartAtBound(jSONObject2.optJSONObject("startAt"));
        Bound boundDecodeEndAtBound = decodeEndAtBound(jSONObject2.optJSONObject("endAt"));
        verifyNoOffset(jSONObject2);
        return new BundledQuery(new Query(resourcePath, str, listDecodeWhere, listDecodeOrderBy, decodeLimit(jSONObject2), Query.LimitType.LIMIT_TO_FIRST, boundDecodeStartAtBound, boundDecodeEndAtBound).toTarget(), decodeLimitType(jSONObject));
    }

    private void decodeCompositeFilter(List<Filter> list, JSONObject jSONObject) {
        if (!jSONObject.getString("op").equals("AND")) {
            throw new IllegalArgumentException("The Android SDK only supports composite filters of type 'AND'");
        }
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("filters");
        if (jSONArrayOptJSONArray != null) {
            for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                decodeFilter(list, jSONArrayOptJSONArray.getJSONObject(i10));
            }
        }
    }

    private Bound decodeEndAtBound(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        return new Bound(decodePosition(jSONObject), !jSONObject.optBoolean("before", false));
    }

    private void decodeFieldFilter(List<Filter> list, JSONObject jSONObject) {
        list.add(FieldFilter.create(decodeFieldReference(jSONObject.getJSONObject("field")), decodeFieldFilterOperator(jSONObject.getString("op")), decodeValue(jSONObject.getJSONObject(FirebaseAnalytics.Param.VALUE))));
    }

    private FieldFilter.Operator decodeFieldFilterOperator(String str) {
        return FieldFilter.Operator.valueOf(str);
    }

    private FieldPath decodeFieldReference(JSONObject jSONObject) {
        return FieldPath.fromServerFormat(jSONObject.getString("fieldPath"));
    }

    private void decodeFilter(List<Filter> list, JSONObject jSONObject) throws JSONException {
        if (jSONObject.has("compositeFilter")) {
            decodeCompositeFilter(list, jSONObject.getJSONObject("compositeFilter"));
        } else if (jSONObject.has("fieldFilter")) {
            decodeFieldFilter(list, jSONObject.getJSONObject("fieldFilter"));
        } else if (jSONObject.has("unaryFilter")) {
            decodeUnaryFilter(list, jSONObject.getJSONObject("unaryFilter"));
        }
    }

    private void decodeGeoPoint(g2 g2Var, JSONObject jSONObject) {
        a aVarK = b.k();
        aVarK.c(jSONObject.optDouble("latitude"));
        aVarK.d(jSONObject.optDouble("longitude"));
        g2Var.i(aVarK);
    }

    private int decodeLimit(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("limit");
        return jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optInt(FirebaseAnalytics.Param.VALUE, -1) : jSONObject.optInt("limit", -1);
    }

    private Query.LimitType decodeLimitType(JSONObject jSONObject) {
        String strOptString = jSONObject.optString("limitType", "FIRST");
        if (strOptString.equals("FIRST")) {
            return Query.LimitType.LIMIT_TO_FIRST;
        }
        if (strOptString.equals("LAST")) {
            return Query.LimitType.LIMIT_TO_LAST;
        }
        throw new IllegalArgumentException("Invalid limit type for bundle query: ".concat(strOptString));
    }

    private void decodeMapValue(g2 g2Var, JSONObject jSONObject) {
        i0 i0VarL = k0.l();
        if (jSONObject != null) {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                i0VarL.e(decodeValue(jSONObject.getJSONObject(next)), next);
            }
        }
        g2Var.k(i0VarL);
    }

    private ResourcePath decodeName(String str) {
        ResourcePath resourcePathFromString = ResourcePath.fromString(str);
        if (this.remoteSerializer.isLocalResourceName(resourcePathFromString)) {
            return resourcePathFromString.popFirst(5);
        }
        throw new IllegalArgumentException(q.x("Resource name is not valid for current instance: ", str));
    }

    private List<OrderBy> decodeOrderBy(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i10);
                arrayList.add(OrderBy.getInstance(jSONObject.optString("direction", "ASCENDING").equals("ASCENDING") ? OrderBy.Direction.ASCENDING : OrderBy.Direction.DESCENDING, decodeFieldReference(jSONObject.getJSONObject("field"))));
            }
        }
        return arrayList;
    }

    private List<i2> decodePosition(JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("values");
        if (jSONArrayOptJSONArray != null) {
            for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                arrayList.add(decodeValue(jSONArrayOptJSONArray.getJSONObject(i10)));
            }
        }
        return arrayList;
    }

    private SnapshotVersion decodeSnapshotVersion(Object obj) {
        return new SnapshotVersion(decodeTimestamp(obj));
    }

    private Bound decodeStartAtBound(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        return new Bound(decodePosition(jSONObject), jSONObject.optBoolean("before", false));
    }

    private Timestamp decodeTimestamp(JSONObject jSONObject) {
        return new Timestamp(jSONObject.optLong("seconds"), jSONObject.optInt("nanos"));
    }

    private static long decodeTimezoneOffset(String str) {
        int iIndexOf = str.indexOf(58);
        if (iIndexOf == -1) {
            throw new IllegalArgumentException("Invalid offset value: ".concat(str));
        }
        String strSubstring = str.substring(0, iIndexOf);
        String strSubstring2 = str.substring(iIndexOf + 1);
        return (Long.parseLong(strSubstring2) + (Long.parseLong(strSubstring) * 60)) * 60;
    }

    private void decodeUnaryFilter(List<Filter> list, JSONObject jSONObject) throws JSONException {
        FieldPath fieldPathDecodeFieldReference = decodeFieldReference(jSONObject.getJSONObject("field"));
        String string = jSONObject.getString("op");
        string.getClass();
        switch (string) {
            case "IS_NAN":
                list.add(FieldFilter.create(fieldPathDecodeFieldReference, FieldFilter.Operator.EQUAL, Values.NAN_VALUE));
                return;
            case "IS_NULL":
                list.add(FieldFilter.create(fieldPathDecodeFieldReference, FieldFilter.Operator.EQUAL, Values.NULL_VALUE));
                return;
            case "IS_NOT_NAN":
                list.add(FieldFilter.create(fieldPathDecodeFieldReference, FieldFilter.Operator.NOT_EQUAL, Values.NAN_VALUE));
                return;
            case "IS_NOT_NULL":
                list.add(FieldFilter.create(fieldPathDecodeFieldReference, FieldFilter.Operator.NOT_EQUAL, Values.NULL_VALUE));
                return;
            default:
                throw new IllegalArgumentException("Unexpected unary filter: ".concat(string));
        }
    }

    private i2 decodeValue(JSONObject jSONObject) {
        g2 g2VarC = i2.C();
        if (jSONObject.has("nullValue")) {
            g2VarC.m();
        } else if (jSONObject.has("booleanValue")) {
            g2VarC.f(jSONObject.optBoolean("booleanValue", false));
        } else if (jSONObject.has("integerValue")) {
            g2VarC.j(jSONObject.optLong("integerValue"));
        } else if (jSONObject.has("doubleValue")) {
            g2VarC.h(jSONObject.optDouble("doubleValue"));
        } else if (jSONObject.has("timestampValue")) {
            decodeTimestamp(g2VarC, jSONObject.get("timestampValue"));
        } else if (jSONObject.has("stringValue")) {
            g2VarC.o(jSONObject.optString("stringValue", ""));
        } else if (jSONObject.has("bytesValue")) {
            byte[] bArrDecode = Base64.decode(jSONObject.getString("bytesValue"), 0);
            m mVar = n.f4181b;
            g2VarC.g(n.o(bArrDecode, 0, bArrDecode.length));
        } else if (jSONObject.has("referenceValue")) {
            g2VarC.n(jSONObject.getString("referenceValue"));
        } else if (jSONObject.has("geoPointValue")) {
            decodeGeoPoint(g2VarC, jSONObject.getJSONObject("geoPointValue"));
        } else if (jSONObject.has("arrayValue")) {
            decodeArrayValue(g2VarC, jSONObject.getJSONObject("arrayValue").optJSONArray("values"));
        } else {
            if (!jSONObject.has("mapValue")) {
                throw new IllegalArgumentException("Unexpected value type: " + jSONObject);
            }
            decodeMapValue(g2VarC, jSONObject.getJSONObject("mapValue").optJSONObject("fields"));
        }
        return (i2) g2VarC.m3997build();
    }

    private List<Filter> decodeWhere(JSONObject jSONObject) throws JSONException {
        ArrayList arrayList = new ArrayList();
        if (jSONObject != null) {
            decodeFilter(arrayList, jSONObject);
        }
        return arrayList;
    }

    private static int parseNanos(String str) {
        int iCharAt = 0;
        for (int i10 = 0; i10 < 9; i10++) {
            iCharAt *= 10;
            if (i10 < str.length()) {
                if (str.charAt(i10) < '0' || str.charAt(i10) > '9') {
                    throw new IllegalArgumentException("Invalid nanoseconds: ".concat(str));
                }
                iCharAt = (str.charAt(i10) - '0') + iCharAt;
            }
        }
        return iCharAt;
    }

    private void verifyCollectionSelector(JSONArray jSONArray) {
        if (jSONArray.length() != 1) {
            throw new IllegalArgumentException("Only queries with a single 'from' clause are supported by the Android SDK");
        }
    }

    private void verifyNoOffset(JSONObject jSONObject) {
        if (jSONObject.has("offset")) {
            throw new IllegalArgumentException("Queries with offsets are not supported by the Android SDK");
        }
    }

    private void verifyNoSelect(JSONObject jSONObject) {
        if (jSONObject.has("select")) {
            throw new IllegalArgumentException("Queries with 'select' statements are not supported by the Android SDK");
        }
    }

    public BundleMetadata decodeBundleMetadata(JSONObject jSONObject) {
        return new BundleMetadata(jSONObject.getString("id"), jSONObject.getInt("version"), decodeSnapshotVersion(jSONObject.get("createTime")), jSONObject.getInt("totalDocuments"), jSONObject.getLong("totalBytes"));
    }

    public BundledDocumentMetadata decodeBundledDocumentMetadata(JSONObject jSONObject) {
        DocumentKey documentKeyFromPath = DocumentKey.fromPath(decodeName(jSONObject.getString("name")));
        SnapshotVersion snapshotVersionDecodeSnapshotVersion = decodeSnapshotVersion(jSONObject.get("readTime"));
        boolean zOptBoolean = jSONObject.optBoolean("exists", false);
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("queries");
        ArrayList arrayList = new ArrayList();
        if (jSONArrayOptJSONArray != null) {
            for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                arrayList.add(jSONArrayOptJSONArray.getString(i10));
            }
        }
        return new BundledDocumentMetadata(documentKeyFromPath, snapshotVersionDecodeSnapshotVersion, zOptBoolean, arrayList);
    }

    public BundleDocument decodeDocument(JSONObject jSONObject) {
        DocumentKey documentKeyFromPath = DocumentKey.fromPath(decodeName(jSONObject.getString("name")));
        SnapshotVersion snapshotVersionDecodeSnapshotVersion = decodeSnapshotVersion(jSONObject.get("updateTime"));
        g2 g2VarC = i2.C();
        decodeMapValue(g2VarC, jSONObject.getJSONObject("fields"));
        return new BundleDocument(MutableDocument.newFoundDocument(documentKeyFromPath, snapshotVersionDecodeSnapshotVersion, ObjectValue.fromMap(g2VarC.c().i())));
    }

    public NamedQuery decodeNamedQuery(JSONObject jSONObject) {
        return new NamedQuery(jSONObject.getString("name"), decodeBundledQuery(jSONObject.getJSONObject("bundledQuery")), decodeSnapshotVersion(jSONObject.get("readTime")));
    }

    private Timestamp decodeTimestamp(String str) {
        try {
            int iIndexOf = str.indexOf(84);
            if (iIndexOf == -1) {
                throw new IllegalArgumentException("Invalid timestamp: ".concat(str));
            }
            int iIndexOf2 = str.indexOf(90, iIndexOf);
            if (iIndexOf2 == -1) {
                iIndexOf2 = str.indexOf(43, iIndexOf);
            }
            if (iIndexOf2 == -1) {
                iIndexOf2 = str.indexOf(45, iIndexOf);
            }
            if (iIndexOf2 == -1) {
                throw new IllegalArgumentException("Invalid timestamp: Missing valid timezone offset: ".concat(str));
            }
            int nanos = 0;
            String strSubstring = str.substring(0, iIndexOf2);
            String strSubstring2 = "";
            int iIndexOf3 = strSubstring.indexOf(46);
            if (iIndexOf3 != -1) {
                String strSubstring3 = strSubstring.substring(0, iIndexOf3);
                strSubstring2 = strSubstring.substring(iIndexOf3 + 1);
                strSubstring = strSubstring3;
            }
            long time = this.timestampFormat.parse(strSubstring).getTime() / 1000;
            if (!strSubstring2.isEmpty()) {
                nanos = parseNanos(strSubstring2);
            }
            if (str.charAt(iIndexOf2) != 'Z') {
                long jDecodeTimezoneOffset = decodeTimezoneOffset(str.substring(iIndexOf2 + 1));
                time = str.charAt(iIndexOf2) == '+' ? time - jDecodeTimezoneOffset : time + jDecodeTimezoneOffset;
            } else if (str.length() != iIndexOf2 + 1) {
                throw new IllegalArgumentException("Invalid timestamp: Invalid trailing data \"" + str.substring(iIndexOf2) + "\"");
            }
            return new Timestamp(time, nanos);
        } catch (ParseException e4) {
            throw new IllegalArgumentException("Failed to parse timestamp", e4);
        }
    }

    private Timestamp decodeTimestamp(Object obj) {
        if (obj instanceof String) {
            return decodeTimestamp((String) obj);
        }
        if (obj instanceof JSONObject) {
            return decodeTimestamp((JSONObject) obj);
        }
        throw new IllegalArgumentException("Timestamps must be either ISO 8601-formatted strings or JSON objects");
    }

    private void decodeTimestamp(g2 g2Var, Object obj) {
        Timestamp timestampDecodeTimestamp = decodeTimestamp(obj);
        p2 p2VarK = q2.k();
        p2VarK.d(timestampDecodeTimestamp.getSeconds());
        p2VarK.c(timestampDecodeTimestamp.getNanoseconds());
        g2Var.p(p2VarK);
    }
}
