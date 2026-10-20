.class public final Lp9/s;
.super Lw8/c;


# instance fields
.field public a:Ld9/u;

.field public b:Lp9/p;

.field public synthetic c:Ljava/lang/Object;

.field public d:I


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lp9/s;->c:Ljava/lang/Object;

    iget p1, p0, Lp9/s;->d:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lp9/s;->d:I

    const/4 p1, 0x0

    invoke-static {p1, p0}, Lh6/g;->V(La4/c0;Lu8/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
