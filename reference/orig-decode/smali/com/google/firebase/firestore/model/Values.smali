.class public Lcom/google/firebase/firestore/model/Values;
.super Ljava/lang/Object;


# static fields
.field public static final MAX_VALUE:Lo7/i2;

.field private static final MAX_VALUE_TYPE:Lo7/i2;

.field public static final MIN_VALUE:Lo7/i2;

.field public static final NAN_VALUE:Lo7/i2;

.field public static final NULL_VALUE:Lo7/i2;

.field public static final TYPE_ORDER_ARRAY:I = 0x9

.field public static final TYPE_ORDER_BLOB:I = 0x6

.field public static final TYPE_ORDER_BOOLEAN:I = 0x1

.field public static final TYPE_ORDER_GEOPOINT:I = 0x8

.field public static final TYPE_ORDER_MAP:I = 0xa

.field public static final TYPE_ORDER_MAX_VALUE:I = 0x7fffffff

.field public static final TYPE_ORDER_NULL:I = 0x0

.field public static final TYPE_ORDER_NUMBER:I = 0x2

.field public static final TYPE_ORDER_REFERENCE:I = 0x7

.field public static final TYPE_ORDER_SERVER_TIMESTAMP:I = 0x4

.field public static final TYPE_ORDER_STRING:I = 0x5

.field public static final TYPE_ORDER_TIMESTAMP:I = 0x3


