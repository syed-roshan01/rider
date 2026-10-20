.class public final Lt/d;
.super Ljava/lang/Object;


# instance fields
.field public final a:Lt/x1;

.field public final b:Ljava/lang/Object;

.field public final c:Lt/o;

.field public final d:Lm0/n1;

.field public final e:Lm0/n1;

.field public f:Ljava/lang/Object;

.field public g:Ljava/lang/Object;

.field public final h:Lt/b1;

.field public final i:Lt/t;

.field public final j:Lt/t;

.field public k:Lt/t;

.field public l:Lt/t;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Lt/x1;Ljava/lang/Object;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lt/d;->a:Lt/x1;

    iput-object p3, p0, Lt/d;->b:Ljava/lang/Object;

    .line 2
    new-instance p3, Lt/o;

    const/4 v0, 0x0

    const/16 v1, 0x3c

    invoke-direct {p3, p2, p1, v0, v1}, Lt/o;-><init>(Lt/x1;Ljava/lang/Object;Lt/t;I)V

    iput-object p3, p0, Lt/d;->c:Lt/o;

    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    sget-object v0, Lm0/o3;->a:Lm0/o3;

    .line 3
    invoke-static {p2, v0}, Ld7/t;->g0(Ljava/lang/Object;Lm0/z2;)Lm0/n1;

    move-result-object p2

    iput-object p2, p0, Lt/d;->d:Lm0/n1;

    .line 4
    invoke-static {p1, v0}, Ld7/t;->g0(Ljava/lang/Object;Lm0/z2;)Lm0/n1;

    move-result-object p1

    iput-object p1, p0, Lt/d;->e:Lm0/n1;

    .line 5
    new-instance p1, Lt/b1;

    invoke-direct {p1}, Lt/b1;-><init>()V

    iput-object p1, p0, Lt/d;->h:Lt/b1;

    iget-object p1, p3, Lt/o;->c:Lt/t;

    .line 6
    instance-of p2, p1, Lt/p;

    if-eqz p2, :cond_0

    sget-object p3, Lt/e;->e:Lt/p;

    goto :goto_0

    .line 7
    :cond_0
    instance-of p3, p1, Lt/q;

    if-eqz p3, :cond_1

    sget-object p3, Lt/e;->f:Lt/q;

    goto :goto_0

    .line 8
    :cond_1
    instance-of p3, p1, Lt/r;

    if-eqz p3, :cond_2

    sget-object p3, Lt/e;->g:Lt/r;

    goto :goto_0

    :cond_2
    sget-object p3, Lt/e;->h:Lt/s;

    :goto_0
    iput-object p3, p0, Lt/d;->i:Lt/t;

    if-eqz p2, :cond_3

    sget-object p1, Lt/e;->a:Lt/p;

    goto :goto_1

    .line 9
    :cond_3
    instance-of p2, p1, Lt/q;

    if-eqz p2, :cond_4

    sget-object p1, Lt/e;->b:Lt/q;

    goto :goto_1

    .line 10
    :cond_4
    instance-of p1, p1, Lt/r;

    if-eqz p1, :cond_5

    sget-object p1, Lt/e;->c:Lt/r;

    goto :goto_1

    :cond_5
    sget-object p1, Lt/e;->d:Lt/s;

    :goto_1
    iput-object p1, p0, Lt/d;->j:Lt/t;

    iput-object p3, p0, Lt/d;->k:Lt/t;

    iput-object p1, p0, Lt/d;->l:Lt/t;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Lt/x1;Ljava/lang/Object;I)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x0

    .line 11
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lt/d;-><init>(Ljava/lang/Object;Lt/x1;Ljava/lang/Object;)V

    return-void
.end method

