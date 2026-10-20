.class public final Lz5/w;
.super La6/a;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lz5/w;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final a:Z

.field public final b:Ljava/lang/String;

.field public final c:I

.field public final d:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lz5/n;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Lz5/n;-><init>(I)V

    sput-object v0, Lz5/w;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(IILjava/lang/String;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p4, p0, Lz5/w;->a:Z

    iput-object p3, p0, Lz5/w;->b:Ljava/lang/String;

    invoke-static {p1}, Lo7/d0;->n0(I)I

    move-result p1

    add-int/lit8 p1, p1, -0x1

    iput p1, p0, Lz5/w;->c:I

    invoke-static {p2}, Ly3/e;->X0(I)I

    move-result p1

    add-int/lit8 p1, p1, -0x1

    iput p1, p0, Lz5/w;->d:I

    return-void
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    const/16 p2, 0x4f45

    invoke-static {p2, p1}, Ly3/e;->Y0(ILandroid/os/Parcel;)I

    move-result p2

    const/4 v0, 0x1

    const/4 v1, 0x4

    invoke-static {p1, v0, v1}, Ly3/e;->f1(Landroid/os/Parcel;II)V

    iget-boolean v0, p0, Lz5/w;->a:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-object v0, p0, Lz5/w;->b:Ljava/lang/String;

    const/4 v2, 0x2

    invoke-static {p1, v2, v0}, Ly3/e;->T0(Landroid/os/Parcel;ILjava/lang/String;)V

    const/4 v0, 0x3

    invoke-static {p1, v0, v1}, Ly3/e;->f1(Landroid/os/Parcel;II)V

    iget v0, p0, Lz5/w;->c:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    invoke-static {p1, v1, v1}, Ly3/e;->f1(Landroid/os/Parcel;II)V

    iget v0, p0, Lz5/w;->d:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    invoke-static {p2, p1}, Ly3/e;->d1(ILandroid/os/Parcel;)V

    return-void
.end method
