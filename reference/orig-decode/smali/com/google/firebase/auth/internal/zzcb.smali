.class public final Lcom/google/firebase/auth/internal/zzcb;
.super Ljava/lang/Object;


# instance fields
.field private volatile zza:I

.field private final zzb:Lcom/google/firebase/auth/internal/zzaq;

.field private volatile zzc:Z


# direct methods
.method private constructor <init>(Landroid/content/Context;Lcom/google/firebase/auth/internal/zzaq;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/firebase/auth/internal/zzcb;->zzc:Z

    iput v0, p0, Lcom/google/firebase/auth/internal/zzcb;->zza:I

    iput-object p2, p0, Lcom/google/firebase/auth/internal/zzcb;->zzb:Lcom/google/firebase/auth/internal/zzaq;

    .line 3
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    check-cast p1, Landroid/app/Application;

    invoke-static {p1}, Lcom/google/android/gms/common/api/internal/c;->b(Landroid/app/Application;)V

    .line 4
    sget-object p1, Lcom/google/android/gms/common/api/internal/c;->e:Lcom/google/android/gms/common/api/internal/c;

    .line 5
    new-instance p2, Lcom/google/firebase/auth/internal/zzca;

    invoke-direct {p2, p0}, Lcom/google/firebase/auth/internal/zzca;-><init>(Lcom/google/firebase/auth/internal/zzcb;)V

    .line 6
    invoke-virtual {p1, p2}, Lcom/google/android/gms/common/api/internal/c;->a(Lcom/google/android/gms/common/api/internal/b;)V

    return-void
.end method

.method public constructor <init>(Lcom/google/firebase/FirebaseApp;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Lcom/google/firebase/FirebaseApp;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    new-instance v1, Lcom/google/firebase/auth/internal/zzaq;

    invoke-direct {v1, p1}, Lcom/google/firebase/auth/internal/zzaq;-><init>(Lcom/google/firebase/FirebaseApp;)V

    invoke-direct {p0, v0, v1}, Lcom/google/firebase/auth/internal/zzcb;-><init>(Landroid/content/Context;Lcom/google/firebase/auth/internal/zzaq;)V

    return-void
.end method

.method public static bridge synthetic zza(Lcom/google/firebase/auth/internal/zzcb;)Lcom/google/firebase/auth/internal/zzaq;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/firebase/auth/internal/zzcb;->zzb:Lcom/google/firebase/auth/internal/zzaq;

    return-object p0
.end method

.method public static bridge synthetic zza(Lcom/google/firebase/auth/internal/zzcb;Z)V
    .locals 0

    .line 2
    iput-boolean p1, p0, Lcom/google/firebase/auth/internal/zzcb;->zzc:Z

    return-void
.end method

.method private final zzb()Z
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/firebase/auth/internal/zzcb;->zza:I

    if-lez v0, :cond_0

    iget-boolean v0, p0, Lcom/google/firebase/auth/internal/zzcb;->zzc:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public static bridge synthetic zzb(Lcom/google/firebase/auth/internal/zzcb;)Z
    .locals 0

    .line 2
    invoke-direct {p0}, Lcom/google/firebase/auth/internal/zzcb;->zzb()Z

    move-result p0

    return p0
.end method


# virtual methods
.method public final zza()V
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/auth/internal/zzcb;->zzb:Lcom/google/firebase/auth/internal/zzaq;

    .line 3
    invoke-virtual {v0}, Lcom/google/firebase/auth/internal/zzaq;->zzb()V

    return-void
.end method

.method public final zza(I)V
    .locals 1

    if-lez p1, :cond_0

    iget v0, p0, Lcom/google/firebase/auth/internal/zzcb;->zza:I

    if-nez v0, :cond_0

    iput p1, p0, Lcom/google/firebase/auth/internal/zzcb;->zza:I

    .line 4
    invoke-direct {p0}, Lcom/google/firebase/auth/internal/zzcb;->zzb()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/firebase/auth/internal/zzcb;->zzb:Lcom/google/firebase/auth/internal/zzaq;

    .line 5
    invoke-virtual {v0}, Lcom/google/firebase/auth/internal/zzaq;->zzc()V

    goto :goto_0

    :cond_0
    if-nez p1, :cond_1

    iget v0, p0, Lcom/google/firebase/auth/internal/zzcb;->zza:I

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/firebase/auth/internal/zzcb;->zzb:Lcom/google/firebase/auth/internal/zzaq;

    .line 6
    invoke-virtual {v0}, Lcom/google/firebase/auth/internal/zzaq;->zzb()V

    :cond_1
    :goto_0
    iput p1, p0, Lcom/google/firebase/auth/internal/zzcb;->zza:I

    return-void
.end method

.method public final zza(Lcom/google/android/gms/internal/firebase-auth-api/zzafm;)V
    .locals 6

    if-nez p1, :cond_0

    return-void

    .line 7
    :cond_0
    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzafm;->zza()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v2, v0, v2

    if-gtz v2, :cond_1

    const-wide/16 v0, 0xe10

    .line 8
    :cond_1
    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzafm;->zzb()J

    move-result-wide v2

    const-wide/16 v4, 0x3e8

    mul-long/2addr v0, v4

    add-long/2addr v0, v2

    iget-object p1, p0, Lcom/google/firebase/auth/internal/zzcb;->zzb:Lcom/google/firebase/auth/internal/zzaq;

    .line 9
    iput-wide v0, p1, Lcom/google/firebase/auth/internal/zzaq;->zza:J

    const-wide/16 v0, -0x1

    .line 10
    iput-wide v0, p1, Lcom/google/firebase/auth/internal/zzaq;->zzb:J

    .line 11
    invoke-direct {p0}, Lcom/google/firebase/auth/internal/zzcb;->zzb()Z

    move-result p1

    if-eqz p1, :cond_2

    iget-object p1, p0, Lcom/google/firebase/auth/internal/zzcb;->zzb:Lcom/google/firebase/auth/internal/zzaq;

    .line 12
    invoke-virtual {p1}, Lcom/google/firebase/auth/internal/zzaq;->zzc()V

    :cond_2
    return-void
.end method
