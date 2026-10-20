.class public abstract Lu/m;
.super Ljava/lang/Object;


# static fields
.field public static final a:Ly0/o;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1f

    if-lt v0, v1, :cond_0

    sget-object v0, Ly0/l;->b:Ly0/l;

    sget-object v1, Lu/l;->b:Lu/l;

    invoke-static {v0, v1}, Landroidx/compose/ui/layout/a;->g(Ly0/o;Lc9/f;)Ly0/o;

    move-result-object v0

    sget-object v1, Lu/l;->c:Lu/l;

    invoke-static {v0, v1}, Landroidx/compose/ui/layout/a;->g(Ly0/o;Lc9/f;)Ly0/o;

    move-result-object v0

    goto :goto_0

    :cond_0
    sget-object v0, Ly0/l;->b:Ly0/l;

    :goto_0
    sput-object v0, Lu/m;->a:Ly0/o;

    return-void
.end method
