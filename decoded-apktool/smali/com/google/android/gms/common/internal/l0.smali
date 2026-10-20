.class public final Lcom/google/android/gms/common/internal/l0;
.super Lcom/google/android/gms/common/internal/b0;


# instance fields
.field public final synthetic g:Lcom/google/android/gms/common/internal/f;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/common/internal/f;I)V
    .locals 1

    iput-object p1, p0, Lcom/google/android/gms/common/internal/l0;->g:Lcom/google/android/gms/common/internal/f;

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/google/android/gms/common/internal/b0;-><init>(Lcom/google/android/gms/common/internal/f;ILandroid/os/Bundle;)V

    return-void
.end method


# virtual methods
.method public final b(Lz5/b;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/common/internal/l0;->g:Lcom/google/android/gms/common/internal/f;

    invoke-virtual {v0}, Lcom/google/android/gms/common/internal/f;->enableLocalFallback()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {v0}, Lcom/google/android/gms/common/internal/f;->zzo(Lcom/google/android/gms/common/internal/f;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/16 p1, 0x10

    invoke-static {v0, p1}, Lcom/google/android/gms/common/internal/f;->zzk(Lcom/google/android/gms/common/internal/f;I)V

    return-void

    :cond_0
    iget-object v1, v0, Lcom/google/android/gms/common/internal/f;->zzc:Lcom/google/android/gms/common/internal/d;

    invoke-interface {v1, p1}, Lcom/google/android/gms/common/internal/d;->j(Lz5/b;)V

    invoke-virtual {v0, p1}, Lcom/google/android/gms/common/internal/f;->onConnectionFailed(Lz5/b;)V

    return-void
.end method

.method public final c()Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/common/internal/l0;->g:Lcom/google/android/gms/common/internal/f;

    iget-object v0, v0, Lcom/google/android/gms/common/internal/f;->zzc:Lcom/google/android/gms/common/internal/d;

    sget-object v1, Lz5/b;->e:Lz5/b;

    invoke-interface {v0, v1}, Lcom/google/android/gms/common/internal/d;->j(Lz5/b;)V

    const/4 v0, 0x1

    return v0
.end method
