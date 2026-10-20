.class public final Lc1/a;
.super Ly0/n;

# interfaces
.implements Lc1/c;


# instance fields
.field public u:Lc9/c;

.field public v:Lc1/n;


# virtual methods
.method public final a0(Lc1/o;)V
    .locals 1

    iget-object v0, p0, Lc1/a;->v:Lc1/n;

    invoke-static {v0, p1}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iput-object p1, p0, Lc1/a;->v:Lc1/n;

    iget-object v0, p0, Lc1/a;->u:Lc9/c;

    invoke-interface {v0, p1}, Lc9/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method
