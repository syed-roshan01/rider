.class public final enum Lx9/x;
.super Ljava/lang/Enum;


# static fields
.field public static final enum b:Lx9/x;

.field public static final enum c:Lx9/x;

.field public static final enum d:Lx9/x;

.field public static final enum e:Lx9/x;

.field public static final enum f:Lx9/x;

.field public static final enum n:Lx9/x;

.field public static final synthetic o:[Lx9/x;


# instance fields
.field public final a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    new-instance v0, Lx9/x;

    const-string v1, "http/1.0"

    const-string v2, "HTTP_1_0"

    const/4 v3, 0x0

    invoke-direct {v0, v2, v3, v1}, Lx9/x;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lx9/x;->b:Lx9/x;

    new-instance v1, Lx9/x;

    const-string v2, "HTTP_1_1"

    const/4 v3, 0x1

    const-string v4, "http/1.1"

    invoke-direct {v1, v2, v3, v4}, Lx9/x;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, Lx9/x;->c:Lx9/x;

    new-instance v2, Lx9/x;

    const-string v3, "spdy/3.1"

    const-string v4, "SPDY_3"

    const/4 v5, 0x2

    invoke-direct {v2, v4, v5, v3}, Lx9/x;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v2, Lx9/x;->d:Lx9/x;

    new-instance v3, Lx9/x;

    const-string v4, "h2"

    const-string v5, "HTTP_2"

    const/4 v6, 0x3

    invoke-direct {v3, v5, v6, v4}, Lx9/x;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v3, Lx9/x;->e:Lx9/x;

    new-instance v4, Lx9/x;

    const-string v5, "h2_prior_knowledge"

    const-string v6, "H2_PRIOR_KNOWLEDGE"

    const/4 v7, 0x4

    invoke-direct {v4, v6, v7, v5}, Lx9/x;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v4, Lx9/x;->f:Lx9/x;

    new-instance v5, Lx9/x;

    const-string v6, "quic"

    const-string v7, "QUIC"

    const/4 v8, 0x5

    invoke-direct {v5, v7, v8, v6}, Lx9/x;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v5, Lx9/x;->n:Lx9/x;

    filled-new-array/range {v0 .. v5}, [Lx9/x;

    move-result-object v0

    sput-object v0, Lx9/x;->o:[Lx9/x;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lx9/x;->a:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lx9/x;
    .locals 1

    const-class v0, Lx9/x;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lx9/x;

    return-object p0
.end method

.method public static values()[Lx9/x;
    .locals 1

    sget-object v0, Lx9/x;->o:[Lx9/x;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lx9/x;

    return-object v0
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lx9/x;->a:Ljava/lang/String;

    return-object v0
.end method
