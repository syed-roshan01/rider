.class public final La2/c0;
.super Ljava/lang/Object;


# static fields
.field public static final d:La2/c0;


# instance fields
.field public final a:La2/x;

.field public final b:La2/p;

.field public final c:La2/t;


# direct methods
.method static constructor <clinit>()V
    .locals 10

    new-instance v9, La2/c0;

    const-wide/16 v1, 0x0

    const-wide/16 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const v8, 0xffffff

    move-object v0, v9

    invoke-direct/range {v0 .. v8}, La2/c0;-><init>(JJLf2/l;Lf2/m;Le1/k0;I)V

    sput-object v9, La2/c0;->d:La2/c0;

    return-void
.end method

.method public constructor <init>(JJLf2/l;Lf2/m;Le1/k0;I)V
    .locals 37

    move/from16 v0, p8

    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_0

    .line 6
    sget-wide v1, Le1/r;->g:J

    move-wide v4, v1

    goto :goto_0

    :cond_0
    move-wide/from16 v4, p1

    :goto_0
    and-int/lit8 v1, v0, 0x2

    if-eqz v1, :cond_1

    .line 7
    sget-wide v1, Lm2/n;->c:J

    move-wide v6, v1

    goto :goto_1

    :cond_1
    move-wide/from16 v6, p3

    :goto_1
    and-int/lit8 v1, v0, 0x4

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    move-object v8, v2

    goto :goto_2

    :cond_2
    move-object/from16 v8, p5

    :goto_2
    const/4 v9, 0x0

    const/4 v10, 0x0

    and-int/lit8 v1, v0, 0x20

    if-eqz v1, :cond_3

    move-object v11, v2

    goto :goto_3

    :cond_3
    move-object/from16 v11, p6

    :goto_3
    const/4 v12, 0x0

    and-int/lit16 v1, v0, 0x80

    const-wide/16 v13, 0x0

    if-eqz v1, :cond_4

    .line 8
    sget-wide v15, Lm2/n;->c:J

    goto :goto_4

    :cond_4
    move-wide v15, v13

    :goto_4
    const/4 v1, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    and-int/lit16 v3, v0, 0x800

    if-eqz v3, :cond_5

    .line 9
    sget-wide v19, Le1/r;->g:J

    goto :goto_5

    :cond_5
    move-wide/from16 v19, v13

    :goto_5
    const/16 v21, 0x0

    and-int/lit16 v3, v0, 0x2000

    if-eqz v3, :cond_6

    move-object/from16 v23, v2

    goto :goto_6

    :cond_6
    move-object/from16 v23, p7

    :goto_6
    const/16 v24, 0x0

    const v3, 0x8000

    and-int/2addr v3, v0

    const/16 v22, 0x0

    const/high16 v25, -0x80000000

    if-eqz v3, :cond_7

    move/from16 v27, v25

    goto :goto_7

    :cond_7
    move/from16 v27, v22

    :goto_7
    const/high16 v3, 0x10000

    and-int/2addr v3, v0

    if-eqz v3, :cond_8

    move/from16 v28, v25

    goto :goto_8

    :cond_8
    move/from16 v28, v22

    :goto_8
    const/high16 v3, 0x20000

    and-int/2addr v3, v0

    if-eqz v3, :cond_9

    .line 10
    sget-wide v13, Lm2/n;->c:J

    :cond_9
    move-wide/from16 v29, v13

    const/16 v31, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/high16 v3, 0x400000

    and-int/2addr v0, v3

    if-eqz v0, :cond_a

    move/from16 v35, v25

    goto :goto_9

    :cond_a
    move/from16 v35, v22

    :goto_9
    const/16 v36, 0x0

    .line 11
    new-instance v0, La2/x;

    const/16 v22, 0x0

    move-object v3, v0

    move-wide v13, v15

    move-object v15, v1

    move-object/from16 v16, v17

    move-object/from16 v17, v18

    move-wide/from16 v18, v19

    move-object/from16 v20, v21

    move-object/from16 v21, v23

    move-object/from16 v23, v24

    invoke-direct/range {v3 .. v23}, La2/x;-><init>(JJLf2/l;Lf2/j;Lf2/k;Lf2/e;Ljava/lang/String;JLl2/a;Ll2/p;Lh2/d;JLl2/j;Le1/k0;La2/s;Lg1/h;)V

    .line 12
    new-instance v1, La2/p;

    const/16 v32, 0x0

    move-object/from16 v26, v1

    invoke-direct/range {v26 .. v36}, La2/p;-><init>(IIJLl2/q;La2/r;Ll2/g;IILl2/r;)V

    move-object/from16 v3, p0

    .line 13
    invoke-direct {v3, v0, v1, v2}, La2/c0;-><init>(La2/x;La2/p;La2/t;)V

    return-void
