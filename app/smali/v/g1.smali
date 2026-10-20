.class public final Lv/g1;
.super Lt1/o;

# interfaces
.implements Lt1/m;


# instance fields
.field public final w:Lv/l2;

.field public x:Lv/k;


# direct methods
.method public constructor <init>(Lv/l2;)V
    .locals 1

    invoke-direct {p0}, Lt1/o;-><init>()V

    iput-object p1, p0, Lv/g1;->w:Lv/l2;

    new-instance p1, Lv/f1;

    const/4 v0, 0x0

    invoke-direct {p1, p0, v0}, Lv/f1;-><init>(Lv/g1;Lu8/e;)V

    sget-object v0, Lo1/c0;->a:Lo1/k;

    new-instance v0, Lo1/j0;

    invoke-direct {v0, p1}, Lo1/j0;-><init>(Lc9/e;)V

    invoke-virtual {p0, v0}, Lt1/o;->G0(Ly0/n;)V

    return-void
.end method


# virtual methods
.method public final z0()V
    .locals 1

    sget-object v0, Lv/k;->a:Lv/k;

    iput-object v0, p0, Lv/g1;->x:Lv/k;

    return-void
.end method
