.class public abstract Lu/i0;
.super Ljava/lang/Object;


# static fields
.field public static final a:F

.field public static final b:Ly0/o;

.field public static final c:Ly0/o;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const/16 v0, 0x1e

    int-to-float v0, v0

    sput v0, Lu/i0;->a:F

    sget-object v0, Ly0/l;->b:Ly0/l;

    new-instance v1, Lx9/v;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lx9/v;-><init>(I)V

    invoke-static {v0, v1}, Landroidx/compose/ui/draw/a;->b(Ly0/o;Le1/l0;)Ly0/o;

    move-result-object v1

    sput-object v1, Lu/i0;->b:Ly0/o;

    new-instance v1, Lx9/v;

    const/4 v2, 0x1

    invoke-direct {v1, v2}, Lx9/v;-><init>(I)V

    invoke-static {v0, v1}, Landroidx/compose/ui/draw/a;->b(Ly0/o;Le1/l0;)Ly0/o;

    move-result-object v0

    sput-object v0, Lu/i0;->c:Ly0/o;

    return-void
.end method
