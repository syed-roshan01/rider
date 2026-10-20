.class public final Lcom/google/android/gms/internal/measurement/zzgy;
.super Ljava/lang/Object;


# instance fields
.field private final zza:Z


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/measurement/zzhb;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "BuildInfo must be non-null"

    invoke-static {p1, v0}, Ly3/e;->J(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {p1}, Lcom/google/android/gms/internal/measurement/zzhb;->zza()Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    iput-boolean p1, p0, Lcom/google/android/gms/internal/measurement/zzgy;->zza:Z

    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/String;)Z
    .locals 4

    const-string v0, "flagName must not be null"

    invoke-static {p1, v0}, Ly3/e;->J(Ljava/lang/Object;Ljava/lang/Object;)V

    iget-boolean v0, p0, Lcom/google/android/gms/internal/measurement/zzgy;->zza:Z

    const/4 v1, 0x1

    if-nez v0, :cond_0

    return v1

    :cond_0
    sget-object v0, Lcom/google/android/gms/internal/measurement/zzha;->zza:Lq6/m;

    invoke-interface {v0}, Lq6/m;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lr6/u;

    invoke-virtual {v0}, Lr6/u;->a()Lr6/s;

    move-result-object v0

    invoke-virtual {v0}, Lr6/s;->values()Ljava/util/Collection;

    move-result-object v0

    check-cast v0, Lr6/p;

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Lr6/p;->p(I)Lr6/m;

    move-result-object v0

    :cond_1
    invoke-virtual {v0}, Lr6/a;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-virtual {v0}, Lr6/a;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v3, p1}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    goto :goto_0

    :cond_2
    move v1, v2

    :goto_0
    return v1
.end method
