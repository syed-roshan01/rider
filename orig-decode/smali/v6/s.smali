.class public abstract Lv6/s;
.super Ljava/lang/Object;


# static fields
.field public static final synthetic a:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "UTF-8"

    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    return-void
.end method

.method public static a(Li7/i1;)Li7/m1;
    .locals 5

    invoke-static {}, Li7/m1;->A()Li7/j1;

    move-result-object v0

    invoke-virtual {p0}, Li7/i1;->C()I

    move-result v1

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/z;->d()V

    iget-object v2, v0, Lcom/google/crypto/tink/shaded/protobuf/z;->b:Lcom/google/crypto/tink/shaded/protobuf/b0;

    check-cast v2, Li7/m1;

    invoke-static {v2, v1}, Li7/m1;->x(Li7/m1;I)V

    invoke-virtual {p0}, Li7/i1;->B()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Li7/h1;

    invoke-static {}, Li7/l1;->C()Li7/k1;

    move-result-object v2

    invoke-virtual {v1}, Li7/h1;->B()Li7/a1;

    move-result-object v3

    invoke-virtual {v3}, Li7/a1;->C()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2}, Lcom/google/crypto/tink/shaded/protobuf/z;->d()V

    iget-object v4, v2, Lcom/google/crypto/tink/shaded/protobuf/z;->b:Lcom/google/crypto/tink/shaded/protobuf/b0;

    check-cast v4, Li7/l1;

    invoke-static {v4, v3}, Li7/l1;->x(Li7/l1;Ljava/lang/String;)V

    invoke-virtual {v1}, Li7/h1;->E()Li7/b1;

    move-result-object v3

    invoke-virtual {v2}, Lcom/google/crypto/tink/shaded/protobuf/z;->d()V

    iget-object v4, v2, Lcom/google/crypto/tink/shaded/protobuf/z;->b:Lcom/google/crypto/tink/shaded/protobuf/b0;

    check-cast v4, Li7/l1;

    invoke-static {v4, v3}, Li7/l1;->z(Li7/l1;Li7/b1;)V

    invoke-virtual {v1}, Li7/h1;->D()Li7/t1;

    move-result-object v3

    invoke-virtual {v2}, Lcom/google/crypto/tink/shaded/protobuf/z;->d()V

    iget-object v4, v2, Lcom/google/crypto/tink/shaded/protobuf/z;->b:Lcom/google/crypto/tink/shaded/protobuf/b0;

    check-cast v4, Li7/l1;

    invoke-static {v4, v3}, Li7/l1;->y(Li7/l1;Li7/t1;)V

    invoke-virtual {v1}, Li7/h1;->C()I

    move-result v1

    invoke-virtual {v2}, Lcom/google/crypto/tink/shaded/protobuf/z;->d()V

    iget-object v3, v2, Lcom/google/crypto/tink/shaded/protobuf/z;->b:Lcom/google/crypto/tink/shaded/protobuf/b0;

    check-cast v3, Li7/l1;

    invoke-static {v3, v1}, Li7/l1;->A(Li7/l1;I)V

    invoke-virtual {v2}, Lcom/google/crypto/tink/shaded/protobuf/z;->a()Lcom/google/crypto/tink/shaded/protobuf/b0;

    move-result-object v1

    check-cast v1, Li7/l1;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/z;->d()V

    iget-object v2, v0, Lcom/google/crypto/tink/shaded/protobuf/z;->b:Lcom/google/crypto/tink/shaded/protobuf/b0;

    check-cast v2, Li7/m1;

    invoke-static {v2, v1}, Li7/m1;->y(Li7/m1;Li7/l1;)V

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/z;->a()Lcom/google/crypto/tink/shaded/protobuf/b0;

    move-result-object p0

    check-cast p0, Li7/m1;

    return-object p0
.end method
