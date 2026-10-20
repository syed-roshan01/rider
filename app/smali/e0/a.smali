.class public abstract Le0/a;
.super Ljava/lang/Object;

# interfaces
.implements Le1/l0;


# instance fields
.field public final a:Le0/b;

.field public final b:Le0/b;

.field public final c:Le0/b;

.field public final d:Le0/b;


# direct methods
.method public constructor <init>(Le0/b;Le0/b;Le0/b;Le0/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le0/a;->a:Le0/b;

    iput-object p2, p0, Le0/a;->b:Le0/b;

    iput-object p3, p0, Le0/a;->c:Le0/b;

    iput-object p4, p0, Le0/a;->d:Le0/b;

    return-void
.end method

.method public static a(Le0/a;Le0/c;Le0/c;Le0/c;I)Le0/e;
    .locals 2

    and-int/lit8 v0, p4, 0x1

    if-eqz v0, :cond_0

    iget-object p1, p0, Le0/a;->a:Le0/b;

    :cond_0
    and-int/lit8 v0, p4, 0x2

    if-eqz v0, :cond_1

    iget-object v0, p0, Le0/a;->b:Le0/b;

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    and-int/lit8 v1, p4, 0x4

    if-eqz v1, :cond_2

    iget-object p2, p0, Le0/a;->c:Le0/b;

    :cond_2
    and-int/lit8 p4, p4, 0x8

    if-eqz p4, :cond_3

    iget-object p3, p0, Le0/a;->d:Le0/b;

    :cond_3
    check-cast p0, Le0/e;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance p0, Le0/e;

    invoke-direct {p0, p1, v0, p2, p3}, Le0/a;-><init>(Le0/b;Le0/b;Le0/b;Le0/b;)V

    return-object p0
.end method


# virtual methods
.method public final d(JLm2/l;Lm2/b;)Le1/g0;
    .locals 23

    move-object/from16 v0, p0

    move-wide/from16 v1, p1

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    iget-object v5, v0, Le0/a;->a:Le0/b;

    invoke-interface {v5, v1, v2, v4}, Le0/b;->a(JLm2/b;)F

    move-result v5

    iget-object v6, v0, Le0/a;->b:Le0/b;

    invoke-interface {v6, v1, v2, v4}, Le0/b;->a(JLm2/b;)F

    move-result v6

    iget-object v7, v0, Le0/a;->c:Le0/b;

    invoke-interface {v7, v1, v2, v4}, Le0/b;->a(JLm2/b;)F

    move-result v7

    iget-object v8, v0, Le0/a;->d:Le0/b;

    invoke-interface {v8, v1, v2, v4}, Le0/b;->a(JLm2/b;)F

    move-result v4

    invoke-static/range {p1 .. p2}, Ld1/f;->c(J)F

    move-result v8

    add-float v9, v5, v4

    cmpl-float v10, v9, v8

    if-lez v10, :cond_0

    div-float v9, v8, v9

    mul-float/2addr v5, v9

    mul-float/2addr v4, v9

    :cond_0
    add-float v9, v6, v7

    cmpl-float v10, v9, v8

    if-lez v10, :cond_1

    div-float/2addr v8, v9

    mul-float/2addr v6, v8

    mul-float/2addr v7, v8

    :cond_1
    const/4 v8, 0x0

    cmpl-float v9, v5, v8

    if-ltz v9, :cond_7

    cmpl-float v9, v6, v8

    if-ltz v9, :cond_7

    cmpl-float v9, v7, v8

    if-ltz v9, :cond_7

    cmpl-float v9, v4, v8

    if-ltz v9, :cond_7

    add-float v9, v5, v6

    add-float/2addr v9, v7

    add-float/2addr v9, v4

    cmpg-float v8, v9, v8

    if-nez v8, :cond_2

    new-instance v3, Le1/b0;

    sget-wide v4, Ld1/c;->b:J

    invoke-static {v4, v5, v1, v2}, Lm9/e0;->h(JJ)Ld1/d;

    move-result-object v1

    invoke-direct {v3, v1}, Le1/b0;-><init>(Ld1/d;)V

    goto :goto_3

    :cond_2
    new-instance v8, Le1/c0;

    sget-wide v9, Ld1/c;->b:J

    invoke-static {v9, v10, v1, v2}, Lm9/e0;->h(JJ)Ld1/d;

    move-result-object v1

    sget-object v2, Lm2/l;->a:Lm2/l;

    if-ne v3, v2, :cond_3

    move v9, v5

    goto :goto_0

    :cond_3
    move v9, v6

    :goto_0
    invoke-static {v9, v9}, Lf6/a;->d(FF)J

    move-result-wide v15

    if-ne v3, v2, :cond_4

    move v5, v6

    :cond_4
    invoke-static {v5, v5}, Lf6/a;->d(FF)J

    move-result-wide v17

    if-ne v3, v2, :cond_5

    move v5, v7

    goto :goto_1

    :cond_5
    move v5, v4

    :goto_1
    invoke-static {v5, v5}, Lf6/a;->d(FF)J

    move-result-wide v19

    if-ne v3, v2, :cond_6

    goto :goto_2

    :cond_6
    move v4, v7

    :goto_2
    invoke-static {v4, v4}, Lf6/a;->d(FF)J

    move-result-wide v21

    new-instance v2, Ld1/e;

    iget v11, v1, Ld1/d;->a:F

    iget v12, v1, Ld1/d;->b:F

    iget v13, v1, Ld1/d;->c:F

    iget v14, v1, Ld1/d;->d:F

    move-object v10, v2

    invoke-direct/range {v10 .. v22}, Ld1/e;-><init>(FFFFJJJJ)V

    invoke-direct {v8, v2}, Le1/c0;-><init>(Ld1/e;)V

    move-object v3, v8

    :goto_3
    return-object v3

    :cond_7
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Corner size in Px can\'t be negative(topStart = "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v2, ", topEnd = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v2, ", bottomEnd = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v2, ", bottomStart = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v2, ")!"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v2
.end method
