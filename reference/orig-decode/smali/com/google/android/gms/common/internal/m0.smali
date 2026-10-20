.class public final Lcom/google/android/gms/common/internal/m0;
.super La6/a;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/google/android/gms/common/internal/m0;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public a:Landroid/os/Bundle;

.field public b:[Lz5/d;

.field public c:I

.field public d:Lcom/google/android/gms/common/internal/i;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ld/a;

    const/16 v1, 0x1b

    invoke-direct {v0, v1}, Ld/a;-><init>(I)V

    sput-object v0, Lcom/google/android/gms/common/internal/m0;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    const/16 v0, 0x4f45

    invoke-static {v0, p1}, Ly3/e;->Y0(ILandroid/os/Parcel;)I

    move-result v0

    const/4 v1, 0x1

    iget-object v2, p0, Lcom/google/android/gms/common/internal/m0;->a:Landroid/os/Bundle;

    invoke-static {p1, v1, v2}, Ly3/e;->K0(Landroid/os/Parcel;ILandroid/os/Bundle;)V

    const/4 v1, 0x2

    iget-object v2, p0, Lcom/google/android/gms/common/internal/m0;->b:[Lz5/d;

    invoke-static {p1, v1, v2, p2}, Ly3/e;->V0(Landroid/os/Parcel;I[Landroid/os/Parcelable;I)V

    const/4 v1, 0x3

    const/4 v2, 0x4

    invoke-static {p1, v1, v2}, Ly3/e;->f1(Landroid/os/Parcel;II)V

    iget v1, p0, Lcom/google/android/gms/common/internal/m0;->c:I

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    iget-object v1, p0, Lcom/google/android/gms/common/internal/m0;->d:Lcom/google/android/gms/common/internal/i;

    invoke-static {p1, v2, v1, p2}, Ly3/e;->R0(Landroid/os/Parcel;ILandroid/os/Parcelable;I)V

    invoke-static {v0, p1}, Ly3/e;->d1(ILandroid/os/Parcel;)V

    return-void
.end method
