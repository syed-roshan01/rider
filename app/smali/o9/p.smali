.class public final Lo9/p;
.super Lw8/c;


# instance fields
.field public a:Lc9/a;

.field public synthetic b:Ljava/lang/Object;

.field public c:I


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lo9/p;->b:Ljava/lang/Object;

    iget p1, p0, Lo9/p;->c:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lo9/p;->c:I

    const/4 p1, 0x0

    invoke-static {p1, p1, p0}, Ld7/t;->E(Lo9/r;Lc9/a;Lu8/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
