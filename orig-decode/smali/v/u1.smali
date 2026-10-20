.class public final Lv/u1;
.super Lt1/o;


# instance fields
.field public final A:Lv/t1;

.field public final B:Lv/w0;

.field public final w:Lv/l2;

.field public final x:Ln1/d;

.field public final y:Lv/n1;

.field public final z:Lt/l0;


# direct methods
.method public constructor <init>(Lv/l2;Lv/h1;ZLn1/d;Lx/m;)V
    .locals 10

    invoke-direct {p0}, Lt1/o;-><init>()V

    iput-object p1, p0, Lv/u1;->w:Lv/l2;

    iput-object p4, p0, Lv/u1;->x:Ln1/d;

    new-instance p4, Lv/g1;

    invoke-direct {p4, p1}, Lv/g1;-><init>(Lv/l2;)V

    invoke-virtual {p0, p4}, Lt1/o;->G0(Ly0/n;)V

    new-instance v1, Lv/n1;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    iput-object p1, v1, Lv/n1;->a:Lv/l2;

    sget-object p1, Landroidx/compose/foundation/gestures/a;->b:Lv/x1;

    iput-object p1, v1, Lv/n1;->b:Lv/r1;

    iput-object v1, p0, Lv/u1;->y:Lv/n1;

    new-instance v6, Lt/l0;

    const/4 p1, 0x5

    invoke-direct {v6, p0, p1}, Lt/l0;-><init>(Ljava/lang/Object;I)V

    iput-object v6, p0, Lv/u1;->z:Lt/l0;

    new-instance v8, Lv/t1;

    const/4 p1, 0x0

    invoke-direct {v8, p0, p1}, Lv/t1;-><init>(Lv/u1;Lu8/e;)V

    iput-object v8, p0, Lv/u1;->A:Lv/t1;

    sget-object v2, Lv/q0;->b:Lv/q0;

    sget-object v7, Landroidx/compose/foundation/gestures/a;->a:Lv/p0;

    new-instance p1, Lv/w0;

    const/4 v9, 0x0

    move-object v0, p1

    move-object v3, p2

    move v4, p3

    move-object v5, p5

    invoke-direct/range {v0 .. v9}, Lv/w0;-><init>(Lv/x0;Lv/q0;Lv/h1;ZLx/m;Lc9/a;Lc9/f;Lc9/f;Z)V

    invoke-virtual {p0, p1}, Lt1/o;->G0(Ly0/n;)V

    iput-object p1, p0, Lv/u1;->B:Lv/w0;

    return-void
.end method
