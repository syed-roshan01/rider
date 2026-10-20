.class public abstract Lo7/d0;
.super Ljava/lang/Object;


# static fields
.field public static volatile a:Le8/p1; = null

.field public static volatile b:Le8/p1; = null

.field public static volatile c:Le8/p1; = null

.field public static volatile d:Le8/p1; = null

.field public static volatile e:Le8/p1; = null

.field public static f:Z = true

.field public static g:Ljava/lang/reflect/Method;

.field public static h:Li1/f;

.field public static i:Li1/f;

.field public static j:Li1/f;

.field public static k:Li1/f;

.field public static l:Li1/f;

.field public static m:Li1/f;

.field public static n:Li1/f;

.field public static o:Li1/f;

.field public static p:Li1/f;

.field public static q:Li1/f;

.field public static r:Li1/f;

.field public static s:Li1/f;

.field public static t:Li1/f;

.field public static u:Li1/f;

.field public static v:Li1/f;

.field public static w:Li1/f;


# direct methods
.method public static final A()Li1/f;
    .locals 12

    sget-object v0, Lo7/d0;->k:Li1/f;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v2, "Filled.Check"

    const/4 v10, 0x0

    new-instance v0, Li1/e;

    const/high16 v3, 0x41c00000    # 24.0f

    const/high16 v4, 0x41c00000    # 24.0f

    const/high16 v5, 0x41c00000    # 24.0f

    const/high16 v6, 0x41c00000    # 24.0f

    const-wide/16 v7, 0x0

    const/4 v9, 0x0

    const/16 v11, 0x60

    move-object v1, v0

    invoke-direct/range {v1 .. v11}, Li1/e;-><init>(Ljava/lang/String;FFFFJIZI)V

    sget v1, Li1/h0;->a:I

    new-instance v1, Le1/n0;

    sget-wide v2, Le1/r;->b:J

    invoke-direct {v1, v2, v3}, Le1/n0;-><init>(J)V

    new-instance v2, Lk/f;

    const/4 v3, 0x7

    invoke-direct {v2, v3}, Lk/f;-><init>(I)V

    const/high16 v3, 0x41100000    # 9.0f

    const v4, 0x41815c29    # 16.17f

    invoke-virtual {v2, v3, v4}, Lk/f;->D(FF)V

    const v4, 0x409a8f5c    # 4.83f

    const/high16 v5, 0x41400000    # 12.0f

    invoke-virtual {v2, v4, v5}, Lk/f;->B(FF)V

    const v4, -0x404a3d71    # -1.42f

    const v5, 0x3fb47ae1    # 1.41f

    invoke-virtual {v2, v4, v5}, Lk/f;->C(FF)V

    const/high16 v4, 0x41980000    # 19.0f

    invoke-virtual {v2, v3, v4}, Lk/f;->B(FF)V

    const/high16 v3, 0x41a80000    # 21.0f

    const/high16 v4, 0x40e00000    # 7.0f

    invoke-virtual {v2, v3, v4}, Lk/f;->B(FF)V

    const v3, -0x404b851f    # -1.41f

    invoke-virtual {v2, v3, v3}, Lk/f;->C(FF)V

    invoke-virtual {v2}, Lk/f;->p()V

    iget-object v2, v2, Lk/f;->b:Ljava/lang/Object;

    check-cast v2, Ljava/util/ArrayList;

    invoke-static {v0, v2, v1}, Li1/e;->a(Li1/e;Ljava/util/ArrayList;Le1/n0;)V

    invoke-virtual {v0}, Li1/e;->b()Li1/f;

    move-result-object v0

    sput-object v0, Lo7/d0;->k:Li1/f;

    return-object v0
.end method

.method public static final B()Li1/f;
    .locals 12

    sget-object v0, Lo7/d0;->m:Li1/f;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v2, "Filled.Download"

    const/4 v10, 0x0

    new-instance v0, Li1/e;

    const/high16 v3, 0x41c00000    # 24.0f

    const/high16 v4, 0x41c00000    # 24.0f

    const/high16 v5, 0x41c00000    # 24.0f

    const/high16 v6, 0x41c00000    # 24.0f

    const-wide/16 v7, 0x0

    const/4 v9, 0x0

    const/16 v11, 0x60

    move-object v1, v0

    invoke-direct/range {v1 .. v11}, Li1/e;-><init>(Ljava/lang/String;FFFFJIZI)V

    sget v1, Li1/h0;->a:I

    new-instance v1, Le1/n0;

    sget-wide v2, Le1/r;->b:J

    invoke-direct {v1, v2, v3}, Le1/n0;-><init>(J)V

    new-instance v2, Lk/f;

    const/4 v3, 0x7

    invoke-direct {v2, v3}, Lk/f;-><init>(I)V

    const/high16 v3, 0x40a00000    # 5.0f

    const/high16 v4, 0x41a00000    # 20.0f

    invoke-virtual {v2, v3, v4}, Lk/f;->D(FF)V

    const/high16 v5, 0x41600000    # 14.0f

    invoke-virtual {v2, v5}, Lk/f;->A(F)V

    const/high16 v5, -0x40000000    # -2.0f

    invoke-virtual {v2, v5}, Lk/f;->K(F)V

    invoke-virtual {v2, v3}, Lk/f;->z(F)V

    invoke-virtual {v2, v4}, Lk/f;->J(F)V

    invoke-virtual {v2}, Lk/f;->p()V

    const/high16 v4, 0x41980000    # 19.0f

    const/high16 v5, 0x41100000    # 9.0f

    invoke-virtual {v2, v4, v5}, Lk/f;->D(FF)V

    const/high16 v6, -0x3f800000    # -4.0f

    invoke-virtual {v2, v6}, Lk/f;->A(F)V

    const/high16 v6, 0x40400000    # 3.0f

    invoke-virtual {v2, v6}, Lk/f;->J(F)V

    invoke-virtual {v2, v5}, Lk/f;->z(F)V

    const/high16 v6, 0x40c00000    # 6.0f

    invoke-virtual {v2, v6}, Lk/f;->K(F)V

    invoke-virtual {v2, v3}, Lk/f;->z(F)V

    const/high16 v3, 0x40e00000    # 7.0f

    invoke-virtual {v2, v3, v3}, Lk/f;->C(FF)V

    invoke-virtual {v2, v4, v5}, Lk/f;->B(FF)V

    invoke-virtual {v2}, Lk/f;->p()V

    iget-object v2, v2, Lk/f;->b:Ljava/lang/Object;

    check-cast v2, Ljava/util/ArrayList;

    invoke-static {v0, v2, v1}, Li1/e;->a(Li1/e;Ljava/util/ArrayList;Le1/n0;)V

    invoke-virtual {v0}, Li1/e;->b()Li1/f;

    move-result-object v0

    sput-object v0, Lo7/d0;->m:Li1/f;

    return-object v0
.end method