# direct methods
.method static constructor <clinit>()V
    .locals 4

    invoke-static {}, Lo7/i2;->C()Lo7/g2;

    move-result-object v0

    const-wide/high16 v1, 0x7ff8000000000000L    # Double.NaN

    invoke-virtual {v0, v1, v2}, Lo7/g2;->h(D)V

    invoke-virtual {v0}, Lcom/google/protobuf/g0;->build()Lcom/google/protobuf/l0;

    move-result-object v0

    check-cast v0, Lo7/i2;

    sput-object v0, Lcom/google/firebase/firestore/model/Values;->NAN_VALUE:Lo7/i2;

    invoke-static {}, Lo7/i2;->C()Lo7/g2;

    move-result-object v0

    invoke-virtual {v0}, Lo7/g2;->m()V

    invoke-virtual {v0}, Lcom/google/protobuf/g0;->build()Lcom/google/protobuf/l0;

    move-result-object v0

    check-cast v0, Lo7/i2;

    sput-object v0, Lcom/google/firebase/firestore/model/Values;->NULL_VALUE:Lo7/i2;

    sput-object v0, Lcom/google/firebase/firestore/model/Values;->MIN_VALUE:Lo7/i2;

    invoke-static {}, Lo7/i2;->C()Lo7/g2;

    move-result-object v0

    const-string v1, "__max__"

    invoke-virtual {v0, v1}, Lo7/g2;->o(Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/google/protobuf/g0;->build()Lcom/google/protobuf/l0;

    move-result-object v0

    check-cast v0, Lo7/i2;

    sput-object v0, Lcom/google/firebase/firestore/model/Values;->MAX_VALUE_TYPE:Lo7/i2;

    invoke-static {}, Lo7/i2;->C()Lo7/g2;

    move-result-object v1

    invoke-static {}, Lo7/k0;->l()Lo7/i0;

    move-result-object v2

    const-string v3, "__type__"

    invoke-virtual {v2, v0, v3}, Lo7/i0;->e(Lo7/i2;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Lo7/g2;->k(Lo7/i0;)V

    invoke-virtual {v1}, Lcom/google/protobuf/g0;->build()Lcom/google/protobuf/l0;

    move-result-object v0

    check-cast v0, Lo7/i2;

    sput-object v0, Lcom/google/firebase/firestore/model/Values;->MAX_VALUE:Lo7/i2;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static arrayEquals(Lo7/i2;Lo7/i2;)Z
    .locals 4

    invoke-virtual {p0}, Lo7/i2;->q()Lo7/e;

    move-result-object p0

    invoke-virtual {p1}, Lo7/i2;->q()Lo7/e;

    move-result-object p1

    invoke-virtual {p0}, Lo7/e;->k()I

    move-result v0

    invoke-virtual {p1}, Lo7/e;->k()I

    move-result v1

    const/4 v2, 0x0

    if-eq v0, v1, :cond_0

    return v2

    :cond_0
    move v0, v2

    :goto_0
    invoke-virtual {p0}, Lo7/e;->k()I

    move-result v1

    if-ge v0, v1, :cond_2

    invoke-virtual {p0, v0}, Lo7/e;->j(I)Lo7/i2;

    move-result-object v1

    invoke-virtual {p1, v0}, Lo7/e;->j(I)Lo7/i2;

    move-result-object v3

    invoke-static {v1, v3}, Lcom/google/firebase/firestore/model/Values;->equals(Lo7/i2;Lo7/i2;)Z

    move-result v1

    if-nez v1, :cond_1

    return v2

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    const/4 p0, 0x1

    return p0
.end method

.method public static canonicalId(Lo7/i2;)Ljava/lang/String;
    .locals 1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {v0, p0}, Lcom/google/firebase/firestore/model/Values;->canonifyValue(Ljava/lang/StringBuilder;Lo7/i2;)V

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static canonifyArray(Ljava/lang/StringBuilder;Lo7/e;)V
    .locals 2

    const-string v0, "["

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p1}, Lo7/e;->k()I

    move-result v1

    if-ge v0, v1, :cond_1

    invoke-virtual {p1, v0}, Lo7/e;->j(I)Lo7/i2;

    move-result-object v1

    invoke-static {p0, v1}, Lcom/google/firebase/firestore/model/Values;->canonifyValue(Ljava/lang/StringBuilder;Lo7/i2;)V

    invoke-virtual {p1}, Lo7/e;->k()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    if-eq v0, v1, :cond_0

    const-string v1, ","

    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    const-string p1, "]"

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void
.end method

.method private static canonifyGeoPoint(Ljava/lang/StringBuilder;Lx7/b;)V
    .locals 3

    invoke-virtual {p1}, Lx7/b;->i()D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-virtual {p1}, Lx7/b;->j()D

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    filled-new-array {v0, p1}, [Ljava/lang/Object;

    move-result-object p1

    const-string v0, "geo(%s,%s)"

    invoke-static {v0, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void
.end method

.method private static canonifyObject(Ljava/lang/StringBuilder;Lo7/k0;)V
    .locals 4

    new-instance v0, Ljava/util/ArrayList;

    invoke-virtual {p1}, Lo7/k0;->i()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-static {v0}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    const-string v1, "{"

    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x1

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    if-nez v1, :cond_0

    const-string v3, ","

    invoke-virtual {p0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_0
    const/4 v1, 0x0

    :goto_1
    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ":"

    invoke-virtual {p0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v2}, Lo7/k0;->k(Ljava/lang/String;)Lo7/i2;

    move-result-object v2

    invoke-static {p0, v2}, Lcom/google/firebase/firestore/model/Values;->canonifyValue(Ljava/lang/StringBuilder;Lo7/i2;)V

    goto :goto_0

    :cond_1
    const-string p1, "}"

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void
.end method

.method private static canonifyReference(Ljava/lang/StringBuilder;Lo7/i2;)V
    .locals 3

    invoke-static {p1}, Lcom/google/firebase/firestore/model/Values;->isReferenceValue(Lo7/i2;)Z

    move-result v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Value should be a ReferenceValue"

    invoke-static {v0, v2, v1}, Lcom/google/firebase/firestore/util/Assert;->hardAssert(ZLjava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {p1}, Lo7/i2;->y()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/google/firebase/firestore/model/DocumentKey;->fromName(Ljava/lang/String;)Lcom/google/firebase/firestore/model/DocumentKey;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    return-void
.end method

.method private static canonifyTimestamp(Ljava/lang/StringBuilder;Lcom/google/protobuf/q2;)V
    .locals 2

    invoke-virtual {p1}, Lcom/google/protobuf/q2;->j()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {p1}, Lcom/google/protobuf/q2;->i()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    filled-new-array {v0, p1}, [Ljava/lang/Object;

    move-result-object p1

    const-string v0, "time(%s,%s)"

    invoke-static {v0, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void
.end method

.method private static canonifyValue(Ljava/lang/StringBuilder;Lo7/i2;)V
    .locals 2

    invoke-virtual {p1}, Lo7/i2;->B()Lo7/h2;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    new-instance p0, Ljava/lang/StringBuilder;

    const-string v0, "Invalid value type: "

    invoke-direct {p0, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Lo7/i2;->B()Lo7/h2;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const/4 p1, 0x0

    new-array p1, p1, [Ljava/lang/Object;

    invoke-static {p0, p1}, Lcom/google/firebase/firestore/util/Assert;->fail(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/AssertionError;

    move-result-object p0

    throw p0

    :pswitch_0
    invoke-virtual {p1}, Lo7/i2;->x()Lo7/k0;

    move-result-object p1

    invoke-static {p0, p1}, Lcom/google/firebase/firestore/model/Values;->canonifyObject(Ljava/lang/StringBuilder;Lo7/k0;)V

    goto :goto_0

    :pswitch_1
    invoke-virtual {p1}, Lo7/i2;->q()Lo7/e;

    move-result-object p1

    invoke-static {p0, p1}, Lcom/google/firebase/firestore/model/Values;->canonifyArray(Ljava/lang/StringBuilder;Lo7/e;)V

    goto :goto_0

    :pswitch_2
    invoke-virtual {p1}, Lo7/i2;->v()Lx7/b;

    move-result-object p1

    invoke-static {p0, p1}, Lcom/google/firebase/firestore/model/Values;->canonifyGeoPoint(Ljava/lang/StringBuilder;Lx7/b;)V

    goto :goto_0

    :pswitch_3
    invoke-static {p0, p1}, Lcom/google/firebase/firestore/model/Values;->canonifyReference(Ljava/lang/StringBuilder;Lo7/i2;)V

    goto :goto_0

    :pswitch_4
    invoke-virtual {p1}, Lo7/i2;->s()Lcom/google/protobuf/n;

    move-result-object p1

    invoke-static {p1}, Lcom/google/firebase/firestore/util/Util;->toDebugString(Lcom/google/protobuf/n;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    :pswitch_5
    invoke-virtual {p1}, Lo7/i2;->z()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    :pswitch_6
    invoke-virtual {p1}, Lo7/i2;->A()Lcom/google/protobuf/q2;

    move-result-object p1

    invoke-static {p0, p1}, Lcom/google/firebase/firestore/model/Values;->canonifyTimestamp(Ljava/lang/StringBuilder;Lcom/google/protobuf/q2;)V

    goto :goto_0

    :pswitch_7
    invoke-virtual {p1}, Lo7/i2;->u()D

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    goto :goto_0

    :pswitch_8
    invoke-virtual {p1}, Lo7/i2;->w()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    goto :goto_0

    :pswitch_9
    invoke-virtual {p1}, Lo7/i2;->r()Z

    move-result p1

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    goto :goto_0

    :pswitch_a
    const-string p1, "null"

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static compare(Lo7/i2;Lo7/i2;)I
    .locals 3

    invoke-static {p0}, Lcom/google/firebase/firestore/model/Values;->typeOrder(Lo7/i2;)I

    move-result v0

    invoke-static {p1}, Lcom/google/firebase/firestore/model/Values;->typeOrder(Lo7/i2;)I

    move-result v1

    if-eq v0, v1, :cond_0

    invoke-static {v0, v1}, Lcom/google/firebase/firestore/util/Util;->compareIntegers(II)I

    move-result p0

    return p0

    :cond_0
    const v1, 0x7fffffff

    const/4 v2, 0x0

    if-eq v0, v1, :cond_1

    packed-switch v0, :pswitch_data_0

    const-string p0, "Invalid value type: "

    invoke-static {p0, v0}, Ll/q;->g(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object p0

    new-array p1, v2, [Ljava/lang/Object;

    invoke-static {p0, p1}, Lcom/google/firebase/firestore/util/Assert;->fail(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/AssertionError;

    move-result-object p0

    throw p0

    :pswitch_0
    invoke-virtual {p0}, Lo7/i2;->x()Lo7/k0;

    move-result-object p0

    invoke-virtual {p1}, Lo7/i2;->x()Lo7/k0;

    move-result-object p1

    invoke-static {p0, p1}, Lcom/google/firebase/firestore/model/Values;->compareMaps(Lo7/k0;Lo7/k0;)I

    move-result p0

    return p0

    :pswitch_1
    invoke-virtual {p0}, Lo7/i2;->q()Lo7/e;

    move-result-object p0

    invoke-virtual {p1}, Lo7/i2;->q()Lo7/e;

    move-result-object p1

    invoke-static {p0, p1}, Lcom/google/firebase/firestore/model/Values;->compareArrays(Lo7/e;Lo7/e;)I

    move-result p0

    return p0

    :pswitch_2
    invoke-virtual {p0}, Lo7/i2;->v()Lx7/b;

    move-result-object p0

    invoke-virtual {p1}, Lo7/i2;->v()Lx7/b;

    move-result-object p1

    invoke-static {p0, p1}, Lcom/google/firebase/firestore/model/Values;->compareGeoPoints(Lx7/b;Lx7/b;)I

    move-result p0

    return p0

    :pswitch_3
    invoke-virtual {p0}, Lo7/i2;->y()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1}, Lo7/i2;->y()Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, p1}, Lcom/google/firebase/firestore/model/Values;->compareReferences(Ljava/lang/String;Ljava/lang/String;)I

    move-result p0

    return p0

    :pswitch_4
    invoke-virtual {p0}, Lo7/i2;->s()Lcom/google/protobuf/n;

    move-result-object p0

    invoke-virtual {p1}, Lo7/i2;->s()Lcom/google/protobuf/n;

    move-result-object p1

    invoke-static {p0, p1}, Lcom/google/firebase/firestore/util/Util;->compareByteStrings(Lcom/google/protobuf/n;Lcom/google/protobuf/n;)I

    move-result p0

    return p0

    :pswitch_5
    invoke-virtual {p0}, Lo7/i2;->z()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1}, Lo7/i2;->z()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result p0

    return p0

    :pswitch_6
    invoke-static {p0}, Lcom/google/firebase/firestore/model/ServerTimestamps;->getLocalWriteTime(Lo7/i2;)Lcom/google/protobuf/q2;

    move-result-object p0

    invoke-static {p1}, Lcom/google/firebase/firestore/model/ServerTimestamps;->getLocalWriteTime(Lo7/i2;)Lcom/google/protobuf/q2;

    move-result-object p1

    invoke-static {p0, p1}, Lcom/google/firebase/firestore/model/Values;->compareTimestamps(Lcom/google/protobuf/q2;Lcom/google/protobuf/q2;)I

    move-result p0

    return p0

    :pswitch_7
    invoke-virtual {p0}, Lo7/i2;->A()Lcom/google/protobuf/q2;

    move-result-object p0

    invoke-virtual {p1}, Lo7/i2;->A()Lcom/google/protobuf/q2;

    move-result-object p1

    invoke-static {p0, p1}, Lcom/google/firebase/firestore/model/Values;->compareTimestamps(Lcom/google/protobuf/q2;Lcom/google/protobuf/q2;)I

    move-result p0

    return p0

    :pswitch_8
    invoke-static {p0, p1}, Lcom/google/firebase/firestore/model/Values;->compareNumbers(Lo7/i2;Lo7/i2;)I

    move-result p0

    return p0

    :pswitch_9
    invoke-virtual {p0}, Lo7/i2;->r()Z

    move-result p0

    invoke-virtual {p1}, Lo7/i2;->r()Z

    move-result p1

    invoke-static {p0, p1}, Lcom/google/firebase/firestore/util/Util;->compareBooleans(ZZ)I

    move-result p0

    return p0

    :cond_1
    :pswitch_a
    return v2

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private static compareArrays(Lo7/e;Lo7/e;)I
    .locals 4

    invoke-virtual {p0}, Lo7/e;->k()I

    move-result v0

    invoke-virtual {p1}, Lo7/e;->k()I

    move-result v1

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    invoke-virtual {p0, v1}, Lo7/e;->j(I)Lo7/i2;

    move-result-object v2

    invoke-virtual {p1, v1}, Lo7/e;->j(I)Lo7/i2;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/google/firebase/firestore/model/Values;->compare(Lo7/i2;Lo7/i2;)I

    move-result v2

    if-eqz v2, :cond_0

    return v2

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lo7/e;->k()I

    move-result p0

    invoke-virtual {p1}, Lo7/e;->k()I

    move-result p1

    invoke-static {p0, p1}, Lcom/google/firebase/firestore/util/Util;->compareIntegers(II)I

    move-result p0

    return p0
.end method

.method private static compareGeoPoints(Lx7/b;Lx7/b;)I
    .locals 4

    invoke-virtual {p0}, Lx7/b;->i()D

    move-result-wide v0

    invoke-virtual {p1}, Lx7/b;->i()D

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Lcom/google/firebase/firestore/util/Util;->compareDoubles(DD)I

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lx7/b;->j()D

    move-result-wide v0

    invoke-virtual {p1}, Lx7/b;->j()D

    move-result-wide p0

    invoke-static {v0, v1, p0, p1}, Lcom/google/firebase/firestore/util/Util;->compareDoubles(DD)I

    move-result p0

    return p0

    :cond_0
    return v0
.end method

.method private static compareMaps(Lo7/k0;Lo7/k0;)I
    .locals 4

    new-instance v0, Ljava/util/TreeMap;

    invoke-virtual {p0}, Lo7/k0;->i()Ljava/util/Map;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/util/TreeMap;-><init>(Ljava/util/Map;)V

    invoke-virtual {v0}, Ljava/util/TreeMap;->entrySet()Ljava/util/Set;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    new-instance v0, Ljava/util/TreeMap;

    invoke-virtual {p1}, Lo7/k0;->i()Ljava/util/Map;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/util/TreeMap;-><init>(Ljava/util/Map;)V

    invoke-virtual {v0}, Ljava/util/TreeMap;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result v2

    if-eqz v2, :cond_1

    return v2

    :cond_1
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo7/i2;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo7/i2;

    invoke-static {v0, v1}, Lcom/google/firebase/firestore/model/Values;->compare(Lo7/i2;Lo7/i2;)I

    move-result v0

    if-eqz v0, :cond_0

    return v0

    :cond_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p0

    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    invoke-static {p0, p1}, Lcom/google/firebase/firestore/util/Util;->compareBooleans(ZZ)I

    move-result p0

    return p0
.end method

.method private static compareNumbers(Lo7/i2;Lo7/i2;)I
    .locals 5

    invoke-virtual {p0}, Lo7/i2;->B()Lo7/h2;

    move-result-object v0

    sget-object v1, Lo7/h2;->d:Lo7/h2;

    sget-object v2, Lo7/h2;->c:Lo7/h2;

    if-ne v0, v1, :cond_1

    invoke-virtual {p0}, Lo7/i2;->u()D

    move-result-wide v3

    invoke-virtual {p1}, Lo7/i2;->B()Lo7/h2;

    move-result-object v0

    if-ne v0, v1, :cond_0

    invoke-virtual {p1}, Lo7/i2;->u()D

    move-result-wide p0

    invoke-static {v3, v4, p0, p1}, Lcom/google/firebase/firestore/util/Util;->compareDoubles(DD)I

    move-result p0

    return p0

    :cond_0
    invoke-virtual {p1}, Lo7/i2;->B()Lo7/h2;

    move-result-object v0

    if-ne v0, v2, :cond_3

    invoke-virtual {p1}, Lo7/i2;->w()J

    move-result-wide p0

    invoke-static {v3, v4, p0, p1}, Lcom/google/firebase/firestore/util/Util;->compareMixed(DJ)I

    move-result p0

    return p0

    :cond_1
    invoke-virtual {p0}, Lo7/i2;->B()Lo7/h2;

    move-result-object v0

    if-ne v0, v2, :cond_3

    invoke-virtual {p0}, Lo7/i2;->w()J

    move-result-wide v3

    invoke-virtual {p1}, Lo7/i2;->B()Lo7/h2;

    move-result-object v0

    if-ne v0, v2, :cond_2

    invoke-virtual {p1}, Lo7/i2;->w()J

    move-result-wide p0

    invoke-static {v3, v4, p0, p1}, Lcom/google/firebase/firestore/util/Util;->compareLongs(JJ)I

    move-result p0

    return p0

    :cond_2
    invoke-virtual {p1}, Lo7/i2;->B()Lo7/h2;

    move-result-object v0

    if-ne v0, v1, :cond_3

    invoke-virtual {p1}, Lo7/i2;->u()D

    move-result-wide p0

    invoke-static {p0, p1, v3, v4}, Lcom/google/firebase/firestore/util/Util;->compareMixed(DJ)I

    move-result p0

    mul-int/lit8 p0, p0, -0x1

    return p0

    :cond_3
    const-string v0, "Unexpected values: %s vs %s"

    filled-new-array {p0, p1}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {v0, p0}, Lcom/google/firebase/firestore/util/Assert;->fail(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/AssertionError;

    move-result-object p0

    throw p0
.end method

.method private static compareReferences(Ljava/lang/String;Ljava/lang/String;)I
    .locals 4

    const-string v0, "/"

    const/4 v1, -0x1

    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object p1

    array-length v0, p0

    array-length v1, p1

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    aget-object v2, p0, v1

    aget-object v3, p1, v1

    invoke-virtual {v2, v3}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result v2

    if-eqz v2, :cond_0

    return v2

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    array-length p0, p0

    array-length p1, p1

    invoke-static {p0, p1}, Lcom/google/firebase/firestore/util/Util;->compareIntegers(II)I

    move-result p0

    return p0
.end method

.method private static compareTimestamps(Lcom/google/protobuf/q2;Lcom/google/protobuf/q2;)I
    .locals 4

    invoke-virtual {p0}, Lcom/google/protobuf/q2;->j()J

    move-result-wide v0

    invoke-virtual {p1}, Lcom/google/protobuf/q2;->j()J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Lcom/google/firebase/firestore/util/Util;->compareLongs(JJ)I

    move-result v0

    if-eqz v0, :cond_0

    return v0

    :cond_0
    invoke-virtual {p0}, Lcom/google/protobuf/q2;->i()I

    move-result p0

    invoke-virtual {p1}, Lcom/google/protobuf/q2;->i()I

    move-result p1

    invoke-static {p0, p1}, Lcom/google/firebase/firestore/util/Util;->compareIntegers(II)I

    move-result p0

    return p0
.end method

.method public static contains(Lo7/f;Lo7/i2;)Z
    .locals 1

    invoke-interface {p0}, Lo7/f;->a()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo7/i2;

    invoke-static {v0, p1}, Lcom/google/firebase/firestore/model/Values;->equals(Lo7/i2;Lo7/i2;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_1
    const/4 p0, 0x0

    return p0
.end method

.method public static equals(Lo7/i2;Lo7/i2;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p0, :cond_8

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    invoke-static {p0}, Lcom/google/firebase/firestore/model/Values;->typeOrder(Lo7/i2;)I

    move-result v2

    invoke-static {p1}, Lcom/google/firebase/firestore/model/Values;->typeOrder(Lo7/i2;)I

    move-result v3

    if-eq v2, v3, :cond_2

    return v1

    :cond_2
    const/4 v1, 0x2

    if-eq v2, v1, :cond_7

    const/4 v1, 0x4

    if-eq v2, v1, :cond_6

    const v1, 0x7fffffff

    if-eq v2, v1, :cond_5

    const/16 v0, 0x9

    if-eq v2, v0, :cond_4

    const/16 v0, 0xa

    if-eq v2, v0, :cond_3

    invoke-virtual {p0, p1}, Lcom/google/protobuf/l0;->equals(Ljava/lang/Object;)Z

    move-result p0

    return p0

    :cond_3
    invoke-static {p0, p1}, Lcom/google/firebase/firestore/model/Values;->objectEquals(Lo7/i2;Lo7/i2;)Z

    move-result p0

    return p0

    :cond_4
    invoke-static {p0, p1}, Lcom/google/firebase/firestore/model/Values;->arrayEquals(Lo7/i2;Lo7/i2;)Z

    move-result p0

    return p0

    :cond_5
    return v0

    :cond_6
    invoke-static {p0}, Lcom/google/firebase/firestore/model/ServerTimestamps;->getLocalWriteTime(Lo7/i2;)Lcom/google/protobuf/q2;

    move-result-object p0

    invoke-static {p1}, Lcom/google/firebase/firestore/model/ServerTimestamps;->getLocalWriteTime(Lo7/i2;)Lcom/google/protobuf/q2;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/google/protobuf/l0;->equals(Ljava/lang/Object;)Z

    move-result p0

    return p0

    :cond_7
    invoke-static {p0, p1}, Lcom/google/firebase/firestore/model/Values;->numberEquals(Lo7/i2;Lo7/i2;)Z

    move-result p0

    return p0

    :cond_8
    :goto_0
    return v1
.end method

.method public static getLowerBound(Lo7/h2;)Lo7/i2;
    .locals 3

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unknown value type: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    invoke-static {}, Lo7/i2;->C()Lo7/g2;

    move-result-object p0

    invoke-static {}, Lo7/k0;->g()Lo7/k0;

    move-result-object v0

    invoke-virtual {p0, v0}, Lo7/g2;->l(Lo7/k0;)V

    invoke-virtual {p0}, Lcom/google/protobuf/g0;->build()Lcom/google/protobuf/l0;

    move-result-object p0

    check-cast p0, Lo7/i2;

    return-object p0

    :pswitch_1
    invoke-static {}, Lo7/i2;->C()Lo7/g2;

    move-result-object p0

    invoke-static {}, Lo7/e;->i()Lo7/e;

    move-result-object v0

    invoke-virtual {p0, v0}, Lo7/g2;->e(Lo7/e;)V

    invoke-virtual {p0}, Lcom/google/protobuf/g0;->build()Lcom/google/protobuf/l0;

    move-result-object p0

    check-cast p0, Lo7/i2;

    return-object p0

    :pswitch_2
    invoke-static {}, Lo7/i2;->C()Lo7/g2;

    move-result-object p0

    invoke-static {}, Lx7/b;->k()Lx7/a;

    move-result-object v0

    const-wide v1, -0x3fa9800000000000L    # -90.0

    invoke-virtual {v0, v1, v2}, Lx7/a;->c(D)V

    const-wide v1, -0x3f99800000000000L    # -180.0

    invoke-virtual {v0, v1, v2}, Lx7/a;->d(D)V

    invoke-virtual {p0, v0}, Lo7/g2;->i(Lx7/a;)V

    invoke-virtual {p0}, Lcom/google/protobuf/g0;->build()Lcom/google/protobuf/l0;

    move-result-object p0

    check-cast p0, Lo7/i2;

    return-object p0

    :pswitch_3
    sget-object p0, Lcom/google/firebase/firestore/model/DatabaseId;->EMPTY:Lcom/google/firebase/firestore/model/DatabaseId;

    invoke-static {}, Lcom/google/firebase/firestore/model/DocumentKey;->empty()Lcom/google/firebase/firestore/model/DocumentKey;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/google/firebase/firestore/model/Values;->refValue(Lcom/google/firebase/firestore/model/DatabaseId;Lcom/google/firebase/firestore/model/DocumentKey;)Lo7/i2;

    move-result-object p0

    return-object p0

    :pswitch_4
    invoke-static {}, Lo7/i2;->C()Lo7/g2;

    move-result-object p0

    sget-object v0, Lcom/google/protobuf/n;->b:Lcom/google/protobuf/m;

    invoke-virtual {p0, v0}, Lo7/g2;->g(Lcom/google/protobuf/n;)V

    invoke-virtual {p0}, Lcom/google/protobuf/g0;->build()Lcom/google/protobuf/l0;

    move-result-object p0

    check-cast p0, Lo7/i2;

    return-object p0

    :pswitch_5
    invoke-static {}, Lo7/i2;->C()Lo7/g2;

    move-result-object p0

    const-string v0, ""

    invoke-virtual {p0, v0}, Lo7/g2;->o(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/google/protobuf/g0;->build()Lcom/google/protobuf/l0;

    move-result-object p0

    check-cast p0, Lo7/i2;

    return-object p0

    :pswitch_6
    invoke-static {}, Lo7/i2;->C()Lo7/g2;

    move-result-object p0

    invoke-static {}, Lcom/google/protobuf/q2;->k()Lcom/google/protobuf/p2;

    move-result-object v0

    const-wide/high16 v1, -0x8000000000000000L

    invoke-virtual {v0, v1, v2}, Lcom/google/protobuf/p2;->d(J)V

    invoke-virtual {p0, v0}, Lo7/g2;->p(Lcom/google/protobuf/p2;)V

    invoke-virtual {p0}, Lcom/google/protobuf/g0;->build()Lcom/google/protobuf/l0;

    move-result-object p0

    check-cast p0, Lo7/i2;

    return-object p0

    :pswitch_7
    invoke-static {}, Lo7/i2;->C()Lo7/g2;

    move-result-object p0

    const-wide/high16 v0, 0x7ff8000000000000L    # Double.NaN

    invoke-virtual {p0, v0, v1}, Lo7/g2;->h(D)V

    invoke-virtual {p0}, Lcom/google/protobuf/g0;->build()Lcom/google/protobuf/l0;

    move-result-object p0

    check-cast p0, Lo7/i2;

    return-object p0

    :pswitch_8
    invoke-static {}, Lo7/i2;->C()Lo7/g2;

    move-result-object p0

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lo7/g2;->f(Z)V

    invoke-virtual {p0}, Lcom/google/protobuf/g0;->build()Lcom/google/protobuf/l0;

    move-result-object p0

    check-cast p0, Lo7/i2;

    return-object p0

    :pswitch_9
    sget-object p0, Lcom/google/firebase/firestore/model/Values;->NULL_VALUE:Lo7/i2;

    return-object p0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static getUpperBound(Lo7/h2;)Lo7/i2;
    .locals 3

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unknown value type: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    sget-object p0, Lcom/google/firebase/firestore/model/Values;->MAX_VALUE:Lo7/i2;

    return-object p0

    :pswitch_1
    sget-object p0, Lo7/h2;->r:Lo7/h2;

    invoke-static {p0}, Lcom/google/firebase/firestore/model/Values;->getLowerBound(Lo7/h2;)Lo7/i2;

    move-result-object p0

    return-object p0

    :pswitch_2
    sget-object p0, Lo7/h2;->q:Lo7/h2;

    invoke-static {p0}, Lcom/google/firebase/firestore/model/Values;->getLowerBound(Lo7/h2;)Lo7/i2;

    move-result-object p0

    return-object p0

    :pswitch_3
    sget-object p0, Lo7/h2;->p:Lo7/h2;

    invoke-static {p0}, Lcom/google/firebase/firestore/model/Values;->getLowerBound(Lo7/h2;)Lo7/i2;

    move-result-object p0

    return-object p0

    :pswitch_4
    sget-object p0, Lo7/h2;->o:Lo7/h2;

    invoke-static {p0}, Lcom/google/firebase/firestore/model/Values;->getLowerBound(Lo7/h2;)Lo7/i2;

    move-result-object p0

    return-object p0

    :pswitch_5
    sget-object p0, Lo7/h2;->n:Lo7/h2;

    invoke-static {p0}, Lcom/google/firebase/firestore/model/Values;->getLowerBound(Lo7/h2;)Lo7/i2;

    move-result-object p0

    return-object p0

    :pswitch_6
    sget-object p0, Lo7/h2;->f:Lo7/h2;

    invoke-static {p0}, Lcom/google/firebase/firestore/model/Values;->getLowerBound(Lo7/h2;)Lo7/i2;

    move-result-object p0

    return-object p0

    :pswitch_7
    sget-object p0, Lo7/h2;->e:Lo7/h2;

    invoke-static {p0}, Lcom/google/firebase/firestore/model/Values;->getLowerBound(Lo7/h2;)Lo7/i2;

    move-result-object p0

    return-object p0

    :pswitch_8
    sget-object p0, Lo7/h2;->c:Lo7/h2;

    invoke-static {p0}, Lcom/google/firebase/firestore/model/Values;->getLowerBound(Lo7/h2;)Lo7/i2;

    move-result-object p0

    return-object p0

    :pswitch_9
    sget-object p0, Lo7/h2;->b:Lo7/h2;

    invoke-static {p0}, Lcom/google/firebase/firestore/model/Values;->getLowerBound(Lo7/h2;)Lo7/i2;

    move-result-object p0

    return-object p0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static isArray(Lo7/i2;)Z
    .locals 1

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lo7/i2;->B()Lo7/h2;

    move-result-object p0

    sget-object v0, Lo7/h2;->q:Lo7/h2;

    if-ne p0, v0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static isDouble(Lo7/i2;)Z
    .locals 1

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lo7/i2;->B()Lo7/h2;

    move-result-object p0

    sget-object v0, Lo7/h2;->d:Lo7/h2;

    if-ne p0, v0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static isInteger(Lo7/i2;)Z
    .locals 1

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lo7/i2;->B()Lo7/h2;

    move-result-object p0

    sget-object v0, Lo7/h2;->c:Lo7/h2;

    if-ne p0, v0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static isMapValue(Lo7/i2;)Z
    .locals 1

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lo7/i2;->B()Lo7/h2;

    move-result-object p0

    sget-object v0, Lo7/h2;->r:Lo7/h2;

    if-ne p0, v0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static isMaxValue(Lo7/i2;)Z
    .locals 2

    sget-object v0, Lcom/google/firebase/firestore/model/Values;->MAX_VALUE_TYPE:Lo7/i2;

    invoke-virtual {p0}, Lo7/i2;->x()Lo7/k0;

    move-result-object p0

    invoke-virtual {p0}, Lo7/k0;->i()Ljava/util/Map;

    move-result-object p0

    const-string v1, "__type__"

    invoke-interface {p0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    invoke-virtual {v0, p0}, Lcom/google/protobuf/l0;->equals(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static isNanValue(Lo7/i2;)Z
    .locals 2

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lo7/i2;->u()D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->isNaN(D)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static isNullValue(Lo7/i2;)Z
    .locals 1

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lo7/i2;->B()Lo7/h2;

    move-result-object p0

    sget-object v0, Lo7/h2;->a:Lo7/h2;

    if-ne p0, v0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static isNumber(Lo7/i2;)Z
    .locals 1

    invoke-static {p0}, Lcom/google/firebase/firestore/model/Values;->isInteger(Lo7/i2;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {p0}, Lcom/google/firebase/firestore/model/Values;->isDouble(Lo7/i2;)Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p0, 0x1

    :goto_1
    return p0
.end method

.method public static isReferenceValue(Lo7/i2;)Z
    .locals 1

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lo7/i2;->B()Lo7/h2;

    move-result-object p0

    sget-object v0, Lo7/h2;->o:Lo7/h2;

    if-ne p0, v0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static lowerBoundCompare(Lo7/i2;ZLo7/i2;Z)I
    .locals 0

    invoke-static {p0, p2}, Lcom/google/firebase/firestore/model/Values;->compare(Lo7/i2;Lo7/i2;)I

    move-result p0

    if-eqz p0, :cond_0

    return p0

    :cond_0
    if-eqz p1, :cond_1

    if-nez p3, :cond_1

    const/4 p0, -0x1

    return p0

    :cond_1
    if-nez p1, :cond_2

    if-eqz p3, :cond_2

    const/4 p0, 0x1

    return p0

    :cond_2
    const/4 p0, 0x0

    return p0
.end method

.method private static numberEquals(Lo7/i2;Lo7/i2;)Z
    .locals 4

    invoke-virtual {p0}, Lo7/i2;->B()Lo7/h2;

    move-result-object v0

    sget-object v1, Lo7/h2;->c:Lo7/h2;

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-ne v0, v1, :cond_1

    invoke-virtual {p1}, Lo7/i2;->B()Lo7/h2;

    move-result-object v0

    if-ne v0, v1, :cond_1

    invoke-virtual {p0}, Lo7/i2;->w()J

    move-result-wide v0

    invoke-virtual {p1}, Lo7/i2;->w()J

    move-result-wide p0

    cmp-long p0, v0, p0

    if-nez p0, :cond_0

    goto :goto_0

    :cond_0
    move v2, v3

    :goto_0
    return v2

    :cond_1
    invoke-virtual {p0}, Lo7/i2;->B()Lo7/h2;

    move-result-object v0

    sget-object v1, Lo7/h2;->d:Lo7/h2;

    if-ne v0, v1, :cond_3

    invoke-virtual {p1}, Lo7/i2;->B()Lo7/h2;

    move-result-object v0

    if-ne v0, v1, :cond_3

    invoke-virtual {p0}, Lo7/i2;->u()D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v0

    invoke-virtual {p1}, Lo7/i2;->u()D

    move-result-wide p0

    invoke-static {p0, p1}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide p0

    cmp-long p0, v0, p0

    if-nez p0, :cond_2

    goto :goto_1

    :cond_2
    move v2, v3

    :goto_1
    return v2

    :cond_3
    return v3
.end method

.method private static objectEquals(Lo7/i2;Lo7/i2;)Z
    .locals 4

    invoke-virtual {p0}, Lo7/i2;->x()Lo7/k0;

    move-result-object p0

    invoke-virtual {p1}, Lo7/i2;->x()Lo7/k0;

    move-result-object p1

    invoke-virtual {p0}, Lo7/k0;->h()I

    move-result v0

    invoke-virtual {p1}, Lo7/k0;->h()I

    move-result v1

    const/4 v2, 0x0

    if-eq v0, v1, :cond_0

    return v2

    :cond_0
    invoke-virtual {p0}, Lo7/k0;->i()Ljava/util/Map;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-virtual {p1}, Lo7/k0;->i()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo7/i2;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo7/i2;

    invoke-static {v0, v1}, Lcom/google/firebase/firestore/model/Values;->equals(Lo7/i2;Lo7/i2;)Z

    move-result v0

    if-nez v0, :cond_1

    return v2

    :cond_2
    const/4 p0, 0x1

    return p0
.end method

.method public static refValue(Lcom/google/firebase/firestore/model/DatabaseId;Lcom/google/firebase/firestore/model/DocumentKey;)Lo7/i2;
    .locals 2

    invoke-static {}, Lo7/i2;->C()Lo7/g2;

    move-result-object v0

    invoke-virtual {p0}, Lcom/google/firebase/firestore/model/DatabaseId;->getProjectId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lcom/google/firebase/firestore/model/DatabaseId;->getDatabaseId()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1}, Lcom/google/firebase/firestore/model/DocumentKey;->toString()Ljava/lang/String;

    move-result-object p1

    filled-new-array {v1, p0, p1}, [Ljava/lang/Object;

    move-result-object p0

    const-string p1, "projects/%s/databases/%s/documents/%s"

    invoke-static {p1, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Lo7/g2;->n(Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/google/protobuf/g0;->build()Lcom/google/protobuf/l0;

    move-result-object p0

    check-cast p0, Lo7/i2;

    return-object p0
.end method

.method public static typeOrder(Lo7/i2;)I
    .locals 3

    invoke-virtual {p0}, Lo7/i2;->B()Lo7/h2;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    const/4 v1, 0x2

    const/4 v2, 0x0

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Invalid value type: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lo7/i2;->B()Lo7/h2;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    new-array v0, v2, [Ljava/lang/Object;

    invoke-static {p0, v0}, Lcom/google/firebase/firestore/util/Assert;->fail(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/AssertionError;

    move-result-object p0

    throw p0

    :pswitch_0
    invoke-static {p0}, Lcom/google/firebase/firestore/model/ServerTimestamps;->isServerTimestamp(Lo7/i2;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p0, 0x4

    return p0

    :cond_0
    invoke-static {p0}, Lcom/google/firebase/firestore/model/Values;->isMaxValue(Lo7/i2;)Z

    move-result p0

    if-eqz p0, :cond_1

    const p0, 0x7fffffff

    return p0

    :cond_1
    const/16 p0, 0xa

    return p0

    :pswitch_1
    const/16 p0, 0x9

    return p0

    :pswitch_2
    const/16 p0, 0x8

    return p0

    :pswitch_3
    const/4 p0, 0x7

    return p0

    :pswitch_4
    const/4 p0, 0x6

    return p0

    :pswitch_5
    const/4 p0, 0x5

    return p0

    :pswitch_6
    const/4 p0, 0x3

    return p0

    :pswitch_7
    return v1

    :pswitch_8
    const/4 p0, 0x1

    return p0

    :pswitch_9
    return v2

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static upperBoundCompare(Lo7/i2;ZLo7/i2;Z)I
    .locals 0

    invoke-static {p0, p2}, Lcom/google/firebase/firestore/model/Values;->compare(Lo7/i2;Lo7/i2;)I

    move-result p0

    if-eqz p0, :cond_0

    return p0

    :cond_0
    if-eqz p1, :cond_1

    if-nez p3, :cond_1

    const/4 p0, 0x1

    return p0

    :cond_1
    if-nez p1, :cond_2

    if-eqz p3, :cond_2

    const/4 p0, -0x1

    return p0

    :cond_2
    const/4 p0, 0x0

    return p0
.end method
