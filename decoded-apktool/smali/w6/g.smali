.class public final Lw6/g;
.super Lf4/y;


# instance fields
.field public final synthetic b:I

.field public final synthetic c:Ld7/f;


# direct methods
.method public constructor <init>(Ld7/f;Ljava/lang/Class;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p3, p0, Lw6/g;->b:I

    iput-object p1, p0, Lw6/g;->c:Ld7/f;

    iput-object p2, p0, Lf4/y;->a:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final b(Lcom/google/crypto/tink/shaded/protobuf/b;)Lcom/google/crypto/tink/shaded/protobuf/b0;
    .locals 5

    iget v0, p0, Lw6/g;->b:I

    const/16 v1, 0x20

    iget-object v2, p0, Lw6/g;->c:Ld7/f;

    const/4 v3, 0x0

    packed-switch v0, :pswitch_data_0

    check-cast p1, Li7/v0;

    invoke-static {}, Li7/t0;->E()Li7/s0;

    move-result-object v0

    check-cast v2, Le7/j;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/z;->d()V

    iget-object v1, v0, Lcom/google/crypto/tink/shaded/protobuf/z;->b:Lcom/google/crypto/tink/shaded/protobuf/b0;

    check-cast v1, Li7/t0;

    invoke-static {v1}, Li7/t0;->x(Li7/t0;)V

    invoke-virtual {p1}, Li7/v0;->B()Li7/x0;

    move-result-object v1

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/z;->d()V

    iget-object v2, v0, Lcom/google/crypto/tink/shaded/protobuf/z;->b:Lcom/google/crypto/tink/shaded/protobuf/b0;

    check-cast v2, Li7/t0;

    invoke-static {v2, v1}, Li7/t0;->y(Li7/t0;Li7/x0;)V

    invoke-virtual {p1}, Li7/v0;->A()I

    move-result p1

    invoke-static {p1}, Lj7/q;->a(I)[B

    move-result-object p1

    array-length v1, p1

    invoke-static {p1, v3, v1}, Lcom/google/crypto/tink/shaded/protobuf/l;->i([BII)Lcom/google/crypto/tink/shaded/protobuf/k;

    move-result-object p1

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/z;->d()V

    iget-object v1, v0, Lcom/google/crypto/tink/shaded/protobuf/z;->b:Lcom/google/crypto/tink/shaded/protobuf/b0;

    check-cast v1, Li7/t0;

    invoke-static {v1, p1}, Li7/t0;->z(Li7/t0;Lcom/google/crypto/tink/shaded/protobuf/k;)V

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/z;->a()Lcom/google/crypto/tink/shaded/protobuf/b0;

    move-result-object p1

    check-cast p1, Li7/t0;

    return-object p1

    :pswitch_0
    check-cast p1, Li7/d;

    invoke-static {}, Li7/b;->D()Li7/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/z;->d()V

    iget-object v1, v0, Lcom/google/crypto/tink/shaded/protobuf/z;->b:Lcom/google/crypto/tink/shaded/protobuf/b0;

    check-cast v1, Li7/b;

    invoke-static {v1}, Li7/b;->x(Li7/b;)V

    invoke-virtual {p1}, Li7/d;->z()I

    move-result v1

    invoke-static {v1}, Lj7/q;->a(I)[B

    move-result-object v1

    array-length v2, v1

    invoke-static {v1, v3, v2}, Lcom/google/crypto/tink/shaded/protobuf/l;->i([BII)Lcom/google/crypto/tink/shaded/protobuf/k;

    move-result-object v1

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/z;->d()V

    iget-object v2, v0, Lcom/google/crypto/tink/shaded/protobuf/z;->b:Lcom/google/crypto/tink/shaded/protobuf/b0;

    check-cast v2, Li7/b;

    invoke-static {v2, v1}, Li7/b;->y(Li7/b;Lcom/google/crypto/tink/shaded/protobuf/k;)V

    invoke-virtual {p1}, Li7/d;->A()Li7/f;

    move-result-object p1

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/z;->d()V

    iget-object v1, v0, Lcom/google/crypto/tink/shaded/protobuf/z;->b:Lcom/google/crypto/tink/shaded/protobuf/b0;

    check-cast v1, Li7/b;

    invoke-static {v1, p1}, Li7/b;->z(Li7/b;Li7/f;)V

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/z;->a()Lcom/google/crypto/tink/shaded/protobuf/b0;

    move-result-object p1

    check-cast p1, Li7/b;

    return-object p1

    :pswitch_1
    check-cast p1, Li7/h0;

    invoke-static {}, Li7/f0;->B()Li7/e0;

    move-result-object v0

    invoke-virtual {p1}, Li7/h0;->y()I

    move-result p1

    invoke-static {p1}, Lj7/q;->a(I)[B

    move-result-object p1

    array-length v1, p1

    invoke-static {p1, v3, v1}, Lcom/google/crypto/tink/shaded/protobuf/l;->i([BII)Lcom/google/crypto/tink/shaded/protobuf/k;

    move-result-object p1

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/z;->d()V

    iget-object v1, v0, Lcom/google/crypto/tink/shaded/protobuf/z;->b:Lcom/google/crypto/tink/shaded/protobuf/b0;

    check-cast v1, Li7/f0;

    invoke-static {v1, p1}, Li7/f0;->y(Li7/f0;Lcom/google/crypto/tink/shaded/protobuf/k;)V

    check-cast v2, Lw6/h;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/z;->d()V

    iget-object p1, v0, Lcom/google/crypto/tink/shaded/protobuf/z;->b:Lcom/google/crypto/tink/shaded/protobuf/b0;

    check-cast p1, Li7/f0;

    invoke-static {p1}, Li7/f0;->x(Li7/f0;)V

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/z;->a()Lcom/google/crypto/tink/shaded/protobuf/b0;

    move-result-object p1

    check-cast p1, Li7/f0;

    return-object p1

    :pswitch_2
    check-cast p1, Li7/x1;

    invoke-static {}, Li7/w1;->B()Li7/v1;

    move-result-object p1

    check-cast v2, Lw6/h;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/z;->d()V

    iget-object v0, p1, Lcom/google/crypto/tink/shaded/protobuf/z;->b:Lcom/google/crypto/tink/shaded/protobuf/b0;

    check-cast v0, Li7/w1;

    invoke-static {v0}, Li7/w1;->x(Li7/w1;)V

    invoke-static {v1}, Lj7/q;->a(I)[B

    move-result-object v0

    array-length v1, v0

    invoke-static {v0, v3, v1}, Lcom/google/crypto/tink/shaded/protobuf/l;->i([BII)Lcom/google/crypto/tink/shaded/protobuf/k;

    move-result-object v0

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/z;->d()V

    iget-object v1, p1, Lcom/google/crypto/tink/shaded/protobuf/z;->b:Lcom/google/crypto/tink/shaded/protobuf/b0;

    check-cast v1, Li7/w1;

    invoke-static {v1, v0}, Li7/w1;->y(Li7/w1;Lcom/google/crypto/tink/shaded/protobuf/k;)V

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/z;->a()Lcom/google/crypto/tink/shaded/protobuf/b0;

    move-result-object p1

    check-cast p1, Li7/w1;

    return-object p1

    :pswitch_3
    check-cast p1, Li7/s1;

    invoke-static {}, Li7/r1;->B()Li7/q1;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/z;->d()V

    iget-object v1, v0, Lcom/google/crypto/tink/shaded/protobuf/z;->b:Lcom/google/crypto/tink/shaded/protobuf/b0;

    check-cast v1, Li7/r1;

    invoke-static {v1, p1}, Li7/r1;->y(Li7/r1;Li7/s1;)V

    check-cast v2, Lw6/h;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/z;->d()V

    iget-object p1, v0, Lcom/google/crypto/tink/shaded/protobuf/z;->b:Lcom/google/crypto/tink/shaded/protobuf/b0;

    check-cast p1, Li7/r1;

    invoke-static {p1}, Li7/r1;->x(Li7/r1;)V

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/z;->a()Lcom/google/crypto/tink/shaded/protobuf/b0;

    move-result-object p1

    check-cast p1, Li7/r1;

    return-object p1

    :pswitch_4
    check-cast p1, Li7/p1;

    invoke-static {}, Li7/o1;->B()Li7/n1;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/z;->d()V

    iget-object v1, v0, Lcom/google/crypto/tink/shaded/protobuf/z;->b:Lcom/google/crypto/tink/shaded/protobuf/b0;

    check-cast v1, Li7/o1;

    invoke-static {v1, p1}, Li7/o1;->y(Li7/o1;Li7/p1;)V

    check-cast v2, Lw6/h;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/z;->d()V

    iget-object p1, v0, Lcom/google/crypto/tink/shaded/protobuf/z;->b:Lcom/google/crypto/tink/shaded/protobuf/b0;

    check-cast p1, Li7/o1;

    invoke-static {p1}, Li7/o1;->x(Li7/o1;)V

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/z;->a()Lcom/google/crypto/tink/shaded/protobuf/b0;

    move-result-object p1

    check-cast p1, Li7/o1;

    return-object p1

    :pswitch_5
    check-cast p1, Li7/o0;

    invoke-static {}, Li7/j0;->B()Li7/i0;

    move-result-object p1

    check-cast v2, Lw6/h;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/z;->d()V

    iget-object v0, p1, Lcom/google/crypto/tink/shaded/protobuf/z;->b:Lcom/google/crypto/tink/shaded/protobuf/b0;

    check-cast v0, Li7/j0;

    invoke-static {v0}, Li7/j0;->x(Li7/j0;)V

    invoke-static {v1}, Lj7/q;->a(I)[B

    move-result-object v0

    array-length v1, v0

    invoke-static {v0, v3, v1}, Lcom/google/crypto/tink/shaded/protobuf/l;->i([BII)Lcom/google/crypto/tink/shaded/protobuf/k;

    move-result-object v0

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/z;->d()V

    iget-object v1, p1, Lcom/google/crypto/tink/shaded/protobuf/z;->b:Lcom/google/crypto/tink/shaded/protobuf/b0;

    check-cast v1, Li7/j0;

    invoke-static {v1, v0}, Li7/j0;->y(Li7/j0;Lcom/google/crypto/tink/shaded/protobuf/k;)V

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/z;->a()Lcom/google/crypto/tink/shaded/protobuf/b0;

    move-result-object p1

    check-cast p1, Li7/j0;

    return-object p1

    :pswitch_6
    check-cast p1, Li7/d0;

    invoke-static {}, Li7/b0;->B()Li7/a0;

    move-result-object v0

    invoke-virtual {p1}, Li7/d0;->y()I

    move-result p1

    invoke-static {p1}, Lj7/q;->a(I)[B

    move-result-object p1

    array-length v1, p1

    invoke-static {p1, v3, v1}, Lcom/google/crypto/tink/shaded/protobuf/l;->i([BII)Lcom/google/crypto/tink/shaded/protobuf/k;

    move-result-object p1

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/z;->d()V

    iget-object v1, v0, Lcom/google/crypto/tink/shaded/protobuf/z;->b:Lcom/google/crypto/tink/shaded/protobuf/b0;

    check-cast v1, Li7/b0;

    invoke-static {v1, p1}, Li7/b0;->y(Li7/b0;Lcom/google/crypto/tink/shaded/protobuf/k;)V

    check-cast v2, Lw6/h;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/z;->d()V

    iget-object p1, v0, Lcom/google/crypto/tink/shaded/protobuf/z;->b:Lcom/google/crypto/tink/shaded/protobuf/b0;

    check-cast p1, Li7/b0;

    invoke-static {p1}, Li7/b0;->x(Li7/b0;)V

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/z;->a()Lcom/google/crypto/tink/shaded/protobuf/b0;

    move-result-object p1

    check-cast p1, Li7/b0;

    return-object p1

    :pswitch_7
    check-cast p1, Li7/z;

    invoke-static {}, Li7/x;->B()Li7/w;

    move-result-object v0

    invoke-virtual {p1}, Li7/z;->y()I

    move-result p1

    invoke-static {p1}, Lj7/q;->a(I)[B

    move-result-object p1

    array-length v1, p1

    invoke-static {p1, v3, v1}, Lcom/google/crypto/tink/shaded/protobuf/l;->i([BII)Lcom/google/crypto/tink/shaded/protobuf/k;

    move-result-object p1

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/z;->d()V

    iget-object v1, v0, Lcom/google/crypto/tink/shaded/protobuf/z;->b:Lcom/google/crypto/tink/shaded/protobuf/b0;

    check-cast v1, Li7/x;

    invoke-static {v1, p1}, Li7/x;->y(Li7/x;Lcom/google/crypto/tink/shaded/protobuf/k;)V

    check-cast v2, Lw6/h;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/z;->d()V

    iget-object p1, v0, Lcom/google/crypto/tink/shaded/protobuf/z;->b:Lcom/google/crypto/tink/shaded/protobuf/b0;

    check-cast p1, Li7/x;

    invoke-static {p1}, Li7/x;->x(Li7/x;)V

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/z;->a()Lcom/google/crypto/tink/shaded/protobuf/b0;

    move-result-object p1

    check-cast p1, Li7/x;

    return-object p1

    :pswitch_8
    check-cast p1, Li7/t;

    invoke-static {}, Li7/r;->D()Li7/q;

    move-result-object v0

    invoke-virtual {p1}, Li7/t;->z()I

    move-result v1

    invoke-static {v1}, Lj7/q;->a(I)[B

    move-result-object v1

    array-length v4, v1

    invoke-static {v1, v3, v4}, Lcom/google/crypto/tink/shaded/protobuf/l;->i([BII)Lcom/google/crypto/tink/shaded/protobuf/k;

    move-result-object v1

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/z;->d()V

    iget-object v3, v0, Lcom/google/crypto/tink/shaded/protobuf/z;->b:Lcom/google/crypto/tink/shaded/protobuf/b0;

    check-cast v3, Li7/r;

    invoke-static {v3, v1}, Li7/r;->z(Li7/r;Lcom/google/crypto/tink/shaded/protobuf/k;)V

    invoke-virtual {p1}, Li7/t;->A()Li7/v;

    move-result-object p1

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/z;->d()V

    iget-object v1, v0, Lcom/google/crypto/tink/shaded/protobuf/z;->b:Lcom/google/crypto/tink/shaded/protobuf/b0;

    check-cast v1, Li7/r;

    invoke-static {v1, p1}, Li7/r;->y(Li7/r;Li7/v;)V

    check-cast v2, Lw6/h;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/z;->d()V

    iget-object p1, v0, Lcom/google/crypto/tink/shaded/protobuf/z;->b:Lcom/google/crypto/tink/shaded/protobuf/b0;

    check-cast p1, Li7/r;

    invoke-static {p1}, Li7/r;->x(Li7/r;)V

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/z;->a()Lcom/google/crypto/tink/shaded/protobuf/b0;

    move-result-object p1

    check-cast p1, Li7/r;

    return-object p1

    :pswitch_9
    check-cast p1, Li7/n;

    invoke-static {}, Li7/l;->E()Li7/k;

    move-result-object v0

    invoke-virtual {p1}, Li7/n;->B()Li7/p;

    move-result-object v1

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/z;->d()V

    iget-object v4, v0, Lcom/google/crypto/tink/shaded/protobuf/z;->b:Lcom/google/crypto/tink/shaded/protobuf/b0;

    check-cast v4, Li7/l;

    invoke-static {v4, v1}, Li7/l;->y(Li7/l;Li7/p;)V

    invoke-virtual {p1}, Li7/n;->A()I

    move-result p1

    invoke-static {p1}, Lj7/q;->a(I)[B

    move-result-object p1

    array-length v1, p1

    invoke-static {p1, v3, v1}, Lcom/google/crypto/tink/shaded/protobuf/l;->i([BII)Lcom/google/crypto/tink/shaded/protobuf/k;

    move-result-object p1

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/z;->d()V

    iget-object v1, v0, Lcom/google/crypto/tink/shaded/protobuf/z;->b:Lcom/google/crypto/tink/shaded/protobuf/b0;

    check-cast v1, Li7/l;

    invoke-static {v1, p1}, Li7/l;->z(Li7/l;Lcom/google/crypto/tink/shaded/protobuf/k;)V

    check-cast v2, Lw6/h;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/z;->d()V

    iget-object p1, v0, Lcom/google/crypto/tink/shaded/protobuf/z;->b:Lcom/google/crypto/tink/shaded/protobuf/b0;

    check-cast p1, Li7/l;

    invoke-static {p1}, Li7/l;->x(Li7/l;)V

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/z;->a()Lcom/google/crypto/tink/shaded/protobuf/b0;

    move-result-object p1

    check-cast p1, Li7/l;

    return-object p1

    :pswitch_a
    check-cast p1, Li7/j;

    new-instance v0, Lw6/h;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lw6/h;-><init>(I)V

    invoke-virtual {v0}, Lw6/h;->d()Lw6/g;

    move-result-object v0

    invoke-virtual {p1}, Li7/j;->z()Li7/n;

    move-result-object v1

    invoke-virtual {v0, v1}, Lw6/g;->b(Lcom/google/crypto/tink/shaded/protobuf/b;)Lcom/google/crypto/tink/shaded/protobuf/b0;

    move-result-object v0

    check-cast v0, Li7/l;

    new-instance v1, Le7/j;

    invoke-direct {v1}, Le7/j;-><init>()V

    invoke-virtual {v1}, Le7/j;->d()Lw6/g;

    move-result-object v1

    invoke-virtual {p1}, Li7/j;->A()Li7/v0;

    move-result-object p1

    invoke-virtual {v1, p1}, Lw6/g;->b(Lcom/google/crypto/tink/shaded/protobuf/b;)Lcom/google/crypto/tink/shaded/protobuf/b0;

    move-result-object p1

    check-cast p1, Li7/t0;

    invoke-static {}, Li7/h;->D()Li7/g;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/z;->d()V

    iget-object v3, v1, Lcom/google/crypto/tink/shaded/protobuf/z;->b:Lcom/google/crypto/tink/shaded/protobuf/b0;

    check-cast v3, Li7/h;

    invoke-static {v3, v0}, Li7/h;->y(Li7/h;Li7/l;)V

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/z;->d()V

    iget-object v0, v1, Lcom/google/crypto/tink/shaded/protobuf/z;->b:Lcom/google/crypto/tink/shaded/protobuf/b0;

    check-cast v0, Li7/h;

    invoke-static {v0, p1}, Li7/h;->z(Li7/h;Li7/t0;)V

    check-cast v2, Lw6/h;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/z;->d()V

    iget-object p1, v1, Lcom/google/crypto/tink/shaded/protobuf/z;->b:Lcom/google/crypto/tink/shaded/protobuf/b0;

    check-cast p1, Li7/h;

    invoke-static {p1}, Li7/h;->x(Li7/h;)V

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/z;->a()Lcom/google/crypto/tink/shaded/protobuf/b0;

    move-result-object p1

    check-cast p1, Li7/h;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final e(Lcom/google/crypto/tink/shaded/protobuf/l;)Lcom/google/crypto/tink/shaded/protobuf/b0;
    .locals 1

    iget v0, p0, Lw6/g;->b:I

    packed-switch v0, :pswitch_data_0

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/t;->a()Lcom/google/crypto/tink/shaded/protobuf/t;

    move-result-object v0

    invoke-static {p1, v0}, Li7/v0;->D(Lcom/google/crypto/tink/shaded/protobuf/l;Lcom/google/crypto/tink/shaded/protobuf/t;)Li7/v0;

    move-result-object p1

    return-object p1

    :pswitch_0
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/t;->a()Lcom/google/crypto/tink/shaded/protobuf/t;

    move-result-object v0

    invoke-static {p1, v0}, Li7/d;->C(Lcom/google/crypto/tink/shaded/protobuf/l;Lcom/google/crypto/tink/shaded/protobuf/t;)Li7/d;

    move-result-object p1

    return-object p1

    :pswitch_1
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/t;->a()Lcom/google/crypto/tink/shaded/protobuf/t;

    move-result-object v0

    invoke-static {p1, v0}, Li7/h0;->A(Lcom/google/crypto/tink/shaded/protobuf/l;Lcom/google/crypto/tink/shaded/protobuf/t;)Li7/h0;

    move-result-object p1

    return-object p1

    :pswitch_2
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/t;->a()Lcom/google/crypto/tink/shaded/protobuf/t;

    move-result-object v0

    invoke-static {p1, v0}, Li7/x1;->z(Lcom/google/crypto/tink/shaded/protobuf/l;Lcom/google/crypto/tink/shaded/protobuf/t;)Li7/x1;

    move-result-object p1

    return-object p1

    :pswitch_3
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/t;->a()Lcom/google/crypto/tink/shaded/protobuf/t;

    move-result-object v0

    invoke-static {p1, v0}, Li7/s1;->C(Lcom/google/crypto/tink/shaded/protobuf/l;Lcom/google/crypto/tink/shaded/protobuf/t;)Li7/s1;

    move-result-object p1

    return-object p1

    :pswitch_4
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/t;->a()Lcom/google/crypto/tink/shaded/protobuf/t;

    move-result-object v0

    invoke-static {p1, v0}, Li7/p1;->A(Lcom/google/crypto/tink/shaded/protobuf/l;Lcom/google/crypto/tink/shaded/protobuf/t;)Li7/p1;

    move-result-object p1

    return-object p1

    :pswitch_5
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/t;->a()Lcom/google/crypto/tink/shaded/protobuf/t;

    move-result-object v0

    invoke-static {p1, v0}, Li7/o0;->z(Lcom/google/crypto/tink/shaded/protobuf/l;Lcom/google/crypto/tink/shaded/protobuf/t;)Li7/o0;

    move-result-object p1

    return-object p1

    :pswitch_6
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/t;->a()Lcom/google/crypto/tink/shaded/protobuf/t;

    move-result-object v0

    invoke-static {p1, v0}, Li7/d0;->A(Lcom/google/crypto/tink/shaded/protobuf/l;Lcom/google/crypto/tink/shaded/protobuf/t;)Li7/d0;

    move-result-object p1

    return-object p1

    :pswitch_7
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/t;->a()Lcom/google/crypto/tink/shaded/protobuf/t;

    move-result-object v0

    invoke-static {p1, v0}, Li7/z;->A(Lcom/google/crypto/tink/shaded/protobuf/l;Lcom/google/crypto/tink/shaded/protobuf/t;)Li7/z;

    move-result-object p1

    return-object p1

    :pswitch_8
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/t;->a()Lcom/google/crypto/tink/shaded/protobuf/t;

    move-result-object v0

    invoke-static {p1, v0}, Li7/t;->C(Lcom/google/crypto/tink/shaded/protobuf/l;Lcom/google/crypto/tink/shaded/protobuf/t;)Li7/t;

    move-result-object p1

    return-object p1

    :pswitch_9
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/t;->a()Lcom/google/crypto/tink/shaded/protobuf/t;

    move-result-object v0

    invoke-static {p1, v0}, Li7/n;->D(Lcom/google/crypto/tink/shaded/protobuf/l;Lcom/google/crypto/tink/shaded/protobuf/t;)Li7/n;

    move-result-object p1

    return-object p1

    :pswitch_a
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/t;->a()Lcom/google/crypto/tink/shaded/protobuf/t;

    move-result-object v0

    invoke-static {p1, v0}, Li7/j;->C(Lcom/google/crypto/tink/shaded/protobuf/l;Lcom/google/crypto/tink/shaded/protobuf/t;)Li7/j;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final g(Lcom/google/crypto/tink/shaded/protobuf/b;)V
    .locals 3

    const/16 v0, 0xc

    iget v1, p0, Lw6/g;->b:I

    const/16 v2, 0x10

    packed-switch v1, :pswitch_data_0

    check-cast p1, Li7/v0;

    invoke-virtual {p1}, Li7/v0;->A()I

    move-result v0

    if-lt v0, v2, :cond_0

    invoke-virtual {p1}, Li7/v0;->B()Li7/x0;

    move-result-object p1

    invoke-static {p1}, Le7/j;->j(Li7/x0;)V

    return-void

    :cond_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "key too short"

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_0
    check-cast p1, Li7/d;

    invoke-virtual {p1}, Li7/d;->A()Li7/f;

    move-result-object v0

    invoke-static {v0}, Le7/b;->h(Li7/f;)V

    invoke-virtual {p1}, Li7/d;->z()I

    move-result p1

    const/16 v0, 0x20

    if-ne p1, v0, :cond_1

    return-void

    :cond_1
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "AesCmacKey size wrong, must be 32 bytes"

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_1
    check-cast p1, Li7/h0;

    invoke-virtual {p1}, Li7/h0;->y()I

    move-result v0

    const/16 v1, 0x40

    if-ne v0, v1, :cond_2

    return-void

    :cond_2
    new-instance v0, Ljava/security/InvalidAlgorithmParameterException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "invalid key size: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Li7/h0;->y()I

    move-result p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ". Valid keys must have 64 bytes."

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/security/InvalidAlgorithmParameterException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_2
    check-cast p1, Li7/x1;

    return-void

    :pswitch_3
    check-cast p1, Li7/s1;

    invoke-virtual {p1}, Li7/s1;->A()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_3

    invoke-virtual {p1}, Li7/s1;->B()Z

    move-result p1

    if-eqz p1, :cond_3

    return-void

    :cond_3
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "invalid key format: missing KEK URI or DEK template"

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_4
    check-cast p1, Li7/p1;

    return-void

    :pswitch_5
    check-cast p1, Li7/o0;

    return-void

    :pswitch_6
    check-cast p1, Li7/d0;

    invoke-virtual {p1}, Li7/d0;->y()I

    move-result p1

    invoke-static {p1}, Lj7/r;->a(I)V

    return-void

    :pswitch_7
    check-cast p1, Li7/z;

    invoke-virtual {p1}, Li7/z;->y()I

    move-result p1

    invoke-static {p1}, Lj7/r;->a(I)V

    return-void

    :pswitch_8
    check-cast p1, Li7/t;

    invoke-virtual {p1}, Li7/t;->z()I

    move-result v1

    invoke-static {v1}, Lj7/r;->a(I)V

    invoke-virtual {p1}, Li7/t;->A()Li7/v;

    move-result-object v1

    invoke-virtual {v1}, Li7/v;->z()I

    move-result v1

    if-eq v1, v0, :cond_5

    invoke-virtual {p1}, Li7/t;->A()Li7/v;

    move-result-object p1

    invoke-virtual {p1}, Li7/v;->z()I

    move-result p1

    if-ne p1, v2, :cond_4

    goto :goto_0

    :cond_4
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "invalid IV size; acceptable values have 12 or 16 bytes"

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    :goto_0
    return-void

    :pswitch_9
    check-cast p1, Li7/n;

    invoke-virtual {p1}, Li7/n;->A()I

    move-result v1

    invoke-static {v1}, Lj7/r;->a(I)V

    iget-object v1, p0, Lw6/g;->c:Ld7/f;

    check-cast v1, Lw6/h;

    invoke-virtual {p1}, Li7/n;->B()Li7/p;

    move-result-object p1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Li7/p;->z()I

    move-result v1

    if-lt v1, v0, :cond_6

    invoke-virtual {p1}, Li7/p;->z()I

    move-result p1

    if-gt p1, v2, :cond_6

    return-void

    :cond_6
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "invalid IV size"

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_a
    check-cast p1, Li7/j;

    new-instance v0, Lw6/h;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lw6/h;-><init>(I)V

    invoke-virtual {v0}, Lw6/h;->d()Lw6/g;

    move-result-object v0

    invoke-virtual {p1}, Li7/j;->z()Li7/n;

    move-result-object v1

    invoke-virtual {v0, v1}, Lw6/g;->g(Lcom/google/crypto/tink/shaded/protobuf/b;)V

    new-instance v0, Le7/j;

    invoke-direct {v0}, Le7/j;-><init>()V

    invoke-virtual {v0}, Le7/j;->d()Lw6/g;

    move-result-object v0

    invoke-virtual {p1}, Li7/j;->A()Li7/v0;

    move-result-object v1

    invoke-virtual {v0, v1}, Lw6/g;->g(Lcom/google/crypto/tink/shaded/protobuf/b;)V

    invoke-virtual {p1}, Li7/j;->z()Li7/n;

    move-result-object p1

    invoke-virtual {p1}, Li7/n;->A()I

    move-result p1

    invoke-static {p1}, Lj7/r;->a(I)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final m()Ljava/util/Map;
    .locals 9

    sget-object v0, Li7/r0;->e:Li7/r0;

    iget v1, p0, Lw6/g;->b:I

    const/16 v2, 0x10

    const/16 v3, 0x20

    const/4 v4, 0x3

    const/4 v5, 0x1

    packed-switch v1, :pswitch_data_0

    :pswitch_0
    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object v0

    return-object v0

    :pswitch_1
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    invoke-static {v3, v2, v0, v5}, Le7/j;->h(IILi7/r0;I)Ld7/e;

    move-result-object v6

    const-string v7, "HMAC_SHA256_128BITTAG"

    invoke-virtual {v1, v7, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v3, v2, v0, v4}, Le7/j;->h(IILi7/r0;I)Ld7/e;

    move-result-object v6

    const-string v7, "HMAC_SHA256_128BITTAG_RAW"

    invoke-virtual {v1, v7, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v3, v3, v0, v5}, Le7/j;->h(IILi7/r0;I)Ld7/e;

    move-result-object v6

    const-string v7, "HMAC_SHA256_256BITTAG"

    invoke-virtual {v1, v7, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v3, v3, v0, v4}, Le7/j;->h(IILi7/r0;I)Ld7/e;

    move-result-object v0

    const-string v6, "HMAC_SHA256_256BITTAG_RAW"

    invoke-virtual {v1, v6, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Li7/r0;->f:Li7/r0;

    const/16 v6, 0x40

    invoke-static {v6, v2, v0, v5}, Le7/j;->h(IILi7/r0;I)Ld7/e;

    move-result-object v7

    const-string v8, "HMAC_SHA512_128BITTAG"

    invoke-virtual {v1, v8, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v6, v2, v0, v4}, Le7/j;->h(IILi7/r0;I)Ld7/e;

    move-result-object v2

    const-string v7, "HMAC_SHA512_128BITTAG_RAW"

    invoke-virtual {v1, v7, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v6, v3, v0, v5}, Le7/j;->h(IILi7/r0;I)Ld7/e;

    move-result-object v2

    const-string v7, "HMAC_SHA512_256BITTAG"

    invoke-virtual {v1, v7, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v6, v3, v0, v4}, Le7/j;->h(IILi7/r0;I)Ld7/e;

    move-result-object v2

    const-string v3, "HMAC_SHA512_256BITTAG_RAW"

    invoke-virtual {v1, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v6, v6, v0, v5}, Le7/j;->h(IILi7/r0;I)Ld7/e;

    move-result-object v2

    const-string v3, "HMAC_SHA512_512BITTAG"

    invoke-virtual {v1, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v6, v6, v0, v4}, Le7/j;->h(IILi7/r0;I)Ld7/e;

    move-result-object v0

    const-string v2, "HMAC_SHA512_512BITTAG_RAW"

    invoke-virtual {v1, v2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v1}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    return-object v0

    :pswitch_2
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    new-instance v1, Ld7/e;

    invoke-static {}, Li7/d;->B()Li7/c;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/crypto/tink/shaded/protobuf/z;->d()V

    iget-object v3, v2, Lcom/google/crypto/tink/shaded/protobuf/z;->b:Lcom/google/crypto/tink/shaded/protobuf/b0;

    check-cast v3, Li7/d;

    invoke-static {v3}, Li7/d;->x(Li7/d;)V

    invoke-static {}, Li7/f;->A()Li7/e;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/crypto/tink/shaded/protobuf/z;->d()V

    iget-object v6, v3, Lcom/google/crypto/tink/shaded/protobuf/z;->b:Lcom/google/crypto/tink/shaded/protobuf/b0;

    check-cast v6, Li7/f;

    invoke-static {v6}, Li7/f;->x(Li7/f;)V

    invoke-virtual {v3}, Lcom/google/crypto/tink/shaded/protobuf/z;->a()Lcom/google/crypto/tink/shaded/protobuf/b0;

    move-result-object v3

    check-cast v3, Li7/f;

    invoke-virtual {v2}, Lcom/google/crypto/tink/shaded/protobuf/z;->d()V

    iget-object v6, v2, Lcom/google/crypto/tink/shaded/protobuf/z;->b:Lcom/google/crypto/tink/shaded/protobuf/b0;

    check-cast v6, Li7/d;

    invoke-static {v6, v3}, Li7/d;->y(Li7/d;Li7/f;)V

    invoke-virtual {v2}, Lcom/google/crypto/tink/shaded/protobuf/z;->a()Lcom/google/crypto/tink/shaded/protobuf/b0;

    move-result-object v2

    check-cast v2, Li7/d;

    invoke-direct {v1, v2, v5}, Ld7/e;-><init>(Lcom/google/crypto/tink/shaded/protobuf/b0;I)V

    const-string v2, "AES_CMAC"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Ld7/e;

    invoke-static {}, Li7/d;->B()Li7/c;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/crypto/tink/shaded/protobuf/z;->d()V

    iget-object v3, v2, Lcom/google/crypto/tink/shaded/protobuf/z;->b:Lcom/google/crypto/tink/shaded/protobuf/b0;

    check-cast v3, Li7/d;

    invoke-static {v3}, Li7/d;->x(Li7/d;)V

    invoke-static {}, Li7/f;->A()Li7/e;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/crypto/tink/shaded/protobuf/z;->d()V

    iget-object v6, v3, Lcom/google/crypto/tink/shaded/protobuf/z;->b:Lcom/google/crypto/tink/shaded/protobuf/b0;

    check-cast v6, Li7/f;

    invoke-static {v6}, Li7/f;->x(Li7/f;)V

    invoke-virtual {v3}, Lcom/google/crypto/tink/shaded/protobuf/z;->a()Lcom/google/crypto/tink/shaded/protobuf/b0;

    move-result-object v3

    check-cast v3, Li7/f;

    invoke-virtual {v2}, Lcom/google/crypto/tink/shaded/protobuf/z;->d()V

    iget-object v6, v2, Lcom/google/crypto/tink/shaded/protobuf/z;->b:Lcom/google/crypto/tink/shaded/protobuf/b0;

    check-cast v6, Li7/d;

    invoke-static {v6, v3}, Li7/d;->y(Li7/d;Li7/f;)V

    invoke-virtual {v2}, Lcom/google/crypto/tink/shaded/protobuf/z;->a()Lcom/google/crypto/tink/shaded/protobuf/b0;

    move-result-object v2

    check-cast v2, Li7/d;

    invoke-direct {v1, v2, v5}, Ld7/e;-><init>(Lcom/google/crypto/tink/shaded/protobuf/b0;I)V

    const-string v2, "AES256_CMAC"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Ld7/e;

    invoke-static {}, Li7/d;->B()Li7/c;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/crypto/tink/shaded/protobuf/z;->d()V

    iget-object v3, v2, Lcom/google/crypto/tink/shaded/protobuf/z;->b:Lcom/google/crypto/tink/shaded/protobuf/b0;

    check-cast v3, Li7/d;

    invoke-static {v3}, Li7/d;->x(Li7/d;)V

    invoke-static {}, Li7/f;->A()Li7/e;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/crypto/tink/shaded/protobuf/z;->d()V

    iget-object v5, v3, Lcom/google/crypto/tink/shaded/protobuf/z;->b:Lcom/google/crypto/tink/shaded/protobuf/b0;

    check-cast v5, Li7/f;

    invoke-static {v5}, Li7/f;->x(Li7/f;)V

    invoke-virtual {v3}, Lcom/google/crypto/tink/shaded/protobuf/z;->a()Lcom/google/crypto/tink/shaded/protobuf/b0;

    move-result-object v3

    check-cast v3, Li7/f;

    invoke-virtual {v2}, Lcom/google/crypto/tink/shaded/protobuf/z;->d()V

    iget-object v5, v2, Lcom/google/crypto/tink/shaded/protobuf/z;->b:Lcom/google/crypto/tink/shaded/protobuf/b0;

    check-cast v5, Li7/d;

    invoke-static {v5, v3}, Li7/d;->y(Li7/d;Li7/f;)V

    invoke-virtual {v2}, Lcom/google/crypto/tink/shaded/protobuf/z;->a()Lcom/google/crypto/tink/shaded/protobuf/b0;

    move-result-object v2

    check-cast v2, Li7/d;

    invoke-direct {v1, v2, v4}, Ld7/e;-><init>(Lcom/google/crypto/tink/shaded/protobuf/b0;I)V

    const-string v2, "AES256_CMAC_RAW"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    return-object v0

    :pswitch_3
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    new-instance v1, Ld7/e;

    invoke-static {}, Li7/h0;->z()Li7/g0;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/crypto/tink/shaded/protobuf/z;->d()V

    iget-object v3, v2, Lcom/google/crypto/tink/shaded/protobuf/z;->b:Lcom/google/crypto/tink/shaded/protobuf/b0;

    check-cast v3, Li7/h0;

    invoke-static {v3}, Li7/h0;->x(Li7/h0;)V

    invoke-virtual {v2}, Lcom/google/crypto/tink/shaded/protobuf/z;->a()Lcom/google/crypto/tink/shaded/protobuf/b0;

    move-result-object v2

    check-cast v2, Li7/h0;

    invoke-direct {v1, v2, v5}, Ld7/e;-><init>(Lcom/google/crypto/tink/shaded/protobuf/b0;I)V

    const-string v2, "AES256_SIV"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Ld7/e;

    invoke-static {}, Li7/h0;->z()Li7/g0;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/crypto/tink/shaded/protobuf/z;->d()V

    iget-object v3, v2, Lcom/google/crypto/tink/shaded/protobuf/z;->b:Lcom/google/crypto/tink/shaded/protobuf/b0;

    check-cast v3, Li7/h0;

    invoke-static {v3}, Li7/h0;->x(Li7/h0;)V

    invoke-virtual {v2}, Lcom/google/crypto/tink/shaded/protobuf/z;->a()Lcom/google/crypto/tink/shaded/protobuf/b0;

    move-result-object v2

    check-cast v2, Li7/h0;

    invoke-direct {v1, v2, v4}, Ld7/e;-><init>(Lcom/google/crypto/tink/shaded/protobuf/b0;I)V

    const-string v2, "AES256_SIV_RAW"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    return-object v0

    :pswitch_4
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    new-instance v1, Ld7/e;

    invoke-static {}, Li7/x1;->y()Li7/x1;

    move-result-object v2

    invoke-direct {v1, v2, v5}, Ld7/e;-><init>(Lcom/google/crypto/tink/shaded/protobuf/b0;I)V

    const-string v2, "XCHACHA20_POLY1305"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Ld7/e;

    invoke-static {}, Li7/x1;->y()Li7/x1;

    move-result-object v2

    invoke-direct {v1, v2, v4}, Ld7/e;-><init>(Lcom/google/crypto/tink/shaded/protobuf/b0;I)V

    const-string v2, "XCHACHA20_POLY1305_RAW"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    return-object v0

    :pswitch_5
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    new-instance v1, Ld7/e;

    invoke-static {}, Li7/o0;->y()Li7/o0;

    move-result-object v2

    invoke-direct {v1, v2, v5}, Ld7/e;-><init>(Lcom/google/crypto/tink/shaded/protobuf/b0;I)V

    const-string v2, "CHACHA20_POLY1305"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Ld7/e;

    invoke-static {}, Li7/o0;->y()Li7/o0;

    move-result-object v2

    invoke-direct {v1, v2, v4}, Ld7/e;-><init>(Lcom/google/crypto/tink/shaded/protobuf/b0;I)V

    const-string v2, "CHACHA20_POLY1305_RAW"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    return-object v0

    :pswitch_6
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    invoke-static {v2, v5}, Lw6/h;->k(II)Ld7/e;

    move-result-object v1

    const-string v6, "AES128_GCM_SIV"

    invoke-virtual {v0, v6, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v2, v4}, Lw6/h;->k(II)Ld7/e;

    move-result-object v1

    const-string v2, "AES128_GCM_SIV_RAW"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v3, v5}, Lw6/h;->k(II)Ld7/e;

    move-result-object v1

    const-string v2, "AES256_GCM_SIV"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v3, v4}, Lw6/h;->k(II)Ld7/e;

    move-result-object v1

    const-string v2, "AES256_GCM_SIV_RAW"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    return-object v0

    :pswitch_7
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    invoke-static {v2, v5}, Lw6/h;->j(II)Ld7/e;

    move-result-object v1

    const-string v6, "AES128_GCM"

    invoke-virtual {v0, v6, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v2, v4}, Lw6/h;->j(II)Ld7/e;

    move-result-object v1

    const-string v2, "AES128_GCM_RAW"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v3, v5}, Lw6/h;->j(II)Ld7/e;

    move-result-object v1

    const-string v2, "AES256_GCM"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v3, v4}, Lw6/h;->j(II)Ld7/e;

    move-result-object v1

    const-string v2, "AES256_GCM_RAW"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    return-object v0

    :pswitch_8
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    invoke-static {v2, v5}, Lw6/h;->h(II)Ld7/e;

    move-result-object v1

    const-string v6, "AES128_EAX"

    invoke-virtual {v0, v6, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v2, v4}, Lw6/h;->h(II)Ld7/e;

    move-result-object v1

    const-string v2, "AES128_EAX_RAW"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v3, v5}, Lw6/h;->h(II)Ld7/e;

    move-result-object v1

    const-string v2, "AES256_EAX"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v3, v4}, Lw6/h;->h(II)Ld7/e;

    move-result-object v1

    const-string v2, "AES256_EAX_RAW"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    return-object v0

    :pswitch_9
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    invoke-static {v2, v2, v5}, Lw6/h;->i(III)Ld7/e;

    move-result-object v1

    const-string v6, "AES128_CTR_HMAC_SHA256"

    invoke-virtual {v0, v6, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v2, v2, v4}, Lw6/h;->i(III)Ld7/e;

    move-result-object v1

    const-string v2, "AES128_CTR_HMAC_SHA256_RAW"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v3, v3, v5}, Lw6/h;->i(III)Ld7/e;

    move-result-object v1

    const-string v2, "AES256_CTR_HMAC_SHA256"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v3, v3, v4}, Lw6/h;->i(III)Ld7/e;

    move-result-object v1

    const-string v2, "AES256_CTR_HMAC_SHA256_RAW"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_9
        :pswitch_0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_0
        :pswitch_0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method
