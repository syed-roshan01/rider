.class final Lcom/google/firebase/auth/internal/zzca;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/common/api/internal/b;


# instance fields
.field private final synthetic zza:Lcom/google/firebase/auth/internal/zzcb;


# direct methods
.method public constructor <init>(Lcom/google/firebase/auth/internal/zzcb;)V
    .locals 0

    iput-object p1, p0, Lcom/google/firebase/auth/internal/zzca;->zza:Lcom/google/firebase/auth/internal/zzcb;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onBackgroundStateChanged(Z)V
    .locals 1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/google/firebase/auth/internal/zzca;->zza:Lcom/google/firebase/auth/internal/zzcb;

    const/4 v0, 0x1

    invoke-static {p1, v0}, Lcom/google/firebase/auth/internal/zzcb;->zza(Lcom/google/firebase/auth/internal/zzcb;Z)V

    iget-object p1, p0, Lcom/google/firebase/auth/internal/zzca;->zza:Lcom/google/firebase/auth/internal/zzcb;

    invoke-virtual {p1}, Lcom/google/firebase/auth/internal/zzcb;->zza()V

    return-void

    :cond_0
    iget-object p1, p0, Lcom/google/firebase/auth/internal/zzca;->zza:Lcom/google/firebase/auth/internal/zzcb;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/google/firebase/auth/internal/zzcb;->zza(Lcom/google/firebase/auth/internal/zzcb;Z)V

    iget-object p1, p0, Lcom/google/firebase/auth/internal/zzca;->zza:Lcom/google/firebase/auth/internal/zzcb;

    invoke-static {p1}, Lcom/google/firebase/auth/internal/zzcb;->zzb(Lcom/google/firebase/auth/internal/zzcb;)Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/google/firebase/auth/internal/zzca;->zza:Lcom/google/firebase/auth/internal/zzcb;

    invoke-static {p1}, Lcom/google/firebase/auth/internal/zzcb;->zza(Lcom/google/firebase/auth/internal/zzcb;)Lcom/google/firebase/auth/internal/zzaq;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/firebase/auth/internal/zzaq;->zzc()V

    :cond_1
    return-void
.end method
