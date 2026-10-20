.class public final Lcom/google/firebase/firestore/model/ServerTimestamps;
.super Ljava/lang/Object;


# static fields
.field private static final LOCAL_WRITE_TIME_KEY:Ljava/lang/String; = "__local_write_time__"

.field private static final PREVIOUS_VALUE_KEY:Ljava/lang/String; = "__previous_value__"

.field private static final SERVER_TIMESTAMP_SENTINEL:Ljava/lang/String; = "server_timestamp"

.field private static final TYPE_KEY:Ljava/lang/String; = "__type__"


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static getLocalWriteTime(Lo7/i2;)Lcom/google/protobuf/q2;
    .locals 1

    invoke-virtual {p0}, Lo7/i2;->x()Lo7/k0;

    move-result-object p0

    const-string v0, "__local_write_time__"

    invoke-virtual {p0, v0}, Lo7/k0;->k(Ljava/lang/String;)Lo7/i2;

    move-result-object p0

    invoke-virtual {p0}, Lo7/i2;->A()Lcom/google/protobuf/q2;

    move-result-object p0

    return-object p0
.end method

.method public static getPreviousValue(Lo7/i2;)Lo7/i2;
    .locals 1

    invoke-virtual {p0}, Lo7/i2;->x()Lo7/k0;

    move-result-object p0

    const-string v0, "__previous_value__"

    invoke-virtual {p0, v0}, Lo7/k0;->j(Ljava/lang/String;)Lo7/i2;

    move-result-object p0

    invoke-static {p0}, Lcom/google/firebase/firestore/model/ServerTimestamps;->isServerTimestamp(Lo7/i2;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p0}, Lcom/google/firebase/firestore/model/ServerTimestamps;->getPreviousValue(Lo7/i2;)Lo7/i2;

    move-result-object p0

    :cond_0
    return-object p0
.end method

.method public static isServerTimestamp(Lo7/i2;)Z
    .locals 1

    if-nez p0, :cond_0

    const/4 p0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lo7/i2;->x()Lo7/k0;

    move-result-object p0

    const-string v0, "__type__"

    invoke-virtual {p0, v0}, Lo7/k0;->j(Ljava/lang/String;)Lo7/i2;

    move-result-object p0

    :goto_0
    if-eqz p0, :cond_1

    const-string v0, "server_timestamp"

    invoke-virtual {p0}, Lo7/i2;->z()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_1

    const/4 p0, 0x1

    goto :goto_1

    :cond_1
    const/4 p0, 0x0

    :goto_1
    return p0
.end method

.method public static valueOf(Lcom/google/firebase/Timestamp;Lo7/i2;)Lo7/i2;
    .locals 5

    invoke-static {}, Lo7/i2;->C()Lo7/g2;

    move-result-object v0

    const-string v1, "server_timestamp"

    invoke-virtual {v0, v1}, Lo7/g2;->o(Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/google/protobuf/g0;->build()Lcom/google/protobuf/l0;

    move-result-object v0

    check-cast v0, Lo7/i2;

    invoke-static {}, Lo7/i2;->C()Lo7/g2;

    move-result-object v1

    invoke-static {}, Lcom/google/protobuf/q2;->k()Lcom/google/protobuf/p2;

    move-result-object v2

    invoke-virtual {p0}, Lcom/google/firebase/Timestamp;->getSeconds()J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Lcom/google/protobuf/p2;->d(J)V

    invoke-virtual {p0}, Lcom/google/firebase/Timestamp;->getNanoseconds()I

    move-result p0

    invoke-virtual {v2, p0}, Lcom/google/protobuf/p2;->c(I)V

    invoke-virtual {v1, v2}, Lo7/g2;->p(Lcom/google/protobuf/p2;)V

    invoke-virtual {v1}, Lcom/google/protobuf/g0;->build()Lcom/google/protobuf/l0;

    move-result-object p0

    check-cast p0, Lo7/i2;

    invoke-static {}, Lo7/k0;->l()Lo7/i0;

    move-result-object v1

    const-string v2, "__type__"

    invoke-virtual {v1, v0, v2}, Lo7/i0;->e(Lo7/i2;Ljava/lang/String;)V

    const-string v0, "__local_write_time__"

    invoke-virtual {v1, p0, v0}, Lo7/i0;->e(Lo7/i2;Ljava/lang/String;)V

    invoke-static {p1}, Lcom/google/firebase/firestore/model/ServerTimestamps;->isServerTimestamp(Lo7/i2;)Z

    move-result p0

    if-eqz p0, :cond_0

    invoke-static {p1}, Lcom/google/firebase/firestore/model/ServerTimestamps;->getPreviousValue(Lo7/i2;)Lo7/i2;

    move-result-object p1

    :cond_0
    if-eqz p1, :cond_1

    const-string p0, "__previous_value__"

    invoke-virtual {v1, p1, p0}, Lo7/i0;->e(Lo7/i2;Ljava/lang/String;)V

    :cond_1
    invoke-static {}, Lo7/i2;->C()Lo7/g2;

    move-result-object p0

    invoke-virtual {p0, v1}, Lo7/g2;->k(Lo7/i0;)V

    invoke-virtual {p0}, Lcom/google/protobuf/g0;->build()Lcom/google/protobuf/l0;

    move-result-object p0

    check-cast p0, Lo7/i2;

    return-object p0
.end method
