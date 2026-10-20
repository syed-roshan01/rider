.class public final Lm4/l;
.super Ljava/lang/Object;

# interfaces
.implements Lm4/g;


# static fields
.field public static final f:Lx9/c;

.field public static final g:Lx9/c;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ls4/n;

.field public final c:Lq8/c;

.field public final d:Lq8/c;

.field public final e:Z


# direct methods
.method static constructor <clinit>()V
    .locals 29

    const/4 v10, 0x0

    const/4 v8, -0x1

    const/4 v1, 0x1

    const/4 v2, 0x1

    new-instance v14, Lx9/c;

    const/4 v3, -0x1

    const/4 v4, -0x1

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v9, -0x1

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    move-object v0, v14

    invoke-direct/range {v0 .. v13}, Lx9/c;-><init>(ZZIIZZZIIZZZLjava/lang/String;)V

    sput-object v14, Lm4/l;->f:Lx9/c;

    const/16 v17, 0x0

    const/16 v23, -0x1

    const/16 v16, 0x1

    const/16 v25, 0x1

    new-instance v0, Lx9/c;

    const/16 v18, -0x1

    const/16 v19, -0x1

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v24, -0x1

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    move-object v15, v0

    invoke-direct/range {v15 .. v28}, Lx9/c;-><init>(ZZIIZZZIIZZZLjava/lang/String;)V

    sput-object v0, Lm4/l;->g:Lx9/c;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ls4/n;Lq8/c;Lq8/c;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm4/l;->a:Ljava/lang/String;

    iput-object p2, p0, Lm4/l;->b:Ls4/n;

    iput-object p3, p0, Lm4/l;->c:Lq8/c;

    iput-object p4, p0, Lm4/l;->d:Lq8/c;

    iput-boolean p5, p0, Lm4/l;->e:Z

    return-void
.end method

