.class public Lcom/google/firebase/messaging/RemoteMessageCreator;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Lcom/google/firebase/messaging/RemoteMessage;",
        ">;"
    }
.end annotation


# static fields
.field public static final CONTENT_DESCRIPTION:I


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static writeToParcel(Lcom/google/firebase/messaging/RemoteMessage;Landroid/os/Parcel;I)V
    .locals 1

    const/16 p2, 0x4f45

    invoke-static {p2, p1}, Ly3/e;->Y0(ILandroid/os/Parcel;)I

    move-result p2

    iget-object p0, p0, Lcom/google/firebase/messaging/RemoteMessage;->bundle:Landroid/os/Bundle;

    const/4 v0, 0x2

    invoke-static {p1, v0, p0}, Ly3/e;->K0(Landroid/os/Parcel;ILandroid/os/Bundle;)V

    invoke-static {p2, p1}, Ly3/e;->d1(ILandroid/os/Parcel;)V

    return-void
.end method


# virtual methods
.method public createFromParcel(Landroid/os/Parcel;)Lcom/google/firebase/messaging/RemoteMessage;
    .locals 5

    .line 2
    invoke-static {p1}, Ly3/e;->I0(Landroid/os/Parcel;)I

    move-result v0

    const/4 v1, 0x0

    .line 3
    :goto_0
    invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I

    move-result v2

    if-ge v2, v0, :cond_1

    .line 4
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v2

    int-to-char v3, v2

    const/4 v4, 0x2

    if-eq v3, v4, :cond_0

    .line 5
    invoke-static {v2, p1}, Ly3/e;->E0(ILandroid/os/Parcel;)V

    goto :goto_0

    .line 6
    :cond_0
    invoke-static {v2, p1}, Ly3/e;->S(ILandroid/os/Parcel;)Landroid/os/Bundle;

    move-result-object v1

    goto :goto_0

    .line 7
    :cond_1
    invoke-static {v0, p1}, Ly3/e;->e0(ILandroid/os/Parcel;)V

    .line 8
    new-instance p1, Lcom/google/firebase/messaging/RemoteMessage;

    invoke-direct {p1, v1}, Lcom/google/firebase/messaging/RemoteMessage;-><init>(Landroid/os/Bundle;)V

    return-object p1
.end method

.method public bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/google/firebase/messaging/RemoteMessageCreator;->createFromParcel(Landroid/os/Parcel;)Lcom/google/firebase/messaging/RemoteMessage;

    move-result-object p1

    return-object p1
.end method

.method public newArray(I)[Lcom/google/firebase/messaging/RemoteMessage;
    .locals 0

    .line 2
    new-array p1, p1, [Lcom/google/firebase/messaging/RemoteMessage;

    return-object p1
.end method

.method public bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/google/firebase/messaging/RemoteMessageCreator;->newArray(I)[Lcom/google/firebase/messaging/RemoteMessage;

    move-result-object p1

    return-object p1
.end method
