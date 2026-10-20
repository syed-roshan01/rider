.class public Lcom/google/firebase/auth/zzd;
.super Lcom/google/firebase/auth/OAuthCredential;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/google/firebase/auth/zzd;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final zza:Ljava/lang/String;

.field private final zzb:Ljava/lang/String;

.field private final zzc:Ljava/lang/String;

.field private final zzd:Lcom/google/android/gms/internal/firebase-auth-api/zzags;

.field private final zze:Ljava/lang/String;

.field private final zzf:Ljava/lang/String;

.field private final zzg:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/firebase/auth/zzf;

    invoke-direct {v0}, Lcom/google/firebase/auth/zzf;-><init>()V

    sput-object v0, Lcom/google/firebase/auth/zzd;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/zzags;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/firebase/auth/OAuthCredential;-><init>()V

    invoke-static {p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzah;->zzb(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/google/firebase/auth/zzd;->zza:Ljava/lang/String;

    iput-object p2, p0, Lcom/google/firebase/auth/zzd;->zzb:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/firebase/auth/zzd;->zzc:Ljava/lang/String;

    iput-object p4, p0, Lcom/google/firebase/auth/zzd;->zzd:Lcom/google/android/gms/internal/firebase-auth-api/zzags;

    iput-object p5, p0, Lcom/google/firebase/auth/zzd;->zze:Ljava/lang/String;

    iput-object p6, p0, Lcom/google/firebase/auth/zzd;->zzf:Ljava/lang/String;

    iput-object p7, p0, Lcom/google/firebase/auth/zzd;->zzg:Ljava/lang/String;

    return-void
.end method

.method public static zza(Lcom/google/firebase/auth/zzd;Ljava/lang/String;)Lcom/google/android/gms/internal/firebase-auth-api/zzags;
    .locals 11

    .line 13
    invoke-static {p0}, Lf6/a;->x(Ljava/lang/Object;)V

    .line 14
    iget-object v0, p0, Lcom/google/firebase/auth/zzd;->zzd:Lcom/google/android/gms/internal/firebase-auth-api/zzags;

    if-eqz v0, :cond_0

    return-object v0

    .line 15
    :cond_0
    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/zzags;

    .line 16
    invoke-virtual {p0}, Lcom/google/firebase/auth/zzd;->getIdToken()Ljava/lang/String;

    move-result-object v2

    .line 17
    invoke-virtual {p0}, Lcom/google/firebase/auth/zzd;->getAccessToken()Ljava/lang/String;

    move-result-object v3

    .line 18
    invoke-virtual {p0}, Lcom/google/firebase/auth/zzd;->getProvider()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    .line 19
    invoke-virtual {p0}, Lcom/google/firebase/auth/zzd;->getSecret()Ljava/lang/String;

    move-result-object v6

    const/4 v7, 0x0

    .line 20
    iget-object v9, p0, Lcom/google/firebase/auth/zzd;->zze:Ljava/lang/String;

    .line 21
    iget-object v10, p0, Lcom/google/firebase/auth/zzd;->zzg:Ljava/lang/String;

    move-object v1, v0

    move-object v8, p1

    .line 22
    invoke-direct/range {v1 .. v10}, Lcom/google/android/gms/internal/firebase-auth-api/zzags;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public static zza(Lcom/google/android/gms/internal/firebase-auth-api/zzags;)Lcom/google/firebase/auth/zzd;
    .locals 9

    if-eqz p0, :cond_0

    .line 2
    new-instance v8, Lcom/google/firebase/auth/zzd;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v0, v8

    move-object v4, p0

    invoke-direct/range {v0 .. v7}, Lcom/google/firebase/auth/zzd;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/zzags;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v8

    .line 3
    :cond_0
    new-instance p0, Ljava/lang/NullPointerException;

    const-string v0, "Must specify a non-null webSignInCredential"

    invoke-direct {p0, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static zza(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/google/firebase/auth/zzd;
    .locals 1

    const/4 v0, 0x0

    .line 4
    invoke-static {p0, p1, p2, v0, v0}, Lcom/google/firebase/auth/zzd;->zza(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/google/firebase/auth/zzd;

    move-result-object p0

    return-object p0
.end method

.method public static zza(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/google/firebase/auth/zzd;
    .locals 9

    const-string v0, "Must specify a non-empty providerId"

    .line 9
    invoke-static {v0, p0}, Lf6/a;->v(Ljava/lang/String;Ljava/lang/String;)V

    .line 10
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 11
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Must specify an idToken or an accessToken."

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 12
    :cond_1
    :goto_0
    new-instance v8, Lcom/google/firebase/auth/zzd;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v0, v8

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v7, p3

    invoke-direct/range {v0 .. v7}, Lcom/google/firebase/auth/zzd;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/zzags;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v8
.end method

.method public static zza(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/google/firebase/auth/zzd;
    .locals 9

    const-string v0, "Must specify a non-empty providerId"

    .line 5
    invoke-static {v0, p0}, Lf6/a;->v(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 7
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Must specify an idToken or an accessToken."

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 8
    :cond_1
    :goto_0
    new-instance v8, Lcom/google/firebase/auth/zzd;

    const/4 v4, 0x0

    const/4 v7, 0x0

    move-object v0, v8

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v5, p3

    move-object v6, p4

    invoke-direct/range {v0 .. v7}, Lcom/google/firebase/auth/zzd;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/zzags;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v8
.end method


# virtual methods
.method public getAccessToken()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/auth/zzd;->zzc:Ljava/lang/String;

    return-object v0
.end method

.method public getIdToken()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/auth/zzd;->zzb:Ljava/lang/String;

    return-object v0
.end method

.method public getProvider()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/auth/zzd;->zza:Ljava/lang/String;

    return-object v0
.end method

.method public getSecret()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/auth/zzd;->zzf:Ljava/lang/String;

    return-object v0
.end method

.method public getSignInMethod()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/auth/zzd;->zza:Ljava/lang/String;

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    const/16 v0, 0x4f45

    invoke-static {v0, p1}, Ly3/e;->Y0(ILandroid/os/Parcel;)I

    move-result v0

    const/4 v1, 0x1

    invoke-virtual {p0}, Lcom/google/firebase/auth/zzd;->getProvider()Ljava/lang/String;

    move-result-object v2

    invoke-static {p1, v1, v2}, Ly3/e;->T0(Landroid/os/Parcel;ILjava/lang/String;)V

    const/4 v1, 0x2

    invoke-virtual {p0}, Lcom/google/firebase/auth/zzd;->getIdToken()Ljava/lang/String;

    move-result-object v2

    invoke-static {p1, v1, v2}, Ly3/e;->T0(Landroid/os/Parcel;ILjava/lang/String;)V

    const/4 v1, 0x3

    invoke-virtual {p0}, Lcom/google/firebase/auth/zzd;->getAccessToken()Ljava/lang/String;

    move-result-object v2

    invoke-static {p1, v1, v2}, Ly3/e;->T0(Landroid/os/Parcel;ILjava/lang/String;)V

    const/4 v1, 0x4

    iget-object v2, p0, Lcom/google/firebase/auth/zzd;->zzd:Lcom/google/android/gms/internal/firebase-auth-api/zzags;

    invoke-static {p1, v1, v2, p2}, Ly3/e;->R0(Landroid/os/Parcel;ILandroid/os/Parcelable;I)V

    const/4 p2, 0x5

    iget-object v1, p0, Lcom/google/firebase/auth/zzd;->zze:Ljava/lang/String;

    invoke-static {p1, p2, v1}, Ly3/e;->T0(Landroid/os/Parcel;ILjava/lang/String;)V

    const/4 p2, 0x6

    invoke-virtual {p0}, Lcom/google/firebase/auth/zzd;->getSecret()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, p2, v1}, Ly3/e;->T0(Landroid/os/Parcel;ILjava/lang/String;)V

    const/4 p2, 0x7

    iget-object v1, p0, Lcom/google/firebase/auth/zzd;->zzg:Ljava/lang/String;

    invoke-static {p1, p2, v1}, Ly3/e;->T0(Landroid/os/Parcel;ILjava/lang/String;)V

    invoke-static {v0, p1}, Ly3/e;->d1(ILandroid/os/Parcel;)V

    return-void
.end method

.method public final zza()Lcom/google/firebase/auth/AuthCredential;
    .locals 9

    .line 1
    new-instance v8, Lcom/google/firebase/auth/zzd;

    iget-object v1, p0, Lcom/google/firebase/auth/zzd;->zza:Ljava/lang/String;

    iget-object v2, p0, Lcom/google/firebase/auth/zzd;->zzb:Ljava/lang/String;

    iget-object v3, p0, Lcom/google/firebase/auth/zzd;->zzc:Ljava/lang/String;

    iget-object v4, p0, Lcom/google/firebase/auth/zzd;->zzd:Lcom/google/android/gms/internal/firebase-auth-api/zzags;

    iget-object v5, p0, Lcom/google/firebase/auth/zzd;->zze:Ljava/lang/String;

    iget-object v6, p0, Lcom/google/firebase/auth/zzd;->zzf:Ljava/lang/String;

    iget-object v7, p0, Lcom/google/firebase/auth/zzd;->zzg:Ljava/lang/String;

    move-object v0, v8

    invoke-direct/range {v0 .. v7}, Lcom/google/firebase/auth/zzd;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/zzags;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v8
.end method
