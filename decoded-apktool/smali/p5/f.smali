.class public final Lp5/f;
.super Ljava/lang/Object;

# interfaces
.implements Ln5/b;


# instance fields
.field public final synthetic a:I

.field public final b:Lp8/a;

.field public final c:Lp8/a;

.field public final d:Lp8/a;

.field public final e:Lp8/a;


# direct methods
.method public synthetic constructor <init>(Lp8/a;Lp8/a;Ln5/b;Lp8/a;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p5, p0, Lp5/f;->a:I

    iput-object p1, p0, Lp5/f;->b:Lp8/a;

    iput-object p2, p0, Lp5/f;->c:Lp8/a;

    iput-object p3, p0, Lp5/f;->d:Lp8/a;

    iput-object p4, p0, Lp5/f;->e:Lp8/a;

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 5

    iget v0, p0, Lp5/f;->a:I

    iget-object v1, p0, Lp5/f;->e:Lp8/a;

    iget-object v2, p0, Lp5/f;->d:Lp8/a;

    iget-object v3, p0, Lp5/f;->c:Lp8/a;

    iget-object v4, p0, Lp5/f;->b:Lp8/a;

    packed-switch v0, :pswitch_data_0

    invoke-interface {v4}, Lp8/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/concurrent/Executor;

    invoke-interface {v3}, Lp8/a;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lr5/d;

    invoke-interface {v2}, Lp8/a;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lq5/l;

    invoke-interface {v1}, Lp8/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ls5/c;

    new-instance v4, Lq5/k;

    invoke-direct {v4, v0, v3, v2, v1}, Lq5/k;-><init>(Ljava/util/concurrent/Executor;Lr5/d;Lq5/l;Ls5/c;)V

    return-object v4

    :pswitch_0
    invoke-interface {v4}, Lp8/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    invoke-interface {v3}, Lp8/a;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lr5/d;

    invoke-interface {v2}, Lp8/a;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lq5/a;

    invoke-interface {v1}, Lp8/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lt5/a;

    new-instance v1, Lq5/c;

    invoke-direct {v1, v0, v3, v2}, Lq5/c;-><init>(Landroid/content/Context;Lr5/d;Lq5/a;)V

    return-object v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
