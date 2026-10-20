.class public final Lcom/google/protobuf/z;
.super Ljava/lang/Object;


# static fields
.field public static volatile a:Lcom/google/protobuf/z;

.field public static final b:Lcom/google/protobuf/z;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/protobuf/z;

    invoke-direct {v0}, Lcom/google/protobuf/z;-><init>()V

    sput-object v0, Lcom/google/protobuf/z;->b:Lcom/google/protobuf/z;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    return-void
.end method

.method public static a()Lcom/google/protobuf/z;
    .locals 6

    sget-object v0, Lcom/google/protobuf/z;->a:Lcom/google/protobuf/z;

    if-nez v0, :cond_3

    const-class v1, Lcom/google/protobuf/z;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lcom/google/protobuf/z;->a:Lcom/google/protobuf/z;

    if-nez v0, :cond_2

    const-string v0, "getEmptyRegistry"

    sget-object v2, Lcom/google/protobuf/y;->a:Ljava/lang/Class;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v3, 0x0

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    :try_start_1
    new-array v5, v4, [Ljava/lang/Class;

    invoke-virtual {v2, v0, v5}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    new-array v2, v4, [Ljava/lang/Object;

    invoke-virtual {v0, v3, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/z;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-object v3, v0

    :catch_0
    :goto_0
    if-eqz v3, :cond_1

    goto :goto_1

    :cond_1
    :try_start_2
    sget-object v3, Lcom/google/protobuf/z;->b:Lcom/google/protobuf/z;

    :goto_1
    sput-object v3, Lcom/google/protobuf/z;->a:Lcom/google/protobuf/z;

    move-object v0, v3

    goto :goto_2

    :catchall_0
    move-exception v0

    goto :goto_3

    :cond_2
    :goto_2
    monitor-exit v1

    goto :goto_4

    :goto_3
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0

    :cond_3
    :goto_4
    return-object v0
.end method
