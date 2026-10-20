.class public abstract Landroidx/compose/ui/node/b;
.super Ljava/lang/Object;


# static fields
.field public static final a:Lt1/y0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lt1/y0;

    invoke-direct {v0}, Ly0/n;-><init>()V

    const/4 v1, -0x1

    iput v1, v0, Ly0/n;->d:I

    sput-object v0, Landroidx/compose/ui/node/b;->a:Lt1/y0;

    return-void
.end method

.method public static final a(Ly0/m;Ly0/m;)I
    .locals 1

    invoke-static {p0, p1}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p0, 0x2

    goto :goto_1

    :cond_0
    invoke-static {p0, p1}, Ld9/i;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    instance-of v0, p0, Landroidx/compose/ui/node/ForceUpdateElement;

    if-eqz v0, :cond_1

    check-cast p0, Landroidx/compose/ui/node/ForceUpdateElement;

    iget-object p0, p0, Landroidx/compose/ui/node/ForceUpdateElement;->b:Lt1/u0;

    invoke-static {p0, p1}, Ld9/i;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    goto :goto_1

    :cond_2
    :goto_0
    const/4 p0, 0x1

    :goto_1
    return p0
.end method
