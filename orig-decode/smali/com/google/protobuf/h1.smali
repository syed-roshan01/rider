.class public abstract Lcom/google/protobuf/h1;
.super Ljava/lang/Object;


# static fields
.field public static final a:Lcom/google/protobuf/f1;

.field public static final b:Lcom/google/protobuf/g1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/protobuf/f1;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/google/protobuf/h1;->a:Lcom/google/protobuf/f1;

    new-instance v0, Lcom/google/protobuf/g1;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/google/protobuf/h1;->b:Lcom/google/protobuf/g1;

    return-void
.end method


# virtual methods
.method public abstract a(Ljava/lang/Object;J)V
.end method

.method public abstract b(Ljava/lang/Object;JLjava/lang/Object;)V
.end method

.method public abstract c(Ljava/lang/Object;J)Ljava/util/List;
.end method
