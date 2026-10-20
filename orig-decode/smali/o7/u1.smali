.class public final Lo7/u1;
.super Lcom/google/protobuf/l0;

# interfaces
.implements Lcom/google/protobuf/u1;


# static fields
.field private static final DEFAULT_INSTANCE:Lo7/u1;

.field public static final END_AT_FIELD_NUMBER:I = 0x8

.field public static final FROM_FIELD_NUMBER:I = 0x2

.field public static final LIMIT_FIELD_NUMBER:I = 0x5

.field public static final OFFSET_FIELD_NUMBER:I = 0x6

.field public static final ORDER_BY_FIELD_NUMBER:I = 0x4

.field private static volatile PARSER:Lcom/google/protobuf/b2; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/b2;"
        }
    .end annotation
.end field

.field public static final SELECT_FIELD_NUMBER:I = 0x1

.field public static final START_AT_FIELD_NUMBER:I = 0x7

.field public static final WHERE_FIELD_NUMBER:I = 0x3


# instance fields
.field private endAt_:Lo7/p;

.field private from_:Lcom/google/protobuf/x0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/x0;"
        }
    .end annotation
.end field

.field private limit_:Lcom/google/protobuf/n0;

.field private offset_:I

.field private orderBy_:Lcom/google/protobuf/x0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/x0;"
        }
    .end annotation
.end field

.field private select_:Lo7/q1;

.field private startAt_:Lo7/p;

