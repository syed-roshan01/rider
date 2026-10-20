.class public final Lv/f0;
.super Lw8/c;


# instance fields
.field public a:Lo1/u;

.field public b:Ld9/u;

.field public synthetic c:Ljava/lang/Object;

.field public d:I


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iput-object p1, p0, Lv/f0;->c:Ljava/lang/Object;

    iget p1, p0, Lv/f0;->d:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lv/f0;->d:I

    const/4 p1, 0x0

    const-wide/16 v0, 0x0

    invoke-static {v0, v1, p1, p0}, Lv/j0;->b(JLo1/h0;Lu8/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
