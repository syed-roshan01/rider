.class public final Lg8/i4;
.super Le8/a1;


# static fields
.field public static final d:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "GRPC_EXPERIMENTAL_PICKFIRST_LB_CONFIG"

    invoke-static {v0}, Ljava/lang/System;->getenv(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lf6/a;->Y(Ljava/lang/String;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    sput-boolean v0, Lg8/i4;->d:Z

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final c(Le8/j0;)Le8/z0;
    .locals 1

    new-instance v0, Lg8/h4;

    invoke-direct {v0, p1}, Lg8/h4;-><init>(Le8/j0;)V

    return-object v0
.end method

.method public f()Ljava/lang/String;
    .locals 1

    const-string v0, "pick_first"

    return-object v0
.end method

.method public g()I
    .locals 1

    const/4 v0, 0x5

    return v0
.end method

.method public h()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public i(Ljava/util/Map;)Le8/r1;
    .locals 2

    sget-boolean v0, Lg8/i4;->d:Z

    if-eqz v0, :cond_0

    :try_start_0
    new-instance v0, Lg8/f4;

    const-string v1, "shuffleAddressList"

    invoke-static {v1, p1}, Lg8/m2;->b(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/Boolean;

    move-result-object p1

    invoke-direct {v0, p1}, Lg8/f4;-><init>(Ljava/lang/Boolean;)V

    new-instance p1, Le8/r1;

    invoke-direct {p1, v0}, Le8/r1;-><init>(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    sget-object v0, Le8/c2;->m:Le8/c2;

    invoke-virtual {v0, p1}, Le8/c2;->f(Ljava/lang/Throwable;)Le8/c2;

    move-result-object p1

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Failed parsing configuration for "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lg8/i4;->f()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Le8/c2;->g(Ljava/lang/String;)Le8/c2;

    move-result-object p1

    new-instance v0, Le8/r1;

    invoke-direct {v0, p1}, Le8/r1;-><init>(Le8/c2;)V

    return-object v0

    :cond_0
    new-instance p1, Le8/r1;

    const-string v0, "no service config"

    invoke-direct {p1, v0}, Le8/r1;-><init>(Ljava/lang/Object;)V

    return-object p1
.end method
