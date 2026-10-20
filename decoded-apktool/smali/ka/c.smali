.class public abstract Lka/c;
.super Ljava/lang/Object;


# static fields
.field public static final a:Lja/j;

.field public static final b:Lja/j;

.field public static final c:Lja/j;

.field public static final d:Lja/j;

.field public static final e:Lja/j;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lja/j;->d:Lja/j;

    const-string v0, "/"

    invoke-static {v0}, Lfa/l;->h(Ljava/lang/String;)Lja/j;

    move-result-object v0

    sput-object v0, Lka/c;->a:Lja/j;

    const-string v0, "\\"

    invoke-static {v0}, Lfa/l;->h(Ljava/lang/String;)Lja/j;

    move-result-object v0

    sput-object v0, Lka/c;->b:Lja/j;

    const-string v0, "/\\"

    invoke-static {v0}, Lfa/l;->h(Ljava/lang/String;)Lja/j;

    move-result-object v0

    sput-object v0, Lka/c;->c:Lja/j;

    const-string v0, "."

    invoke-static {v0}, Lfa/l;->h(Ljava/lang/String;)Lja/j;

    move-result-object v0

    sput-object v0, Lka/c;->d:Lja/j;

    const-string v0, ".."

    invoke-static {v0}, Lfa/l;->h(Ljava/lang/String;)Lja/j;

    move-result-object v0

    sput-object v0, Lka/c;->e:Lja/j;

    return-void
.end method

