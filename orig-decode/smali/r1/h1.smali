.class public final Lr1/h1;
.super Ljava/lang/Object;


# instance fields
.field public final a:Lr1/k1;

.field public b:Lr1/f0;

.field public final c:Lr1/g1;

.field public final d:Lr1/g1;

.field public final e:Lr1/g1;


# direct methods
.method public constructor <init>(Lr1/k1;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr1/h1;->a:Lr1/k1;

    new-instance p1, Lr1/g1;

    const/4 v0, 0x2

    invoke-direct {p1, p0, v0}, Lr1/g1;-><init>(Lr1/h1;I)V

    iput-object p1, p0, Lr1/h1;->c:Lr1/g1;

    new-instance p1, Lr1/g1;

    const/4 v0, 0x0

    invoke-direct {p1, p0, v0}, Lr1/g1;-><init>(Lr1/h1;I)V

    iput-object p1, p0, Lr1/h1;->d:Lr1/g1;

    new-instance p1, Lr1/g1;

    const/4 v0, 0x1

    invoke-direct {p1, p0, v0}, Lr1/g1;-><init>(Lr1/h1;I)V

    iput-object p1, p0, Lr1/h1;->e:Lr1/g1;

    return-void
.end method


# virtual methods
.method public final a()Lr1/f0;
    .locals 2

    iget-object v0, p0, Lr1/h1;->b:Lr1/f0;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "SubcomposeLayoutState is not attached to SubcomposeLayout"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
