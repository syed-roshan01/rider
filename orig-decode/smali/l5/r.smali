.class public final Ll5/r;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/util/concurrent/Executor;


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Ll5/r;->a:I

    iput-object p1, p0, Ll5/r;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final execute(Ljava/lang/Runnable;)V
    .locals 2

    iget v0, p0, Ll5/r;->a:I

    iget-object v1, p0, Ll5/r;->b:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    check-cast v1, Lk6/y5;

    invoke-virtual {v1}, Lf4/y;->zzl()Lk6/z4;

    move-result-object v0

    invoke-virtual {v0, p1}, Lk6/z4;->u(Ljava/lang/Runnable;)V

    return-void

    :pswitch_0
    check-cast v1, Ljava/util/concurrent/Executor;

    new-instance v0, Ll5/q;

    invoke-direct {v0, p1}, Ll5/q;-><init>(Ljava/lang/Runnable;)V

    invoke-interface {v1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