.method public static final a(Lt/d;)V
    .locals 3

    iget-object v0, p0, Lt/d;->c:Lt/o;

    iget-object v1, v0, Lt/o;->c:Lt/t;

    invoke-virtual {v1}, Lt/t;->d()V

    const-wide/high16 v1, -0x8000000000000000L

    iput-wide v1, v0, Lt/o;->d:J

    iget-object p0, p0, Lt/d;->d:Lm0/n1;

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {p0, v0}, Lm0/y2;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public static b(Lt/d;Ljava/lang/Object;Lt/n;Lu8/e;)Ljava/lang/Object;
    .locals 15

    move-object v8, p0

    iget-object v0, v8, Lt/d;->a:Lt/x1;

    iget-object v0, v0, Lt/x1;->b:Lc9/c;

    iget-object v1, v8, Lt/d;->c:Lt/o;

    iget-object v1, v1, Lt/o;->c:Lt/t;

    invoke-interface {v0, v1}, Lc9/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    const/4 v6, 0x0

    invoke-virtual {p0}, Lt/d;->d()Ljava/lang/Object;

    move-result-object v12

    new-instance v3, Lt/l1;

    iget-object v11, v8, Lt/d;->a:Lt/x1;

    iget-object v0, v11, Lt/x1;->a:Lc9/c;

    invoke-interface {v0, v2}, Lc9/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v14, v0

    check-cast v14, Lt/t;

    move-object v9, v3

    move-object/from16 v10, p2

    move-object/from16 v13, p1

    invoke-direct/range {v9 .. v14}, Lt/l1;-><init>(Lt/n;Lt/x1;Ljava/lang/Object;Ljava/lang/Object;Lt/t;)V

    iget-object v0, v8, Lt/d;->c:Lt/o;

    iget-wide v4, v0, Lt/o;->d:J

    new-instance v9, Lt/b;

    const/4 v7, 0x0

    move-object v0, v9

    move-object v1, p0

    invoke-direct/range {v0 .. v7}, Lt/b;-><init>(Lt/d;Ljava/lang/Object;Lt/j;JLc9/c;Lu8/e;)V

    iget-object v0, v8, Lt/d;->h:Lt/b1;

    move-object/from16 v1, p3

    invoke-static {v0, v9, v1}, Lt/b1;->a(Lt/b1;Lc9/c;Lu8/e;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final c(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget-object v0, p0, Lt/d;->k:Lt/t;

    iget-object v1, p0, Lt/d;->i:Lt/t;

    invoke-static {v0, v1}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lt/d;->l:Lt/t;

    iget-object v1, p0, Lt/d;->j:Lt/t;

    invoke-static {v0, v1}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p1

    :cond_0
    iget-object v0, p0, Lt/d;->a:Lt/x1;

    iget-object v1, v0, Lt/x1;->a:Lc9/c;

    invoke-interface {v1, p1}, Lc9/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lt/t;

    invoke-virtual {v1}, Lt/t;->b()I

    move-result v2

    const/4 v3, 0x0

    move v4, v3

    :goto_0
    if-ge v3, v2, :cond_3

    invoke-virtual {v1, v3}, Lt/t;->a(I)F

    move-result v5

    iget-object v6, p0, Lt/d;->k:Lt/t;

    invoke-virtual {v6, v3}, Lt/t;->a(I)F

    move-result v6

    cmpg-float v5, v5, v6

    if-ltz v5, :cond_1

    invoke-virtual {v1, v3}, Lt/t;->a(I)F

    move-result v5

    iget-object v6, p0, Lt/d;->l:Lt/t;

    invoke-virtual {v6, v3}, Lt/t;->a(I)F

    move-result v6

    cmpl-float v5, v5, v6

    if-lez v5, :cond_2

    :cond_1
    invoke-virtual {v1, v3}, Lt/t;->a(I)F

    move-result v4

    iget-object v5, p0, Lt/d;->k:Lt/t;

    invoke-virtual {v5, v3}, Lt/t;->a(I)F

    move-result v5

    iget-object v6, p0, Lt/d;->l:Lt/t;

    invoke-virtual {v6, v3}, Lt/t;->a(I)F

    move-result v6

    invoke-static {v4, v5, v6}, Lz6/a;->q(FFF)F

    move-result v4

    invoke-virtual {v1, v3, v4}, Lt/t;->e(IF)V

    const/4 v4, 0x1

    :cond_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_3
    if-eqz v4, :cond_4

    iget-object p1, v0, Lt/x1;->b:Lc9/c;

    invoke-interface {p1, v1}, Lc9/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    :cond_4
    return-object p1
.end method

.method public final d()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lt/d;->c:Lt/o;

    iget-object v0, v0, Lt/o;->b:Lm0/n1;

    invoke-virtual {v0}, Lm0/y2;->getValue()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final e(Ljava/lang/Object;Lu8/e;)Ljava/lang/Object;
    .locals 2

    new-instance v0, Lt/c;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Lt/c;-><init>(Lt/d;Ljava/lang/Object;Lu8/e;)V

    iget-object p1, p0, Lt/d;->h:Lt/b1;

    invoke-static {p1, v0, p2}, Lt/b1;->a(Lt/b1;Lc9/c;Lu8/e;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lv8/a;->a:Lv8/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Lq8/l;->a:Lq8/l;

    return-object p1
.end method
