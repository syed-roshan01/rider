.class public final Lq4/i;
.super Ljava/lang/Object;

# interfaces
.implements Lq4/l;


# instance fields
.field public final a:Lq4/m;

.field public final b:Lq4/h;


# direct methods
.method public constructor <init>(ILq4/m;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lq4/i;->a:Lq4/m;

    new-instance p2, Lq4/h;

    invoke-direct {p2, p1, p0}, Lq4/h;-><init>(ILq4/i;)V

    iput-object p2, p0, Lq4/i;->b:Lq4/h;

    return-void
.end method


# virtual methods
.method public final a(Lq4/c;)Lq4/d;
    .locals 2

    iget-object v0, p0, Lq4/i;->b:Lq4/h;

    invoke-virtual {v0, p1}, Lq/n;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lq4/g;

    if-eqz p1, :cond_0

    new-instance v0, Lq4/d;

    iget-object v1, p1, Lq4/g;->a:Landroid/graphics/Bitmap;

    iget-object p1, p1, Lq4/g;->b:Ljava/util/Map;

    invoke-direct {v0, v1, p1}, Lq4/d;-><init>(Landroid/graphics/Bitmap;Ljava/util/Map;)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public final b(I)V
    .locals 2

    const/16 v0, 0x28

    iget-object v1, p0, Lq4/i;->b:Lq4/h;

    if-lt p1, v0, :cond_0

    invoke-virtual {v1}, Lq/n;->evictAll()V

    goto :goto_0

    :cond_0
    const/16 v0, 0xa

    if-gt v0, p1, :cond_1

    const/16 v0, 0x14

    if-ge p1, v0, :cond_1

    invoke-virtual {v1}, Lq/n;->size()I

    move-result p1

    div-int/lit8 p1, p1, 0x2

    invoke-virtual {v1, p1}, Lq/n;->trimToSize(I)V

    :cond_1
    :goto_0
    return-void
.end method

.method public final c(Lq4/c;Landroid/graphics/Bitmap;Ljava/util/Map;)V
    .locals 3

    invoke-static {p2}, Lf6/a;->J(Landroid/graphics/Bitmap;)I

    move-result v0

    iget-object v1, p0, Lq4/i;->b:Lq4/h;

    invoke-virtual {v1}, Lq/n;->maxSize()I

    move-result v2

    if-gt v0, v2, :cond_0

    new-instance v2, Lq4/g;

    invoke-direct {v2, p2, p3, v0}, Lq4/g;-><init>(Landroid/graphics/Bitmap;Ljava/util/Map;I)V

    invoke-virtual {v1, p1, v2}, Lq/n;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    invoke-virtual {v1, p1}, Lq/n;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Lq4/i;->a:Lq4/m;

    invoke-interface {v1, p1, p2, p3, v0}, Lq4/m;->c(Lq4/c;Landroid/graphics/Bitmap;Ljava/util/Map;I)V

    :goto_0
    return-void
.end method
