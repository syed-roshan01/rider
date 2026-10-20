.class public final Lm4/c;
.super Ljava/lang/Object;

# interfaces
.implements Lm4/g;


# instance fields
.field public final synthetic a:I

.field public final b:Ls4/n;

.field public final c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ls4/n;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p3, p0, Lm4/c;->a:I

    iput-object p1, p0, Lm4/c;->c:Ljava/lang/Object;

    iput-object p2, p0, Lm4/c;->b:Ls4/n;

    return-void
.end method


# virtual methods
.method public final a(Lu8/e;)Ljava/lang/Object;
    .locals 7

    iget p1, p0, Lm4/c;->a:I

    const/4 v0, 0x0

    iget-object v1, p0, Lm4/c;->b:Ls4/n;

    iget-object v2, p0, Lm4/c;->c:Ljava/lang/Object;

    packed-switch p1, :pswitch_data_0

    check-cast v2, Landroid/graphics/drawable/Drawable;

    sget-object p1, Lw4/e;->a:[Landroid/graphics/Bitmap$Config;

    instance-of p1, v2, Landroid/graphics/drawable/VectorDrawable;

    if-nez p1, :cond_0

    instance-of p1, v2, Lg4/c;

    if-eqz p1, :cond_1

    :cond_0
    const/4 v0, 0x1

    :cond_1
    new-instance p1, Lm4/d;

    if-eqz v0, :cond_2

    iget-object v3, v1, Ls4/n;->b:Landroid/graphics/Bitmap$Config;

    iget-object v4, v1, Ls4/n;->d:Lt4/f;

    iget-object v5, v1, Ls4/n;->e:Lt4/e;

    iget-boolean v6, v1, Ls4/n;->f:Z

    invoke-static {v2, v3, v4, v5, v6}, Lw4/g;->a(Landroid/graphics/drawable/Drawable;Landroid/graphics/Bitmap$Config;Lt4/f;Lt4/e;Z)Landroid/graphics/Bitmap;

    move-result-object v2

    iget-object v1, v1, Ls4/n;->a:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    new-instance v3, Landroid/graphics/drawable/BitmapDrawable;

    invoke-direct {v3, v1, v2}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    move-object v2, v3

    :cond_2
    sget-object v1, Lk4/f;->b:Lk4/f;

    invoke-direct {p1, v2, v0, v1}, Lm4/d;-><init>(Landroid/graphics/drawable/Drawable;ZLk4/f;)V

    return-object p1

    :pswitch_0
    :try_start_0
    new-instance p1, Lja/g;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    move-object v3, v2

    check-cast v3, Ljava/nio/ByteBuffer;

    invoke-virtual {p1, v3}, Lja/g;->write(Ljava/nio/ByteBuffer;)I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    check-cast v2, Ljava/nio/ByteBuffer;

    invoke-virtual {v2, v0}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    new-instance v0, Lm4/n;

    iget-object v1, v1, Ls4/n;->a:Landroid/content/Context;

    new-instance v1, Lk4/r;

    const/4 v2, 0x0

    invoke-direct {v1, p1, v2}, Lk4/r;-><init>(Lja/i;Lo7/d0;)V

    sget-object p1, Lk4/f;->b:Lk4/f;

    invoke-direct {v0, v1, v2, p1}, Lm4/n;-><init>(Lk4/o;Ljava/lang/String;Lk4/f;)V

    return-object v0

    :catchall_0
    move-exception p1

    check-cast v2, Ljava/nio/ByteBuffer;

    invoke-virtual {v2, v0}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    throw p1

    :pswitch_1
    new-instance p1, Lm4/d;

    check-cast v2, Landroid/graphics/Bitmap;

    iget-object v1, v1, Ls4/n;->a:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    new-instance v3, Landroid/graphics/drawable/BitmapDrawable;

    invoke-direct {v3, v1, v2}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    sget-object v1, Lk4/f;->b:Lk4/f;

    invoke-direct {p1, v3, v0, v1}, Lm4/d;-><init>(Landroid/graphics/drawable/Drawable;ZLk4/f;)V

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