.method public static final a(Lja/x;)I
    .locals 6

    iget-object v0, p0, Lja/x;->a:Lja/j;

    invoke-virtual {v0}, Lja/j;->d()I

    move-result v0

    const/4 v1, -0x1

    if-nez v0, :cond_0

    goto/16 :goto_1

    :cond_0
    iget-object p0, p0, Lja/x;->a:Lja/j;

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lja/j;->i(I)B

    move-result v2

    const/16 v3, 0x2f

    const/4 v4, 0x1

    if-ne v2, v3, :cond_2

    :cond_1
    move v1, v4

    goto :goto_1

    :cond_2
    invoke-virtual {p0, v0}, Lja/j;->i(I)B

    move-result v2

    const/16 v3, 0x5c

    const/4 v5, 0x2

    if-ne v2, v3, :cond_4

    invoke-virtual {p0}, Lja/j;->d()I

    move-result v0

    if-le v0, v5, :cond_1

    invoke-virtual {p0, v4}, Lja/j;->i(I)B

    move-result v0

    if-ne v0, v3, :cond_1

    sget-object v0, Lka/c;->b:Lja/j;

    const-string v2, "other"

    invoke-static {v0, v2}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, v0, Lja/j;->a:[B

    invoke-virtual {p0, v5, v0}, Lja/j;->f(I[B)I

    move-result v0

    if-ne v0, v1, :cond_3

    invoke-virtual {p0}, Lja/j;->d()I

    move-result p0

    move v1, p0

    goto :goto_1

    :cond_3
    move v1, v0

    goto :goto_1

    :cond_4
    invoke-virtual {p0}, Lja/j;->d()I

    move-result v2

    if-le v2, v5, :cond_6

    invoke-virtual {p0, v4}, Lja/j;->i(I)B

    move-result v2

    const/16 v4, 0x3a

    if-ne v2, v4, :cond_6

    invoke-virtual {p0, v5}, Lja/j;->i(I)B

    move-result v2

    if-ne v2, v3, :cond_6

    invoke-virtual {p0, v0}, Lja/j;->i(I)B

    move-result p0

    int-to-char p0, p0

    const/16 v0, 0x61

    if-gt v0, p0, :cond_5

    const/16 v0, 0x7b

    if-ge p0, v0, :cond_5

    goto :goto_0

    :cond_5
    const/16 v0, 0x41

    if-gt v0, p0, :cond_6

    const/16 v0, 0x5b

    if-ge p0, v0, :cond_6

    :goto_0
    const/4 v1, 0x3

    :cond_6
    :goto_1
    return v1
.end method

.method public static final b(Lja/x;Lja/x;Z)Lja/x;
    .locals 6

    const-string v0, "<this>"

    invoke-static {p0, v0}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "child"

    invoke-static {p1, v0}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lka/c;->a(Lja/x;)I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lja/x;->g()Ljava/lang/Character;

    move-result-object v0

    if-eqz v0, :cond_1

    :goto_0
    return-object p1

    :cond_1
    invoke-static {p0}, Lka/c;->c(Lja/x;)Lja/j;

    move-result-object v0

    if-nez v0, :cond_2

    invoke-static {p1}, Lka/c;->c(Lja/x;)Lja/j;

    move-result-object v0

    if-nez v0, :cond_2

    sget-object v0, Lja/x;->b:Ljava/lang/String;

    invoke-static {v0}, Lka/c;->f(Ljava/lang/String;)Lja/j;

    move-result-object v0

    :cond_2
    new-instance v1, Lja/g;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    iget-object p0, p0, Lja/x;->a:Lja/j;

    invoke-virtual {v1, p0}, Lja/g;->e0(Lja/j;)V

    iget-wide v2, v1, Lja/g;->b:J

    const-wide/16 v4, 0x0

    cmp-long p0, v2, v4

    if-lez p0, :cond_3

    invoke-virtual {v1, v0}, Lja/g;->e0(Lja/j;)V

    :cond_3
    iget-object p0, p1, Lja/x;->a:Lja/j;

    invoke-virtual {v1, p0}, Lja/g;->e0(Lja/j;)V

    invoke-static {v1, p2}, Lka/c;->d(Lja/g;Z)Lja/x;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lja/x;)Lja/j;
    .locals 3

    iget-object v0, p0, Lja/x;->a:Lja/j;

    sget-object v1, Lka/c;->a:Lja/j;

    invoke-static {v0, v1}, Lja/j;->g(Lja/j;Lja/j;)I

    move-result v0

    const/4 v2, -0x1

    if-eq v0, v2, :cond_0

    goto :goto_0

    :cond_0
    sget-object v1, Lka/c;->b:Lja/j;

    iget-object p0, p0, Lja/x;->a:Lja/j;

    invoke-static {p0, v1}, Lja/j;->g(Lja/j;Lja/j;)I

    move-result p0

    if-eq p0, v2, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    return-object v1
.end method

.method public static final d(Lja/g;Z)Lja/x;
    .locals 17

    move-object/from16 v0, p0

    new-instance v1, Lja/g;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    const/4 v2, 0x0

    const/4 v3, 0x0

    move v4, v3

    :goto_0
    sget-object v5, Lka/c;->a:Lja/j;

    invoke-virtual {v0, v5}, Lja/g;->q(Lja/j;)Z

    move-result v5

    if-nez v5, :cond_19

    sget-object v5, Lka/c;->b:Lja/j;

    invoke-virtual {v0, v5}, Lja/g;->q(Lja/j;)Z

    move-result v6

    if-eqz v6, :cond_0

    goto/16 :goto_a

    :cond_0
    const/4 v6, 0x2

    const/4 v7, 0x1

    if-lt v4, v6, :cond_1

    invoke-static {v2, v5}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    move v6, v7

    goto :goto_1

    :cond_1
    move v6, v3

    :goto_1
    sget-object v8, Lka/c;->c:Lja/j;

    const-wide/16 v9, 0x0

    const-wide/16 v11, -0x1

    if-eqz v6, :cond_2

    invoke-static {v2}, Ld7/a;->j(Ljava/lang/Object;)V

    invoke-virtual {v1, v2}, Lja/g;->e0(Lja/j;)V

    invoke-virtual {v1, v2}, Lja/g;->e0(Lja/j;)V

    goto :goto_4

    :cond_2
    if-lez v4, :cond_3

    invoke-static {v2}, Ld7/a;->j(Ljava/lang/Object;)V

    invoke-virtual {v1, v2}, Lja/g;->e0(Lja/j;)V

    goto :goto_4

    :cond_3
    invoke-virtual {v0, v8}, Lja/g;->p(Lja/j;)J

    move-result-wide v13

    if-nez v2, :cond_5

    cmp-long v2, v13, v11

    if-nez v2, :cond_4

    sget-object v2, Lja/x;->b:Ljava/lang/String;

    invoke-static {v2}, Lka/c;->f(Ljava/lang/String;)Lja/j;

    move-result-object v2

    goto :goto_2

    :cond_4
    invoke-virtual {v0, v13, v14}, Lja/g;->f(J)B

    move-result v2

    invoke-static {v2}, Lka/c;->e(B)Lja/j;

    move-result-object v2

    :cond_5
    :goto_2
    invoke-static {v2, v5}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_6

    goto :goto_4

    :cond_6
    iget-wide v4, v0, Lja/g;->b:J

    const-wide/16 v11, 0x2

    cmp-long v4, v4, v11

    if-gez v4, :cond_7

    goto :goto_4

    :cond_7
    const-wide/16 v4, 0x1

    invoke-virtual {v0, v4, v5}, Lja/g;->f(J)B

    move-result v4

    const/16 v5, 0x3a

    if-eq v4, v5, :cond_8

    goto :goto_4

    :cond_8
    invoke-virtual {v0, v9, v10}, Lja/g;->f(J)B

    move-result v4

    int-to-char v4, v4

    const/16 v5, 0x61

    if-gt v5, v4, :cond_9

    const/16 v5, 0x7b

    if-ge v4, v5, :cond_9

    goto :goto_3

    :cond_9
    const/16 v5, 0x41

    if-gt v5, v4, :cond_b

    const/16 v5, 0x5b

    if-ge v4, v5, :cond_b

    :goto_3
    cmp-long v4, v13, v11

    if-nez v4, :cond_a

    const-wide/16 v4, 0x3

    invoke-virtual {v1, v0, v4, v5}, Lja/g;->b0(Lja/g;J)V

    goto :goto_4

    :cond_a
    invoke-virtual {v1, v0, v11, v12}, Lja/g;->b0(Lja/g;J)V

    :cond_b
    :goto_4
    iget-wide v4, v1, Lja/g;->b:J

    cmp-long v4, v4, v9

    if-lez v4, :cond_c

    move v4, v7

    goto :goto_5

    :cond_c
    move v4, v3

    :goto_5
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    :cond_d
    :goto_6
    invoke-virtual/range {p0 .. p0}, Lja/g;->B()Z

    move-result v11

    sget-object v12, Lka/c;->d:Lja/j;

    if-nez v11, :cond_15

    invoke-virtual {v0, v8}, Lja/g;->p(Lja/j;)J

    move-result-wide v13

    const-wide/16 v15, -0x1

    cmp-long v11, v13, v15

    if-nez v11, :cond_e

    iget-wide v13, v0, Lja/g;->b:J

    invoke-virtual {v0, v13, v14}, Lja/g;->i(J)Lja/j;

    move-result-object v11

    goto :goto_7

    :cond_e
    invoke-virtual {v0, v13, v14}, Lja/g;->i(J)Lja/j;

    move-result-object v11

    invoke-virtual/range {p0 .. p0}, Lja/g;->readByte()B

    :goto_7
    sget-object v13, Lka/c;->e:Lja/j;

    invoke-static {v11, v13}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_14

    if-eqz v4, :cond_f

    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v12

    if-nez v12, :cond_d

    :cond_f
    if-eqz p1, :cond_13

    if-nez v4, :cond_10

    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v12

    if-nez v12, :cond_13

    invoke-static {v5}, Lr8/p;->L0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v12

    invoke-static {v12, v13}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_10

    goto :goto_8

    :cond_10
    if-eqz v6, :cond_11

    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v11

    if-eq v11, v7, :cond_d

    :cond_11
    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v11

    if-eqz v11, :cond_12

    goto :goto_6

    :cond_12
    invoke-static {v5}, Ld7/t;->Y(Ljava/util/List;)I

    move-result v11

    invoke-virtual {v5, v11}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    goto :goto_6

    :cond_13
    :goto_8
    invoke-virtual {v5, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_6

    :cond_14
    invoke-static {v11, v12}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_d

    sget-object v12, Lja/j;->d:Lja/j;

    invoke-static {v11, v12}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_d

    invoke-virtual {v5, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_6

    :cond_15
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v0

    :goto_9
    if-ge v3, v0, :cond_17

    if-lez v3, :cond_16

    invoke-virtual {v1, v2}, Lja/g;->e0(Lja/j;)V

    :cond_16
    invoke-virtual {v5, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lja/j;

    invoke-virtual {v1, v4}, Lja/g;->e0(Lja/j;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_9

    :cond_17
    iget-wide v2, v1, Lja/g;->b:J

    cmp-long v0, v2, v9

    if-nez v0, :cond_18

    invoke-virtual {v1, v12}, Lja/g;->e0(Lja/j;)V

    :cond_18
    new-instance v0, Lja/x;

    iget-wide v2, v1, Lja/g;->b:J

    invoke-virtual {v1, v2, v3}, Lja/g;->i(J)Lja/j;

    move-result-object v1

    invoke-direct {v0, v1}, Lja/x;-><init>(Lja/j;)V

    return-object v0

    :cond_19
    :goto_a
    invoke-virtual/range {p0 .. p0}, Lja/g;->readByte()B

    move-result v5

    if-nez v2, :cond_1a

    invoke-static {v5}, Lka/c;->e(B)Lja/j;

    move-result-object v2

    :cond_1a
    add-int/lit8 v4, v4, 0x1

    goto/16 :goto_0
.end method

.method public static final e(B)Lja/j;
    .locals 2

    const/16 v0, 0x2f

    if-eq p0, v0, :cond_1

    const/16 v0, 0x5c

    if-ne p0, v0, :cond_0

    sget-object p0, Lka/c;->b:Lja/j;

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "not a directory separator: "

    invoke-static {v1, p0}, Ll/q;->g(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    sget-object p0, Lka/c;->a:Lja/j;

    :goto_0
    return-object p0
.end method

.method public static final f(Ljava/lang/String;)Lja/j;
    .locals 2

    const-string v0, "/"

    invoke-static {p0, v0}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p0, Lka/c;->a:Lja/j;

    goto :goto_0

    :cond_0
    const-string v0, "\\"

    invoke-static {p0, v0}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object p0, Lka/c;->b:Lja/j;

    :goto_0
    return-object p0

    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "not a directory separator: "

    invoke-static {v1, p0}, Ll/q;->x(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
