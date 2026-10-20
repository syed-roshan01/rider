.class public final Lo1/g;
.super Ljava/lang/Object;


# instance fields
.field public a:J

.field public final b:Landroid/util/SparseLongArray;

.field public final c:Landroid/util/SparseBooleanArray;

.field public final d:Ljava/util/ArrayList;

.field public e:I

.field public f:I


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroid/util/SparseLongArray;

    invoke-direct {v0}, Landroid/util/SparseLongArray;-><init>()V

    iput-object v0, p0, Lo1/g;->b:Landroid/util/SparseLongArray;

    new-instance v0, Landroid/util/SparseBooleanArray;

    invoke-direct {v0}, Landroid/util/SparseBooleanArray;-><init>()V

    iput-object v0, p0, Lo1/g;->c:Landroid/util/SparseBooleanArray;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo1/g;->d:Ljava/util/ArrayList;

    const/4 v0, -0x1

    iput v0, p0, Lo1/g;->e:I

    iput v0, p0, Lo1/g;->f:I

    return-void
.end method


# virtual methods
.method public final a(Landroid/view/MotionEvent;Lo1/b0;)Lo1/w;
    .locals 44

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v2

    iget-object v3, v0, Lo1/g;->b:Landroid/util/SparseLongArray;

    iget-object v4, v0, Lo1/g;->c:Landroid/util/SparseBooleanArray;

    const/4 v5, 0x3

    if-ne v2, v5, :cond_0

    invoke-virtual {v3}, Landroid/util/SparseLongArray;->clear()V

    invoke-virtual {v4}, Landroid/util/SparseBooleanArray;->clear()V

    const/4 v1, 0x0

    return-object v1

    :cond_0
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getPointerCount()I

    move-result v6

    const/4 v7, 0x1

    const/4 v8, 0x0

    if-eq v6, v7, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {v1, v8}, Landroid/view/MotionEvent;->getToolType(I)I

    move-result v6

    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getSource()I

    move-result v9

    iget v10, v0, Lo1/g;->e:I

    if-ne v6, v10, :cond_2

    iget v10, v0, Lo1/g;->f:I

    if-eq v9, v10, :cond_3

    :cond_2
    iput v6, v0, Lo1/g;->e:I

    iput v9, v0, Lo1/g;->f:I

    invoke-virtual {v4}, Landroid/util/SparseBooleanArray;->clear()V

    invoke-virtual {v3}, Landroid/util/SparseLongArray;->clear()V

    :cond_3
    :goto_0
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v6

    const-wide/16 v9, 0x1

    const/16 v11, 0x9

    if-eqz v6, :cond_5

    const/4 v12, 0x5

    if-eq v6, v12, :cond_5

    if-eq v6, v11, :cond_4

    goto :goto_1

    :cond_4
    invoke-virtual {v1, v8}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v6

    invoke-virtual {v3, v6}, Landroid/util/SparseLongArray;->indexOfKey(I)I

    move-result v12

    if-gez v12, :cond_6

    iget-wide v12, v0, Lo1/g;->a:J

    add-long v14, v12, v9

    iput-wide v14, v0, Lo1/g;->a:J

    invoke-virtual {v3, v6, v12, v13}, Landroid/util/SparseLongArray;->put(IJ)V

    goto :goto_1

    :cond_5
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getActionIndex()I

    move-result v6

    invoke-virtual {v1, v6}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v12

    invoke-virtual {v3, v12}, Landroid/util/SparseLongArray;->indexOfKey(I)I

    move-result v13

    if-gez v13, :cond_6

    iget-wide v13, v0, Lo1/g;->a:J

    add-long v7, v13, v9

    iput-wide v7, v0, Lo1/g;->a:J

    invoke-virtual {v3, v12, v13, v14}, Landroid/util/SparseLongArray;->put(IJ)V

    invoke-virtual {v1, v6}, Landroid/view/MotionEvent;->getToolType(I)I

    move-result v6

    if-ne v6, v5, :cond_6

    const/4 v6, 0x1

    invoke-virtual {v4, v12, v6}, Landroid/util/SparseBooleanArray;->put(IZ)V

    :cond_6
    :goto_1
    const/16 v6, 0xa

    if-eq v2, v6, :cond_8

    const/4 v7, 0x7

    if-eq v2, v7, :cond_8

    if-ne v2, v11, :cond_7

    goto :goto_2

    :cond_7
    const/4 v7, 0x0

    goto :goto_3

    :cond_8
    :goto_2
    const/4 v7, 0x1

    :goto_3
    const/16 v8, 0x8

    if-ne v2, v8, :cond_9

    const/4 v12, 0x1

    goto :goto_4

    :cond_9
    const/4 v12, 0x0

    :goto_4
    if-eqz v7, :cond_a

    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getActionIndex()I

    move-result v13

    invoke-virtual {v1, v13}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v13

    const/4 v14, 0x1

    invoke-virtual {v4, v13, v14}, Landroid/util/SparseBooleanArray;->put(IZ)V

    goto :goto_5

    :cond_a
    const/4 v14, 0x1

    :goto_5
    const/4 v15, 0x6

    if-eq v2, v14, :cond_c

    move v14, v15

    if-eq v2, v14, :cond_b

    const/4 v2, -0x1

    goto :goto_6

    :cond_b
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getActionIndex()I

    move-result v2

    goto :goto_6

    :cond_c
    move v14, v15

    const/4 v2, 0x0

    :goto_6
    iget-object v15, v0, Lo1/g;->d:Ljava/util/ArrayList;

    invoke-virtual {v15}, Ljava/util/ArrayList;->clear()V

    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getPointerCount()I

    move-result v13

    const/4 v14, 0x0

    :goto_7
    if-ge v14, v13, :cond_19

    if-nez v7, :cond_e

    if-eq v14, v2, :cond_e

    if-eqz v12, :cond_d

    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getButtonState()I

    move-result v16

    if-eqz v16, :cond_e

    :cond_d
    const/16 v26, 0x1

    goto :goto_8

    :cond_e
    const/16 v26, 0x0

    :goto_8
    invoke-virtual {v1, v14}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v11

    invoke-virtual {v3, v11}, Landroid/util/SparseLongArray;->indexOfKey(I)I

    move-result v6

    if-ltz v6, :cond_f

    invoke-virtual {v3, v6}, Landroid/util/SparseLongArray;->valueAt(I)J

    move-result-wide v17

    move/from16 v35, v12

    move/from16 v36, v13

    move-wide/from16 v18, v17

    goto :goto_9

    :cond_f
    iget-wide v5, v0, Lo1/g;->a:J

    move/from16 v35, v12

    move/from16 v36, v13

    add-long v12, v5, v9

    iput-wide v12, v0, Lo1/g;->a:J

    invoke-virtual {v3, v11, v5, v6}, Landroid/util/SparseLongArray;->put(IJ)V

    move-wide/from16 v18, v5

    :goto_9
    invoke-virtual {v1, v14}, Landroid/view/MotionEvent;->getPressure(I)F

    move-result v27

    invoke-virtual {v1, v14}, Landroid/view/MotionEvent;->getX(I)F

    move-result v5

    invoke-virtual {v1, v14}, Landroid/view/MotionEvent;->getY(I)F

    move-result v6

    invoke-static {v5, v6}, Ld9/i;->f(FF)J

    move-result-wide v5

    const/4 v11, 0x3

    invoke-static {v5, v6, v11}, Ld1/c;->a(JI)J

    move-result-wide v33

    if-nez v14, :cond_10

    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getRawX()F

    move-result v5

    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getRawY()F

    move-result v6

    invoke-static {v5, v6}, Ld9/i;->f(FF)J

    move-result-wide v5

    move-object/from16 v11, p2

    check-cast v11, Lu1/w;

    invoke-virtual {v11, v5, v6}, Lu1/w;->A(J)J

    move-result-wide v11

    :goto_a
    move-wide/from16 v22, v5

    move-wide/from16 v24, v11

    goto :goto_b

    :cond_10
    sget v11, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v12, 0x1d

    if-lt v11, v12, :cond_11

    sget-object v5, Lo1/h;->a:Lo1/h;

    invoke-virtual {v5, v1, v14}, Lo1/h;->a(Landroid/view/MotionEvent;I)J

    move-result-wide v5

    move-object/from16 v11, p2

    check-cast v11, Lu1/w;

    invoke-virtual {v11, v5, v6}, Lu1/w;->A(J)J

    move-result-wide v11

    goto :goto_a

    :cond_11
    move-object/from16 v11, p2

    check-cast v11, Lu1/w;

    invoke-virtual {v11, v5, v6}, Lu1/w;->q(J)J

    move-result-wide v11

    move-wide/from16 v24, v5

    move-wide/from16 v22, v11

    :goto_b
    invoke-virtual {v1, v14}, Landroid/view/MotionEvent;->getToolType(I)I

    move-result v5

    if-eqz v5, :cond_15

    const/4 v6, 0x1

    if-eq v5, v6, :cond_14

    const/4 v11, 0x2

    if-eq v5, v11, :cond_13

    const/4 v12, 0x3

    if-eq v5, v12, :cond_12

    const/4 v11, 0x4

    if-eq v5, v11, :cond_12

    :goto_c
    const/16 v28, 0x0

    goto :goto_d

    :cond_12
    move/from16 v28, v11

    goto :goto_d

    :cond_13
    const/4 v12, 0x3

    move/from16 v28, v12

    goto :goto_d

    :cond_14
    const/4 v12, 0x3

    const/16 v28, 0x1

    goto :goto_d

    :cond_15
    const/4 v12, 0x3

    goto :goto_c

    :goto_d
    new-instance v5, Ljava/util/ArrayList;

    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getHistorySize()I

    move-result v11

    invoke-direct {v5, v11}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getHistorySize()I

    move-result v11

    const/4 v13, 0x0

    :goto_e
    if-ge v13, v11, :cond_17

    invoke-virtual {v1, v14, v13}, Landroid/view/MotionEvent;->getHistoricalX(II)F

    move-result v6

    invoke-virtual {v1, v14, v13}, Landroid/view/MotionEvent;->getHistoricalY(II)F

    move-result v9

    invoke-static {v6}, Ljava/lang/Float;->isInfinite(F)Z

    move-result v10

    if-nez v10, :cond_16

    invoke-static {v6}, Ljava/lang/Float;->isNaN(F)Z

    move-result v10

    if-nez v10, :cond_16

    invoke-static {v9}, Ljava/lang/Float;->isInfinite(F)Z

    move-result v10

    if-nez v10, :cond_16

    invoke-static {v9}, Ljava/lang/Float;->isNaN(F)Z

    move-result v10

    if-nez v10, :cond_16

    invoke-static {v6, v9}, Ld9/i;->f(FF)J

    move-result-wide v42

    new-instance v6, Lo1/d;

    invoke-virtual {v1, v13}, Landroid/view/MotionEvent;->getHistoricalEventTime(I)J

    move-result-wide v38

    move-object/from16 v37, v6

    move-wide/from16 v40, v42

    invoke-direct/range {v37 .. v43}, Lo1/d;-><init>(JJJ)V

    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_16
    add-int/lit8 v13, v13, 0x1

    const-wide/16 v9, 0x1

    goto :goto_e

    :cond_17
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v6

    if-ne v6, v8, :cond_18

    const/16 v6, 0xa

    invoke-virtual {v1, v6}, Landroid/view/MotionEvent;->getAxisValue(I)F

    move-result v9

    const/16 v10, 0x9

    invoke-virtual {v1, v10}, Landroid/view/MotionEvent;->getAxisValue(I)F

    move-result v11

    neg-float v11, v11

    const/4 v13, 0x0

    add-float/2addr v11, v13

    invoke-static {v9, v11}, Ld9/i;->f(FF)J

    move-result-wide v16

    :goto_f
    move-wide/from16 v31, v16

    goto :goto_10

    :cond_18
    const/16 v6, 0xa

    const/16 v10, 0x9

    sget-wide v16, Ld1/c;->b:J

    goto :goto_f

    :goto_10
    invoke-virtual {v1, v14}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v9

    const/4 v11, 0x0

    invoke-virtual {v4, v9, v11}, Landroid/util/SparseBooleanArray;->get(IZ)Z

    move-result v29

    new-instance v9, Lo1/x;

    move-object/from16 v17, v9

    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getEventTime()J

    move-result-wide v20

    move-object/from16 v30, v5

    invoke-direct/range {v17 .. v34}, Lo1/x;-><init>(JJJJZFIZLjava/util/ArrayList;JJ)V

    invoke-virtual {v15, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v14, v14, 0x1

    move v11, v10

    move v5, v12

    move/from16 v12, v35

    move/from16 v13, v36

    const-wide/16 v9, 0x1

    goto/16 :goto_7

    :cond_19
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v2

    const/4 v5, 0x1

    if-eq v2, v5, :cond_1a

    const/4 v6, 0x6

    if-eq v2, v6, :cond_1a

    const/4 v11, 0x0

    goto :goto_11

    :cond_1a
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getActionIndex()I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v2

    const/4 v11, 0x0

    invoke-virtual {v4, v2, v11}, Landroid/util/SparseBooleanArray;->get(IZ)Z

    move-result v6

    if-nez v6, :cond_1b

    invoke-virtual {v3, v2}, Landroid/util/SparseLongArray;->delete(I)V

    invoke-virtual {v4, v2}, Landroid/util/SparseBooleanArray;->delete(I)V

    :cond_1b
    :goto_11
    invoke-virtual {v3}, Landroid/util/SparseLongArray;->size()I

    move-result v2

    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getPointerCount()I

    move-result v6

    if-le v2, v6, :cond_1e

    invoke-virtual {v3}, Landroid/util/SparseLongArray;->size()I

    move-result v2

    const/4 v5, 0x1

    sub-int/2addr v2, v5

    const/4 v5, -0x1

    :goto_12
    if-ge v5, v2, :cond_1e

    invoke-virtual {v3, v2}, Landroid/util/SparseLongArray;->keyAt(I)I

    move-result v6

    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getPointerCount()I

    move-result v7

    move v8, v11

    :goto_13
    if-ge v8, v7, :cond_1d

    invoke-virtual {v1, v8}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v9

    if-ne v9, v6, :cond_1c

    goto :goto_14

    :cond_1c
    add-int/lit8 v8, v8, 0x1

    goto :goto_13

    :cond_1d
    invoke-virtual {v3, v2}, Landroid/util/SparseLongArray;->removeAt(I)V

    invoke-virtual {v4, v6}, Landroid/util/SparseBooleanArray;->delete(I)V

    :goto_14
    add-int/lit8 v2, v2, -0x1

    goto :goto_12

    :cond_1e
    new-instance v2, Lo1/w;

    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getEventTime()J

    invoke-direct {v2, v15, v1}, Lo1/w;-><init>(Ljava/util/ArrayList;Landroid/view/MotionEvent;)V

    return-object v2
.end method
