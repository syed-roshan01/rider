.class public final Lv/z1;
.super Lw8/c;


# instance fields
.field public a:Lo1/h0;

.field public synthetic b:Ljava/lang/Object;

.field public c:I


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lv/z1;->b:Ljava/lang/Object;

    iget p1, p0, Lv/z1;->c:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lv/z1;->c:I

    const/4 p1, 0x0

    invoke-static {p1, p0}, Landroidx/compose/foundation/gestures/a;->a(Lo1/h0;Lu8/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
