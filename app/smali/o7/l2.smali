.class public final Lo7/l2;
.super Lcom/google/protobuf/l0;

# interfaces
.implements Lo7/m2;


# static fields
.field public static final CURRENT_DOCUMENT_FIELD_NUMBER:I = 0x4

.field private static final DEFAULT_INSTANCE:Lo7/l2;

.field public static final DELETE_FIELD_NUMBER:I = 0x2

.field private static volatile PARSER:Lcom/google/protobuf/b2; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/b2;"
        }
    .end annotation
.end field

.field public static final TRANSFORM_FIELD_NUMBER:I = 0x6

.field public static final UPDATE_FIELD_NUMBER:I = 0x1

.field public static final UPDATE_MASK_FIELD_NUMBER:I = 0x3

.field public static final UPDATE_TRANSFORMS_FIELD_NUMBER:I = 0x7

.field public static final VERIFY_FIELD_NUMBER:I = 0x5


# instance fields
.field private currentDocument_:Lo7/m0;

.field private operationCase_:I

.field private operation_:Ljava/lang/Object;

.field private updateMask_:Lo7/w;

.field private updateTransforms_:Lcom/google/protobuf/x0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/x0;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lo7/l2;

    invoke-direct {v0}, Lo7/l2;-><init>()V

    sput-object v0, Lo7/l2;->DEFAULT_INSTANCE:Lo7/l2;

    const-class v1, Lo7/l2;

    invoke-static {v1, v0}, Lcom/google/protobuf/l0;->registerDefaultInstance(Ljava/lang/Class;Lcom/google/protobuf/l0;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/protobuf/l0;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lo7/l2;->operationCase_:I

    invoke-static {}, Lcom/google/protobuf/l0;->emptyProtobufList()Lcom/google/protobuf/x0;

    move-result-object v0

    iput-object v0, p0, Lo7/l2;->updateTransforms_:Lcom/google/protobuf/x0;

    return-void
.end method

.method public static f(Lo7/l2;Lo7/w;)V
    .locals 0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lo7/l2;->updateMask_:Lo7/w;

    return-void
.end method

.method public static g(Lo7/l2;Lo7/a0;)V
    .locals 2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Lo7/l2;->updateTransforms_:Lcom/google/protobuf/x0;

    move-object v1, v0

    check-cast v1, Lcom/google/protobuf/d;

    iget-boolean v1, v1, Lcom/google/protobuf/d;->a:Z

    if-nez v1, :cond_0

    invoke-static {v0}, Lcom/google/protobuf/l0;->mutableCopy(Lcom/google/protobuf/x0;)Lcom/google/protobuf/x0;

    move-result-object v0

    iput-object v0, p0, Lo7/l2;->updateTransforms_:Lcom/google/protobuf/x0;

    :cond_0
    iget-object p0, p0, Lo7/l2;->updateTransforms_:Lcom/google/protobuf/x0;

    invoke-interface {p0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public static h(Lo7/l2;Lo7/s;)V
    .locals 0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lo7/l2;->operation_:Ljava/lang/Object;

    const/4 p1, 0x1

    iput p1, p0, Lo7/l2;->operationCase_:I

    return-void
.end method

.method public static i(Lo7/l2;Lo7/m0;)V
    .locals 0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lo7/l2;->currentDocument_:Lo7/m0;

    return-void
.end method

.method public static j(Lo7/l2;Ljava/lang/String;)V
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x2

    iput v0, p0, Lo7/l2;->operationCase_:I

    iput-object p1, p0, Lo7/l2;->operation_:Ljava/lang/Object;

    return-void
.end method

.method public static k(Lo7/l2;Ljava/lang/String;)V
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x5

    iput v0, p0, Lo7/l2;->operationCase_:I

    iput-object p1, p0, Lo7/l2;->operation_:Ljava/lang/Object;

    return-void
.end method

.method public static x()Lo7/j2;
    .locals 1

    sget-object v0, Lo7/l2;->DEFAULT_INSTANCE:Lo7/l2;

    invoke-virtual {v0}, Lcom/google/protobuf/l0;->createBuilder()Lcom/google/protobuf/g0;

    move-result-object v0

    check-cast v0, Lo7/j2;

    return-object v0
.end method

.method public static y(Lo7/l2;)Lo7/j2;
    .locals 1

    sget-object v0, Lo7/l2;->DEFAULT_INSTANCE:Lo7/l2;

    invoke-virtual {v0, p0}, Lcom/google/protobuf/l0;->createBuilder(Lcom/google/protobuf/l0;)Lcom/google/protobuf/g0;

    move-result-object p0

    check-cast p0, Lo7/j2;

    return-object p0
.end method

.method public static z([B)Lo7/l2;
    .locals 1

    sget-object v0, Lo7/l2;->DEFAULT_INSTANCE:Lo7/l2;

    invoke-static {v0, p0}, Lcom/google/protobuf/l0;->parseFrom(Lcom/google/protobuf/l0;[B)Lcom/google/protobuf/l0;

    move-result-object p0

    check-cast p0, Lo7/l2;

    return-object p0
.end method


# virtual methods
.method public final dynamicMethod(Lcom/google/protobuf/k0;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    packed-switch p1, :pswitch_data_0

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1

    :pswitch_0
    sget-object p1, Lo7/l2;->PARSER:Lcom/google/protobuf/b2;

    if-nez p1, :cond_1

    const-class p2, Lo7/l2;

    monitor-enter p2

    :try_start_0
    sget-object p1, Lo7/l2;->PARSER:Lcom/google/protobuf/b2;

    if-nez p1, :cond_0

    new-instance p1, Lcom/google/protobuf/h0;

    sget-object p3, Lo7/l2;->DEFAULT_INSTANCE:Lo7/l2;

    invoke-direct {p1, p3}, Lcom/google/protobuf/h0;-><init>(Lcom/google/protobuf/l0;)V

    sput-object p1, Lo7/l2;->PARSER:Lcom/google/protobuf/b2;

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit p2

    goto :goto_2

    :goto_1
    monitor-exit p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_1
    :goto_2
    return-object p1

    :pswitch_1
    sget-object p1, Lo7/l2;->DEFAULT_INSTANCE:Lo7/l2;

    return-object p1

    :pswitch_2
    new-instance p1, Lo7/j2;

    sget-object p2, Lo7/l2;->DEFAULT_INSTANCE:Lo7/l2;

    invoke-direct {p1, p2}, Lcom/google/protobuf/g0;-><init>(Lcom/google/protobuf/l0;)V

    return-object p1

    :pswitch_3
    new-instance p1, Lo7/l2;

    invoke-direct {p1}, Lo7/l2;-><init>()V

    return-object p1

    :pswitch_4
    const-string v0, "operation_"

    const-string v1, "operationCase_"

    const-class v2, Lo7/s;

    const-string v3, "updateMask_"

    const-string v4, "currentDocument_"

    const-class v5, Lo7/b0;

    const-string v6, "updateTransforms_"

    const-class v7, Lo7/a0;

    filled-new-array/range {v0 .. v7}, [Ljava/lang/Object;

    move-result-object p1

    const-string p2, "\u0000\u0007\u0001\u0000\u0001\u0007\u0007\u0000\u0001\u0000\u0001<\u0000\u0002\u023b\u0000\u0003\t\u0004\t\u0005\u023b\u0000\u0006<\u0000\u0007\u001b"

    sget-object p3, Lo7/l2;->DEFAULT_INSTANCE:Lo7/l2;

    invoke-static {p3, p2, p1}, Lcom/google/protobuf/l0;->newMessageInfo(Lcom/google/protobuf/t1;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_5
    const/4 p1, 0x0

    return-object p1

    :pswitch_6
    const/4 p1, 0x1

    invoke-static {p1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final l()Lo7/m0;
    .locals 1

    iget-object v0, p0, Lo7/l2;->currentDocument_:Lo7/m0;

    if-nez v0, :cond_0

    invoke-static {}, Lo7/m0;->i()Lo7/m0;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public final m()Ljava/lang/String;
    .locals 2

    iget v0, p0, Lo7/l2;->operationCase_:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lo7/l2;->operation_:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    goto :goto_0

    :cond_0
    const-string v0, ""

    :goto_0
    return-object v0
.end method

.method public final n()Lo7/k2;
    .locals 2

    iget v0, p0, Lo7/l2;->operationCase_:I

    if-eqz v0, :cond_4

    const/4 v1, 0x1

    if-eq v0, v1, :cond_3

    const/4 v1, 0x2

    if-eq v0, v1, :cond_2

    const/4 v1, 0x5

    if-eq v0, v1, :cond_1

    const/4 v1, 0x6

    if-eq v0, v1, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    sget-object v0, Lo7/k2;->d:Lo7/k2;

    goto :goto_0

    :cond_1
    sget-object v0, Lo7/k2;->c:Lo7/k2;

    goto :goto_0

    :cond_2
    sget-object v0, Lo7/k2;->b:Lo7/k2;

    goto :goto_0

    :cond_3
    sget-object v0, Lo7/k2;->a:Lo7/k2;

    goto :goto_0

    :cond_4
    sget-object v0, Lo7/k2;->e:Lo7/k2;

    :goto_0
    return-object v0
.end method

.method public final o()Lo7/b0;
    .locals 2

    iget v0, p0, Lo7/l2;->operationCase_:I

    const/4 v1, 0x6

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lo7/l2;->operation_:Ljava/lang/Object;

    check-cast v0, Lo7/b0;

    return-object v0

    :cond_0
    invoke-static {}, Lo7/b0;->g()Lo7/b0;

    move-result-object v0

    return-object v0
.end method

.method public final p()Lo7/s;
    .locals 2

    iget v0, p0, Lo7/l2;->operationCase_:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lo7/l2;->operation_:Ljava/lang/Object;

    check-cast v0, Lo7/s;

    return-object v0

    :cond_0
    invoke-static {}, Lo7/s;->i()Lo7/s;

    move-result-object v0

    return-object v0
.end method

.method public final q()Lo7/w;
    .locals 1

    iget-object v0, p0, Lo7/l2;->updateMask_:Lo7/w;

    if-nez v0, :cond_0

    invoke-static {}, Lo7/w;->g()Lo7/w;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public final r()Lcom/google/protobuf/x0;
    .locals 1

    iget-object v0, p0, Lo7/l2;->updateTransforms_:Lcom/google/protobuf/x0;

    return-object v0
.end method

.method public final s()Ljava/lang/String;
    .locals 2

    iget v0, p0, Lo7/l2;->operationCase_:I

    const/4 v1, 0x5

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lo7/l2;->operation_:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    goto :goto_0

    :cond_0
    const-string v0, ""

    :goto_0
    return-object v0
.end method

.method public final t()Z
    .locals 1

    iget-object v0, p0, Lo7/l2;->currentDocument_:Lo7/m0;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final u()Z
    .locals 2

    iget v0, p0, Lo7/l2;->operationCase_:I

    const/4 v1, 0x6

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final v()Z
    .locals 2

    iget v0, p0, Lo7/l2;->operationCase_:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public final w()Z
    .locals 1

    iget-object v0, p0, Lo7/l2;->updateMask_:Lo7/w;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
