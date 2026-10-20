.class public final Lr6/d0;
.super Lr6/t;


# instance fields
.field public final transient d:Lr6/s;

.field public final transient e:Lr6/p;


# direct methods
.method public constructor <init>(Lr6/s;Lr6/e0;)V
    .locals 0

    invoke-direct {p0}, Ljava/util/AbstractCollection;-><init>()V

    iput-object p1, p0, Lr6/d0;->d:Lr6/s;

    iput-object p2, p0, Lr6/d0;->e:Lr6/p;

    return-void
.end method


# virtual methods
.method public final contains(Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, Lr6/d0;->d:Lr6/s;

    invoke-virtual {v0, p1}, Lr6/s;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final e([Ljava/lang/Object;)I
    .locals 1

    iget-object v0, p0, Lr6/d0;->e:Lr6/p;

    invoke-virtual {v0, p1}, Lr6/p;->e([Ljava/lang/Object;)I

    move-result p1

    return p1
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 2

    const/4 v0, 0x0

    iget-object v1, p0, Lr6/d0;->e:Lr6/p;

    invoke-virtual {v1, v0}, Lr6/p;->p(I)Lr6/m;

    move-result-object v0

    return-object v0
.end method

.method public final n()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final size()I
    .locals 1

    iget-object v0, p0, Lr6/d0;->d:Lr6/s;

    check-cast v0, Lr6/f0;

    iget v0, v0, Lr6/f0;->f:I

    return v0
.end method
