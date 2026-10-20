.class public final Lw6/e;
.super Ljava/lang/Object;

# interfaces
.implements Lv6/p;


# static fields
.field public static final a:Ljava/util/logging/Logger;

.field public static final b:Lw6/e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Lw6/e;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    move-result-object v0

    sput-object v0, Lw6/e;->a:Ljava/util/logging/Logger;

    new-instance v0, Lw6/e;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lw6/e;->b:Lw6/e;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Class;
    .locals 1

    const-class v0, Lv6/a;

    return-object v0
.end method

.method public final b(Lj0/b0;)Ljava/lang/Object;
    .locals 1

    new-instance v0, Lw6/d;

    invoke-direct {v0, p1}, Lw6/d;-><init>(Lj0/b0;)V

    return-object v0
.end method

.method public final c()Ljava/lang/Class;
    .locals 1

    const-class v0, Lv6/a;

    return-object v0
.end method
