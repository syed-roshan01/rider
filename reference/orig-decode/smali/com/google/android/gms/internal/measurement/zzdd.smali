.class public final Lcom/google/android/gms/internal/measurement/zzdd;
.super La6/a;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/google/android/gms/internal/measurement/zzdd;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final zza:J

.field public final zzb:J

.field public final zzc:Z

.field public final zzd:Ljava/lang/String;

.field public final zze:Ljava/lang/String;

.field public final zzf:Ljava/lang/String;

.field public final zzg:Landroid/os/Bundle;

.field public final zzh:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/measurement/zzdg;

    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/zzdg;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/measurement/zzdd;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(JJZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lcom/google/android/gms/internal/measurement/zzdd;->zza:J

    iput-wide p3, p0, Lcom/google/android/gms/internal/measurement/zzdd;->zzb:J

    iput-boolean p5, p0, Lcom/google/android/gms/internal/measurement/zzdd;->zzc:Z

    iput-object p6, p0, Lcom/google/android/gms/internal/measurement/zzdd;->zzd:Ljava/lang/String;

    iput-object p7, p0, Lcom/google/android/gms/internal/measurement/zzdd;->zze:Ljava/lang/String;

    iput-object p8, p0, Lcom/google/android/gms/internal/measurement/zzdd;->zzf:Ljava/lang/String;

    iput-object p9, p0, Lcom/google/android/gms/internal/measurement/zzdd;->zzg:Landroid/os/Bundle;

    iput-object p10, p0, Lcom/google/android/gms/internal/measurement/zzdd;->zzh:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    const/16 p2, 0x4f45

    invoke-static {p2, p1}, Ly3/e;->Y0(ILandroid/os/Parcel;)I

    move-result p2

    iget-wide v0, p0, Lcom/google/android/gms/internal/measurement/zzdd;->zza:J

    const/4 v2, 0x1

    const/16 v3, 0x8

    invoke-static {p1, v2, v3}, Ly3/e;->f1(Landroid/os/Parcel;II)V

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    iget-wide v0, p0, Lcom/google/android/gms/internal/measurement/zzdd;->zzb:J

    const/4 v2, 0x2

    invoke-static {p1, v2, v3}, Ly3/e;->f1(Landroid/os/Parcel;II)V

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    iget-boolean v0, p0, Lcom/google/android/gms/internal/measurement/zzdd;->zzc:Z

    const/4 v1, 0x3

    const/4 v2, 0x4

    invoke-static {p1, v1, v2}, Ly3/e;->f1(Landroid/os/Parcel;II)V

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzdd;->zzd:Ljava/lang/String;

    invoke-static {p1, v2, v0}, Ly3/e;->T0(Landroid/os/Parcel;ILjava/lang/String;)V

    const/4 v0, 0x5

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzdd;->zze:Ljava/lang/String;

    invoke-static {p1, v0, v1}, Ly3/e;->T0(Landroid/os/Parcel;ILjava/lang/String;)V

    const/4 v0, 0x6

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzdd;->zzf:Ljava/lang/String;

    invoke-static {p1, v0, v1}, Ly3/e;->T0(Landroid/os/Parcel;ILjava/lang/String;)V

    const/4 v0, 0x7

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzdd;->zzg:Landroid/os/Bundle;

    invoke-static {p1, v0, v1}, Ly3/e;->K0(Landroid/os/Parcel;ILandroid/os/Bundle;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzdd;->zzh:Ljava/lang/String;

    invoke-static {p1, v3, v0}, Ly3/e;->T0(Landroid/os/Parcel;ILjava/lang/String;)V

    invoke-static {p2, p1}, Ly3/e;->d1(ILandroid/os/Parcel;)V

    return-void
.end method
