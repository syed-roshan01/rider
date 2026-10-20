.class public abstract Lw0/r;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/util/Set;
.implements Le9/e;


# instance fields
.field public final a:Lw0/x;


# direct methods
.method public constructor <init>(Lw0/x;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw0/r;->a:Lw0/x;

    return-void
.end method


# virtual methods
.method public final clear()V
    .locals 1

    iget-object v0, p0, Lw0/r;->a:Lw0/x;

    invoke-virtual {v0}, Lw0/x;->clear()V

    return-void
.end method

.method public final isEmpty()Z
    .locals 1

    iget-object v0, p0, Lw0/r;->a:Lw0/x;

    invoke-virtual {v0}, Lw0/x;->isEmpty()Z

    move-result v0

    return v0
.end method

.method public final size()I
    .locals 1

    iget-object v0, p0, Lw0/r;->a:Lw0/x;

    invoke-virtual {v0}, Lw0/x;->size()I

    move-result v0

    return v0
.end method

.method public final toArray()[Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-static {p0}, Ld9/i;->v(Ljava/util/Collection;)[Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final toArray([Ljava/lang/Object;)[Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-static {p0, p1}, Ld9/i;->w(Ljava/util/Collection;[Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
