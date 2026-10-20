.class public Lcom/google/firebase/auth/internal/zzaf;
.super Lcom/google/firebase/auth/FirebaseUser;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/google/firebase/auth/internal/zzaf;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private zza:Lcom/google/android/gms/internal/firebase-auth-api/zzafm;

.field private zzb:Lcom/google/firebase/auth/internal/zzab;

.field private zzc:Ljava/lang/String;

.field private zzd:Ljava/lang/String;

.field private zze:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/google/firebase/auth/internal/zzab;",
            ">;"
        }
    .end annotation
.end field

.field private zzf:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private zzg:Ljava/lang/String;

.field private zzh:Ljava/lang/Boolean;

.field private zzi:Lcom/google/firebase/auth/internal/zzah;

.field private zzj:Z

.field private zzk:Lcom/google/firebase/auth/zzd;

.field private zzl:Lcom/google/firebase/auth/internal/zzbj;

.field private zzm:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzafp;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/firebase/auth/internal/zzae;

    invoke-direct {v0}, Lcom/google/firebase/auth/internal/zzae;-><init>()V

    sput-object v0, Lcom/google/firebase/auth/internal/zzaf;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/internal/firebase-auth-api/zzafm;Lcom/google/firebase/auth/internal/zzab;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Lcom/google/firebase/auth/internal/zzah;ZLcom/google/firebase/auth/zzd;Lcom/google/firebase/auth/internal/zzbj;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzafm;",
            "Lcom/google/firebase/auth/internal/zzab;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/google/firebase/auth/internal/zzab;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            "Lcom/google/firebase/auth/internal/zzah;",
            "Z",
            "Lcom/google/firebase/auth/zzd;",
            "Lcom/google/firebase/auth/internal/zzbj;",
            "Ljava/util/List<",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzafp;",
            ">;)V"
        }
    .end annotation

    .line 5
    invoke-direct {p0}, Lcom/google/firebase/auth/FirebaseUser;-><init>()V

    iput-object p1, p0, Lcom/google/firebase/auth/internal/zzaf;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzafm;

    iput-object p2, p0, Lcom/google/firebase/auth/internal/zzaf;->zzb:Lcom/google/firebase/auth/internal/zzab;

    iput-object p3, p0, Lcom/google/firebase/auth/internal/zzaf;->zzc:Ljava/lang/String;

    iput-object p4, p0, Lcom/google/firebase/auth/internal/zzaf;->zzd:Ljava/lang/String;

    iput-object p5, p0, Lcom/google/firebase/auth/internal/zzaf;->zze:Ljava/util/List;

    iput-object p6, p0, Lcom/google/firebase/auth/internal/zzaf;->zzf:Ljava/util/List;

    iput-object p7, p0, Lcom/google/firebase/auth/internal/zzaf;->zzg:Ljava/lang/String;

    iput-object p8, p0, Lcom/google/firebase/auth/internal/zzaf;->zzh:Ljava/lang/Boolean;

    iput-object p9, p0, Lcom/google/firebase/auth/internal/zzaf;->zzi:Lcom/google/firebase/auth/internal/zzah;

    iput-boolean p10, p0, Lcom/google/firebase/auth/internal/zzaf;->zzj:Z

    iput-object p11, p0, Lcom/google/firebase/auth/internal/zzaf;->zzk:Lcom/google/firebase/auth/zzd;

    iput-object p12, p0, Lcom/google/firebase/auth/internal/zzaf;->zzl:Lcom/google/firebase/auth/internal/zzbj;

    iput-object p13, p0, Lcom/google/firebase/auth/internal/zzaf;->zzm:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Lcom/google/firebase/FirebaseApp;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/firebase/FirebaseApp;",
            "Ljava/util/List<",
            "+",
            "Lcom/google/firebase/auth/UserInfo;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lcom/google/firebase/auth/FirebaseUser;-><init>()V

    .line 2
    invoke-static {p1}, Lf6/a;->x(Ljava/lang/Object;)V

    .line 3
    invoke-virtual {p1}, Lcom/google/firebase/FirebaseApp;->getName()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/google/firebase/auth/internal/zzaf;->zzc:Ljava/lang/String;

    const-string p1, "com.google.firebase.auth.internal.DefaultFirebaseUser"

    iput-object p1, p0, Lcom/google/firebase/auth/internal/zzaf;->zzd:Ljava/lang/String;

    const-string p1, "2"

    iput-object p1, p0, Lcom/google/firebase/auth/internal/zzaf;->zzg:Ljava/lang/String;

    .line 4
    invoke-virtual {p0, p2}, Lcom/google/firebase/auth/internal/zzaf;->zza(Ljava/util/List;)Lcom/google/firebase/auth/FirebaseUser;

    return-void
