.class public final Lw/i;
.super Lw8/c;


# instance fields
.field public a:F

.field public b:Lt/o;

.field public c:Ld9/r;

.field public synthetic d:Ljava/lang/Object;

.field public e:I


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iput-object p1, p0, Lw/i;->d:Ljava/lang/Object;

    iget p1, p0, Lw/i;->e:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lw/i;->e:I

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v5, p0

    invoke-static/range {v0 .. v5}, Lw/l;->a(Lv/r1;FLt/o;Lt/y;Lw/c;Lu8/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
