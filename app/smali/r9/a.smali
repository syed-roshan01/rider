.class public abstract Lr9/a;
.super Ljava/lang/Object;


# static fields
.field public static final a:Li3/u;

.field public static final b:Li3/u;

.field public static final c:Li3/u;

.field public static final d:Li3/u;

.field public static final e:Li3/u;

.field public static final f:Li3/u;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 3

    new-instance v0, Li3/u;

    const-string v1, "NO_DECISION"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Li3/u;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lr9/a;->a:Li3/u;

    new-instance v0, Li3/u;

    const-string v1, "CLOSED"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Li3/u;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lr9/a;->b:Li3/u;

    new-instance v0, Li3/u;

    const-string v1, "UNDEFINED"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Li3/u;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lr9/a;->c:Li3/u;

    new-instance v0, Li3/u;

    const-string v1, "REUSABLE_CLAIMED"

    invoke-direct {v0, v1, v2}, Li3/u;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lr9/a;->d:Li3/u;

    new-instance v0, Li3/u;

    const-string v1, "CONDITION_FALSE"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Li3/u;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lr9/a;->e:Li3/u;

    new-instance v0, Li3/u;

    const-string v1, "NO_THREAD_ELEMENTS"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Li3/u;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lr9/a;->f:Li3/u;

    return-void
.end method

.method public static final a(Lcom/google/android/gms/tasks/Task;Lu8/e;)Ljava/lang/Object;
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/gms/tasks/Task;->isComplete()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Lcom/google/android/gms/tasks/Task;->getException()Ljava/lang/Exception;

    move-result-object p1

    if-nez p1, :cond_1

    invoke-virtual {p0}, Lcom/google/android/gms/tasks/Task;->isCanceled()Z

    move-result p1

    if-nez p1, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    move-result-object p0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/util/concurrent/CancellationException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Task "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, " was cancelled normally."

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    throw p1

    :cond_2
    new-instance v0, Lm9/l;

    invoke-static {p1}, Ld7/t;->b0(Lu8/e;)Lu8/e;

    move-result-object p1

    const/4 v1, 0x1

    invoke-direct {v0, v1, p1}, Lm9/l;-><init>(ILu8/e;)V

    invoke-virtual {v0}, Lm9/l;->t()V

    sget-object p1, Lv9/a;->a:Lv9/a;

    new-instance v1, Lv9/b;

    invoke-direct {v1, v0}, Lv9/b;-><init>(Lm9/l;)V

    invoke-virtual {p0, p1, v1}, Lcom/google/android/gms/tasks/Task;->addOnCompleteListener(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/OnCompleteListener;)Lcom/google/android/gms/tasks/Task;

    invoke-virtual {v0}, Lm9/l;->s()Ljava/lang/Object;

    move-result-object p0

    sget-object p1, Lv8/a;->a:Lv8/a;

    :goto_0
    return-object p0
.end method

.method public static final b(Lja/e0;)Lja/z;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lja/z;

    invoke-direct {v0, p0}, Lja/z;-><init>(Lja/e0;)V

    return-object v0
.end method

.method public static final c(Lja/g0;)Lja/a0;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lja/a0;

    invoke-direct {v0, p0}, Lja/a0;-><init>(Lja/g0;)V

    return-object v0
.end method

