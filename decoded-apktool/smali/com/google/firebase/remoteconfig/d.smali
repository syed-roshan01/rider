.class public final synthetic Lcom/google/firebase/remoteconfig/d;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lo9/r;

.field public final synthetic c:Lcom/google/firebase/remoteconfig/ConfigUpdate;


# direct methods
.method public synthetic constructor <init>(Lo9/r;Lcom/google/firebase/remoteconfig/ConfigUpdate;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p3, p0, Lcom/google/firebase/remoteconfig/d;->a:I

    iput-object p1, p0, Lcom/google/firebase/remoteconfig/d;->b:Lo9/r;

    iput-object p2, p0, Lcom/google/firebase/remoteconfig/d;->c:Lcom/google/firebase/remoteconfig/ConfigUpdate;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget v0, p0, Lcom/google/firebase/remoteconfig/d;->a:I

    iget-object v1, p0, Lcom/google/firebase/remoteconfig/d;->c:Lcom/google/firebase/remoteconfig/ConfigUpdate;

    iget-object v2, p0, Lcom/google/firebase/remoteconfig/d;->b:Lo9/r;

    packed-switch v0, :pswitch_data_0

    invoke-static {v2, v1}, Lcom/google/firebase/remoteconfig/ktx/RemoteConfigKt$configUpdates$1$registration$1;->a(Lo9/r;Lcom/google/firebase/remoteconfig/ConfigUpdate;)V

    return-void

    :pswitch_0
    invoke-static {v2, v1}, Lcom/google/firebase/remoteconfig/RemoteConfigKt$configUpdates$1$registration$1;->a(Lo9/r;Lcom/google/firebase/remoteconfig/ConfigUpdate;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
