.class public final Lr0/o;
.super Lr8/j;

# interfaces
.implements Lp0/c;


# instance fields
.field public final a:Lr0/d;


# direct methods
.method public constructor <init>(Lr0/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr0/o;->a:Lr0/d;

    return-void
.end method


# virtual methods
.method public final contains(Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, Lr0/o;->a:Lr0/d;

    invoke-virtual {v0, p1}, Lr0/d;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final e()I
    .locals 1

    iget-object v0, p0, Lr0/o;->a:Lr0/d;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v0, v0, Lr0/d;->b:I

    return v0
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 6

    new-instance v0, Lr0/n;

    iget-object v1, p0, Lr0/o;->a:Lr0/d;

    iget-object v1, v1, Lr0/d;->a:Lr0/r;

    const/16 v2, 0x8

    new-array v3, v2, [Lr0/s;

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v2, :cond_0

    new-instance v5, Lr0/u;

    invoke-direct {v5}, Lr0/s;-><init>()V

    aput-object v5, v3, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_0
    invoke-direct {v0, v1, v3}, Lr0/e;-><init>(Lr0/r;[Lr0/s;)V

    return-object v0
.end method
