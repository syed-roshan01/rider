package com.google.firebase.firestore.ktx;

import c9.c;
import com.google.firebase.FirebaseApp;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FieldPath;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreException;
import com.google.firebase.firestore.FirebaseFirestoreSettings;
import com.google.firebase.firestore.ListenerRegistration;
import com.google.firebase.firestore.MemoryCacheSettings;
import com.google.firebase.firestore.MemoryEagerGcSettings;
import com.google.firebase.firestore.MemoryLruGcSettings;
import com.google.firebase.firestore.MetadataChanges;
import com.google.firebase.firestore.PersistentCacheSettings;
import com.google.firebase.firestore.Query;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;
import com.google.firebase.firestore.util.Executors;
import com.google.firebase.ktx.Firebase;
import d7.t;
import d9.j;
import h6.g;
import java.util.List;
import o9.r;
import p9.f;
import q8.l;
import w8.e;
import w8.i;

/* JADX INFO: loaded from: classes.dex */
public final class FirestoreKt {

    /* JADX INFO: renamed from: com.google.firebase.firestore.ktx.FirestoreKt$snapshots$1, reason: invalid class name */
    @e(c = "com.google.firebase.firestore.ktx.FirestoreKt$snapshots$1", f = "Firestore.kt", l = {412}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends i implements c9.e {
        final /* synthetic */ MetadataChanges $metadataChanges;
        final /* synthetic */ DocumentReference $this_snapshots;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: com.google.firebase.firestore.ktx.FirestoreKt$snapshots$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C01551 extends j implements c9.a {
            final /* synthetic */ ListenerRegistration $registration;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C01551(ListenerRegistration listenerRegistration) {
                super(0);
                this.$registration = listenerRegistration;
            }

            @Override // c9.a
            public /* bridge */ /* synthetic */ Object invoke() {
                m2971invoke();
                return l.f13235a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m2971invoke() {
                this.$registration.remove();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(DocumentReference documentReference, MetadataChanges metadataChanges, u8.e eVar) {
            super(2, eVar);
            this.$this_snapshots = documentReference;
            this.$metadataChanges = metadataChanges;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: invokeSuspend$lambda-0, reason: not valid java name */
        public static final void m2970invokeSuspend$lambda0(r rVar, DocumentSnapshot documentSnapshot, FirebaseFirestoreException firebaseFirestoreException) {
            if (firebaseFirestoreException != null) {
                d7.a.h(rVar, "Error getting DocumentReference snapshot", firebaseFirestoreException);
            } else if (documentSnapshot != null) {
                g.z0(rVar, documentSnapshot);
            }
        }

        @Override // w8.a
        public final u8.e create(Object obj, u8.e eVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$this_snapshots, this.$metadataChanges, eVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // w8.a
        public final Object invokeSuspend(Object obj) {
            v8.a aVar = v8.a.f15963a;
            int i10 = this.label;
            if (i10 == 0) {
                t.v0(obj);
                r rVar = (r) this.L$0;
                ListenerRegistration listenerRegistrationAddSnapshotListener = this.$this_snapshots.addSnapshotListener(Executors.BACKGROUND_EXECUTOR, this.$metadataChanges, new a(rVar, 0));
                d7.a.l(listenerRegistrationAddSnapshotListener, "addSnapshotListener(BACK…apshot)\n        }\n      }");
                C01551 c01551 = new C01551(listenerRegistrationAddSnapshotListener);
                this.label = 1;
                if (t.E(rVar, c01551, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.v0(obj);
            }
            return l.f13235a;
        }

        @Override // c9.e
        public final Object invoke(r rVar, u8.e eVar) {
            return ((AnonymousClass1) create(rVar, eVar)).invokeSuspend(l.f13235a);
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.firestore.ktx.FirestoreKt$snapshots$2, reason: invalid class name */
    @e(c = "com.google.firebase.firestore.ktx.FirestoreKt$snapshots$2", f = "Firestore.kt", l = {445}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends i implements c9.e {
        final /* synthetic */ MetadataChanges $metadataChanges;
        final /* synthetic */ Query $this_snapshots;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: com.google.firebase.firestore.ktx.FirestoreKt$snapshots$2$1, reason: invalid class name */
        public static final class AnonymousClass1 extends j implements c9.a {
            final /* synthetic */ ListenerRegistration $registration;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(ListenerRegistration listenerRegistration) {
                super(0);
                this.$registration = listenerRegistration;
            }

            @Override // c9.a
            public /* bridge */ /* synthetic */ Object invoke() {
                m2973invoke();
                return l.f13235a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m2973invoke() {
                this.$registration.remove();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Query query, MetadataChanges metadataChanges, u8.e eVar) {
            super(2, eVar);
            this.$this_snapshots = query;
            this.$metadataChanges = metadataChanges;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: invokeSuspend$lambda-0, reason: not valid java name */
        public static final void m2972invokeSuspend$lambda0(r rVar, QuerySnapshot querySnapshot, FirebaseFirestoreException firebaseFirestoreException) {
            if (firebaseFirestoreException != null) {
                d7.a.h(rVar, "Error getting Query snapshot", firebaseFirestoreException);
            } else if (querySnapshot != null) {
                g.z0(rVar, querySnapshot);
            }
        }

        @Override // w8.a
        public final u8.e create(Object obj, u8.e eVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$this_snapshots, this.$metadataChanges, eVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // w8.a
        public final Object invokeSuspend(Object obj) {
            v8.a aVar = v8.a.f15963a;
            int i10 = this.label;
            int i11 = 1;
            if (i10 == 0) {
                t.v0(obj);
                r rVar = (r) this.L$0;
                ListenerRegistration listenerRegistrationAddSnapshotListener = this.$this_snapshots.addSnapshotListener(Executors.BACKGROUND_EXECUTOR, this.$metadataChanges, new a(rVar, i11));
                d7.a.l(listenerRegistrationAddSnapshotListener, "addSnapshotListener(BACK…apshot)\n        }\n      }");
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(listenerRegistrationAddSnapshotListener);
                this.label = 1;
                if (t.E(rVar, anonymousClass1, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.v0(obj);
            }
            return l.f13235a;
        }

        @Override // c9.e
        public final Object invoke(r rVar, u8.e eVar) {
            return ((AnonymousClass2) create(rVar, eVar)).invokeSuspend(l.f13235a);
        }
    }

    public static final <T> f dataObjects(Query query, MetadataChanges metadataChanges) {
        d7.a.m(query, "<this>");
        d7.a.m(metadataChanges, "metadataChanges");
        snapshots(query, metadataChanges);
        d7.a.C();
        throw null;
    }

    public static f dataObjects$default(Query query, MetadataChanges metadataChanges, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            metadataChanges = MetadataChanges.EXCLUDE;
        }
        d7.a.m(query, "<this>");
        d7.a.m(metadataChanges, "metadataChanges");
        snapshots(query, metadataChanges);
        d7.a.C();
        throw null;
    }

    public static final FirebaseFirestore firestore(Firebase firebase, FirebaseApp firebaseApp) {
        d7.a.m(firebase, "<this>");
        d7.a.m(firebaseApp, "app");
        FirebaseFirestore firebaseFirestore = FirebaseFirestore.getInstance(firebaseApp);
        d7.a.l(firebaseFirestore, "getInstance(app)");
        return firebaseFirestore;
    }

    public static final FirebaseFirestoreSettings firestoreSettings(c cVar) {
        d7.a.m(cVar, "init");
        FirebaseFirestoreSettings.Builder builder = new FirebaseFirestoreSettings.Builder();
        cVar.invoke(builder);
        FirebaseFirestoreSettings firebaseFirestoreSettingsBuild = builder.build();
        d7.a.l(firebaseFirestoreSettingsBuild, "builder.build()");
        return firebaseFirestoreSettingsBuild;
    }

    public static final <T> T getField(DocumentSnapshot documentSnapshot, FieldPath fieldPath) {
        d7.a.m(documentSnapshot, "<this>");
        d7.a.m(fieldPath, "fieldPath");
        d7.a.C();
        throw null;
    }

    public static final FirebaseFirestore getFirestore(Firebase firebase) {
        d7.a.m(firebase, "<this>");
        FirebaseFirestore firebaseFirestore = FirebaseFirestore.getInstance();
        d7.a.l(firebaseFirestore, "getInstance()");
        return firebaseFirestore;
    }

    public static final MemoryCacheSettings memoryCacheSettings(c cVar) {
        d7.a.m(cVar, "init");
        MemoryCacheSettings.Builder builderNewBuilder = MemoryCacheSettings.newBuilder();
        d7.a.l(builderNewBuilder, "newBuilder()");
        cVar.invoke(builderNewBuilder);
        MemoryCacheSettings memoryCacheSettingsBuild = builderNewBuilder.build();
        d7.a.l(memoryCacheSettingsBuild, "builder.build()");
        return memoryCacheSettingsBuild;
    }

    public static final MemoryEagerGcSettings memoryEagerGcSettings(c cVar) {
        d7.a.m(cVar, "init");
        MemoryEagerGcSettings.Builder builderNewBuilder = MemoryEagerGcSettings.newBuilder();
        d7.a.l(builderNewBuilder, "newBuilder()");
        cVar.invoke(builderNewBuilder);
        MemoryEagerGcSettings memoryEagerGcSettingsBuild = builderNewBuilder.build();
        d7.a.l(memoryEagerGcSettingsBuild, "builder.build()");
        return memoryEagerGcSettingsBuild;
    }

    public static final MemoryLruGcSettings memoryLruGcSettings(c cVar) {
        d7.a.m(cVar, "init");
        MemoryLruGcSettings.Builder builderNewBuilder = MemoryLruGcSettings.newBuilder();
        d7.a.l(builderNewBuilder, "newBuilder()");
        cVar.invoke(builderNewBuilder);
        MemoryLruGcSettings memoryLruGcSettingsBuild = builderNewBuilder.build();
        d7.a.l(memoryLruGcSettingsBuild, "builder.build()");
        return memoryLruGcSettingsBuild;
    }

    public static final PersistentCacheSettings persistentCacheSettings(c cVar) {
        d7.a.m(cVar, "init");
        PersistentCacheSettings.Builder builderNewBuilder = PersistentCacheSettings.newBuilder();
        d7.a.l(builderNewBuilder, "newBuilder()");
        cVar.invoke(builderNewBuilder);
        PersistentCacheSettings persistentCacheSettingsBuild = builderNewBuilder.build();
        d7.a.l(persistentCacheSettingsBuild, "builder.build()");
        return persistentCacheSettingsBuild;
    }

    public static final f snapshots(DocumentReference documentReference, MetadataChanges metadataChanges) {
        d7.a.m(documentReference, "<this>");
        d7.a.m(metadataChanges, "metadataChanges");
        return g.b(new AnonymousClass1(documentReference, metadataChanges, null));
    }

    public static /* synthetic */ f snapshots$default(DocumentReference documentReference, MetadataChanges metadataChanges, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            metadataChanges = MetadataChanges.EXCLUDE;
        }
        return snapshots(documentReference, metadataChanges);
    }

    public static final <T> T toObject(DocumentSnapshot documentSnapshot) {
        d7.a.m(documentSnapshot, "<this>");
        d7.a.C();
        throw null;
    }

    public static final <T> List<T> toObjects(QuerySnapshot querySnapshot) {
        d7.a.m(querySnapshot, "<this>");
        d7.a.C();
        throw null;
    }

    public static final FirebaseFirestore firestore(Firebase firebase, FirebaseApp firebaseApp, String str) {
        d7.a.m(firebase, "<this>");
        d7.a.m(firebaseApp, "app");
        d7.a.m(str, "database");
        FirebaseFirestore firebaseFirestore = FirebaseFirestore.getInstance(firebaseApp, str);
        d7.a.l(firebaseFirestore, "getInstance(app, database)");
        return firebaseFirestore;
    }

    public static final <T> T getField(DocumentSnapshot documentSnapshot, FieldPath fieldPath, DocumentSnapshot.ServerTimestampBehavior serverTimestampBehavior) {
        d7.a.m(documentSnapshot, "<this>");
        d7.a.m(fieldPath, "fieldPath");
        d7.a.m(serverTimestampBehavior, "serverTimestampBehavior");
        d7.a.C();
        throw null;
    }

    public static final f snapshots(Query query, MetadataChanges metadataChanges) {
        d7.a.m(query, "<this>");
        d7.a.m(metadataChanges, "metadataChanges");
        return g.b(new AnonymousClass2(query, metadataChanges, null));
    }

    public static final <T> T toObject(DocumentSnapshot documentSnapshot, DocumentSnapshot.ServerTimestampBehavior serverTimestampBehavior) {
        d7.a.m(documentSnapshot, "<this>");
        d7.a.m(serverTimestampBehavior, "serverTimestampBehavior");
        d7.a.C();
        throw null;
    }

    public static final <T> List<T> toObjects(QuerySnapshot querySnapshot, DocumentSnapshot.ServerTimestampBehavior serverTimestampBehavior) {
        d7.a.m(querySnapshot, "<this>");
        d7.a.m(serverTimestampBehavior, "serverTimestampBehavior");
        d7.a.C();
        throw null;
    }

    public static final <T> f dataObjects(DocumentReference documentReference, MetadataChanges metadataChanges) {
        d7.a.m(documentReference, "<this>");
        d7.a.m(metadataChanges, "metadataChanges");
        snapshots(documentReference, metadataChanges);
        d7.a.C();
        throw null;
    }

    public static final FirebaseFirestore firestore(Firebase firebase, String str) {
        d7.a.m(firebase, "<this>");
        d7.a.m(str, "database");
        FirebaseFirestore firebaseFirestore = FirebaseFirestore.getInstance(str);
        d7.a.l(firebaseFirestore, "getInstance(database)");
        return firebaseFirestore;
    }

    public static final <T> T getField(DocumentSnapshot documentSnapshot, String str) {
        d7.a.m(documentSnapshot, "<this>");
        d7.a.m(str, "field");
        d7.a.C();
        throw null;
    }

    public static /* synthetic */ f snapshots$default(Query query, MetadataChanges metadataChanges, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            metadataChanges = MetadataChanges.EXCLUDE;
        }
        return snapshots(query, metadataChanges);
    }

    public static final <T> T toObject(QueryDocumentSnapshot queryDocumentSnapshot) {
        d7.a.m(queryDocumentSnapshot, "<this>");
        d7.a.C();
        throw null;
    }

    public static final <T> T getField(DocumentSnapshot documentSnapshot, String str, DocumentSnapshot.ServerTimestampBehavior serverTimestampBehavior) {
        d7.a.m(documentSnapshot, "<this>");
        d7.a.m(str, "field");
        d7.a.m(serverTimestampBehavior, "serverTimestampBehavior");
        d7.a.C();
        throw null;
    }

    public static final <T> T toObject(QueryDocumentSnapshot queryDocumentSnapshot, DocumentSnapshot.ServerTimestampBehavior serverTimestampBehavior) {
        d7.a.m(queryDocumentSnapshot, "<this>");
        d7.a.m(serverTimestampBehavior, "serverTimestampBehavior");
        d7.a.C();
        throw null;
    }

    public static f dataObjects$default(DocumentReference documentReference, MetadataChanges metadataChanges, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            metadataChanges = MetadataChanges.EXCLUDE;
        }
        d7.a.m(documentReference, "<this>");
        d7.a.m(metadataChanges, "metadataChanges");
        snapshots(documentReference, metadataChanges);
        d7.a.C();
        throw null;
    }
}
