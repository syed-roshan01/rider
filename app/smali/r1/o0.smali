.class public final enum Lr1/o0;
.super Ljava/lang/Enum;


# static fields
.field public static final enum a:Lr1/o0;

.field public static final enum b:Lr1/o0;

.field public static final synthetic c:[Lr1/o0;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lr1/o0;

    const-string v1, "Min"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lr1/o0;->a:Lr1/o0;

    new-instance v1, Lr1/o0;

    const-string v2, "Max"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lr1/o0;->b:Lr1/o0;

    filled-new-array {v0, v1}, [Lr1/o0;

    move-result-object v0

    sput-object v0, Lr1/o0;->c:[Lr1/o0;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lr1/o0;
    .locals 1

    const-class v0, Lr1/o0;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lr1/o0;

    return-object p0
.end method

.method public static values()[Lr1/o0;
    .locals 1

    sget-object v0, Lr1/o0;->c:[Lr1/o0;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lr1/o0;

    return-object v0
.end method
