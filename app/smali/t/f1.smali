.class public final Lt/f1;
.super Lw8/c;


# instance fields
.field public a:Lt/o;

.field public b:Lt/j;

.field public c:Lc9/c;

.field public d:Ld9/u;

.field public synthetic e:Ljava/lang/Object;

.field public f:I


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iput-object p1, p0, Lt/f1;->e:Ljava/lang/Object;

    iget p1, p0, Lt/f1;->f:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lt/f1;->f:I

    const/4 v0, 0x0

    const/4 v1, 0x0

    const-wide/16 v2, 0x0

    const/4 v4, 0x0

    move-object v5, p0

    invoke-static/range {v0 .. v5}, Lt/e;->c(Lt/o;Lt/j;JLc9/c;Lu8/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
