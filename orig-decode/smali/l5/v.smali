.class public final Ll5/v;
.super Ljava/lang/Object;

# interfaces
.implements Ln5/b;


# instance fields
.field public final synthetic a:I

.field public final b:Lp8/a;

.field public final c:Lp8/a;

.field public final d:Lp8/a;

.field public final e:Lp8/a;

.field public final f:Lp8/a;


# direct methods
.method public synthetic constructor <init>(Lp8/a;Lp8/a;Ln5/b;Lp8/a;Lp8/a;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p6, p0, Ll5/v;->a:I

    iput-object p1, p0, Ll5/v;->b:Lp8/a;

    iput-object p2, p0, Ll5/v;->c:Lp8/a;

    iput-object p3, p0, Ll5/v;->d:Lp8/a;

    iput-object p4, p0, Ll5/v;->e:Lp8/a;

    iput-object p5, p0, Ll5/v;->f:Lp8/a;

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 11

    iget v0, p0, Ll5/v;->a:I

    iget-object v1, p0, Ll5/v;->f:Lp8/a;

    iget-object v2, p0, Ll5/v;->e:Lp8/a;

    iget-object v3, p0, Ll5/v;->d:Lp8/a;

    iget-object v4, p0, Ll5/v;->c:Lp8/a;

    iget-object v5, p0, Ll5/v;->b:Lp8/a;

    packed-switch v0, :pswitch_data_0

    invoke-interface {v5}, Lp8/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lt5/a;

    invoke-interface {v4}, Lp8/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lt5/a;

    invoke-interface {v3}, Lp8/a;->get()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v2}, Lp8/a;->get()Ljava/lang/Object;

    move-result-object v1

    iget-object v10, p0, Ll5/v;->f:Lp8/a;

    new-instance v2, Lr5/m;

    move-object v8, v0

    check-cast v8, Lr5/a;

    move-object v9, v1

    check-cast v9, Lr5/p;

    move-object v5, v2

    invoke-direct/range {v5 .. v10}, Lr5/m;-><init>(Lt5/a;Lt5/a;Lr5/a;Lr5/p;Lp8/a;)V

    return-object v2

    :pswitch_0
    invoke-interface {v5}, Lp8/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Ljava/util/concurrent/Executor;

    invoke-interface {v4}, Lp8/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lm5/f;

    invoke-interface {v3}, Lp8/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lq5/l;

    invoke-interface {v2}, Lp8/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lr5/d;

    invoke-interface {v1}, Lp8/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Ls5/c;

    new-instance v0, Lp5/c;

    move-object v5, v0

    invoke-direct/range {v5 .. v10}, Lp5/c;-><init>(Ljava/util/concurrent/Executor;Lm5/f;Lq5/l;Lr5/d;Ls5/c;)V

    return-object v0

    :pswitch_1
    invoke-interface {v5}, Lp8/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lt5/a;

    invoke-interface {v4}, Lp8/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lt5/a;

    invoke-interface {v3}, Lp8/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lp5/d;

    invoke-interface {v2}, Lp8/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lq5/i;

    invoke-interface {v1}, Lp8/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Lq5/k;

    new-instance v0, Ll5/u;

    move-object v5, v0

    invoke-direct/range {v5 .. v10}, Ll5/u;-><init>(Lt5/a;Lt5/a;Lp5/d;Lq5/i;Lq5/k;)V

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
