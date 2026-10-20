package com.google.firebase.firestore;

import d7.t;
import q8.l;

/* JADX INFO: loaded from: classes.dex */
public final class FirestoreKt$dataObjects$$inlined$map$1 implements p9.f {
    final /* synthetic */ p9.f $this_unsafeTransform$inlined;

    /* JADX INFO: renamed from: com.google.firebase.firestore.FirestoreKt$dataObjects$$inlined$map$1$2, reason: invalid class name */
    public static final class AnonymousClass2<T> implements p9.g {
        final /* synthetic */ p9.g $this_unsafeFlow;

        /* JADX INFO: renamed from: com.google.firebase.firestore.FirestoreKt$dataObjects$$inlined$map$1$2$1, reason: invalid class name */
        @w8.e(c = "com.google.firebase.firestore.FirestoreKt$dataObjects$$inlined$map$1$2", f = "Firestore.kt", l = {224}, m = "emit")
        public static final class AnonymousClass1 extends w8.c {
            Object L$0;
            int label;
            /* synthetic */ Object result;

            public AnonymousClass1(u8.e eVar) {
                super(eVar);
            }

            @Override // w8.a
            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return AnonymousClass2.this.emit(null, this);
            }
        }

        public AnonymousClass2(p9.g gVar) {
            this.$this_unsafeFlow = gVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // p9.g
        public final Object emit(Object obj, u8.e eVar) {
            AnonymousClass1 anonymousClass1;
            if (eVar instanceof AnonymousClass1) {
                anonymousClass1 = (AnonymousClass1) eVar;
                int i10 = anonymousClass1.label;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    anonymousClass1.label = i10 - Integer.MIN_VALUE;
                } else {
                    anonymousClass1 = new AnonymousClass1(eVar);
                }
            } else {
                anonymousClass1 = new AnonymousClass1(eVar);
            }
            Object obj2 = anonymousClass1.result;
            v8.a aVar = v8.a.f15963a;
            int i11 = anonymousClass1.label;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.v0(obj2);
                return l.f13235a;
            }
            t.v0(obj2);
            d7.a.C();
            throw null;
        }

        public final Object emit$$forInline(Object obj, u8.e eVar) {
            new AnonymousClass1(eVar);
            d7.a.C();
            throw null;
        }
    }

    public FirestoreKt$dataObjects$$inlined$map$1(p9.f fVar) {
        this.$this_unsafeTransform$inlined = fVar;
    }

    @Override // p9.f
    public Object collect(p9.g gVar, u8.e eVar) {
        d7.a.C();
        throw null;
    }

    public Object collect$$forInline(p9.g gVar, u8.e eVar) {
        new w8.c(eVar) { // from class: com.google.firebase.firestore.FirestoreKt$dataObjects$$inlined$map$1.1
            int label;
            /* synthetic */ Object result;

            @Override // w8.a
            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return FirestoreKt$dataObjects$$inlined$map$1.this.collect(null, this);
            }
        };
        d7.a.C();
        throw null;
    }
}
