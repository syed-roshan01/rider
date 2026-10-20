.class public abstract Lw9/d;
.super Landroid/os/Binder;

# interfaces
.implements Landroid/os/IInterface;


# virtual methods
.method public final asBinder()Landroid/os/IBinder;
    .locals 0

    return-object p0
.end method

.method public final onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    .locals 6

    const-string v0, "moe.shizuku.server.IShizukuApplication"

    const/4 v1, 0x2

    const/4 v2, -0x1

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-eq p1, v1, :cond_8

    const/4 v1, 0x3

    if-eq p1, v1, :cond_2

    const/16 v1, 0x2711

    if-eq p1, v1, :cond_1

    const v1, 0x5f4e5446

    if-eq p1, v1, :cond_0

    invoke-super {p0, p1, p2, p3, p4}, Landroid/os/Binder;->onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    move-result p1

    return p1

    :cond_0
    invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return v5

    :cond_1
    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    return v5

    :cond_2
    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result p1

    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result p3

    if-eqz p3, :cond_3

    sget-object p3, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {p3, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object p2

    move-object v4, p2

    check-cast v4, Landroid/os/Bundle;

    :cond_3
    const-string p2, "shizuku:request-permission-reply-allowed"

    invoke-virtual {v4, p2, v3}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result p2

    if-eqz p2, :cond_4

    move v2, v3

    :cond_4
    sget-object p3, Lla/g;->g:Ljava/util/ArrayList;

    monitor-enter p3

    :try_start_0
    sget-object p2, Lla/g;->i:Ljava/util/ArrayList;

    invoke-virtual {p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p4

    if-eqz p4, :cond_7

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Lla/f;

    iget-object v0, p4, Lla/f;->b:Landroid/os/Handler;

    if-eqz v0, :cond_5

    new-instance v1, Lla/d;

    invoke-direct {v1, p4, p1, v2, v3}, Lla/d;-><init>(Lla/f;III)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_5
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    if-ne v0, v1, :cond_6

    iget-object p4, p4, Lla/f;->a:Ljava/lang/Object;

    check-cast p4, Lc5/f;

    invoke-virtual {p4, v2}, Lc5/f;->a(I)V

    goto :goto_0

    :cond_6
    sget-object v0, Lla/g;->j:Landroid/os/Handler;

    new-instance v1, Lla/d;

    invoke-direct {v1, p4, p1, v2, v5}, Lla/d;-><init>(Lla/f;III)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_0

    :cond_7
    monitor-exit p3

    return v5

    :goto_1
    monitor-exit p3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_8
    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result p1

    if-eqz p1, :cond_9

    sget-object p1, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {p1, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object p1

    move-object v4, p1

    check-cast v4, Landroid/os/Bundle;

    :cond_9
    const-string p1, "shizuku:attach-reply-uid"

    invoke-virtual {v4, p1, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    sget-object p1, Lla/g;->a:Landroid/os/IBinder;

    const-string p1, "shizuku:attach-reply-version"

    invoke-virtual {v4, p1, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    const-string p1, "shizuku:attach-reply-patch-version"

    invoke-virtual {v4, p1, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    const-string p1, "shizuku:attach-reply-secontext"

    invoke-virtual {v4, p1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    const-string p1, "shizuku:attach-reply-permission-granted"

    invoke-virtual {v4, p1, v3}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result p1

    sput-boolean p1, Lla/g;->c:Z

    const-string p1, "shizuku:attach-reply-should-show-request-permission-rationale"

    invoke-virtual {v4, p1, v3}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    invoke-static {}, Lla/g;->h()V

    return v5
.end method
