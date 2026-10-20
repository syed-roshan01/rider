.class final Lcom/google/android/gms/internal/firebase-auth-api/zzacs;
.super Lcom/google/android/gms/internal/firebase-auth-api/zzadk;

# interfaces
.implements Lcom/google/android/gms/internal/firebase-auth-api/zzaee;


# instance fields
.field private zza:Lcom/google/android/gms/internal/firebase-auth-api/zzacm;

.field private zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzacp;

.field private zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzadp;

.field private final zzd:Lcom/google/android/gms/internal/firebase-auth-api/zzact;

.field private final zze:Lcom/google/firebase/FirebaseApp;

.field private zzf:Ljava/lang/String;

.field private zzg:Lcom/google/android/gms/internal/firebase-auth-api/zzacv;


# direct methods
.method public constructor <init>(Lcom/google/firebase/FirebaseApp;Lcom/google/android/gms/internal/firebase-auth-api/zzact;)V
    .locals 6

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    .line 1
    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/firebase-auth-api/zzacs;-><init>(Lcom/google/firebase/FirebaseApp;Lcom/google/android/gms/internal/firebase-auth-api/zzact;Lcom/google/android/gms/internal/firebase-auth-api/zzadp;Lcom/google/android/gms/internal/firebase-auth-api/zzacm;Lcom/google/android/gms/internal/firebase-auth-api/zzacp;)V

    return-void
.end method

