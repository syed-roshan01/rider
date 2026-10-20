.class public final Lm4/a;
.super Ljava/lang/Object;

# interfaces
.implements Lm4/f;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lm4/a;->a:I

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Ls4/n;Li4/i;)Lm4/g;
    .locals 1

    iget p3, p0, Lm4/a;->a:I

    packed-switch p3, :pswitch_data_0

    check-cast p1, Landroid/net/Uri;

    invoke-virtual {p0, p1, p2}, Lm4/a;->b(Landroid/net/Uri;Ls4/n;)Lm4/g;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Ljava/io/File;

    new-instance p2, Lm4/h;

    invoke-direct {p2, p1}, Lm4/h;-><init>(Ljava/io/File;)V

    return-object p2

    :pswitch_1
    check-cast p1, Landroid/graphics/drawable/Drawable;

    new-instance p3, Lm4/c;

    const/4 v0, 0x2

    invoke-direct {p3, p1, p2, v0}, Lm4/c;-><init>(Ljava/lang/Object;Ls4/n;I)V

    return-object p3

    :pswitch_2
    check-cast p1, Landroid/net/Uri;

    invoke-virtual {p0, p1, p2}, Lm4/a;->b(Landroid/net/Uri;Ls4/n;)Lm4/g;

    move-result-object p1

    return-object p1

    :pswitch_3
    check-cast p1, Ljava/nio/ByteBuffer;

    new-instance p3, Lm4/c;

    const/4 v0, 0x1

    invoke-direct {p3, p1, p2, v0}, Lm4/c;-><init>(Ljava/lang/Object;Ls4/n;I)V

    return-object p3

    :pswitch_4
    check-cast p1, Landroid/graphics/Bitmap;

    new-instance p3, Lm4/c;

    const/4 v0, 0x0

    invoke-direct {p3, p1, p2, v0}, Lm4/c;-><init>(Ljava/lang/Object;Ls4/n;I)V

    return-object p3

    :pswitch_5
    check-cast p1, Landroid/net/Uri;

    invoke-virtual {p0, p1, p2}, Lm4/a;->b(Landroid/net/Uri;Ls4/n;)Lm4/g;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final b(Landroid/net/Uri;Ls4/n;)Lm4/g;
    .locals 3

    iget v0, p0, Lm4/a;->a:I

    const/4 v1, 0x0

    sparse-switch v0, :sswitch_data_0

    invoke-virtual {p1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v0

    const-string v2, "android.resource"

    invoke-static {v0, v2}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v1, Lm4/m;

    invoke-direct {v1, p1, p2}, Lm4/m;-><init>(Landroid/net/Uri;Ls4/n;)V

    :goto_0
    return-object v1

    :sswitch_0
    invoke-virtual {p1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v0

    const-string v2, "content"

    invoke-static {v0, v2}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    new-instance v1, Lm4/b;

    const/4 v0, 0x1

    invoke-direct {v1, p1, p2, v0}, Lm4/b;-><init>(Landroid/net/Uri;Ls4/n;I)V

    :goto_1
    return-object v1

    :sswitch_1
    invoke-static {p1}, Lw4/e;->d(Landroid/net/Uri;)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_2

    :cond_2
    new-instance v1, Lm4/b;

    const/4 v0, 0x0

    invoke-direct {v1, p1, p2, v0}, Lm4/b;-><init>(Landroid/net/Uri;Ls4/n;I)V

    :goto_2
    return-object v1

    nop

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_1
        0x3 -> :sswitch_0
    .end sparse-switch
.end method
