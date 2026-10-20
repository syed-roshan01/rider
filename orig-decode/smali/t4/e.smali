.class public final enum Lt4/e;
.super Ljava/lang/Enum;


# static fields
.field public static final enum a:Lt4/e;

.field public static final enum b:Lt4/e;

.field public static final synthetic c:[Lt4/e;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lt4/e;

    const-string v1, "FILL"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lt4/e;->a:Lt4/e;

    new-instance v1, Lt4/e;

    const-string v2, "FIT"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lt4/e;->b:Lt4/e;

    filled-new-array {v0, v1}, [Lt4/e;

    move-result-object v0

    sput-object v0, Lt4/e;->c:[Lt4/e;

    invoke-static {v0}, Lz6/a;->y([Ljava/lang/Enum;)Lx8/b;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lt4/e;
    .locals 1

    const-class v0, Lt4/e;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lt4/e;

    return-object p0
.end method

.method public static values()[Lt4/e;
    .locals 1

    sget-object v0, Lt4/e;->c:[Lt4/e;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lt4/e;

    return-object v0
.end method