.field private where_:Lo7/n1;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lo7/u1;

    invoke-direct {v0}, Lo7/u1;-><init>()V

    sput-object v0, Lo7/u1;->DEFAULT_INSTANCE:Lo7/u1;

    const-class v1, Lo7/u1;

    invoke-static {v1, v0}, Lcom/google/protobuf/l0;->registerDefaultInstance(Ljava/lang/Class;Lcom/google/protobuf/l0;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/protobuf/l0;-><init>()V

    invoke-static {}, Lcom/google/protobuf/l0;->emptyProtobufList()Lcom/google/protobuf/x0;

    move-result-object v0

    iput-object v0, p0, Lo7/u1;->from_:Lcom/google/protobuf/x0;

    invoke-static {}, Lcom/google/protobuf/l0;->emptyProtobufList()Lcom/google/protobuf/x0;

    move-result-object v0

    iput-object v0, p0, Lo7/u1;->orderBy_:Lcom/google/protobuf/x0;

    return-void
.end method

.method public static f(Lo7/u1;Lo7/b1;)V
    .locals 2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Lo7/u1;->from_:Lcom/google/protobuf/x0;

    move-object v1, v0

    check-cast v1, Lcom/google/protobuf/d;

    iget-boolean v1, v1, Lcom/google/protobuf/d;->a:Z

    if-nez v1, :cond_0

    invoke-static {v0}, Lcom/google/protobuf/l0;->mutableCopy(Lcom/google/protobuf/x0;)Lcom/google/protobuf/x0;

    move-result-object v0

    iput-object v0, p0, Lo7/u1;->from_:Lcom/google/protobuf/x0;

    :cond_0
    iget-object p0, p0, Lo7/u1;->from_:Lcom/google/protobuf/x0;

    invoke-interface {p0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public static g(Lo7/u1;Lo7/n1;)V
    .locals 0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lo7/u1;->where_:Lo7/n1;

    return-void
.end method

.method public static h(Lo7/u1;Lo7/p1;)V
    .locals 2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Lo7/u1;->orderBy_:Lcom/google/protobuf/x0;

    move-object v1, v0

    check-cast v1, Lcom/google/protobuf/d;

    iget-boolean v1, v1, Lcom/google/protobuf/d;->a:Z

    if-nez v1, :cond_0

    invoke-static {v0}, Lcom/google/protobuf/l0;->mutableCopy(Lcom/google/protobuf/x0;)Lcom/google/protobuf/x0;

    move-result-object v0

    iput-object v0, p0, Lo7/u1;->orderBy_:Lcom/google/protobuf/x0;

    :cond_0
    iget-object p0, p0, Lo7/u1;->orderBy_:Lcom/google/protobuf/x0;

    invoke-interface {p0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public static i(Lo7/u1;Lo7/p;)V
    .locals 0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lo7/u1;->startAt_:Lo7/p;

    return-void
.end method

.method public static j(Lo7/u1;Lo7/p;)V
    .locals 0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lo7/u1;->endAt_:Lo7/p;

    return-void
.end method

.method public static k(Lo7/u1;Lcom/google/protobuf/n0;)V
    .locals 0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lo7/u1;->limit_:Lcom/google/protobuf/n0;

    return-void
.end method

.method public static l()Lo7/u1;
    .locals 1

    sget-object v0, Lo7/u1;->DEFAULT_INSTANCE:Lo7/u1;

    return-object v0
.end method

.method public static y()Lo7/z0;
    .locals 1

    sget-object v0, Lo7/u1;->DEFAULT_INSTANCE:Lo7/u1;

    invoke-virtual {v0}, Lcom/google/protobuf/l0;->createBuilder()Lcom/google/protobuf/g0;

    move-result-object v0

    check-cast v0, Lo7/z0;

    return-object v0
.end method


# virtual methods
.method public final dynamicMethod(Lcom/google/protobuf/k0;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    packed-switch p1, :pswitch_data_0

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1

    :pswitch_0
    sget-object p1, Lo7/u1;->PARSER:Lcom/google/protobuf/b2;

    if-nez p1, :cond_1

    const-class p2, Lo7/u1;

    monitor-enter p2

    :try_start_0
    sget-object p1, Lo7/u1;->PARSER:Lcom/google/protobuf/b2;

    if-nez p1, :cond_0

    new-instance p1, Lcom/google/protobuf/h0;

    sget-object p3, Lo7/u1;->DEFAULT_INSTANCE:Lo7/u1;

    invoke-direct {p1, p3}, Lcom/google/protobuf/h0;-><init>(Lcom/google/protobuf/l0;)V

    sput-object p1, Lo7/u1;->PARSER:Lcom/google/protobuf/b2;

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
    sget-object p1, Lo7/u1;->DEFAULT_INSTANCE:Lo7/u1;

    return-object p1

    :pswitch_2
    new-instance p1, Lo7/z0;

    sget-object p2, Lo7/u1;->DEFAULT_INSTANCE:Lo7/u1;

    invoke-direct {p1, p2}, Lcom/google/protobuf/g0;-><init>(Lcom/google/protobuf/l0;)V

    return-object p1

    :pswitch_3
    new-instance p1, Lo7/u1;

    invoke-direct {p1}, Lo7/u1;-><init>()V

    return-object p1

    :pswitch_4
    const-string v0, "select_"

    const-string v1, "from_"

    const-class v2, Lo7/b1;

    const-string v3, "where_"

    const-string v4, "orderBy_"

    const-class v5, Lo7/p1;

    const-string v6, "limit_"

    const-string v7, "offset_"

    const-string v8, "startAt_"

    const-string v9, "endAt_"

    filled-new-array/range {v0 .. v9}, [Ljava/lang/Object;

    move-result-object p1

    const-string p2, "\u0000\u0008\u0000\u0000\u0001\u0008\u0008\u0000\u0002\u0000\u0001\t\u0002\u001b\u0003\t\u0004\u001b\u0005\t\u0006\u0004\u0007\t\u0008\t"

    sget-object p3, Lo7/u1;->DEFAULT_INSTANCE:Lo7/u1;

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

.method public final m()Lo7/p;
    .locals 1

    iget-object v0, p0, Lo7/u1;->endAt_:Lo7/p;

    if-nez v0, :cond_0

    invoke-static {}, Lo7/p;->i()Lo7/p;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public final n()Lo7/b1;
    .locals 2

    const/4 v0, 0x0

    iget-object v1, p0, Lo7/u1;->from_:Lcom/google/protobuf/x0;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo7/b1;

    return-object v0
.end method

.method public final o()I
    .locals 1

    iget-object v0, p0, Lo7/u1;->from_:Lcom/google/protobuf/x0;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public final p()Lcom/google/protobuf/n0;
    .locals 1

    iget-object v0, p0, Lo7/u1;->limit_:Lcom/google/protobuf/n0;

    if-nez v0, :cond_0

    invoke-static {}, Lcom/google/protobuf/n0;->g()Lcom/google/protobuf/n0;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public final q(I)Lo7/p1;
    .locals 1

    iget-object v0, p0, Lo7/u1;->orderBy_:Lcom/google/protobuf/x0;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lo7/p1;

    return-object p1
.end method

.method public final r()I
    .locals 1

    iget-object v0, p0, Lo7/u1;->orderBy_:Lcom/google/protobuf/x0;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public final s()Lo7/p;
    .locals 1

    iget-object v0, p0, Lo7/u1;->startAt_:Lo7/p;

    if-nez v0, :cond_0

    invoke-static {}, Lo7/p;->i()Lo7/p;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public final t()Lo7/n1;
    .locals 1

    iget-object v0, p0, Lo7/u1;->where_:Lo7/n1;

    if-nez v0, :cond_0

    invoke-static {}, Lo7/n1;->j()Lo7/n1;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public final u()Z
    .locals 1

    iget-object v0, p0, Lo7/u1;->endAt_:Lo7/p;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final v()Z
    .locals 1

    iget-object v0, p0, Lo7/u1;->limit_:Lcom/google/protobuf/n0;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final w()Z
    .locals 1

    iget-object v0, p0, Lo7/u1;->startAt_:Lo7/p;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final x()Z
    .locals 1

    iget-object v0, p0, Lo7/u1;->where_:Lo7/n1;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
