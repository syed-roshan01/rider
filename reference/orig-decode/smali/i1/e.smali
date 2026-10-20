.class public final Li1/e;
.super Ljava/lang/Object;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:F

.field public final c:F

.field public final d:F

.field public final e:F

.field public final f:J

.field public final g:I

.field public final h:Z

.field public final i:Ljava/util/ArrayList;

.field public final j:Li1/d;

.field public k:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;FFFFJIZI)V
    .locals 14

    move-object v0, p0

    move/from16 v1, p10

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    const-string v2, ""

    goto :goto_0

    :cond_0
    move-object v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x20

    if-eqz v3, :cond_1

    sget-wide v3, Le1/r;->g:J

    goto :goto_1

    :cond_1
    move-wide/from16 v3, p6

    :goto_1
    and-int/lit8 v5, v1, 0x40

    if-eqz v5, :cond_2

    const/4 v5, 0x5

    goto :goto_2

    :cond_2
    move/from16 v5, p8

    :goto_2
    and-int/lit16 v1, v1, 0x80

    if-eqz v1, :cond_3

    const/4 v1, 0x0

    goto :goto_3

    :cond_3
    move/from16 v1, p9

    :goto_3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object v2, v0, Li1/e;->a:Ljava/lang/String;

    move/from16 v2, p2

    iput v2, v0, Li1/e;->b:F

    move/from16 v2, p3

    iput v2, v0, Li1/e;->c:F

    move/from16 v2, p4

    iput v2, v0, Li1/e;->d:F

    move/from16 v2, p5

    iput v2, v0, Li1/e;->e:F

    iput-wide v3, v0, Li1/e;->f:J

    iput v5, v0, Li1/e;->g:I

    iput-boolean v1, v0, Li1/e;->h:Z

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, v0, Li1/e;->i:Ljava/util/ArrayList;

    new-instance v13, Li1/d;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/16 v12, 0x3ff

    move-object v2, v13

    invoke-direct/range {v2 .. v12}, Li1/d;-><init>(Ljava/lang/String;FFFFFFFLjava/util/List;I)V

    iput-object v13, v0, Li1/e;->j:Li1/d;

    invoke-virtual {v1, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public static a(Li1/e;Ljava/util/ArrayList;Le1/n0;)V
    .locals 17

    const-string v1, ""

    const/4 v3, 0x0

    const/high16 v5, 0x3f800000    # 1.0f

    const/4 v6, 0x0

    const/high16 v7, 0x3f800000    # 1.0f

    const/high16 v8, 0x3f800000    # 1.0f

    const/4 v9, 0x0

    const/4 v10, 0x2

    const/high16 v11, 0x3f800000    # 1.0f

    const/4 v12, 0x0

    const/high16 v13, 0x3f800000    # 1.0f

    const/4 v14, 0x0

    invoke-virtual/range {p0 .. p0}, Li1/e;->c()V

    move-object/from16 v0, p0

    iget-object v0, v0, Li1/e;->i:Ljava/util/ArrayList;

    const/4 v2, 0x1

    invoke-static {v0, v2}, La7/a;->k(Ljava/util/ArrayList;I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Li1/d;

    iget-object v15, v0, Li1/d;->j:Ljava/util/List;

    new-instance v4, Li1/k0;

    move-object v0, v4

    move-object/from16 v2, p1

    move-object/from16 v16, v4

    move-object/from16 v4, p2

    invoke-direct/range {v0 .. v14}, Li1/k0;-><init>(Ljava/lang/String;Ljava/util/List;ILe1/n;FLe1/n;FFIIFFFF)V

    move-object/from16 v0, v16

    invoke-interface {v15, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method


# virtual methods
.method public final b()Li1/f;
    .locals 26

    move-object/from16 v0, p0

    invoke-virtual/range {p0 .. p0}, Li1/e;->c()V

    :goto_0
    iget-object v1, v0, Li1/e;->i:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    const/4 v3, 0x1

    if-le v2, v3, :cond_0

    invoke-virtual/range {p0 .. p0}, Li1/e;->c()V

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    sub-int/2addr v2, v3

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Li1/d;

    invoke-static {v1, v3}, La7/a;->k(Ljava/util/ArrayList;I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Li1/d;

    iget-object v1, v1, Li1/d;->j:Ljava/util/List;

    new-instance v14, Li1/g0;

    iget-object v4, v2, Li1/d;->a:Ljava/lang/String;

    iget v5, v2, Li1/d;->b:F

    iget v6, v2, Li1/d;->c:F

    iget v7, v2, Li1/d;->d:F

    iget v8, v2, Li1/d;->e:F

    iget v9, v2, Li1/d;->f:F

    iget v10, v2, Li1/d;->g:F

    iget v11, v2, Li1/d;->h:F

    iget-object v12, v2, Li1/d;->i:Ljava/util/List;

    iget-object v13, v2, Li1/d;->j:Ljava/util/List;

    move-object v3, v14

    invoke-direct/range {v3 .. v13}, Li1/g0;-><init>(Ljava/lang/String;FFFFFFFLjava/util/List;Ljava/util/List;)V

    invoke-interface {v1, v14}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    new-instance v1, Li1/f;

    iget-object v2, v0, Li1/e;->a:Ljava/lang/String;

    iget v4, v0, Li1/e;->b:F

    iget v5, v0, Li1/e;->c:F

    iget v6, v0, Li1/e;->d:F

    iget v7, v0, Li1/e;->e:F

    iget-object v8, v0, Li1/e;->j:Li1/d;

    new-instance v21, Li1/g0;

    iget-object v10, v8, Li1/d;->a:Ljava/lang/String;

    iget v11, v8, Li1/d;->b:F

    iget v12, v8, Li1/d;->c:F

    iget v13, v8, Li1/d;->d:F

    iget v14, v8, Li1/d;->e:F

    iget v15, v8, Li1/d;->f:F

    iget v9, v8, Li1/d;->g:F

    iget v3, v8, Li1/d;->h:F

    move/from16 v20, v7

    iget-object v7, v8, Li1/d;->i:Ljava/util/List;

    iget-object v8, v8, Li1/d;->j:Ljava/util/List;

    move/from16 v16, v9

    move-object/from16 v9, v21

    move/from16 v17, v3

    move-object/from16 v18, v7

    move-object/from16 v19, v8

    invoke-direct/range {v9 .. v19}, Li1/g0;-><init>(Ljava/lang/String;FFFFFFFLjava/util/List;Ljava/util/List;)V

    iget-wide v7, v0, Li1/e;->f:J

    iget v3, v0, Li1/e;->g:I

    iget-boolean v9, v0, Li1/e;->h:Z

    move-object v15, v1

    move-object/from16 v16, v2

    move/from16 v17, v4

    move/from16 v18, v5

    move/from16 v19, v6

    move-wide/from16 v22, v7

    move/from16 v24, v3

    move/from16 v25, v9

    invoke-direct/range {v15 .. v25}, Li1/f;-><init>(Ljava/lang/String;FFFFLi1/g0;JIZ)V

    const/4 v2, 0x1

    iput-boolean v2, v0, Li1/e;->k:Z

    return-object v1
.end method

.method public final c()V
    .locals 2

    iget-boolean v0, p0, Li1/e;->k:Z

    xor-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "ImageVector.Builder is single use, create a new instance to create a new ImageVector"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
