.class public final Lp9/t;
.super Lw8/c;


# instance fields
.field public a:Lc9/e;

.field public b:Ld9/u;

.field public c:Lp9/r;

.field public synthetic d:Ljava/lang/Object;

.field public e:I


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lp9/t;->d:Ljava/lang/Object;

    iget p1, p0, Lp9/t;->e:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lp9/t;->e:I

    const/4 p1, 0x0

    invoke-static {p1, p1, p0}, Lh6/g;->W(Lp9/f;Lc9/e;Lu8/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
