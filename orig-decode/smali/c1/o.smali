.class public final enum Lc1/o;
.super Ljava/lang/Enum;

# interfaces
.implements Lc1/n;


# static fields
.field public static final enum a:Lc1/o;

.field public static final enum b:Lc1/o;

.field public static final enum c:Lc1/o;

.field public static final synthetic d:[Lc1/o;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lc1/o;

    const-string v1, "Active"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lc1/o;->a:Lc1/o;

    new-instance v1, Lc1/o;

    const-string v2, "ActiveParent"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lc1/o;->b:Lc1/o;

    new-instance v2, Lc1/o;

    const-string v3, "Captured"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    new-instance v3, Lc1/o;

    const-string v4, "Inactive"

    const/4 v5, 0x3

    invoke-direct {v3, v4, v5}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lc1/o;->c:Lc1/o;

    filled-new-array {v0, v1, v2, v3}, [Lc1/o;

    move-result-object v0

    sput-object v0, Lc1/o;->d:[Lc1/o;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lc1/o;
    .locals 1

    const-class v0, Lc1/o;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lc1/o;

    return-object p0
.end method

.method public static values()[Lc1/o;
    .locals 1

    sget-object v0, Lc1/o;->d:[Lc1/o;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lc1/o;

    return-object v0
.end method


# virtual methods
.method public final a()Z
    .locals 3

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_2

    if-eq v0, v1, :cond_1

    const/4 v2, 0x2

    if-eq v0, v2, :cond_2

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Landroidx/fragment/app/a0;

    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    throw v0

    :cond_1
    :goto_0
    const/4 v1, 0x0

    :cond_2
    return v1
.end method
