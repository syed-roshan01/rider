package i5;

import com.google.firebase.messaging.reporting.MessagingClientEventExtension;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f8062a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f8063b;

    public a(MessagingClientEventExtension messagingClientEventExtension, b bVar) {
        if (messagingClientEventExtension == null) {
            throw new NullPointerException("Null payload");
        }
        this.f8062a = messagingClientEventExtension;
        this.f8063b = bVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        aVar.getClass();
        if (this.f8062a.equals(aVar.f8062a)) {
            Object obj2 = d.f8066a;
            if (obj2.equals(obj2)) {
                b bVar = aVar.f8063b;
                b bVar2 = this.f8063b;
                if (bVar2 == null) {
                    if (bVar == null) {
                        return true;
                    }
                } else if (bVar2.equals(bVar)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((this.f8062a.hashCode() ^ (-721379959)) * 1000003) ^ d.f8066a.hashCode()) * 1000003;
        b bVar = this.f8063b;
        return iHashCode ^ (bVar == null ? 0 : bVar.hashCode());
    }

    public final String toString() {
        return "Event{code=null, payload=" + this.f8062a + ", priority=" + d.f8066a + ", productData=" + this.f8063b + "}";
    }
}
