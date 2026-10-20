.class public abstract Lf4/y;
.super Ljava/lang/Object;

# interfaces
.implements Lk6/p5;


# instance fields
.field public a:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lk6/f5;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lf6/a;->x(Ljava/lang/Object;)V

    iput-object p1, p0, Lf4/y;->a:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public abstract b(Lcom/google/crypto/tink/shaded/protobuf/b;)Lcom/google/crypto/tink/shaded/protobuf/b0;
.end method

.method public abstract c()V
.end method

.method public abstract d()V
.end method

.method public abstract e(Lcom/google/crypto/tink/shaded/protobuf/l;)Lcom/google/crypto/tink/shaded/protobuf/b0;
.end method

.method public final f(Ljava/lang/Object;Z)V
    .locals 2

    iget-object v0, p0, Lf4/y;->a:Ljava/lang/Object;

    check-cast v0, Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->size()I

    move-result v1

    if-eqz p2, :cond_0

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    if-nez v1, :cond_1

    invoke-virtual {p0}, Lf4/y;->c()V

    goto :goto_0

    :cond_0
    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    if-ne v1, p1, :cond_1

    invoke-virtual {p0}, Lf4/y;->d()V

    :cond_1
    :goto_0
    return-void
.end method

.method public abstract g(Lcom/google/crypto/tink/shaded/protobuf/b;)V
.end method

.method public final h()Lk6/f;
    .locals 1

    iget-object v0, p0, Lf4/y;->a:Ljava/lang/Object;

    check-cast v0, Lk6/f5;

    iget-object v0, v0, Lk6/f5;->g:Lk6/f;

    return-object v0
.end method

.method public final i()Lk6/c4;
    .locals 1

    iget-object v0, p0, Lf4/y;->a:Ljava/lang/Object;

    check-cast v0, Lk6/f5;

    iget-object v0, v0, Lk6/f5;->m:Lk6/c4;

    return-object v0
.end method

.method public final j()Lk6/l4;
    .locals 1

    iget-object v0, p0, Lf4/y;->a:Ljava/lang/Object;

    check-cast v0, Lk6/f5;

    iget-object v0, v0, Lk6/f5;->h:Lk6/l4;

    invoke-static {v0}, Lk6/f5;->c(Lk6/o5;)V

    return-object v0
.end method

.method public final k()Lk6/u7;
    .locals 1

    iget-object v0, p0, Lf4/y;->a:Ljava/lang/Object;

    check-cast v0, Lk6/f5;

    iget-object v0, v0, Lk6/f5;->l:Lk6/u7;

    invoke-static {v0}, Lk6/f5;->c(Lk6/o5;)V

    return-object v0
.end method

.method public l()V
    .locals 1

    iget-object v0, p0, Lf4/y;->a:Ljava/lang/Object;

    check-cast v0, Lk6/f5;

    iget-object v0, v0, Lk6/f5;->j:Lk6/z4;

    invoke-static {v0}, Lk6/f5;->d(Lk6/o5;)V

    invoke-virtual {v0}, Lk6/z4;->l()V

    return-void
.end method

.method public final zza()Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lf4/y;->a:Ljava/lang/Object;

    check-cast v0, Lk6/f5;

    iget-object v0, v0, Lk6/f5;->a:Landroid/content/Context;

    return-object v0
.end method

.method public final zzb()Le6/b;
    .locals 1

    iget-object v0, p0, Lf4/y;->a:Ljava/lang/Object;

    check-cast v0, Lk6/f5;

    iget-object v0, v0, Lk6/f5;->n:Le6/c;

    return-object v0
.end method

.method public final zzd()Lk6/h;
    .locals 1

    iget-object v0, p0, Lf4/y;->a:Ljava/lang/Object;

    check-cast v0, Lk6/f5;

    iget-object v0, v0, Lk6/f5;->f:Lk6/h;

    return-object v0
.end method

.method public final zzj()Lk6/d4;
    .locals 1

    iget-object v0, p0, Lf4/y;->a:Ljava/lang/Object;

    check-cast v0, Lk6/f5;

    iget-object v0, v0, Lk6/f5;->i:Lk6/d4;

    invoke-static {v0}, Lk6/f5;->d(Lk6/o5;)V

    return-object v0
.end method

.method public final zzl()Lk6/z4;
    .locals 1

    iget-object v0, p0, Lf4/y;->a:Ljava/lang/Object;

    check-cast v0, Lk6/f5;

    iget-object v0, v0, Lk6/f5;->j:Lk6/z4;

    invoke-static {v0}, Lk6/f5;->d(Lk6/o5;)V

    return-object v0
.end method
