.class public final Lq4/a;
.super Ljava/lang/Object;

# interfaces
.implements Lq4/l;


# instance fields
.field public final a:Lq4/m;


# direct methods
.method public constructor <init>(Lq4/m;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq4/a;->a:Lq4/m;

    return-void
.end method


# virtual methods
.method public final a(Lq4/c;)Lq4/d;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public final b(I)V
    .locals 0

    return-void
.end method

.method public final c(Lq4/c;Landroid/graphics/Bitmap;Ljava/util/Map;)V
    .locals 2

    invoke-static {p2}, Lf6/a;->J(Landroid/graphics/Bitmap;)I

    move-result v0

    iget-object v1, p0, Lq4/a;->a:Lq4/m;

    invoke-interface {v1, p1, p2, p3, v0}, Lq4/m;->c(Lq4/c;Landroid/graphics/Bitmap;Ljava/util/Map;I)V

    return-void
.end method
