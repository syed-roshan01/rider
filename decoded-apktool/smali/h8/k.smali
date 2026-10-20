.class public final Lh8/k;
.super Lg8/v1;

# interfaces
.implements Lh8/u;


# instance fields
.field public A:Z

.field public B:Z

.field public C:Z

.field public D:I

.field public E:I

.field public final F:Lh8/e;

.field public final G:Ly5/o;

.field public final H:Lh8/n;

.field public I:Z

.field public final J:Lo8/c;

.field public K:Li3/v;

.field public L:I

.field public final synthetic M:Lh8/l;

.field public final w:I

.field public final x:Ljava/lang/Object;

.field public y:Ljava/util/ArrayList;

.field public final z:Lja/g;


# direct methods
.method public constructor <init>(Lh8/l;ILg8/y5;Ljava/lang/Object;Lh8/e;Ly5/o;Lh8/n;I)V
    .locals 0

    iput-object p1, p0, Lh8/k;->M:Lh8/l;

    iget-object p1, p1, Lg8/b;->c:Lg8/e6;

    invoke-direct {p0, p2, p3, p1}, Lg8/a;-><init>(ILg8/y5;Lg8/e6;)V

    sget-object p1, Lq6/d;->b:Ljava/nio/charset/Charset;

    iput-object p1, p0, Lg8/v1;->t:Ljava/nio/charset/Charset;

    new-instance p1, Lja/g;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh8/k;->z:Lja/g;

    const/4 p1, 0x0

    iput-boolean p1, p0, Lh8/k;->A:Z

    iput-boolean p1, p0, Lh8/k;->B:Z

    iput-boolean p1, p0, Lh8/k;->C:Z

    const/4 p1, 0x1

    iput-boolean p1, p0, Lh8/k;->I:Z

    const/4 p1, -0x1

    iput p1, p0, Lh8/k;->L:I

    const-string p1, "lock"

    invoke-static {p4, p1}, Ly3/e;->J(Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object p4, p0, Lh8/k;->x:Ljava/lang/Object;

    iput-object p5, p0, Lh8/k;->F:Lh8/e;

    iput-object p6, p0, Lh8/k;->G:Ly5/o;

    iput-object p7, p0, Lh8/k;->H:Lh8/n;

    iput p8, p0, Lh8/k;->D:I

    iput p8, p0, Lh8/k;->E:I

    iput p8, p0, Lh8/k;->w:I

    sget-object p1, Lo8/b;->a:Lo8/a;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object p1, Lo8/a;->a:Lo8/c;

    iput-object p1, p0, Lh8/k;->J:Lo8/c;

    return-void
.end method

.method public static l(Lh8/k;Le8/l1;Ljava/lang/String;)V
    .locals 13

    iget-object v0, p0, Lh8/k;->M:Lh8/l;

    iget-object v1, v0, Lh8/l;->m:Ljava/lang/String;

    iget-boolean v2, v0, Lh8/l;->q:Z

    iget-object v3, p0, Lh8/k;->H:Lh8/n;

    iget-object v4, v3, Lh8/n;->B:Ljavax/net/ssl/SSLSocketFactory;

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-nez v4, :cond_0

    move v4, v5

    goto :goto_0

    :cond_0
    move v4, v6

    :goto_0
    sget-object v7, Lh8/f;->a:Lj8/c;

    const-string v7, "headers"

    invoke-static {p1, v7}, Ly3/e;->J(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v7, "defaultPath"

    invoke-static {p2, v7}, Ly3/e;->J(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v7, "authority"

    invoke-static {v1, v7}, Ly3/e;->J(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v7, Lg8/s1;->i:Le8/g1;

    invoke-virtual {p1, v7}, Le8/l1;->a(Le8/i1;)V

    sget-object v7, Lg8/s1;->j:Le8/g1;

    invoke-virtual {p1, v7}, Le8/l1;->a(Le8/i1;)V

    sget-object v7, Lg8/s1;->k:Le8/g1;

    invoke-virtual {p1, v7}, Le8/l1;->a(Le8/i1;)V

    new-instance v8, Ljava/util/ArrayList;

    iget v9, p1, Le8/l1;->b:I

    add-int/lit8 v9, v9, 0x7

    invoke-direct {v8, v9}, Ljava/util/ArrayList;-><init>(I)V

    if-eqz v4, :cond_1

    sget-object v4, Lh8/f;->b:Lj8/c;

    invoke-virtual {v8, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    sget-object v4, Lh8/f;->a:Lj8/c;

    invoke-virtual {v8, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_1
    if-eqz v2, :cond_2

    sget-object v2, Lh8/f;->d:Lj8/c;

    invoke-virtual {v8, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_2
    sget-object v2, Lh8/f;->c:Lj8/c;

    invoke-virtual {v8, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_2
    new-instance v2, Lj8/c;

    sget-object v4, Lj8/c;->h:Lja/j;

    invoke-direct {v2, v4, v1}, Lj8/c;-><init>(Lja/j;Ljava/lang/String;)V

    invoke-virtual {v8, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v1, Lj8/c;

    sget-object v2, Lj8/c;->f:Lja/j;

    invoke-direct {v1, v2, p2}, Lj8/c;-><init>(Lja/j;Ljava/lang/String;)V

    invoke-virtual {v8, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance p2, Lj8/c;

    iget-object v1, v7, Le8/i1;->a:Ljava/lang/String;

    iget-object v2, v0, Lh8/l;->k:Ljava/lang/String;

    invoke-direct {p2, v1, v2}, Lj8/c;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v8, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object p2, Lh8/f;->e:Lj8/c;

    invoke-virtual {v8, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object p2, Lh8/f;->f:Lj8/c;

    invoke-virtual {v8, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object p2, Lg8/d6;->a:Ljava/util/logging/Logger;

    sget-object p2, Le8/r0;->a:Ljava/nio/charset/Charset;

    iget p2, p1, Le8/l1;->b:I

    mul-int/lit8 p2, p2, 0x2

    new-array v1, p2, [[B

    iget-object v2, p1, Le8/l1;->a:[Ljava/lang/Object;

    instance-of v4, v2, [[B

    if-eqz v4, :cond_3

    invoke-static {v2, v6, v1, v6, p2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    goto :goto_4

    :cond_3
    move v2, v6

    :goto_3
    iget v4, p1, Le8/l1;->b:I

    if-ge v2, v4, :cond_5

    mul-int/lit8 v4, v2, 0x2

    invoke-virtual {p1, v2}, Le8/l1;->e(I)[B

    move-result-object v7

    aput-object v7, v1, v4

    add-int/2addr v4, v5

    iget-object v7, p1, Le8/l1;->a:[Ljava/lang/Object;

    aget-object v7, v7, v4

    instance-of v9, v7, [B

    if-eqz v9, :cond_4

    check-cast v7, [B

    aput-object v7, v1, v4

    add-int/lit8 v2, v2, 0x1

    goto :goto_3

    :cond_4
    invoke-static {v7}, La7/a;->w(Ljava/lang/Object;)V

    const/4 p0, 0x0

    throw p0

    :cond_5
    :goto_4
    move p1, v6

    move v2, p1

    :goto_5
    if-ge p1, p2, :cond_a

    aget-object v4, v1, p1

    add-int/lit8 v7, p1, 0x1

    aget-object v7, v1, v7

    sget-object v9, Lg8/d6;->b:[B

    invoke-static {v4, v9}, Lg8/d6;->a([B[B)Z

    move-result v9

    if-eqz v9, :cond_6

    aput-object v4, v1, v2

    add-int/lit8 v4, v2, 0x1

    sget-object v9, Le8/r0;->b:Ls6/c;

    invoke-virtual {v9, v7}, Ls6/e;->c([B)Ljava/lang/String;

    move-result-object v7

    sget-object v9, Lq6/d;->a:Ljava/nio/charset/Charset;

    invoke-virtual {v7, v9}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v7

    aput-object v7, v1, v4

    :goto_6
    add-int/lit8 v2, v2, 0x2

    goto :goto_9

    :cond_6
    array-length v9, v7

    move v10, v6

    :goto_7
    if-ge v10, v9, :cond_9

    aget-byte v11, v7, v10

    const/16 v12, 0x20

    if-lt v11, v12, :cond_8

    const/16 v12, 0x7e

    if-le v11, v12, :cond_7

    goto :goto_8

    :cond_7
    add-int/lit8 v10, v10, 0x1

    goto :goto_7

    :cond_8
    :goto_8
    new-instance v9, Ljava/lang/String;

    sget-object v10, Lq6/d;->a:Ljava/nio/charset/Charset;

    invoke-direct {v9, v4, v10}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    const-string v4, "Metadata key="

    const-string v10, ", value="

    invoke-static {v4, v9, v10}, La7/a;->r(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-static {v7}, Ljava/util/Arrays;->toString([B)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v7, " contains invalid ASCII characters"

    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    sget-object v7, Lg8/d6;->a:Ljava/util/logging/Logger;

    invoke-virtual {v7, v4}, Ljava/util/logging/Logger;->warning(Ljava/lang/String;)V

    goto :goto_9

    :cond_9
    aput-object v4, v1, v2

    add-int/lit8 v4, v2, 0x1

    aput-object v7, v1, v4

    goto :goto_6

    :goto_9
    add-int/lit8 p1, p1, 0x2

    goto :goto_5

    :cond_a
    if-ne v2, p2, :cond_b

    goto :goto_a

    :cond_b
    invoke-static {v1, v6, v2}, Ljava/util/Arrays;->copyOfRange([Ljava/lang/Object;II)[Ljava/lang/Object;

    move-result-object p1

    move-object v1, p1

    check-cast v1, [[B

    :goto_a
    move p1, v6

    :goto_b
    array-length p2, v1

    if-ge p1, p2, :cond_e

    aget-object p2, v1, p1

    invoke-static {p2}, Lja/j;->l([B)Lja/j;

    move-result-object p2

    iget-object v2, p2, Lja/j;->a:[B

    array-length v4, v2

    if-eqz v4, :cond_d

    aget-byte v2, v2, v6

    const/16 v4, 0x3a

    if-ne v2, v4, :cond_c

    goto :goto_c

    :cond_c
    add-int/lit8 v2, p1, 0x1

    aget-object v2, v1, v2

    invoke-static {v2}, Lja/j;->l([B)Lja/j;

    move-result-object v2

    new-instance v4, Lj8/c;

    invoke-direct {v4, p2, v2}, Lj8/c;-><init>(Lja/j;Lja/j;)V

    invoke-virtual {v8, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_d
    :goto_c
    add-int/lit8 p1, p1, 0x2

    goto :goto_b

    :cond_e
    iput-object v8, p0, Lh8/k;->y:Ljava/util/ArrayList;

    iget-object p0, v3, Lh8/n;->v:Le8/c2;

    if-eqz p0, :cond_f

    sget-object p1, Lg8/i0;->d:Lg8/i0;

    new-instance p2, Le8/l1;

    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    iget-object v0, v0, Lh8/l;->n:Lh8/k;

    invoke-virtual {v0, p0, p1, v5, p2}, Lg8/a;->i(Le8/c2;Lg8/i0;ZLe8/l1;)V

    goto :goto_d

    :cond_f
    iget-object p0, v3, Lh8/n;->n:Ljava/util/HashMap;

    invoke-virtual {p0}, Ljava/util/HashMap;->size()I

    move-result p0

    iget p1, v3, Lh8/n;->D:I

    if-lt p0, p1, :cond_11

    iget-object p0, v3, Lh8/n;->E:Ljava/util/LinkedList;

    invoke-virtual {p0, v0}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    iget-boolean p0, v3, Lh8/n;->z:Z

    if-nez p0, :cond_10

    iput-boolean v5, v3, Lh8/n;->z:Z

    iget-object p0, v3, Lh8/n;->G:Lg8/q2;

    if-eqz p0, :cond_10

    invoke-virtual {p0}, Lg8/q2;->b()V

    :cond_10
    iget-boolean p0, v0, Lg8/b;->e:Z

    if-eqz p0, :cond_12

    iget-object p0, v3, Lh8/n;->P:Lg8/z1;

    invoke-virtual {p0, v0, v5}, Lf4/y;->f(Ljava/lang/Object;Z)V

    goto :goto_d

    :cond_11
    invoke-virtual {v3, v0}, Lh8/n;->u(Lh8/l;)V

    :cond_12
    :goto_d
    return-void
.end method

.method public static m(Lh8/k;Lja/g;ZZ)V
    .locals 4

    iget-boolean v0, p0, Lh8/k;->C:Z

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    iget-boolean v0, p0, Lh8/k;->I:Z

    if-eqz v0, :cond_1

    iget-wide v0, p1, Lja/g;->b:J

    long-to-int v0, v0

    iget-object v1, p0, Lh8/k;->z:Lja/g;

    int-to-long v2, v0

    invoke-virtual {v1, p1, v2, v3}, Lja/g;->b0(Lja/g;J)V

    iget-boolean p1, p0, Lh8/k;->A:Z

    or-int/2addr p1, p2

    iput-boolean p1, p0, Lh8/k;->A:Z

    iget-boolean p1, p0, Lh8/k;->B:Z

    or-int/2addr p1, p3

    iput-boolean p1, p0, Lh8/k;->B:Z

    goto :goto_1

    :cond_1
    iget v0, p0, Lh8/k;->L:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_2

    const/4 v0, 0x1

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_0
    const-string v1, "streamId should be set"

    invoke-static {v1, v0}, Ly3/e;->N(Ljava/lang/String;Z)V

    iget-object v0, p0, Lh8/k;->G:Ly5/o;

    iget-object p0, p0, Lh8/k;->K:Li3/v;

    invoke-virtual {v0, p2, p0, p1, p3}, Ly5/o;->a(ZLi3/v;Lja/g;Z)V

    :goto_1
    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Throwable;)V
    .locals 2

    invoke-static {p1}, Le8/c2;->d(Ljava/lang/Throwable;)Le8/c2;

    move-result-object p1

    new-instance v0, Le8/l1;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    const/4 v1, 0x1

    invoke-virtual {p0, v0, p1, v1}, Lh8/k;->n(Le8/l1;Le8/c2;Z)V

    return-void
.end method

.method public final c(Z)V
    .locals 8

    iget-boolean v0, p0, Lg8/a;->o:Z

    sget-object v4, Lg8/i0;->a:Lg8/i0;

    if-nez v0, :cond_0

    iget-object v1, p0, Lh8/k;->H:Lh8/n;

    iget v2, p0, Lh8/k;->L:I

    const/4 v3, 0x0

    const/4 v5, 0x0

    sget-object v6, Lj8/a;->p:Lj8/a;

    const/4 v7, 0x0

    invoke-virtual/range {v1 .. v7}, Lh8/n;->j(ILe8/c2;Lg8/i0;ZLj8/a;Le8/l1;)V

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lh8/k;->H:Lh8/n;

    iget v2, p0, Lh8/k;->L:I

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-virtual/range {v1 .. v7}, Lh8/n;->j(ILe8/c2;Lg8/i0;ZLj8/a;Le8/l1;)V

    :goto_0
    iget-boolean v0, p0, Lg8/a;->p:Z

    const-string v1, "status should have been reported on deframer closed"

    invoke-static {v1, v0}, Ly3/e;->N(Ljava/lang/String;Z)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lg8/a;->m:Z

    iget-boolean v1, p0, Lg8/a;->q:Z

    if-eqz v1, :cond_1

    if-eqz p1, :cond_1

    sget-object p1, Le8/c2;->l:Le8/c2;

    const-string v1, "Encountered end-of-stream mid-frame"

    invoke-virtual {p1, v1}, Le8/c2;->g(Ljava/lang/String;)Le8/c2;

    move-result-object p1

    new-instance v1, Le8/l1;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p0, v1, p1, v0}, Lg8/a;->h(Le8/l1;Le8/c2;Z)V

    :cond_1
    iget-object p1, p0, Lg8/a;->n:Lk/e;

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lk/e;->run()V

    const/4 p1, 0x0

    iput-object p1, p0, Lg8/a;->n:Lk/e;

    :cond_2
    return-void
.end method

.method public final d(I)V
    .locals 4

    iget v0, p0, Lh8/k;->E:I

    sub-int/2addr v0, p1

    iput v0, p0, Lh8/k;->E:I

    int-to-float p1, v0

    iget v1, p0, Lh8/k;->w:I

    int-to-float v2, v1

    const/high16 v3, 0x3f000000    # 0.5f

    mul-float/2addr v2, v3

    cmpg-float p1, p1, v2

    if-gtz p1, :cond_0

    sub-int/2addr v1, v0

    iget p1, p0, Lh8/k;->D:I

    add-int/2addr p1, v1

    iput p1, p0, Lh8/k;->D:I

    add-int/2addr v0, v1

    iput v0, p0, Lh8/k;->E:I

    iget p1, p0, Lh8/k;->L:I

    int-to-long v0, v1

    iget-object v2, p0, Lh8/k;->F:Lh8/e;

    invoke-virtual {v2, p1, v0, v1}, Lh8/e;->N(IJ)V

    :cond_0
    return-void
.end method

.method public final n(Le8/l1;Le8/c2;Z)V
    .locals 8

    iget-boolean v0, p0, Lh8/k;->C:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lh8/k;->C:Z

    iget-boolean v1, p0, Lh8/k;->I:Z

    if-eqz v1, :cond_2

    iget-object p3, p0, Lh8/k;->H:Lh8/n;

    iget-object v1, p3, Lh8/n;->E:Ljava/util/LinkedList;

    iget-object v2, p0, Lh8/k;->M:Lh8/l;

    invoke-virtual {v1, v2}, Ljava/util/LinkedList;->remove(Ljava/lang/Object;)Z

    invoke-virtual {p3, v2}, Lh8/n;->o(Lh8/l;)V

    const/4 p3, 0x0

    iput-object p3, p0, Lh8/k;->y:Ljava/util/ArrayList;

    iget-object p3, p0, Lh8/k;->z:Lja/g;

    invoke-virtual {p3}, Lja/g;->a()V

    const/4 p3, 0x0

    iput-boolean p3, p0, Lh8/k;->I:Z

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    new-instance p1, Le8/l1;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    :goto_0
    invoke-virtual {p0, p1, p2, v0}, Lg8/a;->h(Le8/l1;Le8/c2;Z)V

    goto :goto_1

    :cond_2
    iget-object v1, p0, Lh8/k;->H:Lh8/n;

    iget v2, p0, Lh8/k;->L:I

    sget-object v4, Lg8/i0;->a:Lg8/i0;

    sget-object v6, Lj8/a;->p:Lj8/a;

    move-object v3, p2

    move v5, p3

    move-object v7, p1

    invoke-virtual/range {v1 .. v7}, Lh8/n;->j(ILe8/c2;Lg8/i0;ZLj8/a;Le8/l1;)V

    :goto_1
    return-void
.end method

.method public final o(Ljava/lang/Runnable;)V
    .locals 1

    iget-object v0, p0, Lh8/k;->x:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final p(Lja/g;Z)V
    .locals 8

    iget-wide v0, p1, Lja/g;->b:J

    long-to-int v2, v0

    iget v3, p0, Lh8/k;->D:I

    sub-int/2addr v3, v2

    iput v3, p0, Lh8/k;->D:I

    if-gez v3, :cond_0

    iget p1, p0, Lh8/k;->L:I

    sget-object p2, Lj8/a;->e:Lj8/a;

    iget-object v0, p0, Lh8/k;->F:Lh8/e;

    invoke-virtual {v0, p1, p2}, Lh8/e;->o(ILj8/a;)V

    iget-object v1, p0, Lh8/k;->H:Lh8/n;

    iget v2, p0, Lh8/k;->L:I

    sget-object p1, Le8/c2;->l:Le8/c2;

    const-string p2, "Received data size exceeded our receiving window size"

    invoke-virtual {p1, p2}, Le8/c2;->g(Ljava/lang/String;)Le8/c2;

    move-result-object v3

    sget-object v4, Lg8/i0;->a:Lg8/i0;

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-virtual/range {v1 .. v7}, Lh8/n;->j(ILe8/c2;Lg8/i0;ZLj8/a;Le8/l1;)V

    return-void

    :cond_0
    new-instance v2, Lh8/r;

    invoke-direct {v2, p1}, Lh8/r;-><init>(Lja/g;)V

    iget-object v3, p0, Lg8/v1;->r:Le8/c2;

    const/4 v4, 0x0

    if-eqz v3, :cond_2

    iget-object v0, p0, Lg8/v1;->t:Ljava/nio/charset/Charset;

    sget-object v1, Lg8/p4;->a:Lg8/o4;

    const-string v1, "charset"

    invoke-static {v0, v1}, Ly3/e;->J(Ljava/lang/Object;Ljava/lang/Object;)V

    iget-wide v5, p1, Lja/g;->b:J

    long-to-int p1, v5

    new-array v1, p1, [B

    invoke-virtual {v2, v1, v4, p1}, Lh8/r;->Z([BII)V

    new-instance p1, Ljava/lang/String;

    invoke-direct {p1, v1, v0}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    const-string v0, "DATA-----------------------------\n"

    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v3, p1}, Le8/c2;->a(Ljava/lang/String;)Le8/c2;

    move-result-object p1

    iput-object p1, p0, Lg8/v1;->r:Le8/c2;

    invoke-virtual {v2}, Lh8/r;->close()V

    iget-object p1, p0, Lg8/v1;->r:Le8/c2;

    iget-object p1, p1, Le8/c2;->b:Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    const/16 v0, 0x3e8

    if-gt p1, v0, :cond_1

    if-eqz p2, :cond_6

    :cond_1
    iget-object p1, p0, Lg8/v1;->r:Le8/c2;

    iget-object p2, p0, Lg8/v1;->s:Le8/l1;

    invoke-virtual {p0, p2, p1, v4}, Lh8/k;->n(Le8/l1;Le8/c2;Z)V

    goto :goto_2

    :cond_2
    iget-boolean p1, p0, Lg8/v1;->u:Z

    if-nez p1, :cond_3

    sget-object p1, Le8/c2;->l:Le8/c2;

    const-string p2, "headers not received before payload"

    invoke-virtual {p1, p2}, Le8/c2;->g(Ljava/lang/String;)Le8/c2;

    move-result-object p1

    new-instance p2, Le8/l1;

    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p0, p2, p1, v4}, Lh8/k;->n(Le8/l1;Le8/c2;Z)V

    goto :goto_2

    :cond_3
    long-to-int p1, v0

    const/4 v0, 0x1

    :try_start_0
    iget-boolean v1, p0, Lg8/a;->p:Z

    if-eqz v1, :cond_4

    sget-object v1, Lg8/b;->i:Ljava/util/logging/Logger;

    sget-object v3, Ljava/util/logging/Level;->INFO:Ljava/util/logging/Level;

    const-string v5, "Received data on closed stream"

    invoke-virtual {v1, v3, v5}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v2}, Lh8/r;->close()V

    goto :goto_0

    :catchall_0
    move-exception p1

    move v4, v0

    goto :goto_3

    :cond_4
    :try_start_1
    iget-object v0, p0, Lg8/f;->a:Lg8/r0;

    invoke-interface {v0, v2}, Lg8/r0;->e(Lg8/m4;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v0

    :try_start_2
    invoke-virtual {p0, v0}, Lh8/k;->b(Ljava/lang/Throwable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    :goto_0
    if-eqz p2, :cond_6

    if-lez p1, :cond_5

    sget-object p1, Le8/c2;->l:Le8/c2;

    const-string p2, "Received unexpected EOS on non-empty DATA frame from server"

    invoke-virtual {p1, p2}, Le8/c2;->g(Ljava/lang/String;)Le8/c2;

    move-result-object p1

    iput-object p1, p0, Lg8/v1;->r:Le8/c2;

    goto :goto_1

    :cond_5
    sget-object p1, Le8/c2;->l:Le8/c2;

    const-string p2, "Received unexpected EOS on empty DATA frame from server"

    invoke-virtual {p1, p2}, Le8/c2;->g(Ljava/lang/String;)Le8/c2;

    move-result-object p1

    iput-object p1, p0, Lg8/v1;->r:Le8/c2;

    :goto_1
    new-instance p1, Le8/l1;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg8/v1;->s:Le8/l1;

    iget-object p2, p0, Lg8/v1;->r:Le8/c2;

    invoke-virtual {p0, p1, p2, v4}, Lg8/a;->h(Le8/l1;Le8/c2;Z)V

    :cond_6
    :goto_2
    return-void

    :catchall_2
    move-exception p1

    :goto_3
    if-eqz v4, :cond_7

    invoke-virtual {v2}, Lh8/r;->close()V

    :cond_7
    throw p1
.end method

.method public final q(Ljava/util/List;Z)V
    .locals 5

    sget-object v0, Lg8/v1;->v:Le8/j1;

    if-eqz p2, :cond_7

    invoke-static {p1}, Lh8/w;->a(Ljava/util/List;)[[B

    move-result-object p1

    new-instance p2, Le8/l1;

    array-length v1, p1

    div-int/lit8 v1, v1, 0x2

    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    iput v1, p2, Le8/l1;->b:I

    iput-object p1, p2, Le8/l1;->a:[Ljava/lang/Object;

    iget-object p1, p0, Lg8/v1;->r:Le8/c2;

    if-nez p1, :cond_0

    iget-boolean p1, p0, Lg8/v1;->u:Z

    if-nez p1, :cond_0

    invoke-static {p2}, Lg8/v1;->k(Le8/l1;)Le8/c2;

    move-result-object p1

    iput-object p1, p0, Lg8/v1;->r:Le8/c2;

    if-eqz p1, :cond_0

    iput-object p2, p0, Lg8/v1;->s:Le8/l1;

    :cond_0
    iget-object p1, p0, Lg8/v1;->r:Le8/c2;

    const/4 v1, 0x0

    if-eqz p1, :cond_1

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "trailers: "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Le8/c2;->a(Ljava/lang/String;)Le8/c2;

    move-result-object p1

    iput-object p1, p0, Lg8/v1;->r:Le8/c2;

    iget-object p2, p0, Lg8/v1;->s:Le8/l1;

    invoke-virtual {p0, p2, p1, v1}, Lh8/k;->n(Le8/l1;Le8/c2;Z)V

    goto/16 :goto_4

    :cond_1
    sget-object p1, Le8/s0;->b:Le8/j1;

    invoke-virtual {p2, p1}, Le8/l1;->c(Le8/i1;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Le8/c2;

    if-eqz v2, :cond_2

    sget-object v3, Le8/s0;->a:Le8/j1;

    invoke-virtual {p2, v3}, Le8/l1;->c(Le8/i1;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v2, v3}, Le8/c2;->g(Ljava/lang/String;)Le8/c2;

    move-result-object v2

    goto :goto_1

    :cond_2
    iget-boolean v2, p0, Lg8/v1;->u:Z

    if-eqz v2, :cond_3

    sget-object v2, Le8/c2;->g:Le8/c2;

    const-string v3, "missing GRPC status in response"

    invoke-virtual {v2, v3}, Le8/c2;->g(Ljava/lang/String;)Le8/c2;

    move-result-object v2

    goto :goto_1

    :cond_3
    invoke-virtual {p2, v0}, Le8/l1;->c(Le8/i1;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    if-eqz v2, :cond_4

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-static {v2}, Lg8/s1;->g(I)Le8/c2;

    move-result-object v2

    goto :goto_0

    :cond_4
    sget-object v2, Le8/c2;->l:Le8/c2;

    const-string v3, "missing HTTP status code"

    invoke-virtual {v2, v3}, Le8/c2;->g(Ljava/lang/String;)Le8/c2;

    move-result-object v2

    :goto_0
    const-string v3, "missing GRPC status, inferred error from HTTP status code"

    invoke-virtual {v2, v3}, Le8/c2;->a(Ljava/lang/String;)Le8/c2;

    move-result-object v2

    :goto_1
    invoke-virtual {p2, v0}, Le8/l1;->a(Le8/i1;)V

    invoke-virtual {p2, p1}, Le8/l1;->a(Le8/i1;)V

    sget-object p1, Le8/s0;->a:Le8/j1;

    invoke-virtual {p2, p1}, Le8/l1;->a(Le8/i1;)V

    iget-boolean p1, p0, Lg8/a;->p:Z

    if-eqz p1, :cond_5

    sget-object p1, Lg8/b;->i:Ljava/util/logging/Logger;

    sget-object v0, Ljava/util/logging/Level;->INFO:Ljava/util/logging/Level;

    const-string v1, "Received trailers on closed stream:\n {1}\n {2}"

    filled-new-array {v2, p2}, [Ljava/lang/Object;

    move-result-object p2

    invoke-virtual {p1, v0, v1, p2}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_5
    iget-object p1, p0, Lg8/a;->h:Lg8/y5;

    iget-object p1, p1, Lg8/y5;->a:[Lo7/d0;

    array-length v0, p1

    move v3, v1

    :goto_2
    if-ge v3, v0, :cond_6

    aget-object v4, p1, v3

    check-cast v4, Le8/p;

    invoke-virtual {v4, p2}, Le8/p;->q0(Le8/l1;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    :cond_6
    invoke-virtual {p0, p2, v2, v1}, Lg8/a;->h(Le8/l1;Le8/c2;Z)V

    goto/16 :goto_4

    :cond_7
    invoke-static {p1}, Lh8/w;->a(Ljava/util/List;)[[B

    move-result-object p1

    new-instance p2, Le8/l1;

    array-length v1, p1

    div-int/lit8 v1, v1, 0x2

    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    iput v1, p2, Le8/l1;->b:I

    iput-object p1, p2, Le8/l1;->a:[Ljava/lang/Object;

    iget-object p1, p0, Lg8/v1;->r:Le8/c2;

    const-string v1, "headers: "

    if-eqz p1, :cond_8

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Le8/c2;->a(Ljava/lang/String;)Le8/c2;

    move-result-object p1

    iput-object p1, p0, Lg8/v1;->r:Le8/c2;

    goto/16 :goto_4

    :cond_8
    :try_start_0
    iget-boolean p1, p0, Lg8/v1;->u:Z

    if-eqz p1, :cond_9

    sget-object p1, Le8/c2;->l:Le8/c2;

    const-string v0, "Received headers twice"

    invoke-virtual {p1, v0}, Le8/c2;->g(Ljava/lang/String;)Le8/c2;

    move-result-object p1

    iput-object p1, p0, Lg8/v1;->r:Le8/c2;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    :goto_3
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Le8/c2;->a(Ljava/lang/String;)Le8/c2;

    move-result-object p1

    iput-object p1, p0, Lg8/v1;->r:Le8/c2;

    iput-object p2, p0, Lg8/v1;->s:Le8/l1;

    invoke-static {p2}, Lg8/v1;->j(Le8/l1;)Ljava/nio/charset/Charset;

    move-result-object p1

    iput-object p1, p0, Lg8/v1;->t:Ljava/nio/charset/Charset;

    goto :goto_4

    :catchall_0
    move-exception p1

    goto :goto_5

    :cond_9
    :try_start_1
    invoke-virtual {p2, v0}, Le8/l1;->c(Le8/i1;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    if-eqz p1, :cond_a

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v2

    const/16 v3, 0x64

    if-lt v2, v3, :cond_a

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const/16 v2, 0xc8

    if-ge p1, v2, :cond_a

    iget-object p1, p0, Lg8/v1;->r:Le8/c2;

    if-eqz p1, :cond_c

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    goto :goto_3

    :cond_a
    const/4 p1, 0x1

    :try_start_2
    iput-boolean p1, p0, Lg8/v1;->u:Z

    invoke-static {p2}, Lg8/v1;->k(Le8/l1;)Le8/c2;

    move-result-object p1

    iput-object p1, p0, Lg8/v1;->r:Le8/c2;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-eqz p1, :cond_b

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    goto :goto_3

    :cond_b
    :try_start_3
    invoke-virtual {p2, v0}, Le8/l1;->a(Le8/i1;)V

    sget-object p1, Le8/s0;->b:Le8/j1;

    invoke-virtual {p2, p1}, Le8/l1;->a(Le8/i1;)V

    sget-object p1, Le8/s0;->a:Le8/j1;

    invoke-virtual {p2, p1}, Le8/l1;->a(Le8/i1;)V

    invoke-virtual {p0, p2}, Lg8/a;->g(Le8/l1;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    iget-object p1, p0, Lg8/v1;->r:Le8/c2;

    if-eqz p1, :cond_c

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    goto :goto_3

    :cond_c
    :goto_4
    return-void

    :goto_5
    iget-object v0, p0, Lg8/v1;->r:Le8/c2;

    if-eqz v0, :cond_d

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Le8/c2;->a(Ljava/lang/String;)Le8/c2;

    move-result-object v0

    iput-object v0, p0, Lg8/v1;->r:Le8/c2;

    iput-object p2, p0, Lg8/v1;->s:Le8/l1;

    invoke-static {p2}, Lg8/v1;->j(Le8/l1;)Ljava/nio/charset/Charset;

    move-result-object p2

    iput-object p2, p0, Lg8/v1;->t:Ljava/nio/charset/Charset;

    :cond_d
    throw p1
.end method
