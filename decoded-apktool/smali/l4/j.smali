.class public final Ll4/j;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/io/Closeable;
.implements Ljava/io/Flushable;


# static fields
.field public static final x:Ll9/d;


# instance fields
.field public final a:Lja/x;

.field public final b:J

.field public final c:Lja/x;

.field public final d:Lja/x;

.field public final e:Lja/x;

.field public final f:Ljava/util/LinkedHashMap;

.field public final n:Lr9/e;

.field public o:J

.field public p:I

.field public q:Lja/h;

.field public r:Z

.field public s:Z

.field public t:Z

.field public u:Z

.field public v:Z

.field public final w:Ll4/h;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ll9/d;

    const-string v1, "[a-z0-9_-]{1,120}"

    invoke-direct {v0, v1}, Ll9/d;-><init>(Ljava/lang/String;)V

    sput-object v0, Ll4/j;->x:Ll9/d;

    return-void
.end method

.method public constructor <init>(Lja/t;Lja/x;Lt9/c;J)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Ll4/j;->a:Lja/x;

    iput-wide p4, p0, Ll4/j;->b:J

    const-wide/16 v0, 0x0

    cmp-long p4, p4, v0

    if-lez p4, :cond_0

    const-string p4, "journal"

    invoke-virtual {p2, p4}, Lja/x;->d(Ljava/lang/String;)Lja/x;

    move-result-object p4

    iput-object p4, p0, Ll4/j;->c:Lja/x;

    const-string p4, "journal.tmp"

    invoke-virtual {p2, p4}, Lja/x;->d(Ljava/lang/String;)Lja/x;

    move-result-object p4

    iput-object p4, p0, Ll4/j;->d:Lja/x;

    const-string p4, "journal.bkp"

    invoke-virtual {p2, p4}, Lja/x;->d(Ljava/lang/String;)Lja/x;

    move-result-object p2

    iput-object p2, p0, Ll4/j;->e:Lja/x;

    new-instance p2, Ljava/util/LinkedHashMap;

    const/4 p4, 0x0

    const/high16 p5, 0x3f400000    # 0.75f

    const/4 v0, 0x1

    invoke-direct {p2, p4, p5, v0}, Ljava/util/LinkedHashMap;-><init>(IFZ)V

    iput-object p2, p0, Ll4/j;->f:Ljava/util/LinkedHashMap;

    invoke-static {}, Ld7/t;->k()Lm9/y1;

    move-result-object p2

    invoke-virtual {p3, v0}, Lt9/c;->e0(I)Lm9/z;

    move-result-object p3

    invoke-static {p2, p3}, Ld7/a;->A(Lu8/j;Lu8/j;)Lu8/j;

    move-result-object p2

    invoke-static {p2}, Ld7/a;->b(Lu8/j;)Lr9/e;

    move-result-object p2

    iput-object p2, p0, Ll4/j;->n:Lr9/e;

    new-instance p2, Ll4/h;

    invoke-direct {p2, p1}, Ll4/h;-><init>(Lja/t;)V

    iput-object p2, p0, Ll4/j;->w:Ll4/h;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "maxSize <= 0"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static T(Ljava/lang/String;)V
    .locals 2

    sget-object v0, Ll4/j;->x:Ll9/d;

    invoke-virtual {v0, p0}, Ll9/d;->a(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "keys must match regex [a-z0-9_-]{1,120}: \""

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p0, 0x22

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static final a(Ll4/j;Ll4/e;Z)V
    .locals 9

    monitor-enter p0

    :try_start_0
    iget-object v0, p1, Ll4/e;->b:Ljava/lang/Object;

    check-cast v0, Ll4/f;

    iget-object v1, v0, Ll4/f;->g:Ll4/e;

    invoke-static {v1, p1}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_d

    const/4 v1, 0x0

    const/4 v2, 0x2

    if-eqz p2, :cond_5

    iget-boolean v3, v0, Ll4/f;->f:Z

    if-nez v3, :cond_5

    move v3, v1

    :goto_0
    if-ge v3, v2, :cond_1

    iget-object v4, p1, Ll4/e;->c:Ljava/lang/Object;

    check-cast v4, [Z

    aget-boolean v4, v4, v3

    if-eqz v4, :cond_0

    iget-object v4, p0, Ll4/j;->w:Ll4/h;

    iget-object v5, v0, Ll4/f;->d:Ljava/util/ArrayList;

    invoke-virtual {v5, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lja/x;

    invoke-virtual {v4, v5}, Lja/m;->f(Lja/x;)Z

    move-result v4

    if-nez v4, :cond_0

    invoke-virtual {p1, v1}, Ll4/e;->d(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    goto/16 :goto_8

    :catchall_0
    move-exception p1

    goto/16 :goto_9

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    move p1, v1

    :goto_1
    if-ge p1, v2, :cond_6

    :try_start_1
    iget-object v3, v0, Ll4/f;->d:Ljava/util/ArrayList;

    invoke-virtual {v3, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lja/x;

    iget-object v4, v0, Ll4/f;->c:Ljava/util/ArrayList;

    invoke-virtual {v4, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lja/x;

    iget-object v5, p0, Ll4/j;->w:Ll4/h;

    invoke-virtual {v5, v3}, Lja/m;->f(Lja/x;)Z

    move-result v5

    if-eqz v5, :cond_2

    iget-object v5, p0, Ll4/j;->w:Ll4/h;

    invoke-virtual {v5, v3, v4}, Ll4/h;->b(Lja/x;Lja/x;)V

    goto :goto_2

    :cond_2
    iget-object v3, p0, Ll4/j;->w:Ll4/h;

    iget-object v5, v0, Ll4/f;->c:Ljava/util/ArrayList;

    invoke-virtual {v5, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lja/x;

    invoke-virtual {v3, v5}, Lja/m;->f(Lja/x;)Z

    move-result v6

    if-nez v6, :cond_3

    invoke-virtual {v3, v5}, Ll4/h;->k(Lja/x;)Lja/e0;

    move-result-object v3

    invoke-static {v3}, Lw4/e;->a(Ljava/io/Closeable;)V

    :cond_3
    :goto_2
    iget-object v3, v0, Ll4/f;->b:[J

    aget-wide v5, v3, p1

    iget-object v3, p0, Ll4/j;->w:Ll4/h;

    invoke-virtual {v3, v4}, Lja/m;->h(Lja/x;)Lja/l;

    move-result-object v3

    iget-object v3, v3, Lja/l;->d:Ljava/lang/Long;

    if-eqz v3, :cond_4

    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    goto :goto_3

    :cond_4
    const-wide/16 v3, 0x0

    :goto_3
    iget-object v7, v0, Ll4/f;->b:[J

    aput-wide v3, v7, p1

    iget-wide v7, p0, Ll4/j;->o:J

    sub-long/2addr v7, v5

    add-long/2addr v7, v3

    iput-wide v7, p0, Ll4/j;->o:J

    add-int/lit8 p1, p1, 0x1

    goto :goto_1

    :cond_5
    move p1, v1

    :goto_4
    if-ge p1, v2, :cond_6

    iget-object v3, p0, Ll4/j;->w:Ll4/h;

    iget-object v4, v0, Ll4/f;->d:Ljava/util/ArrayList;

    invoke-virtual {v4, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lja/x;

    invoke-virtual {v3, v4}, Lja/m;->e(Lja/x;)V

    add-int/lit8 p1, p1, 0x1

    goto :goto_4

    :cond_6
    const/4 p1, 0x0

    iput-object p1, v0, Ll4/f;->g:Ll4/e;

    iget-boolean p1, v0, Ll4/f;->f:Z

    if-eqz p1, :cond_7

    invoke-virtual {p0, v0}, Ll4/j;->P(Ll4/f;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    goto :goto_8

    :cond_7
    :try_start_2
    iget p1, p0, Ll4/j;->p:I

    const/4 v2, 0x1

    add-int/2addr p1, v2

    iput p1, p0, Ll4/j;->p:I

    iget-object p1, p0, Ll4/j;->q:Lja/h;

    invoke-static {p1}, Ld7/a;->j(Ljava/lang/Object;)V

    const/16 v3, 0x20

    const/16 v4, 0xa

    if-nez p2, :cond_9

    iget-boolean p2, v0, Ll4/f;->e:Z

    if-eqz p2, :cond_8

    goto :goto_5

    :cond_8
    iget-object p2, p0, Ll4/j;->f:Ljava/util/LinkedHashMap;

    iget-object v1, v0, Ll4/f;->a:Ljava/lang/String;

    invoke-virtual {p2, v1}, Ljava/util/AbstractMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    const-string p2, "REMOVE"

    invoke-interface {p1, p2}, Lja/h;->V(Ljava/lang/String;)Lja/h;

    invoke-interface {p1, v3}, Lja/h;->C(I)Lja/h;

    iget-object p2, v0, Ll4/f;->a:Ljava/lang/String;

    invoke-interface {p1, p2}, Lja/h;->V(Ljava/lang/String;)Lja/h;

    invoke-interface {p1, v4}, Lja/h;->C(I)Lja/h;

    goto :goto_7

    :cond_9
    :goto_5
    iput-boolean v2, v0, Ll4/f;->e:Z

    const-string p2, "CLEAN"

    invoke-interface {p1, p2}, Lja/h;->V(Ljava/lang/String;)Lja/h;

    invoke-interface {p1, v3}, Lja/h;->C(I)Lja/h;

    iget-object p2, v0, Ll4/f;->a:Ljava/lang/String;

    invoke-interface {p1, p2}, Lja/h;->V(Ljava/lang/String;)Lja/h;

    iget-object p2, v0, Ll4/f;->b:[J

    array-length v0, p2

    :goto_6
    if-ge v1, v0, :cond_a

    aget-wide v5, p2, v1

    invoke-interface {p1, v3}, Lja/h;->C(I)Lja/h;

    move-result-object v2

    invoke-interface {v2, v5, v6}, Lja/h;->W(J)Lja/h;

    add-int/lit8 v1, v1, 0x1

    goto :goto_6

    :cond_a
    invoke-interface {p1, v4}, Lja/h;->C(I)Lja/h;

    :goto_7
    invoke-interface {p1}, Lja/h;->flush()V

    iget-wide p1, p0, Ll4/j;->o:J

    iget-wide v0, p0, Ll4/j;->b:J

    cmp-long p1, p1, v0

    if-gtz p1, :cond_b

    iget p1, p0, Ll4/j;->p:I

    const/16 p2, 0x7d0

    if-lt p1, p2, :cond_c

    :cond_b
    invoke-virtual {p0}, Ll4/j;->p()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :cond_c
    monitor-exit p0

    :goto_8
    return-void

    :cond_d
    :try_start_3
    const-string p1, "Check failed."

    new-instance p2, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :goto_9
    monitor-exit p0

    throw p1
.end method


# virtual methods
.method public final M()V
    .locals 13

    const-string v0, ", "

    const-string v1, "unexpected journal header: ["

    iget-object v2, p0, Ll4/j;->w:Ll4/h;

    iget-object v3, p0, Ll4/j;->c:Lja/x;

    invoke-virtual {v2, v3}, Ll4/h;->l(Lja/x;)Lja/g0;

    move-result-object v2

    invoke-static {v2}, Lr9/a;->c(Lja/g0;)Lja/a0;

    move-result-object v2

    const-wide v3, 0x7fffffffffffffffL

    const/4 v5, 0x0

    :try_start_0
    invoke-virtual {v2, v3, v4}, Lja/a0;->K(J)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v2, v3, v4}, Lja/a0;->K(J)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v2, v3, v4}, Lja/a0;->K(J)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v2, v3, v4}, Lja/a0;->K(J)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v2, v3, v4}, Lja/a0;->K(J)Ljava/lang/String;

    move-result-object v10

    const-string v11, "libcore.io.DiskLruCache"

    invoke-static {v11, v6}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_1

    const-string v11, "1"

    invoke-static {v11, v7}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_1

    const/4 v11, 0x1

    invoke-static {v11}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v11

    invoke-static {v11, v8}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_1

    const/4 v11, 0x2

    invoke-static {v11}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v11

    invoke-static {v11, v9}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_1

    invoke-virtual {v10}, Ljava/lang/String;->length()I

    move-result v11
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-gtz v11, :cond_1

    const/4 v0, 0x0

    :goto_0
    :try_start_1
    invoke-virtual {v2, v3, v4}, Lja/a0;->K(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Ll4/j;->O(Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/io/EOFException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_2

    :catch_0
    :try_start_2
    iget-object v1, p0, Ll4/j;->f:Ljava/util/LinkedHashMap;

    invoke-virtual {v1}, Ljava/util/AbstractMap;->size()I

    move-result v1

    sub-int/2addr v0, v1

    iput v0, p0, Ll4/j;->p:I

    invoke-virtual {v2}, Lja/a0;->B()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Ll4/j;->c0()V

    goto :goto_1

    :cond_0
    invoke-virtual {p0}, Ll4/j;->q()Lja/z;

    move-result-object v0

    iput-object v0, p0, Ll4/j;->q:Lja/h;

    :goto_1
    sget-object v0, Lq8/l;->a:Lq8/l;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    invoke-virtual {v2}, Lja/a0;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_4

    :catchall_1
    move-exception v5

    goto :goto_4

    :cond_1
    :try_start_4
    new-instance v3, Ljava/io/IOException;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v0, 0x5d

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v3, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v3
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :goto_2
    :try_start_5
    invoke-virtual {v2}, Lja/a0;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    goto :goto_3

    :catchall_2
    move-exception v1

    invoke-static {v0, v1}, Ld7/a;->c(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    :goto_3
    move-object v12, v5

    move-object v5, v0

    move-object v0, v12

    :goto_4
    if-nez v5, :cond_2

    invoke-static {v0}, Ld7/a;->j(Ljava/lang/Object;)V

    return-void

    :cond_2
    throw v5
.end method

.method public final O(Ljava/lang/String;)V
    .locals 11

    const/16 v0, 0x20

    const/4 v1, 0x0

    const/4 v2, 0x6

    invoke-static {p1, v0, v1, v1, v2}, Ll9/i;->O0(Ljava/lang/CharSequence;CIZI)I

    move-result v3

    const-string v4, "unexpected journal line: "

    const/4 v5, -0x1

    if-eq v3, v5, :cond_8

    add-int/lit8 v6, v3, 0x1

    const/4 v7, 0x4

    invoke-static {p1, v0, v6, v1, v7}, Ll9/i;->O0(Ljava/lang/CharSequence;CIZI)I

    move-result v8

    iget-object v9, p0, Ll4/j;->f:Ljava/util/LinkedHashMap;

    const-string v10, "this as java.lang.String).substring(startIndex)"

    if-ne v8, v5, :cond_0

    invoke-virtual {p1, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v10}, Ld7/a;->l(Ljava/lang/Object;Ljava/lang/String;)V

    if-ne v3, v2, :cond_1

    const-string v2, "REMOVE"

    invoke-static {p1, v2, v1}, Ll9/i;->h1(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {v9, v6}, Ljava/util/AbstractMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_0
    invoke-virtual {p1, v6, v8}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v6

    const-string v2, "this as java.lang.String\u2026ing(startIndex, endIndex)"

    invoke-static {v6, v2}, Ld7/a;->l(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_1
    invoke-virtual {v9, v6}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_2

    new-instance v2, Ll4/f;

    invoke-direct {v2, p0, v6}, Ll4/f;-><init>(Ll4/j;Ljava/lang/String;)V

    invoke-interface {v9, v6, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    check-cast v2, Ll4/f;

    const/4 v6, 0x5

    if-eq v8, v5, :cond_4

    if-ne v3, v6, :cond_4

    const-string v9, "CLEAN"

    invoke-static {p1, v9, v1}, Ll9/i;->h1(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v9

    if-eqz v9, :cond_4

    const/4 v3, 0x1

    add-int/2addr v8, v3

    invoke-virtual {p1, v8}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v10}, Ld7/a;->l(Ljava/lang/Object;Ljava/lang/String;)V

    new-array v5, v3, [C

    aput-char v0, v5, v1

    invoke-static {p1, v5}, Ll9/i;->f1(Ljava/lang/CharSequence;[C)Ljava/util/List;

    move-result-object p1

    iput-boolean v3, v2, Ll4/f;->e:Z

    const/4 v0, 0x0

    iput-object v0, v2, Ll4/f;->g:Ll4/e;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    iget-object v3, v2, Ll4/f;->i:Ll4/j;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v3, 0x2

    if-ne v0, v3, :cond_3

    :try_start_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    :goto_0
    if-ge v1, v0, :cond_6

    iget-object v3, v2, Ll4/f;->b:[J

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    invoke-static {v5}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v5

    aput-wide v5, v3, v1
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :catch_0
    new-instance v0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    new-instance v0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    if-ne v8, v5, :cond_5

    if-ne v3, v6, :cond_5

    const-string v0, "DIRTY"

    invoke-static {p1, v0, v1}, Ll9/i;->h1(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_5

    new-instance p1, Ll4/e;

    invoke-direct {p1, p0, v2}, Ll4/e;-><init>(Ll4/j;Ll4/f;)V

    iput-object p1, v2, Ll4/f;->g:Ll4/e;

    goto :goto_1

    :cond_5
    if-ne v8, v5, :cond_7

    if-ne v3, v7, :cond_7

    const-string v0, "READ"

    invoke-static {p1, v0, v1}, Ll9/i;->h1(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_7

    :cond_6
    :goto_1
    return-void

    :cond_7
    new-instance v0, Ljava/io/IOException;

    invoke-virtual {v4, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_8
    new-instance v0, Ljava/io/IOException;

    invoke-virtual {v4, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final P(Ll4/f;)V
    .locals 10

    iget v0, p1, Ll4/f;->h:I

    const/16 v1, 0xa

    const/16 v2, 0x20

    iget-object v3, p1, Ll4/f;->a:Ljava/lang/String;

    if-lez v0, :cond_0

    iget-object v0, p0, Ll4/j;->q:Lja/h;

    if-eqz v0, :cond_0

    const-string v4, "DIRTY"

    invoke-interface {v0, v4}, Lja/h;->V(Ljava/lang/String;)Lja/h;

    invoke-interface {v0, v2}, Lja/h;->C(I)Lja/h;

    invoke-interface {v0, v3}, Lja/h;->V(Ljava/lang/String;)Lja/h;

    invoke-interface {v0, v1}, Lja/h;->C(I)Lja/h;

    invoke-interface {v0}, Lja/h;->flush()V

    :cond_0
    iget v0, p1, Ll4/f;->h:I

    const/4 v4, 0x1

    if-gtz v0, :cond_5

    iget-object v0, p1, Ll4/f;->g:Ll4/e;

    if-eqz v0, :cond_1

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_0
    const/4 v5, 0x2

    if-ge v0, v5, :cond_2

    iget-object v5, p1, Ll4/f;->c:Ljava/util/ArrayList;

    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lja/x;

    iget-object v6, p0, Ll4/j;->w:Ll4/h;

    invoke-virtual {v6, v5}, Lja/m;->e(Lja/x;)V

    iget-wide v5, p0, Ll4/j;->o:J

    iget-object v7, p1, Ll4/f;->b:[J

    aget-wide v8, v7, v0

    sub-long/2addr v5, v8

    iput-wide v5, p0, Ll4/j;->o:J

    const-wide/16 v5, 0x0

    aput-wide v5, v7, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    iget p1, p0, Ll4/j;->p:I

    add-int/2addr p1, v4

    iput p1, p0, Ll4/j;->p:I

    iget-object p1, p0, Ll4/j;->q:Lja/h;

    if-eqz p1, :cond_3

    const-string v0, "REMOVE"

    invoke-interface {p1, v0}, Lja/h;->V(Ljava/lang/String;)Lja/h;

    invoke-interface {p1, v2}, Lja/h;->C(I)Lja/h;

    invoke-interface {p1, v3}, Lja/h;->V(Ljava/lang/String;)Lja/h;

    invoke-interface {p1, v1}, Lja/h;->C(I)Lja/h;

    :cond_3
    iget-object p1, p0, Ll4/j;->f:Ljava/util/LinkedHashMap;

    invoke-virtual {p1, v3}, Ljava/util/AbstractMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    iget p1, p0, Ll4/j;->p:I

    const/16 v0, 0x7d0

    if-lt p1, v0, :cond_4

    invoke-virtual {p0}, Ll4/j;->p()V

    :cond_4
    return-void

    :cond_5
    :goto_1
    iput-boolean v4, p1, Ll4/f;->f:Z

    return-void
.end method

.method public final Q()V
    .locals 4

    :goto_0
    iget-wide v0, p0, Ll4/j;->o:J

    iget-wide v2, p0, Ll4/j;->b:J

    cmp-long v0, v0, v2

    if-lez v0, :cond_2

    iget-object v0, p0, Ll4/j;->f:Ljava/util/LinkedHashMap;

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll4/f;

    iget-boolean v2, v1, Ll4/f;->f:Z

    if-nez v2, :cond_0

    invoke-virtual {p0, v1}, Ll4/j;->P(Ll4/f;)V

    goto :goto_0

    :cond_1
    return-void

    :cond_2
    const/4 v0, 0x0

    iput-boolean v0, p0, Ll4/j;->u:Z

    return-void
.end method

.method public final b()V
    .locals 2

    iget-boolean v0, p0, Ll4/j;->t:Z

    xor-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "cache is closed"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final declared-synchronized c0()V
    .locals 12

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Ll4/j;->q:Lja/h;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lja/e0;->close()V

    goto :goto_0

    :catchall_0
    move-exception v0

    goto/16 :goto_7

    :cond_0
    :goto_0
    iget-object v0, p0, Ll4/j;->w:Ll4/h;

    iget-object v1, p0, Ll4/j;->d:Lja/x;

    invoke-virtual {v0, v1}, Ll4/h;->k(Lja/x;)Lja/e0;

    move-result-object v0

    invoke-static {v0}, Lr9/a;->b(Lja/e0;)Lja/z;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :try_start_1
    const-string v3, "libcore.io.DiskLruCache"

    invoke-virtual {v0, v3}, Lja/z;->V(Ljava/lang/String;)Lja/h;

    const/16 v3, 0xa

    invoke-virtual {v0, v3}, Lja/z;->C(I)Lja/h;

    const-string v4, "1"

    invoke-virtual {v0, v4}, Lja/z;->V(Ljava/lang/String;)Lja/h;

    invoke-virtual {v0, v3}, Lja/z;->C(I)Lja/h;

    const/4 v4, 0x1

    int-to-long v4, v4

    invoke-virtual {v0, v4, v5}, Lja/z;->W(J)Lja/h;

    invoke-virtual {v0, v3}, Lja/z;->C(I)Lja/h;

    const/4 v4, 0x2

    int-to-long v4, v4

    invoke-virtual {v0, v4, v5}, Lja/z;->W(J)Lja/h;

    invoke-virtual {v0, v3}, Lja/z;->C(I)Lja/h;

    invoke-virtual {v0, v3}, Lja/z;->C(I)Lja/h;

    iget-object v4, p0, Ll4/j;->f:Ljava/util/LinkedHashMap;

    invoke-virtual {v4}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll4/f;

    iget-object v6, v5, Ll4/f;->g:Ll4/e;

    const/16 v7, 0x20

    if-eqz v6, :cond_1

    const-string v6, "DIRTY"

    invoke-virtual {v0, v6}, Lja/z;->V(Ljava/lang/String;)Lja/h;

    invoke-virtual {v0, v7}, Lja/z;->C(I)Lja/h;

    iget-object v5, v5, Ll4/f;->a:Ljava/lang/String;

    invoke-virtual {v0, v5}, Lja/z;->V(Ljava/lang/String;)Lja/h;

    invoke-virtual {v0, v3}, Lja/z;->C(I)Lja/h;

    goto :goto_1

    :catchall_1
    move-exception v3

    goto :goto_3

    :cond_1
    const-string v6, "CLEAN"

    invoke-virtual {v0, v6}, Lja/z;->V(Ljava/lang/String;)Lja/h;

    invoke-virtual {v0, v7}, Lja/z;->C(I)Lja/h;

    iget-object v6, v5, Ll4/f;->a:Ljava/lang/String;

    invoke-virtual {v0, v6}, Lja/z;->V(Ljava/lang/String;)Lja/h;

    iget-object v5, v5, Ll4/f;->b:[J

    array-length v6, v5

    move v8, v1

    :goto_2
    if-ge v8, v6, :cond_2

    aget-wide v9, v5, v8

    invoke-virtual {v0, v7}, Lja/z;->C(I)Lja/h;

    invoke-virtual {v0, v9, v10}, Lja/z;->W(J)Lja/h;

    add-int/lit8 v8, v8, 0x1

    goto :goto_2

    :cond_2
    invoke-virtual {v0, v3}, Lja/z;->C(I)Lja/h;

    goto :goto_1

    :cond_3
    sget-object v3, Lq8/l;->a:Lq8/l;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    invoke-virtual {v0}, Lja/z;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    goto :goto_5

    :catchall_2
    move-exception v2

    goto :goto_5

    :goto_3
    :try_start_3
    invoke-virtual {v0}, Lja/z;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    goto :goto_4

    :catchall_3
    move-exception v0

    :try_start_4
    invoke-static {v3, v0}, Ld7/a;->c(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    :goto_4
    move-object v11, v3

    move-object v3, v2

    move-object v2, v11

    :goto_5
    if-nez v2, :cond_5

    invoke-static {v3}, Ld7/a;->j(Ljava/lang/Object;)V

    iget-object v0, p0, Ll4/j;->w:Ll4/h;

    iget-object v2, p0, Ll4/j;->c:Lja/x;

    invoke-virtual {v0, v2}, Lja/m;->f(Lja/x;)Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Ll4/j;->w:Ll4/h;

    iget-object v2, p0, Ll4/j;->c:Lja/x;

    iget-object v3, p0, Ll4/j;->e:Lja/x;

    invoke-virtual {v0, v2, v3}, Ll4/h;->b(Lja/x;Lja/x;)V

    iget-object v0, p0, Ll4/j;->w:Ll4/h;

    iget-object v2, p0, Ll4/j;->d:Lja/x;

    iget-object v3, p0, Ll4/j;->c:Lja/x;

    invoke-virtual {v0, v2, v3}, Ll4/h;->b(Lja/x;Lja/x;)V

    iget-object v0, p0, Ll4/j;->w:Ll4/h;

    iget-object v2, p0, Ll4/j;->e:Lja/x;

    invoke-virtual {v0, v2}, Lja/m;->e(Lja/x;)V

    goto :goto_6

    :cond_4
    iget-object v0, p0, Ll4/j;->w:Ll4/h;

    iget-object v2, p0, Ll4/j;->d:Lja/x;

    iget-object v3, p0, Ll4/j;->c:Lja/x;

    invoke-virtual {v0, v2, v3}, Ll4/h;->b(Lja/x;Lja/x;)V

    :goto_6
    invoke-virtual {p0}, Ll4/j;->q()Lja/z;

    move-result-object v0

    iput-object v0, p0, Ll4/j;->q:Lja/h;

    iput v1, p0, Ll4/j;->p:I

    iput-boolean v1, p0, Ll4/j;->r:Z

    iput-boolean v1, p0, Ll4/j;->v:Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    monitor-exit p0

    return-void

    :cond_5
    :try_start_5
    throw v2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    :goto_7
    monitor-exit p0

    throw v0
.end method

.method public final declared-synchronized close()V
    .locals 7

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Ll4/j;->s:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_3

    iget-boolean v0, p0, Ll4/j;->t:Z

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    iget-object v0, p0, Ll4/j;->f:Ljava/util/LinkedHashMap;

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object v0

    const/4 v2, 0x0

    new-array v3, v2, [Ll4/f;

    invoke-interface {v0, v3}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ll4/f;

    array-length v3, v0

    :goto_0
    if-ge v2, v3, :cond_2

    aget-object v4, v0, v2

    iget-object v4, v4, Ll4/f;->g:Ll4/e;

    if-eqz v4, :cond_1

    iget-object v5, v4, Ll4/e;->b:Ljava/lang/Object;

    move-object v6, v5

    check-cast v6, Ll4/f;

    iget-object v6, v6, Ll4/f;->g:Ll4/e;

    invoke-static {v6, v4}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    check-cast v5, Ll4/f;

    iput-boolean v1, v5, Ll4/f;->f:Z

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_2

    :cond_2
    invoke-virtual {p0}, Ll4/j;->Q()V

    iget-object v0, p0, Ll4/j;->n:Lr9/e;

    const/4 v2, 0x0

    invoke-static {v0, v2}, Ld7/a;->i(Lm9/d0;Ljava/util/concurrent/CancellationException;)V

    iget-object v0, p0, Ll4/j;->q:Lja/h;

    invoke-static {v0}, Ld7/a;->j(Ljava/lang/Object;)V

    invoke-interface {v0}, Lja/e0;->close()V

    iput-object v2, p0, Ll4/j;->q:Lja/h;

    iput-boolean v1, p0, Ll4/j;->t:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :cond_3
    :goto_1
    :try_start_1
    iput-boolean v1, p0, Ll4/j;->t:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-void

    :goto_2
    monitor-exit p0

    throw v0
.end method

.method public final declared-synchronized e(Ljava/lang/String;)Ll4/e;
    .locals 4

    monitor-enter p0

    :try_start_0
    invoke-virtual {p0}, Ll4/j;->b()V

    invoke-static {p1}, Ll4/j;->T(Ljava/lang/String;)V

    invoke-virtual {p0}, Ll4/j;->g()V

    iget-object v0, p0, Ll4/j;->f:Ljava/util/LinkedHashMap;

    invoke-virtual {v0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll4/f;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v2, v0, Ll4/f;->g:Ll4/e;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :cond_0
    move-object v2, v1

    :goto_0
    if-eqz v2, :cond_1

    monitor-exit p0

    return-object v1

    :cond_1
    if-eqz v0, :cond_2

    :try_start_1
    iget v2, v0, Ll4/f;->h:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v2, :cond_2

    monitor-exit p0

    return-object v1

    :cond_2
    :try_start_2
    iget-boolean v2, p0, Ll4/j;->u:Z

    if-nez v2, :cond_6

    iget-boolean v2, p0, Ll4/j;->v:Z

    if-eqz v2, :cond_3

    goto :goto_2

    :cond_3
    iget-object v2, p0, Ll4/j;->q:Lja/h;

    invoke-static {v2}, Ld7/a;->j(Ljava/lang/Object;)V

    const-string v3, "DIRTY"

    invoke-interface {v2, v3}, Lja/h;->V(Ljava/lang/String;)Lja/h;

    const/16 v3, 0x20

    invoke-interface {v2, v3}, Lja/h;->C(I)Lja/h;

    invoke-interface {v2, p1}, Lja/h;->V(Ljava/lang/String;)Lja/h;

    const/16 v3, 0xa

    invoke-interface {v2, v3}, Lja/h;->C(I)Lja/h;

    invoke-interface {v2}, Lja/h;->flush()V

    iget-boolean v2, p0, Ll4/j;->r:Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-eqz v2, :cond_4

    monitor-exit p0

    return-object v1

    :cond_4
    if-nez v0, :cond_5

    :try_start_3
    new-instance v0, Ll4/f;

    invoke-direct {v0, p0, p1}, Ll4/f;-><init>(Ll4/j;Ljava/lang/String;)V

    iget-object v1, p0, Ll4/j;->f:Ljava/util/LinkedHashMap;

    invoke-interface {v1, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_3

    :cond_5
    :goto_1
    new-instance p1, Ll4/e;

    invoke-direct {p1, p0, v0}, Ll4/e;-><init>(Ll4/j;Ll4/f;)V

    iput-object p1, v0, Ll4/f;->g:Ll4/e;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    monitor-exit p0

    return-object p1

    :cond_6
    :goto_2
    :try_start_4
    invoke-virtual {p0}, Ll4/j;->p()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    monitor-exit p0

    return-object v1

    :goto_3
    monitor-exit p0

    throw p1
.end method

.method public final declared-synchronized f(Ljava/lang/String;)Ll4/g;
    .locals 3

    monitor-enter p0

    :try_start_0
    invoke-virtual {p0}, Ll4/j;->b()V

    invoke-static {p1}, Ll4/j;->T(Ljava/lang/String;)V

    invoke-virtual {p0}, Ll4/j;->g()V

    iget-object v0, p0, Ll4/j;->f:Ljava/util/LinkedHashMap;

    invoke-virtual {v0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll4/f;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ll4/f;->a()Ll4/g;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    iget v1, p0, Ll4/j;->p:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Ll4/j;->p:I

    iget-object v1, p0, Ll4/j;->q:Lja/h;

    invoke-static {v1}, Ld7/a;->j(Ljava/lang/Object;)V

    const-string v2, "READ"

    invoke-interface {v1, v2}, Lja/h;->V(Ljava/lang/String;)Lja/h;

    const/16 v2, 0x20

    invoke-interface {v1, v2}, Lja/h;->C(I)Lja/h;

    invoke-interface {v1, p1}, Lja/h;->V(Ljava/lang/String;)Lja/h;

    const/16 p1, 0xa

    invoke-interface {v1, p1}, Lja/h;->C(I)Lja/h;

    iget p1, p0, Ll4/j;->p:I

    const/16 v1, 0x7d0

    if-lt p1, v1, :cond_1

    invoke-virtual {p0}, Ll4/j;->p()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_1
    :goto_0
    monitor-exit p0

    return-object v0

    :cond_2
    :goto_1
    monitor-exit p0

    const/4 p1, 0x0

    return-object p1

    :goto_2
    monitor-exit p0

    throw p1
.end method

.method public final declared-synchronized flush()V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Ll4/j;->s:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_0

    monitor-exit p0

    return-void

    :cond_0
    :try_start_1
    invoke-virtual {p0}, Ll4/j;->b()V

    invoke-virtual {p0}, Ll4/j;->Q()V

    iget-object v0, p0, Ll4/j;->q:Lja/h;

    invoke-static {v0}, Ld7/a;->j(Ljava/lang/Object;)V

    invoke-interface {v0}, Lja/h;->flush()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final declared-synchronized g()V
    .locals 4

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Ll4/j;->s:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    monitor-exit p0

    return-void

    :cond_0
    :try_start_1
    iget-object v0, p0, Ll4/j;->w:Ll4/h;

    iget-object v1, p0, Ll4/j;->d:Lja/x;

    invoke-virtual {v0, v1}, Lja/m;->e(Lja/x;)V

    iget-object v0, p0, Ll4/j;->w:Ll4/h;

    iget-object v1, p0, Ll4/j;->e:Lja/x;

    invoke-virtual {v0, v1}, Lja/m;->f(Lja/x;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Ll4/j;->w:Ll4/h;

    iget-object v1, p0, Ll4/j;->c:Lja/x;

    invoke-virtual {v0, v1}, Lja/m;->f(Lja/x;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Ll4/j;->w:Ll4/h;

    iget-object v1, p0, Ll4/j;->e:Lja/x;

    invoke-virtual {v0, v1}, Lja/m;->e(Lja/x;)V

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_2

    :cond_1
    iget-object v0, p0, Ll4/j;->w:Ll4/h;

    iget-object v1, p0, Ll4/j;->e:Lja/x;

    iget-object v2, p0, Ll4/j;->c:Lja/x;

    invoke-virtual {v0, v1, v2}, Ll4/h;->b(Lja/x;Lja/x;)V

    :cond_2
    :goto_0
    iget-object v0, p0, Ll4/j;->w:Ll4/h;

    iget-object v1, p0, Ll4/j;->c:Lja/x;

    invoke-virtual {v0, v1}, Lja/m;->f(Lja/x;)Z

    move-result v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const/4 v1, 0x1

    if-eqz v0, :cond_3

    :try_start_2
    invoke-virtual {p0}, Ll4/j;->M()V

    invoke-virtual {p0}, Ll4/j;->u()V

    iput-boolean v1, p0, Ll4/j;->s:Z
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit p0

    return-void

    :catch_0
    const/4 v0, 0x0

    :try_start_3
    invoke-virtual {p0}, Ll4/j;->close()V

    iget-object v2, p0, Ll4/j;->w:Ll4/h;

    iget-object v3, p0, Ll4/j;->a:Lja/x;

    invoke-static {v2, v3}, Ly3/e;->a0(Ll4/h;Lja/x;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :try_start_4
    iput-boolean v0, p0, Ll4/j;->t:Z

    goto :goto_1

    :catchall_1
    move-exception v1

    iput-boolean v0, p0, Ll4/j;->t:Z

    throw v1

    :cond_3
    :goto_1
    invoke-virtual {p0}, Ll4/j;->c0()V

    iput-boolean v1, p0, Ll4/j;->s:Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    monitor-exit p0

    return-void

    :goto_2
    monitor-exit p0

    throw v0
.end method

.method public final p()V
    .locals 5

    new-instance v0, Ll4/i;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Ll4/i;-><init>(Ll4/j;Lu8/e;)V

    const/4 v2, 0x3

    const/4 v3, 0x0

    iget-object v4, p0, Ll4/j;->n:Lr9/e;

    invoke-static {v4, v1, v3, v0, v2}, Lz6/a;->Q(Lm9/d0;Ln9/d;ILc9/e;I)Lm9/x1;

    return-void
.end method

.method public final q()Lja/z;
    .locals 4

    iget-object v0, p0, Ll4/j;->w:Ll4/h;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v1, p0, Ll4/j;->c:Lja/x;

    const-string v2, "file"

    invoke-static {v1, v2}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, v0, Ll4/h;->b:Lja/m;

    invoke-virtual {v0, v1}, Lja/m;->a(Lja/x;)Lja/e0;

    move-result-object v0

    new-instance v1, Ll4/k;

    new-instance v2, Lh1/b;

    const/16 v3, 0xc

    invoke-direct {v2, p0, v3}, Lh1/b;-><init>(Ljava/lang/Object;I)V

    invoke-direct {v1, v0, v2}, Ll4/k;-><init>(Lja/e0;Lh1/b;)V

    invoke-static {v1}, Lr9/a;->b(Lja/e0;)Lja/z;

    move-result-object v0

    return-object v0
.end method

.method public final u()V
    .locals 9

    iget-object v0, p0, Ll4/j;->f:Ljava/util/LinkedHashMap;

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const-wide/16 v1, 0x0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll4/f;

    iget-object v4, v3, Ll4/f;->g:Ll4/e;

    const/4 v5, 0x2

    const/4 v6, 0x0

    if-nez v4, :cond_1

    :goto_1
    if-ge v6, v5, :cond_0

    iget-object v4, v3, Ll4/f;->b:[J

    aget-wide v7, v4, v6

    add-long/2addr v1, v7

    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    :cond_1
    const/4 v4, 0x0

    iput-object v4, v3, Ll4/f;->g:Ll4/e;

    :goto_2
    if-ge v6, v5, :cond_2

    iget-object v4, v3, Ll4/f;->c:Ljava/util/ArrayList;

    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lja/x;

    iget-object v7, p0, Ll4/j;->w:Ll4/h;

    invoke-virtual {v7, v4}, Lja/m;->e(Lja/x;)V

    iget-object v4, v3, Ll4/f;->d:Ljava/util/ArrayList;

    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lja/x;

    invoke-virtual {v7, v4}, Lja/m;->e(Lja/x;)V

    add-int/lit8 v6, v6, 0x1

    goto :goto_2

    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    :cond_3
    iput-wide v1, p0, Ll4/j;->o:J

    return-void
.end method
