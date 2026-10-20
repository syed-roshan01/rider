.class public final Lcom/google/android/gms/common/internal/r;
.super La6/a;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/google/android/gms/common/internal/r;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final a:I

.field public final b:Z

.field public final c:Z

.field public final d:I

.field public final e:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ld/a;

    const/16 v1, 0x1a

    invoke-direct {v0, v1}, Ld/a;-><init>(I)V

    sput-object v0, Lcom/google/android/gms/common/internal/r;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(IZZII)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/google/android/gms/common/internal/r;->a:I

    iput-boolean p2, p0, Lcom/google/android/gms/common/internal/r;->b:Z

    iput-boolean p3, p0, Lcom/google/android/gms/common/internal/r;->c:Z

    iput p4, p0, Lcom/google/android/gms/common/internal/r;->d:I

    iput p5, p0, Lcom/google/android/gms/common/internal/r;->e:I

    return-void
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    const/16 p2, 0x4f45

    invoke-static {p2, p1}, Ly3/e;->Y0(ILandroid/os/Parcel;)I

    move-result p2

    const/4 v0, 0x1

    const/4 v1, 0x4

    invoke-static {p1, v0, v1}, Ly3/e;->f1(Landroid/os/Parcel;II)V

    iget v0, p0, Lcom/google/android/gms/common/internal/r;->a:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    const/4 v0, 0x2

    invoke-static {p1, v0, v1}, Ly3/e;->f1(Landroid/os/Parcel;II)V

    iget-boolean v0, p0, Lcom/google/android/gms/common/internal/r;->b:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    const/4 v0, 0x3

    invoke-static {p1, v0, v1}, Ly3/e;->f1(Landroid/os/Parcel;II)V

    iget-boolean v0, p0, Lcom/google/android/gms/common/internal/r;->c:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    invoke-static {p1, v1, v1}, Ly3/e;->f1(Landroid/os/Parcel;II)V

    iget v0, p0, Lcom/google/android/gms/common/internal/r;->d:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    const/4 v0, 0x5

    invoke-static {p1, v0, v1}, Ly3/e;->f1(Landroid/os/Parcel;II)V

    iget v0, p0, Lcom/google/android/gms/common/internal/r;->e:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    invoke-static {p2, p1}, Ly3/e;->d1(ILandroid/os/Parcel;)V

    return-void
.end method
