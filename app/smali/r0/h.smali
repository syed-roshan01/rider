.class public final Lr0/h;
.super Lr0/a;


# instance fields
.field public final a:Lr0/f;


# direct methods
.method public constructor <init>(Lr0/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/util/AbstractSet;-><init>()V

    iput-object p1, p0, Lr0/h;->a:Lr0/f;

    return-void
.end method


# virtual methods
.method public final add(Ljava/lang/Object;)Z
    .locals 0

    check-cast p1, Ljava/util/Map$Entry;

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final clear()V
    .locals 1

    iget-object v0, p0, Lr0/h;->a:Lr0/f;

    invoke-virtual {v0}, Lr0/f;->clear()V

    return-void
.end method

.method public final e()I
    .locals 1

    iget-object v0, p0, Lr0/h;->a:Lr0/f;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v0, v0, Lr0/f;->f:I

    return v0
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 2

    new-instance v0, Lr0/i;

    iget-object v1, p0, Lr0/h;->a:Lr0/f;

    invoke-direct {v0, v1}, Lr0/i;-><init>(Lr0/f;)V

    return-object v0
.end method
