.class public final Ll/j2;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/os/Parcelable$ClassLoaderCreator;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Ll/j2;->a:I

    return-void
.end method

.method public static a(Landroid/os/Parcel;Ljava/lang/ClassLoader;)Lm0/n1;
    .locals 2

    if-nez p1, :cond_0

    const-class p1, Ll/j2;

    invoke-virtual {p1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object p1

    :cond_0
    invoke-virtual {p0, p1}, Landroid/os/Parcel;->readValue(Ljava/lang/ClassLoader;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result p0

    new-instance v0, Lm0/n1;

    if-eqz p0, :cond_3

    const/4 v1, 0x1

    if-eq p0, v1, :cond_2

    const/4 v1, 0x2

    if-ne p0, v1, :cond_1

    sget-object p0, Lm0/h2;->a:Lm0/h2;

    goto :goto_0

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Unsupported MutableState policy "

    const-string v1, " was restored"

    invoke-static {v0, p0, v1}, Ll/q;->h(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    sget-object p0, Lm0/o3;->a:Lm0/o3;

    goto :goto_0

    :cond_3
    sget-object p0, Lm0/h1;->a:Lm0/h1;

    :goto_0
    invoke-direct {v0, p1, p0}, Lm0/y2;-><init>(Ljava/lang/Object;Lm0/z2;)V

    return-object v0
.end method


# virtual methods
.method public final createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Ll/j2;->a:I

    const/4 v1, 0x0

    packed-switch v0, :pswitch_data_0

    .line 8
    new-instance v0, La4/n0;

    invoke-direct {v0, p1, v1}, La4/n0;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V

    return-object v0

    .line 9
    :pswitch_0
    new-instance v0, Landroidx/fragment/app/c0;

    invoke-direct {v0, p1, v1}, Landroidx/fragment/app/c0;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V

    return-object v0

    .line 10
    :pswitch_1
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object p1

    if-nez p1, :cond_0

    sget-object p1, Lh3/b;->b:Lh3/a;

    return-object p1

    .line 11
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "superState must be null"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 12
    :pswitch_2
    invoke-static {p1, v1}, Ll/j2;->a(Landroid/os/Parcel;Ljava/lang/ClassLoader;)Lm0/n1;

    move-result-object p1

    return-object p1

    .line 13
    :pswitch_3
    new-instance v0, Ll/h3;

    invoke-direct {v0, p1, v1}, Ll/h3;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V

    return-object v0

    .line 14
    :pswitch_4
    new-instance v0, Ll/k2;

    invoke-direct {v0, p1, v1}, Ll/k2;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final createFromParcel(Landroid/os/Parcel;Ljava/lang/ClassLoader;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Ll/j2;->a:I

    packed-switch v0, :pswitch_data_0

    .line 1
    new-instance v0, La4/n0;

    invoke-direct {v0, p1, p2}, La4/n0;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V

    return-object v0

    .line 2
    :pswitch_0
    new-instance v0, Landroidx/fragment/app/c0;

    invoke-direct {v0, p1, p2}, Landroidx/fragment/app/c0;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V

    return-object v0

    .line 3
    :pswitch_1
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object p1

    if-nez p1, :cond_0

    sget-object p1, Lh3/b;->b:Lh3/a;

    return-object p1

    .line 4
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "superState must be null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 5
    :pswitch_2
    invoke-static {p1, p2}, Ll/j2;->a(Landroid/os/Parcel;Ljava/lang/ClassLoader;)Lm0/n1;

    move-result-object p1

    return-object p1

    .line 6
    :pswitch_3
    new-instance v0, Ll/h3;

    invoke-direct {v0, p1, p2}, Ll/h3;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V

    return-object v0

    .line 7
    :pswitch_4
    new-instance v0, Ll/k2;

    invoke-direct {v0, p1, p2}, Ll/k2;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final newArray(I)[Ljava/lang/Object;
    .locals 1

    iget v0, p0, Ll/j2;->a:I

    packed-switch v0, :pswitch_data_0

    new-array p1, p1, [La4/n0;

    return-object p1

    :pswitch_0
    new-array p1, p1, [Landroidx/fragment/app/c0;

    return-object p1

    :pswitch_1
    new-array p1, p1, [Lh3/b;

    return-object p1

    :pswitch_2
    new-array p1, p1, [Lm0/n1;

    return-object p1

    :pswitch_3
    new-array p1, p1, [Ll/h3;

    return-object p1

    :pswitch_4
    new-array p1, p1, [Ll/k2;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
