.class public abstract Le1/e;
.super Ljava/lang/Object;


# static fields
.field public static final a:Landroid/graphics/Canvas;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroid/graphics/Canvas;

    invoke-direct {v0}, Landroid/graphics/Canvas;-><init>()V

    sput-object v0, Le1/e;->a:Landroid/graphics/Canvas;

    return-void
.end method

.method public static final a(Le1/p;)Landroid/graphics/Canvas;
    .locals 1

    const-string v0, "null cannot be cast to non-null type androidx.compose.ui.graphics.AndroidCanvas"

    invoke-static {p0, v0}, Ld7/a;->k(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Le1/d;

    iget-object p0, p0, Le1/d;->a:Landroid/graphics/Canvas;

    return-object p0
.end method
