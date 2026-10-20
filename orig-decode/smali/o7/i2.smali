.class public final Lo7/i2;
.super Lcom/google/protobuf/l0;

# interfaces
.implements Lcom/google/protobuf/u1;


# static fields
.field public static final ARRAY_VALUE_FIELD_NUMBER:I = 0x9

.field public static final BOOLEAN_VALUE_FIELD_NUMBER:I = 0x1

.field public static final BYTES_VALUE_FIELD_NUMBER:I = 0x12

.field private static final DEFAULT_INSTANCE:Lo7/i2;

.field public static final DOUBLE_VALUE_FIELD_NUMBER:I = 0x3

.field public static final GEO_POINT_VALUE_FIELD_NUMBER:I = 0x8

.field public static final INTEGER_VALUE_FIELD_NUMBER:I = 0x2

.field public static final MAP_VALUE_FIELD_NUMBER:I = 0x6

.field public static final NULL_VALUE_FIELD_NUMBER:I = 0xb

.field private static volatile PARSER:Lcom/google/protobuf/b2; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/b2;"
        }
    .end annotation
.end field

.field public static final REFERENCE_VALUE_FIELD_NUMBER:I = 0x5

.field public static final STRING_VALUE_FIELD_NUMBER:I = 0x11

.field public static final TIMESTAMP_VALUE_FIELD_NUMBER:I = 0xa


# instance fields
.field private valueTypeCase_:I

