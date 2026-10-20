.class public final Lcom/google/android/recaptcha/internal/zzbj;
.super Ljava/util/TimerTask;


# instance fields
.field final synthetic zza:Lcom/google/android/recaptcha/internal/zzbm;


# direct methods
.method public constructor <init>(Lcom/google/android/recaptcha/internal/zzbm;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/recaptcha/internal/zzbj;->zza:Lcom/google/android/recaptcha/internal/zzbm;

    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    iget-object v0, p0, Lcom/google/android/recaptcha/internal/zzbj;->zza:Lcom/google/android/recaptcha/internal/zzbm;

    invoke-static {v0}, Lcom/google/android/recaptcha/internal/zzbm;->zzd(Lcom/google/android/recaptcha/internal/zzbm;)Lm9/d0;

    move-result-object v1

    new-instance v2, Lcom/google/android/recaptcha/internal/zzbk;

    const/4 v3, 0x0

    invoke-direct {v2, v0, v3}, Lcom/google/android/recaptcha/internal/zzbk;-><init>(Lcom/google/android/recaptcha/internal/zzbm;Lu8/e;)V

    const/4 v0, 0x3

    const/4 v4, 0x0

    invoke-static {v1, v3, v4, v2, v0}, Lz6/a;->Q(Lm9/d0;Ln9/d;ILc9/e;I)Lm9/x1;

    return-void
.end method
