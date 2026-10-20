.class public final Lu/z;
.super Ld9/j;

# interfaces
.implements Lc9/c;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Z

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;

.field public final synthetic e:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lc9/a;ZLe1/y;Le1/l;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Lu/z;->a:I

    iput-object p1, p0, Lu/z;->e:Ljava/lang/Object;

    iput-boolean p2, p0, Lu/z;->b:Z

    iput-object p3, p0, Lu/z;->c:Ljava/lang/Object;

    iput-object p4, p0, Lu/z;->d:Ljava/lang/Object;

    const/4 p1, 0x1

    .line 1
    invoke-direct {p0, p1}, Ld9/j;-><init>(I)V

    return-void
.end method

.method public constructor <init>(Ljava/util/ArrayList;Lz/x;ZLm0/g1;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lu/z;->a:I

    iput-object p1, p0, Lu/z;->c:Ljava/lang/Object;

    iput-object p2, p0, Lu/z;->d:Ljava/lang/Object;

    iput-boolean p3, p0, Lu/z;->b:Z

    iput-object p4, p0, Lu/z;->e:Ljava/lang/Object;

    .line 2
    invoke-direct {p0, v0}, Ld9/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    sget-object v0, Lq8/l;->a:Lq8/l;

    iget v1, p0, Lu/z;->a:I

    iget-object v2, p0, Lu/z;->c:Ljava/lang/Object;

    iget-object v3, p0, Lu/z;->d:Ljava/lang/Object;

    iget-object v4, p0, Lu/z;->e:Ljava/lang/Object;

    packed-switch v1, :pswitch_data_0

    check-cast p1, Lg1/e;

    check-cast p1, Lt1/i0;

    invoke-virtual {p1}, Lt1/i0;->a()V

    check-cast v4, Lc9/a;

    invoke-interface {v4}, Lc9/a;->invoke()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    iget-boolean v1, p0, Lu/z;->b:Z

    if-eqz v1, :cond_1

    check-cast v2, Le1/y;

    check-cast v3, Le1/l;

    iget-object v1, p1, Lt1/i0;->a:Lg1/c;

    invoke-interface {v1}, Lg1/g;->O()J

    move-result-wide v4

    iget-object v1, v1, Lg1/c;->b:Lg1/b;

    invoke-virtual {v1}, Lg1/b;->b()J

    move-result-wide v6

    invoke-virtual {v1}, Lg1/b;->a()Le1/p;

    move-result-object v8

    invoke-interface {v8}, Le1/p;->j()V

    iget-object v8, v1, Lg1/b;->a:Lg1/d;

    const/high16 v9, -0x40800000    # -1.0f

    const/high16 v10, 0x3f800000    # 1.0f

    invoke-virtual {v8, v9, v10, v4, v5}, Lg1/d;->b(FFJ)V

    invoke-static {p1, v2, v3}, Lg1/g;->l0(Lg1/g;Le1/y;Le1/l;)V

    invoke-virtual {v1}, Lg1/b;->a()Le1/p;

    move-result-object p1

    invoke-interface {p1}, Le1/p;->h()V

    invoke-virtual {v1, v6, v7}, Lg1/b;->c(J)V

    goto :goto_0

    :cond_1
    check-cast v2, Le1/y;

    check-cast v3, Le1/l;

    invoke-static {p1, v2, v3}, Lg1/g;->l0(Lg1/g;Le1/y;Le1/l;)V

    :goto_0
    return-object v0

    :pswitch_0
    check-cast p1, Lr1/w0;

    check-cast v2, Ljava/util/List;

    check-cast v3, Lz/x;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v1

    const/4 v5, 0x0

    :goto_1
    if-ge v5, v1, :cond_3

    invoke-interface {v2, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lz/x;

    if-eq v6, v3, :cond_2

    invoke-virtual {v6, p1}, Lz/x;->b(Lr1/w0;)V

    :cond_2
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_3
    if-eqz v3, :cond_4

    invoke-virtual {v3, p1}, Lz/x;->b(Lr1/w0;)V

    :cond_4
    check-cast v4, Lm0/g1;

    invoke-interface {v4}, Lm0/l3;->getValue()Ljava/lang/Object;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method