.method public static C(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;
    .locals 1

    invoke-static {}, Ll/w1;->c()Ll/w1;

    move-result-object v0

    invoke-virtual {v0, p0, p1}, Ll/w1;->e(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p0

    return-object p0
.end method

.method public static D()Ljava/util/Set;
    .locals 4

    :try_start_0
    const-string v0, "android.text.EmojiConsistency"

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    const-string v1, "getEmojiConsistencySet"

    const/4 v2, 0x0

    new-array v3, v2, [Ljava/lang/Class;

    invoke-virtual {v0, v1, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    new-array v1, v2, [Ljava/lang/Object;

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-static {}, Ljava/util/Collections;->emptySet()Ljava/util/Set;

    move-result-object v0

    return-object v0

    :cond_0
    check-cast v0, Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    instance-of v2, v2, [I

    if-nez v2, :cond_1

    invoke-static {}, Ljava/util/Collections;->emptySet()Ljava/util/Set;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_2
    return-object v0

    :catchall_0
    invoke-static {}, Ljava/util/Collections;->emptySet()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public static final E()Li1/f;
    .locals 12

    sget-object v0, Lo7/d0;->p:Li1/f;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v2, "Filled.Layers"

    const/4 v10, 0x0

    new-instance v0, Li1/e;

    const/high16 v3, 0x41c00000    # 24.0f

    const/high16 v4, 0x41c00000    # 24.0f

    const/high16 v5, 0x41c00000    # 24.0f

    const/high16 v6, 0x41c00000    # 24.0f

    const-wide/16 v7, 0x0

    const/4 v9, 0x0

    const/16 v11, 0x60

    move-object v1, v0

    invoke-direct/range {v1 .. v11}, Li1/e;-><init>(Ljava/lang/String;FFFFJIZI)V

    sget v1, Li1/h0;->a:I

    new-instance v1, Le1/n0;

    sget-wide v2, Le1/r;->b:J

    invoke-direct {v1, v2, v3}, Le1/n0;-><init>(J)V

    new-instance v2, Lk/f;

    const/4 v3, 0x7

    invoke-direct {v2, v3}, Lk/f;-><init>(I)V

    const v3, 0x413fd70a    # 11.99f

    const v4, 0x419451ec    # 18.54f

    invoke-virtual {v2, v3, v4}, Lk/f;->D(FF)V

    const v3, -0x3f1428f6    # -7.37f

    const v4, -0x3f48a3d7    # -5.73f

    invoke-virtual {v2, v3, v4}, Lk/f;->C(FF)V

    const/high16 v3, 0x40400000    # 3.0f

    const v5, 0x41611eb8    # 14.07f

    invoke-virtual {v2, v3, v5}, Lk/f;->B(FF)V

    const/high16 v3, 0x41100000    # 9.0f

    const/high16 v5, 0x40e00000    # 7.0f

    invoke-virtual {v2, v3, v5}, Lk/f;->C(FF)V

    const/high16 v6, -0x3f200000    # -7.0f

    invoke-virtual {v2, v3, v6}, Lk/f;->C(FF)V

    const v7, -0x402f5c29    # -1.63f

    const v8, -0x405d70a4    # -1.27f

    invoke-virtual {v2, v7, v8}, Lk/f;->C(FF)V

    const v7, -0x3f13d70a    # -7.38f

    const v8, 0x40b7ae14    # 5.74f

    invoke-virtual {v2, v7, v8}, Lk/f;->C(FF)V

    invoke-virtual {v2}, Lk/f;->p()V

    const/high16 v7, 0x41400000    # 12.0f

    const/high16 v8, 0x41800000    # 16.0f

    invoke-virtual {v2, v7, v8}, Lk/f;->D(FF)V

    const v9, 0x40eb851f    # 7.36f

    invoke-virtual {v2, v9, v4}, Lk/f;->C(FF)V

    const/high16 v4, 0x41a80000    # 21.0f

    invoke-virtual {v2, v4, v3}, Lk/f;->B(FF)V

    const/high16 v3, -0x3ef00000    # -9.0f

    invoke-virtual {v2, v3, v6}, Lk/f;->C(FF)V

    invoke-virtual {v2, v3, v5}, Lk/f;->C(FF)V

    const v3, 0x3fd0a3d7    # 1.63f

    const v4, 0x3fa28f5c    # 1.27f

    invoke-virtual {v2, v3, v4}, Lk/f;->C(FF)V

    invoke-virtual {v2, v7, v8}, Lk/f;->B(FF)V

    invoke-virtual {v2}, Lk/f;->p()V

    iget-object v2, v2, Lk/f;->b:Ljava/lang/Object;

    check-cast v2, Ljava/util/ArrayList;

    invoke-static {v0, v2, v1}, Li1/e;->a(Li1/e;Ljava/util/ArrayList;Le1/n0;)V

    invoke-virtual {v0}, Li1/e;->b()Li1/f;

    move-result-object v0

    sput-object v0, Lo7/d0;->p:Li1/f;

    return-object v0
.end method

.method public static final G()Li1/f;
    .locals 12

    sget-object v0, Lo7/d0;->v:Li1/f;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v2, "Filled.Verified"

    const/4 v10, 0x0

    new-instance v0, Li1/e;

    const/high16 v3, 0x41c00000    # 24.0f

    const/high16 v4, 0x41c00000    # 24.0f

    const/high16 v5, 0x41c00000    # 24.0f

    const/high16 v6, 0x41c00000    # 24.0f

    const-wide/16 v7, 0x0

    const/4 v9, 0x0

    const/16 v11, 0x60

    move-object v1, v0

    invoke-direct/range {v1 .. v11}, Li1/e;-><init>(Ljava/lang/String;FFFFJIZI)V

    sget v1, Li1/h0;->a:I

    new-instance v1, Le1/n0;

    sget-wide v2, Le1/r;->b:J

    invoke-direct {v1, v2, v3}, Le1/n0;-><init>(J)V

    new-instance v2, Lk/f;

    const/4 v3, 0x7

    invoke-direct {v2, v3}, Lk/f;-><init>(I)V

    const/high16 v3, 0x41b80000    # 23.0f

    const/high16 v4, 0x41400000    # 12.0f

    invoke-virtual {v2, v3, v4}, Lk/f;->D(FF)V

    const v5, -0x3fe3d70a    # -2.44f

    const v6, -0x3fcd70a4    # -2.79f

    invoke-virtual {v2, v5, v6}, Lk/f;->C(FF)V

    const v5, 0x3eae147b    # 0.34f

    const v6, -0x3f93d70a    # -3.69f

    invoke-virtual {v2, v5, v6}, Lk/f;->C(FF)V

    const v5, -0x3f98f5c3    # -3.61f

    const v7, -0x40ae147b    # -0.82f

    invoke-virtual {v2, v5, v7}, Lk/f;->C(FF)V

    const v5, 0x41766666    # 15.4f

    const/high16 v8, 0x3fc00000    # 1.5f

    invoke-virtual {v2, v5, v8}, Lk/f;->B(FF)V

    const v5, 0x403d70a4    # 2.96f

    invoke-virtual {v2, v4, v5}, Lk/f;->B(FF)V

    const v5, 0x4109999a    # 8.6f

    invoke-virtual {v2, v5, v8}, Lk/f;->B(FF)V

    const v8, 0x40d6b852    # 6.71f

    const v9, 0x4096147b    # 4.69f

    invoke-virtual {v2, v8, v9}, Lk/f;->B(FF)V

    const v8, 0x40466666    # 3.1f

    const/high16 v9, 0x40b00000    # 5.5f

    invoke-virtual {v2, v8, v9}, Lk/f;->B(FF)V

    const v8, 0x405c28f6    # 3.44f

    const v9, 0x41133333    # 9.2f

    invoke-virtual {v2, v8, v9}, Lk/f;->B(FF)V

    const/high16 v8, 0x3f800000    # 1.0f

    invoke-virtual {v2, v8, v4}, Lk/f;->B(FF)V

    const v8, 0x401c28f6    # 2.44f

    const v9, 0x40328f5c    # 2.79f

    invoke-virtual {v2, v8, v9}, Lk/f;->C(FF)V

    const v8, -0x4151eb85    # -0.34f

    const v9, 0x406ccccd    # 3.7f

    invoke-virtual {v2, v8, v9}, Lk/f;->C(FF)V

    const v9, 0x40670a3d    # 3.61f

    const v10, 0x3f51eb85    # 0.82f

    invoke-virtual {v2, v9, v10}, Lk/f;->C(FF)V

    const/high16 v10, 0x41b40000    # 22.5f

    invoke-virtual {v2, v5, v10}, Lk/f;->B(FF)V

    const v5, 0x4059999a    # 3.4f

    const v10, -0x4043d70a    # -1.47f

    invoke-virtual {v2, v5, v10}, Lk/f;->C(FF)V

    const v10, 0x3fbae148    # 1.46f

    invoke-virtual {v2, v5, v10}, Lk/f;->C(FF)V

    const v5, 0x3ff1eb85    # 1.89f

    const v10, -0x3fb3d70a    # -3.19f

    invoke-virtual {v2, v5, v10}, Lk/f;->C(FF)V

    invoke-virtual {v2, v9, v7}, Lk/f;->C(FF)V

    invoke-virtual {v2, v8, v6}, Lk/f;->C(FF)V

    invoke-virtual {v2, v3, v4}, Lk/f;->B(FF)V

    invoke-virtual {v2}, Lk/f;->p()V

    const v3, 0x412170a4    # 10.09f

    const v4, 0x4185c28f    # 16.72f

    invoke-virtual {v2, v3, v4}, Lk/f;->D(FF)V

    const v5, -0x3f8ccccd    # -3.8f

    const v6, -0x3f8c28f6    # -3.81f

    invoke-virtual {v2, v5, v6}, Lk/f;->C(FF)V

    const v5, 0x3fbd70a4    # 1.48f

    const v6, -0x40428f5c    # -1.48f

    invoke-virtual {v2, v5, v6}, Lk/f;->C(FF)V

    const v6, 0x40147ae1    # 2.32f

    const v7, 0x40151eb8    # 2.33f

    invoke-virtual {v2, v6, v7}, Lk/f;->C(FF)V

    const v6, 0x40bb3333    # 5.85f

    const v7, -0x3f4428f6    # -5.87f

    invoke-virtual {v2, v6, v7}, Lk/f;->C(FF)V

    invoke-virtual {v2, v5, v5}, Lk/f;->C(FF)V

    invoke-virtual {v2, v3, v4}, Lk/f;->B(FF)V

    invoke-virtual {v2}, Lk/f;->p()V

    iget-object v2, v2, Lk/f;->b:Ljava/lang/Object;

    check-cast v2, Ljava/util/ArrayList;

    invoke-static {v0, v2, v1}, Li1/e;->a(Li1/e;Ljava/util/ArrayList;Le1/n0;)V

    invoke-virtual {v0}, Li1/e;->b()Li1/f;

    move-result-object v0

    sput-object v0, Lo7/d0;->v:Li1/f;

    return-object v0
.end method

.method public static final H()Li1/f;
    .locals 12

    sget-object v0, Lo7/d0;->w:Li1/f;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v2, "Filled.Warning"

    const/4 v10, 0x0

    new-instance v0, Li1/e;

    const/high16 v3, 0x41c00000    # 24.0f

    const/high16 v4, 0x41c00000    # 24.0f

    const/high16 v5, 0x41c00000    # 24.0f

    const/high16 v6, 0x41c00000    # 24.0f

    const-wide/16 v7, 0x0

    const/4 v9, 0x0

    const/16 v11, 0x60

    move-object v1, v0

    invoke-direct/range {v1 .. v11}, Li1/e;-><init>(Ljava/lang/String;FFFFJIZI)V

    sget v1, Li1/h0;->a:I

    new-instance v1, Le1/n0;

    sget-wide v2, Le1/r;->b:J

    invoke-direct {v1, v2, v3}, Le1/n0;-><init>(J)V

    new-instance v2, Lk/f;

    const/4 v3, 0x7

    invoke-direct {v2, v3}, Lk/f;-><init>(I)V

    const/high16 v3, 0x3f800000    # 1.0f

    const/high16 v4, 0x41a80000    # 21.0f

    invoke-virtual {v2, v3, v4}, Lk/f;->D(FF)V

    const/high16 v5, 0x41b00000    # 22.0f

    invoke-virtual {v2, v5}, Lk/f;->A(F)V

    const/high16 v5, 0x41400000    # 12.0f

    const/high16 v6, 0x40000000    # 2.0f

    invoke-virtual {v2, v5, v6}, Lk/f;->B(FF)V

    invoke-virtual {v2, v3, v4}, Lk/f;->B(FF)V

    invoke-virtual {v2}, Lk/f;->p()V

    const/high16 v3, 0x41500000    # 13.0f

    const/high16 v4, 0x41900000    # 18.0f

    invoke-virtual {v2, v3, v4}, Lk/f;->D(FF)V

    const/high16 v4, -0x40000000    # -2.0f

    invoke-virtual {v2, v4}, Lk/f;->A(F)V

    invoke-virtual {v2, v4}, Lk/f;->K(F)V

    invoke-virtual {v2, v6}, Lk/f;->A(F)V

    invoke-virtual {v2, v6}, Lk/f;->K(F)V

    invoke-virtual {v2}, Lk/f;->p()V

    const/high16 v5, 0x41600000    # 14.0f

    invoke-virtual {v2, v3, v5}, Lk/f;->D(FF)V

    invoke-virtual {v2, v4}, Lk/f;->A(F)V

    const/high16 v3, -0x3f800000    # -4.0f

    invoke-virtual {v2, v3}, Lk/f;->K(F)V

    invoke-virtual {v2, v6}, Lk/f;->A(F)V

    const/high16 v3, 0x40800000    # 4.0f

    invoke-virtual {v2, v3}, Lk/f;->K(F)V

    invoke-virtual {v2}, Lk/f;->p()V

    iget-object v2, v2, Lk/f;->b:Ljava/lang/Object;

    check-cast v2, Ljava/util/ArrayList;

    invoke-static {v0, v2, v1}, Li1/e;->a(Li1/e;Ljava/util/ArrayList;Le1/n0;)V

    invoke-virtual {v0}, Li1/e;->b()Li1/f;

    move-result-object v0

    sput-object v0, Lo7/d0;->w:Li1/f;

    return-object v0
.end method

.method public static final M(Lq/g;Ljava/lang/Object;I)I
    .locals 4

    const-string v0, "<this>"

    invoke-static {p0, v0}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    iget v0, p0, Lq/g;->c:I

    if-nez v0, :cond_0

    const/4 p0, -0x1

    return p0

    :cond_0
    :try_start_0
    iget-object v1, p0, Lq/g;->a:[I

    iget v2, p0, Lq/g;->c:I

    invoke-static {v2, p2, v1}, Lr/a;->a(II[I)I

    move-result v1
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    if-gez v1, :cond_1

    return v1

    :cond_1
    iget-object v2, p0, Lq/g;->b:[Ljava/lang/Object;

    aget-object v2, v2, v1

    invoke-static {p1, v2}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    return v1

    :cond_2
    add-int/lit8 v2, v1, 0x1

    :goto_0
    if-ge v2, v0, :cond_4

    iget-object v3, p0, Lq/g;->a:[I

    aget v3, v3, v2

    if-ne v3, p2, :cond_4

    iget-object v3, p0, Lq/g;->b:[Ljava/lang/Object;

    aget-object v3, v3, v2

    invoke-static {p1, v3}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    return v2

    :cond_3
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_4
    add-int/lit8 v1, v1, -0x1

    :goto_1
    if-ltz v1, :cond_6

    iget-object v0, p0, Lq/g;->a:[I

    aget v0, v0, v1

    if-ne v0, p2, :cond_6

    iget-object v0, p0, Lq/g;->b:[Ljava/lang/Object;

    aget-object v0, v0, v1

    invoke-static {p1, v0}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    return v1

    :cond_5
    add-int/lit8 v1, v1, -0x1

    goto :goto_1

    :cond_6
    not-int p0, v2

    return p0

    :catch_0
    new-instance p0, Ljava/util/ConcurrentModificationException;

    invoke-direct {p0}, Ljava/util/ConcurrentModificationException;-><init>()V

    throw p0
.end method

.method public static final N(Landroid/content/Context;Ljava/io/File;)V
    .locals 0

    return-void
.end method

.method public static final O([F)[F
    .locals 24

    move-object/from16 v0, p0

    const/4 v1, 0x0

    aget v2, v0, v1

    const/4 v3, 0x3

    aget v4, v0, v3

    const/4 v5, 0x6

    aget v6, v0, v5

    const/4 v7, 0x1

    aget v8, v0, v7

    const/4 v9, 0x4

    aget v10, v0, v9

    const/4 v11, 0x7

    aget v12, v0, v11

    const/4 v13, 0x2

    aget v14, v0, v13

    const/4 v15, 0x5

    aget v16, v0, v15

    const/16 v17, 0x8

    aget v18, v0, v17

    mul-float v19, v10, v18

    mul-float v20, v12, v16

    sub-float v19, v19, v20

    mul-float v20, v12, v14

    mul-float v21, v8, v18

    sub-float v20, v20, v21

    mul-float v21, v8, v16

    mul-float v22, v10, v14

    sub-float v21, v21, v22

    mul-float v22, v2, v19

    mul-float v23, v4, v20

    add-float v23, v23, v22

    mul-float v22, v6, v21

    add-float v22, v22, v23

    array-length v0, v0

    new-array v0, v0, [F

    div-float v19, v19, v22

    aput v19, v0, v1

    div-float v20, v20, v22

    aput v20, v0, v7

    div-float v21, v21, v22

    aput v21, v0, v13

    mul-float v1, v6, v16

    mul-float v7, v4, v18

    sub-float/2addr v1, v7

    div-float v1, v1, v22

    aput v1, v0, v3

    mul-float v18, v18, v2

    mul-float v1, v6, v14

    sub-float v18, v18, v1

    div-float v18, v18, v22

    aput v18, v0, v9

    mul-float/2addr v14, v4

    mul-float v16, v16, v2

    sub-float v14, v14, v16

    div-float v14, v14, v22

    aput v14, v0, v15

    mul-float v1, v4, v12

    mul-float v3, v6, v10

    sub-float/2addr v1, v3

    div-float v1, v1, v22

    aput v1, v0, v5

    mul-float/2addr v6, v8

    mul-float/2addr v12, v2

    sub-float/2addr v6, v12

    div-float v6, v6, v22

    aput v6, v0, v11

    mul-float/2addr v2, v10

    mul-float/2addr v4, v8

    sub-float/2addr v2, v4

    div-float v2, v2, v22

    aput v2, v0, v17

    return-object v0
.end method

.method public static P()Z
    .locals 2

    const/4 v0, 0x0

    :try_start_0
    invoke-static {}, Lla/g;->f()Z

    move-result v1

    if-nez v1, :cond_0

    return v0

    :cond_0
    invoke-static {}, Lla/g;->c()I

    move-result v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    if-nez v1, :cond_1

    const/4 v0, 0x1

    :catch_0
    :cond_1
    return v0
.end method

.method public static R(I[B)J
    .locals 2

    aget-byte v0, p1, p0

    and-int/lit16 v0, v0, 0xff

    add-int/lit8 v1, p0, 0x1

    aget-byte v1, p1, v1

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x8

    or-int/2addr v0, v1

    add-int/lit8 v1, p0, 0x2

    aget-byte v1, p1, v1

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x10

    or-int/2addr v0, v1

    add-int/lit8 p0, p0, 0x3

    aget-byte p0, p1, p0

    and-int/lit16 p0, p0, 0xff

    shl-int/lit8 p0, p0, 0x18

    or-int/2addr p0, v0

    int-to-long p0, p0

    const-wide v0, 0xffffffffL

    and-long/2addr p0, v0

    return-wide p0
.end method

.method public static S(Lq6/m;)Lq6/m;
    .locals 1

    instance-of v0, p0, Lq6/o;

    if-nez v0, :cond_2

    instance-of v0, p0, Lq6/n;

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    instance-of v0, p0, Ljava/io/Serializable;

    if-eqz v0, :cond_1

    new-instance v0, Lq6/n;

    invoke-direct {v0, p0}, Lq6/n;-><init>(Lq6/m;)V

    goto :goto_0

    :cond_1
    new-instance v0, Lq6/o;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p0, v0, Lq6/o;->a:Lq6/m;

    :goto_0
    return-object v0

    :cond_2
    :goto_1
    return-object p0
.end method

.method public static final T([F[F)[F
    .locals 19

    const/16 v0, 0x9

    new-array v0, v0, [F

    const/4 v1, 0x0

    aget v2, p0, v1

    aget v3, p1, v1

    mul-float/2addr v2, v3

    const/4 v3, 0x3

    aget v4, p0, v3

    const/4 v5, 0x1

    aget v6, p1, v5

    mul-float v7, v4, v6

    add-float/2addr v7, v2

    const/4 v2, 0x6

    aget v8, p0, v2

    const/4 v9, 0x2

    aget v10, p1, v9

    mul-float v11, v8, v10

    add-float/2addr v11, v7

    aput v11, v0, v1

    aget v7, p0, v5

    aget v11, p1, v1

    mul-float/2addr v7, v11

    const/4 v12, 0x4

    aget v13, p0, v12

    mul-float/2addr v6, v13

    add-float/2addr v6, v7

    const/4 v7, 0x7

    aget v14, p0, v7

    mul-float v15, v14, v10

    add-float/2addr v15, v6

    aput v15, v0, v5

    aget v6, p0, v9

    mul-float/2addr v6, v11

    const/4 v11, 0x5

    aget v15, p0, v11

    aget v16, p1, v5

    mul-float v16, v16, v15

    add-float v16, v16, v6

    const/16 v6, 0x8

    aget v17, p0, v6

    mul-float v10, v10, v17

    add-float v10, v10, v16

    aput v10, v0, v9

    aget v1, p0, v1

    aget v10, p1, v3

    mul-float/2addr v10, v1

    aget v16, p1, v12

    mul-float v4, v4, v16

    add-float/2addr v4, v10

    aget v10, p1, v11

    mul-float v18, v8, v10

    add-float v18, v18, v4

    aput v18, v0, v3

    aget v4, p0, v5

    aget v5, p1, v3

    mul-float v18, v4, v5

    mul-float v13, v13, v16

    add-float v13, v13, v18

    mul-float v16, v14, v10

    add-float v16, v16, v13

    aput v16, v0, v12

    aget v9, p0, v9

    mul-float/2addr v5, v9

    aget v13, p1, v12

    mul-float/2addr v15, v13

    add-float/2addr v15, v5

    mul-float v10, v10, v17

    add-float/2addr v10, v15

    aput v10, v0, v11

    aget v5, p1, v2

    mul-float/2addr v1, v5

    aget v3, p0, v3

    aget v5, p1, v7

    mul-float/2addr v3, v5

    add-float/2addr v3, v1

    aget v1, p1, v6

    mul-float/2addr v8, v1

    add-float/2addr v8, v3

    aput v8, v0, v2

    aget v2, p1, v2

    mul-float/2addr v4, v2

    aget v3, p0, v12

    mul-float/2addr v3, v5

    add-float/2addr v3, v4

    mul-float/2addr v14, v1

    add-float/2addr v14, v3

    aput v14, v0, v7

    mul-float/2addr v9, v2

    aget v2, p0, v11

    aget v3, p1, v7

    mul-float/2addr v2, v3

    add-float/2addr v2, v9

    mul-float v17, v17, v1

    add-float v17, v17, v2

    aput v17, v0, v6

    return-object v0
.end method

.method public static final U([F[F)[F
    .locals 6

    const/16 v0, 0x9

    new-array v0, v0, [F

    const/4 v1, 0x0

    aget v2, p0, v1

    aget v3, p1, v1

    mul-float/2addr v2, v3

    aput v2, v0, v1

    const/4 v2, 0x1

    aget v3, p0, v2

    aget v4, p1, v2

    mul-float/2addr v3, v4

    aput v3, v0, v2

    const/4 v3, 0x2

    aget v4, p0, v3

    aget v5, p1, v3

    mul-float/2addr v4, v5

    aput v4, v0, v3

    aget v1, p0, v1

    const/4 v4, 0x3

    aget v5, p1, v4

    mul-float/2addr v5, v1

    aput v5, v0, v4

    aget v2, p0, v2

    const/4 v4, 0x4

    aget v5, p1, v4

    mul-float/2addr v5, v2

    aput v5, v0, v4

    aget p0, p0, v3

    const/4 v3, 0x5

    aget v4, p1, v3

    mul-float/2addr v4, p0

    aput v4, v0, v3

    const/4 v3, 0x6

    aget v4, p1, v3

    mul-float/2addr v1, v4

    aput v1, v0, v3

    const/4 v1, 0x7

    aget v3, p1, v1

    mul-float/2addr v2, v3

    aput v2, v0, v1

    const/16 v1, 0x8

    aget p1, p1, v1

    mul-float/2addr p0, p1

    aput p0, v0, v1

    return-object v0
.end method

.method public static final V([F[F)V
    .locals 8

    const/4 v0, 0x0

    aget v1, p1, v0

    const/4 v2, 0x1

    aget v3, p1, v2

    const/4 v4, 0x2

    aget v5, p1, v4

    aget v6, p0, v0

    mul-float/2addr v6, v1

    const/4 v7, 0x3

    aget v7, p0, v7

    mul-float/2addr v7, v3

    add-float/2addr v7, v6

    const/4 v6, 0x6

    aget v6, p0, v6

    mul-float/2addr v6, v5

    add-float/2addr v6, v7

    aput v6, p1, v0

    aget v0, p0, v2

    mul-float/2addr v0, v1

    const/4 v6, 0x4

    aget v6, p0, v6

    mul-float/2addr v6, v3

    add-float/2addr v6, v0

    const/4 v0, 0x7

    aget v0, p0, v0

    mul-float/2addr v0, v5

    add-float/2addr v0, v6

    aput v0, p1, v2

    aget v0, p0, v4

    mul-float/2addr v0, v1

    const/4 v1, 0x5

    aget v1, p0, v1

    mul-float/2addr v1, v3

    add-float/2addr v1, v0

    const/16 v0, 0x8

    aget p0, p0, v0

    mul-float/2addr p0, v5

    add-float/2addr p0, v1

    aput p0, p1, v4

    return-void
.end method

.method public static final W([FFFF)F
    .locals 1

    const/4 v0, 0x0

    aget v0, p0, v0

    mul-float/2addr v0, p1

    const/4 p1, 0x3

    aget p1, p0, p1

    mul-float/2addr p1, p2

    add-float/2addr p1, v0

    const/4 p2, 0x6

    aget p0, p0, p2

    mul-float/2addr p0, p3

    add-float/2addr p0, p1

    return p0
.end method

.method public static final X([FFFF)F
    .locals 1

    const/4 v0, 0x1

    aget v0, p0, v0

    mul-float/2addr v0, p1

    const/4 p1, 0x4

    aget p1, p0, p1

    mul-float/2addr p1, p2

    add-float/2addr p1, v0

    const/4 p2, 0x7

    aget p0, p0, p2

    mul-float/2addr p0, p3

    add-float/2addr p0, p1

    return p0
.end method

.method public static final Y([FFFF)F
    .locals 1

    const/4 v0, 0x2

    aget v0, p0, v0

    mul-float/2addr v0, p1

    const/4 p1, 0x5

    aget p1, p0, p1

    mul-float/2addr p1, p2

    add-float/2addr p1, v0

    const/16 p2, 0x8

    aget p0, p0, p2

    mul-float/2addr p0, p3

    add-float/2addr p0, p1

    return p0
.end method

.method public static final Z(I)Lm0/l1;
    .locals 1

    sget v0, Lm0/b;->b:I

    new-instance v0, Lm0/l1;

    invoke-direct {v0, p0}, Lm0/l1;-><init>(I)V

    return-object v0
.end method

.method public static final a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLc9/a;Lm0/m;II)V
    .locals 55

    move-object/from16 v6, p0

    move-object/from16 v7, p1

    move/from16 v8, p6

    const-string v0, "downloadUrl"

    invoke-static {v6, v0}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "pageUrl"

    invoke-static {v7, v0}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v5, p5

    check-cast v5, Lm0/q;

    const v0, 0x6da23c6c

    invoke-virtual {v5, v0}, Lm0/q;->a0(I)Lm0/q;

    and-int/lit8 v0, p7, 0x1

    if-eqz v0, :cond_0

    or-int/lit8 v0, v8, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v0, v8, 0xe

    if-nez v0, :cond_2

    invoke-virtual {v5, v6}, Lm0/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x4

    goto :goto_0

    :cond_1
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v8

    goto :goto_1

    :cond_2
    move v0, v8

    :goto_1
    and-int/lit8 v3, p7, 0x2

    if-eqz v3, :cond_3

    or-int/lit8 v0, v0, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v3, v8, 0x70

    if-nez v3, :cond_5

    invoke-virtual {v5, v7}, Lm0/q;->g(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    const/16 v3, 0x20

    goto :goto_2

    :cond_4
    const/16 v3, 0x10

    :goto_2
    or-int/2addr v0, v3

    :cond_5
    :goto_3
    and-int/lit8 v3, p7, 0x4

    if-eqz v3, :cond_7

    or-int/lit16 v0, v0, 0x180

    :cond_6
    move-object/from16 v9, p2

    goto :goto_5

    :cond_7
    and-int/lit16 v9, v8, 0x380

    if-nez v9, :cond_6

    move-object/from16 v9, p2

    invoke-virtual {v5, v9}, Lm0/q;->g(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_8

    const/16 v10, 0x100

    goto :goto_4

    :cond_8
    const/16 v10, 0x80

    :goto_4
    or-int/2addr v0, v10

    :goto_5
    and-int/lit8 v10, p7, 0x8

    if-eqz v10, :cond_a

    or-int/lit16 v0, v0, 0xc00

    :cond_9
    move/from16 v11, p3

    goto :goto_7

    :cond_a
    and-int/lit16 v11, v8, 0x1c00

    if-nez v11, :cond_9

    move/from16 v11, p3

    invoke-virtual {v5, v11}, Lm0/q;->h(Z)Z

    move-result v12

    if-eqz v12, :cond_b

    const/16 v12, 0x800

    goto :goto_6

    :cond_b
    const/16 v12, 0x400

    :goto_6
    or-int/2addr v0, v12

    :goto_7
    and-int/lit8 v12, p7, 0x10

    if-eqz v12, :cond_d

    or-int/lit16 v0, v0, 0x6000

    :cond_c
    move-object/from16 v13, p4

    :goto_8
    move/from16 v34, v0

    goto :goto_a

    :cond_d
    const v13, 0xe000

    and-int/2addr v13, v8

    if-nez v13, :cond_c

    move-object/from16 v13, p4

    invoke-virtual {v5, v13}, Lm0/q;->i(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_e

    const/16 v14, 0x4000

    goto :goto_9

    :cond_e
    const/16 v14, 0x2000

    :goto_9
    or-int/2addr v0, v14

    goto :goto_8

    :goto_a
    const v0, 0xb6db

    and-int v0, v34, v0

    const/16 v14, 0x2492

    if-ne v0, v14, :cond_10

    invoke-virtual {v5}, Lm0/q;->G()Z

    move-result v0

    if-nez v0, :cond_f

    goto :goto_b

    :cond_f
    invoke-virtual {v5}, Lm0/q;->U()V

    move-object v2, v5

    move-object v3, v7

    move-object v8, v9

    move v4, v11

    move-object v5, v13

    goto/16 :goto_1c

    :cond_10
    :goto_b
    if-eqz v3, :cond_11

    const-string v0, ""

    move-object v3, v0

    goto :goto_c

    :cond_11
    move-object v3, v9

    :goto_c
    const/4 v0, 0x0

    if-eqz v10, :cond_12

    move/from16 v35, v0

    goto :goto_d

    :cond_12
    move/from16 v35, v11

    :goto_d
    if-eqz v12, :cond_13

    sget-object v9, Ld5/v;->a:Ld5/v;

    move-object/from16 v36, v9

    goto :goto_e

    :cond_13
    move-object/from16 v36, v13

    :goto_e
    sget-object v9, Lu1/y0;->b:Lm0/m3;

    invoke-virtual {v5, v9}, Lm0/q;->m(Lm0/u1;)Ljava/lang/Object;

    move-result-object v9

    move-object v14, v9

    check-cast v14, Landroid/content/Context;

    const v9, -0x5663b320

    invoke-virtual {v5, v9}, Lm0/q;->Z(I)V

    invoke-virtual {v5}, Lm0/q;->P()Ljava/lang/Object;

    move-result-object v9

    sget-object v10, Lm0/l;->a:Lk0/y0;

    sget-object v11, Lm0/o3;->a:Lm0/o3;

    if-ne v9, v10, :cond_14

    sget-object v9, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v9, v11}, Ld7/t;->g0(Ljava/lang/Object;Lm0/z2;)Lm0/n1;

    move-result-object v9

    invoke-virtual {v5, v9}, Lm0/q;->l0(Ljava/lang/Object;)V

    :cond_14
    move-object v13, v9

    check-cast v13, Lm0/g1;

    const v9, -0x5663b2e1

    invoke-static {v5, v0, v9}, Ll/q;->f(Lm0/q;ZI)Ljava/lang/Object;

    move-result-object v9

    const/4 v12, 0x0

    if-ne v9, v10, :cond_15

    invoke-static {v12}, Lm9/e0;->H(F)Lm0/k1;

    move-result-object v9

    invoke-virtual {v5, v9}, Lm0/q;->l0(Ljava/lang/Object;)V

    :cond_15
    check-cast v9, Lm0/d1;

    const v12, -0x5663b2a0

    invoke-static {v5, v0, v12}, Ll/q;->f(Lm0/q;ZI)Ljava/lang/Object;

    move-result-object v12

    if-ne v12, v10, :cond_16

    sget-object v12, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v12, v11}, Ld7/t;->g0(Ljava/lang/Object;Lm0/z2;)Lm0/n1;

    move-result-object v12

    invoke-virtual {v5, v12}, Lm0/q;->l0(Ljava/lang/Object;)V

    :cond_16
    check-cast v12, Lm0/g1;

    const v15, -0x5663b267

    invoke-static {v5, v0, v15}, Ll/q;->f(Lm0/q;ZI)Ljava/lang/Object;

    move-result-object v15

    if-ne v15, v10, :cond_17

    sget v15, Lm0/b;->b:I

    new-instance v15, Lm0/m1;

    const-wide/16 v1, -0x1

    invoke-direct {v15, v1, v2}, Lm0/m1;-><init>(J)V

    invoke-virtual {v5, v15}, Lm0/q;->l0(Ljava/lang/Object;)V

    :cond_17
    move-object/from16 v37, v15

    check-cast v37, Lm0/f1;

    const v1, -0x5663b228

    invoke-static {v5, v0, v1}, Ll/q;->f(Lm0/q;ZI)Ljava/lang/Object;

    move-result-object v1

    const/4 v2, 0x0

    if-ne v1, v10, :cond_18

    invoke-static {v2, v11}, Ld7/t;->g0(Ljava/lang/Object;Lm0/z2;)Lm0/n1;

    move-result-object v1

    invoke-virtual {v5, v1}, Lm0/q;->l0(Ljava/lang/Object;)V

    :cond_18
    check-cast v1, Lm0/g1;

    invoke-virtual {v5, v0}, Lm0/q;->t(Z)V

    const-string v10, "pulse"

    invoke-static {v10, v5, v0}, Lt/e;->q(Ljava/lang/String;Lm0/m;I)Lt/p0;

    move-result-object v10

    const/high16 v11, 0x3f800000    # 1.0f

    sget-object v4, Lt/c0;->b:Lt/w;

    const/16 v2, 0x320

    const/4 v15, 0x2

    invoke-static {v2, v0, v4, v15}, Lt/e;->s(IILt/a0;I)Lt/w1;

    move-result-object v2

    const/4 v4, 0x4

    invoke-static {v2, v15, v4}, Lt/e;->p(Lt/z;II)Lt/j0;

    move-result-object v2

    const-string v4, "pulseScale"

    const/16 v15, 0x71b8

    const/16 v16, 0x0

    move-object/from16 v39, v9

    move-object v9, v10

    move v10, v11

    const v11, 0x3f933333    # 1.15f

    move-object/from16 p2, v12

    move-object v12, v2

    move-object v2, v13

    move-object v13, v4

    move-object v4, v14

    move-object v14, v5

    invoke-static/range {v9 .. v16}, Lt/e;->f(Lt/p0;FFLt/j0;Ljava/lang/String;Lm0/m;II)Lt/k0;

    move-result-object v9

    move-object/from16 v10, v37

    check-cast v10, Lm0/w2;

    invoke-virtual {v10}, Lm0/w2;->d()J

    move-result-wide v11

    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v11

    new-instance v12, Ly/r;

    const/16 v23, 0x1

    move-object/from16 v16, v12

    move-object/from16 v17, v4

    move-object/from16 v18, v37

    move-object/from16 v19, v2

    move-object/from16 v20, p2

    move-object/from16 v21, v39

    move-object/from16 v22, v1

    invoke-direct/range {v16 .. v23}, Ly/r;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-static {v11, v12, v5}, Lm0/s;->a(Ljava/lang/Object;Lc9/c;Lm0/m;)V

    invoke-interface {v2}, Lm0/l3;->getValue()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/Boolean;

    invoke-virtual {v11}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v11

    invoke-static {v11}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v11

    invoke-virtual {v10}, Lm0/w2;->d()J

    move-result-wide v12

    invoke-static {v12, v13}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v10

    new-instance v12, Ld5/x;

    const/16 v23, 0x0

    move-object/from16 v16, v12

    move-object/from16 v17, v4

    move-object/from16 v18, v2

    move-object/from16 v19, v37

    move-object/from16 v20, v39

    move-object/from16 v21, p2

    move-object/from16 v22, v1

    invoke-direct/range {v16 .. v23}, Ld5/x;-><init>(Landroid/content/Context;Lm0/g1;Lm0/f1;Lm0/d1;Lm0/g1;Lm0/g1;Lu8/e;)V

    invoke-static {v11, v10, v12, v5}, Lm0/s;->c(Ljava/lang/Object;Ljava/lang/Object;Lc9/e;Lm0/m;)V

    sget-object v15, Ly0/l;->b:Ly0/l;

    sget-object v10, Landroidx/compose/foundation/layout/c;->b:Landroidx/compose/foundation/layout/FillElement;

    const-wide v11, 0xff050a18L

    invoke-static {v11, v12}, Landroidx/compose/ui/graphics/a;->c(J)J

    move-result-wide v13

    new-instance v0, Le1/r;

    invoke-direct {v0, v13, v14}, Le1/r;-><init>(J)V

    const-wide v13, 0xff0a1940L

    invoke-static {v13, v14}, Landroidx/compose/ui/graphics/a;->c(J)J

    move-result-wide v13

    new-instance v11, Le1/r;

    invoke-direct {v11, v13, v14}, Le1/r;-><init>(J)V

    const-wide v12, 0xff0f1b35L

    invoke-static {v12, v13}, Landroidx/compose/ui/graphics/a;->c(J)J

    move-result-wide v12

    new-instance v14, Le1/r;

    invoke-direct {v14, v12, v13}, Le1/r;-><init>(J)V

    const-wide v12, 0xff050a18L

    invoke-static {v12, v13}, Landroidx/compose/ui/graphics/a;->c(J)J

    move-result-wide v12

    move-object/from16 p4, v4

    new-instance v4, Le1/r;

    invoke-direct {v4, v12, v13}, Le1/r;-><init>(J)V

    filled-new-array {v0, v11, v14, v4}, [Le1/r;

    move-result-object v0

    invoke-static {v0}, Ld7/t;->e0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, La4/q;->n(Ljava/util/List;)Le1/z;

    move-result-object v0

    const/4 v4, 0x6

    const/4 v11, 0x0

    invoke-static {v10, v0, v11, v4}, Landroidx/compose/foundation/a;->d(Ly0/o;Le1/j0;Le0/e;I)Ly0/o;

    move-result-object v0

    sget-object v10, Ly0/a;->c:Ly0/g;

    const v11, 0x2bb5b5d7

    invoke-virtual {v5, v11}, Lm0/q;->Z(I)V

    const/4 v12, 0x0

    invoke-static {v10, v12, v5}, Ly/p;->c(Ly0/g;ZLm0/m;)Lr1/j0;

    move-result-object v13

    const v12, -0x4ee9b9da

    invoke-virtual {v5, v12}, Lm0/q;->Z(I)V

    iget v14, v5, Lm0/q;->P:I

    invoke-virtual {v5}, Lm0/q;->p()Lm0/r1;

    move-result-object v11

    sget-object v17, Lt1/l;->k:Lt1/k;

    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v4, Lt1/k;->b:Lt1/j;

    invoke-static {v0}, Landroidx/compose/ui/layout/a;->i(Ly0/o;)Lu0/b;

    move-result-object v0

    iget-object v12, v5, Lm0/q;->a:Lm0/d;

    instance-of v12, v12, Lm0/d;

    if-eqz v12, :cond_2d

    invoke-virtual {v5}, Lm0/q;->c0()V

    iget-boolean v6, v5, Lm0/q;->O:Z

    if-eqz v6, :cond_19

    invoke-virtual {v5, v4}, Lm0/q;->o(Lc9/a;)V

    goto :goto_f

    :cond_19
    invoke-virtual {v5}, Lm0/q;->o0()V

    :goto_f
    sget-object v6, Lt1/k;->e:Lt1/i;

    invoke-static {v5, v13, v6}, Ld7/t;->s0(Lm0/m;Ljava/lang/Object;Lc9/e;)V

    sget-object v13, Lt1/k;->d:Lt1/i;

    invoke-static {v5, v11, v13}, Ld7/t;->s0(Lm0/m;Ljava/lang/Object;Lc9/e;)V

    sget-object v11, Lt1/k;->f:Lt1/i;

    iget-boolean v8, v5, Lm0/q;->O:Z

    if-nez v8, :cond_1a

    invoke-virtual {v5}, Lm0/q;->P()Ljava/lang/Object;

    move-result-object v8

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v8, v7}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_1b

    :cond_1a
    invoke-static {v14, v5, v14, v11}, Ll/q;->r(ILm0/q;ILt1/i;)V

    :cond_1b
    new-instance v7, Lm0/l2;

    invoke-direct {v7, v5}, Lm0/l2;-><init>(Lm0/m;)V

    const v8, 0x7ab4aae9

    const/4 v14, 0x0

    invoke-static {v14, v0, v7, v5, v8}, Ll/q;->s(ILu0/b;Lm0/l2;Lm0/q;I)V

    sget-object v7, Landroidx/compose/foundation/layout/c;->a:Landroidx/compose/foundation/layout/FillElement;

    invoke-static {v5}, Landroidx/compose/foundation/a;->l(Lm0/m;)Lu/p2;

    move-result-object v0

    invoke-static {v7, v0}, Landroidx/compose/foundation/a;->n(Ly0/o;Lu/p2;)Ly0/o;

    move-result-object v0

    const/16 v14, 0x20

    int-to-float v14, v14

    move-object/from16 v40, v1

    const/4 v1, 0x0

    const/4 v8, 0x2

    invoke-static {v0, v14, v1, v8}, Landroidx/compose/foundation/layout/a;->n(Ly0/o;FFI)Ly0/o;

    move-result-object v0

    sget-object v8, Ly0/a;->p:Ly0/e;

    const v1, -0x1cd0f17e

    invoke-virtual {v5, v1}, Lm0/q;->Z(I)V

    sget-object v1, Ly/k;->c:Ly/e;

    invoke-static {v1, v8, v5}, Ly/u;->a(Ly/i;Ly0/e;Lm0/m;)Lr1/j0;

    move-result-object v1

    const v8, -0x4ee9b9da

    invoke-virtual {v5, v8}, Lm0/q;->Z(I)V

    iget v8, v5, Lm0/q;->P:I

    move/from16 v20, v14

    invoke-virtual {v5}, Lm0/q;->p()Lm0/r1;

    move-result-object v14

    invoke-static {v0}, Landroidx/compose/ui/layout/a;->i(Ly0/o;)Lu0/b;

    move-result-object v0

    if-eqz v12, :cond_2c

    invoke-virtual {v5}, Lm0/q;->c0()V

    move-object/from16 v41, v2

    iget-boolean v2, v5, Lm0/q;->O:Z

    if-eqz v2, :cond_1c

    invoke-virtual {v5, v4}, Lm0/q;->o(Lc9/a;)V

    goto :goto_10

    :cond_1c
    invoke-virtual {v5}, Lm0/q;->o0()V

    :goto_10
    invoke-static {v5, v1, v6}, Ld7/t;->s0(Lm0/m;Ljava/lang/Object;Lc9/e;)V

    invoke-static {v5, v14, v13}, Ld7/t;->s0(Lm0/m;Ljava/lang/Object;Lc9/e;)V

    iget-boolean v1, v5, Lm0/q;->O:Z

    if-nez v1, :cond_1d

    invoke-virtual {v5}, Lm0/q;->P()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v1, v2}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1e

    :cond_1d
    invoke-static {v8, v5, v8, v11}, Ll/q;->r(ILm0/q;ILt1/i;)V

    :cond_1e
    new-instance v1, Lm0/l2;

    invoke-direct {v1, v5}, Lm0/l2;-><init>(Lm0/m;)V

    const/4 v2, 0x0

    const v8, 0x7ab4aae9

    invoke-static {v2, v0, v1, v5, v8}, Ll/q;->s(ILu0/b;Lm0/l2;Lm0/q;I)V

    const/16 v0, 0x64

    int-to-float v0, v0

    invoke-static {v15, v0}, Landroidx/compose/foundation/layout/c;->h(Ly0/o;F)Ly0/o;

    move-result-object v0

    iget-object v1, v9, Lt/k0;->d:Lm0/n1;

    invoke-virtual {v1}, Lm0/y2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    move-result v1

    invoke-static {v0, v1}, Landroidx/compose/ui/draw/a;->h(Ly0/o;F)Ly0/o;

    move-result-object v0

    sget-object v1, Le0/f;->a:Le0/e;

    invoke-static {v0, v1}, Landroidx/compose/ui/draw/a;->b(Ly0/o;Le1/l0;)Ly0/o;

    move-result-object v0

    sget-wide v1, Le5/a;->a:J

    const v8, 0x3e99999a    # 0.3f

    invoke-static {v1, v2, v8}, Le1/r;->b(JF)J

    move-result-wide v8

    new-instance v14, Le1/r;

    invoke-direct {v14, v8, v9}, Le1/r;-><init>(J)V

    const v8, 0x3d4ccccd    # 0.05f

    invoke-static {v1, v2, v8}, Le1/r;->b(JF)J

    move-result-wide v8

    move-object/from16 v42, v3

    new-instance v3, Le1/r;

    invoke-direct {v3, v8, v9}, Le1/r;-><init>(J)V

    filled-new-array {v14, v3}, [Le1/r;

    move-result-object v3

    invoke-static {v3}, Ld7/t;->e0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    const/16 v8, 0xe

    const/4 v9, 0x0

    invoke-static {v3, v9, v8}, La4/q;->j(Ljava/util/List;FI)Le1/e0;

    move-result-object v3

    const/4 v9, 0x0

    const/4 v14, 0x6

    invoke-static {v0, v3, v9, v14}, Landroidx/compose/foundation/a;->d(Ly0/o;Le1/j0;Le0/e;I)Ly0/o;

    move-result-object v0

    const v3, 0x2bb5b5d7

    invoke-virtual {v5, v3}, Lm0/q;->Z(I)V

    const/4 v3, 0x0

    invoke-static {v10, v3, v5}, Ly/p;->c(Ly0/g;ZLm0/m;)Lr1/j0;

    move-result-object v9

    const v3, -0x4ee9b9da

    invoke-virtual {v5, v3}, Lm0/q;->Z(I)V

    iget v3, v5, Lm0/q;->P:I

    invoke-virtual {v5}, Lm0/q;->p()Lm0/r1;

    move-result-object v10

    invoke-static {v0}, Landroidx/compose/ui/layout/a;->i(Ly0/o;)Lu0/b;

    move-result-object v0

    if-eqz v12, :cond_2b

    invoke-virtual {v5}, Lm0/q;->c0()V

    iget-boolean v12, v5, Lm0/q;->O:Z

    if-eqz v12, :cond_1f

    invoke-virtual {v5, v4}, Lm0/q;->o(Lc9/a;)V

    goto :goto_11

    :cond_1f
    invoke-virtual {v5}, Lm0/q;->o0()V

    :goto_11
    invoke-static {v5, v9, v6}, Ld7/t;->s0(Lm0/m;Ljava/lang/Object;Lc9/e;)V

    invoke-static {v5, v10, v13}, Ld7/t;->s0(Lm0/m;Ljava/lang/Object;Lc9/e;)V

    iget-boolean v4, v5, Lm0/q;->O:Z

    if-nez v4, :cond_20

    invoke-virtual {v5}, Lm0/q;->P()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v4, v6}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_21

    :cond_20
    invoke-static {v3, v5, v3, v11}, Ll/q;->r(ILm0/q;ILt1/i;)V

    :cond_21
    new-instance v3, Lm0/l2;

    invoke-direct {v3, v5}, Lm0/l2;-><init>(Lm0/m;)V

    const/4 v4, 0x0

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-virtual {v0, v3, v5, v6}, Lu0/b;->e(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x7ab4aae9

    invoke-virtual {v5, v0}, Lm0/q;->Z(I)V

    invoke-static {}, Lz6/a;->K()Li1/f;

    move-result-object v9

    const-string v10, "Update"

    const/16 v0, 0x30

    int-to-float v6, v0

    invoke-static {v15, v6}, Landroidx/compose/foundation/layout/c;->h(Ly0/o;F)Ly0/o;

    move-result-object v11

    const/16 v0, 0xdb0

    const/16 v16, 0x0

    move-wide v12, v1

    move/from16 v3, v20

    move-object v14, v5

    move-object v4, v15

    move v15, v0

    invoke-static/range {v9 .. v16}, Lk0/e1;->b(Li1/f;Ljava/lang/String;Ly0/o;JLm0/m;II)V

    const/4 v0, 0x1

    const/4 v9, 0x0

    invoke-static {v5, v9, v0, v9, v9}, Ll/q;->v(Lm0/q;ZZZZ)V

    const/16 v9, 0x1a

    invoke-static {v4, v3, v5, v9}, Ll/q;->d(Ly0/l;FLm0/q;I)J

    move-result-wide v13

    sget-object v16, Lf2/l;->f:Lf2/l;

    sget-wide v11, Le5/a;->l:J

    const-string v9, "Update Required"

    const/4 v10, 0x0

    const/4 v15, 0x0

    const/16 v17, 0x0

    const-wide/16 v18, 0x0

    const/16 v20, 0x0

    new-instance v3, Ll2/i;

    move-wide/from16 v43, v1

    const/4 v2, 0x3

    invoke-direct {v3, v2}, Ll2/i;-><init>(I)V

    const-wide/16 v22, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const v31, 0x30d86

    const/16 v32, 0x0

    const v33, 0x1fdd2

    move-object/from16 v21, v3

    move-object/from16 v30, v5

    invoke-static/range {v9 .. v33}, Lk0/c5;->b(Ljava/lang/String;Ly0/o;JJLf2/j;Lf2/l;Lf2/e;JLl2/j;Ll2/i;JIZIILc9/c;La2/c0;Lm0/m;III)V

    const/16 v3, 0xc

    int-to-float v1, v3

    invoke-static {v4, v1, v5, v8}, Ll/q;->d(Ly0/l;FLm0/q;I)J

    move-result-wide v13

    sget-wide v45, Le5/a;->m:J

    const/16 v9, 0x16

    invoke-static {v9}, Lo1/s;->N(I)J

    move-result-wide v22

    const-string v9, "A new version of AcceptPro is available.\nPlease update to continue using the app."

    const/4 v10, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const-wide/16 v18, 0x0

    const/16 v20, 0x0

    new-instance v11, Ll2/i;

    invoke-direct {v11, v2}, Ll2/i;-><init>(I)V

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v31, 0xd86

    const/16 v32, 0x6

    const v33, 0x1f9f2

    move-object/from16 v21, v11

    move-wide/from16 v11, v45

    move-object/from16 v30, v5

    invoke-static/range {v9 .. v33}, Lk0/c5;->b(Ljava/lang/String;Ly0/o;JJLf2/j;Lf2/l;Lf2/e;JLl2/j;Ll2/i;JIZIILc9/c;La2/c0;Lm0/m;III)V

    const/16 v15, 0x8

    int-to-float v14, v15

    invoke-static {v4, v14}, Landroidx/compose/foundation/layout/c;->c(Ly0/o;F)Ly0/o;

    move-result-object v9

    invoke-static {v9, v5}, Landroidx/compose/foundation/layout/a;->c(Ly0/o;Lm0/m;)V

    sget-wide v12, Le5/a;->h:J

    const/4 v9, 0x6

    invoke-static {v12, v13, v5, v9}, Lk0/t0;->d(JLm0/m;I)Lk0/g0;

    move-result-object v11

    invoke-static {v1}, Le0/f;->a(F)Le0/e;

    move-result-object v10

    const/16 v16, 0x0

    const/16 v17, 0x0

    sget-object v18, Ld5/p;->a:Lu0/b;

    const v19, 0x30006

    const/16 v20, 0x18

    move-object v9, v7

    move-wide v2, v12

    move-object/from16 v12, v16

    move-object/from16 v13, v17

    move/from16 v47, v14

    move-object/from16 v14, v18

    move-object v15, v5

    move/from16 v16, v19

    move/from16 v17, v20

    invoke-static/range {v9 .. v17}, Lf6/a;->a(Ly0/o;Le1/l0;Lk0/g0;Lk0/h0;Lu/w;Lc9/f;Lm0/m;II)V

    const/16 v9, 0x10

    int-to-float v15, v9

    invoke-static {v4, v15}, Landroidx/compose/foundation/layout/c;->c(Ly0/o;F)Ly0/o;

    move-result-object v9

    invoke-static {v9, v5}, Landroidx/compose/foundation/layout/a;->c(Ly0/o;Lm0/m;)V

    const v9, 0x3b135327

    invoke-virtual {v5, v9}, Lm0/q;->Z(I)V

    invoke-virtual/range {v42 .. v42}, Ljava/lang/String;->length()I

    move-result v9

    if-lez v9, :cond_22

    const/4 v9, 0x6

    invoke-static {v2, v3, v5, v9}, Lk0/t0;->d(JLm0/m;I)Lk0/g0;

    move-result-object v11

    invoke-static {v1}, Le0/f;->a(F)Le0/e;

    move-result-object v10

    const/4 v12, 0x0

    const/4 v13, 0x0

    new-instance v9, Ld5/b;

    move-object/from16 v8, v42

    const/4 v14, 0x2

    invoke-direct {v9, v8, v14}, Ld5/b;-><init>(Ljava/lang/String;I)V

    const v14, -0x4b76eefd

    invoke-static {v5, v14, v9}, Ld7/t;->K(Lm0/m;ILd9/j;)Lu0/b;

    move-result-object v14

    const v16, 0x30006

    const/16 v17, 0x18

    move-object v9, v7

    move v0, v15

    move-object v15, v5

    invoke-static/range {v9 .. v17}, Lf6/a;->a(Ly0/o;Le1/l0;Lk0/g0;Lk0/h0;Lu/w;Lc9/f;Lm0/m;II)V

    :goto_12
    const/4 v9, 0x0

    goto :goto_13

    :cond_22
    move v0, v15

    move-object/from16 v8, v42

    goto :goto_12

    :goto_13
    invoke-virtual {v5, v9}, Lm0/q;->t(Z)V

    const/16 v9, 0x18

    int-to-float v9, v9

    invoke-static {v4, v9}, Landroidx/compose/foundation/layout/c;->c(Ly0/o;F)Ly0/o;

    move-result-object v9

    invoke-static {v9, v5}, Landroidx/compose/foundation/layout/a;->c(Ly0/o;Lm0/m;)V

    const v9, 0x3b135796

    invoke-virtual {v5, v9}, Lm0/q;->Z(I)V

    invoke-interface/range {v41 .. v41}, Lm0/l3;->getValue()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/Boolean;

    invoke-virtual {v9}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v9

    if-nez v9, :cond_23

    invoke-interface/range {p2 .. p2}, Lm0/l3;->getValue()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/Boolean;

    invoke-virtual {v9}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v9

    if-eqz v9, :cond_24

    :cond_23
    const/4 v9, 0x6

    goto :goto_15

    :cond_24
    move-object/from16 v22, p2

    move-object/from16 v23, v39

    :goto_14
    const/4 v0, 0x0

    goto :goto_16

    :goto_15
    invoke-static {v2, v3, v5, v9}, Lk0/t0;->d(JLm0/m;I)Lk0/g0;

    move-result-object v11

    invoke-static {v1}, Le0/f;->a(F)Le0/e;

    move-result-object v10

    const/4 v12, 0x0

    const/4 v13, 0x0

    new-instance v2, Lu/l1;

    const/4 v3, 0x5

    move-object/from16 v14, p2

    move-object/from16 v15, v39

    invoke-direct {v2, v3, v14, v15}, Lu/l1;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const v3, -0x4dd8d7d4

    invoke-static {v5, v3, v2}, Ld7/t;->K(Lm0/m;ILd9/j;)Lu0/b;

    move-result-object v2

    const v16, 0x30006

    const/16 v17, 0x18

    move-object v9, v7

    move-object/from16 v22, v14

    move-object v14, v2

    move-object/from16 v23, v15

    move-object v15, v5

    invoke-static/range {v9 .. v17}, Lf6/a;->a(Ly0/o;Le1/l0;Lk0/g0;Lk0/h0;Lu/w;Lc9/f;Lm0/m;II)V

    invoke-static {v4, v0}, Landroidx/compose/foundation/layout/c;->c(Ly0/o;F)Ly0/o;

    move-result-object v0

    invoke-static {v0, v5}, Landroidx/compose/foundation/layout/a;->c(Ly0/o;Lm0/m;)V

    goto :goto_14

    :goto_16
    invoke-virtual {v5, v0}, Lm0/q;->t(Z)V

    const v2, 0x3b135f1b

    invoke-virtual {v5, v2}, Lm0/q;->Z(I)V

    invoke-interface/range {v22 .. v22}, Lm0/l3;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    const/16 v15, 0x34

    if-eqz v2, :cond_25

    invoke-interface/range {v40 .. v40}, Lm0/l3;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/io/File;

    if-eqz v2, :cond_25

    int-to-float v2, v15

    invoke-static {v7, v2}, Landroidx/compose/foundation/layout/c;->c(Ly0/o;F)Ly0/o;

    move-result-object v10

    sget-object v2, Lk0/z;->a:Ly/u0;

    sget-wide v2, Le5/a;->o:J

    const-wide/16 v11, 0x0

    const/16 v9, 0xe

    move v14, v0

    move/from16 v50, v1

    move-object/from16 v13, v40

    move-wide/from16 v48, v43

    const/4 v15, 0x1

    move-wide v0, v2

    const/16 v38, 0xc

    move-wide v2, v11

    move-object/from16 v12, p4

    move-object v11, v4

    move-object v4, v5

    move-object/from16 p3, v5

    move v5, v9

    invoke-static/range {v0 .. v5}, Lk0/z;->a(JJLm0/m;I)Lk0/y;

    move-result-object v0

    const/16 v1, 0xe

    int-to-float v2, v1

    invoke-static {v2}, Le0/f;->a(F)Le0/e;

    move-result-object v1

    new-instance v9, Lc5/p;

    invoke-direct {v9, v12, v13, v15}, Lc5/p;-><init>(Landroid/content/Context;Lm0/g1;I)V

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    sget-object v18, Ld5/p;->b:Lu0/b;

    const v20, 0x30000030

    const/16 v21, 0x1e4

    move-object v5, v11

    move v11, v2

    move-object v2, v12

    move-object v12, v1

    move-object v13, v0

    move v0, v14

    move-object v14, v3

    move v3, v15

    const/16 v1, 0x34

    move-object v15, v4

    move-object/from16 v19, p3

    invoke-static/range {v9 .. v21}, Lm9/e0;->d(Lc9/a;Ly0/o;ZLe1/l0;Lk0/y;Lk0/d0;Lu/w;Ly/t0;Lx/m;Lc9/f;Lm0/m;II)V

    move/from16 v15, v50

    invoke-static {v5, v15}, Landroidx/compose/foundation/layout/c;->c(Ly0/o;F)Ly0/o;

    move-result-object v4

    move-object/from16 v14, p3

    invoke-static {v4, v14}, Landroidx/compose/foundation/layout/a;->c(Ly0/o;Lm0/m;)V

    goto :goto_17

    :cond_25
    move-object/from16 v2, p4

    move-object v14, v5

    move-wide/from16 v48, v43

    const/4 v3, 0x1

    const/16 v38, 0xc

    move-object v5, v4

    move/from16 v54, v15

    move v15, v1

    move/from16 v1, v54

    :goto_17
    invoke-virtual {v14, v0}, Lm0/q;->t(Z)V

    const v4, 0x3b1362d2

    invoke-virtual {v14, v4}, Lm0/q;->Z(I)V

    invoke-interface/range {v22 .. v22}, Lm0/l3;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Boolean;

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    if-nez v4, :cond_26

    invoke-virtual/range {p0 .. p0}, Ljava/lang/String;->length()I

    move-result v4

    if-lez v4, :cond_26

    int-to-float v1, v1

    invoke-static {v7, v1}, Landroidx/compose/foundation/layout/c;->c(Ly0/o;F)Ly0/o;

    move-result-object v10

    sget-object v1, Lk0/z;->a:Ly/u0;

    const/high16 v1, 0x3f000000    # 0.5f

    move-wide/from16 v12, v48

    invoke-static {v12, v13, v1}, Le1/r;->b(JF)J

    move-result-wide v16

    const/16 v9, 0xa

    move v11, v0

    move-wide v0, v12

    move-object v4, v2

    move/from16 v50, v15

    move v15, v3

    move-wide/from16 v2, v16

    move-object/from16 p4, v4

    move-object v4, v14

    move-object/from16 v51, v5

    move v5, v9

    invoke-static/range {v0 .. v5}, Lk0/z;->a(JJLm0/m;I)Lk0/y;

    move-result-object v16

    const/16 v0, 0xe

    int-to-float v1, v0

    invoke-static {v1}, Le0/f;->a(F)Le0/e;

    move-result-object v17

    invoke-interface/range {v41 .. v41}, Lm0/l3;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    xor-int/lit8 v18, v0, 0x1

    new-instance v9, Lo2/f;

    move-object v0, v9

    move-object/from16 v1, p4

    move-object/from16 v2, p0

    move-object/from16 v3, v41

    move-object/from16 v4, v23

    move-object/from16 v5, v37

    invoke-direct/range {v0 .. v5}, Lo2/f;-><init>(Landroid/content/Context;Ljava/lang/String;Lm0/g1;Lm0/d1;Lm0/f1;)V

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    new-instance v4, Ls/h;

    move-object/from16 v5, v41

    const/16 v11, 0x8

    invoke-direct {v4, v5, v11}, Ls/h;-><init>(Ljava/lang/Object;I)V

    const v5, 0x23bc0f2c

    invoke-static {v14, v5, v4}, Ld7/t;->K(Lm0/m;ILd9/j;)Lu0/b;

    move-result-object v4

    const v20, 0x30000030

    const/16 v21, 0x1e0

    const/4 v5, 0x0

    move/from16 v11, v18

    move-wide/from16 v52, v12

    move-object/from16 v12, v17

    move-object/from16 v13, v16

    move-object/from16 p3, v14

    move-object v14, v0

    move/from16 v0, v50

    move-object v15, v1

    move-object/from16 v16, v2

    move-object/from16 v17, v3

    move-object/from16 v18, v4

    move-object/from16 v19, p3

    invoke-static/range {v9 .. v21}, Lm9/e0;->d(Lc9/a;Ly0/o;ZLe1/l0;Lk0/y;Lk0/d0;Lu/w;Ly/t0;Lx/m;Lc9/f;Lm0/m;II)V

    move-object/from16 v1, v51

    invoke-static {v1, v0}, Landroidx/compose/foundation/layout/c;->c(Ly0/o;F)Ly0/o;

    move-result-object v0

    move-object/from16 v2, p3

    invoke-static {v0, v2}, Landroidx/compose/foundation/layout/a;->c(Ly0/o;Lm0/m;)V

    goto :goto_18

    :cond_26
    move-object/from16 p4, v2

    move-object v1, v5

    move-object v2, v14

    move-wide/from16 v52, v48

    move v5, v0

    :goto_18
    invoke-virtual {v2, v5}, Lm0/q;->t(Z)V

    const v0, 0x3b136b02

    invoke-virtual {v2, v0}, Lm0/q;->Z(I)V

    invoke-virtual/range {p1 .. p1}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_27

    new-instance v9, Lu/r0;

    const/16 v0, 0x11

    move-object/from16 v3, p1

    move-object/from16 v4, p4

    invoke-direct {v9, v0, v3, v4}, Lu/r0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v7, v6}, Landroidx/compose/foundation/layout/c;->c(Ly0/o;F)Ly0/o;

    move-result-object v10

    const/4 v11, 0x0

    const/16 v0, 0xe

    int-to-float v4, v0

    invoke-static {v4}, Le0/f;->a(F)Le0/e;

    move-result-object v12

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-static {v2}, Lk0/z;->f(Lm0/m;)Lu/w;

    move-result-object v0

    new-instance v4, Le1/r;

    move-wide/from16 v5, v52

    invoke-direct {v4, v5, v6}, Le1/r;-><init>(J)V

    sget-wide v5, Le5/a;->d:J

    new-instance v15, Le1/r;

    invoke-direct {v15, v5, v6}, Le1/r;-><init>(J)V

    filled-new-array {v4, v15}, [Le1/r;

    move-result-object v4

    invoke-static {v4}, Ld7/t;->e0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    invoke-static {v4}, La4/q;->i(Ljava/util/List;)Le1/z;

    move-result-object v4

    new-instance v15, Lu/w;

    iget v0, v0, Lu/w;->a:F

    invoke-direct {v15, v0, v4}, Lu/w;-><init>(FLe1/n;)V

    const/16 v16, 0x0

    const/16 v17, 0x0

    sget-object v18, Ld5/p;->c:Lu0/b;

    const v20, 0x30000030

    const/16 v21, 0x1b4

    move-object/from16 v19, v2

    invoke-static/range {v9 .. v21}, Lm9/e0;->g(Lc9/a;Ly0/o;ZLe1/l0;Lk0/y;Lk0/d0;Lu/w;Ly/t0;Lx/m;Lc9/f;Lm0/m;II)V

    const/4 v0, 0x0

    goto :goto_19

    :cond_27
    move-object/from16 v3, p1

    move v0, v5

    :goto_19
    invoke-virtual {v2, v0}, Lm0/q;->t(Z)V

    const v0, 0x3b136fac

    invoke-virtual {v2, v0}, Lm0/q;->Z(I)V

    invoke-virtual/range {p0 .. p0}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_28

    invoke-virtual/range {p1 .. p1}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_28

    const/16 v0, 0xd

    move/from16 v4, v47

    invoke-static {v1, v4, v2, v0}, Ll/q;->d(Ly0/l;FLm0/q;I)J

    move-result-wide v13

    const-string v9, "Please contact the administrator for the update."

    const/4 v10, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const-wide/16 v18, 0x0

    const/16 v20, 0x0

    new-instance v0, Ll2/i;

    const/4 v5, 0x3

    invoke-direct {v0, v5}, Ll2/i;-><init>(I)V

    const-wide/16 v22, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v31, 0xd86

    const/16 v32, 0x0

    const v33, 0x1fdf2

    move-wide/from16 v11, v45

    move-object/from16 v21, v0

    move-object/from16 v30, v2

    invoke-static/range {v9 .. v33}, Lk0/c5;->b(Ljava/lang/String;Ly0/o;JJLf2/j;Lf2/l;Lf2/e;JLl2/j;Ll2/i;JIZIILc9/c;La2/c0;Lm0/m;III)V

    :goto_1a
    const/4 v0, 0x0

    goto :goto_1b

    :cond_28
    move/from16 v4, v47

    goto :goto_1a

    :goto_1b
    invoke-virtual {v2, v0}, Lm0/q;->t(Z)V

    const v0, -0x2b270bc0

    invoke-virtual {v2, v0}, Lm0/q;->Z(I)V

    if-eqz v35, :cond_29

    invoke-static {v1, v4}, Landroidx/compose/foundation/layout/c;->c(Ly0/o;F)Ly0/o;

    move-result-object v0

    invoke-static {v0, v2}, Landroidx/compose/foundation/layout/a;->c(Ly0/o;Lm0/m;)V

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    sget-object v18, Ld5/p;->d:Lu0/b;

    shr-int/lit8 v0, v34, 0xc

    const/16 v1, 0xe

    and-int/2addr v0, v1

    const v1, 0x30000030

    or-int v20, v0, v1

    const/16 v21, 0x1fc

    move-object/from16 v9, v36

    move-object v10, v7

    move-object/from16 v19, v2

    invoke-static/range {v9 .. v21}, Lm9/e0;->j(Lc9/a;Ly0/o;ZLe1/l0;Lk0/y;Lk0/d0;Lu/w;Ly/t0;Lx/m;Lc9/f;Lm0/m;II)V

    :cond_29
    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {v2, v0, v0, v1, v0}, Ll/q;->v(Lm0/q;ZZZZ)V

    invoke-static {v2, v0, v0, v1, v0}, Ll/q;->v(Lm0/q;ZZZZ)V

    invoke-virtual {v2, v0}, Lm0/q;->t(Z)V

    move/from16 v4, v35

    move-object/from16 v5, v36

    :goto_1c
    invoke-virtual {v2}, Lm0/q;->x()Lm0/x1;

    move-result-object v9

    if-eqz v9, :cond_2a

    new-instance v10, Ld5/y;

    move-object v0, v10

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object v3, v8

    move/from16 v6, p6

    move/from16 v7, p7

    invoke-direct/range {v0 .. v7}, Ld5/y;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLc9/a;II)V

    iput-object v10, v9, Lm0/x1;->d:Lc9/e;

    :cond_2a
    return-void

    :cond_2b
    invoke-static {}, Lm9/e0;->C()V

    const/4 v0, 0x0

    throw v0

    :cond_2c
    const/4 v0, 0x0

    invoke-static {}, Lm9/e0;->C()V

    throw v0

    :cond_2d
    const/4 v0, 0x0

    invoke-static {}, Lm9/e0;->C()V

    throw v0
.end method

.method public static final b(Lc9/a;Ly0/o;ZLk0/b1;Lx/m;Lc9/e;Lm0/m;II)V
    .locals 28

    move-object/from16 v6, p5

    move/from16 v7, p7

    move-object/from16 v0, p6

    check-cast v0, Lm0/q;

    const v1, -0x441f35f2

    invoke-virtual {v0, v1}, Lm0/q;->a0(I)Lm0/q;

    and-int/lit8 v1, p8, 0x1

    if-eqz v1, :cond_0

    or-int/lit8 v1, v7, 0x6

    move v3, v1

    move-object/from16 v1, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v1, v7, 0x6

    if-nez v1, :cond_2

    move-object/from16 v1, p0

    invoke-virtual {v0, v1}, Lm0/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    const/4 v3, 0x4

    goto :goto_0

    :cond_1
    const/4 v3, 0x2

    :goto_0
    or-int/2addr v3, v7

    goto :goto_1

    :cond_2
    move-object/from16 v1, p0

    move v3, v7

    :goto_1
    and-int/lit8 v4, p8, 0x2

    if-eqz v4, :cond_4

    or-int/lit8 v3, v3, 0x30

    :cond_3
    move-object/from16 v5, p1

    goto :goto_3

    :cond_4
    and-int/lit8 v5, v7, 0x30

    if-nez v5, :cond_3

    move-object/from16 v5, p1

    invoke-virtual {v0, v5}, Lm0/q;->g(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_5

    const/16 v8, 0x20

    goto :goto_2

    :cond_5
    const/16 v8, 0x10

    :goto_2
    or-int/2addr v3, v8

    :goto_3
    and-int/lit8 v8, p8, 0x4

    if-eqz v8, :cond_7

    or-int/lit16 v3, v3, 0x180

    :cond_6
    move/from16 v9, p2

    goto :goto_5

    :cond_7
    and-int/lit16 v9, v7, 0x180

    if-nez v9, :cond_6

    move/from16 v9, p2

    invoke-virtual {v0, v9}, Lm0/q;->h(Z)Z

    move-result v10

    if-eqz v10, :cond_8

    const/16 v10, 0x100

    goto :goto_4

    :cond_8
    const/16 v10, 0x80

    :goto_4
    or-int/2addr v3, v10

    :goto_5
    and-int/lit16 v10, v7, 0xc00

    if-nez v10, :cond_b

    and-int/lit8 v10, p8, 0x8

    if-nez v10, :cond_9

    move-object/from16 v10, p3

    invoke-virtual {v0, v10}, Lm0/q;->g(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_a

    const/16 v11, 0x800

    goto :goto_6

    :cond_9
    move-object/from16 v10, p3

    :cond_a
    const/16 v11, 0x400

    :goto_6
    or-int/2addr v3, v11

    goto :goto_7

    :cond_b
    move-object/from16 v10, p3

    :goto_7
    and-int/lit8 v11, p8, 0x10

    if-eqz v11, :cond_d

    or-int/lit16 v3, v3, 0x6000

    :cond_c
    move-object/from16 v12, p4

    goto :goto_9

    :cond_d
    and-int/lit16 v12, v7, 0x6000

    if-nez v12, :cond_c

    move-object/from16 v12, p4

    invoke-virtual {v0, v12}, Lm0/q;->g(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_e

    const/16 v13, 0x4000

    goto :goto_8

    :cond_e
    const/16 v13, 0x2000

    :goto_8
    or-int/2addr v3, v13

    :goto_9
    and-int/lit8 v13, p8, 0x20

    const/high16 v14, 0x30000

    if-eqz v13, :cond_f

    or-int/2addr v3, v14

    goto :goto_b

    :cond_f
    and-int v13, v7, v14

    if-nez v13, :cond_11

    invoke-virtual {v0, v6}, Lm0/q;->i(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_10

    const/high16 v13, 0x20000

    goto :goto_a

    :cond_10
    const/high16 v13, 0x10000

    :goto_a
    or-int/2addr v3, v13

    :cond_11
    :goto_b
    const v13, 0x12493

    and-int/2addr v13, v3

    const v14, 0x12492

    if-ne v13, v14, :cond_13

    invoke-virtual {v0}, Lm0/q;->G()Z

    move-result v13

    if-nez v13, :cond_12

    goto :goto_c

    :cond_12
    invoke-virtual {v0}, Lm0/q;->U()V

    move-object v2, v5

    move v3, v9

    move-object v4, v10

    move-object v5, v12

    goto/16 :goto_18

    :cond_13
    :goto_c
    invoke-virtual {v0}, Lm0/q;->W()V

    and-int/lit8 v13, v7, 0x1

    const/4 v14, 0x0

    if-eqz v13, :cond_16

    invoke-virtual {v0}, Lm0/q;->E()Z

    move-result v13

    if-eqz v13, :cond_14

    goto :goto_d

    :cond_14
    invoke-virtual {v0}, Lm0/q;->U()V

    and-int/lit8 v4, p8, 0x8

    if-eqz v4, :cond_15

    and-int/lit16 v3, v3, -0x1c01

    :cond_15
    move v15, v3

    move-object v4, v5

    move v2, v9

    move-object v7, v10

    move-object v3, v12

    move v5, v14

    goto/16 :goto_14

    :cond_16
    :goto_d
    if-eqz v4, :cond_17

    sget-object v4, Ly0/l;->b:Ly0/l;

    goto :goto_e

    :cond_17
    move-object v4, v5

    :goto_e
    if-eqz v8, :cond_18

    const/4 v9, 0x1

    :cond_18
    and-int/lit8 v5, p8, 0x8

    if-eqz v5, :cond_1d

    const v5, -0x5a939695

    invoke-virtual {v0, v5}, Lm0/q;->Z(I)V

    sget-object v5, Lk0/k0;->a:Lm0/m3;

    invoke-virtual {v0, v5}, Lm0/q;->m(Lm0/u1;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lk0/i0;

    const v8, 0x55b4da1d

    invoke-virtual {v0, v8}, Lm0/q;->Z(I)V

    iget-object v8, v5, Lk0/i0;->P:Lk0/b1;

    const v10, 0x3ec28f5c    # 0.38f

    if-nez v8, :cond_19

    sget-object v8, Lk0/s0;->a:Lm0/p0;

    invoke-virtual {v0, v8}, Lm0/q;->m(Lm0/u1;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Le1/r;

    move v13, v3

    iget-wide v2, v8, Le1/r;->a:J

    new-instance v8, Lk0/b1;

    sget-wide v21, Le1/r;->f:J

    invoke-static {v2, v3, v10}, Le1/r;->b(JF)J

    move-result-wide v23

    move-object/from16 v16, v8

    move-wide/from16 v17, v21

    move-wide/from16 v19, v2

    invoke-direct/range {v16 .. v24}, Lk0/b1;-><init>(JJJJ)V

    iput-object v8, v5, Lk0/i0;->P:Lk0/b1;

    goto :goto_f

    :cond_19
    move v13, v3

    :goto_f
    invoke-virtual {v0, v14}, Lm0/q;->t(Z)V

    sget-object v2, Lk0/s0;->a:Lm0/p0;

    invoke-virtual {v0, v2}, Lm0/q;->m(Lm0/u1;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Le1/r;

    iget-wide v2, v2, Le1/r;->a:J

    move v5, v11

    iget-wide v10, v8, Lk0/b1;->b:J

    invoke-static {v10, v11, v2, v3}, Le1/r;->c(JJ)Z

    move-result v16

    if-eqz v16, :cond_1a

    invoke-virtual {v0, v14}, Lm0/q;->t(Z)V

    move-object v7, v8

    move/from16 p1, v9

    goto :goto_12

    :cond_1a
    const v15, 0x3ec28f5c    # 0.38f

    invoke-static {v2, v3, v15}, Le1/r;->b(JF)J

    move-result-wide v17

    iget-wide v14, v8, Lk0/b1;->a:J

    move/from16 p1, v9

    move-wide/from16 v19, v10

    iget-wide v9, v8, Lk0/b1;->c:J

    sget-wide v21, Le1/r;->g:J

    cmp-long v11, v2, v21

    if-eqz v11, :cond_1b

    goto :goto_10

    :cond_1b
    move-wide/from16 v2, v19

    :goto_10
    cmp-long v11, v17, v21

    if-eqz v11, :cond_1c

    move-wide/from16 v26, v17

    goto :goto_11

    :cond_1c
    iget-wide v7, v8, Lk0/b1;->d:J

    move-wide/from16 v26, v7

    :goto_11
    new-instance v7, Lk0/b1;

    move-object/from16 v19, v7

    move-wide/from16 v20, v14

    move-wide/from16 v22, v2

    move-wide/from16 v24, v9

    invoke-direct/range {v19 .. v27}, Lk0/b1;-><init>(JJJJ)V

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Lm0/q;->t(Z)V

    :goto_12
    move v3, v13

    and-int/lit16 v3, v3, -0x1c01

    goto :goto_13

    :cond_1d
    move/from16 p1, v9

    move v5, v11

    move-object v7, v10

    :goto_13
    if-eqz v5, :cond_1f

    const v2, 0x2f4e0df3

    invoke-virtual {v0, v2}, Lm0/q;->Z(I)V

    invoke-virtual {v0}, Lm0/q;->P()Ljava/lang/Object;

    move-result-object v2

    sget-object v5, Lm0/l;->a:Lk0/y0;

    if-ne v2, v5, :cond_1e

    new-instance v2, Lx/m;

    invoke-direct {v2}, Lx/m;-><init>()V

    invoke-virtual {v0, v2}, Lm0/q;->l0(Ljava/lang/Object;)V

    :cond_1e
    check-cast v2, Lx/m;

    const/4 v5, 0x0

    invoke-virtual {v0, v5}, Lm0/q;->t(Z)V

    move v15, v3

    move-object v3, v2

    move/from16 v2, p1

    goto :goto_14

    :cond_1f
    const/4 v5, 0x0

    move/from16 v2, p1

    move v15, v3

    move-object v3, v12

    :goto_14
    invoke-virtual {v0}, Lm0/q;->u()V

    sget-object v8, Lk0/g1;->a:Lm0/m3;

    sget-object v8, Landroidx/compose/material3/MinimumInteractiveModifier;->b:Landroidx/compose/material3/MinimumInteractiveModifier;

    invoke-interface {v4, v8}, Ly0/o;->j(Ly0/o;)Ly0/o;

    move-result-object v8

    sget v9, Ll0/i;->b:F

    invoke-static {v8, v9}, Landroidx/compose/foundation/layout/c;->h(Ly0/o;F)Ly0/o;

    move-result-object v8

    const/4 v10, 0x5

    invoke-static {v10, v0}, Lk0/r2;->a(ILm0/m;)Le1/l0;

    move-result-object v10

    invoke-static {v8, v10}, Landroidx/compose/ui/draw/a;->b(Ly0/o;Le1/l0;)Ly0/o;

    move-result-object v8

    if-eqz v2, :cond_20

    iget-wide v10, v7, Lk0/b1;->a:J

    goto :goto_15

    :cond_20
    iget-wide v10, v7, Lk0/b1;->c:J

    :goto_15
    sget-object v12, Le1/g0;->a:Le1/f0;

    invoke-static {v8, v10, v11, v12}, Landroidx/compose/foundation/a;->e(Ly0/o;JLe1/l0;)Ly0/o;

    move-result-object v17

    const/4 v8, 0x0

    const/4 v10, 0x2

    int-to-float v10, v10

    div-float/2addr v9, v10

    const-wide/16 v10, 0x0

    const/16 v13, 0x36

    const/4 v14, 0x4

    move-object v12, v0

    invoke-static/range {v8 .. v14}, Lj0/v;->a(ZFJLm0/m;II)Lj0/e;

    move-result-object v10

    new-instance v12, Ly1/g;

    invoke-direct {v12, v5}, Ly1/g;-><init>(I)V

    const/16 v14, 0x8

    move-object/from16 v8, v17

    move-object v9, v3

    move v11, v2

    move-object/from16 v13, p0

    invoke-static/range {v8 .. v14}, Landroidx/compose/foundation/a;->j(Ly0/o;Lx/m;Lu/i1;ZLy1/g;Lc9/a;I)Ly0/o;

    move-result-object v8

    sget-object v9, Ly0/a;->c:Ly0/g;

    const v10, 0x2bb5b5d7

    invoke-virtual {v0, v10}, Lm0/q;->Z(I)V

    invoke-static {v9, v5, v0}, Ly/p;->c(Ly0/g;ZLm0/m;)Lr1/j0;

    move-result-object v9

    const v10, -0x4ee9b9da

    invoke-virtual {v0, v10}, Lm0/q;->Z(I)V

    iget v10, v0, Lm0/q;->P:I

    invoke-virtual {v0}, Lm0/q;->p()Lm0/r1;

    move-result-object v11

    sget-object v12, Lt1/l;->k:Lt1/k;

    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v12, Lt1/k;->b:Lt1/j;

    invoke-static {v8}, Landroidx/compose/ui/layout/a;->i(Ly0/o;)Lu0/b;

    move-result-object v8

    iget-object v13, v0, Lm0/q;->a:Lm0/d;

    instance-of v13, v13, Lm0/d;

    if-eqz v13, :cond_26

    invoke-virtual {v0}, Lm0/q;->c0()V

    iget-boolean v13, v0, Lm0/q;->O:Z

    if-eqz v13, :cond_21

    invoke-virtual {v0, v12}, Lm0/q;->o(Lc9/a;)V

    goto :goto_16

    :cond_21
    invoke-virtual {v0}, Lm0/q;->o0()V

    :goto_16
    sget-object v12, Lt1/k;->e:Lt1/i;

    invoke-static {v0, v9, v12}, Ld7/t;->s0(Lm0/m;Ljava/lang/Object;Lc9/e;)V

    sget-object v9, Lt1/k;->d:Lt1/i;

    invoke-static {v0, v11, v9}, Ld7/t;->s0(Lm0/m;Ljava/lang/Object;Lc9/e;)V

    sget-object v9, Lt1/k;->f:Lt1/i;

    iget-boolean v11, v0, Lm0/q;->O:Z

    if-nez v11, :cond_22

    invoke-virtual {v0}, Lm0/q;->P()Ljava/lang/Object;

    move-result-object v11

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v11, v12}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_23

    :cond_22
    invoke-static {v10, v0, v10, v9}, Ll/q;->r(ILm0/q;ILt1/i;)V

    :cond_23
    new-instance v9, Lm0/l2;

    invoke-direct {v9, v0}, Lm0/l2;-><init>(Lm0/m;)V

    const v10, 0x7ab4aae9

    invoke-static {v5, v8, v9, v0, v10}, Ll/q;->s(ILu0/b;Lm0/l2;Lm0/q;I)V

    if-eqz v2, :cond_24

    iget-wide v8, v7, Lk0/b1;->b:J

    goto :goto_17

    :cond_24
    iget-wide v8, v7, Lk0/b1;->d:J

    :goto_17
    sget-object v10, Lk0/s0;->a:Lm0/p0;

    new-instance v11, Le1/r;

    invoke-direct {v11, v8, v9}, Le1/r;-><init>(J)V

    invoke-virtual {v10, v11}, Lm0/u1;->b(Ljava/lang/Object;)Lm0/v1;

    move-result-object v8

    shr-int/lit8 v9, v15, 0xc

    and-int/lit8 v9, v9, 0x70

    invoke-static {v8, v6, v0, v9}, Lf6/a;->b(Lm0/v1;Lc9/e;Lm0/m;I)V

    const/4 v8, 0x1

    invoke-static {v0, v5, v8, v5, v5}, Ll/q;->v(Lm0/q;ZZZZ)V

    move-object v5, v3

    move v3, v2

    move-object v2, v4

    move-object v4, v7

    :goto_18
    invoke-virtual {v0}, Lm0/q;->x()Lm0/x1;

    move-result-object v9

    if-eqz v9, :cond_25

    new-instance v10, Lk0/c1;

    move-object v0, v10

    move-object/from16 v1, p0

    move-object/from16 v6, p5

    move/from16 v7, p7

    move/from16 v8, p8

    invoke-direct/range {v0 .. v8}, Lk0/c1;-><init>(Lc9/a;Ly0/o;ZLk0/b1;Lx/m;Lc9/e;II)V

    iput-object v10, v9, Lm0/x1;->d:Lc9/e;

    :cond_25
    return-void

    :cond_26
    invoke-static {}, Lm9/e0;->C()V

    const/4 v0, 0x0

    throw v0
.end method

.method public static b0([Ljava/lang/String;)Ljava/lang/Process;
    .locals 7

    const-class v0, [Ljava/lang/String;

    const/4 v1, 0x0

    :try_start_0
    sget-object v2, Lo7/d0;->g:Ljava/lang/reflect/Method;

    if-nez v2, :cond_0

    const-class v2, Lla/g;

    const-string v3, "d"

    const/4 v4, 0x3

    new-array v4, v4, [Ljava/lang/Class;

    const/4 v5, 0x0

    aput-object v0, v4, v5

    const/4 v5, 0x1

    aput-object v0, v4, v5

    const-class v0, Ljava/lang/String;

    const/4 v6, 0x2

    aput-object v0, v4, v6

    invoke-virtual {v2, v3, v4}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    sput-object v0, Lo7/d0;->g:Ljava/lang/reflect/Method;

    goto :goto_0

    :catch_0
    move-exception p0

    goto :goto_2

    :cond_0
    :goto_0
    sget-object v0, Lo7/d0;->g:Ljava/lang/reflect/Method;

    if-eqz v0, :cond_1

    filled-new-array {p0, v1, v1}, [Ljava/lang/Object;

    move-result-object p0

    invoke-virtual {v0, v1, p0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    goto :goto_1

    :cond_1
    move-object p0, v1

    :goto_1
    instance-of v0, p0, Ljava/lang/Process;

    if-eqz v0, :cond_2

    check-cast p0, Ljava/lang/Process;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-object v1, p0

    goto :goto_3

    :goto_2
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p0

    const-string v0, "Shizuku reflection error: "

    const-string v2, "ShellTapExecutor"

    invoke-static {v0, p0, v2}, La7/a;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :cond_2
    :goto_3
    return-object v1
.end method

.method public static final c(Ljava/util/ArrayList;)Ljava/util/ArrayList;
    .locals 6

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lp6/k;

    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    iget v3, v1, Lp6/k;->a:I

    const-string v4, "event_type"

    invoke-virtual {v2, v4, v3}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    const-string v3, "event_timestamp"

    iget-wide v4, v1, Lp6/k;->b:J

    invoke-virtual {v2, v3, v4, v5}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public static final d(Lh0/q0;Lh0/q;)Lh0/p;
    .locals 4

    iget-object p0, p0, Lh0/q0;->c:Lh0/n;

    invoke-virtual {p0}, Lh0/n;->b()I

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-ne v0, v1, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    new-instance v3, Lh0/p;

    invoke-static {p0, v0, v1, p1}, Lo7/d0;->i(Lh0/n;ZZLh0/q;)Lh0/o;

    move-result-object v1

    invoke-static {p0, v0, v2, p1}, Lo7/d0;->i(Lh0/n;ZZLh0/q;)Lh0/o;

    move-result-object p0

    invoke-direct {v3, v1, p0, v0}, Lh0/p;-><init>(Lh0/o;Lh0/o;Z)V

    return-object v3
.end method

.method public static final e(J)I
    .locals 6

    const-wide v0, 0xffffffffL

    and-long/2addr v0, p0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    const/16 v0, 0x20

    shr-long/2addr p0, v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-wide/32 v4, 0xffff

    and-long/2addr v4, p0

    cmp-long v1, v4, v2

    if-nez v1, :cond_1

    add-int/lit8 v0, v0, 0x10

    const/16 v1, 0x10

    shr-long/2addr p0, v1

    :cond_1
    const-wide/16 v4, 0xff

    and-long/2addr v4, p0

    cmp-long v1, v4, v2

    if-nez v1, :cond_2

    add-int/lit8 v0, v0, 0x8

    const/16 v1, 0x8

    shr-long/2addr p0, v1

    :cond_2
    const-wide/16 v4, 0xf

    and-long/2addr v4, p0

    cmp-long v1, v4, v2

    if-nez v1, :cond_3

    add-int/lit8 v0, v0, 0x4

    const/4 v1, 0x4

    shr-long/2addr p0, v1

    :cond_3
    const-wide/16 v4, 0x1

    and-long/2addr v4, p0

    cmp-long v1, v4, v2

    if-eqz v1, :cond_4

    goto :goto_1

    :cond_4
    const-wide/16 v4, 0x2

    and-long/2addr v4, p0

    cmp-long v1, v4, v2

    if-eqz v1, :cond_5

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_5
    const-wide/16 v4, 0x4

    and-long/2addr v4, p0

    cmp-long v1, v4, v2

    if-eqz v1, :cond_6

    add-int/lit8 v0, v0, 0x2

    goto :goto_1

    :cond_6
    const-wide/16 v4, 0x8

    and-long/2addr p0, v4

    cmp-long p0, p0, v2

    if-eqz p0, :cond_7

    add-int/lit8 v0, v0, 0x3

    goto :goto_1

    :cond_7
    const/4 v0, -0x1

    :goto_1
    return v0
.end method

.method public static final f(Lh0/q0;Lh0/n;Lh0/o;)Lh0/o;
    .locals 10

    iget-boolean v0, p0, Lh0/q0;->a:Z

    if-eqz v0, :cond_0

    iget v1, p1, Lh0/n;->a:I

    goto :goto_0

    :cond_0
    iget v1, p1, Lh0/n;->b:I

    :goto_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v2, Lq8/d;->a:[Lq8/d;

    new-instance v2, Lh0/u;

    invoke-direct {v2, p1, v1}, Lh0/u;-><init>(Lh0/n;I)V

    invoke-static {v2}, Lz6/a;->R(Lc9/a;)Lq8/c;

    move-result-object v8

    if-eqz v0, :cond_1

    iget v2, p1, Lh0/n;->b:I

    :goto_1
    move v5, v2

    goto :goto_2

    :cond_1
    iget v2, p1, Lh0/n;->a:I

    goto :goto_1

    :goto_2
    new-instance v9, Lh0/t;

    move-object v2, v9

    move-object v3, p1

    move v4, v1

    move-object v6, p0

    move-object v7, v8

    invoke-direct/range {v2 .. v7}, Lh0/t;-><init>(Lh0/n;IILh0/q0;Lq8/c;)V

    invoke-static {v9}, Lz6/a;->R(Lc9/a;)Lq8/c;

    move-result-object p0

    iget-wide v2, p2, Lh0/o;->c:J

    const-wide/16 v4, 0x1

    cmp-long v2, v4, v2

    if-eqz v2, :cond_2

    check-cast p0, Lq8/m;

    invoke-virtual {p0}, Lq8/m;->getValue()Ljava/lang/Object;

    move-result-object p0

    move-object p2, p0

    check-cast p2, Lh0/o;

    goto/16 :goto_7

    :cond_2
    iget v2, p1, Lh0/n;->c:I

    if-ne v1, v2, :cond_3

    goto :goto_7

    :cond_3
    iget-object v3, p1, Lh0/n;->d:La2/a0;

    invoke-virtual {v3, v2}, La2/a0;->f(I)I

    move-result v4

    check-cast v8, Lq8/m;

    invoke-virtual {v8}, Lq8/m;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Number;

    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    move-result v5

    if-eq v5, v4, :cond_4

    check-cast p0, Lq8/m;

    invoke-virtual {p0}, Lq8/m;->getValue()Ljava/lang/Object;

    move-result-object p0

    move-object p2, p0

    check-cast p2, Lh0/o;

    goto :goto_7

    :cond_4
    iget p2, p2, Lh0/o;->b:I

    invoke-virtual {v3, p2}, La2/a0;->n(I)J

    move-result-wide v3

    const/4 v5, -0x1

    if-ne v2, v5, :cond_5

    goto :goto_4

    :cond_5
    if-ne v1, v2, :cond_6

    goto :goto_6

    :cond_6
    invoke-virtual {p1}, Lh0/n;->b()I

    move-result v5

    const/4 v6, 0x1

    if-ne v5, v6, :cond_7

    goto :goto_3

    :cond_7
    const/4 v6, 0x0

    :goto_3
    xor-int/2addr v0, v6

    if-eqz v0, :cond_8

    if-ge v1, v2, :cond_b

    goto :goto_4

    :cond_8
    if-le v1, v2, :cond_b

    :goto_4
    sget v0, La2/b0;->c:I

    const/16 v0, 0x20

    shr-long v5, v3, v0

    long-to-int v0, v5

    if-eq p2, v0, :cond_a

    const-wide v5, 0xffffffffL

    and-long v2, v3, v5

    long-to-int v0, v2

    if-ne p2, v0, :cond_9

    goto :goto_5

    :cond_9
    invoke-virtual {p1, v1}, Lh0/n;->a(I)Lh0/o;

    move-result-object p2

    goto :goto_7

    :cond_a
    :goto_5
    check-cast p0, Lq8/m;

    invoke-virtual {p0}, Lq8/m;->getValue()Ljava/lang/Object;

    move-result-object p0

    move-object p2, p0

    check-cast p2, Lh0/o;

    goto :goto_7

    :cond_b
    :goto_6
    invoke-virtual {p1, v1}, Lh0/n;->a(I)Lh0/o;

    move-result-object p2

    :goto_7
    return-object p2
.end method

.method public static g(Lf1/d;)Lf1/d;
    .locals 12

    sget-object v3, Lf1/j;->b:Lf1/s;

    sget-object v0, Lf1/b;->b:Lf1/a;

    iget-wide v1, p0, Lf1/d;->b:J

    sget-wide v4, Lf1/c;->a:J

    invoke-static {v1, v2, v4, v5}, Lf1/c;->a(JJ)Z

    move-result v1

    if-eqz v1, :cond_1

    move-object v1, p0

    check-cast v1, Lf1/q;

    iget-object v2, v1, Lf1/q;->d:Lf1/s;

    invoke-static {v2, v3}, Lo7/d0;->p(Lf1/s;Lf1/s;)Z

    move-result v4

    if-eqz v4, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v3}, Lf1/s;->a()[F

    move-result-object p0

    invoke-virtual {v2}, Lf1/s;->a()[F

    move-result-object v2

    iget-object v0, v0, Lf1/b;->a:[F

    invoke-static {v0, v2, p0}, Lo7/d0;->n([F[F[F)[F

    move-result-object p0

    iget-object v0, v1, Lf1/q;->i:[F

    invoke-static {p0, v0}, Lo7/d0;->T([F[F)[F

    move-result-object v4

    new-instance p0, Lf1/q;

    iget-object v2, v1, Lf1/d;->a:Ljava/lang/String;

    iget-object v5, v1, Lf1/q;->h:[F

    iget-object v6, v1, Lf1/q;->k:Lf1/i;

    iget-object v7, v1, Lf1/q;->n:Lf1/i;

    iget v8, v1, Lf1/q;->e:F

    iget v9, v1, Lf1/q;->f:F

    iget-object v10, v1, Lf1/q;->g:Lf1/r;

    const/4 v11, -0x1

    move-object v0, p0

    move-object v1, v2

    move-object v2, v5

    move-object v5, v6

    move-object v6, v7

    move v7, v8

    move v8, v9

    move-object v9, v10

    move v10, v11

    invoke-direct/range {v0 .. v10}, Lf1/q;-><init>(Ljava/lang/String;[FLf1/s;[FLf1/i;Lf1/i;FFLf1/r;I)V

    :cond_1
    :goto_0
    return-object p0
.end method

.method public static g0(Ljava/nio/MappedByteBuffer;)Lj3/b;
    .locals 12

    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->duplicate()Ljava/nio/ByteBuffer;

    move-result-object p0

    new-instance v0, Lk/f;

    invoke-direct {v0, p0}, Lk/f;-><init>(Ljava/nio/ByteBuffer;)V

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lk/f;->I(I)V

    iget-object v2, v0, Lk/f;->b:Ljava/lang/Object;

    check-cast v2, Ljava/nio/ByteBuffer;

    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->getShort()S

    move-result v2

    const v3, 0xffff

    and-int/2addr v2, v3

    const/16 v3, 0x64

    const-string v4, "Cannot read metadata."

    if-gt v2, v3, :cond_5

    const/4 v3, 0x6

    invoke-virtual {v0, v3}, Lk/f;->I(I)V

    const/4 v3, 0x0

    move v5, v3

    :goto_0
    const-wide/16 v6, -0x1

    if-ge v5, v2, :cond_1

    iget-object v8, v0, Lk/f;->b:Ljava/lang/Object;

    check-cast v8, Ljava/nio/ByteBuffer;

    invoke-virtual {v8}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v8

    invoke-virtual {v0, v1}, Lk/f;->I(I)V

    invoke-virtual {v0}, Lk/f;->F()J

    move-result-wide v9

    invoke-virtual {v0, v1}, Lk/f;->I(I)V

    const v11, 0x6d657461

    if-ne v11, v8, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_1
    move-wide v9, v6

    :goto_1
    cmp-long v1, v9, v6

    if-eqz v1, :cond_4

    iget-object v1, v0, Lk/f;->b:Ljava/lang/Object;

    check-cast v1, Ljava/nio/ByteBuffer;

    invoke-virtual {v1}, Ljava/nio/Buffer;->position()I

    move-result v1

    int-to-long v1, v1

    sub-long v1, v9, v1

    long-to-int v1, v1

    invoke-virtual {v0, v1}, Lk/f;->I(I)V

    const/16 v1, 0xc

    invoke-virtual {v0, v1}, Lk/f;->I(I)V

    invoke-virtual {v0}, Lk/f;->F()J

    move-result-wide v1

    :goto_2
    int-to-long v5, v3

    cmp-long v5, v5, v1

    if-gez v5, :cond_4

    iget-object v5, v0, Lk/f;->b:Ljava/lang/Object;

    check-cast v5, Ljava/nio/ByteBuffer;

    invoke-virtual {v5}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v5

    invoke-virtual {v0}, Lk/f;->F()J

    move-result-wide v6

    invoke-virtual {v0}, Lk/f;->F()J

    const v8, 0x456d6a69

    if-eq v8, v5, :cond_3

    const v8, 0x656d6a69

    if-ne v8, v5, :cond_2

    goto :goto_3

    :cond_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    :cond_3
    :goto_3
    add-long/2addr v6, v9

    long-to-int v0, v6

    invoke-virtual {p0, v0}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    new-instance v0, Lj3/b;

    invoke-direct {v0}, Lj3/c;-><init>()V

    sget-object v1, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {p0, v1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    invoke-virtual {p0}, Ljava/nio/Buffer;->position()I

    move-result v1

    invoke-virtual {p0, v1}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v1

    invoke-virtual {p0}, Ljava/nio/Buffer;->position()I

    move-result v2

    add-int/2addr v2, v1

    iput-object p0, v0, Lj3/c;->b:Ljava/nio/ByteBuffer;

    iput v2, v0, Lj3/c;->a:I

    invoke-virtual {p0, v2}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result p0

    sub-int/2addr v2, p0

    iput v2, v0, Lj3/c;->c:I

    iget-object p0, v0, Lj3/c;->b:Ljava/nio/ByteBuffer;

    invoke-virtual {p0, v2}, Ljava/nio/ByteBuffer;->getShort(I)S

    move-result p0

    iput p0, v0, Lj3/c;->d:I

    return-object v0

    :cond_4
    new-instance p0, Ljava/io/IOException;

    invoke-direct {p0, v4}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_5
    new-instance p0, Ljava/io/IOException;

    invoke-direct {p0, v4}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final h(Lq/g;I)V
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    new-array v0, p1, [I

    iput-object v0, p0, Lq/g;->a:[I

    new-array p1, p1, [Ljava/lang/Object;

    iput-object p1, p0, Lq/g;->b:[Ljava/lang/Object;

    return-void
.end method

.method public static final h0(Lja/j;I)I
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, -0x499602d2

    if-ne p1, v0, :cond_0

    invoke-virtual {p0}, Lja/j;->d()I

    move-result p0

    return p0

    :cond_0
    return p1
.end method

.method public static final i(Lh0/n;ZZLh0/q;)Lh0/o;
    .locals 2

    if-eqz p2, :cond_0

    iget v0, p0, Lh0/n;->a:I

    goto :goto_0

    :cond_0
    iget v0, p0, Lh0/n;->b:I

    :goto_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget p3, p3, Lh0/q;->a:I

    iget-object v1, p0, Lh0/n;->d:La2/a0;

    packed-switch p3, :pswitch_data_0

    invoke-virtual {v1, v0}, La2/a0;->n(I)J

    move-result-wide v0

    goto :goto_1

    :pswitch_0
    iget-object p3, v1, La2/a0;->a:La2/z;

    iget-object p3, p3, La2/z;->a:La2/e;

    iget-object p3, p3, La2/e;->a:Ljava/lang/String;

    invoke-static {v0, p3}, Lf6/a;->H(ILjava/lang/String;)I

    move-result v1

    invoke-static {v0, p3}, Lf6/a;->G(ILjava/lang/String;)I

    move-result p3

    invoke-static {v1, p3}, Lo1/s;->g(II)J

    move-result-wide v0

    :goto_1
    xor-int/2addr p1, p2

    if-eqz p1, :cond_1

    sget p1, La2/b0;->c:I

    const/16 p1, 0x20

    shr-long p1, v0, p1

    :goto_2
    long-to-int p1, p1

    goto :goto_3

    :cond_1
    sget p1, La2/b0;->c:I

    const-wide p1, 0xffffffffL

    and-long/2addr p1, v0

    goto :goto_2

    :goto_3
    invoke-virtual {p0, p1}, Lh0/n;->a(I)Lh0/o;

    move-result-object p0

    return-object p0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public static final i0(Lr9/s;Lr9/s;Lc9/e;)Ljava/lang/Object;
    .locals 1

    const/4 v0, 0x2

    :try_start_0
    invoke-static {v0, p2}, Lz6/a;->f(ILjava/lang/Object;)V

    invoke-interface {p2, p1, p0}, Lc9/e;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    new-instance p2, Lm9/u;

    const/4 v0, 0x0

    invoke-direct {p2, p1, v0}, Lm9/u;-><init>(Ljava/lang/Throwable;Z)V

    move-object p1, p2

    :goto_0
    sget-object p2, Lv8/a;->a:Lv8/a;

    if-ne p1, p2, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {p0, p1}, Lm9/p1;->Y(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    sget-object p1, Lm9/e0;->e:Li3/u;

    if-ne p0, p1, :cond_1

    goto :goto_1

    :cond_1
    instance-of p1, p0, Lm9/u;

    if-nez p1, :cond_2

    invoke-static {p0}, Lm9/e0;->N(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    :goto_1
    return-object p2

    :cond_2
    check-cast p0, Lm9/u;

    iget-object p0, p0, Lm9/u;->a:Ljava/lang/Throwable;

    throw p0
.end method

.method public static final j([BI[BII)Z
    .locals 4

    const-string v0, "a"

    invoke-static {p0, v0}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "b"

    invoke-static {p2, v0}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    if-ge v1, p4, :cond_1

    add-int v2, v1, p1

    aget-byte v2, p0, v2

    add-int v3, v1, p3

    aget-byte v3, p2, v3

    if-eq v2, v3, :cond_0

    return v0

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    const/4 p0, 0x1

    return p0
.end method

.method public static final k([II)I
    .locals 4

    array-length v0, p0

    add-int/lit8 v0, v0, -0x1

    const/4 v1, 0x0

    :goto_0
    if-gt v1, v0, :cond_2

    add-int v2, v1, v0

    ushr-int/lit8 v2, v2, 0x1

    aget v3, p0, v2

    if-le p1, v3, :cond_0

    add-int/lit8 v1, v2, 0x1

    goto :goto_0

    :cond_0
    if-ge p1, v3, :cond_1

    add-int/lit8 v0, v2, -0x1

    goto :goto_0

    :cond_1
    return v2

    :cond_2
    add-int/lit8 v1, v1, 0x1

    neg-int p0, v1

    return p0
.end method

.method public static k0(Landroid/view/ViewGroup;Z)V
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    if-lt v0, v1, :cond_0

    invoke-static {p0, p1}, Le1/b;->s(Landroid/view/ViewGroup;Z)V

    goto :goto_0

    :cond_0
    sget-boolean v0, Lo7/d0;->f:Z

    if-eqz v0, :cond_1

    :try_start_0
    invoke-static {p0, p1}, Le1/b;->s(Landroid/view/ViewGroup;Z)V
    :try_end_0
    .catch Ljava/lang/NoSuchMethodError; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 p0, 0x0

    sput-boolean p0, Lo7/d0;->f:Z

    :cond_1
    :goto_0
    return-void
.end method

.method public static final l(Lh0/o;Lh0/n;I)Lh0/o;
    .locals 2

    iget-object p1, p1, Lh0/n;->d:La2/a0;

    invoke-virtual {p1, p2}, La2/a0;->a(I)Ll2/h;

    move-result-object p1

    iget-wide v0, p0, Lh0/o;->c:J

    new-instance p0, Lh0/o;

    invoke-direct {p0, p1, p2, v0, v1}, Lh0/o;-><init>(Ll2/h;IJ)V

    return-object p0
.end method

.method public static l0([BJI)V
    .locals 4

    const/4 v0, 0x0

    :goto_0
    const/4 v1, 0x4

    if-ge v0, v1, :cond_0

    add-int v1, p3, v0

    const-wide/16 v2, 0xff

    and-long/2addr v2, p1

    long-to-int v2, v2

    int-to-byte v2, v2

    aput-byte v2, p0, v1

    add-int/lit8 v0, v0, 0x1

    const/16 v1, 0x8

    shr-long/2addr p1, v1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static final m(JJJ)V
    .locals 4

    or-long v0, p2, p4

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-ltz v0, :cond_0

    cmp-long v0, p2, p0

    if-gtz v0, :cond_0

    sub-long v0, p0, p2

    cmp-long v0, v0, p4

    if-ltz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/ArrayIndexOutOfBoundsException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "size="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0, p1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p0, " offset="

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p0, " byteCount="

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p4, p5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static final m0(II)V
    .locals 2

    if-lez p0, :cond_1

    if-lez p1, :cond_1

    if-gt p0, p1, :cond_0

    return-void

    :cond_0
    const-string v0, "minLines "

    const-string v1, " must be less than or equal to maxLines "

    invoke-static {v0, p0, v1, p1}, Ll/q;->i(Ljava/lang/String;ILjava/lang/String;I)Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "both minLines "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, " and maxLines "

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, " must be greater than zero"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static final n([F[F[F)[F
    .locals 4

    invoke-static {p0, p1}, Lo7/d0;->V([F[F)V

    invoke-static {p0, p2}, Lo7/d0;->V([F[F)V

    const/4 v0, 0x3

    new-array v0, v0, [F

    const/4 v1, 0x0

    aget v2, p2, v1

    aget v3, p1, v1

    div-float/2addr v2, v3

    aput v2, v0, v1

    const/4 v1, 0x1

    aget v2, p2, v1

    aget v3, p1, v1

    div-float/2addr v2, v3

    aput v2, v0, v1

    const/4 v1, 0x2

    aget p2, p2, v1

    aget p1, p1, v1

    div-float/2addr p2, p1

    aput p2, v0, v1

    invoke-static {p0}, Lo7/d0;->O([F)[F

    move-result-object p1

    invoke-static {v0, p0}, Lo7/d0;->U([F[F)[F

    move-result-object p0

    invoke-static {p1, p0}, Lo7/d0;->T([F[F)[F

    move-result-object p0

    return-object p0
.end method

.method public static n0(I)I
    .locals 5

    const/4 v0, 0x6

    new-array v1, v0, [I

    fill-array-data v1, :array_0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_2

    aget v3, v1, v2

    add-int/lit8 v4, v3, -0x1

    if-eqz v3, :cond_1

    if-ne v4, p0, :cond_0

    return v3

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    throw p0

    :cond_2
    const/4 p0, 0x1

    return p0

    nop

    :array_0
    .array-data 4
        0x1
        0x2
        0x3
        0x4
        0x5
        0x6
    .end array-data
.end method

.method public static final o(Lx/l;Lm0/m;I)Lm0/g1;
    .locals 4

    check-cast p1, Lm0/q;

    const p2, -0x64e89930

    invoke-virtual {p1, p2}, Lm0/q;->Z(I)V

    const p2, -0x1d58f75c

    invoke-virtual {p1, p2}, Lm0/q;->Z(I)V

    invoke-virtual {p1}, Lm0/q;->P()Ljava/lang/Object;

    move-result-object p2

    sget-object v0, Lm0/l;->a:Lk0/y0;

    if-ne p2, v0, :cond_0

    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    sget-object v1, Lm0/o3;->a:Lm0/o3;

    invoke-static {p2, v1}, Ld7/t;->g0(Ljava/lang/Object;Lm0/z2;)Lm0/n1;

    move-result-object p2

    invoke-virtual {p1, p2}, Lm0/q;->l0(Ljava/lang/Object;)V

    :cond_0
    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Lm0/q;->t(Z)V

    check-cast p2, Lm0/g1;

    const v2, 0x5aca084e

    invoke-virtual {p1, v2}, Lm0/q;->Z(I)V

    invoke-virtual {p1, p0}, Lm0/q;->g(Ljava/lang/Object;)Z

    move-result v2

    invoke-virtual {p1, p2}, Lm0/q;->g(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v2, v3

    invoke-virtual {p1}, Lm0/q;->P()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_1

    if-ne v3, v0, :cond_2

    :cond_1
    new-instance v3, Lx/q;

    const/4 v0, 0x0

    invoke-direct {v3, p0, p2, v0}, Lx/q;-><init>(Lx/l;Lm0/g1;Lu8/e;)V

    invoke-virtual {p1, v3}, Lm0/q;->l0(Ljava/lang/Object;)V

    :cond_2
    check-cast v3, Lc9/e;

    invoke-virtual {p1, v1}, Lm0/q;->t(Z)V

    invoke-static {p0, v3, p1}, Lm0/s;->b(Ljava/lang/Object;Lc9/e;Lm0/m;)V

    invoke-virtual {p1, v1}, Lm0/q;->t(Z)V

    return-object p2
.end method

.method public static final p(Lf1/s;Lf1/s;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    iget v1, p0, Lf1/s;->a:F

    iget v2, p1, Lf1/s;->a:F

    sub-float/2addr v1, v2

    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v1

    const v2, 0x3a83126f    # 0.001f

    cmpg-float v1, v1, v2

    if-gez v1, :cond_1

    iget p0, p0, Lf1/s;->b:F

    iget p1, p1, Lf1/s;->b:F

    sub-float/2addr p0, p1

    invoke-static {p0}, Ljava/lang/Math;->abs(F)F

    move-result p0

    cmpg-float p0, p0, v2

    if-gez p0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public static q([B[B)[B
    .locals 55

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    array-length v2, v0

    const/16 v3, 0x20

    if-ne v2, v3, :cond_2

    const/4 v2, 0x0

    invoke-static {v2, v0}, Lo7/d0;->R(I[B)J

    move-result-wide v4

    const-wide/32 v6, 0x3ffffff

    and-long/2addr v4, v6

    const/4 v8, 0x3

    invoke-static {v8, v0}, Lo7/d0;->R(I[B)J

    move-result-wide v9

    const/4 v11, 0x2

    shr-long/2addr v9, v11

    const-wide/32 v12, 0x3ffff03

    and-long/2addr v9, v12

    const/4 v12, 0x6

    invoke-static {v12, v0}, Lo7/d0;->R(I[B)J

    move-result-wide v13

    const/4 v15, 0x4

    shr-long/2addr v13, v15

    const-wide/32 v16, 0x3ffc0ff

    and-long v13, v13, v16

    const/16 v3, 0x9

    invoke-static {v3, v0}, Lo7/d0;->R(I[B)J

    move-result-wide v17

    shr-long v17, v17, v12

    const-wide/32 v19, 0x3f03fff

    and-long v17, v17, v19

    const/16 v3, 0xc

    invoke-static {v3, v0}, Lo7/d0;->R(I[B)J

    move-result-wide v20

    const/16 v3, 0x8

    shr-long v20, v20, v3

    const-wide/32 v22, 0xfffff

    and-long v20, v20, v22

    const-wide/16 v22, 0x5

    mul-long v24, v9, v22

    mul-long v26, v13, v22

    mul-long v28, v17, v22

    mul-long v30, v20, v22

    const/16 v3, 0x11

    new-array v15, v3, [B

    const-wide/16 v33, 0x0

    move v12, v2

    move-wide/from16 v35, v33

    move-wide/from16 v37, v35

    move-wide/from16 v39, v37

    move-wide/from16 v41, v39

    :goto_0
    array-length v11, v1

    const/16 v8, 0x10

    const/16 v6, 0x18

    const/16 v7, 0x1a

    if-ge v12, v11, :cond_1

    array-length v11, v1

    sub-int/2addr v11, v12

    invoke-static {v8, v11}, Ljava/lang/Math;->min(II)I

    move-result v11

    invoke-static {v1, v12, v15, v2, v11}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    const/16 v46, 0x1

    aput-byte v46, v15, v11

    if-eq v11, v8, :cond_0

    add-int/lit8 v11, v11, 0x1

    invoke-static {v15, v11, v3, v2}, Ljava/util/Arrays;->fill([BIIB)V

    :cond_0
    invoke-static {v2, v15}, Lo7/d0;->R(I[B)J

    move-result-wide v46

    const-wide/32 v44, 0x3ffffff

    and-long v46, v46, v44

    add-long v41, v41, v46

    const/4 v11, 0x3

    invoke-static {v11, v15}, Lo7/d0;->R(I[B)J

    move-result-wide v46

    const/16 v43, 0x2

    shr-long v46, v46, v43

    and-long v46, v46, v44

    add-long v33, v33, v46

    const/4 v3, 0x6

    invoke-static {v3, v15}, Lo7/d0;->R(I[B)J

    move-result-wide v46

    const/16 v32, 0x4

    shr-long v46, v46, v32

    and-long v46, v46, v44

    add-long v35, v35, v46

    const/16 v11, 0x9

    invoke-static {v11, v15}, Lo7/d0;->R(I[B)J

    move-result-wide v47

    shr-long v47, v47, v3

    and-long v47, v47, v44

    add-long v37, v37, v47

    const/16 v3, 0xc

    invoke-static {v3, v15}, Lo7/d0;->R(I[B)J

    move-result-wide v47

    const/16 v3, 0x8

    shr-long v47, v47, v3

    and-long v47, v47, v44

    aget-byte v3, v15, v8

    shl-int/2addr v3, v6

    int-to-long v2, v3

    or-long v2, v47, v2

    add-long v39, v39, v2

    mul-long v2, v41, v4

    mul-long v47, v33, v30

    add-long v47, v47, v2

    mul-long v2, v35, v28

    add-long v2, v2, v47

    mul-long v47, v37, v26

    add-long v47, v47, v2

    mul-long v2, v39, v24

    add-long v2, v2, v47

    mul-long v47, v41, v9

    mul-long v49, v33, v4

    add-long v49, v49, v47

    mul-long v47, v35, v30

    add-long v47, v47, v49

    mul-long v49, v37, v28

    add-long v49, v49, v47

    mul-long v47, v39, v26

    add-long v47, v47, v49

    mul-long v49, v41, v13

    mul-long v51, v33, v9

    add-long v51, v51, v49

    mul-long v49, v35, v4

    add-long v49, v49, v51

    mul-long v51, v37, v30

    add-long v51, v51, v49

    mul-long v49, v39, v28

    add-long v49, v49, v51

    mul-long v51, v41, v17

    mul-long v53, v33, v13

    add-long v53, v53, v51

    mul-long v51, v35, v9

    add-long v51, v51, v53

    mul-long v53, v37, v4

    add-long v53, v53, v51

    mul-long v51, v39, v30

    add-long v51, v51, v53

    mul-long v41, v41, v20

    mul-long v33, v33, v17

    add-long v33, v33, v41

    mul-long v35, v35, v13

    add-long v35, v35, v33

    mul-long v37, v37, v9

    add-long v37, v37, v35

    mul-long v39, v39, v4

    add-long v39, v39, v37

    shr-long v33, v2, v7

    const-wide/32 v44, 0x3ffffff

    and-long v2, v2, v44

    add-long v47, v47, v33

    shr-long v33, v47, v7

    and-long v35, v47, v44

    add-long v49, v49, v33

    shr-long v33, v49, v7

    and-long v37, v49, v44

    add-long v51, v51, v33

    shr-long v33, v51, v7

    and-long v41, v51, v44

    add-long v39, v39, v33

    shr-long v33, v39, v7

    and-long v39, v39, v44

    mul-long v33, v33, v22

    add-long v33, v33, v2

    shr-long v2, v33, v7

    and-long v6, v33, v44

    add-long v33, v35, v2

    add-int/lit8 v12, v12, 0x10

    move-wide/from16 v35, v37

    move-wide/from16 v37, v41

    const/4 v2, 0x0

    const/16 v3, 0x11

    const/4 v8, 0x3

    move-wide/from16 v41, v6

    move-wide/from16 v6, v44

    goto/16 :goto_0

    :cond_1
    const-wide/32 v44, 0x3ffffff

    shr-long v1, v33, v7

    and-long v3, v33, v44

    add-long v35, v35, v1

    shr-long v1, v35, v7

    and-long v9, v35, v44

    add-long v37, v37, v1

    shr-long v1, v37, v7

    and-long v11, v37, v44

    add-long v39, v39, v1

    shr-long v1, v39, v7

    and-long v13, v39, v44

    mul-long v1, v1, v22

    add-long v1, v1, v41

    shr-long v17, v1, v7

    and-long v1, v1, v44

    add-long v3, v3, v17

    add-long v22, v1, v22

    shr-long v17, v22, v7

    and-long v20, v22, v44

    add-long v17, v3, v17

    shr-long v22, v17, v7

    and-long v17, v17, v44

    add-long v22, v9, v22

    shr-long v24, v22, v7

    and-long v22, v22, v44

    add-long v24, v11, v24

    shr-long v26, v24, v7

    and-long v24, v24, v44

    add-long v26, v13, v26

    const-wide/32 v28, 0x4000000

    sub-long v26, v26, v28

    const/16 v5, 0x3f

    shr-long v6, v26, v5

    and-long/2addr v1, v6

    and-long/2addr v3, v6

    and-long/2addr v9, v6

    and-long/2addr v11, v6

    and-long/2addr v13, v6

    not-long v5, v6

    and-long v20, v20, v5

    or-long v1, v1, v20

    and-long v17, v17, v5

    or-long v3, v3, v17

    and-long v17, v22, v5

    or-long v9, v9, v17

    and-long v17, v24, v5

    or-long v11, v11, v17

    and-long v5, v26, v5

    or-long/2addr v5, v13

    const/16 v7, 0x1a

    shl-long v13, v3, v7

    or-long/2addr v1, v13

    const-wide v13, 0xffffffffL

    and-long/2addr v1, v13

    const/4 v7, 0x6

    shr-long/2addr v3, v7

    const/16 v7, 0x14

    shl-long v17, v9, v7

    or-long v3, v3, v17

    and-long/2addr v3, v13

    const/16 v17, 0xc

    shr-long v9, v9, v17

    const/16 v17, 0xe

    shl-long v17, v11, v17

    or-long v9, v9, v17

    and-long/2addr v9, v13

    const/16 v17, 0x12

    shr-long v11, v11, v17

    const/16 v17, 0x8

    shl-long v5, v5, v17

    or-long/2addr v5, v11

    and-long/2addr v5, v13

    invoke-static {v8, v0}, Lo7/d0;->R(I[B)J

    move-result-wide v11

    add-long/2addr v11, v1

    and-long v1, v11, v13

    invoke-static {v7, v0}, Lo7/d0;->R(I[B)J

    move-result-wide v17

    add-long v17, v17, v3

    const/16 v3, 0x20

    shr-long/2addr v11, v3

    add-long v17, v17, v11

    and-long v11, v17, v13

    const/16 v4, 0x18

    invoke-static {v4, v0}, Lo7/d0;->R(I[B)J

    move-result-wide v15

    add-long/2addr v15, v9

    shr-long v9, v17, v3

    add-long/2addr v15, v9

    and-long v9, v15, v13

    const/16 v4, 0x1c

    invoke-static {v4, v0}, Lo7/d0;->R(I[B)J

    move-result-wide v17

    add-long v17, v17, v5

    shr-long v3, v15, v3

    add-long v17, v17, v3

    and-long v3, v17, v13

    new-array v0, v8, [B

    const/4 v5, 0x0

    invoke-static {v0, v1, v2, v5}, Lo7/d0;->l0([BJI)V

    const/4 v1, 0x4

    invoke-static {v0, v11, v12, v1}, Lo7/d0;->l0([BJI)V

    const/16 v1, 0x8

    invoke-static {v0, v9, v10, v1}, Lo7/d0;->l0([BJI)V

    const/16 v1, 0xc

    invoke-static {v0, v3, v4, v1}, Lo7/d0;->l0([BJI)V

    return-object v0

    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "The key length in bytes must be 32."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static r(Landroid/content/Context;)Li3/y;
    .locals 8

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-lt v0, v1, :cond_0

    new-instance v0, Li3/d;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    goto :goto_0

    :cond_0
    new-instance v0, Li3/c;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    :goto_0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    const-string v2, "Package manager required to locate emoji font provider"

    invoke-static {v1, v2}, Lo1/s;->l(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Landroid/content/Intent;

    const-string v3, "androidx.content.action.LOAD_EMOJI_FONT"

    invoke-direct {v2, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, Landroid/content/pm/PackageManager;->queryIntentContentProviders(Landroid/content/Intent;I)Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    const/4 v5, 0x0

    if-eqz v4, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/content/pm/ResolveInfo;

    iget-object v4, v4, Landroid/content/pm/ResolveInfo;->providerInfo:Landroid/content/pm/ProviderInfo;

    if-eqz v4, :cond_1

    iget-object v6, v4, Landroid/content/pm/ProviderInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    if-eqz v6, :cond_1

    iget v6, v6, Landroid/content/pm/ApplicationInfo;->flags:I

    const/4 v7, 0x1

    and-int/2addr v6, v7

    if-ne v6, v7, :cond_1

    goto :goto_1

    :cond_2
    move-object v4, v5

    :goto_1
    if-nez v4, :cond_3

    :goto_2
    move-object v1, v5

    goto :goto_4

    :cond_3
    :try_start_0
    iget-object v2, v4, Landroid/content/pm/ProviderInfo;->authority:Ljava/lang/String;

    iget-object v4, v4, Landroid/content/pm/ProviderInfo;->packageName:Ljava/lang/String;

    invoke-virtual {v0, v1, v4}, Ll2/l;->f(Landroid/content/pm/PackageManager;Ljava/lang/String;)[Landroid/content/pm/Signature;

    move-result-object v0

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    array-length v6, v0

    :goto_3
    if-ge v3, v6, :cond_4

    aget-object v7, v0, v3

    invoke-virtual {v7}, Landroid/content/pm/Signature;->toByteArray()[B

    move-result-object v7

    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_3

    :cond_4
    invoke-static {v1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    new-instance v1, Ll/p;

    const-string v3, "emojicompat-emoji-font"

    invoke-direct {v1, v2, v4, v3, v0}, Ll/p;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_4

    :catch_0
    move-exception v0

    const-string v1, "emoji2.text.DefaultEmojiConfig"

    invoke-static {v1, v0}, Landroid/util/Log;->wtf(Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_2

    :goto_4
    if-nez v1, :cond_5

    goto :goto_5

    :cond_5
    new-instance v5, Li3/y;

    new-instance v0, Li3/x;

    invoke-direct {v0, p0, v1}, Li3/x;-><init>(Landroid/content/Context;Ll/p;)V

    invoke-direct {v5, v0}, Li3/h;-><init>(Li3/k;)V

    :goto_5
    return-object v5
.end method

.method public static final s(Landroid/content/Context;)Li4/o;
    .locals 14

    new-instance v0, Li4/h;

    invoke-direct {v0, p0}, Li4/h;-><init>(Landroid/content/Context;)V

    new-instance p0, Li4/o;

    iget-object v2, v0, Li4/h;->a:Landroid/content/Context;

    iget-object v3, v0, Li4/h;->b:Ls4/c;

    new-instance v1, Li4/f;

    const/4 v4, 0x0

    invoke-direct {v1, v0, v4}, Li4/f;-><init>(Li4/h;I)V

    new-instance v4, Lq8/i;

    invoke-direct {v4, v1}, Lq8/i;-><init>(Lc9/a;)V

    new-instance v1, Li4/f;

    const/4 v5, 0x1

    invoke-direct {v1, v0, v5}, Li4/f;-><init>(Li4/h;I)V

    new-instance v5, Lq8/i;

    invoke-direct {v5, v1}, Lq8/i;-><init>(Lc9/a;)V

    sget-object v1, Li4/g;->a:Li4/g;

    new-instance v6, Lq8/i;

    invoke-direct {v6, v1}, Lq8/i;-><init>(Lc9/a;)V

    new-instance v13, Li4/c;

    sget-object v12, Lr8/r;->a:Lr8/r;

    move-object v7, v13

    move-object v8, v12

    move-object v9, v12

    move-object v10, v12

    move-object v11, v12

    invoke-direct/range {v7 .. v12}, Li4/c;-><init>(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    iget-object v8, v0, Li4/h;->c:Lw4/j;

    move-object v1, p0

    move-object v7, v13

    invoke-direct/range {v1 .. v8}, Li4/o;-><init>(Landroid/content/Context;Ls4/c;Lq8/i;Lq8/i;Lq8/i;Li4/c;Lw4/j;)V

    return-object p0
.end method

.method public static final t(II)Z
    .locals 0

    if-ne p0, p1, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static u(III)V
    .locals 4

    invoke-static {}, Lo7/d0;->P()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-static {}, Lo7/d0;->P()Z

    move-result v0

    if-nez v0, :cond_1

    goto/16 :goto_2

    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "input swipe "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string p1, "ShellTapExecutor"

    const-string p2, "newShizukuProcess returned null for: "

    const/4 v0, 0x3

    :try_start_0
    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "sh"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "-c"

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const/4 v1, 0x2

    aput-object p0, v0, v1

    invoke-static {v0}, Lo7/d0;->b0([Ljava/lang/String;)Ljava/lang/Process;

    move-result-object v0

    if-nez v0, :cond_2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_2

    :catch_0
    move-exception p2

    goto :goto_1

    :cond_2
    new-instance p2, Ljava/io/BufferedReader;

    new-instance v1, Ljava/io/InputStreamReader;

    invoke-virtual {v0}, Ljava/lang/Process;->getInputStream()Ljava/io/InputStream;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V

    invoke-direct {p2, v1}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    new-instance v1, Ljava/io/BufferedReader;

    new-instance v2, Ljava/io/InputStreamReader;

    invoke-virtual {v0}, Ljava/lang/Process;->getErrorStream()Ljava/io/InputStream;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V

    invoke-direct {v1, v2}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    :goto_0
    invoke-virtual {p2}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_4

    :cond_3
    invoke-virtual {v1}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object p2

    if-nez p2, :cond_3

    invoke-virtual {v0}, Ljava/lang/Process;->waitFor()I

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->length()I

    goto :goto_2

    :cond_4
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "\n"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :goto_1
    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Exception executing: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, " | "

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p1, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :goto_2
    return-void
.end method

.method public static v(II)V
    .locals 2

    invoke-static {}, Lo7/d0;->P()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-static {p0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p0

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    const-string v0, "input"

    const-string v1, "tap"

    filled-new-array {v0, v1, p0, p1}, [Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lo7/d0;->b0([Ljava/lang/String;)Ljava/lang/Process;

    return-void
.end method

.method public static w(II)I
    .locals 1

    if-ltz p1, :cond_2

    shr-int/lit8 v0, p0, 0x1

    add-int/2addr p0, v0

    add-int/lit8 p0, p0, 0x1

    if-ge p0, p1, :cond_0

    add-int/lit8 p1, p1, -0x1

    invoke-static {p1}, Ljava/lang/Integer;->highestOneBit(I)I

    move-result p0

    shl-int/lit8 p0, p0, 0x1

    :cond_0
    if-gez p0, :cond_1

    const p0, 0x7fffffff

    :cond_1
    return p0

    :cond_2
    new-instance p0, Ljava/lang/AssertionError;

    const-string p1, "cannot store more than MAX_VALUE elements"

    invoke-direct {p0, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p0
.end method

.method public static final y(La0/w;IJLb0/t;JLv/h1;Ly0/b;Ly0/c;Lm2/l;ZI)Lb0/g;
    .locals 13

    move v1, p1

    move-object/from16 v0, p4

    invoke-virtual {v0, p1}, Lb0/t;->a(I)Ljava/lang/Object;

    move-result-object v6

    move-object v0, p0

    check-cast v0, La0/x;

    move-wide v2, p2

    invoke-virtual {v0, p1, v2, v3}, La0/x;->a(IJ)Ljava/util/List;

    move-result-object v3

    new-instance v12, Lb0/g;

    move-object v0, v12

    move/from16 v2, p12

    move-wide/from16 v4, p5

    move-object/from16 v7, p7

    move-object/from16 v8, p8

    move-object/from16 v9, p9

    move-object/from16 v10, p10

    move/from16 v11, p11

    invoke-direct/range {v0 .. v11}, Lb0/g;-><init>(IILjava/util/List;JLjava/lang/Object;Lv/h1;Ly0/b;Ly0/c;Lm2/l;Z)V

    return-object v12
.end method


# virtual methods
.method public abstract F(Ljava/lang/Class;)[Ljava/lang/String;
.end method

.method public I(I)V
    .locals 0

    return-void
.end method

.method public J(JI)V
    .locals 0

    return-void
.end method

.method public K(J)V
    .locals 0

    return-void
.end method

.method public L(J)V
    .locals 0

    return-void
.end method

.method public abstract Q(Ljava/lang/Class;)Z
.end method

.method public abstract a0(Ljava/net/URI;Le8/q1;)Lg8/g1;
.end method

.method public c0(I)V
    .locals 0

    return-void
.end method

.method public d0(JJI)V
    .locals 0

    return-void
.end method

.method public e0(J)V
    .locals 0

    return-void
.end method

.method public f0(J)V
    .locals 0

    return-void
.end method

.method public j0(Le8/c2;)V
    .locals 0

    return-void
.end method

.method public abstract x(Ljava/lang/Class;Ljava/lang/reflect/Field;)Ljava/lang/reflect/Method;
.end method

.method public abstract z(Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
.end method
