.class public final enum Ls/j0;
.super Ljava/lang/Enum;


# static fields
.field public static final enum a:Ls/j0;

.field public static final enum b:Ls/j0;

.field public static final enum c:Ls/j0;

.field public static final synthetic d:[Ls/j0;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Ls/j0;

    const-string v1, "PreEnter"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ls/j0;->a:Ls/j0;

    new-instance v1, Ls/j0;

    const-string v2, "Visible"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v1, Ls/j0;->b:Ls/j0;

    new-instance v2, Ls/j0;

    const-string v3, "PostExit"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v2, Ls/j0;->c:Ls/j0;

    filled-new-array {v0, v1, v2}, [Ls/j0;

    move-result-object v0

    sput-object v0, Ls/j0;->d:[Ls/j0;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Ls/j0;
    .locals 1

    const-class v0, Ls/j0;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ls/j0;

    return-object p0
.end method

.method public static values()[Ls/j0;
    .locals 1

    sget-object v0, Ls/j0;->d:[Ls/j0;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ls/j0;

    return-object v0
.end method