.method public static final d(Ljava/util/ArrayList;)Ljava/util/LinkedHashMap;
    .locals 4

    sget-object v0, Lja/x;->b:Ljava/lang/String;

    const/4 v0, 0x0

    const-string v1, "/"

    invoke-static {v1, v0}, Lfa/l;->i(Ljava/lang/String;Z)Lja/x;

    move-result-object v0

    new-instance v1, Lka/g;

    invoke-direct {v1, v0}, Lka/g;-><init>(Lja/x;)V

    new-instance v2, Lq8/f;

    invoke-direct {v2, v0, v1}, Lq8/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v2}, [Lq8/f;

    move-result-object v0

    new-instance v1, Ljava/util/LinkedHashMap;

    const/4 v2, 0x1

    invoke-static {v2}, Lz6/a;->T(I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-static {v1, v0}, Lr8/v;->E0(Ljava/util/HashMap;[Lq8/f;)V

    new-instance v0, Lt1/p;

    const/16 v2, 0x9

    invoke-direct {v0, v2}, Lt1/p;-><init>(I)V

    invoke-static {p0, v0}, Lr8/p;->R0(Ljava/lang/Iterable;Lt1/p;)Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lka/g;

    iget-object v2, v0, Lka/g;->a:Lja/x;

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lka/g;

    if-nez v2, :cond_0

    :goto_1
    iget-object v0, v0, Lka/g;->a:Lja/x;

    invoke-virtual {v0}, Lja/x;->b()Lja/x;

    move-result-object v2

    if-nez v2, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {v1, v2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lka/g;

    if-eqz v3, :cond_2

    iget-object v2, v3, Lka/g;->h:Ljava/util/ArrayList;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    new-instance v3, Lka/g;

    invoke-direct {v3, v2}, Lka/g;-><init>(Lja/x;)V

    invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v2, v3, Lka/g;->h:Ljava/util/ArrayList;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object v0, v3

    goto :goto_1

    :cond_3
    return-object v1
.end method

.method public static final e(Lr9/t;JLc9/e;)Ljava/lang/Object;
    .locals 4

    :goto_0
    iget-wide v0, p0, Lr9/t;->c:J

    cmp-long v0, v0, p1

    if-ltz v0, :cond_1

    invoke-virtual {p0}, Lr9/t;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    return-object p0

    :cond_1
    :goto_1
    sget-object v0, Lr9/d;->a:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Lr9/a;->b:Li3/u;

    if-ne v0, v1, :cond_2

    return-object v1

    :cond_2
    check-cast v0, Lr9/d;

    check-cast v0, Lr9/t;

    if-eqz v0, :cond_4

    :cond_3
    :goto_2
    move-object p0, v0

    goto :goto_0

    :cond_4
    iget-wide v0, p0, Lr9/t;->c:J

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p3, v0, p0}, Lc9/e;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lr9/t;

    :cond_5
    sget-object v1, Lr9/d;->a:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    const/4 v2, 0x0

    invoke-virtual {v1, p0, v2, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-virtual {p0}, Lr9/t;->c()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-virtual {p0}, Lr9/d;->d()V

    goto :goto_2

    :cond_6
    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_5

    goto :goto_0
.end method

.method public static final f(I)Ljava/lang/String;
    .locals 1

    const/16 v0, 0x10

    invoke-static {v0}, Ld7/a;->n(I)V

    invoke-static {p0, v0}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object p0

    const-string v0, "toString(this, checkRadix(radix))"

    invoke-static {p0, v0}, Ld7/a;->l(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "0x"

    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final g(Ljava/lang/AssertionError;)Z
    .locals 2

    sget-object v0, Lja/v;->a:Ljava/util/logging/Logger;

    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_0

    const-string v0, "getsockname failed"

    invoke-static {p0, v0, v1}, Ll9/i;->F0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 v1, 0x1

    :cond_0
    return v1
.end method

.method public static final h(Lja/a0;)Lka/g;
    .locals 23

    move-object/from16 v8, p0

    invoke-virtual/range {p0 .. p0}, Lja/a0;->y()I

    move-result v0

    const v1, 0x2014b50

    if-ne v0, v1, :cond_8

    const-wide/16 v0, 0x4

    invoke-virtual {v8, v0, v1}, Lja/a0;->l(J)V

    invoke-virtual/range {p0 .. p0}, Lja/a0;->b()S

    move-result v0

    const v1, 0xffff

    and-int v2, v0, v1

    and-int/lit8 v0, v0, 0x1

    if-nez v0, :cond_7

    invoke-virtual/range {p0 .. p0}, Lja/a0;->b()S

    move-result v0

    and-int v10, v0, v1

    invoke-virtual/range {p0 .. p0}, Lja/a0;->b()S

    move-result v0

    and-int v2, v0, v1

    invoke-virtual/range {p0 .. p0}, Lja/a0;->b()S

    move-result v3

    and-int v4, v3, v1

    const/4 v9, 0x0

    const/4 v5, -0x1

    if-ne v2, v5, :cond_0

    const/4 v0, 0x0

    :goto_0
    move-object v11, v0

    goto :goto_1

    :cond_0
    new-instance v5, Ljava/util/GregorianCalendar;

    invoke-direct {v5}, Ljava/util/GregorianCalendar;-><init>()V

    const/16 v6, 0xe

    invoke-virtual {v5, v6, v9}, Ljava/util/Calendar;->set(II)V

    shr-int/lit8 v6, v4, 0x9

    and-int/lit8 v6, v6, 0x7f

    add-int/lit16 v12, v6, 0x7bc

    shr-int/lit8 v4, v4, 0x5

    and-int/lit8 v4, v4, 0xf

    and-int/lit8 v14, v3, 0x1f

    shr-int/lit8 v3, v2, 0xb

    and-int/lit8 v15, v3, 0x1f

    shr-int/lit8 v2, v2, 0x5

    and-int/lit8 v16, v2, 0x3f

    and-int/lit8 v0, v0, 0x1f

    shl-int/lit8 v17, v0, 0x1

    add-int/lit8 v13, v4, -0x1

    move-object v11, v5

    invoke-virtual/range {v11 .. v17}, Ljava/util/Calendar;->set(IIIIII)V

    invoke-virtual {v5}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    goto :goto_0

    :goto_1
    invoke-virtual/range {p0 .. p0}, Lja/a0;->y()I

    new-instance v12, Ld9/t;

    invoke-direct {v12}, Ljava/lang/Object;-><init>()V

    invoke-virtual/range {p0 .. p0}, Lja/a0;->y()I

    move-result v0

    int-to-long v2, v0

    const-wide v4, 0xffffffffL

    and-long/2addr v2, v4

    iput-wide v2, v12, Ld9/t;->a:J

    new-instance v13, Ld9/t;

    invoke-direct {v13}, Ljava/lang/Object;-><init>()V

    invoke-virtual/range {p0 .. p0}, Lja/a0;->y()I

    move-result v0

    int-to-long v2, v0

    and-long/2addr v2, v4

    iput-wide v2, v13, Ld9/t;->a:J

    invoke-virtual/range {p0 .. p0}, Lja/a0;->b()S

    move-result v0

    and-int/2addr v0, v1

    invoke-virtual/range {p0 .. p0}, Lja/a0;->b()S

    move-result v2

    and-int v14, v2, v1

    invoke-virtual/range {p0 .. p0}, Lja/a0;->b()S

    move-result v2

    and-int v15, v2, v1

    const-wide/16 v1, 0x8

    invoke-virtual {v8, v1, v2}, Lja/a0;->l(J)V

    new-instance v7, Ld9/t;

    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    invoke-virtual/range {p0 .. p0}, Lja/a0;->y()I

    move-result v1

    int-to-long v1, v1

    and-long/2addr v1, v4

    iput-wide v1, v7, Ld9/t;->a:J

    int-to-long v0, v0

    invoke-virtual {v8, v0, v1}, Lja/a0;->e(J)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v9}, Ll9/i;->G0(Ljava/lang/CharSequence;C)Z

    move-result v0

    if-nez v0, :cond_6

    iget-wide v0, v13, Ld9/t;->a:J

    cmp-long v0, v0, v4

    const-wide/16 v16, 0x0

    const/16 v1, 0x8

    if-nez v0, :cond_1

    int-to-long v2, v1

    move/from16 v18, v10

    goto :goto_2

    :cond_1
    move/from16 v18, v10

    move-wide/from16 v2, v16

    :goto_2
    iget-wide v9, v12, Ld9/t;->a:J

    cmp-long v0, v9, v4

    if-nez v0, :cond_2

    int-to-long v9, v1

    add-long/2addr v2, v9

    :cond_2
    iget-wide v9, v7, Ld9/t;->a:J

    cmp-long v0, v9, v4

    if-nez v0, :cond_3

    int-to-long v0, v1

    add-long/2addr v2, v0

    :cond_3
    move-wide v9, v2

    new-instance v5, Ld9/q;

    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    new-instance v4, Lka/h;

    move-object v0, v4

    move-object v1, v5

    move-wide v2, v9

    move-object/from16 v19, v11

    move-object v11, v4

    move-object v4, v13

    move-object/from16 v20, v13

    move-object v13, v5

    move-object/from16 v5, p0

    move-object/from16 v21, v6

    move-object v6, v12

    move-object/from16 v22, v7

    invoke-direct/range {v0 .. v7}, Lka/h;-><init>(Ld9/q;JLd9/t;Lja/a0;Ld9/t;Ld9/t;)V

    invoke-static {v8, v14, v11}, Lr9/a;->i(Lja/a0;ILc9/e;)V

    cmp-long v0, v9, v16

    if-lez v0, :cond_5

    iget-boolean v0, v13, Ld9/q;->a:Z

    if-eqz v0, :cond_4

    goto :goto_3

    :cond_4
    new-instance v0, Ljava/io/IOException;

    const-string v1, "bad zip: zip64 extra required but absent"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_5
    :goto_3
    int-to-long v0, v15

    invoke-virtual {v8, v0, v1}, Lja/a0;->e(J)Ljava/lang/String;

    move-result-object v5

    sget-object v0, Lja/x;->b:Ljava/lang/String;

    const-string v0, "/"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lfa/l;->i(Ljava/lang/String;Z)Lja/x;

    move-result-object v2

    move-object/from16 v3, v21

    invoke-virtual {v2, v3}, Lja/x;->d(Ljava/lang/String;)Lja/x;

    move-result-object v4

    invoke-static {v3, v0, v1}, Ll9/i;->H0(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v0

    new-instance v1, Lka/g;

    iget-wide v6, v12, Ld9/t;->a:J

    move-object/from16 v2, v20

    iget-wide v8, v2, Ld9/t;->a:J

    move-object/from16 v2, v22

    iget-wide v12, v2, Ld9/t;->a:J

    move-object v2, v1

    move-object v3, v4

    move v4, v0

    move/from16 v10, v18

    move-object/from16 v11, v19

    invoke-direct/range {v2 .. v13}, Lka/g;-><init>(Lja/x;ZLjava/lang/String;JJILjava/lang/Long;J)V

    return-object v1

    :cond_6
    new-instance v0, Ljava/io/IOException;

    const-string v1, "bad zip: filename contains 0x00"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_7
    new-instance v0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "unsupported zip: general purpose bit flag="

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v2}, Lr9/a;->f(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_8
    new-instance v2, Ljava/io/IOException;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "bad zip: expected "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v1}, Lr9/a;->f(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " but was "

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v0}, Lr9/a;->f(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v2
.end method

.method public static final i(Lja/a0;ILc9/e;)V
    .locals 11

    int-to-long v0, p1

    :goto_0
    const-wide/16 v2, 0x0

    cmp-long p1, v0, v2

    if-eqz p1, :cond_4

    const-wide/16 v4, 0x4

    cmp-long p1, v0, v4

    if-ltz p1, :cond_3

    invoke-virtual {p0}, Lja/a0;->b()S

    move-result p1

    const v4, 0xffff

    and-int/2addr p1, v4

    invoke-virtual {p0}, Lja/a0;->b()S

    move-result v4

    int-to-long v4, v4

    const-wide/32 v6, 0xffff

    and-long/2addr v4, v6

    const/4 v6, 0x4

    int-to-long v6, v6

    sub-long/2addr v0, v6

    cmp-long v6, v0, v4

    if-ltz v6, :cond_2

    invoke-virtual {p0, v4, v5}, Lja/a0;->S(J)V

    iget-object v6, p0, Lja/a0;->b:Lja/g;

    iget-wide v7, v6, Lja/g;->b:J

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v10

    invoke-interface {p2, v9, v10}, Lc9/e;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-wide v9, v6, Lja/g;->b:J

    add-long/2addr v9, v4

    sub-long/2addr v9, v7

    cmp-long v2, v9, v2

    if-ltz v2, :cond_1

    if-lez v2, :cond_0

    invoke-virtual {v6, v9, v10}, Lja/g;->l(J)V

    :cond_0
    sub-long/2addr v0, v4

    goto :goto_0

    :cond_1
    new-instance p0, Ljava/io/IOException;

    const-string p2, "unsupported zip: too many bytes processed for "

    invoke-static {p2, p1}, Ll/q;->g(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    new-instance p0, Ljava/io/IOException;

    const-string p1, "bad zip: truncated value in extra field"

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_3
    new-instance p0, Ljava/io/IOException;

    const-string p1, "bad zip: truncated header in extra field"

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_4
    return-void
.end method

.method public static final j(Lja/a0;Lja/l;)Lja/l;
    .locals 13

    new-instance v0, Ld9/u;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    iget-object v2, p1, Lja/l;->f:Ljava/lang/Long;

    goto :goto_0

    :cond_0
    move-object v2, v1

    :goto_0
    iput-object v2, v0, Ld9/u;->a:Ljava/lang/Object;

    new-instance v2, Ld9/u;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    new-instance v3, Ld9/u;

    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p0}, Lja/a0;->y()I

    move-result v4

    const v5, 0x4034b50

    if-ne v4, v5, :cond_3

    const-wide/16 v4, 0x2

    invoke-virtual {p0, v4, v5}, Lja/a0;->l(J)V

    invoke-virtual {p0}, Lja/a0;->b()S

    move-result v4

    const v5, 0xffff

    and-int v6, v4, v5

    and-int/lit8 v4, v4, 0x1

    if-nez v4, :cond_2

    const-wide/16 v6, 0x12

    invoke-virtual {p0, v6, v7}, Lja/a0;->l(J)V

    invoke-virtual {p0}, Lja/a0;->b()S

    move-result v4

    int-to-long v6, v4

    const-wide/32 v8, 0xffff

    and-long/2addr v6, v8

    invoke-virtual {p0}, Lja/a0;->b()S

    move-result v4

    and-int/2addr v4, v5

    invoke-virtual {p0, v6, v7}, Lja/a0;->l(J)V

    if-nez p1, :cond_1

    int-to-long v2, v4

    invoke-virtual {p0, v2, v3}, Lja/a0;->l(J)V

    return-object v1

    :cond_1
    new-instance v1, Ld5/s1;

    invoke-direct {v1, p0, v0, v2, v3}, Ld5/s1;-><init>(Lja/a0;Ld9/u;Ld9/u;Ld9/u;)V

    invoke-static {p0, v4, v1}, Lr9/a;->i(Lja/a0;ILc9/e;)V

    new-instance p0, Lja/l;

    iget-boolean v6, p1, Lja/l;->a:Z

    iget-boolean v7, p1, Lja/l;->b:Z

    const/4 v8, 0x0

    iget-object v9, p1, Lja/l;->d:Ljava/lang/Long;

    iget-object p1, v3, Ld9/u;->a:Ljava/lang/Object;

    move-object v10, p1

    check-cast v10, Ljava/lang/Long;

    iget-object p1, v0, Ld9/u;->a:Ljava/lang/Object;

    move-object v11, p1

    check-cast v11, Ljava/lang/Long;

    iget-object p1, v2, Ld9/u;->a:Ljava/lang/Object;

    move-object v12, p1

    check-cast v12, Ljava/lang/Long;

    move-object v5, p0

    invoke-direct/range {v5 .. v12}, Lja/l;-><init>(ZZLja/x;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;)V

    return-object p0

    :cond_2
    new-instance p0, Ljava/io/IOException;

    new-instance p1, Ljava/lang/StringBuilder;

    const-string v0, "unsupported zip: general purpose bit flag="

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v6}, Lr9/a;->f(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_3
    new-instance p0, Ljava/io/IOException;

    new-instance p1, Ljava/lang/StringBuilder;

    const-string v0, "bad zip: expected "

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v5}, Lr9/a;->f(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " but was "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v4}, Lr9/a;->f(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final k(Lu8/j;Ljava/lang/Object;)V
    .locals 2

    sget-object v0, Lr9/a;->f:Li3/u;

    if-ne p1, v0, :cond_0

    return-void

    :cond_0
    instance-of v0, p1, Lr9/y;

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    check-cast p1, Lr9/y;

    iget-object p0, p1, Lr9/y;->b:[Lm9/z1;

    array-length v0, p0

    add-int/lit8 v0, v0, -0x1

    if-gez v0, :cond_1

    return-void

    :cond_1
    aget-object p0, p0, v0

    invoke-static {v1}, Ld7/a;->j(Ljava/lang/Object;)V

    iget-object p0, p1, Lr9/y;->a:[Ljava/lang/Object;

    aget-object p0, p0, v0

    throw v1

    :cond_2
    sget-object p1, Lr9/w;->c:Lr9/w;

    invoke-interface {p0, v1, p1}, Lu8/j;->e(Ljava/lang/Object;Lc9/e;)Ljava/lang/Object;

    move-result-object p0

    const-string p1, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>"

    invoke-static {p0, p1}, Ld7/a;->k(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, La7/a;->w(Ljava/lang/Object;)V

    throw v1
.end method

.method public static final l(Lu8/e;Ljava/lang/Object;Lc9/c;)V
    .locals 6

    instance-of v0, p0, Lr9/h;

    if-eqz v0, :cond_a

    check-cast p0, Lr9/h;

    invoke-static {p1}, Lq8/h;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-nez v0, :cond_1

    if-eqz p2, :cond_0

    new-instance v0, Lm9/v;

    invoke-direct {v0, p2, p1}, Lm9/v;-><init>(Lc9/c;Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    move-object v0, p1

    goto :goto_0

    :cond_1
    new-instance p2, Lm9/u;

    const/4 v1, 0x0

    invoke-direct {p2, v0, v1}, Lm9/u;-><init>(Ljava/lang/Throwable;Z)V

    move-object v0, p2

    :goto_0
    iget-object p2, p0, Lr9/h;->e:Lu8/e;

    invoke-interface {p2}, Lu8/e;->getContext()Lu8/j;

    iget-object v1, p0, Lr9/h;->d:Lm9/z;

    invoke-virtual {v1}, Lm9/z;->d0()Z

    move-result v2

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    iput-object v0, p0, Lr9/h;->f:Ljava/lang/Object;

    iput v3, p0, Lm9/l0;->c:I

    invoke-interface {p2}, Lu8/e;->getContext()Lu8/j;

    move-result-object p1

    invoke-virtual {v1, p1, p0}, Lm9/z;->c0(Lu8/j;Ljava/lang/Runnable;)V

    goto/16 :goto_5

    :cond_2
    invoke-static {}, Lm9/a2;->a()Lm9/w0;

    move-result-object v1

    invoke-virtual {v1}, Lm9/w0;->j0()Z

    move-result v2

    if-eqz v2, :cond_3

    iput-object v0, p0, Lr9/h;->f:Ljava/lang/Object;

    iput v3, p0, Lm9/l0;->c:I

    invoke-virtual {v1, p0}, Lm9/w0;->g0(Lm9/l0;)V

    goto/16 :goto_5

    :cond_3
    invoke-virtual {v1, v3}, Lm9/w0;->i0(Z)V

    const/4 v2, 0x0

    :try_start_0
    invoke-interface {p2}, Lu8/e;->getContext()Lu8/j;

    move-result-object v4

    sget-object v5, Lm9/a0;->b:Lm9/a0;

    invoke-interface {v4, v5}, Lu8/j;->f(Lu8/i;)Lu8/h;

    move-result-object v4

    check-cast v4, Lm9/f1;

    if-eqz v4, :cond_4

    invoke-interface {v4}, Lm9/f1;->b()Z

    move-result v5

    if-nez v5, :cond_4

    check-cast v4, Lm9/p1;

    invoke-virtual {v4}, Lm9/p1;->H()Ljava/util/concurrent/CancellationException;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Lr9/h;->c(Ljava/lang/Object;Ljava/util/concurrent/CancellationException;)V

    invoke-static {p1}, Ld7/t;->N(Ljava/lang/Throwable;)Lq8/g;

    move-result-object p1

    invoke-virtual {p0, p1}, Lr9/h;->resumeWith(Ljava/lang/Object;)V

    goto :goto_2

    :catchall_0
    move-exception p1

    goto :goto_4

    :cond_4
    iget-object v0, p0, Lr9/h;->n:Ljava/lang/Object;

    invoke-interface {p2}, Lu8/e;->getContext()Lu8/j;

    move-result-object v4

    invoke-static {v4, v0}, Lr9/a;->t(Lu8/j;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    sget-object v5, Lr9/a;->f:Li3/u;

    if-eq v0, v5, :cond_5

    invoke-static {p2, v4, v0}, Lz6/a;->t0(Lu8/e;Lu8/j;Ljava/lang/Object;)Lm9/g2;

    move-result-object v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :cond_5
    move-object v5, v2

    :goto_1
    :try_start_1
    invoke-interface {p2, p1}, Lu8/e;->resumeWith(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-eqz v5, :cond_6

    :try_start_2
    invoke-virtual {v5}, Lm9/g2;->l0()Z

    move-result p1

    if-eqz p1, :cond_7

    :cond_6
    invoke-static {v4, v0}, Lr9/a;->k(Lu8/j;Ljava/lang/Object;)V

    :cond_7
    :goto_2
    invoke-virtual {v1}, Lm9/w0;->l0()Z

    move-result p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-nez p1, :cond_7

    :goto_3
    invoke-virtual {v1, v3}, Lm9/w0;->f0(Z)V

    goto :goto_5

    :catchall_1
    move-exception p1

    if-eqz v5, :cond_8

    :try_start_3
    invoke-virtual {v5}, Lm9/g2;->l0()Z

    move-result p2

    if-eqz p2, :cond_9

    :cond_8
    invoke-static {v4, v0}, Lr9/a;->k(Lu8/j;Ljava/lang/Object;)V

    :cond_9
    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :goto_4
    :try_start_4
    invoke-virtual {p0, p1, v2}, Lm9/l0;->h(Ljava/lang/Throwable;Ljava/lang/Throwable;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    goto :goto_3

    :catchall_2
    move-exception p0

    invoke-virtual {v1, v3}, Lm9/w0;->f0(Z)V

    throw p0

    :cond_a
    invoke-interface {p0, p1}, Lu8/e;->resumeWith(Ljava/lang/Object;)V

    :goto_5
    return-void
.end method

.method public static final m(Lja/d0;I)I
    .locals 4

    const-string v0, "<this>"

    invoke-static {p0, v0}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    add-int/lit8 p1, p1, 0x1

    iget-object v1, p0, Lja/d0;->e:[[B

    array-length v1, v1

    iget-object p0, p0, Lja/d0;->f:[I

    invoke-static {p0, v0}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    add-int/lit8 v1, v1, -0x1

    const/4 v0, 0x0

    :goto_0
    if-gt v0, v1, :cond_1

    add-int v2, v0, v1

    ushr-int/lit8 v2, v2, 0x1

    aget v3, p0, v2

    if-ge v3, p1, :cond_0

    add-int/lit8 v0, v2, 0x1

    goto :goto_0

    :cond_0
    if-le v3, p1, :cond_2

    add-int/lit8 v1, v2, -0x1

    goto :goto_0

    :cond_1
    neg-int p0, v0

    add-int/lit8 v2, p0, -0x1

    :cond_2
    if-ltz v2, :cond_3

    goto :goto_1

    :cond_3
    not-int v2, v2

    :goto_1
    return v2
.end method

.method public static final n(Ljava/net/Socket;)Lja/b;
    .locals 3

    sget-object v0, Lja/v;->a:Ljava/util/logging/Logger;

    new-instance v0, Lja/f0;

    invoke-direct {v0, p0}, Lja/f0;-><init>(Ljava/net/Socket;)V

    new-instance v1, Lja/b;

    invoke-virtual {p0}, Ljava/net/Socket;->getOutputStream()Ljava/io/OutputStream;

    move-result-object p0

    const-string v2, "getOutputStream(...)"

    invoke-static {p0, v2}, Ld7/a;->l(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v1, p0, v0}, Lja/b;-><init>(Ljava/io/OutputStream;Lja/i0;)V

    new-instance p0, Lja/b;

    invoke-direct {p0, v0, v1}, Lja/b;-><init>(Lja/f0;Lja/b;)V

    return-object p0
.end method

.method public static final o(Ljava/io/InputStream;)Lja/c;
    .locals 2

    sget-object v0, Lja/v;->a:Ljava/util/logging/Logger;

    const-string v0, "<this>"

    invoke-static {p0, v0}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lja/c;

    new-instance v1, Lja/i0;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    invoke-direct {v0, p0, v1}, Lja/c;-><init>(Ljava/io/InputStream;Lja/i0;)V

    return-object v0
.end method

.method public static final p(Ljava/net/Socket;)Lja/c;
    .locals 3

    sget-object v0, Lja/v;->a:Ljava/util/logging/Logger;

    new-instance v0, Lja/f0;

    invoke-direct {v0, p0}, Lja/f0;-><init>(Ljava/net/Socket;)V

    new-instance v1, Lja/c;

    invoke-virtual {p0}, Ljava/net/Socket;->getInputStream()Ljava/io/InputStream;

    move-result-object p0

    const-string v2, "getInputStream(...)"

    invoke-static {p0, v2}, Ld7/a;->l(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v1, p0, v0}, Lja/c;-><init>(Ljava/io/InputStream;Lja/i0;)V

    new-instance p0, Lja/c;

    invoke-direct {p0, v0, v1}, Lja/c;-><init>(Lja/f0;Lja/c;)V

    return-object p0
.end method

.method public static final q(Ljava/lang/String;JJJ)J
    .locals 4

    sget v0, Lr9/v;->a:I

    :try_start_0
    invoke-static {p0}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    invoke-static {v0}, Ll9/h;->E0(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object p1

    const/16 p2, 0x27

    const-string v1, "System property \'"

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    cmp-long p1, p3, v2

    if-gtz p1, :cond_1

    cmp-long p1, v2, p5

    if-gtz p1, :cond_1

    move-wide p1, v2

    :goto_1
    return-wide p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "\' should be in range "

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3, p4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p0, ".."

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p5, p6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p0, ", but is \'"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "\' has unrecognized value \'"

    invoke-virtual {p3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static r(Ljava/lang/String;IIII)I
    .locals 7

    and-int/lit8 v0, p4, 0x4

    if-eqz v0, :cond_0

    const/4 p2, 0x1

    :cond_0
    and-int/lit8 p4, p4, 0x8

    if-eqz p4, :cond_1

    const p3, 0x7fffffff

    :cond_1
    int-to-long v1, p1

    int-to-long v3, p2

    int-to-long v5, p3

    move-object v0, p0

    invoke-static/range {v0 .. v6}, Lr9/a;->q(Ljava/lang/String;JJJ)J

    move-result-wide p0

    long-to-int p0, p0

    return p0
.end method

.method public static final s(Lu8/j;)Ljava/lang/Object;
    .locals 2

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    sget-object v1, Lr9/w;->b:Lr9/w;

    invoke-interface {p0, v0, v1}, Lu8/j;->e(Ljava/lang/Object;Lc9/e;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Ld7/a;->j(Ljava/lang/Object;)V

    return-object p0
.end method

.method public static final t(Lu8/j;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    if-nez p1, :cond_0

    invoke-static {p0}, Lr9/a;->s(Lu8/j;)Ljava/lang/Object;

    move-result-object p1

    :cond_0
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    if-ne p1, v0, :cond_1

    sget-object p0, Lr9/a;->f:Li3/u;

    goto :goto_0

    :cond_1
    instance-of v0, p1, Ljava/lang/Integer;

    if-eqz v0, :cond_2

    new-instance v0, Lr9/y;

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    invoke-direct {v0, p0, p1}, Lr9/y;-><init>(Lu8/j;I)V

    sget-object p1, Lr9/w;->d:Lr9/w;

    invoke-interface {p0, v0, p1}, Lu8/j;->e(Ljava/lang/Object;Lc9/e;)Ljava/lang/Object;

    move-result-object p0

    :goto_0
    return-object p0

    :cond_2
    invoke-static {p1}, La7/a;->w(Ljava/lang/Object;)V

    const/4 p0, 0x0

    throw p0
.end method
