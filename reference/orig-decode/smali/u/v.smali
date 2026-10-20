.class public final Lu/v;
.super Lt1/o;


# instance fields
.field public final A:Lb1/b;

.field public w:Lu/q;

.field public x:F

.field public y:Le1/n;

.field public z:Le1/l0;


# direct methods
.method public constructor <init>(FLe1/n;Le1/l0;)V
    .locals 0

    invoke-direct {p0}, Lt1/o;-><init>()V

    iput p1, p0, Lu/v;->x:F

    iput-object p2, p0, Lu/v;->y:Le1/n;

    iput-object p3, p0, Lu/v;->z:Le1/l0;

    new-instance p1, Lq/w;

    const/4 p2, 0x5

    invoke-direct {p1, p0, p2}, Lq/w;-><init>(Ljava/lang/Object;I)V

    new-instance p2, Lb1/c;

    new-instance p3, Lb1/d;

    invoke-direct {p3}, Lb1/d;-><init>()V

    invoke-direct {p2, p3, p1}, Lb1/c;-><init>(Lb1/d;Lc9/c;)V

    invoke-virtual {p0, p2}, Lt1/o;->G0(Ly0/n;)V

    iput-object p2, p0, Lu/v;->A:Lb1/b;

    return-void
.end method
