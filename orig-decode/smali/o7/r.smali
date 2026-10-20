.class public abstract Lo7/r;
.super Ljava/lang/Object;


# static fields
.field public static final a:Lcom/google/protobuf/m1;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    sget-object v0, Lcom/google/protobuf/h3;->c:Lcom/google/protobuf/d3;

    sget-object v1, Lcom/google/protobuf/h3;->e:Lcom/google/protobuf/f3;

    invoke-static {}, Lo7/i2;->t()Lo7/i2;

    move-result-object v2

    new-instance v3, Lcom/google/protobuf/m1;

    invoke-direct {v3, v0, v1, v2}, Lcom/google/protobuf/m1;-><init>(Lcom/google/protobuf/d3;Lcom/google/protobuf/h3;Ljava/lang/Object;)V

    sput-object v3, Lo7/r;->a:Lcom/google/protobuf/m1;

    return-void
.end method
