.class public final Ln6/g;
.super La6/a;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Ln6/g;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final a:I

.field public final b:Lcom/google/android/gms/common/internal/z;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lz5/n;

    const/16 v1, 0xe

    invoke-direct {v0, v1}, Lz5/n;-><init>(I)V

    sput-object v0, Ln6/g;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(ILcom/google/android/gms/common/internal/z;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Ln6/g;->a:I

    iput-object p2, p0, Ln6/g;->b:Lcom/google/android/gms/common/internal/z;

    return-void
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    const/16 v0, 0x4f45

    invoke-static {v0, p1}, Ly3/e;->Y0(ILandroid/os/Parcel;)I

    move-result v0

    const/4 v1, 0x4

    const/4 v2, 0x1

    invoke-static {p1, v2, v1}, Ly3/e;->f1(Landroid/os/Parcel;II)V

    iget v1, p0, Ln6/g;->a:I

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    iget-object v1, p0, Ln6/g;->b:Lcom/google/android/gms/common/internal/z;

    const/4 v2, 0x2

    invoke-static {p1, v2, v1, p2}, Ly3/e;->R0(Landroid/os/Parcel;ILandroid/os/Parcelable;I)V

    invoke-static {v0, p1}, Ly3/e;->d1(ILandroid/os/Parcel;)V

    return-void
.end method
