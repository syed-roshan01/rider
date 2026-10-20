.class public abstract Lo1/c0;
.super Ljava/lang/Object;


# static fields
.field public static final a:Lo1/k;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lo1/k;

    sget-object v1, Lr8/r;->a:Lr8/r;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lo1/k;-><init>(Ljava/util/List;Lo1/f;)V

    sput-object v0, Lo1/c0;->a:Lo1/k;

    return-void
.end method

.method public static final a(Ly0/o;Ljava/lang/Object;Lc9/e;)Ly0/o;
    .locals 3

    new-instance v0, Landroidx/compose/ui/input/pointer/SuspendPointerInputElement;

    const/4 v1, 0x0

    const/4 v2, 0x6

    invoke-direct {v0, p1, v1, p2, v2}, Landroidx/compose/ui/input/pointer/SuspendPointerInputElement;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lc9/e;I)V

    invoke-interface {p0, v0}, Ly0/o;->j(Ly0/o;)Ly0/o;

    move-result-object p0

    return-object p0
.end method