.method private constructor <init>(Lcom/google/firebase/FirebaseApp;Lcom/google/android/gms/internal/firebase-auth-api/zzact;Lcom/google/android/gms/internal/firebase-auth-api/zzadp;Lcom/google/android/gms/internal/firebase-auth-api/zzacm;Lcom/google/android/gms/internal/firebase-auth-api/zzacp;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lcom/google/android/gms/internal/firebase-auth-api/zzadk;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzacs;->zze:Lcom/google/firebase/FirebaseApp;

    .line 3
    invoke-virtual {p1}, Lcom/google/firebase/FirebaseApp;->getOptions()Lcom/google/firebase/FirebaseOptions;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/firebase/FirebaseOptions;->getApiKey()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzacs;->zzf:Ljava/lang/String;

    if-eqz p2, :cond_0

    iput-object p2, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzacs;->zzd:Lcom/google/android/gms/internal/firebase-auth-api/zzact;

    const/4 p1, 0x0

    .line 4
    invoke-direct {p0, p1, p1, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzacs;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzadp;Lcom/google/android/gms/internal/firebase-auth-api/zzacm;Lcom/google/android/gms/internal/firebase-auth-api/zzacp;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzacs;->zzf:Ljava/lang/String;

    .line 5
    invoke-static {p1, p0}, Lcom/google/android/gms/internal/firebase-auth-api/zzaec;->zza(Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/zzaee;)V

    return-void

    .line 6
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "null reference"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private final zza(Lcom/google/android/gms/internal/firebase-auth-api/zzadp;Lcom/google/android/gms/internal/firebase-auth-api/zzacm;Lcom/google/android/gms/internal/firebase-auth-api/zzacp;)V
    .locals 1

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzacs;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzadp;

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzacs;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzacm;

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzacs;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzacp;

    const-string p1, "firebear.secureToken"

    .line 85
    invoke-static {p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzadz;->zza(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 86
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p2

    const-string p3, "LocalClient"

    if-eqz p2, :cond_0

    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzacs;->zzf:Ljava/lang/String;

    .line 87
    invoke-static {p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzaec;->zzd(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    const-string p2, "Found hermetic configuration for secureToken URL: "

    .line 88
    invoke-static {p2, p1, p3}, La7/a;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    iget-object p2, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzacs;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzadp;

    if-nez p2, :cond_1

    .line 89
    new-instance p2, Lcom/google/android/gms/internal/firebase-auth-api/zzadp;

    .line 90
    invoke-direct {p0}, Lcom/google/android/gms/internal/firebase-auth-api/zzacs;->zzb()Lcom/google/android/gms/internal/firebase-auth-api/zzacv;

    move-result-object v0

    invoke-direct {p2, p1, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzadp;-><init>(Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/zzacv;)V

    iput-object p2, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzacs;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzadp;

    :cond_1
    const-string p1, "firebear.identityToolkit"

    .line 91
    invoke-static {p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzadz;->zza(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 92
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p2

    if-eqz p2, :cond_2

    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzacs;->zzf:Ljava/lang/String;

    .line 93
    invoke-static {p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzaec;->zzb(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    goto :goto_1

    :cond_2
    const-string p2, "Found hermetic configuration for identityToolkit URL: "

    .line 94
    invoke-static {p2, p1, p3}, La7/a;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :goto_1
    iget-object p2, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzacs;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzacm;

    if-nez p2, :cond_3

    .line 95
    new-instance p2, Lcom/google/android/gms/internal/firebase-auth-api/zzacm;

    .line 96
    invoke-direct {p0}, Lcom/google/android/gms/internal/firebase-auth-api/zzacs;->zzb()Lcom/google/android/gms/internal/firebase-auth-api/zzacv;

    move-result-object v0

    invoke-direct {p2, p1, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzacm;-><init>(Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/zzacv;)V

    iput-object p2, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzacs;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzacm;

    :cond_3
    const-string p1, "firebear.identityToolkitV2"

    .line 97
    invoke-static {p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzadz;->zza(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 98
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p2

    if-eqz p2, :cond_4

    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzacs;->zzf:Ljava/lang/String;

    .line 99
    invoke-static {p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzaec;->zzc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    goto :goto_2

    :cond_4
    const-string p2, "Found hermetic configuration for identityToolkitV2 URL: "

    .line 100
    invoke-static {p2, p1, p3}, La7/a;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :goto_2
    iget-object p2, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzacs;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzacp;

    if-nez p2, :cond_5

    .line 101
    new-instance p2, Lcom/google/android/gms/internal/firebase-auth-api/zzacp;

    .line 102
    invoke-direct {p0}, Lcom/google/android/gms/internal/firebase-auth-api/zzacs;->zzb()Lcom/google/android/gms/internal/firebase-auth-api/zzacv;

    move-result-object p3

    invoke-direct {p2, p1, p3}, Lcom/google/android/gms/internal/firebase-auth-api/zzacp;-><init>(Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/zzacv;)V

    iput-object p2, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzacs;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzacp;

    :cond_5
    return-void
.end method

.method private final zzb()Lcom/google/android/gms/internal/firebase-auth-api/zzacv;
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzacs;->zzg:Lcom/google/android/gms/internal/firebase-auth-api/zzacv;

    if-nez v0, :cond_0

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/zzacv;

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzacs;->zze:Lcom/google/firebase/FirebaseApp;

    iget-object v2, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzacs;->zzd:Lcom/google/android/gms/internal/firebase-auth-api/zzact;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzact;->zzb()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzacv;-><init>(Lcom/google/firebase/FirebaseApp;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzacs;->zzg:Lcom/google/android/gms/internal/firebase-auth-api/zzacv;

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzacs;->zzg:Lcom/google/android/gms/internal/firebase-auth-api/zzacv;

    return-object v0
.end method


# virtual methods
.method public final zza()V
    .locals 1

    const/4 v0, 0x0

    .line 45
    invoke-direct {p0, v0, v0, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzacs;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzadp;Lcom/google/android/gms/internal/firebase-auth-api/zzacm;Lcom/google/android/gms/internal/firebase-auth-api/zzacp;)V

    return-void
.end method

.method public final zza(Lcom/google/android/gms/internal/firebase-auth-api/zzaej;Lcom/google/android/gms/internal/firebase-auth-api/zzadm;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzaej;",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzadm<",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzaem;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-static {p1}, Lf6/a;->x(Ljava/lang/Object;)V

    .line 2
    invoke-static {p2}, Lf6/a;->x(Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzacs;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzacm;

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzacs;->zzf:Ljava/lang/String;

    const-string v2, "/createAuthUri"

    .line 3
    invoke-virtual {v0, v2, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzacn;->zza(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-class v2, Lcom/google/android/gms/internal/firebase-auth-api/zzaem;

    .line 4
    iget-object v0, v0, Lcom/google/android/gms/internal/firebase-auth-api/zzacn;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzacv;

    invoke-static {v1, p1, p2, v2, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzadl;->zza(Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/zzacr;Lcom/google/android/gms/internal/firebase-auth-api/zzadm;Ljava/lang/reflect/Type;Lcom/google/android/gms/internal/firebase-auth-api/zzacv;)V

    return-void
.end method

.method public final zza(Lcom/google/android/gms/internal/firebase-auth-api/zzael;Lcom/google/android/gms/internal/firebase-auth-api/zzadm;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzael;",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzadm<",
            "Ljava/lang/Void;",
            ">;)V"
        }
    .end annotation

    .line 5
    invoke-static {p1}, Lf6/a;->x(Ljava/lang/Object;)V

    .line 6
    invoke-static {p2}, Lf6/a;->x(Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzacs;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzacm;

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzacs;->zzf:Ljava/lang/String;

    const-string v2, "/deleteAccount"

    .line 7
    invoke-virtual {v0, v2, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzacn;->zza(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-class v2, Ljava/lang/Void;

    .line 8
    iget-object v0, v0, Lcom/google/android/gms/internal/firebase-auth-api/zzacn;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzacv;

    invoke-static {v1, p1, p2, v2, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzadl;->zza(Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/zzacr;Lcom/google/android/gms/internal/firebase-auth-api/zzadm;Ljava/lang/reflect/Type;Lcom/google/android/gms/internal/firebase-auth-api/zzacv;)V

    return-void
.end method

.method public final zza(Lcom/google/android/gms/internal/firebase-auth-api/zzaeo;Lcom/google/android/gms/internal/firebase-auth-api/zzadm;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzaeo;",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzadm<",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzaen;",
            ">;)V"
        }
    .end annotation

    .line 9
    invoke-static {p1}, Lf6/a;->x(Ljava/lang/Object;)V

    .line 10
    invoke-static {p2}, Lf6/a;->x(Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzacs;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzacm;

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzacs;->zzf:Ljava/lang/String;

    const-string v2, "/emailLinkSignin"

    .line 11
    invoke-virtual {v0, v2, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzacn;->zza(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-class v2, Lcom/google/android/gms/internal/firebase-auth-api/zzaen;

    .line 12
    iget-object v0, v0, Lcom/google/android/gms/internal/firebase-auth-api/zzacn;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzacv;

    invoke-static {v1, p1, p2, v2, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzadl;->zza(Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/zzacr;Lcom/google/android/gms/internal/firebase-auth-api/zzadm;Ljava/lang/reflect/Type;Lcom/google/android/gms/internal/firebase-auth-api/zzacv;)V

    return-void
.end method

.method public final zza(Lcom/google/android/gms/internal/firebase-auth-api/zzaeq;Lcom/google/android/gms/internal/firebase-auth-api/zzadm;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzaeq;",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzadm<",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzaep;",
            ">;)V"
        }
    .end annotation

    .line 13
    invoke-static {p1}, Lf6/a;->x(Ljava/lang/Object;)V

    .line 14
    invoke-static {p2}, Lf6/a;->x(Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzacs;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzacp;

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzacs;->zzf:Ljava/lang/String;

    const-string v2, "/accounts/mfaEnrollment:finalize"

    .line 15
    invoke-virtual {v0, v2, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzacn;->zza(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-class v2, Lcom/google/android/gms/internal/firebase-auth-api/zzaep;

    .line 16
    iget-object v0, v0, Lcom/google/android/gms/internal/firebase-auth-api/zzacn;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzacv;

    invoke-static {v1, p1, p2, v2, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzadl;->zza(Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/zzacr;Lcom/google/android/gms/internal/firebase-auth-api/zzadm;Ljava/lang/reflect/Type;Lcom/google/android/gms/internal/firebase-auth-api/zzacv;)V

    return-void
.end method

.method public final zza(Lcom/google/android/gms/internal/firebase-auth-api/zzaes;Lcom/google/android/gms/internal/firebase-auth-api/zzadm;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzaes;",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzadm<",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzaer;",
            ">;)V"
        }
    .end annotation

    .line 17
    invoke-static {p1}, Lf6/a;->x(Ljava/lang/Object;)V

    .line 18
    invoke-static {p2}, Lf6/a;->x(Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzacs;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzacp;

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzacs;->zzf:Ljava/lang/String;

    const-string v2, "/accounts/mfaSignIn:finalize"

    .line 19
    invoke-virtual {v0, v2, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzacn;->zza(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-class v2, Lcom/google/android/gms/internal/firebase-auth-api/zzaer;

    .line 20
    iget-object v0, v0, Lcom/google/android/gms/internal/firebase-auth-api/zzacn;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzacv;

    invoke-static {v1, p1, p2, v2, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzadl;->zza(Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/zzacr;Lcom/google/android/gms/internal/firebase-auth-api/zzadm;Ljava/lang/reflect/Type;Lcom/google/android/gms/internal/firebase-auth-api/zzacv;)V

    return-void
.end method

.method public final zza(Lcom/google/android/gms/internal/firebase-auth-api/zzaez;Lcom/google/android/gms/internal/firebase-auth-api/zzadm;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzaez;",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzadm<",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzafc;",
            ">;)V"
        }
    .end annotation

    .line 25
    invoke-static {p1}, Lf6/a;->x(Ljava/lang/Object;)V

    .line 26
    invoke-static {p2}, Lf6/a;->x(Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzacs;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzacm;

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzacs;->zzf:Ljava/lang/String;

    const-string v2, "/getAccountInfo"

    .line 27
    invoke-virtual {v0, v2, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzacn;->zza(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-class v2, Lcom/google/android/gms/internal/firebase-auth-api/zzafc;

    .line 28
    iget-object v0, v0, Lcom/google/android/gms/internal/firebase-auth-api/zzacn;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzacv;

    invoke-static {v1, p1, p2, v2, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzadl;->zza(Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/zzacr;Lcom/google/android/gms/internal/firebase-auth-api/zzadm;Ljava/lang/reflect/Type;Lcom/google/android/gms/internal/firebase-auth-api/zzacv;)V

    return-void
.end method

.method public final zza(Lcom/google/android/gms/internal/firebase-auth-api/zzafa;Lcom/google/android/gms/internal/firebase-auth-api/zzadm;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzafa;",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzadm<",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzafm;",
            ">;)V"
        }
    .end annotation

    .line 21
    invoke-static {p1}, Lf6/a;->x(Ljava/lang/Object;)V

    .line 22
    invoke-static {p2}, Lf6/a;->x(Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzacs;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzadp;

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzacs;->zzf:Ljava/lang/String;

    const-string v2, "/token"

    .line 23
    invoke-virtual {v0, v2, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzacn;->zza(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-class v2, Lcom/google/android/gms/internal/firebase-auth-api/zzafm;

    .line 24
    iget-object v0, v0, Lcom/google/android/gms/internal/firebase-auth-api/zzacn;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzacv;

    invoke-static {v1, p1, p2, v2, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzadl;->zza(Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/zzacr;Lcom/google/android/gms/internal/firebase-auth-api/zzadm;Ljava/lang/reflect/Type;Lcom/google/android/gms/internal/firebase-auth-api/zzacv;)V

    return-void
.end method

.method public final zza(Lcom/google/android/gms/internal/firebase-auth-api/zzafd;Lcom/google/android/gms/internal/firebase-auth-api/zzadm;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzafd;",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzadm<",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzafg;",
            ">;)V"
        }
    .end annotation

    .line 29
    invoke-static {p1}, Lf6/a;->x(Ljava/lang/Object;)V

    .line 30
    invoke-static {p2}, Lf6/a;->x(Ljava/lang/Object;)V

    .line 31
    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzafd;->zzb()Lcom/google/firebase/auth/ActionCodeSettings;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 32
    invoke-direct {p0}, Lcom/google/android/gms/internal/firebase-auth-api/zzacs;->zzb()Lcom/google/android/gms/internal/firebase-auth-api/zzacv;

    move-result-object v0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzafd;->zzb()Lcom/google/firebase/auth/ActionCodeSettings;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/firebase/auth/ActionCodeSettings;->zze()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzacv;->zzb(Ljava/lang/String;)V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzacs;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzacm;

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzacs;->zzf:Ljava/lang/String;

    const-string v2, "/getOobConfirmationCode"

    .line 33
    invoke-virtual {v0, v2, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzacn;->zza(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-class v2, Lcom/google/android/gms/internal/firebase-auth-api/zzafg;

    .line 34
    iget-object v0, v0, Lcom/google/android/gms/internal/firebase-auth-api/zzacn;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzacv;

    invoke-static {v1, p1, p2, v2, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzadl;->zza(Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/zzacr;Lcom/google/android/gms/internal/firebase-auth-api/zzadm;Ljava/lang/reflect/Type;Lcom/google/android/gms/internal/firebase-auth-api/zzacv;)V

    return-void
.end method

.method public final zza(Lcom/google/android/gms/internal/firebase-auth-api/zzaff;Lcom/google/android/gms/internal/firebase-auth-api/zzadm;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzaff;",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzadm<",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzafi;",
            ">;)V"
        }
    .end annotation

    .line 35
    invoke-static {p1}, Lf6/a;->x(Ljava/lang/Object;)V

    .line 36
    invoke-static {p2}, Lf6/a;->x(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzacs;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzacm;

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzacs;->zzf:Ljava/lang/String;

    const-string v1, "/getRecaptchaParam"

    .line 37
    invoke-virtual {p1, v1, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzacn;->zza(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-class v1, Lcom/google/android/gms/internal/firebase-auth-api/zzafi;

    .line 38
    iget-object p1, p1, Lcom/google/android/gms/internal/firebase-auth-api/zzacn;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzacv;

    invoke-static {v0, p2, v1, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzadl;->zza(Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/zzadm;Ljava/lang/reflect/Type;Lcom/google/android/gms/internal/firebase-auth-api/zzacv;)V

    return-void
.end method

.method public final zza(Lcom/google/android/gms/internal/firebase-auth-api/zzafk;Lcom/google/android/gms/internal/firebase-auth-api/zzadm;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzafk;",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzadm<",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzafj;",
            ">;)V"
        }
    .end annotation

    .line 39
    invoke-static {p1}, Lf6/a;->x(Ljava/lang/Object;)V

    .line 40
    invoke-static {p2}, Lf6/a;->x(Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzacs;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzacp;

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzacs;->zzf:Ljava/lang/String;

    const-string v2, "/recaptchaConfig"

    .line 41
    invoke-virtual {v0, v2, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzacn;->zza(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 42
    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzafk;->zzb()Ljava/lang/String;

    move-result-object v2

    .line 43
    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzafk;->zzc()Ljava/lang/String;

    move-result-object p1

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "&clientType="

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "&version="

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-class v1, Lcom/google/android/gms/internal/firebase-auth-api/zzafj;

    .line 44
    iget-object v0, v0, Lcom/google/android/gms/internal/firebase-auth-api/zzacn;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzacv;

    invoke-static {p1, p2, v1, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzadl;->zza(Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/zzadm;Ljava/lang/reflect/Type;Lcom/google/android/gms/internal/firebase-auth-api/zzacv;)V

    return-void
.end method

.method public final zza(Lcom/google/android/gms/internal/firebase-auth-api/zzafw;Lcom/google/android/gms/internal/firebase-auth-api/zzadm;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzafw;",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzadm<",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzafv;",
            ">;)V"
        }
    .end annotation

    .line 46
    invoke-static {p1}, Lf6/a;->x(Ljava/lang/Object;)V

    .line 47
    invoke-static {p2}, Lf6/a;->x(Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzacs;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzacm;

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzacs;->zzf:Ljava/lang/String;

    const-string v2, "/resetPassword"

    .line 48
    invoke-virtual {v0, v2, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzacn;->zza(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-class v2, Lcom/google/android/gms/internal/firebase-auth-api/zzafv;

    .line 49
    iget-object v0, v0, Lcom/google/android/gms/internal/firebase-auth-api/zzacn;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzacv;

    invoke-static {v1, p1, p2, v2, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzadl;->zza(Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/zzacr;Lcom/google/android/gms/internal/firebase-auth-api/zzadm;Ljava/lang/reflect/Type;Lcom/google/android/gms/internal/firebase-auth-api/zzacv;)V

    return-void
.end method

.method public final zza(Lcom/google/android/gms/internal/firebase-auth-api/zzafy;Lcom/google/android/gms/internal/firebase-auth-api/zzadm;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzafy;",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzadm<",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzaga;",
            ">;)V"
        }
    .end annotation

    .line 50
    invoke-static {p1}, Lf6/a;->x(Ljava/lang/Object;)V

    .line 51
    invoke-static {p2}, Lf6/a;->x(Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzacs;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzacp;

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzacs;->zzf:Ljava/lang/String;

    const-string v2, "/accounts:revokeToken"

    .line 52
    invoke-virtual {v0, v2, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzacn;->zza(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-class v2, Lcom/google/android/gms/internal/firebase-auth-api/zzaga;

    .line 53
    iget-object v0, v0, Lcom/google/android/gms/internal/firebase-auth-api/zzacn;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzacv;

    invoke-static {v1, p1, p2, v2, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzadl;->zza(Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/zzacr;Lcom/google/android/gms/internal/firebase-auth-api/zzadm;Ljava/lang/reflect/Type;Lcom/google/android/gms/internal/firebase-auth-api/zzacv;)V

    return-void
.end method

.method public final zza(Lcom/google/android/gms/internal/firebase-auth-api/zzafz;Lcom/google/android/gms/internal/firebase-auth-api/zzadm;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzafz;",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzadm<",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzagc;",
            ">;)V"
        }
    .end annotation

    .line 54
    invoke-static {p1}, Lf6/a;->x(Ljava/lang/Object;)V

    .line 55
    invoke-static {p2}, Lf6/a;->x(Ljava/lang/Object;)V

    .line 56
    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzafz;->zzc()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 57
    invoke-direct {p0}, Lcom/google/android/gms/internal/firebase-auth-api/zzacs;->zzb()Lcom/google/android/gms/internal/firebase-auth-api/zzacv;

    move-result-object v0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzafz;->zzc()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzacv;->zzb(Ljava/lang/String;)V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzacs;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzacm;

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzacs;->zzf:Ljava/lang/String;

    const-string v2, "/sendVerificationCode"

    .line 58
    invoke-virtual {v0, v2, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzacn;->zza(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-class v2, Lcom/google/android/gms/internal/firebase-auth-api/zzagc;

    .line 59
    iget-object v0, v0, Lcom/google/android/gms/internal/firebase-auth-api/zzacn;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzacv;

    invoke-static {v1, p1, p2, v2, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzadl;->zza(Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/zzacr;Lcom/google/android/gms/internal/firebase-auth-api/zzadm;Ljava/lang/reflect/Type;Lcom/google/android/gms/internal/firebase-auth-api/zzacv;)V

    return-void
.end method

.method public final zza(Lcom/google/android/gms/internal/firebase-auth-api/zzagb;Lcom/google/android/gms/internal/firebase-auth-api/zzadm;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzagb;",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzadm<",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzage;",
            ">;)V"
        }
    .end annotation

    .line 60
    invoke-static {p1}, Lf6/a;->x(Ljava/lang/Object;)V

    .line 61
    invoke-static {p2}, Lf6/a;->x(Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzacs;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzacm;

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzacs;->zzf:Ljava/lang/String;

    const-string v2, "/setAccountInfo"

    .line 62
    invoke-virtual {v0, v2, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzacn;->zza(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-class v2, Lcom/google/android/gms/internal/firebase-auth-api/zzage;

    .line 63
    iget-object v0, v0, Lcom/google/android/gms/internal/firebase-auth-api/zzacn;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzacv;

    invoke-static {v1, p1, p2, v2, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzadl;->zza(Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/zzacr;Lcom/google/android/gms/internal/firebase-auth-api/zzadm;Ljava/lang/reflect/Type;Lcom/google/android/gms/internal/firebase-auth-api/zzacv;)V

    return-void
.end method

.method public final zza(Lcom/google/android/gms/internal/firebase-auth-api/zzagd;Lcom/google/android/gms/internal/firebase-auth-api/zzadm;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzagd;",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzadm<",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzagg;",
            ">;)V"
        }
    .end annotation

    .line 67
    invoke-static {p1}, Lf6/a;->x(Ljava/lang/Object;)V

    .line 68
    invoke-static {p2}, Lf6/a;->x(Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzacs;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzacm;

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzacs;->zzf:Ljava/lang/String;

    const-string v2, "/signupNewUser"

    .line 69
    invoke-virtual {v0, v2, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzacn;->zza(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-class v2, Lcom/google/android/gms/internal/firebase-auth-api/zzagg;

    .line 70
    iget-object v0, v0, Lcom/google/android/gms/internal/firebase-auth-api/zzacn;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzacv;

    invoke-static {v1, p1, p2, v2, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzadl;->zza(Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/zzacr;Lcom/google/android/gms/internal/firebase-auth-api/zzadm;Ljava/lang/reflect/Type;Lcom/google/android/gms/internal/firebase-auth-api/zzacv;)V

    return-void
.end method

.method public final zza(Lcom/google/android/gms/internal/firebase-auth-api/zzagf;Lcom/google/android/gms/internal/firebase-auth-api/zzadm;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzagf;",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzadm<",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzagi;",
            ">;)V"
        }
    .end annotation

    .line 71
    invoke-static {p1}, Lf6/a;->x(Ljava/lang/Object;)V

    .line 72
    invoke-static {p2}, Lf6/a;->x(Ljava/lang/Object;)V

    .line 73
    instance-of v0, p1, Lcom/google/android/gms/internal/firebase-auth-api/zzagj;

    if-eqz v0, :cond_0

    .line 74
    move-object v0, p1

    check-cast v0, Lcom/google/android/gms/internal/firebase-auth-api/zzagj;

    .line 75
    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzagj;->zzb()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 76
    invoke-direct {p0}, Lcom/google/android/gms/internal/firebase-auth-api/zzacs;->zzb()Lcom/google/android/gms/internal/firebase-auth-api/zzacv;

    move-result-object v1

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzagj;->zzb()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzacv;->zzb(Ljava/lang/String;)V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzacs;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzacp;

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzacs;->zzf:Ljava/lang/String;

    const-string v2, "/accounts/mfaEnrollment:start"

    .line 77
    invoke-virtual {v0, v2, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzacn;->zza(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-class v2, Lcom/google/android/gms/internal/firebase-auth-api/zzagi;

    .line 78
    iget-object v0, v0, Lcom/google/android/gms/internal/firebase-auth-api/zzacn;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzacv;

    invoke-static {v1, p1, p2, v2, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzadl;->zza(Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/zzacr;Lcom/google/android/gms/internal/firebase-auth-api/zzadm;Ljava/lang/reflect/Type;Lcom/google/android/gms/internal/firebase-auth-api/zzacv;)V

    return-void
.end method

.method public final zza(Lcom/google/android/gms/internal/firebase-auth-api/zzagh;Lcom/google/android/gms/internal/firebase-auth-api/zzadm;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzagh;",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzadm<",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzagk;",
            ">;)V"
        }
    .end annotation

    .line 79
    invoke-static {p1}, Lf6/a;->x(Ljava/lang/Object;)V

    .line 80
    invoke-static {p2}, Lf6/a;->x(Ljava/lang/Object;)V

    .line 81
    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzagh;->zzb()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 82
    invoke-direct {p0}, Lcom/google/android/gms/internal/firebase-auth-api/zzacs;->zzb()Lcom/google/android/gms/internal/firebase-auth-api/zzacv;

    move-result-object v0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzagh;->zzb()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzacv;->zzb(Ljava/lang/String;)V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzacs;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzacp;

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzacs;->zzf:Ljava/lang/String;

    const-string v2, "/accounts/mfaSignIn:start"

    .line 83
    invoke-virtual {v0, v2, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzacn;->zza(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-class v2, Lcom/google/android/gms/internal/firebase-auth-api/zzagk;

    .line 84
    iget-object v0, v0, Lcom/google/android/gms/internal/firebase-auth-api/zzacn;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzacv;

    invoke-static {v1, p1, p2, v2, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzadl;->zza(Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/zzacr;Lcom/google/android/gms/internal/firebase-auth-api/zzadm;Ljava/lang/reflect/Type;Lcom/google/android/gms/internal/firebase-auth-api/zzacv;)V

    return-void
.end method

.method public final zza(Lcom/google/android/gms/internal/firebase-auth-api/zzags;Lcom/google/android/gms/internal/firebase-auth-api/zzadm;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzags;",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzadm<",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzagu;",
            ">;)V"
        }
    .end annotation

    .line 118
    invoke-static {p1}, Lf6/a;->x(Ljava/lang/Object;)V

    .line 119
    invoke-static {p2}, Lf6/a;->x(Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzacs;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzacm;

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzacs;->zzf:Ljava/lang/String;

    const-string v2, "/verifyAssertion"

    .line 120
    invoke-virtual {v0, v2, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzacn;->zza(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-class v2, Lcom/google/android/gms/internal/firebase-auth-api/zzagu;

    .line 121
    iget-object v0, v0, Lcom/google/android/gms/internal/firebase-auth-api/zzacn;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzacv;

    invoke-static {v1, p1, p2, v2, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzadl;->zza(Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/zzacr;Lcom/google/android/gms/internal/firebase-auth-api/zzadm;Ljava/lang/reflect/Type;Lcom/google/android/gms/internal/firebase-auth-api/zzacv;)V

    return-void
.end method

.method public final zza(Lcom/google/android/gms/internal/firebase-auth-api/zzagt;Lcom/google/android/gms/internal/firebase-auth-api/zzadm;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzagt;",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzadm<",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzagw;",
            ">;)V"
        }
    .end annotation

    .line 122
    invoke-static {p1}, Lf6/a;->x(Ljava/lang/Object;)V

    .line 123
    invoke-static {p2}, Lf6/a;->x(Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzacs;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzacm;

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzacs;->zzf:Ljava/lang/String;

    const-string v2, "/verifyCustomToken"

    .line 124
    invoke-virtual {v0, v2, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzacn;->zza(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-class v2, Lcom/google/android/gms/internal/firebase-auth-api/zzagw;

    .line 125
    iget-object v0, v0, Lcom/google/android/gms/internal/firebase-auth-api/zzacn;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzacv;

    invoke-static {v1, p1, p2, v2, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzadl;->zza(Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/zzacr;Lcom/google/android/gms/internal/firebase-auth-api/zzadm;Ljava/lang/reflect/Type;Lcom/google/android/gms/internal/firebase-auth-api/zzacv;)V

    return-void
.end method

.method public final zza(Lcom/google/android/gms/internal/firebase-auth-api/zzagv;Lcom/google/android/gms/internal/firebase-auth-api/zzadm;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzagv;",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzadm<",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzagy;",
            ">;)V"
        }
    .end annotation

    .line 126
    invoke-static {p1}, Lf6/a;->x(Ljava/lang/Object;)V

    .line 127
    invoke-static {p2}, Lf6/a;->x(Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzacs;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzacm;

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzacs;->zzf:Ljava/lang/String;

    const-string v2, "/verifyPassword"

    .line 128
    invoke-virtual {v0, v2, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzacn;->zza(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-class v2, Lcom/google/android/gms/internal/firebase-auth-api/zzagy;

    .line 129
    iget-object v0, v0, Lcom/google/android/gms/internal/firebase-auth-api/zzacn;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzacv;

    invoke-static {v1, p1, p2, v2, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzadl;->zza(Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/zzacr;Lcom/google/android/gms/internal/firebase-auth-api/zzadm;Ljava/lang/reflect/Type;Lcom/google/android/gms/internal/firebase-auth-api/zzacv;)V

    return-void
.end method

.method public final zza(Lcom/google/android/gms/internal/firebase-auth-api/zzagx;Lcom/google/android/gms/internal/firebase-auth-api/zzadm;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzagx;",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzadm<",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzaha;",
            ">;)V"
        }
    .end annotation

    .line 130
    invoke-static {p1}, Lf6/a;->x(Ljava/lang/Object;)V

    .line 131
    invoke-static {p2}, Lf6/a;->x(Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzacs;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzacm;

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzacs;->zzf:Ljava/lang/String;

    const-string v2, "/verifyPhoneNumber"

    .line 132
    invoke-virtual {v0, v2, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzacn;->zza(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-class v2, Lcom/google/android/gms/internal/firebase-auth-api/zzaha;

    .line 133
    iget-object v0, v0, Lcom/google/android/gms/internal/firebase-auth-api/zzacn;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzacv;

    invoke-static {v1, p1, p2, v2, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzadl;->zza(Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/zzacr;Lcom/google/android/gms/internal/firebase-auth-api/zzadm;Ljava/lang/reflect/Type;Lcom/google/android/gms/internal/firebase-auth-api/zzacv;)V

    return-void
.end method

.method public final zza(Lcom/google/android/gms/internal/firebase-auth-api/zzagz;Lcom/google/android/gms/internal/firebase-auth-api/zzadm;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzagz;",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzadm<",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzahc;",
            ">;)V"
        }
    .end annotation

    .line 134
    invoke-static {p1}, Lf6/a;->x(Ljava/lang/Object;)V

    .line 135
    invoke-static {p2}, Lf6/a;->x(Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzacs;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzacp;

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzacs;->zzf:Ljava/lang/String;

    const-string v2, "/accounts/mfaEnrollment:withdraw"

    .line 136
    invoke-virtual {v0, v2, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzacn;->zza(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-class v2, Lcom/google/android/gms/internal/firebase-auth-api/zzahc;

    .line 137
    iget-object v0, v0, Lcom/google/android/gms/internal/firebase-auth-api/zzacn;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzacv;

    invoke-static {v1, p1, p2, v2, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzadl;->zza(Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/zzacr;Lcom/google/android/gms/internal/firebase-auth-api/zzadm;Ljava/lang/reflect/Type;Lcom/google/android/gms/internal/firebase-auth-api/zzacv;)V

    return-void
.end method

.method public final zza(Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/zzadm;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzadm<",
            "Ljava/lang/Void;",
            ">;)V"
        }
    .end annotation

    .line 64
    invoke-static {p2}, Lf6/a;->x(Ljava/lang/Object;)V

    .line 65
    invoke-direct {p0}, Lcom/google/android/gms/internal/firebase-auth-api/zzacs;->zzb()Lcom/google/android/gms/internal/firebase-auth-api/zzacv;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzacv;->zza(Ljava/lang/String;)V

    const/4 p1, 0x0

    .line 66
    invoke-interface {p2, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzadm;->zza(Ljava/lang/Object;)V

    return-void
.end method