.end method

.method public constructor <init>(La2/x;La2/p;)V
    .locals 3

    .line 2
    iget-object v0, p1, La2/x;->o:La2/s;

    .line 3
    iget-object v1, p2, La2/p;->e:La2/r;

    if-nez v0, :cond_0

    if-nez v1, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    .line 4
    :cond_0
    new-instance v2, La2/t;

    invoke-direct {v2, v0, v1}, La2/t;-><init>(La2/s;La2/r;)V

    move-object v0, v2

    .line 5
    :goto_0
    invoke-direct {p0, p1, p2, v0}, La2/c0;-><init>(La2/x;La2/p;La2/t;)V

    return-void
.end method

.method public constructor <init>(La2/x;La2/p;La2/t;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La2/c0;->a:La2/x;

    iput-object p2, p0, La2/c0;->b:La2/p;

    iput-object p3, p0, La2/c0;->c:La2/t;

    return-void
.end method

.method public static a(IIJJJJLa2/t;La2/c0;Lf2/m;Lf2/l;Ll2/g;)La2/c0;
    .locals 32

    move/from16 v0, p1

    move-object/from16 v1, p11

    and-int/lit8 v2, v0, 0x1

    if-eqz v2, :cond_0

    iget-object v2, v1, La2/c0;->a:La2/x;

    iget-object v2, v2, La2/x;->a:Ll2/o;

    invoke-interface {v2}, Ll2/o;->d()J

    move-result-wide v2

    goto :goto_0

    :cond_0
    move-wide/from16 v2, p2

    :goto_0
    and-int/lit8 v4, v0, 0x2

    if-eqz v4, :cond_1

    iget-object v4, v1, La2/c0;->a:La2/x;

    iget-wide v4, v4, La2/x;->b:J

    move-wide v8, v4

    goto :goto_1

    :cond_1
    move-wide/from16 v8, p4

    :goto_1
    and-int/lit8 v4, v0, 0x4

    if-eqz v4, :cond_2

    iget-object v4, v1, La2/c0;->a:La2/x;

    iget-object v4, v4, La2/x;->c:Lf2/l;

    move-object v10, v4

    goto :goto_2

    :cond_2
    move-object/from16 v10, p13

    :goto_2
    and-int/lit8 v4, v0, 0x8

    if-eqz v4, :cond_3

    iget-object v4, v1, La2/c0;->a:La2/x;

    iget-object v4, v4, La2/x;->d:Lf2/j;

    move-object v11, v4

    goto :goto_3

    :cond_3
    const/4 v11, 0x0

    :goto_3
    and-int/lit8 v4, v0, 0x10

    if-eqz v4, :cond_4

    iget-object v4, v1, La2/c0;->a:La2/x;

    iget-object v4, v4, La2/x;->e:Lf2/k;

    move-object v12, v4

    goto :goto_4

    :cond_4
    const/4 v12, 0x0

    :goto_4
    and-int/lit8 v4, v0, 0x20

    if-eqz v4, :cond_5

    iget-object v4, v1, La2/c0;->a:La2/x;

    iget-object v4, v4, La2/x;->f:Lf2/e;

    move-object v13, v4

    goto :goto_5

    :cond_5
    move-object/from16 v13, p12

    :goto_5
    and-int/lit8 v4, v0, 0x40

    if-eqz v4, :cond_6

    iget-object v4, v1, La2/c0;->a:La2/x;

    iget-object v4, v4, La2/x;->g:Ljava/lang/String;

    move-object v14, v4

    goto :goto_6

    :cond_6
    const/4 v14, 0x0

    :goto_6
    and-int/lit16 v4, v0, 0x80

    if-eqz v4, :cond_7

    iget-object v4, v1, La2/c0;->a:La2/x;

    iget-wide v6, v4, La2/x;->h:J

    move-wide v15, v6

    goto :goto_7

    :cond_7
    move-wide/from16 v15, p6

    :goto_7
    and-int/lit16 v4, v0, 0x100

    if-eqz v4, :cond_8

    iget-object v4, v1, La2/c0;->a:La2/x;

    iget-object v4, v4, La2/x;->i:Ll2/a;

    move-object/from16 v17, v4

    goto :goto_8

    :cond_8
    const/16 v17, 0x0

    :goto_8
    and-int/lit16 v4, v0, 0x200

    if-eqz v4, :cond_9

    iget-object v4, v1, La2/c0;->a:La2/x;

    iget-object v4, v4, La2/x;->j:Ll2/p;

    move-object/from16 v18, v4

    goto :goto_9

    :cond_9
    const/16 v18, 0x0

    :goto_9
    and-int/lit16 v4, v0, 0x400

    if-eqz v4, :cond_a

    iget-object v4, v1, La2/c0;->a:La2/x;

    iget-object v4, v4, La2/x;->k:Lh2/d;

    move-object/from16 v19, v4

    goto :goto_a

    :cond_a
    const/16 v19, 0x0

    :goto_a
    and-int/lit16 v4, v0, 0x800

    if-eqz v4, :cond_b

    iget-object v4, v1, La2/c0;->a:La2/x;

    iget-wide v6, v4, La2/x;->l:J

    :goto_b
    move-wide/from16 v20, v6

    goto :goto_c

    :cond_b
    const-wide/16 v6, 0x0

    goto :goto_b

    :goto_c
    and-int/lit16 v4, v0, 0x1000

    if-eqz v4, :cond_c

    iget-object v4, v1, La2/c0;->a:La2/x;

    iget-object v4, v4, La2/x;->m:Ll2/j;

    move-object/from16 v22, v4

    goto :goto_d

    :cond_c
    const/16 v22, 0x0

    :goto_d
    and-int/lit16 v4, v0, 0x2000

    if-eqz v4, :cond_d

    iget-object v4, v1, La2/c0;->a:La2/x;

    iget-object v4, v4, La2/x;->n:Le1/k0;

    move-object/from16 v23, v4

    goto :goto_e

    :cond_d
    const/16 v23, 0x0

    :goto_e
    and-int/lit16 v4, v0, 0x4000

    if-eqz v4, :cond_e

    iget-object v4, v1, La2/c0;->a:La2/x;

    iget-object v4, v4, La2/x;->p:Lg1/h;

    move-object/from16 v25, v4

    goto :goto_f

    :cond_e
    const/16 v25, 0x0

    :goto_f
    const v4, 0x8000

    and-int/2addr v4, v0

    if-eqz v4, :cond_f

    iget-object v4, v1, La2/c0;->b:La2/p;

    iget v4, v4, La2/p;->a:I

    goto :goto_10

    :cond_f
    move/from16 v4, p0

    :goto_10
    const/high16 v6, 0x10000

    and-int/2addr v6, v0

    if-eqz v6, :cond_10

    iget-object v6, v1, La2/c0;->b:La2/p;

    iget v6, v6, La2/p;->b:I

    move/from16 v26, v6

    goto :goto_11

    :cond_10
    const/16 v26, 0x0

    :goto_11
    const/high16 v6, 0x20000

    and-int/2addr v6, v0

    if-eqz v6, :cond_11

    iget-object v6, v1, La2/c0;->b:La2/p;

    iget-wide v5, v6, La2/p;->c:J

    move-wide/from16 v27, v5

    goto :goto_12

    :cond_11
    move-wide/from16 v27, p8

    :goto_12
    const/high16 v5, 0x40000

    and-int/2addr v5, v0

    if-eqz v5, :cond_12

    iget-object v5, v1, La2/c0;->b:La2/p;

    iget-object v5, v5, La2/p;->d:Ll2/q;

    goto :goto_13

    :cond_12
    const/4 v5, 0x0

    :goto_13
    const/high16 v6, 0x80000

    and-int/2addr v6, v0

    if-eqz v6, :cond_13

    iget-object v6, v1, La2/c0;->c:La2/t;

    goto :goto_14

    :cond_13
    move-object/from16 v6, p10

    :goto_14
    const/high16 v24, 0x100000

    and-int v24, v0, v24

    if-eqz v24, :cond_14

    iget-object v7, v1, La2/c0;->b:La2/p;

    iget-object v7, v7, La2/p;->f:Ll2/g;

    move-object/from16 v29, v7

    goto :goto_15

    :cond_14
    move-object/from16 v29, p14

    :goto_15
    const/high16 v7, 0x200000

    and-int/2addr v7, v0

    if-eqz v7, :cond_15

    iget-object v7, v1, La2/c0;->b:La2/p;

    iget v7, v7, La2/p;->g:I

    move/from16 v30, v7

    goto :goto_16

    :cond_15
    const/16 v30, 0x0

    :goto_16
    const/high16 v7, 0x400000

    and-int/2addr v7, v0

    if-eqz v7, :cond_16

    iget-object v7, v1, La2/c0;->b:La2/p;

    iget v7, v7, La2/p;->h:I

    move/from16 v31, v7

    goto :goto_17

    :cond_16
    const/16 v31, 0x0

    :goto_17
    const/high16 v7, 0x800000

    and-int/2addr v0, v7

    if-eqz v0, :cond_17

    iget-object v0, v1, La2/c0;->b:La2/p;

    iget-object v0, v0, La2/p;->i:Ll2/r;

    goto :goto_18

    :cond_17
    const/4 v0, 0x0

    :goto_18
    new-instance v7, La2/c0;

    move-object/from16 p10, v0

    new-instance v0, La2/x;

    iget-object v1, v1, La2/c0;->a:La2/x;

    move-object/from16 p0, v7

    iget-object v7, v1, La2/x;->a:Ll2/o;

    move/from16 p3, v4

    move-object/from16 p5, v5

    invoke-interface {v7}, Ll2/o;->d()J

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, Le1/r;->c(JJ)Z

    move-result v4

    if-eqz v4, :cond_18

    iget-object v1, v1, La2/x;->a:Ll2/o;

    :goto_19
    move-object v7, v1

    goto :goto_1a

    :cond_18
    sget-wide v4, Le1/r;->g:J

    cmp-long v1, v2, v4

    if-eqz v1, :cond_19

    new-instance v1, Ll2/c;

    invoke-direct {v1, v2, v3}, Ll2/c;-><init>(J)V

    goto :goto_19

    :cond_19
    sget-object v1, Ll2/m;->a:Ll2/m;

    goto :goto_19

    :goto_1a
    if-eqz v6, :cond_1a

    iget-object v1, v6, La2/t;->a:La2/s;

    move-object/from16 v24, v1

    move-object v1, v6

    goto :goto_1b

    :cond_1a
    move-object v1, v6

    const/16 v24, 0x0

    :goto_1b
    move-object v6, v0

    move-object/from16 v2, p0

    invoke-direct/range {v6 .. v25}, La2/x;-><init>(Ll2/o;JLf2/l;Lf2/j;Lf2/k;Lf2/e;Ljava/lang/String;JLl2/a;Ll2/p;Lh2/d;JLl2/j;Le1/k0;La2/s;Lg1/h;)V

    new-instance v3, La2/p;

    if-eqz v1, :cond_1b

    iget-object v5, v1, La2/t;->b:La2/r;

    goto :goto_1c

    :cond_1b
    const/4 v5, 0x0

    :goto_1c
    move-object/from16 p0, v3

    move/from16 p1, p3

    move/from16 p2, v26

    move-wide/from16 p3, v27

    move-object/from16 p6, v5

    move-object/from16 p7, v29

    move/from16 p8, v30

    move/from16 p9, v31

    invoke-direct/range {p0 .. p10}, La2/p;-><init>(IIJLl2/q;La2/r;Ll2/g;IILl2/r;)V

    invoke-direct {v2, v0, v3, v1}, La2/c0;-><init>(La2/x;La2/p;La2/t;)V

    return-object v2
.end method

.method public static e(IIJJJJLa2/c0;Lf2/e;Lf2/j;Lf2/l;Ll2/j;)La2/c0;
    .locals 38

    move/from16 v0, p1

    move-object/from16 v1, p10

    and-int/lit8 v2, v0, 0x1

    if-eqz v2, :cond_0

    sget-wide v2, Le1/r;->g:J

    move-wide v5, v2

    goto :goto_0

    :cond_0
    move-wide/from16 v5, p2

    :goto_0
    and-int/lit8 v2, v0, 0x2

    if-eqz v2, :cond_1

    sget-wide v2, Lm2/n;->c:J

    move-wide v9, v2

    goto :goto_1

    :cond_1
    move-wide/from16 v9, p4

    :goto_1
    and-int/lit8 v2, v0, 0x4

    const/4 v3, 0x0

    if-eqz v2, :cond_2

    move-object v11, v3

    goto :goto_2

    :cond_2
    move-object/from16 v11, p13

    :goto_2
    and-int/lit8 v2, v0, 0x8

    if-eqz v2, :cond_3

    move-object v12, v3

    goto :goto_3

    :cond_3
    move-object/from16 v12, p12

    :goto_3
    const/4 v13, 0x0

    and-int/lit8 v2, v0, 0x20

    if-eqz v2, :cond_4

    move-object v14, v3

    goto :goto_4

    :cond_4
    move-object/from16 v14, p11

    :goto_4
    const/4 v15, 0x0

    and-int/lit16 v2, v0, 0x80

    if-eqz v2, :cond_5

    sget-wide v7, Lm2/n;->c:J

    move-wide/from16 v16, v7

    goto :goto_5

    :cond_5
    move-wide/from16 v16, p6

    :goto_5
    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    and-int/lit16 v2, v0, 0x800

    if-eqz v2, :cond_6

    sget-wide v7, Le1/r;->g:J

    :goto_6
    move-wide/from16 v21, v7

    goto :goto_7

    :cond_6
    const-wide/16 v7, 0x0

    goto :goto_6

    :goto_7
    and-int/lit16 v2, v0, 0x1000

    if-eqz v2, :cond_7

    move-object/from16 v23, v3

    goto :goto_8

    :cond_7
    move-object/from16 v23, p14

    :goto_8
    const/16 v24, 0x0

    const/16 v26, 0x0

    const v2, 0x8000

    and-int/2addr v2, v0

    const/high16 v3, -0x80000000

    if-eqz v2, :cond_8

    move/from16 v28, v3

    goto :goto_9

    :cond_8
    move/from16 v28, p0

    :goto_9
    const/high16 v2, 0x10000

    and-int/2addr v2, v0

    const/4 v4, 0x0

    if-eqz v2, :cond_9

    move/from16 v29, v3

    goto :goto_a

    :cond_9
    move/from16 v29, v4

    :goto_a
    const/high16 v2, 0x20000

    and-int/2addr v2, v0

    if-eqz v2, :cond_a

    sget-wide v7, Lm2/n;->c:J

    move-wide/from16 v30, v7

    goto :goto_b

    :cond_a
    move-wide/from16 v30, p8

    :goto_b
    const/16 v32, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/high16 v2, 0x200000

    and-int/2addr v0, v2

    if-eqz v0, :cond_b

    move/from16 v36, v3

    goto :goto_c

    :cond_b
    move/from16 v36, v4

    :goto_c
    const/16 v37, 0x0

    iget-object v4, v1, La2/c0;->a:La2/x;

    const/4 v7, 0x0

    const/high16 v8, 0x7fc00000    # Float.NaN

    const/16 v25, 0x0

    invoke-static/range {v4 .. v26}, La2/y;->a(La2/x;JLe1/n;FJLf2/l;Lf2/j;Lf2/k;Lf2/e;Ljava/lang/String;JLl2/a;Ll2/p;Lh2/d;JLl2/j;Le1/k0;La2/s;Lg1/h;)La2/x;

    move-result-object v0

    iget-object v2, v1, La2/c0;->b:La2/p;

    const/16 v33, 0x0

    move-object/from16 v27, v2

    invoke-static/range {v27 .. v37}, La2/q;->a(La2/p;IIJLl2/q;La2/r;Ll2/g;IILl2/r;)La2/p;

    move-result-object v2

    iget-object v3, v1, La2/c0;->a:La2/x;

    if-ne v3, v0, :cond_c

    iget-object v3, v1, La2/c0;->b:La2/p;

    if-ne v3, v2, :cond_c

    goto :goto_d

    :cond_c
    new-instance v1, La2/c0;

    invoke-direct {v1, v0, v2}, La2/c0;-><init>(La2/x;La2/p;)V

    :goto_d
    return-object v1
.end method


# virtual methods
.method public final b()J
    .locals 2

    iget-object v0, p0, La2/c0;->a:La2/x;

    iget-object v0, v0, La2/x;->a:Ll2/o;

    invoke-interface {v0}, Ll2/o;->d()J

    move-result-wide v0

    return-wide v0
.end method

.method public final c(La2/c0;)Z
    .locals 2

    if-eq p0, p1, :cond_1

    iget-object v0, p1, La2/c0;->b:La2/p;

    iget-object v1, p0, La2/c0;->b:La2/p;

    invoke-static {v1, v0}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, La2/c0;->a:La2/x;

    iget-object p1, p1, La2/c0;->a:La2/x;

    invoke-virtual {v0, p1}, La2/x;->a(La2/x;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method

.method public final d(La2/c0;)La2/c0;
    .locals 3

    if-eqz p1, :cond_1

    sget-object v0, La2/c0;->d:La2/c0;

    invoke-static {p1, v0}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, La2/c0;

    iget-object v1, p0, La2/c0;->a:La2/x;

    iget-object v2, p1, La2/c0;->a:La2/x;

    invoke-virtual {v1, v2}, La2/x;->c(La2/x;)La2/x;

    move-result-object v1

    iget-object v2, p0, La2/c0;->b:La2/p;

    iget-object p1, p1, La2/c0;->b:La2/p;

    invoke-virtual {v2, p1}, La2/p;->a(La2/p;)La2/p;

    move-result-object p1

    invoke-direct {v0, v1, p1}, La2/c0;-><init>(La2/x;La2/p;)V

    return-object v0

    :cond_1
    :goto_0
    return-object p0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, La2/c0;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, La2/c0;

    iget-object v1, p1, La2/c0;->a:La2/x;

    iget-object v3, p0, La2/c0;->a:La2/x;

    invoke-static {v3, v1}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, La2/c0;->b:La2/p;

    iget-object v3, p1, La2/c0;->b:La2/p;

    invoke-static {v1, v3}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, La2/c0;->c:La2/t;

    iget-object p1, p1, La2/c0;->c:La2/t;

    invoke-static {v1, p1}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final hashCode()I
    .locals 2

    iget-object v0, p0, La2/c0;->a:La2/x;

    invoke-virtual {v0}, La2/x;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, La2/c0;->b:La2/p;

    invoke-virtual {v1}, La2/p;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, La2/c0;->c:La2/t;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, La2/t;->hashCode()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "TextStyle(color="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, La2/c0;->b()J

    move-result-wide v1

    invoke-static {v1, v2}, Le1/r;->i(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", brush="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, La2/c0;->a:La2/x;

    iget-object v2, v1, La2/x;->a:Ll2/o;

    invoke-interface {v2}, Ll2/o;->e()Le1/n;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", alpha="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, v1, La2/x;->a:Ll2/o;

    invoke-interface {v2}, Ll2/o;->c()F

    move-result v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v2, ", fontSize="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v2, v1, La2/x;->b:J

    invoke-static {v2, v3}, Lm2/n;->d(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", fontWeight="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, v1, La2/x;->c:Lf2/l;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", fontStyle="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, v1, La2/x;->d:Lf2/j;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", fontSynthesis="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, v1, La2/x;->e:Lf2/k;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", fontFamily="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, v1, La2/x;->f:Lf2/e;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", fontFeatureSettings="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, v1, La2/x;->g:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ", letterSpacing="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v2, v1, La2/x;->h:J

    invoke-static {v2, v3}, Lm2/n;->d(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", baselineShift="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, v1, La2/x;->i:Ll2/a;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", textGeometricTransform="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, v1, La2/x;->j:Ll2/p;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", localeList="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, v1, La2/x;->k:Lh2/d;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", background="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v2, v1, La2/x;->l:J

    const-string v4, ", textDecoration="

    invoke-static {v2, v3, v0, v4}, Lu/k1;->d(JLjava/lang/StringBuilder;Ljava/lang/String;)V

    iget-object v2, v1, La2/x;->m:Ll2/j;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", shadow="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, v1, La2/x;->n:Le1/k0;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", drawStyle="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, v1, La2/x;->p:Lg1/h;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", textAlign="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, La2/c0;->b:La2/p;

    iget v2, v1, La2/p;->a:I

    invoke-static {v2}, Ll2/i;->b(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", textDirection="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, v1, La2/p;->b:I

    invoke-static {v2}, Ll2/k;->b(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", lineHeight="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v2, v1, La2/p;->c:J

    invoke-static {v2, v3}, Lm2/n;->d(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", textIndent="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, v1, La2/p;->d:Ll2/q;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", platformStyle="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, La2/c0;->c:La2/t;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", lineHeightStyle="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, v1, La2/p;->f:Ll2/g;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", lineBreak="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, v1, La2/p;->g:I

    invoke-static {v2}, Ll2/e;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", hyphens="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, v1, La2/p;->h:I

    invoke-static {v2}, Ll2/d;->b(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", textMotion="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, v1, La2/p;->i:Ll2/r;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
