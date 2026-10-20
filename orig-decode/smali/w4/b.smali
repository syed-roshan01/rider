.class public final Lw4/b;
.super Lw8/c;


# instance fields
.field public a:Landroidx/lifecycle/r;

.field public b:Ld9/u;

.field public synthetic c:Ljava/lang/Object;

.field public d:I


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lw4/b;->c:Ljava/lang/Object;

    iget p1, p0, Lw4/b;->d:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lw4/b;->d:I

    const/4 p1, 0x0

    invoke-static {p1, p0}, Lf6/a;->o(Landroidx/lifecycle/r;Lu8/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
