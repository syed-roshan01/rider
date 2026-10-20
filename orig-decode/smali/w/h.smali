.class public final Lw/h;
.super Ljava/lang/Object;

# interfaces
.implements Lv/y0;


# instance fields
.field public final a:Lb0/p;

.field public final b:Lt/n;

.field public final c:Lt/y;

.field public final d:Lt/n;

.field public final e:Lv/v1;


# direct methods
.method public constructor <init>(Lb0/p;Lt/n;Lt/y;Lt/n;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw/h;->a:Lb0/p;

    iput-object p2, p0, Lw/h;->b:Lt/n;

    iput-object p3, p0, Lw/h;->c:Lt/y;

    iput-object p4, p0, Lw/h;->d:Lt/n;

    sget-object p1, Landroidx/compose/foundation/gestures/a;->d:Lv/v1;

    iput-object p1, p0, Lw/h;->e:Lv/v1;

    return-void
.end method

.method public static final b(Lw/h;Lv/r1;FFLw/c;Lu8/e;)Ljava/lang/Object;
    .locals 7

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    instance-of v0, p5, Lw/g;

    if-eqz v0, :cond_0

    move-object v0, p5

    check-cast v0, Lw/g;

    iget v1, v0, Lw/g;->c:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lw/g;->c:I

    :goto_0
    move-object v6, v0

    goto :goto_1

    :cond_0
    new-instance v0, Lw/g;

    invoke-direct {v0, p0, p5}, Lw/g;-><init>(Lw/h;Lu8/e;)V

    goto :goto_0

    :goto_1
    iget-object p5, v6, Lw/g;->a:Ljava/lang/Object;

    sget-object v0, Lv8/a;->a:Lv8/a;

    iget v1, v6, Lw/g;->c:I

    const/4 v2, 0x1

    if-eqz v1, :cond_2

    if-ne v1, v2, :cond_1

    invoke-static {p5}, Ld7/t;->v0(Ljava/lang/Object;)V

    goto/16 :goto_7

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p5}, Ld7/t;->v0(Ljava/lang/Object;)V

    invoke-static {p2}, Ljava/lang/Math;->abs(F)F

    move-result p5

    const/4 v1, 0x0

    cmpg-float p5, p5, v1

    if-nez p5, :cond_3

    goto :goto_2

    :cond_3
    invoke-static {p3}, Ljava/lang/Math;->abs(F)F

    move-result p5

    cmpg-float p5, p5, v1

    if-nez p5, :cond_4

    :goto_2
    invoke-static {p2, p3}, Lt/e;->b(FF)Lt/o;

    move-result-object p0

    :goto_3
    move-object v0, p0

    goto/16 :goto_8

    :cond_4
    iput v2, v6, Lw/g;->c:I

    sget-object p5, Lt/y1;->a:Lt/x1;

    new-instance p5, Lt/d2;

    iget-object v3, p0, Lw/h;->c:Lt/y;

    iget-object v4, v3, Lt/y;->a:Lt/g0;

    invoke-direct {p5, v4}, Lt/d2;-><init>(Lt/g0;)V

    new-instance v4, Lt/p;

    invoke-direct {v4, v1}, Lt/p;-><init>(F)V

    new-instance v1, Lt/p;

    invoke-direct {v1, p3}, Lt/p;-><init>(F)V

    invoke-virtual {p5, v4, v1}, Lt/d2;->a(Lt/t;Lt/t;)Lt/t;

    move-result-object p5

    check-cast p5, Lt/p;

    iget p5, p5, Lt/p;->a:F

    invoke-static {p5}, Ljava/lang/Math;->abs(F)F

    move-result p5

    invoke-static {p2}, Ljava/lang/Math;->abs(F)F

    move-result v1

    cmpl-float p5, p5, v1

    if-ltz p5, :cond_5

    new-instance p0, La4/c0;

    const/4 p5, 0x0

    invoke-direct {p0, v3, p5}, La4/c0;-><init>(Ljava/lang/Object;I)V

    move-object v1, p0

    goto :goto_4

    :cond_5
    new-instance p5, La4/c0;

    iget-object p0, p0, Lw/h;->b:Lt/n;

    invoke-direct {p5, p0, v2}, La4/c0;-><init>(Ljava/lang/Object;I)V

    move-object v1, p5

    :goto_4
    sget p0, Lw/l;->a:F

    new-instance p0, Ljava/lang/Float;

    invoke-direct {p0, p2}, Ljava/lang/Float;-><init>(F)V

    new-instance p2, Ljava/lang/Float;

    invoke-direct {p2, p3}, Ljava/lang/Float;-><init>(F)V

    iget p3, v1, La4/c0;->a:I

    packed-switch p3, :pswitch_data_0

    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    move-result v3

    invoke-virtual {p2}, Ljava/lang/Number;->floatValue()F

    move-result v4

    move-object v2, p1

    move-object v5, p4

    invoke-virtual/range {v1 .. v6}, La4/c0;->e(Lv/r1;FFLw/c;Lw/g;)Ljava/lang/Object;

    move-result-object p0

    :goto_5
    move-object p5, p0

    goto :goto_6

    :pswitch_0
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    move-result v3

    invoke-virtual {p2}, Ljava/lang/Number;->floatValue()F

    move-result v4

    move-object v2, p1

    move-object v5, p4

    invoke-virtual/range {v1 .. v6}, La4/c0;->e(Lv/r1;FFLw/c;Lw/g;)Ljava/lang/Object;

    move-result-object p0

    goto :goto_5

    :goto_6
    if-ne p5, v0, :cond_6

    goto :goto_8

    :cond_6
    :goto_7
    check-cast p5, Lw/a;

    iget-object p0, p5, Lw/a;->b:Lt/o;

    goto :goto_3

    :goto_8
    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final a(Lv/h2;FLu8/e;)Ljava/lang/Object;
    .locals 1

    sget-object v0, Lw/e;->a:Lw/e;

    invoke-virtual {p0, p1, p2, v0, p3}, Lw/h;->d(Lv/h2;FLc9/c;Lu8/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final c(Lv/h2;FLc9/c;Lu8/e;)Ljava/lang/Object;
    .locals 10

    instance-of v0, p4, Lw/b;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, Lw/b;

    iget v1, v0, Lw/b;->d:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lw/b;->d:I

    goto :goto_0

    :cond_0
    new-instance v0, Lw/b;

    invoke-direct {v0, p0, p4}, Lw/b;-><init>(Lw/h;Lu8/e;)V

    :goto_0
    iget-object p4, v0, Lw/b;->b:Ljava/lang/Object;

    sget-object v1, Lv8/a;->a:Lv8/a;

    iget v2, v0, Lw/b;->d:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p3, v0, Lw/b;->a:Lc9/c;

    invoke-static {p4}, Ld7/t;->v0(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p4}, Ld7/t;->v0(Ljava/lang/Object;)V

    iget-object p4, p0, Lw/h;->e:Lv/v1;

    new-instance v2, Lw/d;

    const/4 v8, 0x0

    move-object v4, v2

    move v5, p2

    move-object v6, p1

    move-object v7, p0

    move-object v9, p3

    invoke-direct/range {v4 .. v9}, Lw/d;-><init>(FLv/r1;Lw/h;Lu8/e;Lc9/c;)V

    iput-object p3, v0, Lw/b;->a:Lc9/c;

    iput v3, v0, Lw/b;->d:I

    invoke-static {p4, v2, v0}, Lz6/a;->u0(Lu8/j;Lc9/e;Lu8/e;)Ljava/lang/Object;

    move-result-object p4

    if-ne p4, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p4, Lw/a;

    new-instance p1, Ljava/lang/Float;

    const/4 p2, 0x0

    invoke-direct {p1, p2}, Ljava/lang/Float;-><init>(F)V

    invoke-interface {p3, p1}, Lc9/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p4
.end method

.method public final d(Lv/h2;FLc9/c;Lu8/e;)Ljava/lang/Object;
    .locals 4

    instance-of v0, p4, Lw/f;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, Lw/f;

    iget v1, v0, Lw/f;->c:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lw/f;->c:I

    goto :goto_0

    :cond_0
    new-instance v0, Lw/f;

    invoke-direct {v0, p0, p4}, Lw/f;-><init>(Lw/h;Lu8/e;)V

    :goto_0
    iget-object p4, v0, Lw/f;->a:Ljava/lang/Object;

    sget-object v1, Lv8/a;->a:Lv8/a;

    iget v2, v0, Lw/f;->c:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p4}, Ld7/t;->v0(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p4}, Ld7/t;->v0(Ljava/lang/Object;)V

    iput v3, v0, Lw/f;->c:I

    invoke-virtual {p0, p1, p2, p3, v0}, Lw/h;->c(Lv/h2;FLc9/c;Lu8/e;)Ljava/lang/Object;

    move-result-object p4

    if-ne p4, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p4, Lw/a;

    iget-object p1, p4, Lw/a;->a:Ljava/lang/Object;

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    move-result p1

    const/4 p2, 0x0

    cmpg-float p1, p1, p2

    if-nez p1, :cond_4

    goto :goto_2

    :cond_4
    iget-object p1, p4, Lw/a;->b:Lt/o;

    invoke-virtual {p1}, Lt/o;->b()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    move-result p2

    :goto_2
    new-instance p1, Ljava/lang/Float;

    invoke-direct {p1, p2}, Ljava/lang/Float;-><init>(F)V

    return-object p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, Lw/h;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p1, Lw/h;

    iget-object v0, p1, Lw/h;->d:Lt/n;

    iget-object v2, p0, Lw/h;->d:Lt/n;

    invoke-static {v0, v2}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p1, Lw/h;->c:Lt/y;

    iget-object v2, p0, Lw/h;->c:Lt/y;

    invoke-static {v0, v2}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p1, Lw/h;->b:Lt/n;

    iget-object v2, p0, Lw/h;->b:Lt/n;

    invoke-static {v0, v2}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p1, p1, Lw/h;->a:Lb0/p;

    iget-object v0, p0, Lw/h;->a:Lb0/p;

    invoke-static {p1, v0}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 v1, 0x1

    :cond_0
    return v1
.end method

.method public final hashCode()I
    .locals 2

    iget-object v0, p0, Lw/h;->d:Lt/n;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lw/h;->c:Lt/y;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lw/h;->b:Lt/n;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lw/h;->a:Lb0/p;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method
