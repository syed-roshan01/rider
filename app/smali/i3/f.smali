.class public final Li3/f;
.super Lh6/g;


# instance fields
.field public final synthetic u:Li3/g;


# direct methods
.method public constructor <init>(Li3/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li3/f;->u:Li3/g;

    return-void
.end method


# virtual methods
.method public final t0(Ljava/lang/Throwable;)V
    .locals 1

    iget-object v0, p0, Li3/f;->u:Li3/g;

    iget-object v0, v0, Lk/f;->b:Ljava/lang/Object;

    check-cast v0, Li3/l;

    invoke-virtual {v0, p1}, Li3/l;->e(Ljava/lang/Throwable;)V

    return-void
.end method

.method public final u0(Li3/a0;)V
    .locals 10

    iget-object v0, p0, Li3/f;->u:Li3/g;

    iput-object p1, v0, Li3/g;->d:Li3/a0;

    new-instance p1, Lj0/b0;

    iget-object v1, v0, Li3/g;->d:Li3/a0;

    iget-object v2, v0, Lk/f;->b:Ljava/lang/Object;

    move-object v3, v2

    check-cast v3, Li3/l;

    iget-object v4, v3, Li3/l;->g:Ll2/l;

    iget-object v3, v3, Li3/l;->i:Li3/e;

    check-cast v2, Li3/l;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v5, 0x22

    if-lt v2, v5, :cond_0

    invoke-static {}, Li3/q;->a()Ljava/util/Set;

    move-result-object v2

    goto :goto_0

    :cond_0
    invoke-static {}, Lo7/d0;->D()Ljava/util/Set;

    move-result-object v2

    :goto_0
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object v4, p1, Lj0/b0;->b:Ljava/lang/Object;

    iput-object v1, p1, Lj0/b0;->c:Ljava/lang/Object;

    iput-object v3, p1, Lj0/b0;->d:Ljava/lang/Object;

    const/4 v8, 0x0

    iput-boolean v8, p1, Lj0/b0;->a:Z

    const/4 v1, 0x0

    iput-object v1, p1, Lj0/b0;->e:Ljava/lang/Object;

    invoke-interface {v2}, Ljava/util/Set;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_2

    :cond_1
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_1
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [I

    new-instance v2, Ljava/lang/String;

    array-length v3, v1

    invoke-direct {v2, v1, v8, v3}, Ljava/lang/String;-><init>([III)V

    new-instance v7, Li3/u;

    invoke-direct {v7, v2, v8}, Li3/u;-><init>(Ljava/lang/String;I)V

    const/4 v3, 0x0

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v4

    const/4 v5, 0x1

    const/4 v6, 0x1

    move-object v1, p1

    invoke-virtual/range {v1 .. v7}, Lj0/b0;->i(Ljava/lang/CharSequence;IIIZLi3/s;)Ljava/lang/Object;

    goto :goto_1

    :cond_2
    :goto_2
    iput-object p1, v0, Li3/g;->c:Lj0/b0;

    iget-object p1, v0, Lk/f;->b:Ljava/lang/Object;

    check-cast p1, Li3/l;

    invoke-virtual {p1}, Li3/l;->f()V

    return-void
.end method
