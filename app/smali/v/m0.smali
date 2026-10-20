.class public final Lv/m0;
.super Lw8/c;


# instance fields
.field public a:Ljava/lang/Object;

.field public b:Ljava/lang/Object;

.field public c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;

.field public e:Ljava/lang/Object;

.field public f:Lo1/u;

.field public n:F

.field public o:J

.field public synthetic p:Ljava/lang/Object;

.field public q:I


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iput-object p1, p0, Lv/m0;->p:Ljava/lang/Object;

    iget p1, p0, Lv/m0;->q:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lv/m0;->q:I

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v5, p0

    invoke-static/range {v0 .. v5}, Lv/t0;->a(Lo1/h0;Lv/a;Lt/l0;Lp1/d;Lv/d0;Lu8/e;)Ljava/io/Serializable;

    move-result-object p1

    return-object p1
.end method
