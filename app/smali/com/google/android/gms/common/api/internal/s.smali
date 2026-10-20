.class public final Lcom/google/android/gms/common/api/internal/s;
.super Ljava/lang/Object;


# instance fields
.field public a:Z

.field public b:I

.field public c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;


# virtual methods
.method public final a()Lcom/google/android/gms/common/api/internal/p0;
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/s;->c:Ljava/lang/Object;

    check-cast v0, Lcom/google/android/gms/common/api/internal/q;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-string v1, "execute parameter required"

    invoke-static {v1, v0}, Lf6/a;->q(Ljava/lang/String;Z)V

    new-instance v0, Lcom/google/android/gms/common/api/internal/p0;

    iget-object v1, p0, Lcom/google/android/gms/common/api/internal/s;->d:Ljava/lang/Object;

    check-cast v1, [Lz5/d;

    iget-boolean v2, p0, Lcom/google/android/gms/common/api/internal/s;->a:Z

    iget v3, p0, Lcom/google/android/gms/common/api/internal/s;->b:I

    invoke-direct {v0, p0, v1, v2, v3}, Lcom/google/android/gms/common/api/internal/p0;-><init>(Lcom/google/android/gms/common/api/internal/s;[Lz5/d;ZI)V

    return-object v0
.end method
