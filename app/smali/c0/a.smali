.class public abstract Lc0/a;
.super Ly0/n;

# interfaces
.implements Ls1/f;
.implements Lt1/a0;
.implements Lt1/m;


# instance fields
.field public final u:Lc0/n;

.field public v:Lr1/s;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ly0/n;-><init>()V

    new-instance v0, Lc0/n;

    invoke-direct {v0, p0}, Lc0/n;-><init>(Lt1/m;)V

    iput-object v0, p0, Lc0/a;->u:Lc0/n;

    return-void
.end method


# virtual methods
.method public final G0()Lr1/s;
    .locals 3

    iget-object v0, p0, Lc0/a;->v:Lr1/s;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lr1/s;->L()Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    return-object v0
.end method

.method public final R(Lt1/c1;)V
    .locals 0

    iput-object p1, p0, Lc0/a;->v:Lr1/s;

    return-void
.end method
