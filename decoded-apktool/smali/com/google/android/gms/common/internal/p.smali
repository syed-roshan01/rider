.class public final Lcom/google/android/gms/common/internal/p;
.super La6/a;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/google/android/gms/common/internal/p;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final a:I

.field public final b:I

.field public final c:I

.field public final d:J

.field public final e:J

.field public final f:Ljava/lang/String;

.field public final n:Ljava/lang/String;

.field public final o:I

.field public final p:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ld/a;

    const/16 v1, 0x17

    invoke-direct {v0, v1}, Ld/a;-><init>(I)V

    sput-object v0, Lcom/google/android/gms/common/internal/p;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(IIIJJLjava/lang/String;Ljava/lang/String;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/google/android/gms/common/internal/p;->a:I

    iput p2, p0, Lcom/google/android/gms/common/internal/p;->b:I

    iput p3, p0, Lcom/google/android/gms/common/internal/p;->c:I

    iput-wide p4, p0, Lcom/google/android/gms/common/internal/p;->d:J

    iput-wide p6, p0, Lcom/google/android/gms/common/internal/p;->e:J

    iput-object p8, p0, Lcom/google/android/gms/common/internal/p;->f:Ljava/lang/String;

    iput-object p9, p0, Lcom/google/android/gms/common/internal/p;->n:Ljava/lang/String;

    iput p10, p0, Lcom/google/android/gms/common/internal/p;->o:I

    iput p11, p0, Lcom/google/android/gms/common/internal/p;->p:I

    return-void
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    const/16 p2, 0x4f45

    invoke-static {p2, p1}, Ly3/e;->Y0(ILandroid/os/Parcel;)I

    move-result p2

    const/4 v0, 0x1

    const/4 v1, 0x4

    invoke-static {p1, v0, v1}, Ly3/e;->f1(Landroid/os/Parcel;II)V

    iget v0, p0, Lcom/google/android/gms/common/internal/p;->a:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    const/4 v0, 0x2

    invoke-static {p1, v0, v1}, Ly3/e;->f1(Landroid/os/Parcel;II)V

    iget v0, p0, Lcom/google/android/gms/common/internal/p;->b:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    const/4 v0, 0x3

    invoke-static {p1, v0, v1}, Ly3/e;->f1(Landroid/os/Parcel;II)V

    iget v0, p0, Lcom/google/android/gms/common/internal/p;->c:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    const/16 v0, 0x8

    invoke-static {p1, v1, v0}, Ly3/e;->f1(Landroid/os/Parcel;II)V

    iget-wide v2, p0, Lcom/google/android/gms/common/internal/p;->d:J

    invoke-virtual {p1, v2, v3}, Landroid/os/Parcel;->writeLong(J)V

    const/4 v2, 0x5

    invoke-static {p1, v2, v0}, Ly3/e;->f1(Landroid/os/Parcel;II)V

    iget-wide v2, p0, Lcom/google/android/gms/common/internal/p;->e:J

    invoke-virtual {p1, v2, v3}, Landroid/os/Parcel;->writeLong(J)V

    const/4 v2, 0x6

    iget-object v3, p0, Lcom/google/android/gms/common/internal/p;->f:Ljava/lang/String;

    invoke-static {p1, v2, v3}, Ly3/e;->T0(Landroid/os/Parcel;ILjava/lang/String;)V

    const/4 v2, 0x7

    iget-object v3, p0, Lcom/google/android/gms/common/internal/p;->n:Ljava/lang/String;

    invoke-static {p1, v2, v3}, Ly3/e;->T0(Landroid/os/Parcel;ILjava/lang/String;)V

    invoke-static {p1, v0, v1}, Ly3/e;->f1(Landroid/os/Parcel;II)V

    iget v0, p0, Lcom/google/android/gms/common/internal/p;->o:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    const/16 v0, 0x9

    invoke-static {p1, v0, v1}, Ly3/e;->f1(Landroid/os/Parcel;II)V

    iget v0, p0, Lcom/google/android/gms/common/internal/p;->p:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    invoke-static {p2, p1}, Ly3/e;->d1(ILandroid/os/Parcel;)V

    return-void
.end method
