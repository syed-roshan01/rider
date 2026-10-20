.class public final Lg8/d5;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lg8/g5;

.field public final synthetic c:Lg8/f5;


# direct methods
.method public synthetic constructor <init>(Lg8/f5;Lg8/g5;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p3, p0, Lg8/d5;->a:I

    iput-object p1, p0, Lg8/d5;->c:Lg8/f5;

    iput-object p2, p0, Lg8/d5;->b:Lg8/g5;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget v0, p0, Lg8/d5;->a:I

    iget-object v1, p0, Lg8/d5;->c:Lg8/f5;

    packed-switch v0, :pswitch_data_0

    iget-object v0, v1, Lg8/f5;->b:Lg8/y2;

    sget-object v1, Lg8/y2;->E:Le8/g1;

    iget-object v1, p0, Lg8/d5;->b:Lg8/g5;

    invoke-virtual {v0, v1}, Lg8/y2;->v(Lg8/g5;)V

    return-void

    :pswitch_0
    iget-object v0, v1, Lg8/f5;->b:Lg8/y2;

    iget-object v0, v0, Lg8/y2;->b:Ljava/util/concurrent/Executor;

    new-instance v1, Lg8/t0;

    const/16 v2, 0xa

    invoke-direct {v1, p0, v2}, Lg8/t0;-><init>(Ljava/lang/Object;I)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
