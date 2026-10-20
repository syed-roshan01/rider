.class public final enum Ls4/b;
.super Ljava/lang/Enum;


# static fields
.field public static final enum c:Ls4/b;

.field public static final enum d:Ls4/b;

.field public static final synthetic e:[Ls4/b;


# instance fields
.field public final a:Z

.field public final b:Z


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, Ls4/b;

    const-string v1, "ENABLED"

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3, v3}, Ls4/b;-><init>(Ljava/lang/String;IZZ)V

    sput-object v0, Ls4/b;->c:Ls4/b;

    new-instance v1, Ls4/b;

    const-string v4, "READ_ONLY"

    invoke-direct {v1, v4, v3, v3, v2}, Ls4/b;-><init>(Ljava/lang/String;IZZ)V

    new-instance v4, Ls4/b;

    const-string v5, "WRITE_ONLY"

    const/4 v6, 0x2

    invoke-direct {v4, v5, v6, v2, v3}, Ls4/b;-><init>(Ljava/lang/String;IZZ)V

    new-instance v3, Ls4/b;

    const-string v5, "DISABLED"

    const/4 v6, 0x3

    invoke-direct {v3, v5, v6, v2, v2}, Ls4/b;-><init>(Ljava/lang/String;IZZ)V

    sput-object v3, Ls4/b;->d:Ls4/b;

    filled-new-array {v0, v1, v4, v3}, [Ls4/b;

    move-result-object v0

    sput-object v0, Ls4/b;->e:[Ls4/b;

    invoke-static {v0}, Lz6/a;->y([Ljava/lang/Enum;)Lx8/b;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;IZZ)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-boolean p3, p0, Ls4/b;->a:Z

    iput-boolean p4, p0, Ls4/b;->b:Z

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Ls4/b;
    .locals 1

    const-class v0, Ls4/b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ls4/b;

    return-object p0
.end method

.method public static values()[Ls4/b;
    .locals 1

    sget-object v0, Ls4/b;->e:[Ls4/b;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ls4/b;

    return-object v0
.end method
