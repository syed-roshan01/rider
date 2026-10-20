.class public final Lw/k;
.super Lw8/c;


# instance fields
.field public a:F

.field public b:F

.field public c:Lt/o;

.field public d:Ld9/r;

.field public synthetic e:Ljava/lang/Object;

.field public f:I


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iput-object p1, p0, Lw/k;->e:Ljava/lang/Object;

    iget p1, p0, Lw/k;->f:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lw/k;->f:I

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v6, p0

    invoke-static/range {v0 .. v6}, Lw/l;->b(Lv/r1;FFLt/o;Lt/n;Lw/c;Lu8/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
