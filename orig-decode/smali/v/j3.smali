.class public final Lv/j3;
.super Lw8/c;


# instance fields
.field public a:Lo1/h0;

.field public b:Lo1/l;

.field public synthetic c:Ljava/lang/Object;

.field public d:I


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lv/j3;->c:Ljava/lang/Object;

    iget p1, p0, Lv/j3;->d:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lv/j3;->d:I

    const/4 p1, 0x0

    invoke-static {p1, p1, p0}, Lv/k3;->d(Lo1/h0;Lo1/l;Lu8/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
