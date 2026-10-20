.class public abstract La2/y;
.super Ljava/lang/Object;


# static fields
.field public static final a:J

.field public static final b:J

.field public static final c:J

.field public static final d:J

.field public static final synthetic e:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/16 v0, 0xe

    invoke-static {v0}, Lo1/s;->N(I)J

    move-result-wide v0

    sput-wide v0, La2/y;->a:J

    const/4 v0, 0x0

    invoke-static {v0}, Lo1/s;->N(I)J

    move-result-wide v0

    sput-wide v0, La2/y;->b:J

    sget v0, Le1/r;->h:I

    sget-wide v0, Le1/r;->f:J

    sput-wide v0, La2/y;->c:J

    sget-wide v0, Le1/r;->b:J

    sput-wide v0, La2/y;->d:J

    return-void
.end method

.method public static final a(La2/x;JLe1/n;FJLf2/l;Lf2/j;Lf2/k;Lf2/e;Ljava/lang/String;JLl2/a;Ll2/p;Lh2/d;JLl2/j;Le1/k0;La2/s;Lg1/h;)La2/x;
    .locals 18

    move-object/from16 v0, p0

    move-wide/from16 v1, p1

    move-object/from16 v3, p3

    move/from16 v4, p4

    move-object/from16 v5, p7

    move-object/from16 v6, p8

    move-object/from16 v7, p9

    move-object/from16 v8, p10

    move-object/from16 v9, p11

    move-object/from16 v10, p14

    move-object/from16 v11, p15

    move-object/from16 v12, p16

    move-wide/from16 v13, p17

    move-object/from16 v15, p19

    invoke-static/range {p5 .. p6}, Lo1/s;->V(J)Z

    move-result v16

    const/4 v13, 0x1

    xor-int/lit8 v14, v16, 0x1

    if-eqz v14, :cond_3

    iget-wide v13, v0, La2/x;->b:J

    move-wide/from16 v11, p5

    invoke-static {v11, v12, v13, v14}, Lm2/n;->a(JJ)Z

    move-result v13

    if-eqz v13, :cond_0

    goto :goto_0

    :cond_0
    move-wide/from16 v13, p17

    :cond_1
    move-object/from16 v11, p20

    :cond_2
    move-object/from16 v15, p22

    goto/16 :goto_3

    :cond_3
    move-wide/from16 v11, p5

    :goto_0
    if-nez v3, :cond_4

    sget-wide v13, Le1/r;->g:J

    cmp-long v13, v1, v13

    if-eqz v13, :cond_4

    iget-object v13, v0, La2/x;->a:Ll2/o;

    invoke-interface {v13}, Ll2/o;->d()J

    move-result-wide v13

    invoke-static {v1, v2, v13, v14}, Le1/r;->c(JJ)Z

    move-result v13

    if-eqz v13, :cond_0

    :cond_4
    if-eqz v6, :cond_5

    iget-object v13, v0, La2/x;->d:Lf2/j;

    invoke-static {v6, v13}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_0

    :cond_5
    if-eqz v5, :cond_6

    iget-object v13, v0, La2/x;->c:Lf2/l;

    invoke-static {v5, v13}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_0

    :cond_6
    if-eqz v8, :cond_7

    iget-object v13, v0, La2/x;->f:Lf2/e;

    if-ne v8, v13, :cond_0

    :cond_7
    invoke-static/range {p12 .. p13}, Lo1/s;->V(J)Z

    move-result v13

    const/4 v14, 0x1

    xor-int/2addr v13, v14

    if-eqz v13, :cond_8

    iget-wide v14, v0, La2/x;->h:J

    move-wide/from16 v11, p12

    invoke-static {v11, v12, v14, v15}, Lm2/n;->a(JJ)Z

    move-result v13

    if-eqz v13, :cond_0

    :goto_1
    move-object/from16 v13, p19

    goto :goto_2

    :cond_8
    move-wide/from16 v11, p12

    goto :goto_1

    :goto_2
    if-eqz v13, :cond_9

    iget-object v14, v0, La2/x;->m:Ll2/j;

    invoke-static {v13, v14}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_0

    :cond_9
    iget-object v14, v0, La2/x;->a:Ll2/o;

    invoke-interface {v14}, Ll2/o;->e()Le1/n;

    move-result-object v14

    invoke-static {v3, v14}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_0

    if-eqz v3, :cond_a

    iget-object v14, v0, La2/x;->a:Ll2/o;

    invoke-interface {v14}, Ll2/o;->c()F

    move-result v14

    cmpg-float v14, v4, v14

    if-nez v14, :cond_0

    :cond_a
    if-eqz v7, :cond_b

    iget-object v14, v0, La2/x;->e:Lf2/k;

    invoke-static {v7, v14}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_0

    :cond_b
    if-eqz v9, :cond_c

    iget-object v14, v0, La2/x;->g:Ljava/lang/String;

    invoke-static {v9, v14}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_0

    :cond_c
    if-eqz v10, :cond_d

    iget-object v14, v0, La2/x;->i:Ll2/a;

    invoke-static {v10, v14}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_0

    :cond_d
    move-object/from16 v14, p15

    if-eqz v14, :cond_e

    iget-object v15, v0, La2/x;->j:Ll2/p;

    invoke-static {v14, v15}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_0

    :cond_e
    move-object/from16 v15, p16

    if-eqz v15, :cond_f

    iget-object v11, v0, La2/x;->k:Lh2/d;

    invoke-static {v15, v11}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_0

    :cond_f
    sget-wide v11, Le1/r;->g:J

    move-wide/from16 v13, p17

    const/4 v15, 0x1

    cmp-long v11, v13, v11

    if-eqz v11, :cond_10

    iget-wide v11, v0, La2/x;->l:J

    invoke-static {v13, v14, v11, v12}, Le1/r;->c(JJ)Z

    move-result v11

    if-eqz v11, :cond_1

    :cond_10
    move-object/from16 v11, p20

    if-eqz v11, :cond_11

    iget-object v12, v0, La2/x;->n:Le1/k0;

    invoke-static {v11, v12}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_2

    :cond_11
    move-object/from16 v12, p21

    if-eqz v12, :cond_12

    iget-object v15, v0, La2/x;->o:La2/s;

    invoke-static {v12, v15}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_2

    :cond_12
    move-object/from16 v15, p22

    if-eqz v15, :cond_13

    iget-object v12, v0, La2/x;->p:Lg1/h;

    invoke-static {v15, v12}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_13

    goto :goto_3

    :cond_13
    return-object v0

    :goto_3
    sget-object v12, Ll2/m;->a:Ll2/m;

    if-eqz v3, :cond_14

    invoke-static {v4, v3}, Ll2/l;->e(FLe1/n;)Ll2/o;

    move-result-object v1

    goto :goto_4

    :cond_14
    sget-wide v3, Le1/r;->g:J

    cmp-long v3, v1, v3

    if-eqz v3, :cond_15

    new-instance v3, Ll2/c;

    invoke-direct {v3, v1, v2}, Ll2/c;-><init>(J)V

    move-object v1, v3

    goto :goto_4

    :cond_15
    move-object v1, v12

    :goto_4
    iget-object v2, v0, La2/x;->a:Ll2/o;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    instance-of v3, v1, Ll2/b;

    if-eqz v3, :cond_17

    instance-of v4, v2, Ll2/b;

    if-eqz v4, :cond_17

    new-instance v3, Ll2/b;

    move-object v4, v1

    check-cast v4, Ll2/b;

    invoke-interface {v1}, Ll2/o;->c()F

    move-result v1

    new-instance v12, Ll2/n;

    const/4 v13, 0x0

    invoke-direct {v12, v2, v13}, Ll2/n;-><init>(Ll2/o;I)V

    invoke-static {v1}, Ljava/lang/Float;->isNaN(F)Z

    move-result v2

    if-eqz v2, :cond_16

    invoke-virtual {v12}, Ll2/n;->invoke()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    move-result v1

    :cond_16
    iget-object v2, v4, Ll2/b;->a:Le1/j0;

    invoke-direct {v3, v2, v1}, Ll2/b;-><init>(Le1/j0;F)V

    move-object v1, v3

    goto :goto_5

    :cond_17
    if-eqz v3, :cond_18

    instance-of v4, v2, Ll2/b;

    if-nez v4, :cond_18

    goto :goto_5

    :cond_18
    if-nez v3, :cond_19

    instance-of v3, v2, Ll2/b;

    if-eqz v3, :cond_19

    move-object v1, v2

    goto :goto_5

    :cond_19
    new-instance v3, Ll2/n;

    const/4 v4, 0x1

    invoke-direct {v3, v2, v4}, Ll2/n;-><init>(Ll2/o;I)V

    invoke-static {v1, v12}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1a

    goto :goto_5

    :cond_1a
    invoke-virtual {v3}, Ll2/n;->invoke()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll2/o;

    :goto_5
    if-nez v8, :cond_1b

    iget-object v2, v0, La2/x;->f:Lf2/e;

    goto :goto_6

    :cond_1b
    move-object v2, v8

    :goto_6
    invoke-static/range {p5 .. p6}, Lo1/s;->V(J)Z

    move-result v3

    if-nez v3, :cond_1c

    move-wide/from16 v3, p5

    goto :goto_7

    :cond_1c
    iget-wide v3, v0, La2/x;->b:J

    :goto_7
    if-nez v5, :cond_1d

    iget-object v5, v0, La2/x;->c:Lf2/l;

    :cond_1d
    if-nez v6, :cond_1e

    iget-object v6, v0, La2/x;->d:Lf2/j;

    :cond_1e
    if-nez v7, :cond_1f

    iget-object v7, v0, La2/x;->e:Lf2/k;

    :cond_1f
    if-nez v9, :cond_20

    iget-object v8, v0, La2/x;->g:Ljava/lang/String;

    move-object v9, v8

    :cond_20
    invoke-static/range {p12 .. p13}, Lo1/s;->V(J)Z

    move-result v8

    if-nez v8, :cond_21

    move-wide/from16 v12, p12

    goto :goto_8

    :cond_21
    iget-wide v12, v0, La2/x;->h:J

    :goto_8
    if-nez v10, :cond_22

    iget-object v8, v0, La2/x;->i:Ll2/a;

    move-object v10, v8

    :cond_22
    if-nez p15, :cond_23

    iget-object v8, v0, La2/x;->j:Ll2/p;

    goto :goto_9

    :cond_23
    move-object/from16 v8, p15

    :goto_9
    if-nez p16, :cond_24

    iget-object v14, v0, La2/x;->k:Lh2/d;

    goto :goto_a

    :cond_24
    move-object/from16 v14, p16

    :goto_a
    sget-wide v16, Le1/r;->g:J

    cmp-long v16, p17, v16

    if-eqz v16, :cond_25

    move-wide/from16 p9, v12

    move-wide/from16 v12, p17

    goto :goto_b

    :cond_25
    move-wide/from16 p9, v12

    iget-wide v12, v0, La2/x;->l:J

    :goto_b
    move-wide/from16 p14, v12

    if-nez p19, :cond_26

    iget-object v12, v0, La2/x;->m:Ll2/j;

    goto :goto_c

    :cond_26
    move-object/from16 v12, p19

    :goto_c
    if-nez v11, :cond_27

    iget-object v11, v0, La2/x;->n:Le1/k0;

    :cond_27
    iget-object v13, v0, La2/x;->o:La2/s;

    if-nez v13, :cond_28

    move-object/from16 v13, p21

    :cond_28
    if-nez v15, :cond_29

    iget-object v0, v0, La2/x;->p:Lg1/h;

    move-object v15, v0

    :cond_29
    new-instance v0, La2/x;

    move-object/from16 p0, v0

    move-object/from16 p1, v1

    move-wide/from16 p2, v3

    move-object/from16 p4, v5

    move-object/from16 p5, v6

    move-object/from16 p6, v7

    move-object/from16 p7, v2

    move-object/from16 p8, v9

    move-object/from16 p11, v10

    move-object/from16 p12, v8

    move-object/from16 p13, v14

    move-object/from16 p16, v12

    move-object/from16 p17, v11

    move-object/from16 p18, v13

    move-object/from16 p19, v15

    invoke-direct/range {p0 .. p19}, La2/x;-><init>(Ll2/o;JLf2/l;Lf2/j;Lf2/k;Lf2/e;Ljava/lang/String;JLl2/a;Ll2/p;Lh2/d;JLl2/j;Le1/k0;La2/s;Lg1/h;)V

    return-object v0