.end method

.method public static zza(Lcom/google/firebase/FirebaseApp;Lcom/google/firebase/auth/FirebaseUser;)Lcom/google/firebase/auth/FirebaseUser;
    .locals 2

    .line 7
    new-instance v0, Lcom/google/firebase/auth/internal/zzaf;

    invoke-virtual {p1}, Lcom/google/firebase/auth/FirebaseUser;->getProviderData()Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lcom/google/firebase/auth/internal/zzaf;-><init>(Lcom/google/firebase/FirebaseApp;Ljava/util/List;)V

    .line 8
    instance-of p0, p1, Lcom/google/firebase/auth/internal/zzaf;

    if-eqz p0, :cond_0

    .line 9
    move-object p0, p1

    check-cast p0, Lcom/google/firebase/auth/internal/zzaf;

    .line 10
    iget-object v1, p0, Lcom/google/firebase/auth/internal/zzaf;->zzg:Ljava/lang/String;

    iput-object v1, v0, Lcom/google/firebase/auth/internal/zzaf;->zzg:Ljava/lang/String;

    .line 11
    iget-object v1, p0, Lcom/google/firebase/auth/internal/zzaf;->zzd:Ljava/lang/String;

    iput-object v1, v0, Lcom/google/firebase/auth/internal/zzaf;->zzd:Ljava/lang/String;

    .line 12
    invoke-virtual {p0}, Lcom/google/firebase/auth/internal/zzaf;->getMetadata()Lcom/google/firebase/auth/FirebaseUserMetadata;

    move-result-object p0

    check-cast p0, Lcom/google/firebase/auth/internal/zzah;

    iput-object p0, v0, Lcom/google/firebase/auth/internal/zzaf;->zzi:Lcom/google/firebase/auth/internal/zzah;

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    iput-object p0, v0, Lcom/google/firebase/auth/internal/zzaf;->zzi:Lcom/google/firebase/auth/internal/zzah;

    .line 13
    :goto_0
    invoke-virtual {p1}, Lcom/google/firebase/auth/FirebaseUser;->zzc()Lcom/google/android/gms/internal/firebase-auth-api/zzafm;

    move-result-object p0

    if-eqz p0, :cond_1

    .line 14
    invoke-virtual {p1}, Lcom/google/firebase/auth/FirebaseUser;->zzc()Lcom/google/android/gms/internal/firebase-auth-api/zzafm;

    move-result-object p0

    invoke-virtual {v0, p0}, Lcom/google/firebase/auth/internal/zzaf;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzafm;)V

    .line 15
    :cond_1
    invoke-virtual {p1}, Lcom/google/firebase/auth/FirebaseUser;->isAnonymous()Z

    move-result p0

    if-nez p0, :cond_2

    .line 16
    invoke-virtual {v0}, Lcom/google/firebase/auth/internal/zzaf;->zzb()Lcom/google/firebase/auth/FirebaseUser;

    :cond_2
    return-object v0
.end method


# virtual methods
.method public getDisplayName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/auth/internal/zzaf;->zzb:Lcom/google/firebase/auth/internal/zzab;

    invoke-virtual {v0}, Lcom/google/firebase/auth/internal/zzab;->getDisplayName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getEmail()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/auth/internal/zzaf;->zzb:Lcom/google/firebase/auth/internal/zzab;

    invoke-virtual {v0}, Lcom/google/firebase/auth/internal/zzab;->getEmail()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getMetadata()Lcom/google/firebase/auth/FirebaseUserMetadata;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/auth/internal/zzaf;->zzi:Lcom/google/firebase/auth/internal/zzah;

    return-object v0
.end method

.method public synthetic getMultiFactor()Lcom/google/firebase/auth/MultiFactor;
    .locals 1

    new-instance v0, Lcom/google/firebase/auth/internal/zzaj;

    invoke-direct {v0, p0}, Lcom/google/firebase/auth/internal/zzaj;-><init>(Lcom/google/firebase/auth/internal/zzaf;)V

    return-object v0
.end method

.method public getPhoneNumber()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/auth/internal/zzaf;->zzb:Lcom/google/firebase/auth/internal/zzab;

    invoke-virtual {v0}, Lcom/google/firebase/auth/internal/zzab;->getPhoneNumber()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getPhotoUrl()Landroid/net/Uri;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/auth/internal/zzaf;->zzb:Lcom/google/firebase/auth/internal/zzab;

    invoke-virtual {v0}, Lcom/google/firebase/auth/internal/zzab;->getPhotoUrl()Landroid/net/Uri;

    move-result-object v0

    return-object v0
