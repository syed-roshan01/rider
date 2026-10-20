.class public final Lm4/b;
.super Ljava/lang/Object;

# interfaces
.implements Lm4/g;


# instance fields
.field public final synthetic a:I

.field public final b:Landroid/net/Uri;

.field public final c:Ls4/n;


# direct methods
.method public synthetic constructor <init>(Landroid/net/Uri;Ls4/n;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p3, p0, Lm4/b;->a:I

    iput-object p1, p0, Lm4/b;->b:Landroid/net/Uri;

    iput-object p2, p0, Lm4/b;->c:Ls4/n;

    return-void
.end method


# virtual methods
.method public final a(Lu8/e;)Ljava/lang/Object;
    .locals 9

    iget p1, p0, Lm4/b;->a:I

    iget-object v0, p0, Lm4/b;->b:Landroid/net/Uri;

    iget-object v1, p0, Lm4/b;->c:Ls4/n;

    const/4 v2, 0x1

    packed-switch p1, :pswitch_data_0

    iget-object p1, v1, Ls4/n;->a:Landroid/content/Context;

    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object p1

    invoke-virtual {v0}, Landroid/net/Uri;->getAuthority()Ljava/lang/String;

    move-result-object v3

    const-string v4, "com.android.contacts"

    invoke-static {v3, v4}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    const-string v4, "\'."

    const/4 v5, 0x0

    if-eqz v3, :cond_2

    invoke-virtual {v0}, Landroid/net/Uri;->getLastPathSegment()Ljava/lang/String;

    move-result-object v3

    const-string v6, "display_photo"

    invoke-static {v3, v6}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    const-string v1, "r"

    invoke-virtual {p1, v0, v1}, Landroid/content/ContentResolver;->openAssetFileDescriptor(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/res/AssetFileDescriptor;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Landroid/content/res/AssetFileDescriptor;->createInputStream()Ljava/io/FileInputStream;

    move-result-object v5

    :cond_0
    if-eqz v5, :cond_1

    goto/16 :goto_4

    :cond_1
    new-instance p1, Ljava/lang/StringBuilder;

    const-string v1, "Unable to find a contact photo associated with \'"

    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v6, 0x1d

    if-lt v3, v6, :cond_9

    invoke-virtual {v0}, Landroid/net/Uri;->getAuthority()Ljava/lang/String;

    move-result-object v3

    const-string v6, "media"

    invoke-static {v3, v6}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_3

    goto/16 :goto_3

    :cond_3
    invoke-virtual {v0}, Landroid/net/Uri;->getPathSegments()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v6

    const/4 v7, 0x3

    if-lt v6, v7, :cond_9

    add-int/lit8 v7, v6, -0x3

    invoke-interface {v3, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    const-string v8, "audio"

    invoke-static {v7, v8}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_9

    add-int/lit8 v6, v6, -0x2

    invoke-interface {v3, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    const-string v6, "albums"

    invoke-static {v3, v6}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_9

    iget-object v1, v1, Ls4/n;->d:Lt4/f;

    iget-object v3, v1, Lt4/f;->a:Lf6/a;

    instance-of v6, v3, Lt4/a;

    if-eqz v6, :cond_4

    check-cast v3, Lt4/a;

    goto :goto_0

    :cond_4
    move-object v3, v5

    :goto_0
    if-eqz v3, :cond_6

    iget-object v1, v1, Lt4/f;->b:Lf6/a;

    instance-of v6, v1, Lt4/a;

    if-eqz v6, :cond_5

    check-cast v1, Lt4/a;

    goto :goto_1

    :cond_5
    move-object v1, v5

    :goto_1
    if-eqz v1, :cond_6

    new-instance v6, Landroid/os/Bundle;

    invoke-direct {v6, v2}, Landroid/os/Bundle;-><init>(I)V

    new-instance v2, Landroid/graphics/Point;

    iget v3, v3, Lt4/a;->z:I

    iget v1, v1, Lt4/a;->z:I

    invoke-direct {v2, v3, v1}, Landroid/graphics/Point;-><init>(II)V

    const-string v1, "android.content.extra.SIZE"

    invoke-virtual {v6, v1, v2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    goto :goto_2

    :cond_6
    move-object v6, v5

    :goto_2
    invoke-static {p1, v0, v6}, Le1/b;->e(Landroid/content/ContentResolver;Landroid/net/Uri;Landroid/os/Bundle;)Landroid/content/res/AssetFileDescriptor;

    move-result-object v1

    if-eqz v1, :cond_7

    invoke-virtual {v1}, Landroid/content/res/AssetFileDescriptor;->createInputStream()Ljava/io/FileInputStream;

    move-result-object v5

    :cond_7
    if-eqz v5, :cond_8

    goto :goto_4

    :cond_8
    new-instance p1, Ljava/lang/StringBuilder;

    const-string v1, "Unable to find a music thumbnail associated with \'"

    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_9
    :goto_3
    invoke-virtual {p1, v0}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;

    move-result-object v5

    if-eqz v5, :cond_a

    :goto_4
    new-instance v1, Lm4/n;

    invoke-static {v5}, Lr9/a;->o(Ljava/io/InputStream;)Lja/c;

    move-result-object v2

    invoke-static {v2}, Lr9/a;->c(Lja/g0;)Lja/a0;

    move-result-object v2

    new-instance v3, Lk4/a;

    invoke-direct {v3, v0}, Lk4/a;-><init>(Ljava/lang/Comparable;)V

    new-instance v4, Lk4/r;

    invoke-direct {v4, v2, v3}, Lk4/r;-><init>(Lja/i;Lo7/d0;)V

    invoke-virtual {p1, v0}, Landroid/content/ContentResolver;->getType(Landroid/net/Uri;)Ljava/lang/String;

    move-result-object p1

    sget-object v0, Lk4/f;->c:Lk4/f;

    invoke-direct {v1, v4, p1, v0}, Lm4/n;-><init>(Lk4/o;Ljava/lang/String;Lk4/f;)V

    return-object v1

    :cond_a
    new-instance p1, Ljava/lang/StringBuilder;

    const-string v1, "Unable to open \'"

    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    invoke-virtual {v0}, Landroid/net/Uri;->getPathSegments()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    const-string v0, "<this>"

    invoke-static {p1, v0}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Ljava/util/Collection;

    if-eqz v0, :cond_12

    move-object v0, p1

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->size()I

    move-result v3

    sub-int/2addr v3, v2

    if-gtz v3, :cond_b

    sget-object p1, Lr8/r;->a:Lr8/r;

    goto/16 :goto_a

    :cond_b
    if-ne v3, v2, :cond_f

    instance-of v0, p1, Ljava/util/List;

    if-eqz v0, :cond_c

    check-cast p1, Ljava/util/List;

    invoke-static {p1}, Lr8/p;->L0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    goto :goto_6

    :cond_c
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_e

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    :goto_5
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_d

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    goto :goto_5

    :cond_d
    move-object p1, v0

    :goto_6
    invoke-static {p1}, Ld7/t;->d0(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    goto :goto_a

    :cond_e
    new-instance p1, Ljava/util/NoSuchElementException;

    const-string v0, "Collection is empty."

    invoke-direct {p1, v0}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_f
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4, v3}, Ljava/util/ArrayList;-><init>(I)V

    instance-of v3, p1, Ljava/util/List;

    if-eqz v3, :cond_13

    instance-of v3, p1, Ljava/util/RandomAccess;

    if-eqz v3, :cond_10

    invoke-interface {v0}, Ljava/util/Collection;->size()I

    move-result v0

    :goto_7
    if-ge v2, v0, :cond_11

    move-object v3, p1

    check-cast v3, Ljava/util/List;

    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_7

    :cond_10
    check-cast p1, Ljava/util/List;

    invoke-interface {p1, v2}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    move-result-object p1

    :goto_8
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_11

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_8

    :cond_11
    move-object p1, v4

    goto :goto_a

    :cond_12
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    :cond_13
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v0, 0x0

    :goto_9
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_15

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    if-lt v0, v2, :cond_14

    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_9

    :cond_14
    add-int/lit8 v0, v0, 0x1

    goto :goto_9

    :cond_15
    invoke-static {v4}, Ld7/t;->j0(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    :goto_a
    move-object v2, p1

    check-cast v2, Ljava/lang/Iterable;

    const-string v3, "/"

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/16 v7, 0x3e

    invoke-static/range {v2 .. v7}, Lr8/p;->K0(Ljava/lang/Iterable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lc9/c;I)Ljava/lang/String;

    move-result-object p1

    new-instance v0, Lm4/n;

    iget-object v1, v1, Ls4/n;->a:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v1

    invoke-virtual {v1, p1}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v1

    invoke-static {v1}, Lr9/a;->o(Ljava/io/InputStream;)Lja/c;

    move-result-object v1

    invoke-static {v1}, Lr9/a;->c(Lja/g0;)Lja/a0;

    move-result-object v1

    new-instance v2, Lk4/a;

    invoke-direct {v2, p1}, Lk4/a;-><init>(Ljava/lang/Comparable;)V

    new-instance v3, Lk4/r;

    invoke-direct {v3, v1, v2}, Lk4/r;-><init>(Lja/i;Lo7/d0;)V

    invoke-static {}, Landroid/webkit/MimeTypeMap;->getSingleton()Landroid/webkit/MimeTypeMap;

    move-result-object v1

    invoke-static {v1, p1}, Lw4/e;->b(Landroid/webkit/MimeTypeMap;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    sget-object v1, Lk4/f;->c:Lk4/f;

    invoke-direct {v0, v3, p1, v1}, Lm4/n;-><init>(Lk4/o;Ljava/lang/String;Lk4/f;)V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
