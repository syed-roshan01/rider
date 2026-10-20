.class public final synthetic Lcom/google/firebase/remoteconfig/a;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/google/firebase/remoteconfig/FirebaseRemoteConfig;


# direct methods
.method public synthetic constructor <init>(Lcom/google/firebase/remoteconfig/FirebaseRemoteConfig;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Lcom/google/firebase/remoteconfig/a;->a:I

    iput-object p1, p0, Lcom/google/firebase/remoteconfig/a;->b:Lcom/google/firebase/remoteconfig/FirebaseRemoteConfig;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lcom/google/firebase/remoteconfig/a;->a:I

    iget-object v1, p0, Lcom/google/firebase/remoteconfig/a;->b:Lcom/google/firebase/remoteconfig/FirebaseRemoteConfig;

    packed-switch v0, :pswitch_data_0

    invoke-virtual {v1}, Lcom/google/firebase/remoteconfig/FirebaseRemoteConfig;->getInfo()Lcom/google/firebase/remoteconfig/FirebaseRemoteConfigInfo;

    move-result-object v0

    return-object v0

    :pswitch_0
    invoke-static {v1}, Lcom/google/firebase/remoteconfig/FirebaseRemoteConfig;->d(Lcom/google/firebase/remoteconfig/FirebaseRemoteConfig;)Ljava/lang/Void;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