.method public static d(Ljava/lang/String;Lx9/u;)Ljava/lang/String;
    .locals 3

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    iget-object p1, p1, Lx9/u;->a:Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object p1, v0

    :goto_0
    if-eqz p1, :cond_1

    const/4 v1, 0x0

    const-string v2, "text/plain"

    invoke-static {p1, v2, v1}, Ll9/i;->h1(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v1

    if-eqz v1, :cond_2

    :cond_1
    invoke-static {}, Landroid/webkit/MimeTypeMap;->getSingleton()Landroid/webkit/MimeTypeMap;

    move-result-object v1

    invoke-static {v1, p0}, Lw4/e;->b(Landroid/webkit/MimeTypeMap;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_2

    return-object p0

    :cond_2
    if-eqz p1, :cond_3

    const/16 p0, 0x3b

    invoke-static {p1, p0}, Ll9/i;->l1(Ljava/lang/String;C)Ljava/lang/String;

    move-result-object v0

    :cond_3
    return-object v0
.end method


# virtual methods
.method public final a(Lu8/e;)Ljava/lang/Object;
    .locals 14

    instance-of v0, p1, Lm4/k;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lm4/k;

    iget v1, v0, Lm4/k;->f:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lm4/k;->f:I

    goto :goto_0

    :cond_0
    new-instance v0, Lm4/k;

    invoke-direct {v0, p0, p1}, Lm4/k;-><init>(Lm4/l;Lu8/e;)V

    :goto_0
    iget-object p1, v0, Lm4/k;->d:Ljava/lang/Object;

    sget-object v1, Lv8/a;->a:Lv8/a;

    iget v2, v0, Lm4/k;->f:I

    const-string v3, "response body == null"

    const/4 v4, 0x1

    const/4 v5, 0x0

    const-wide/16 v6, 0x0

    const/4 v8, 0x2

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v8, :cond_1

    iget-object v1, v0, Lm4/k;->c:Ljava/lang/Object;

    check-cast v1, Lx9/b0;

    iget-object v2, v0, Lm4/k;->b:Ll4/m;

    iget-object v0, v0, Lm4/k;->a:Lm4/l;

    :try_start_0
    invoke-static {p1}, Ld7/t;->v0(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_8

    :catch_0
    move-exception p1

    goto/16 :goto_b

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object v2, v0, Lm4/k;->c:Ljava/lang/Object;

    check-cast v2, Lr4/d;

    iget-object v4, v0, Lm4/k;->b:Ll4/m;

    iget-object v9, v0, Lm4/k;->a:Lm4/l;

    :try_start_1
    invoke-static {p1}, Ld7/t;->v0(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    move-object v13, v4

    move-object v4, v2

    move-object v2, v13

    goto/16 :goto_3

    :catch_1
    move-exception p1

    goto/16 :goto_c

    :cond_3
    invoke-static {p1}, Ld7/t;->v0(Ljava/lang/Object;)V

    iget-object p1, p0, Lm4/l;->b:Ls4/n;

    iget-object v2, p1, Ls4/n;->n:Ls4/b;

    iget-boolean v2, v2, Ls4/b;->a:Z

    iget-object v9, p0, Lm4/l;->a:Ljava/lang/String;

    if-eqz v2, :cond_5

    iget-object v2, p0, Lm4/l;->d:Lq8/c;

    invoke-interface {v2}, Lq8/c;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll4/c;

    if-eqz v2, :cond_5

    iget-object p1, p1, Ls4/n;->i:Ljava/lang/String;

    if-nez p1, :cond_4

    move-object p1, v9

    :cond_4
    check-cast v2, Ll4/n;

    sget-object v10, Lja/j;->d:Lja/j;

    invoke-static {p1}, Lfa/l;->h(Ljava/lang/String;)Lja/j;

    move-result-object p1

    const-string v10, "SHA-256"

    invoke-virtual {p1, v10}, Lja/j;->c(Ljava/lang/String;)Lja/j;

    move-result-object p1

    invoke-virtual {p1}, Lja/j;->e()Ljava/lang/String;

    move-result-object p1

    iget-object v2, v2, Ll4/n;->b:Ll4/j;

    invoke-virtual {v2, p1}, Ll4/j;->f(Ljava/lang/String;)Ll4/g;

    move-result-object p1

    if-eqz p1, :cond_5

    new-instance v2, Ll4/m;

    invoke-direct {v2, p1}, Ll4/m;-><init>(Ll4/g;)V

    goto :goto_1

    :cond_5
    move-object v2, v5

    :goto_1
    if-eqz v2, :cond_b

    :try_start_2
    invoke-virtual {p0}, Lm4/l;->c()Lja/m;

    move-result-object p1

    iget-object v10, v2, Ll4/m;->a:Ll4/g;

    iget-boolean v11, v10, Ll4/g;->b:Z

    xor-int/2addr v11, v4

    if-eqz v11, :cond_a

    iget-object v10, v10, Ll4/g;->a:Ll4/f;

    iget-object v10, v10, Ll4/f;->c:Ljava/util/ArrayList;

    const/4 v11, 0x0

    invoke-virtual {v10, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lja/x;

    invoke-virtual {p1, v10}, Lja/m;->h(Lja/x;)Lja/l;

    move-result-object p1

    iget-object p1, p1, Lja/l;->d:Ljava/lang/Long;

    if-nez p1, :cond_6

    goto :goto_2

    :cond_6
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v10

    cmp-long p1, v10, v6

    if-nez p1, :cond_7

    new-instance p1, Lm4/n;

    invoke-virtual {p0, v2}, Lm4/l;->g(Ll4/m;)Lk4/n;

    move-result-object v0

    invoke-static {v9, v5}, Lm4/l;->d(Ljava/lang/String;Lx9/u;)Ljava/lang/String;

    move-result-object v1

    sget-object v3, Lk4/f;->c:Lk4/f;

    invoke-direct {p1, v0, v1, v3}, Lm4/n;-><init>(Lk4/o;Ljava/lang/String;Lk4/f;)V

    return-object p1

    :catch_2
    move-exception p1

    move-object v4, v2

    goto/16 :goto_c

    :cond_7
    :goto_2
    iget-boolean p1, p0, Lm4/l;->e:Z

    if-eqz p1, :cond_8

    new-instance p1, Lr4/c;

    invoke-virtual {p0}, Lm4/l;->e()Ll/r;

    move-result-object v10

    invoke-virtual {p0, v2}, Lm4/l;->f(Ll4/m;)Lr4/b;

    move-result-object v11

    invoke-direct {p1, v10, v11}, Lr4/c;-><init>(Ll/r;Lr4/b;)V

    invoke-virtual {p1}, Lr4/c;->a()Lr4/d;

    move-result-object p1

    iget-object v10, p1, Lr4/d;->a:Ll/r;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    if-nez v10, :cond_c

    iget-object v10, p1, Lr4/d;->b:Lr4/b;

    if-eqz v10, :cond_c

    :try_start_3
    new-instance p1, Lm4/n;

    invoke-virtual {p0, v2}, Lm4/l;->g(Ll4/m;)Lk4/n;

    move-result-object v0

    iget-object v1, v10, Lr4/b;->b:Lq8/c;

    invoke-interface {v1}, Lq8/c;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lx9/u;

    invoke-static {v9, v1}, Lm4/l;->d(Ljava/lang/String;Lx9/u;)Ljava/lang/String;

    move-result-object v1

    sget-object v3, Lk4/f;->c:Lk4/f;

    invoke-direct {p1, v0, v1, v3}, Lm4/n;-><init>(Lk4/o;Ljava/lang/String;Lk4/f;)V

    return-object p1

    :cond_8
    new-instance p1, Lm4/n;

    invoke-virtual {p0, v2}, Lm4/l;->g(Ll4/m;)Lk4/n;

    move-result-object v0

    invoke-virtual {p0, v2}, Lm4/l;->f(Ll4/m;)Lr4/b;

    move-result-object v1

    if-eqz v1, :cond_9

    iget-object v1, v1, Lr4/b;->b:Lq8/c;

    invoke-interface {v1}, Lq8/c;->getValue()Ljava/lang/Object;

    move-result-object v1

    move-object v5, v1

    check-cast v5, Lx9/u;

    :cond_9
    invoke-static {v9, v5}, Lm4/l;->d(Ljava/lang/String;Lx9/u;)Ljava/lang/String;

    move-result-object v1

    sget-object v3, Lk4/f;->c:Lk4/f;

    invoke-direct {p1, v0, v1, v3}, Lm4/n;-><init>(Lk4/o;Ljava/lang/String;Lk4/f;)V

    return-object p1

    :cond_a
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "snapshot is closed"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_b
    new-instance p1, Lr4/c;

    invoke-virtual {p0}, Lm4/l;->e()Ll/r;

    move-result-object v9

    invoke-direct {p1, v9, v5}, Lr4/c;-><init>(Ll/r;Lr4/b;)V

    invoke-virtual {p1}, Lr4/c;->a()Lr4/d;

    move-result-object p1

    :cond_c
    iget-object v9, p1, Lr4/d;->a:Ll/r;

    invoke-static {v9}, Ld7/a;->j(Ljava/lang/Object;)V

    iput-object p0, v0, Lm4/k;->a:Lm4/l;

    iput-object v2, v0, Lm4/k;->b:Ll4/m;

    iput-object p1, v0, Lm4/k;->c:Ljava/lang/Object;

    iput v4, v0, Lm4/k;->f:I

    invoke-virtual {p0, v9, v0}, Lm4/l;->b(Ll/r;Lu8/e;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v1, :cond_d

    return-object v1

    :cond_d
    move-object v9, p0

    move-object v13, v4

    move-object v4, p1

    move-object p1, v13

    :goto_3
    check-cast p1, Lx9/b0;

    sget-object v10, Lw4/e;->a:[Landroid/graphics/Bitmap$Config;

    iget-object v10, p1, Lx9/b0;->n:Lk4/o;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2

    if-eqz v10, :cond_17

    :try_start_4
    iget-object v11, v4, Lr4/d;->a:Ll/r;

    iget-object v4, v4, Lr4/d;->b:Lr4/b;

    invoke-virtual {v9, v2, v11, p1, v4}, Lm4/l;->h(Ll4/b;Ll/r;Lx9/b0;Lr4/b;)Ll4/m;

    move-result-object v2
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_3

    iget-object v4, v9, Lm4/l;->a:Ljava/lang/String;

    if-eqz v2, :cond_f

    :try_start_5
    new-instance v0, Lm4/n;

    invoke-virtual {v9, v2}, Lm4/l;->g(Ll4/m;)Lk4/n;

    move-result-object v1

    invoke-virtual {v9, v2}, Lm4/l;->f(Ll4/m;)Lr4/b;

    move-result-object v3

    if-eqz v3, :cond_e

    iget-object v3, v3, Lr4/b;->b:Lq8/c;

    invoke-interface {v3}, Lq8/c;->getValue()Ljava/lang/Object;

    move-result-object v3

    move-object v5, v3

    check-cast v5, Lx9/u;

    goto :goto_5

    :goto_4
    move-object v1, p1

    move-object p1, v0

    goto/16 :goto_b

    :cond_e
    :goto_5
    invoke-static {v4, v5}, Lm4/l;->d(Ljava/lang/String;Lx9/u;)Ljava/lang/String;

    move-result-object v3

    sget-object v4, Lk4/f;->d:Lk4/f;

    invoke-direct {v0, v1, v3, v4}, Lm4/n;-><init>(Lk4/o;Ljava/lang/String;Lk4/f;)V

    return-object v0

    :catch_3
    move-exception v0

    goto :goto_4

    :cond_f
    move-object v11, v10

    check-cast v11, Lx9/c0;

    iget-wide v11, v11, Lx9/c0;->b:J

    cmp-long v6, v11, v6

    if-lez v6, :cond_12

    new-instance v0, Lm4/n;

    move-object v1, v10

    check-cast v1, Lx9/c0;

    iget-object v3, v9, Lm4/l;->b:Ls4/n;

    iget-object v3, v3, Ls4/n;->a:Landroid/content/Context;

    new-instance v3, Lk4/r;

    iget-object v1, v1, Lx9/c0;->c:Lja/i;

    invoke-direct {v3, v1, v5}, Lk4/r;-><init>(Lja/i;Lo7/d0;)V

    check-cast v10, Lx9/c0;

    iget v1, v10, Lx9/c0;->a:I

    iget-object v6, v10, Lx9/c0;->d:Ljava/lang/Object;

    packed-switch v1, :pswitch_data_0

    check-cast v6, Ljava/lang/String;

    if-eqz v6, :cond_10

    sget-object v1, Lx9/u;->b:Ljava/util/regex/Pattern;
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_3

    :try_start_6
    invoke-static {v6}, Lq8/k;->i(Ljava/lang/String;)Lx9/u;

    move-result-object v5
    :try_end_6
    .catch Ljava/lang/IllegalArgumentException; {:try_start_6 .. :try_end_6} :catch_4
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_3

    goto :goto_6

    :pswitch_0
    :try_start_7
    move-object v5, v6

    check-cast v5, Lx9/u;

    :catch_4
    :cond_10
    :goto_6
    invoke-static {v4, v5}, Lm4/l;->d(Ljava/lang/String;Lx9/u;)Ljava/lang/String;

    move-result-object v1

    iget-object v4, p1, Lx9/b0;->o:Lx9/b0;

    if-eqz v4, :cond_11

    sget-object v4, Lk4/f;->d:Lk4/f;

    goto :goto_7

    :cond_11
    sget-object v4, Lk4/f;->c:Lk4/f;

    :goto_7
    invoke-direct {v0, v3, v1, v4}, Lm4/n;-><init>(Lk4/o;Ljava/lang/String;Lk4/f;)V

    return-object v0

    :cond_12
    invoke-static {p1}, Lw4/e;->a(Ljava/io/Closeable;)V

    invoke-virtual {v9}, Lm4/l;->e()Ll/r;

    move-result-object v4

    iput-object v9, v0, Lm4/k;->a:Lm4/l;

    iput-object v2, v0, Lm4/k;->b:Ll4/m;

    iput-object p1, v0, Lm4/k;->c:Ljava/lang/Object;

    iput v8, v0, Lm4/k;->f:I

    invoke-virtual {v9, v4, v0}, Lm4/l;->b(Ll/r;Lu8/e;)Ljava/lang/Object;

    move-result-object v0
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_3

    if-ne v0, v1, :cond_13

    return-object v1

    :cond_13
    move-object v1, p1

    move-object p1, v0

    move-object v0, v9

    :goto_8
    :try_start_8
    check-cast p1, Lx9/b0;
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_0

    :try_start_9
    sget-object v1, Lw4/e;->a:[Landroid/graphics/Bitmap$Config;

    iget-object v1, p1, Lx9/b0;->n:Lk4/o;

    if-eqz v1, :cond_16

    new-instance v3, Lm4/n;

    move-object v4, v1

    check-cast v4, Lx9/c0;

    iget-object v6, v0, Lm4/l;->b:Ls4/n;

    iget-object v6, v6, Ls4/n;->a:Landroid/content/Context;

    new-instance v6, Lk4/r;

    iget-object v4, v4, Lx9/c0;->c:Lja/i;

    invoke-direct {v6, v4, v5}, Lk4/r;-><init>(Lja/i;Lo7/d0;)V

    iget-object v0, v0, Lm4/l;->a:Ljava/lang/String;

    check-cast v1, Lx9/c0;

    iget v4, v1, Lx9/c0;->a:I

    iget-object v1, v1, Lx9/c0;->d:Ljava/lang/Object;

    packed-switch v4, :pswitch_data_1

    check-cast v1, Ljava/lang/String;

    if-eqz v1, :cond_14

    sget-object v4, Lx9/u;->b:Ljava/util/regex/Pattern;
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_3

    :try_start_a
    invoke-static {v1}, Lq8/k;->i(Ljava/lang/String;)Lx9/u;

    move-result-object v5
    :try_end_a
    .catch Ljava/lang/IllegalArgumentException; {:try_start_a .. :try_end_a} :catch_5
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_3

    goto :goto_9

    :pswitch_1
    :try_start_b
    move-object v5, v1

    check-cast v5, Lx9/u;

    :catch_5
    :cond_14
    :goto_9
    invoke-static {v0, v5}, Lm4/l;->d(Ljava/lang/String;Lx9/u;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p1, Lx9/b0;->o:Lx9/b0;

    if-eqz v1, :cond_15

    sget-object v1, Lk4/f;->d:Lk4/f;

    goto :goto_a

    :cond_15
    sget-object v1, Lk4/f;->c:Lk4/f;

    :goto_a
    invoke-direct {v3, v6, v0, v1}, Lm4/n;-><init>(Lk4/o;Ljava/lang/String;Lk4/f;)V

    return-object v3

    :cond_16
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_b
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_3

    :goto_b
    :try_start_c
    invoke-static {v1}, Lw4/e;->a(Ljava/io/Closeable;)V

    throw p1

    :cond_17
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_c
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_2

    :goto_c
    if-eqz v4, :cond_18

    invoke-static {v4}, Lw4/e;->a(Ljava/io/Closeable;)V

    :cond_18
    throw p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_1
    .end packed-switch
.end method

.method public final b(Ll/r;Lu8/e;)Ljava/lang/Object;
    .locals 7

    instance-of v0, p2, Lm4/j;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lm4/j;

    iget v1, v0, Lm4/j;->c:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lm4/j;->c:I

    goto :goto_0

    :cond_0
    new-instance v0, Lm4/j;

    invoke-direct {v0, p0, p2}, Lm4/j;-><init>(Lm4/l;Lu8/e;)V

    :goto_0
    iget-object p2, v0, Lm4/j;->a:Ljava/lang/Object;

    sget-object v1, Lv8/a;->a:Lv8/a;

    iget v2, v0, Lm4/j;->c:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p2}, Ld7/t;->v0(Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Ld7/t;->v0(Ljava/lang/Object;)V

    sget-object p2, Lw4/e;->a:[Landroid/graphics/Bitmap$Config;

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object p2

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v2

    invoke-static {p2, v2}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    const/4 v2, 0x0

    if-eqz p2, :cond_5

    iget-object p2, p0, Lm4/l;->b:Ls4/n;

    iget-object p2, p2, Ls4/n;->o:Ls4/b;

    iget-boolean p2, p2, Ls4/b;->a:Z

    if-nez p2, :cond_4

    iget-object p2, p0, Lm4/l;->c:Lq8/c;

    invoke-interface {p2}, Lq8/c;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lx9/d;

    check-cast p2, Lx9/w;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v0, "request"

    invoke-static {p1, v0}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lba/i;

    invoke-direct {v0, p2, p1, v2}, Lba/i;-><init>(Lx9/w;Ll/r;Z)V

    iget-object p1, v0, Lba/i;->n:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {p1, v2, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result p1

    if-eqz p1, :cond_3

    iget-object p1, v0, Lba/i;->f:Lba/h;

    invoke-virtual {p1}, Lja/d;->h()V

    sget-object p1, Lfa/m;->a:Lfa/m;

    sget-object p1, Lfa/m;->a:Lfa/m;

    invoke-virtual {p1}, Lfa/m;->g()Ljava/lang/Object;

    move-result-object p1

    iput-object p1, v0, Lba/i;->o:Ljava/lang/Object;

    iget-object p1, v0, Lba/i;->e:Lx9/n;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :try_start_0
    iget-object p1, v0, Lba/i;->a:Lx9/w;

    iget-object p1, p1, Lx9/w;->a:Lx9/l;

    monitor-enter p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    iget-object p2, p1, Lx9/l;->d:Ljava/util/ArrayDeque;

    invoke-virtual {p2, v0}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    monitor-exit p1

    invoke-virtual {v0}, Lba/i;->f()Lx9/b0;

    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    iget-object p2, v0, Lba/i;->a:Lx9/w;

    iget-object p2, p2, Lx9/w;->a:Lx9/l;

    iget-object v1, p2, Lx9/l;->d:Ljava/util/ArrayDeque;

    invoke-virtual {p2, v1, v0}, Lx9/l;->a(Ljava/util/ArrayDeque;Ljava/lang/Object;)V

    goto/16 :goto_4

    :catchall_0
    move-exception p1

    goto :goto_1

    :catchall_1
    move-exception p2

    :try_start_3
    monitor-exit p1

    throw p2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :goto_1
    iget-object p2, v0, Lba/i;->a:Lx9/w;

    iget-object p2, p2, Lx9/w;->a:Lx9/l;

    iget-object v1, p2, Lx9/l;->d:Ljava/util/ArrayDeque;

    invoke-virtual {p2, v1, v0}, Lx9/l;->a(Ljava/util/ArrayDeque;Ljava/lang/Object;)V

    throw p1

    :cond_3
    const-string p1, "Already Executed"

    new-instance p2, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_4
    new-instance p1, Landroid/os/NetworkOnMainThreadException;

    invoke-direct {p1}, Landroid/os/NetworkOnMainThreadException;-><init>()V

    throw p1

    :cond_5
    iget-object p2, p0, Lm4/l;->c:Lq8/c;

    invoke-interface {p2}, Lq8/c;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lx9/d;

    check-cast p2, Lx9/w;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v4, "request"

    invoke-static {p1, v4}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v4, Lba/i;

    invoke-direct {v4, p2, p1, v2}, Lba/i;-><init>(Lx9/w;Ll/r;Z)V

    iput v3, v0, Lm4/j;->c:I

    new-instance p1, Lm9/l;

    invoke-static {v0}, Ld7/t;->b0(Lu8/e;)Lu8/e;

    move-result-object p2

    invoke-direct {p1, v3, p2}, Lm9/l;-><init>(ILu8/e;)V

    invoke-virtual {p1}, Lm9/l;->t()V

    new-instance p2, Lw4/f;

    invoke-direct {p2, v4, p1}, Lw4/f;-><init>(Lba/i;Lm9/l;)V

    iget-object v0, v4, Lba/i;->n:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0, v2, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    if-eqz v0, :cond_f

    sget-object v0, Lfa/m;->a:Lfa/m;

    sget-object v0, Lfa/m;->a:Lfa/m;

    invoke-virtual {v0}, Lfa/m;->g()Ljava/lang/Object;

    move-result-object v0

    iput-object v0, v4, Lba/i;->o:Ljava/lang/Object;

    iget-object v0, v4, Lba/i;->e:Lx9/n;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, v4, Lba/i;->a:Lx9/w;

    iget-object v0, v0, Lx9/w;->a:Lx9/l;

    new-instance v2, Lba/f;

    invoke-direct {v2, v4, p2}, Lba/f;-><init>(Lba/i;Lw4/f;)V

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    monitor-enter v0

    :try_start_4
    iget-object v3, v0, Lx9/l;->b:Ljava/util/ArrayDeque;

    invoke-virtual {v3, v2}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    iget-boolean v3, v4, Lba/i;->c:Z

    if-nez v3, :cond_a

    iget-object v3, v4, Lba/i;->b:Ll/r;

    iget-object v3, v3, Ll/r;->b:Ljava/lang/Object;

    check-cast v3, Lx9/s;

    iget-object v3, v3, Lx9/s;->d:Ljava/lang/String;

    iget-object v4, v0, Lx9/l;->c:Ljava/util/ArrayDeque;

    invoke-virtual {v4}, Ljava/util/ArrayDeque;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_6
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_7

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lba/f;

    iget-object v6, v5, Lba/f;->c:Lba/i;

    iget-object v6, v6, Lba/i;->b:Ll/r;

    iget-object v6, v6, Ll/r;->b:Ljava/lang/Object;

    check-cast v6, Lx9/s;

    iget-object v6, v6, Lx9/s;->d:Ljava/lang/String;

    invoke-static {v6, v3}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_6

    goto :goto_2

    :cond_7
    iget-object v4, v0, Lx9/l;->b:Ljava/util/ArrayDeque;

    invoke-virtual {v4}, Ljava/util/ArrayDeque;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_8
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_9

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lba/f;

    iget-object v6, v5, Lba/f;->c:Lba/i;

    iget-object v6, v6, Lba/i;->b:Ll/r;

    iget-object v6, v6, Ll/r;->b:Ljava/lang/Object;

    check-cast v6, Lx9/s;

    iget-object v6, v6, Lx9/s;->d:Ljava/lang/String;

    invoke-static {v6, v3}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_8

    goto :goto_2

    :cond_9
    const/4 v5, 0x0

    :goto_2
    if-eqz v5, :cond_a

    iget-object v3, v5, Lba/f;->b:Ljava/util/concurrent/atomic/AtomicInteger;

    iput-object v3, v2, Lba/f;->b:Ljava/util/concurrent/atomic/AtomicInteger;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    :cond_a
    monitor-exit v0

    invoke-virtual {v0}, Lx9/l;->c()V

    invoke-virtual {p1, p2}, Lm9/l;->v(Lc9/c;)V

    invoke-virtual {p1}, Lm9/l;->s()Ljava/lang/Object;

    move-result-object p2

    sget-object p1, Lv8/a;->a:Lv8/a;

    if-ne p2, v1, :cond_b

    return-object v1

    :cond_b
    :goto_3
    move-object p1, p2

    check-cast p1, Lx9/b0;

    :goto_4
    iget p2, p1, Lx9/b0;->d:I

    const/16 v0, 0xc8

    if-gt v0, p2, :cond_c

    const/16 v0, 0x12c

    if-ge p2, v0, :cond_c

    goto :goto_5

    :cond_c
    const/16 v0, 0x130

    if-eq p2, v0, :cond_e

    iget-object p2, p1, Lx9/b0;->n:Lk4/o;

    if-eqz p2, :cond_d

    invoke-static {p2}, Lw4/e;->a(Ljava/io/Closeable;)V

    :cond_d
    new-instance p2, Landroidx/fragment/app/a0;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "HTTP "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p1, Lx9/b0;->d:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ": "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p1, Lx9/b0;->c:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_e
    :goto_5
    return-object p1

    :catchall_2
    move-exception p1

    monitor-exit v0

    throw p1

    :cond_f
    const-string p1, "Already Executed"

    new-instance p2, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public final c()Lja/m;
    .locals 1

    iget-object v0, p0, Lm4/l;->d:Lq8/c;

    invoke-interface {v0}, Lq8/c;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ld7/a;->j(Ljava/lang/Object;)V

    check-cast v0, Ll4/c;

    check-cast v0, Ll4/n;

    iget-object v0, v0, Ll4/n;->a:Lja/m;

    return-object v0
.end method

.method public final e()Ll/r;
    .locals 6

    new-instance v0, Lx9/y;

    invoke-direct {v0}, Lx9/y;-><init>()V

    iget-object v1, p0, Lm4/l;->a:Ljava/lang/String;

    const-string v2, "url"

    invoke-static {v1, v2}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "ws:"

    const/4 v3, 0x1

    invoke-static {v1, v2, v3}, Ll9/i;->h1(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v2

    const-string v4, "this as java.lang.String).substring(startIndex)"

    if-eqz v2, :cond_0

    const/4 v2, 0x3

    invoke-virtual {v1, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v4}, Ld7/a;->l(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "http:"

    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    const-string v2, "wss:"

    invoke-static {v1, v2, v3}, Ll9/i;->h1(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v2

    if-eqz v2, :cond_1

    const/4 v2, 0x4

    invoke-virtual {v1, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v4}, Ld7/a;->l(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "https:"

    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    :cond_1
    :goto_0
    const-string v2, "<this>"

    invoke-static {v1, v2}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Lx9/r;

    invoke-direct {v2}, Lx9/r;-><init>()V

    const/4 v3, 0x0

    invoke-virtual {v2, v3, v1}, Lx9/r;->c(Lx9/s;Ljava/lang/String;)V

    invoke-virtual {v2}, Lx9/r;->a()Lx9/s;

    move-result-object v1

    iput-object v1, v0, Lx9/y;->a:Lx9/s;

    iget-object v1, p0, Lm4/l;->b:Ls4/n;

    iget-object v2, v1, Ls4/n;->j:Lx9/q;

    const-string v3, "headers"

    invoke-static {v2, v3}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2}, Lx9/q;->k()Lx9/p;

    move-result-object v2

    iput-object v2, v0, Lx9/y;->c:Lx9/p;

    iget-object v2, v1, Ls4/n;->k:Ls4/r;

    iget-object v2, v2, Ls4/r;->a:Ljava/util/Map;

    invoke-interface {v2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    const-string v5, "null cannot be cast to non-null type java.lang.Class<kotlin.Any>"

    invoke-static {v4, v5}, Ld7/a;->k(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v4, Ljava/lang/Class;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    if-nez v3, :cond_2

    iget-object v3, v0, Lx9/y;->d:Ljava/util/LinkedHashMap;

    invoke-interface {v3, v4}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_2
    iget-object v5, v0, Lx9/y;->d:Ljava/util/LinkedHashMap;

    invoke-interface {v5}, Ljava/util/Map;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_3

    new-instance v5, Ljava/util/LinkedHashMap;

    invoke-direct {v5}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v5, v0, Lx9/y;->d:Ljava/util/LinkedHashMap;

    :cond_3
    iget-object v5, v0, Lx9/y;->d:Ljava/util/LinkedHashMap;

    invoke-virtual {v4, v3}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    invoke-static {v3}, Ld7/a;->j(Ljava/lang/Object;)V

    invoke-interface {v5, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_4
    iget-object v2, v1, Ls4/n;->n:Ls4/b;

    iget-boolean v3, v2, Ls4/b;->a:Z

    iget-object v1, v1, Ls4/n;->o:Ls4/b;

    iget-boolean v1, v1, Ls4/b;->a:Z

    if-nez v1, :cond_5

    if-eqz v3, :cond_5

    sget-object v1, Lx9/c;->o:Lx9/c;

    invoke-virtual {v0, v1}, Lx9/y;->b(Lx9/c;)V

    goto :goto_2

    :cond_5
    if-eqz v1, :cond_7

    if-nez v3, :cond_7

    iget-boolean v1, v2, Ls4/b;->b:Z

    if-eqz v1, :cond_6

    sget-object v1, Lx9/c;->n:Lx9/c;

    invoke-virtual {v0, v1}, Lx9/y;->b(Lx9/c;)V

    goto :goto_2

    :cond_6
    sget-object v1, Lm4/l;->f:Lx9/c;

    invoke-virtual {v0, v1}, Lx9/y;->b(Lx9/c;)V

    goto :goto_2

    :cond_7
    if-nez v1, :cond_8

    if-nez v3, :cond_8

    sget-object v1, Lm4/l;->g:Lx9/c;

    invoke-virtual {v0, v1}, Lx9/y;->b(Lx9/c;)V

    :cond_8
    :goto_2
    invoke-virtual {v0}, Lx9/y;->a()Ll/r;

    move-result-object v0

    return-object v0
.end method

.method public final f(Ll4/m;)Lr4/b;
    .locals 3

    const/4 v0, 0x0

    :try_start_0
    invoke-virtual {p0}, Lm4/l;->c()Lja/m;

    move-result-object v1

    iget-object p1, p1, Ll4/m;->a:Ll4/g;

    iget-boolean v2, p1, Ll4/g;->b:Z

    xor-int/lit8 v2, v2, 0x1

    if-eqz v2, :cond_1

    iget-object p1, p1, Ll4/g;->a:Ll4/f;

    iget-object p1, p1, Ll4/f;->c:Ljava/util/ArrayList;

    const/4 v2, 0x0

    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lja/x;

    invoke-virtual {v1, p1}, Lja/m;->l(Lja/x;)Lja/g0;

    move-result-object p1

    invoke-static {p1}, Lr9/a;->c(Lja/g0;)Lja/a0;

    move-result-object p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    new-instance v1, Lr4/b;

    invoke-direct {v1, p1}, Lr4/b;-><init>(Lja/a0;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    invoke-virtual {p1}, Lja/a0;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move-object p1, v0

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_1

    :catchall_1
    move-exception v1

    :try_start_3
    invoke-virtual {p1}, Lja/a0;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    goto :goto_0

    :catchall_2
    move-exception p1

    :try_start_4
    invoke-static {v1, p1}, Ld7/a;->c(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    :goto_0
    move-object p1, v1

    move-object v1, v0

    :goto_1
    if-nez p1, :cond_0

    invoke-static {v1}, Ld7/a;->j(Ljava/lang/Object;)V

    return-object v1

    :cond_0
    throw p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v1, "snapshot is closed"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0

    :catch_0
    return-object v0
.end method

.method public final g(Ll4/m;)Lk4/n;
    .locals 4

    iget-object v0, p1, Ll4/m;->a:Ll4/g;

    iget-boolean v1, v0, Ll4/g;->b:Z

    const/4 v2, 0x1

    xor-int/2addr v1, v2

    if-eqz v1, :cond_1

    iget-object v0, v0, Ll4/g;->a:Ll4/f;

    iget-object v0, v0, Ll4/f;->c:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lja/x;

    invoke-virtual {p0}, Lm4/l;->c()Lja/m;

    move-result-object v1

    iget-object v2, p0, Lm4/l;->b:Ls4/n;

    iget-object v2, v2, Ls4/n;->i:Ljava/lang/String;

    if-nez v2, :cond_0

    iget-object v2, p0, Lm4/l;->a:Ljava/lang/String;

    :cond_0
    new-instance v3, Lk4/n;

    invoke-direct {v3, v0, v1, v2, p1}, Lk4/n;-><init>(Lja/x;Lja/m;Ljava/lang/String;Ljava/io/Closeable;)V

    return-object v3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "snapshot is closed"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final h(Ll4/b;Ll/r;Lx9/b0;Lr4/b;)Ll4/m;
    .locals 5

    iget-object v0, p0, Lm4/l;->b:Ls4/n;

    iget-object v0, v0, Ls4/n;->n:Ls4/b;

    iget-boolean v0, v0, Ls4/b;->b:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_9

    iget-boolean v0, p0, Lm4/l;->e:Z

    if-eqz v0, :cond_0

    invoke-virtual {p2}, Ll/r;->d()Lx9/c;

    move-result-object p2

    iget-boolean p2, p2, Lx9/c;->b:Z

    if-nez p2, :cond_9

    invoke-virtual {p3}, Lx9/b0;->a()Lx9/c;

    move-result-object p2

    iget-boolean p2, p2, Lx9/c;->b:Z

    if-nez p2, :cond_9

    const-string p2, "Vary"

    iget-object v0, p3, Lx9/b0;->f:Lx9/q;

    invoke-virtual {v0, p2}, Lx9/q;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    const-string v0, "*"

    invoke-static {p2, v0}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_9

    :cond_0
    if-eqz p1, :cond_1

    check-cast p1, Ll4/m;

    iget-object p1, p1, Ll4/m;->a:Ll4/g;

    iget-object p2, p1, Ll4/g;->c:Ll4/j;

    monitor-enter p2

    :try_start_0
    invoke-virtual {p1}, Ll4/g;->close()V

    iget-object p1, p1, Ll4/g;->a:Ll4/f;

    iget-object p1, p1, Ll4/f;->a:Ljava/lang/String;

    invoke-virtual {p2, p1}, Ll4/j;->e(Ljava/lang/String;)Ll4/e;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p2

    if-eqz p1, :cond_3

    new-instance p2, Ll4/l;

    invoke-direct {p2, p1}, Ll4/l;-><init>(Ll4/e;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    monitor-exit p2

    throw p1

    :cond_1
    iget-object p1, p0, Lm4/l;->d:Lq8/c;

    invoke-interface {p1}, Lq8/c;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll4/c;

    if-eqz p1, :cond_3

    iget-object p2, p0, Lm4/l;->b:Ls4/n;

    iget-object p2, p2, Ls4/n;->i:Ljava/lang/String;

    if-nez p2, :cond_2

    iget-object p2, p0, Lm4/l;->a:Ljava/lang/String;

    :cond_2
    check-cast p1, Ll4/n;

    iget-object p1, p1, Ll4/n;->b:Ll4/j;

    sget-object v0, Lja/j;->d:Lja/j;

    invoke-static {p2}, Lfa/l;->h(Ljava/lang/String;)Lja/j;

    move-result-object p2

    const-string v0, "SHA-256"

    invoke-virtual {p2, v0}, Lja/j;->c(Ljava/lang/String;)Lja/j;

    move-result-object p2

    invoke-virtual {p2}, Lja/j;->e()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ll4/j;->e(Ljava/lang/String;)Ll4/e;

    move-result-object p1

    if-eqz p1, :cond_3

    new-instance p2, Ll4/l;

    invoke-direct {p2, p1}, Ll4/l;-><init>(Ll4/e;)V

    goto :goto_0

    :cond_3
    move-object p2, v1

    :goto_0
    if-nez p2, :cond_4

    return-object v1

    :cond_4
    const/4 p1, 0x0

    :try_start_1
    iget v0, p3, Lx9/b0;->d:I

    const/16 v2, 0x130

    if-ne v0, v2, :cond_6

    if-eqz p4, :cond_6

    invoke-virtual {p3}, Lx9/b0;->e()Lx9/a0;

    move-result-object v0

    iget-object p4, p4, Lr4/b;->f:Lx9/q;

    iget-object v2, p3, Lx9/b0;->f:Lx9/q;

    invoke-static {p4, v2}, Ll4/d;->a(Lx9/q;Lx9/q;)Lx9/q;

    move-result-object p4

    invoke-virtual {p4}, Lx9/q;->k()Lx9/p;

    move-result-object p4

    iput-object p4, v0, Lx9/a0;->f:Lx9/p;

    invoke-virtual {v0}, Lx9/a0;->a()Lx9/b0;

    move-result-object p4

    invoke-virtual {p0}, Lm4/l;->c()Lja/m;

    move-result-object v0

    iget-object v2, p2, Ll4/l;->a:Ll4/e;

    invoke-virtual {v2, p1}, Ll4/e;->f(I)Lja/x;

    move-result-object v2

    invoke-virtual {v0, v2}, Lja/m;->k(Lja/x;)Lja/e0;

    move-result-object v0

    invoke-static {v0}, Lr9/a;->b(Lja/e0;)Lja/z;

    move-result-object v0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_4

    :try_start_2
    new-instance v2, Lr4/b;

    invoke-direct {v2, p4}, Lr4/b;-><init>(Lx9/b0;)V

    invoke-virtual {v2, v0}, Lr4/b;->a(Lja/z;)V

    sget-object p4, Lq8/l;->a:Lq8/l;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    :try_start_3
    invoke-virtual {v0}, Lja/z;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception v1

    goto :goto_2

    :catchall_2
    move-exception p4

    :try_start_4
    invoke-virtual {v0}, Lja/z;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    goto :goto_1

    :catchall_3
    move-exception v0

    :try_start_5
    invoke-static {p4, v0}, Ld7/a;->c(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    :goto_1
    move-object v4, v1

    move-object v1, p4

    move-object p4, v4

    :goto_2
    if-nez v1, :cond_5

    invoke-static {p4}, Ld7/a;->j(Ljava/lang/Object;)V

    goto/16 :goto_7

    :catchall_4
    move-exception p1

    goto/16 :goto_9

    :catch_0
    move-exception p4

    goto/16 :goto_8

    :cond_5
    throw v1

    :cond_6
    invoke-virtual {p0}, Lm4/l;->c()Lja/m;

    move-result-object p4

    iget-object v0, p2, Ll4/l;->a:Ll4/e;

    invoke-virtual {v0, p1}, Ll4/e;->f(I)Lja/x;

    move-result-object v0

    invoke-virtual {p4, v0}, Lja/m;->k(Lja/x;)Lja/e0;

    move-result-object p4

    invoke-static {p4}, Lr9/a;->b(Lja/e0;)Lja/z;

    move-result-object p4
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    :try_start_6
    new-instance v0, Lr4/b;

    invoke-direct {v0, p3}, Lr4/b;-><init>(Lx9/b0;)V

    invoke-virtual {v0, p4}, Lr4/b;->a(Lja/z;)V

    sget-object v0, Lq8/l;->a:Lq8/l;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_6

    :try_start_7
    invoke-virtual {p4}, Lja/z;->close()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_5

    move-object p4, v1

    goto :goto_4

    :catchall_5
    move-exception p4

    goto :goto_4

    :catchall_6
    move-exception v0

    :try_start_8
    invoke-virtual {p4}, Lja/z;->close()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_7

    goto :goto_3

    :catchall_7
    move-exception p4

    :try_start_9
    invoke-static {v0, p4}, Ld7/a;->c(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    :goto_3
    move-object p4, v0

    move-object v0, v1

    :goto_4
    if-nez p4, :cond_8

    invoke-static {v0}, Ld7/a;->j(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lm4/l;->c()Lja/m;

    move-result-object p4

    iget-object v0, p2, Ll4/l;->a:Ll4/e;

    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Ll4/e;->f(I)Lja/x;

    move-result-object v0

    invoke-virtual {p4, v0}, Lja/m;->k(Lja/x;)Lja/e0;

    move-result-object p4

    invoke-static {p4}, Lr9/a;->b(Lja/e0;)Lja/z;

    move-result-object p4
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_0
    .catchall {:try_start_9 .. :try_end_9} :catchall_4

    :try_start_a
    iget-object v0, p3, Lx9/b0;->n:Lk4/o;

    invoke-static {v0}, Ld7/a;->j(Ljava/lang/Object;)V

    check-cast v0, Lx9/c0;

    iget-object v0, v0, Lx9/c0;->c:Lja/i;

    invoke-interface {v0, p4}, Lja/i;->x(Lja/z;)J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_9

    :try_start_b
    invoke-virtual {p4}, Lja/z;->close()V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_8

    goto :goto_6

    :catchall_8
    move-exception v1

    goto :goto_6

    :catchall_9
    move-exception v0

    :try_start_c
    invoke-virtual {p4}, Lja/z;->close()V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_a

    goto :goto_5

    :catchall_a
    move-exception p4

    :try_start_d
    invoke-static {v0, p4}, Ld7/a;->c(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    :goto_5
    move-object v4, v1

    move-object v1, v0

    move-object v0, v4

    :goto_6
    if-nez v1, :cond_7

    invoke-static {v0}, Ld7/a;->j(Ljava/lang/Object;)V

    :goto_7
    invoke-virtual {p2}, Ll4/l;->a()Ll4/m;

    move-result-object p1
    :try_end_d
    .catch Ljava/lang/Exception; {:try_start_d .. :try_end_d} :catch_0
    .catchall {:try_start_d .. :try_end_d} :catchall_4

    invoke-static {p3}, Lw4/e;->a(Ljava/io/Closeable;)V

    return-object p1

    :cond_7
    :try_start_e
    throw v1

    :cond_8
    throw p4
    :try_end_e
    .catch Ljava/lang/Exception; {:try_start_e .. :try_end_e} :catch_0
    .catchall {:try_start_e .. :try_end_e} :catchall_4

    :goto_8
    :try_start_f
    sget-object v0, Lw4/e;->a:[Landroid/graphics/Bitmap$Config;
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_4

    :try_start_10
    iget-object p2, p2, Ll4/l;->a:Ll4/e;

    invoke-virtual {p2, p1}, Ll4/e;->d(Z)V
    :try_end_10
    .catch Ljava/lang/Exception; {:try_start_10 .. :try_end_10} :catch_1
    .catchall {:try_start_10 .. :try_end_10} :catchall_4

    :catch_1
    :try_start_11
    throw p4
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_4

    :goto_9
    invoke-static {p3}, Lw4/e;->a(Ljava/io/Closeable;)V

    throw p1

    :cond_9
    if-eqz p1, :cond_a

    invoke-static {p1}, Lw4/e;->a(Ljava/io/Closeable;)V

    :cond_a
    return-object v1
.end method
