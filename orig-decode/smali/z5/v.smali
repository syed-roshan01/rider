.class public final Lz5/v;
.super La6/a;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lz5/v;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Z

.field public final c:Z

.field public final d:Landroid/content/Context;

.field public final e:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lz5/n;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Lz5/n;-><init>(I)V

    sput-object v0, Lz5/v;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ZZLandroid/os/IBinder;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz5/v;->a:Ljava/lang/String;

    iput-boolean p2, p0, Lz5/v;->b:Z

    iput-boolean p3, p0, Lz5/v;->c:Z

    invoke-static {p4}, Lg6/b;->a(Landroid/os/IBinder;)Lg6/a;

    move-result-object p1

    invoke-static {p1}, Lg6/b;->b(Lg6/a;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/Context;

    iput-object p1, p0, Lz5/v;->d:Landroid/content/Context;

    iput-boolean p5, p0, Lz5/v;->e:Z

    return-void
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    const/16 p2, 0x4f45

    invoke-static {p2, p1}, Ly3/e;->Y0(ILandroid/os/Parcel;)I

    move-result p2

    const/4 v0, 0x1

    iget-object v1, p0, Lz5/v;->a:Ljava/lang/String;

    invoke-static {p1, v0, v1}, Ly3/e;->T0(Landroid/os/Parcel;ILjava/lang/String;)V

    const/4 v0, 0x2

    const/4 v1, 0x4

    invoke-static {p1, v0, v1}, Ly3/e;->f1(Landroid/os/Parcel;II)V

    iget-boolean v0, p0, Lz5/v;->b:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    const/4 v0, 0x3

    invoke-static {p1, v0, v1}, Ly3/e;->f1(Landroid/os/Parcel;II)V

    iget-boolean v0, p0, Lz5/v;->c:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    new-instance v0, Lg6/b;

    iget-object v2, p0, Lz5/v;->d:Landroid/content/Context;

    invoke-direct {v0, v2}, Lg6/b;-><init>(Ljava/lang/Object;)V

    invoke-static {p1, v1, v0}, Ly3/e;->M0(Landroid/os/Parcel;ILandroid/os/IBinder;)V

    const/4 v0, 0x5

    invoke-static {p1, v0, v1}, Ly3/e;->f1(Landroid/os/Parcel;II)V

    iget-boolean v0, p0, Lz5/v;->e:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    invoke-static {p2, p1}, Ly3/e;->d1(ILandroid/os/Parcel;)V

    return-void
.end method