.field private valueType_:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lo7/i2;

    invoke-direct {v0}, Lo7/i2;-><init>()V

    sput-object v0, Lo7/i2;->DEFAULT_INSTANCE:Lo7/i2;

    const-class v1, Lo7/i2;

    invoke-static {v1, v0}, Lcom/google/protobuf/l0;->registerDefaultInstance(Ljava/lang/Class;Lcom/google/protobuf/l0;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/protobuf/l0;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lo7/i2;->valueTypeCase_:I

    return-void
.end method

.method public static C()Lo7/g2;
    .locals 1

    sget-object v0, Lo7/i2;->DEFAULT_INSTANCE:Lo7/i2;

    invoke-virtual {v0}, Lcom/google/protobuf/l0;->createBuilder()Lcom/google/protobuf/g0;

    move-result-object v0

    check-cast v0, Lo7/g2;

    return-object v0
.end method

.method public static f(Lo7/i2;Lcom/google/protobuf/q2;)V
    .locals 0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lo7/i2;->valueType_:Ljava/lang/Object;

    const/16 p1, 0xa

    iput p1, p0, Lo7/i2;->valueTypeCase_:I

    return-void
.end method

.method public static g(Lo7/i2;Ljava/lang/String;)V
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/16 v0, 0x11

    iput v0, p0, Lo7/i2;->valueTypeCase_:I

    iput-object p1, p0, Lo7/i2;->valueType_:Ljava/lang/Object;

    return-void
.end method

.method public static h(Lo7/i2;Lcom/google/protobuf/n;)V
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/16 v0, 0x12

    iput v0, p0, Lo7/i2;->valueTypeCase_:I

    iput-object p1, p0, Lo7/i2;->valueType_:Ljava/lang/Object;

    return-void
.end method

.method public static i(Lo7/i2;Ljava/lang/String;)V
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x5

    iput v0, p0, Lo7/i2;->valueTypeCase_:I

    iput-object p1, p0, Lo7/i2;->valueType_:Ljava/lang/Object;

    return-void
.end method

.method public static j(Lo7/i2;Lx7/b;)V
    .locals 0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lo7/i2;->valueType_:Ljava/lang/Object;

    const/16 p1, 0x8

    iput p1, p0, Lo7/i2;->valueTypeCase_:I

    return-void
.end method

.method public static k(Lo7/e;Lo7/i2;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p0, p1, Lo7/i2;->valueType_:Ljava/lang/Object;

    const/16 p0, 0x9

    iput p0, p1, Lo7/i2;->valueTypeCase_:I

    return-void
.end method

.method public static l(Lo7/i2;Lo7/k0;)V
    .locals 0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lo7/i2;->valueType_:Ljava/lang/Object;

    const/4 p1, 0x6

    iput p1, p0, Lo7/i2;->valueTypeCase_:I

    return-void
.end method

.method public static m(Lo7/i2;)V
    .locals 1

    sget-object v0, Lcom/google/protobuf/a2;->b:Lcom/google/protobuf/a2;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v0}, Lcom/google/protobuf/a2;->getNumber()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lo7/i2;->valueType_:Ljava/lang/Object;

    const/16 v0, 0xb

    iput v0, p0, Lo7/i2;->valueTypeCase_:I

    return-void
.end method

.method public static n(Lo7/i2;Z)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lo7/i2;->valueTypeCase_:I

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    iput-object p1, p0, Lo7/i2;->valueType_:Ljava/lang/Object;

    return-void
.end method

.method public static o(Lo7/i2;J)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Lo7/i2;->valueTypeCase_:I

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    iput-object p1, p0, Lo7/i2;->valueType_:Ljava/lang/Object;

    return-void
.end method

.method public static p(Lo7/i2;D)V
    .locals 1

    const/4 v0, 0x3

    iput v0, p0, Lo7/i2;->valueTypeCase_:I

    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    iput-object p1, p0, Lo7/i2;->valueType_:Ljava/lang/Object;

    return-void
.end method

.method public static t()Lo7/i2;
    .locals 1

    sget-object v0, Lo7/i2;->DEFAULT_INSTANCE:Lo7/i2;

    return-object v0
.end method


# virtual methods
.method public final A()Lcom/google/protobuf/q2;
    .locals 2

    iget v0, p0, Lo7/i2;->valueTypeCase_:I

    const/16 v1, 0xa

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lo7/i2;->valueType_:Ljava/lang/Object;

    check-cast v0, Lcom/google/protobuf/q2;

    return-object v0

    :cond_0
    invoke-static {}, Lcom/google/protobuf/q2;->h()Lcom/google/protobuf/q2;

    move-result-object v0

    return-object v0
.end method

.method public final B()Lo7/h2;
    .locals 2

    iget v0, p0, Lo7/i2;->valueTypeCase_:I

    if-eqz v0, :cond_7

    const/4 v1, 0x1

    if-eq v0, v1, :cond_6

    const/4 v1, 0x2

    if-eq v0, v1, :cond_5

    const/4 v1, 0x3

    if-eq v0, v1, :cond_4

    const/4 v1, 0x5

    if-eq v0, v1, :cond_3

    const/4 v1, 0x6

    if-eq v0, v1, :cond_2

    const/16 v1, 0x11

    if-eq v0, v1, :cond_1

    const/16 v1, 0x12

    if-eq v0, v1, :cond_0

    packed-switch v0, :pswitch_data_0

    const/4 v0, 0x0

    goto :goto_0

    :pswitch_0
    sget-object v0, Lo7/h2;->a:Lo7/h2;

    goto :goto_0

    :pswitch_1
    sget-object v0, Lo7/h2;->e:Lo7/h2;

    goto :goto_0

    :pswitch_2
    sget-object v0, Lo7/h2;->q:Lo7/h2;

    goto :goto_0

    :pswitch_3
    sget-object v0, Lo7/h2;->p:Lo7/h2;

    goto :goto_0

    :cond_0
    sget-object v0, Lo7/h2;->n:Lo7/h2;

    goto :goto_0

    :cond_1
    sget-object v0, Lo7/h2;->f:Lo7/h2;

    goto :goto_0

    :cond_2
    sget-object v0, Lo7/h2;->r:Lo7/h2;

    goto :goto_0

    :cond_3
    sget-object v0, Lo7/h2;->o:Lo7/h2;

    goto :goto_0

    :cond_4
    sget-object v0, Lo7/h2;->d:Lo7/h2;

    goto :goto_0

    :cond_5
    sget-object v0, Lo7/h2;->c:Lo7/h2;

    goto :goto_0

    :cond_6
    sget-object v0, Lo7/h2;->b:Lo7/h2;

    goto :goto_0

    :cond_7
    sget-object v0, Lo7/h2;->s:Lo7/h2;

    :goto_0
    return-object v0

    :pswitch_data_0
    .packed-switch 0x8
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final dynamicMethod(Lcom/google/protobuf/k0;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    packed-switch p1, :pswitch_data_0

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1

    :pswitch_0
    sget-object p1, Lo7/i2;->PARSER:Lcom/google/protobuf/b2;

    if-nez p1, :cond_1

    const-class p2, Lo7/i2;

    monitor-enter p2

    :try_start_0
    sget-object p1, Lo7/i2;->PARSER:Lcom/google/protobuf/b2;

    if-nez p1, :cond_0

    new-instance p1, Lcom/google/protobuf/h0;

    sget-object p3, Lo7/i2;->DEFAULT_INSTANCE:Lo7/i2;

    invoke-direct {p1, p3}, Lcom/google/protobuf/h0;-><init>(Lcom/google/protobuf/l0;)V

    sput-object p1, Lo7/i2;->PARSER:Lcom/google/protobuf/b2;

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
    sget-object p1, Lo7/i2;->DEFAULT_INSTANCE:Lo7/i2;

    return-object p1

    :pswitch_2
    new-instance p1, Lo7/g2;

    sget-object p2, Lo7/i2;->DEFAULT_INSTANCE:Lo7/i2;

    invoke-direct {p1, p2}, Lcom/google/protobuf/g0;-><init>(Lcom/google/protobuf/l0;)V

    return-object p1

    :pswitch_3
    new-instance p1, Lo7/i2;

    invoke-direct {p1}, Lo7/i2;-><init>()V

    return-object p1

    :pswitch_4
    const-string v0, "valueType_"

    const-string v1, "valueTypeCase_"

    const-class v2, Lo7/k0;

    const-class v3, Lx7/b;

    const-class v4, Lo7/e;

    const-class v5, Lcom/google/protobuf/q2;

    filled-new-array/range {v0 .. v5}, [Ljava/lang/Object;

    move-result-object p1

    const-string p2, "\u0000\u000b\u0001\u0000\u0001\u0012\u000b\u0000\u0000\u0000\u0001:\u0000\u00025\u0000\u00033\u0000\u0005\u023b\u0000\u0006<\u0000\u0008<\u0000\t<\u0000\n<\u0000\u000b?\u0000\u0011\u023b\u0000\u0012=\u0000"

    sget-object p3, Lo7/i2;->DEFAULT_INSTANCE:Lo7/i2;

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

.method public final q()Lo7/e;
    .locals 2

    iget v0, p0, Lo7/i2;->valueTypeCase_:I

    const/16 v1, 0x9

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lo7/i2;->valueType_:Ljava/lang/Object;

    check-cast v0, Lo7/e;

    return-object v0

    :cond_0
    invoke-static {}, Lo7/e;->i()Lo7/e;

    move-result-object v0

    return-object v0
.end method

.method public final r()Z
    .locals 2

    iget v0, p0, Lo7/i2;->valueTypeCase_:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lo7/i2;->valueType_:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final s()Lcom/google/protobuf/n;
    .locals 2

    iget v0, p0, Lo7/i2;->valueTypeCase_:I

    const/16 v1, 0x12

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lo7/i2;->valueType_:Ljava/lang/Object;

    check-cast v0, Lcom/google/protobuf/n;

    return-object v0

    :cond_0
    sget-object v0, Lcom/google/protobuf/n;->b:Lcom/google/protobuf/m;

    return-object v0
.end method

.method public final u()D
    .locals 2

    iget v0, p0, Lo7/i2;->valueTypeCase_:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lo7/i2;->valueType_:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Double;

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    return-wide v0

    :cond_0
    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public final v()Lx7/b;
    .locals 2

    iget v0, p0, Lo7/i2;->valueTypeCase_:I

    const/16 v1, 0x8

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lo7/i2;->valueType_:Ljava/lang/Object;

    check-cast v0, Lx7/b;

    return-object v0

    :cond_0
    invoke-static {}, Lx7/b;->h()Lx7/b;

    move-result-object v0

    return-object v0
.end method

.method public final w()J
    .locals 2

    iget v0, p0, Lo7/i2;->valueTypeCase_:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lo7/i2;->valueType_:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    return-wide v0

    :cond_0
    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public final x()Lo7/k0;
    .locals 2

    iget v0, p0, Lo7/i2;->valueTypeCase_:I

    const/4 v1, 0x6

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lo7/i2;->valueType_:Ljava/lang/Object;

    check-cast v0, Lo7/k0;

    return-object v0

    :cond_0
    invoke-static {}, Lo7/k0;->g()Lo7/k0;

    move-result-object v0

    return-object v0
.end method

.method public final y()Ljava/lang/String;
    .locals 2

    iget v0, p0, Lo7/i2;->valueTypeCase_:I

    const/4 v1, 0x5

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lo7/i2;->valueType_:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    goto :goto_0

    :cond_0
    const-string v0, ""

    :goto_0
    return-object v0
.end method

.method public final z()Ljava/lang/String;
    .locals 2

    iget v0, p0, Lo7/i2;->valueTypeCase_:I

    const/16 v1, 0x11

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lo7/i2;->valueType_:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    goto :goto_0

    :cond_0
    const-string v0, ""

    :goto_0
    return-object v0
.end method