.end method

.method public getProviderData()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "+",
            "Lcom/google/firebase/auth/UserInfo;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/firebase/auth/internal/zzaf;->zze:Ljava/util/List;

    return-object v0
.end method

.method public getProviderId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/auth/internal/zzaf;->zzb:Lcom/google/firebase/auth/internal/zzab;

    invoke-virtual {v0}, Lcom/google/firebase/auth/internal/zzab;->getProviderId()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getTenantId()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lcom/google/firebase/auth/internal/zzaf;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzafm;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzafm;->zzc()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/firebase/auth/internal/zzaf;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzafm;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzafm;->zzc()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/firebase/auth/internal/zzbi;->zza(Ljava/lang/String;)Lcom/google/firebase/auth/GetTokenResult;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/firebase/auth/GetTokenResult;->getClaims()Ljava/util/Map;

    move-result-object v0

    const-string v2, "firebase"

    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    if-eqz v0, :cond_0

    const-string v1, "tenant"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Ljava/lang/String;

    :cond_0
    return-object v1
.end method

.method public getUid()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/auth/internal/zzaf;->zzb:Lcom/google/firebase/auth/internal/zzab;

    invoke-virtual {v0}, Lcom/google/firebase/auth/internal/zzab;->getUid()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public isAnonymous()Z
    .locals 3

    iget-object v0, p0, Lcom/google/firebase/auth/internal/zzaf;->zzh:Ljava/lang/Boolean;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_4

    :cond_0
    iget-object v0, p0, Lcom/google/firebase/auth/internal/zzaf;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzafm;

    const-string v1, ""

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzafm;->zzc()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/firebase/auth/internal/zzbi;->zza(Ljava/lang/String;)Lcom/google/firebase/auth/GetTokenResult;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/google/firebase/auth/GetTokenResult;->getSignInProvider()Ljava/lang/String;

    move-result-object v1

    :cond_1
    invoke-virtual {p0}, Lcom/google/firebase/auth/internal/zzaf;->getProviderData()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v2, 0x1

    if-gt v0, v2, :cond_2

    if-eqz v1, :cond_3

    const-string v0, "custom"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    const/4 v2, 0x0

    :cond_3
    :goto_0
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lcom/google/firebase/auth/internal/zzaf;->zzh:Ljava/lang/Boolean;

    :cond_4
    iget-object v0, p0, Lcom/google/firebase/auth/internal/zzaf;->zzh:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public isEmailVerified()Z
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/auth/internal/zzaf;->zzb:Lcom/google/firebase/auth/internal/zzab;

    invoke-virtual {v0}, Lcom/google/firebase/auth/internal/zzab;->isEmailVerified()Z

    move-result v0

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    const/16 v0, 0x4f45

    invoke-static {v0, p1}, Ly3/e;->Y0(ILandroid/os/Parcel;)I

    move-result v0

    const/4 v1, 0x1

    invoke-virtual {p0}, Lcom/google/firebase/auth/internal/zzaf;->zzc()Lcom/google/android/gms/internal/firebase-auth-api/zzafm;

    move-result-object v2

    invoke-static {p1, v1, v2, p2}, Ly3/e;->R0(Landroid/os/Parcel;ILandroid/os/Parcelable;I)V

    const/4 v1, 0x2

    iget-object v2, p0, Lcom/google/firebase/auth/internal/zzaf;->zzb:Lcom/google/firebase/auth/internal/zzab;

    invoke-static {p1, v1, v2, p2}, Ly3/e;->R0(Landroid/os/Parcel;ILandroid/os/Parcelable;I)V

    const/4 v1, 0x3

    iget-object v2, p0, Lcom/google/firebase/auth/internal/zzaf;->zzc:Ljava/lang/String;

    invoke-static {p1, v1, v2}, Ly3/e;->T0(Landroid/os/Parcel;ILjava/lang/String;)V

    iget-object v1, p0, Lcom/google/firebase/auth/internal/zzaf;->zzd:Ljava/lang/String;

    const/4 v2, 0x4

    invoke-static {p1, v2, v1}, Ly3/e;->T0(Landroid/os/Parcel;ILjava/lang/String;)V

    const/4 v1, 0x5

    iget-object v3, p0, Lcom/google/firebase/auth/internal/zzaf;->zze:Ljava/util/List;

    invoke-static {p1, v1, v3}, Ly3/e;->W0(Landroid/os/Parcel;ILjava/util/List;)V

    const/4 v1, 0x6

    invoke-virtual {p0}, Lcom/google/firebase/auth/internal/zzaf;->zzf()Ljava/util/List;

    move-result-object v3

    invoke-static {p1, v1, v3}, Ly3/e;->U0(Landroid/os/Parcel;ILjava/util/List;)V

    const/4 v1, 0x7

    iget-object v3, p0, Lcom/google/firebase/auth/internal/zzaf;->zzg:Ljava/lang/String;

    invoke-static {p1, v1, v3}, Ly3/e;->T0(Landroid/os/Parcel;ILjava/lang/String;)V

    invoke-virtual {p0}, Lcom/google/firebase/auth/internal/zzaf;->isAnonymous()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    const/16 v3, 0x8

    invoke-static {p1, v3, v2}, Ly3/e;->f1(Landroid/os/Parcel;II)V

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    :goto_0
    const/16 v1, 0x9

    invoke-virtual {p0}, Lcom/google/firebase/auth/internal/zzaf;->getMetadata()Lcom/google/firebase/auth/FirebaseUserMetadata;

    move-result-object v3

    invoke-static {p1, v1, v3, p2}, Ly3/e;->R0(Landroid/os/Parcel;ILandroid/os/Parcelable;I)V

    iget-boolean v1, p0, Lcom/google/firebase/auth/internal/zzaf;->zzj:Z

    const/16 v3, 0xa

    invoke-static {p1, v3, v2}, Ly3/e;->f1(Landroid/os/Parcel;II)V

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    const/16 v1, 0xb

    iget-object v2, p0, Lcom/google/firebase/auth/internal/zzaf;->zzk:Lcom/google/firebase/auth/zzd;

    invoke-static {p1, v1, v2, p2}, Ly3/e;->R0(Landroid/os/Parcel;ILandroid/os/Parcelable;I)V

    const/16 v1, 0xc

    iget-object v2, p0, Lcom/google/firebase/auth/internal/zzaf;->zzl:Lcom/google/firebase/auth/internal/zzbj;

    invoke-static {p1, v1, v2, p2}, Ly3/e;->R0(Landroid/os/Parcel;ILandroid/os/Parcelable;I)V

    const/16 p2, 0xd

    iget-object v1, p0, Lcom/google/firebase/auth/internal/zzaf;->zzm:Ljava/util/List;

    invoke-static {p1, p2, v1}, Ly3/e;->W0(Landroid/os/Parcel;ILjava/util/List;)V

    invoke-static {v0, p1}, Ly3/e;->d1(ILandroid/os/Parcel;)V

    return-void
