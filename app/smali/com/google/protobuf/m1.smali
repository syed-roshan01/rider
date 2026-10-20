.class public final Lcom/google/protobuf/m1;
.super Ljava/lang/Object;


# instance fields
.field public final a:Li3/a0;

.field public final b:Ljava/lang/Object;

.field public final c:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lcom/google/protobuf/d3;Lcom/google/protobuf/h3;Ljava/lang/Object;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Li3/a0;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object p1, v0, Li3/a0;->a:Ljava/lang/Object;

    const-string p1, ""

    iput-object p1, v0, Li3/a0;->b:Ljava/lang/Object;

    iput-object p2, v0, Li3/a0;->c:Ljava/lang/Object;

    iput-object p3, v0, Li3/a0;->d:Ljava/lang/Object;

    iput-object v0, p0, Lcom/google/protobuf/m1;->a:Li3/a0;

    iput-object p3, p0, Lcom/google/protobuf/m1;->c:Ljava/lang/Object;

    return-void
.end method

.method public static a(Li3/a0;Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 2

    iget-object v0, p0, Li3/a0;->a:Ljava/lang/Object;

    check-cast v0, Lcom/google/protobuf/h3;

    const/4 v1, 0x1

    invoke-static {v0, v1, p1}, Lcom/google/protobuf/c0;->a(Lcom/google/protobuf/h3;ILjava/lang/Object;)I

    move-result p1

    iget-object p0, p0, Li3/a0;->c:Ljava/lang/Object;

    check-cast p0, Lcom/google/protobuf/h3;

    const/4 v0, 0x2

    invoke-static {p0, v0, p2}, Lcom/google/protobuf/c0;->a(Lcom/google/protobuf/h3;ILjava/lang/Object;)I

    move-result p0

    add-int/2addr p0, p1

    return p0
.end method
