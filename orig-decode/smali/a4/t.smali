.class public abstract La4/t;
.super Ljava/lang/Object;


# instance fields
.field public final a:La4/e0;


# direct methods
.method public constructor <init>(La4/e0;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object p1, p0, La4/t;->a:La4/e0;

    return-void
.end method

.method public static a(La4/e0;I)La4/s;
    .locals 1

    if-eqz p1, :cond_1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    new-instance p1, La4/s;

    invoke-direct {p1, p0, v0}, La4/s;-><init>(La4/e0;I)V

    return-object p1

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "invalid orientation"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    new-instance p1, La4/s;

    const/4 v0, 0x0

    invoke-direct {p1, p0, v0}, La4/s;-><init>(La4/e0;I)V

    return-object p1
.end method


# virtual methods
.method public abstract b(Landroid/view/View;)I
.end method

.method public abstract c(Landroid/view/View;)I
.end method

.method public abstract d()I
.end method

.method public abstract e()I
.end method

.method public abstract f()I
.end method
