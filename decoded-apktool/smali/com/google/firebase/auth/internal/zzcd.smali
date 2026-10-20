.class public final Lcom/google/firebase/auth/internal/zzcd;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/firebase/auth/TotpSecret;


# instance fields
.field private final zza:Ljava/lang/String;

.field private final zzb:Ljava/lang/String;

.field private final zzc:I

.field private final zzd:I

.field private final zze:J

.field private zzf:Ljava/lang/String;

.field private zzg:Lcom/google/firebase/auth/FirebaseAuth;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;IIJLjava/lang/String;Lcom/google/firebase/auth/FirebaseAuth;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "sessionInfo cannot be empty."

    invoke-static {v0, p7}, Lf6/a;->v(Ljava/lang/String;Ljava/lang/String;)V

    if-eqz p8, :cond_0

    const-string v0, "sharedSecretKey cannot be empty. This is required to generate QR code URL."

    invoke-static {v0, p1}, Lf6/a;->v(Ljava/lang/String;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/google/firebase/auth/internal/zzcd;->zza:Ljava/lang/String;

    const-string p1, "hashAlgorithm cannot be empty."

    invoke-static {p1, p2}, Lf6/a;->v(Ljava/lang/String;Ljava/lang/String;)V

    iput-object p2, p0, Lcom/google/firebase/auth/internal/zzcd;->zzb:Ljava/lang/String;

    iput p3, p0, Lcom/google/firebase/auth/internal/zzcd;->zzc:I

    iput p4, p0, Lcom/google/firebase/auth/internal/zzcd;->zzd:I

    iput-wide p5, p0, Lcom/google/firebase/auth/internal/zzcd;->zze:J

    iput-object p7, p0, Lcom/google/firebase/auth/internal/zzcd;->zzf:Ljava/lang/String;

    iput-object p8, p0, Lcom/google/firebase/auth/internal/zzcd;->zzg:Lcom/google/firebase/auth/FirebaseAuth;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "firebaseAuth cannot be null."

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private final zza(Ljava/lang/String;)V
    .locals 3

    iget-object v0, p0, Lcom/google/firebase/auth/internal/zzcd;->zzg:Lcom/google/firebase/auth/FirebaseAuth;

    .line 1
    invoke-virtual {v0}, Lcom/google/firebase/auth/FirebaseAuth;->getApp()Lcom/google/firebase/FirebaseApp;

    move-result-object v0

    .line 2
    invoke-virtual {v0}, Lcom/google/firebase/FirebaseApp;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    new-instance v1, Landroid/content/Intent;

    const-string v2, "android.intent.action.VIEW"

    .line 3
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    invoke-direct {v1, v2, p1}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    const/high16 p1, 0x10000000

    invoke-virtual {v1, p1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    move-result-object p1

    .line 4
    invoke-virtual {v0, p1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method private static zza(Ljava/lang/String;Landroid/app/Activity;)V
    .locals 2

    if-eqz p1, :cond_0

    .line 5
    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.intent.action.VIEW"

    .line 6
    invoke-static {p0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p0

    invoke-direct {v0, v1, p0}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    const/high16 p0, 0x10000000

    invoke-virtual {v0, p0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    move-result-object p0

    .line 7
    invoke-virtual {p1, p0}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    return-void

    .line 8
    :cond_0
    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "Activity cannot be null."

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public final generateQrCodeUrl()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lcom/google/firebase/auth/internal/zzcd;->zzg:Lcom/google/firebase/auth/FirebaseAuth;

    .line 1
    invoke-virtual {v0}, Lcom/google/firebase/auth/FirebaseAuth;->getCurrentUser()Lcom/google/firebase/auth/FirebaseUser;

    move-result-object v0

    const-string v1, "Current user cannot be null, since user is required to be logged in to enroll for TOTP MFA."

    .line 2
    invoke-static {v0, v1}, Lf6/a;->y(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-virtual {v0}, Lcom/google/firebase/auth/FirebaseUser;->getEmail()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Email cannot be empty, since verified email is required to use MFA."

    .line 4
    invoke-static {v1, v0}, Lf6/a;->v(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Lcom/google/firebase/auth/internal/zzcd;->zzg:Lcom/google/firebase/auth/FirebaseAuth;

    .line 5
    invoke-virtual {v1}, Lcom/google/firebase/auth/FirebaseAuth;->getApp()Lcom/google/firebase/FirebaseApp;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/firebase/FirebaseApp;->getName()Ljava/lang/String;

    move-result-object v1

    .line 6
    invoke-virtual {p0, v0, v1}, Lcom/google/firebase/auth/internal/zzcd;->generateQrCodeUrl(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final generateQrCodeUrl(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 7

    const-string v0, "accountName cannot be empty."

    .line 7
    invoke-static {v0, p1}, Lf6/a;->v(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "issuer cannot be empty."

    .line 8
    invoke-static {v0, p2}, Lf6/a;->v(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v3, p0, Lcom/google/firebase/auth/internal/zzcd;->zza:Ljava/lang/String;

    iget-object v5, p0, Lcom/google/firebase/auth/internal/zzcd;->zzb:Ljava/lang/String;

    iget v0, p0, Lcom/google/firebase/auth/internal/zzcd;->zzc:I

    .line 9
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    move-object v1, p2

    move-object v2, p1

    move-object v4, p2

    filled-new-array/range {v1 .. v6}, [Ljava/lang/Object;

    move-result-object p1

    const/4 p2, 0x0

    const-string v0, "otpauth://totp/%s:%s?secret=%s&issuer=%s&algorithm=%s&digits=%d"

    .line 10
    invoke-static {p2, v0, p1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final getCodeIntervalSeconds()I
    .locals 1

    iget v0, p0, Lcom/google/firebase/auth/internal/zzcd;->zzd:I

    return v0
.end method

.method public final getCodeLength()I
    .locals 1

    iget v0, p0, Lcom/google/firebase/auth/internal/zzcd;->zzc:I

    return v0
.end method

.method public final getEnrollmentCompletionDeadline()J
    .locals 2

    iget-wide v0, p0, Lcom/google/firebase/auth/internal/zzcd;->zze:J

    return-wide v0
.end method

.method public final getHashAlgorithm()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/auth/internal/zzcd;->zzb:Ljava/lang/String;

    return-object v0
.end method

.method public final getSessionInfo()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/auth/internal/zzcd;->zzf:Ljava/lang/String;

    return-object v0
.end method

.method public final getSharedSecretKey()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/auth/internal/zzcd;->zza:Ljava/lang/String;

    return-object v0
.end method

.method public final openInOtpApp(Ljava/lang/String;)V
    .locals 1

    const-string v0, "qrCodeUrl cannot be empty."

    .line 1
    invoke-static {v0, p1}, Lf6/a;->v(Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    :try_start_0
    invoke-direct {p0, p1}, Lcom/google/firebase/auth/internal/zzcd;->zza(Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    const-string p1, "https://play.google.com/store/search?q=otpauth&c=apps"

    .line 3
    invoke-direct {p0, p1}, Lcom/google/firebase/auth/internal/zzcd;->zza(Ljava/lang/String;)V

    return-void
.end method

.method public final openInOtpApp(Ljava/lang/String;Ljava/lang/String;Landroid/app/Activity;)V
    .locals 1

    const-string v0, "QrCodeUrl cannot be empty."

    .line 4
    invoke-static {v0, p1}, Lf6/a;->v(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "FallbackUrl cannot be empty."

    .line 5
    invoke-static {v0, p2}, Lf6/a;->v(Ljava/lang/String;Ljava/lang/String;)V

    if-eqz p3, :cond_0

    .line 6
    :try_start_0
    invoke-static {p1, p3}, Lcom/google/firebase/auth/internal/zzcd;->zza(Ljava/lang/String;Landroid/app/Activity;)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    .line 7
    :catch_0
    invoke-static {p2, p3}, Lcom/google/firebase/auth/internal/zzcd;->zza(Ljava/lang/String;Landroid/app/Activity;)V

    return-void

    .line 8
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "Activity cannot be null."

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
