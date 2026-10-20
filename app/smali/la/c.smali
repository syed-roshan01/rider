.class public final synthetic Lla/c;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ly4/a;


# direct methods
.method public synthetic constructor <init>(Ly4/a;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Lla/c;->a:I

    iput-object p1, p0, Lla/c;->b:Ly4/a;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    const-string v0, "Shizuku Binder Dead!"

    const-string v1, "AutoAcceptApp"

    iget v2, p0, Lla/c;->a:I

    iget-object v3, p0, Lla/c;->b:Ly4/a;

    packed-switch v2, :pswitch_data_0

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget v2, Lcom/auto/accept/app/AutoAcceptApp;->c:I

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :pswitch_0
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget v2, Lcom/auto/accept/app/AutoAcceptApp;->c:I

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
