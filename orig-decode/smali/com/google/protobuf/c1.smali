.class public final enum Lcom/google/protobuf/c1;
.super Ljava/lang/Enum;


# static fields
.field public static final enum b:Lcom/google/protobuf/c1;

.field public static final enum c:Lcom/google/protobuf/c1;

.field public static final enum d:Lcom/google/protobuf/c1;

.field public static final enum e:Lcom/google/protobuf/c1;

.field public static final enum f:Lcom/google/protobuf/c1;

.field public static final enum n:Lcom/google/protobuf/c1;

.field public static final enum o:Lcom/google/protobuf/c1;

.field public static final enum p:Lcom/google/protobuf/c1;

.field public static final enum q:Lcom/google/protobuf/c1;

.field public static final enum r:Lcom/google/protobuf/c1;

.field public static final synthetic s:[Lcom/google/protobuf/c1;


# instance fields
.field public final a:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 14

    new-instance v0, Lcom/google/protobuf/c1;

    const-string v1, "VOID"

    const/4 v2, 0x0

    const-class v3, Ljava/lang/Void;

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/google/protobuf/c1;-><init>(Ljava/lang/String;ILjava/lang/Class;Ljava/io/Serializable;)V

    sput-object v0, Lcom/google/protobuf/c1;->b:Lcom/google/protobuf/c1;

    new-instance v1, Lcom/google/protobuf/c1;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const-string v3, "INT"

    const/4 v5, 0x1

    const-class v6, Ljava/lang/Integer;

    invoke-direct {v1, v3, v5, v6, v2}, Lcom/google/protobuf/c1;-><init>(Ljava/lang/String;ILjava/lang/Class;Ljava/io/Serializable;)V

    sput-object v1, Lcom/google/protobuf/c1;->c:Lcom/google/protobuf/c1;

    new-instance v2, Lcom/google/protobuf/c1;

    const-wide/16 v7, 0x0

    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    const-string v5, "LONG"

    const/4 v7, 0x2

    const-class v8, Ljava/lang/Long;

    invoke-direct {v2, v5, v7, v8, v3}, Lcom/google/protobuf/c1;-><init>(Ljava/lang/String;ILjava/lang/Class;Ljava/io/Serializable;)V

    sput-object v2, Lcom/google/protobuf/c1;->d:Lcom/google/protobuf/c1;

    new-instance v3, Lcom/google/protobuf/c1;

    const/4 v5, 0x0

    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v5

    const-string v7, "FLOAT"

    const/4 v8, 0x3

    const-class v9, Ljava/lang/Float;

    invoke-direct {v3, v7, v8, v9, v5}, Lcom/google/protobuf/c1;-><init>(Ljava/lang/String;ILjava/lang/Class;Ljava/io/Serializable;)V

    sput-object v3, Lcom/google/protobuf/c1;->e:Lcom/google/protobuf/c1;

    new-instance v5, Lcom/google/protobuf/c1;

    const-wide/16 v7, 0x0

    invoke-static {v7, v8}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v7

    const-string v8, "DOUBLE"

    const/4 v9, 0x4

    const-class v10, Ljava/lang/Double;

    invoke-direct {v5, v8, v9, v10, v7}, Lcom/google/protobuf/c1;-><init>(Ljava/lang/String;ILjava/lang/Class;Ljava/io/Serializable;)V

    sput-object v5, Lcom/google/protobuf/c1;->f:Lcom/google/protobuf/c1;

    new-instance v7, Lcom/google/protobuf/c1;

    const-class v8, Ljava/lang/Boolean;

    sget-object v9, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    const-string v10, "BOOLEAN"

    const/4 v11, 0x5

    invoke-direct {v7, v10, v11, v8, v9}, Lcom/google/protobuf/c1;-><init>(Ljava/lang/String;ILjava/lang/Class;Ljava/io/Serializable;)V

    sput-object v7, Lcom/google/protobuf/c1;->n:Lcom/google/protobuf/c1;

    new-instance v8, Lcom/google/protobuf/c1;

    const-class v9, Ljava/lang/String;

    const-string v10, ""

    const-string v11, "STRING"

    const/4 v12, 0x6

    invoke-direct {v8, v11, v12, v9, v10}, Lcom/google/protobuf/c1;-><init>(Ljava/lang/String;ILjava/lang/Class;Ljava/io/Serializable;)V

    sput-object v8, Lcom/google/protobuf/c1;->o:Lcom/google/protobuf/c1;

    new-instance v9, Lcom/google/protobuf/c1;

    sget-object v10, Lcom/google/protobuf/n;->b:Lcom/google/protobuf/m;

    const-string v11, "BYTE_STRING"

    const/4 v12, 0x7

    const-class v13, Lcom/google/protobuf/n;

    invoke-direct {v9, v11, v12, v13, v10}, Lcom/google/protobuf/c1;-><init>(Ljava/lang/String;ILjava/lang/Class;Ljava/io/Serializable;)V

    sput-object v9, Lcom/google/protobuf/c1;->p:Lcom/google/protobuf/c1;

    new-instance v10, Lcom/google/protobuf/c1;

    const-string v11, "ENUM"

    const/16 v12, 0x8

    invoke-direct {v10, v11, v12, v6, v4}, Lcom/google/protobuf/c1;-><init>(Ljava/lang/String;ILjava/lang/Class;Ljava/io/Serializable;)V

    sput-object v10, Lcom/google/protobuf/c1;->q:Lcom/google/protobuf/c1;

    new-instance v11, Lcom/google/protobuf/c1;

    const/16 v6, 0x9

    const-class v12, Ljava/lang/Object;

    const-string v13, "MESSAGE"

    invoke-direct {v11, v13, v6, v12, v4}, Lcom/google/protobuf/c1;-><init>(Ljava/lang/String;ILjava/lang/Class;Ljava/io/Serializable;)V

    sput-object v11, Lcom/google/protobuf/c1;->r:Lcom/google/protobuf/c1;

    move-object v4, v5

    move-object v5, v7

    move-object v6, v8

    move-object v7, v9

    move-object v8, v10

    move-object v9, v11

    filled-new-array/range {v0 .. v9}, [Lcom/google/protobuf/c1;

    move-result-object v0

    sput-object v0, Lcom/google/protobuf/c1;->s:[Lcom/google/protobuf/c1;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/Class;Ljava/io/Serializable;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/google/protobuf/c1;
    .locals 1

    const-class v0, Lcom/google/protobuf/c1;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/google/protobuf/c1;

    return-object p0
.end method

.method public static values()[Lcom/google/protobuf/c1;
    .locals 1

    sget-object v0, Lcom/google/protobuf/c1;->s:[Lcom/google/protobuf/c1;

    invoke-virtual {v0}, [Lcom/google/protobuf/c1;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/google/protobuf/c1;

    return-object v0
.end method
