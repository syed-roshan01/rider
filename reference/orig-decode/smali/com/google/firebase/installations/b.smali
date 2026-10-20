.class public final synthetic Lcom/google/firebase/installations/b;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Lcom/google/firebase/installations/b;->a:I

    iput-object p1, p0, Lcom/google/firebase/installations/b;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lcom/google/firebase/installations/b;->a:I

    iget-object v1, p0, Lcom/google/firebase/installations/b;->b:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    check-cast v1, Lcom/google/firebase/remoteconfig/internal/ConfigStorageClient;

    invoke-virtual {v1}, Lcom/google/firebase/remoteconfig/internal/ConfigStorageClient;->read()Lcom/google/firebase/remoteconfig/internal/ConfigContainer;

    move-result-object v0

    return-object v0

    :pswitch_0
    check-cast v1, Lcom/google/firebase/remoteconfig/RemoteConfigComponent;

    invoke-virtual {v1}, Lcom/google/firebase/remoteconfig/RemoteConfigComponent;->getDefault()Lcom/google/firebase/remoteconfig/FirebaseRemoteConfig;

    move-result-object v0

    return-object v0

    :pswitch_1
    check-cast v1, Lcom/google/firebase/installations/FirebaseInstallations;

    invoke-static {v1}, Lcom/google/firebase/installations/FirebaseInstallations;->e(Lcom/google/firebase/installations/FirebaseInstallations;)Ljava/lang/Void;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
