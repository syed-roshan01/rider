.class public abstract Landroidx/compose/foundation/gestures/a;
.super Ljava/lang/Object;


# static fields
.field public static final a:Lv/p0;

.field public static final b:Lv/x1;

.field public static final c:Ls1/i;

.field public static final d:Lv/v1;

.field public static final e:Lv/y1;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lv/p0;

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-direct {v0, v2, v1}, Lv/p0;-><init>(ILu8/e;)V

    sput-object v0, Landroidx/compose/foundation/gestures/a;->a:Lv/p0;

    new-instance v0, Lv/x1;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Landroidx/compose/foundation/gestures/a;->b:Lv/x1;

    sget-object v0, Lv/w1;->a:Lv/w1;

    new-instance v1, Ls1/i;

    invoke-direct {v1, v0}, Ls1/c;-><init>(Lc9/a;)V

    sput-object v1, Landroidx/compose/foundation/gestures/a;->c:Ls1/i;

    new-instance v0, Lv/v1;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Landroidx/compose/foundation/gestures/a;->d:Lv/v1;

    new-instance v0, Lv/y1;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Landroidx/compose/foundation/gestures/a;->e:Lv/y1;

    return-void
.end method

.method public static final a(Lo1/h0;Lu8/e;)Ljava/lang/Object;
    .locals 5

    instance-of v0, p1, Lv/z1;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lv/z1;

    iget v1, v0, Lv/z1;->c:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lv/z1;->c:I

    goto :goto_0

    :cond_0
    new-instance v0, Lv/z1;

    invoke-direct {v0, p1}, Lw8/c;-><init>(Lu8/e;)V

    :goto_0
    iget-object p1, v0, Lv/z1;->b:Ljava/lang/Object;

    sget-object v1, Lv8/a;->a:Lv8/a;

    iget v2, v0, Lv/z1;->c:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p0, v0, Lv/z1;->a:Lo1/h0;

    invoke-static {p1}, Ld7/t;->v0(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p1}, Ld7/t;->v0(Ljava/lang/Object;)V

    :cond_3
    iput-object p0, v0, Lv/z1;->a:Lo1/h0;

    iput v3, v0, Lv/z1;->c:I

    sget-object p1, Lo1/l;->b:Lo1/l;

    invoke-virtual {p0, p1, v0}, Lo1/h0;->a(Lo1/l;Lw8/a;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    goto :goto_2

    :cond_4
    :goto_1
    check-cast p1, Lo1/k;

    iget v2, p1, Lo1/k;->c:I

    const/4 v4, 0x6

    invoke-static {v2, v4}, Lo1/s;->t(II)Z

    move-result v2

    if-eqz v2, :cond_3

    move-object v1, p1

    :goto_2
    return-object v1
.end method

.method public static final b(Ly0/o;Lv/f2;Lv/h1;Lu/b2;ZZLv/y0;Lx/m;Lv/o;)Ly0/o;
    .locals 10

    new-instance v9, Landroidx/compose/foundation/gestures/ScrollableElement;

    move-object v0, v9

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move v4, p4

    move v5, p5

    move-object/from16 v6, p6

    move-object/from16 v7, p7

    move-object/from16 v8, p8

    invoke-direct/range {v0 .. v8}, Landroidx/compose/foundation/gestures/ScrollableElement;-><init>(Lv/f2;Lv/h1;Lu/b2;ZZLv/y0;Lx/m;Lv/o;)V

    move-object v0, p0

    invoke-interface {p0, v9}, Ly0/o;->j(Ly0/o;)Ly0/o;

    move-result-object v0

    return-object v0
.end method

.method public static c(Ly0/o;Lv/f2;Lv/h1;Lu/b2;ZZLv/y0;Lx/m;)Ly0/o;
    .locals 10

    sget-object v0, Lv/o;->a:Lv/n;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v9, Lv/n;->c:Lv/m;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move v5, p4

    move v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    invoke-static/range {v1 .. v9}, Landroidx/compose/foundation/gestures/a;->b(Ly0/o;Lv/f2;Lv/h1;Lu/b2;ZZLv/y0;Lx/m;Lv/o;)Ly0/o;

    move-result-object v0

    return-object v0
.end method