.end method

.method public static final b(FLjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    float-to-double v0, p0

    const-wide/high16 v2, 0x3fe0000000000000L    # 0.5

    cmpg-double p0, v0, v2

    if-gez p0, :cond_0

    goto :goto_0

    :cond_0
    move-object p1, p2

    :goto_0
    return-object p1
.end method

.method public static final c(JJF)J
    .locals 4

    invoke-static {p0, p1}, Lo1/s;->V(J)Z

    move-result v0

    if-nez v0, :cond_3

    invoke-static {p2, p3}, Lo1/s;->V(J)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {p0, p1}, Lo1/s;->V(J)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-static {p2, p3}, Lo1/s;->V(J)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-static {p0, p1}, Lm2/n;->b(J)J

    move-result-wide v0

    invoke-static {p2, p3}, Lm2/n;->b(J)J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Lm2/o;->a(JJ)Z

    move-result v0

    if-eqz v0, :cond_1

    const-wide v0, 0xff00000000L

    and-long/2addr v0, p0

    invoke-static {p0, p1}, Lm2/n;->c(J)F

    move-result p0

    invoke-static {p2, p3}, Lm2/n;->c(J)F

    move-result p1

    invoke-static {p0, p1, p4}, Lo1/s;->W(FFF)F

    move-result p0

    invoke-static {p0, v0, v1}, Lo1/s;->c0(FJ)J

    move-result-wide p0

    return-wide p0

    :cond_1
    new-instance p4, Ljava/lang/StringBuilder;

    const-string v0, "Cannot perform operation for "

    invoke-direct {p4, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {p0, p1}, Lm2/n;->b(J)J

    move-result-wide p0

    invoke-static {p0, p1}, Lm2/o;->b(J)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, " and "

    invoke-virtual {p4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p2, p3}, Lm2/n;->b(J)J

    move-result-wide p0

    invoke-static {p0, p1}, Lm2/o;->b(J)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Cannot perform operation for Unspecified type."

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_3
    :goto_0
    new-instance v0, Lm2/n;

    invoke-direct {v0, p0, p1}, Lm2/n;-><init>(J)V

    new-instance p0, Lm2/n;

    invoke-direct {p0, p2, p3}, Lm2/n;-><init>(J)V

    invoke-static {p4, v0, p0}, La2/y;->b(FLjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lm2/n;

    iget-wide p0, p0, Lm2/n;->a:J

    return-wide p0
.end method
