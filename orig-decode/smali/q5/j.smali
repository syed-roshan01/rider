.class public final Lq5/j;
.super Ljava/lang/Object;

# interfaces
.implements Ln5/b;


# instance fields
.field public final a:Lp8/a;

.field public final b:Lp8/a;

.field public final c:Lp8/a;

.field public final d:Lp8/a;

.field public final e:Lp8/a;

.field public final f:Lp8/a;

.field public final g:Lp8/a;

.field public final h:Lp8/a;

.field public final i:Lp8/a;


# direct methods
.method public constructor <init>(Lp8/a;Lp8/a;Lp8/a;Lp5/f;Lp8/a;Lp8/a;Lp8/a;)V
    .locals 2

    sget-object v0, Lt5/b;->a:Ll5/o;

    sget-object v1, Lt5/b;->b:Ll5/o;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq5/j;->a:Lp8/a;

    iput-object p2, p0, Lq5/j;->b:Lp8/a;

    iput-object p3, p0, Lq5/j;->c:Lp8/a;

    iput-object p4, p0, Lq5/j;->d:Lp8/a;

    iput-object p5, p0, Lq5/j;->e:Lp8/a;

    iput-object p6, p0, Lq5/j;->f:Lp8/a;

    iput-object v0, p0, Lq5/j;->g:Lp8/a;

    iput-object v1, p0, Lq5/j;->h:Lp8/a;

    iput-object p7, p0, Lq5/j;->i:Lp8/a;

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 11

    iget-object v0, p0, Lq5/j;->a:Lp8/a;

    invoke-interface {v0}, Lp8/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/content/Context;

    iget-object v0, p0, Lq5/j;->b:Lp8/a;

    invoke-interface {v0}, Lp8/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lm5/f;

    iget-object v0, p0, Lq5/j;->c:Lp8/a;

    invoke-interface {v0}, Lp8/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lr5/d;

    iget-object v0, p0, Lq5/j;->d:Lp8/a;

    invoke-interface {v0}, Lp8/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lq5/l;

    iget-object v0, p0, Lq5/j;->e:Lp8/a;

    invoke-interface {v0}, Lp8/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Ljava/util/concurrent/Executor;

    iget-object v0, p0, Lq5/j;->f:Lp8/a;

    invoke-interface {v0}, Lp8/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Ls5/c;

    iget-object v0, p0, Lq5/j;->g:Lp8/a;

    invoke-interface {v0}, Lp8/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lt5/a;

    iget-object v0, p0, Lq5/j;->h:Lp8/a;

    invoke-interface {v0}, Lp8/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lt5/a;

    iget-object v0, p0, Lq5/j;->i:Lp8/a;

    invoke-interface {v0}, Lp8/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Lr5/c;

    new-instance v0, Lq5/i;

    move-object v1, v0

    invoke-direct/range {v1 .. v10}, Lq5/i;-><init>(Landroid/content/Context;Lm5/f;Lr5/d;Lq5/l;Ljava/util/concurrent/Executor;Ls5/c;Lt5/a;Lt5/a;Lr5/c;)V

    return-object v0
.end method