.end method

.method public final zza()Lcom/google/firebase/FirebaseApp;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/auth/internal/zzaf;->zzc:Ljava/lang/String;

    .line 6
    invoke-static {v0}, Lcom/google/firebase/FirebaseApp;->getInstance(Ljava/lang/String;)Lcom/google/firebase/FirebaseApp;

    move-result-object v0

    return-object v0
.end method

.method public final declared-synchronized zza(Ljava/util/List;)Lcom/google/firebase/auth/FirebaseUser;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lcom/google/firebase/auth/UserInfo;",
            ">;)",
            "Lcom/google/firebase/auth/FirebaseUser;"
        }
    .end annotation

    monitor-enter p0

    .line 17
    :try_start_0
    invoke-static {p1}, Lf6/a;->x(Ljava/lang/Object;)V

    .line 18
    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Lcom/google/firebase/auth/internal/zzaf;->zze:Ljava/util/List;

    .line 19
    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Lcom/google/firebase/auth/internal/zzaf;->zzf:Ljava/util/List;

    const/4 v0, 0x0

    move v1, v0

    .line 20
    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_1

    .line 21
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/firebase/auth/UserInfo;

    .line 22
    invoke-interface {v2}, Lcom/google/firebase/auth/UserInfo;->getProviderId()Ljava/lang/String;

    move-result-object v3

    const-string v4, "firebase"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 23
    move-object v3, v2

    check-cast v3, Lcom/google/firebase/auth/internal/zzab;

    iput-object v3, p0, Lcom/google/firebase/auth/internal/zzaf;->zzb:Lcom/google/firebase/auth/internal/zzab;

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_0
    iget-object v3, p0, Lcom/google/firebase/auth/internal/zzaf;->zzf:Ljava/util/List;

    .line 24
    invoke-interface {v2}, Lcom/google/firebase/auth/UserInfo;->getProviderId()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_1
    iget-object v3, p0, Lcom/google/firebase/auth/internal/zzaf;->zze:Ljava/util/List;

    .line 25
    check-cast v2, Lcom/google/firebase/auth/internal/zzab;

    invoke-interface {v3, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lcom/google/firebase/auth/internal/zzaf;->zzb:Lcom/google/firebase/auth/internal/zzab;

    if-nez p1, :cond_2

    iget-object p1, p0, Lcom/google/firebase/auth/internal/zzaf;->zze:Ljava/util/List;

    .line 26
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/firebase/auth/internal/zzab;

    iput-object p1, p0, Lcom/google/firebase/auth/internal/zzaf;->zzb:Lcom/google/firebase/auth/internal/zzab;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    :cond_2
    monitor-exit p0

    return-object p0

    :goto_2
    monitor-exit p0

    throw p1
.end method

.method public final zza(Ljava/lang/String;)Lcom/google/firebase/auth/internal/zzaf;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/firebase/auth/internal/zzaf;->zzg:Ljava/lang/String;

    return-object p0
.end method

.method public final zza(Lcom/google/android/gms/internal/firebase-auth-api/zzafm;)V
    .locals 1

    if-eqz p1, :cond_0

    iput-object p1, p0, Lcom/google/firebase/auth/internal/zzaf;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzafm;

    return-void

    .line 5
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "null reference"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final zza(Lcom/google/firebase/auth/internal/zzah;)V
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/google/firebase/auth/internal/zzaf;->zzi:Lcom/google/firebase/auth/internal/zzah;

    return-void
.end method

.method public final zza(Lcom/google/firebase/auth/zzd;)V
    .locals 0

    .line 3
    iput-object p1, p0, Lcom/google/firebase/auth/internal/zzaf;->zzk:Lcom/google/firebase/auth/zzd;

    return-void
.end method

.method public final zza(Z)V
    .locals 0

    .line 4
    iput-boolean p1, p0, Lcom/google/firebase/auth/internal/zzaf;->zzj:Z

    return-void
.end method

.method public final synthetic zzb()Lcom/google/firebase/auth/FirebaseUser;
    .locals 1

    .line 1
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v0, p0, Lcom/google/firebase/auth/internal/zzaf;->zzh:Ljava/lang/Boolean;

    return-object p0
.end method

.method public final zzb(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/google/firebase/auth/MultiFactorInfo;",
            ">;)V"
        }
    .end annotation

    .line 2
    invoke-static {p1}, Lcom/google/firebase/auth/internal/zzbj;->zza(Ljava/util/List;)Lcom/google/firebase/auth/internal/zzbj;

    move-result-object p1

    iput-object p1, p0, Lcom/google/firebase/auth/internal/zzaf;->zzl:Lcom/google/firebase/auth/internal/zzbj;

    return-void
.end method

.method public final zzc()Lcom/google/android/gms/internal/firebase-auth-api/zzafm;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/firebase/auth/internal/zzaf;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzafm;

    return-object v0
.end method

.method public final zzc(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzafp;",
            ">;)V"
        }
    .end annotation

    .line 2
    invoke-static {p1}, Lf6/a;->x(Ljava/lang/Object;)V

    iput-object p1, p0, Lcom/google/firebase/auth/internal/zzaf;->zzm:Ljava/util/List;

    return-void
.end method

.method public final zzd()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lcom/google/firebase/auth/internal/zzaf;->zzc()Lcom/google/android/gms/internal/firebase-auth-api/zzafm;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzafm;->zzc()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final zze()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/auth/internal/zzaf;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzafm;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzafm;->zzf()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final zzf()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/firebase/auth/internal/zzaf;->zzf:Ljava/util/List;

    return-object v0
.end method

.method public final zzg()Lcom/google/firebase/auth/zzd;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/auth/internal/zzaf;->zzk:Lcom/google/firebase/auth/zzd;

    return-object v0
.end method

.method public final zzh()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/google/firebase/auth/MultiFactorInfo;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/firebase/auth/internal/zzaf;->zzl:Lcom/google/firebase/auth/internal/zzbj;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/firebase/auth/internal/zzbj;->zza()Ljava/util/List;

    move-result-object v0

    return-object v0

    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    return-object v0
.end method

.method public final zzi()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/google/firebase/auth/internal/zzab;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/firebase/auth/internal/zzaf;->zze:Ljava/util/List;

    return-object v0
.end method

.method public final zzj()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/firebase/auth/internal/zzaf;->zzj:Z

    return v0
.end method
