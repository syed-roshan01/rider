.class public final Lp9/h;
.super Lw8/c;


# instance fields
.field public a:Lp9/g;

.field public b:Lo9/s;

.field public c:Lo9/b;

.field public d:Z

.field public synthetic e:Ljava/lang/Object;

.field public f:I


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lp9/h;->e:Ljava/lang/Object;

    iget p1, p0, Lp9/h;->f:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lp9/h;->f:I

    const/4 p1, 0x0

    const/4 v0, 0x0

    invoke-static {p1, p1, v0, p0}, Lz6/a;->x(Lp9/g;Lo9/q;ZLu8/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
