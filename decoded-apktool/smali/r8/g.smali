.class public abstract Lr8/g;
.super Ljava/util/AbstractList;

# interfaces
.implements Ljava/util/List;
.implements Le9/b;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/util/AbstractList;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract e()I
.end method

.method public abstract i(I)Ljava/lang/Object;
.end method

.method public final bridge remove(I)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lr8/g;->i(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final bridge size()I
    .locals 1

    invoke-virtual {p0}, Lr8/g;->e()I

    move-result v0

    return v0
.end method
