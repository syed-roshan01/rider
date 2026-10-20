.class public final Lv/r0;
.super Lw8/c;


# instance fields
.field public a:Lc9/c;

.field public b:Lc9/c;

.field public c:Lo1/h0;

.field public d:Lo1/h0;

.field public e:Ld9/t;

.field public synthetic f:Ljava/lang/Object;

.field public n:I


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iput-object p1, p0, Lv/r0;->f:Ljava/lang/Object;

    iget p1, p0, Lv/r0;->n:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lv/r0;->n:I

    const/4 v0, 0x0

    const/4 v1, 0x0

    const-wide/16 v2, 0x0

    const/4 v4, 0x0

    move-object v5, p0

    invoke-static/range {v0 .. v5}, Lv/t0;->c(Lo1/h0;Lv/a;JLv/o0;Lu8/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
