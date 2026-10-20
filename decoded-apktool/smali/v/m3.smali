.class public final Lv/m3;
.super Ljava/lang/Object;


# static fields
.field public static final f:Lt/p;


# instance fields
.field public final a:Lt/z1;

.field public b:J

.field public c:Lt/p;

.field public d:Z

.field public e:F


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lt/p;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lt/p;-><init>(F)V

    sput-object v0, Lv/m3;->f:Lt/p;

    return-void
.end method

.method public constructor <init>(Lt/n;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lt/y1;->a:Lt/x1;

    invoke-interface {p1, v0}, Lt/n;->a(Lt/x1;)Lt/z1;

    move-result-object p1

    iput-object p1, p0, Lv/m3;->a:Lt/z1;

    const-wide/high16 v0, -0x8000000000000000L

    iput-wide v0, p0, Lv/m3;->b:J

    sget-object p1, Lv/m3;->f:Lt/p;

    iput-object p1, p0, Lv/m3;->c:Lt/p;

    return-void
.end method


# virtual methods
.method public final a(Lb/g;Lt/l0;Lu8/e;)Ljava/lang/Object;
    .locals 17

    move-object/from16 v1, p0

    move-object/from16 v0, p3

    instance-of v2, v0, Lv/l3;

    if-eqz v2, :cond_0

    move-object v2, v0

    check-cast v2, Lv/l3;

    iget v3, v2, Lv/l3;->n:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lv/l3;->n:I

    goto :goto_0

    :cond_0
    new-instance v2, Lv/l3;

    invoke-direct {v2, v1, v0}, Lv/l3;-><init>(Lv/m3;Lu8/e;)V

    :goto_0
    iget-object v0, v2, Lv/l3;->e:Ljava/lang/Object;

    sget-object v3, Lv8/a;->a:Lv8/a;

    iget v4, v2, Lv/l3;->n:I

    sget-object v5, Lv/m3;->f:Lt/p;

    const/4 v6, 0x0

    const-wide/high16 v7, -0x8000000000000000L

    const/4 v9, 0x0

    const/4 v10, 0x2

    const/4 v11, 0x1

    if-eqz v4, :cond_3

    if-eq v4, v11, :cond_2

    if-ne v4, v10, :cond_1

    iget-object v3, v2, Lv/l3;->b:Lq8/a;

    check-cast v3, Lc9/a;

    iget-object v2, v2, Lv/l3;->a:Lv/m3;

    :try_start_0
    invoke-static {v0}, Ld7/t;->v0(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_5

    :catchall_0
    move-exception v0

    goto/16 :goto_7

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    iget v4, v2, Lv/l3;->d:F

    iget-object v12, v2, Lv/l3;->c:Lc9/a;

    iget-object v13, v2, Lv/l3;->b:Lq8/a;

    check-cast v13, Lc9/c;

    iget-object v14, v2, Lv/l3;->a:Lv/m3;

    :try_start_1
    invoke-static {v0}, Ld7/t;->v0(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-object v0, v13

    move v13, v4

    move-object v4, v2

    move-object v2, v12

    move-object v12, v3

    move-object v3, v14

    goto :goto_3

    :catchall_1
    move-exception v0

    move-object v2, v14

    goto/16 :goto_7

    :cond_3
    invoke-static {v0}, Ld7/t;->v0(Ljava/lang/Object;)V

    iget-boolean v0, v1, Lv/m3;->d:Z

    xor-int/2addr v0, v11

    if-eqz v0, :cond_a

    invoke-interface {v2}, Lu8/e;->getContext()Lu8/j;

    move-result-object v0

    sget-object v4, Ly0/a;->r:Ly0/a;

    invoke-interface {v0, v4}, Lu8/j;->f(Lu8/i;)Lu8/h;

    move-result-object v0

    check-cast v0, Ly0/p;

    if-eqz v0, :cond_4

    invoke-interface {v0}, Ly0/p;->P()F

    move-result v0

    goto :goto_1

    :cond_4
    const/high16 v0, 0x3f800000    # 1.0f

    :goto_1
    iput-boolean v11, v1, Lv/m3;->d:Z

    move v13, v0

    move-object v4, v2

    move-object v12, v3

    move-object/from16 v0, p1

    move-object/from16 v2, p2

    move-object v3, v1

    :cond_5
    :try_start_2
    iget v14, v3, Lv/m3;->e:F

    invoke-static {v14}, Ljava/lang/Math;->abs(F)F

    move-result v14

    const v15, 0x3c23d70a    # 0.01f

    cmpg-float v14, v14, v15

    if-gez v14, :cond_6

    :goto_2
    move-object/from16 v16, v3

    move-object v3, v2

    move-object/from16 v2, v16

    goto :goto_4

    :cond_6
    new-instance v14, Lu/o;

    invoke-direct {v14, v3, v13, v0, v11}, Lu/o;-><init>(Ljava/lang/Object;FLjava/lang/Object;I)V

    iput-object v3, v4, Lv/l3;->a:Lv/m3;

    iput-object v0, v4, Lv/l3;->b:Lq8/a;

    iput-object v2, v4, Lv/l3;->c:Lc9/a;

    iput v13, v4, Lv/l3;->d:F

    iput v11, v4, Lv/l3;->n:I

    invoke-interface {v4}, Lu8/e;->getContext()Lu8/j;

    move-result-object v15

    invoke-static {v15}, Ld9/i;->p(Lu8/j;)Lm0/a1;

    move-result-object v15

    invoke-interface {v15, v14, v4}, Lm0/a1;->T(Lc9/c;Lu8/e;)Ljava/lang/Object;

    move-result-object v14

    if-ne v14, v12, :cond_7

    return-object v12

    :cond_7
    :goto_3
    invoke-interface {v2}, Lc9/a;->invoke()Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    cmpg-float v14, v13, v9

    if-nez v14, :cond_5

    goto :goto_2

    :goto_4
    :try_start_3
    iget v11, v2, Lv/m3;->e:F

    invoke-static {v11}, Ljava/lang/Math;->abs(F)F

    move-result v11

    cmpg-float v9, v11, v9

    if-nez v9, :cond_8

    goto :goto_6

    :cond_8
    new-instance v9, Lu/s;

    const/4 v11, 0x5

    invoke-direct {v9, v11, v2, v0}, Lu/s;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    iput-object v2, v4, Lv/l3;->a:Lv/m3;

    iput-object v3, v4, Lv/l3;->b:Lq8/a;

    const/4 v0, 0x0

    iput-object v0, v4, Lv/l3;->c:Lc9/a;

    iput v10, v4, Lv/l3;->n:I

    invoke-interface {v4}, Lu8/e;->getContext()Lu8/j;

    move-result-object v0

    invoke-static {v0}, Ld9/i;->p(Lu8/j;)Lm0/a1;

    move-result-object v0

    invoke-interface {v0, v9, v4}, Lm0/a1;->T(Lc9/c;Lu8/e;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v12, :cond_9

    return-object v12

    :cond_9
    :goto_5
    invoke-interface {v3}, Lc9/a;->invoke()Ljava/lang/Object;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :goto_6
    iput-wide v7, v2, Lv/m3;->b:J

    iput-object v5, v2, Lv/m3;->c:Lt/p;

    iput-boolean v6, v2, Lv/m3;->d:Z

    sget-object v0, Lq8/l;->a:Lq8/l;

    return-object v0

    :catchall_2
    move-exception v0

    move-object v2, v3

    :goto_7
    iput-wide v7, v2, Lv/m3;->b:J

    iput-object v5, v2, Lv/m3;->c:Lt/p;

    iput-boolean v6, v2, Lv/m3;->d:Z

    throw v0

    :cond_a
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "animateToZero called while previous animation is running"

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
