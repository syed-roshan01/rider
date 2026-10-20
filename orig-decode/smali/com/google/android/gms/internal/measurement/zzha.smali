.class public final Lcom/google/android/gms/internal/measurement/zzha;
.super Ljava/lang/Object;


# static fields
.field public static final zza:Lq6/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lq6/m;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/zzhc;->zza:Lcom/google/android/gms/internal/measurement/zzhc;

    invoke-static {v0}, Lo7/d0;->S(Lq6/m;)Lq6/m;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/measurement/zzha;->zza:Lq6/m;

    return-void
.end method

.method public static zza()Lr6/u;
    .locals 5

    invoke-static {}, Lr6/i;->a()Lr6/i;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object v0, Lr6/j;->b:Lr6/j;

    goto :goto_1

    :cond_0
    new-instance v1, Lr6/r;

    invoke-interface {v0}, Ljava/util/Collection;->size()I

    move-result v2

    invoke-direct {v1, v2}, Lr6/r;-><init>(I)V

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Collection;

    invoke-static {v2}, Lr6/t;->q(Ljava/util/Collection;)Lr6/t;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_1

    invoke-virtual {v1, v3, v2}, Lr6/r;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v2}, Ljava/util/AbstractCollection;->size()I

    goto :goto_0

    :cond_2
    new-instance v0, Lr6/u;

    iget-object v2, v1, Lr6/r;->c:Lr6/q;

    if-nez v2, :cond_4

    iget v2, v1, Lr6/r;->b:I

    iget-object v3, v1, Lr6/r;->a:[Ljava/lang/Object;

    invoke-static {v2, v3, v1}, Lr6/f0;->b(I[Ljava/lang/Object;Lr6/r;)Lr6/f0;

    move-result-object v2

    iget-object v1, v1, Lr6/r;->c:Lr6/q;

    if-nez v1, :cond_3

    const/4 v1, 0x0

    invoke-direct {v0, v2, v1}, Lr6/u;-><init>(Lr6/f0;Ljava/util/Comparator;)V

    :goto_1
    return-object v0

    :cond_3
    invoke-virtual {v1}, Lr6/q;->a()Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    :cond_4
    invoke-virtual {v2}, Lr6/q;->a()Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0
.end method
