.class public final synthetic Lcom/google/firebase/firestore/core/e;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/google/firebase/firestore/core/e;->a:I

    iput-object p2, p0, Lcom/google/firebase/firestore/core/e;->b:Ljava/lang/Object;

    iput-object p3, p0, Lcom/google/firebase/firestore/core/e;->c:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lcom/google/firebase/firestore/core/e;->a:I

    iget-object v1, p0, Lcom/google/firebase/firestore/core/e;->c:Ljava/lang/Object;

    iget-object v2, p0, Lcom/google/firebase/firestore/core/e;->b:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    check-cast v2, Lcom/google/firebase/remoteconfig/internal/ConfigCacheClient;

    check-cast v1, Lcom/google/firebase/remoteconfig/internal/ConfigContainer;

    invoke-static {v2, v1}, Lcom/google/firebase/remoteconfig/internal/ConfigCacheClient;->a(Lcom/google/firebase/remoteconfig/internal/ConfigCacheClient;Lcom/google/firebase/remoteconfig/internal/ConfigContainer;)Ljava/lang/Void;

    move-result-object v0

    return-object v0

    :pswitch_0
    check-cast v2, Lcom/google/firebase/remoteconfig/FirebaseRemoteConfig;

    check-cast v1, Lcom/google/firebase/remoteconfig/FirebaseRemoteConfigSettings;

    invoke-static {v2, v1}, Lcom/google/firebase/remoteconfig/FirebaseRemoteConfig;->b(Lcom/google/firebase/remoteconfig/FirebaseRemoteConfig;Lcom/google/firebase/remoteconfig/FirebaseRemoteConfigSettings;)Ljava/lang/Void;

    move-result-object v0

    return-object v0

    :pswitch_1
    check-cast v2, Lcom/google/firebase/firestore/core/FirestoreClient;

    check-cast v1, Lcom/google/firebase/firestore/core/Query;

    invoke-static {v2, v1}, Lcom/google/firebase/firestore/core/FirestoreClient;->q(Lcom/google/firebase/firestore/core/FirestoreClient;Lcom/google/firebase/firestore/core/Query;)Lcom/google/firebase/firestore/core/ViewSnapshot;

    move-result-object v0

    return-object v0

    :pswitch_2
    check-cast v2, Lcom/google/firebase/firestore/core/FirestoreClient;

    check-cast v1, Lcom/google/firebase/firestore/model/DocumentKey;

    invoke-static {v2, v1}, Lcom/google/firebase/firestore/core/FirestoreClient;->u(Lcom/google/firebase/firestore/core/FirestoreClient;Lcom/google/firebase/firestore/model/DocumentKey;)Lcom/google/firebase/firestore/model/Document;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
