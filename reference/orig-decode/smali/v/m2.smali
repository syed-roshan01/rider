.class public final Lv/m2;
.super Lw8/c;


# instance fields
.field public a:Lo1/h0;

.field public b:Lo1/l;

.field public c:Z

.field public synthetic d:Ljava/lang/Object;

.field public e:I


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lv/m2;->d:Ljava/lang/Object;

    iget p1, p0, Lv/m2;->e:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lv/m2;->e:I

    const/4 p1, 0x0

    const/4 v0, 0x0

    invoke-static {p1, v0, p1, p0}, Lv/k3;->b(Lo1/h0;ZLo1/l;Lu8/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
