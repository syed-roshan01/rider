.class public final Ll8/b;
.super Ljava/lang/Object;

# interfaces
.implements Le8/n1;


# static fields
.field public static final d:Ljava/lang/ThreadLocal;


# instance fields
.field public final a:Lcom/google/protobuf/b2;

.field public final b:Lcom/google/protobuf/t1;

.field public final c:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/ThreadLocal;

    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    sput-object v0, Ll8/b;->d:Ljava/lang/ThreadLocal;

    return-void
.end method

.method public constructor <init>(Lcom/google/protobuf/l0;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "defaultInstance cannot be null"

    invoke-static {p1, v0}, Ly3/e;->J(Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object p1, p0, Ll8/b;->b:Lcom/google/protobuf/t1;

    invoke-interface {p1}, Lcom/google/protobuf/t1;->getParserForType()Lcom/google/protobuf/b2;

    move-result-object p1

    iput-object p1, p0, Ll8/b;->a:Lcom/google/protobuf/b2;

    const/4 p1, -0x1

    iput p1, p0, Ll8/b;->c:I

    return-void
.end method
