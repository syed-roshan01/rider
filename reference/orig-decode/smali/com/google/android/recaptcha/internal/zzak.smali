.class final Lcom/google/android/recaptcha/internal/zzak;
.super Lw8/i;

# interfaces
.implements Lc9/e;


# instance fields
.field zza:I

.field final synthetic zzb:Landroid/app/Application;

.field final synthetic zzc:Ljava/lang/String;

.field final synthetic zzd:J


# direct methods
.method public constructor <init>(Landroid/app/Application;Ljava/lang/String;JLu8/e;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/recaptcha/internal/zzak;->zzb:Landroid/app/Application;

    iput-object p2, p0, Lcom/google/android/recaptcha/internal/zzak;->zzc:Ljava/lang/String;

    iput-wide p3, p0, Lcom/google/android/recaptcha/internal/zzak;->zzd:J

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Lw8/i;-><init>(ILu8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lu8/e;)Lu8/e;
    .locals 6

    new-instance p1, Lcom/google/android/recaptcha/internal/zzak;

    iget-object v1, p0, Lcom/google/android/recaptcha/internal/zzak;->zzb:Landroid/app/Application;

    iget-object v2, p0, Lcom/google/android/recaptcha/internal/zzak;->zzc:Ljava/lang/String;

    iget-wide v3, p0, Lcom/google/android/recaptcha/internal/zzak;->zzd:J

    move-object v0, p1

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lcom/google/android/recaptcha/internal/zzak;-><init>(Landroid/app/Application;Ljava/lang/String;JLu8/e;)V

    return-object p1
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lm9/d0;

    check-cast p2, Lu8/e;

    invoke-virtual {p0, p1, p2}, Lcom/google/android/recaptcha/internal/zzak;->create(Ljava/lang/Object;Lu8/e;)Lu8/e;

    move-result-object p1

    sget-object p2, Lq8/l;->a:Lq8/l;

    check-cast p1, Lcom/google/android/recaptcha/internal/zzak;

    invoke-virtual {p1, p2}, Lcom/google/android/recaptcha/internal/zzak;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    sget-object v0, Lv8/a;->a:Lv8/a;

    iget v1, p0, Lcom/google/android/recaptcha/internal/zzak;->zza:I

    invoke-static {p1}, Ld7/t;->v0(Ljava/lang/Object;)V

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    sget-object p1, Lcom/google/android/recaptcha/internal/zzam;->zza:Lcom/google/android/recaptcha/internal/zzam;

    iget-object v1, p0, Lcom/google/android/recaptcha/internal/zzak;->zzb:Landroid/app/Application;

    iget-object v2, p0, Lcom/google/android/recaptcha/internal/zzak;->zzc:Ljava/lang/String;

    iget-wide v3, p0, Lcom/google/android/recaptcha/internal/zzak;->zzd:J

    const/4 p1, 0x1

    iput p1, p0, Lcom/google/android/recaptcha/internal/zzak;->zza:I

    const/4 v5, 0x0

    move-object v6, p0

    invoke-static/range {v1 .. v6}, Lcom/google/android/recaptcha/internal/zzam;->zzc(Landroid/app/Application;Ljava/lang/String;JLcom/google/android/recaptcha/internal/zzbq;Lu8/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_1

    return-object v0

    :cond_1
    :goto_0
    return-object p1
.end method
